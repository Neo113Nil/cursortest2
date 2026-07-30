package com.jieli.jl_audio_decode.opus;

import android.util.Log;
import com.jieli.jl_audio_decode.callback.OnDecodeStreamCallback;
import com.jieli.jl_audio_decode.callback.OnEncodeStreamCallback;
import com.jieli.jl_audio_decode.callback.OnStateCallback;
import com.jieli.jl_audio_decode.callback.OnThreadFinishListener;
import com.jieli.jl_audio_decode.constant.DecodeConstant;
import com.jieli.jl_audio_decode.constant.ErrorCode;
import com.jieli.jl_audio_decode.exceptions.OpusException;
import com.jieli.jl_audio_decode.opus.model.OggConfigure;
import com.jieli.jl_audio_decode.opus.model.OpusOption;
import com.jieli.jl_audio_decode.tool.AddStreamDataThread;
import com.jieli.jl_audio_decode.tool.BaseManager;
import com.jieli.jl_audio_decode.tool.DecodeFileThread;
import com.jieli.jl_audio_decode.tool.EncodeFileThread;
import java.util.Locale;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class OpusManager extends BaseManager {
    private static final String TAG = "OpusManager";
    public static boolean isLog;
    private AddStreamDataThread mAddStreamDataThread;
    private DecodeFileThread mDecodeFileThread;
    private volatile OnStateCallback mDecodeStateCb;
    private volatile OnDecodeStreamCallback mDecodeStreamCb;
    private EncodeFileThread mEncodeFileThread;
    private volatile OnStateCallback mEncodeStateCb;
    private volatile OnEncodeStreamCallback mEncodeStreamCb;
    private AddStreamDataThread mEncodeStreamDataThread;
    private volatile long managerAddr = initNativeID();

    static {
        try {
            System.loadLibrary(DecodeConstant.JL_OPUS_LIB);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        isLog = false;
    }

    public OpusManager() {
        if (this.managerAddr == 0) {
            throw new OpusException("Can not load jl_opus lib");
        }
    }

    private void addEncodeStreamData(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        if (this.mEncodeStreamDataThread == null) {
            AddStreamDataThread addStreamDataThread = new AddStreamDataThread(this, 0, this.mEncodeStreamCb, new OnThreadFinishListener() { // from class: com.jieli.jl_audio_decode.opus.d
                @Override // com.jieli.jl_audio_decode.callback.OnThreadFinishListener
                public final void onThreadFinish(long j8) {
                    OpusManager.this.lambda$addEncodeStreamData$4(j8);
                }
            });
            this.mEncodeStreamDataThread = addStreamDataThread;
            addStreamDataThread.start();
        }
        this.mEncodeStreamDataThread.addStreamData(bArr);
    }

    private void addStreamData(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        if (this.mAddStreamDataThread == null) {
            AddStreamDataThread addStreamDataThread = new AddStreamDataThread(this, 2, this.mDecodeStreamCb, new OnThreadFinishListener() { // from class: com.jieli.jl_audio_decode.opus.b
                @Override // com.jieli.jl_audio_decode.callback.OnThreadFinishListener
                public final void onThreadFinish(long j8) {
                    OpusManager.this.lambda$addStreamData$3(j8);
                }
            });
            this.mAddStreamDataThread = addStreamDataThread;
            addStreamDataThread.start();
        }
        this.mAddStreamDataThread.addStreamData(bArr);
    }

    private native int decodeAudioFile(String str, String str2, long j8, OpusOption opusOption);

    private native void decodeAudioStream(int i8, long j8, OpusOption opusOption);

    private native int encodeOpusFile(String str, String str2, long j8, OpusOption opusOption);

    private native void encodeOpusStream(int i8, long j8, OpusOption opusOption);

    private native int getAudioStreamState(long j8);

    private native int getEncodeStreamState(long j8);

    private native int getTranscodingStreamState(long j8);

    private native long initNativeID();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addEncodeStreamData$4(long j8) {
        AddStreamDataThread addStreamDataThread = this.mEncodeStreamDataThread;
        if (addStreamDataThread == null || addStreamDataThread.getId() != j8) {
            return;
        }
        this.mEncodeStreamDataThread = null;
        setEncodeStreamCb(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addStreamData$3(long j8) {
        AddStreamDataThread addStreamDataThread = this.mAddStreamDataThread;
        if (addStreamDataThread == null || addStreamDataThread.getId() != j8) {
            return;
        }
        this.mAddStreamDataThread = null;
        setDecodeStreamCb(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startDecodeFileThread$1(long j8) {
        DecodeFileThread decodeFileThread = this.mDecodeFileThread;
        if (decodeFileThread == null || decodeFileThread.getId() != j8) {
            return;
        }
        this.mDecodeFileThread = null;
        setDecodeStateCb(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startEncodeFileThread$2(long j8) {
        EncodeFileThread encodeFileThread = this.mEncodeFileThread;
        if (encodeFileThread == null || encodeFileThread.getId() != j8) {
            return;
        }
        this.mEncodeFileThread = null;
        setEncodeStateCb(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transcodingOggFile$0(String str, String str2, OggConfigure oggConfigure, OnStateCallback onStateCallback) {
        int transcodingOggFile = transcodingOggFile(this.managerAddr, str, str2, oggConfigure);
        if (transcodingOggFile == 0 || onStateCallback == null) {
            return;
        }
        onStateCallback.onError(transcodingOggFile, ErrorCode.getErrorMsg(transcodingOggFile));
    }

    private void logContent(String str, String str2) {
        if (!isLog || str2 == null) {
            return;
        }
        Log.d(TAG, String.format(Locale.ENGLISH, "[%s]\t%s", str, str2));
    }

    private native int nativeDestroy(long j8);

    private native boolean saveAudioStream(byte[] bArr, long j8);

    private native boolean savePcmStream(byte[] bArr, long j8);

    private void setDecodeStateCb(OnStateCallback onStateCallback) {
        this.mDecodeStateCb = onStateCallback;
    }

    private void setDecodeStreamCb(OnDecodeStreamCallback onDecodeStreamCallback) {
        this.mDecodeStreamCb = onDecodeStreamCallback;
    }

    private void setEncodeStateCb(OnStateCallback onStateCallback) {
        this.mEncodeStateCb = onStateCallback;
    }

    private void setEncodeStreamCb(OnEncodeStreamCallback onEncodeStreamCallback) {
        this.mEncodeStreamCb = onEncodeStreamCallback;
    }

    private void startDecodeFileThread(String str, String str2, OpusOption opusOption) {
        if (this.mDecodeFileThread == null) {
            DecodeFileThread decodeFileThread = new DecodeFileThread(this, str, str2, opusOption, this.mDecodeStateCb, new OnThreadFinishListener() { // from class: com.jieli.jl_audio_decode.opus.a
                @Override // com.jieli.jl_audio_decode.callback.OnThreadFinishListener
                public final void onThreadFinish(long j8) {
                    OpusManager.this.lambda$startDecodeFileThread$1(j8);
                }
            });
            this.mDecodeFileThread = decodeFileThread;
            decodeFileThread.start();
        }
    }

    private void startEncodeFileThread(String str, String str2, OpusOption opusOption) {
        if (this.mEncodeFileThread == null) {
            EncodeFileThread encodeFileThread = new EncodeFileThread(this, str, str2, opusOption, this.mEncodeStateCb, new OnThreadFinishListener() { // from class: com.jieli.jl_audio_decode.opus.c
                @Override // com.jieli.jl_audio_decode.callback.OnThreadFinishListener
                public final void onThreadFinish(long j8) {
                    OpusManager.this.lambda$startEncodeFileThread$2(j8);
                }
            });
            this.mEncodeFileThread = encodeFileThread;
            encodeFileThread.start();
        }
    }

    private void stopAddDataThread() {
        AddStreamDataThread addStreamDataThread = this.mAddStreamDataThread;
        if (addStreamDataThread != null) {
            addStreamDataThread.stopThread();
        }
    }

    private void stopAddEncodeDataThread() {
        AddStreamDataThread addStreamDataThread = this.mEncodeStreamDataThread;
        if (addStreamDataThread != null) {
            addStreamDataThread.stopThread();
        }
    }

    private void stopDecodeFileThread() {
        DecodeFileThread decodeFileThread = this.mDecodeFileThread;
        if (decodeFileThread != null) {
            decodeFileThread.interrupt();
        }
    }

    private void stopEncodeFileThread() {
        EncodeFileThread encodeFileThread = this.mEncodeFileThread;
        if (encodeFileThread != null) {
            encodeFileThread.interrupt();
        }
    }

    private native int transcodingOggFile(long j8, String str, String str2, OggConfigure oggConfigure);

    private native void transcodingOggStream(long j8, int i8, OggConfigure oggConfigure);

    private native boolean writeOpusStream(long j8, byte[] bArr);

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void decodeFile(String str, String str2, OnStateCallback onStateCallback) {
        decodeFile(str, str2, new OpusOption(), onStateCallback);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void encodeFile(String str, String str2, OnStateCallback onStateCallback) {
        encodeFile(str, str2, new OpusOption(), onStateCallback);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public boolean isDecodeStream() {
        return getAudioStreamState(this.managerAddr) == 1;
    }

    public boolean isEncodeStream() {
        return getEncodeStreamState(this.managerAddr) == 1;
    }

    public boolean isTranscoding() {
        return getTranscodingStreamState(this.managerAddr) == 1;
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    protected boolean nativeAddAudioStream(int i8, byte[] bArr) {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i8);
        objArr[1] = Integer.valueOf(bArr != null ? bArr.length : 0);
        logContent("nativeAddAudioStream", String.format(locale, "dataType : %d, data size : %d", objArr));
        return i8 == 0 ? savePcmStream(bArr, this.managerAddr) : saveAudioStream(bArr, this.managerAddr);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    @Deprecated
    protected int nativeDecodeFile(String str, String str2) {
        return nativeDecodeFile(str, str2, new OpusOption());
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    protected void nativeDecodeStream(int i8) {
        nativeDecodeStream(i8, new OpusOption());
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    protected int nativeEncodeFile(String str, String str2) {
        return nativeEncodeFile(str, str2, new OpusOption());
    }

    protected void onDecodeStreamReceive(int i8, byte[] bArr) {
        if (this.mDecodeStreamCb == null) {
            return;
        }
        this.mDecodeStreamCb.onDecodeStream(bArr);
    }

    protected void onEncodeStreamReceive(int i8, byte[] bArr) {
        if (this.mEncodeStreamCb == null) {
            return;
        }
        this.mEncodeStreamCb.onEncodeStream(bArr);
    }

    protected void onStateCallback(int i8, int i9, int i10, String str) {
        switch (i8) {
            case 1:
            case 5:
                if (this.mDecodeStateCb != null) {
                    if (i9 == 0) {
                        this.mDecodeStateCb.onComplete(str);
                        break;
                    } else if (i9 == 1) {
                        this.mDecodeStateCb.onStart();
                        break;
                    } else if (i9 == 2) {
                        this.mDecodeStateCb.onError(i10, str);
                        break;
                    }
                }
                break;
            case 2:
                if (this.mEncodeStateCb != null) {
                    if (i9 == 0) {
                        this.mEncodeStateCb.onComplete(str);
                        break;
                    } else if (i9 == 1) {
                        this.mEncodeStateCb.onStart();
                        break;
                    } else if (i9 == 2) {
                        this.mEncodeStateCb.onError(i10, str);
                        break;
                    }
                }
                break;
            case 3:
            case 6:
                if (this.mDecodeStreamCb != null) {
                    if (i9 == 0) {
                        this.mDecodeStreamCb.onComplete(str);
                        break;
                    } else if (i9 == 1) {
                        this.mDecodeStreamCb.onStart();
                        break;
                    } else if (i9 == 2) {
                        this.mDecodeStreamCb.onError(i10, str);
                        break;
                    }
                }
                break;
            case 4:
                if (this.mEncodeStreamCb != null) {
                    if (i9 == 0) {
                        this.mEncodeStreamCb.onComplete(str);
                        break;
                    } else if (i9 == 1) {
                        this.mEncodeStreamCb.onStart();
                        break;
                    } else if (i9 == 2) {
                        this.mEncodeStreamCb.onError(i10, str);
                        break;
                    }
                }
                break;
        }
    }

    public void release() {
        if (isDecodeStream()) {
            stopDecodeStream();
        }
        if (isEncodeStream()) {
            stopEncodeStream();
        }
        stopDecodeFileThread();
        stopEncodeFileThread();
        stopAddDataThread();
        stopAddEncodeDataThread();
        setDecodeStateCb(null);
        setDecodeStateCb(null);
        setDecodeStateCb(null);
        setEncodeStreamCb(null);
        if (nativeDestroy(this.managerAddr) == 0) {
            this.managerAddr = 0L;
        }
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void startDecodeStream(OnDecodeStreamCallback onDecodeStreamCallback) {
        startDecodeStream(new OpusOption(), onDecodeStreamCallback);
    }

    public void startEncodeStream(OnEncodeStreamCallback onEncodeStreamCallback) {
        startEncodeStream(new OpusOption(), onEncodeStreamCallback);
    }

    public void startTranscodingStream(OnDecodeStreamCallback onDecodeStreamCallback) {
        startTranscodingStream(new OggConfigure(), onDecodeStreamCallback);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void stopDecodeStream() {
        if (isDecodeStream()) {
            nativeDecodeStream(0, new OpusOption());
        }
    }

    public void stopEncodeStream() {
        if (isEncodeStream()) {
            encodeOpusStream(0, this.managerAddr, new OpusOption());
        }
    }

    public void stopTranscodingStream() {
        if (isTranscoding()) {
            transcodingOggStream(this.managerAddr, 0, null);
        }
    }

    public void transcodingOggFile(String str, String str2, OnStateCallback onStateCallback) {
        transcodingOggFile(str, str2, new OggConfigure(), onStateCallback);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void writeAudioStream(byte[] bArr) {
        if (isDecodeStream()) {
            addStreamData(bArr);
        }
    }

    public void writeEncodeStream(byte[] bArr) {
        if (isEncodeStream()) {
            addEncodeStreamData(bArr);
        }
    }

    public void writeTransCodingStream(byte[] bArr) {
        if (isTranscoding()) {
            writeOpusStream(this.managerAddr, bArr);
        }
    }

    public void decodeFile(String str, String str2, OpusOption opusOption, OnStateCallback onStateCallback) {
        if (this.mDecodeFileThread == null) {
            setDecodeStateCb(onStateCallback);
            startDecodeFileThread(str, str2, opusOption);
        } else if (onStateCallback != null) {
            onStateCallback.onError(-1003, "In process, please wait.");
        }
    }

    public void encodeFile(String str, String str2, OpusOption opusOption, OnStateCallback onStateCallback) {
        if (this.mEncodeFileThread == null) {
            setEncodeStateCb(onStateCallback);
            startEncodeFileThread(str, str2, opusOption);
        } else if (onStateCallback != null) {
            onStateCallback.onError(-1003, "In process, please wait.");
        }
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    protected int nativeDecodeFile(String str, String str2, OpusOption opusOption) {
        if (opusOption == null) {
            opusOption = new OpusOption();
        }
        return decodeAudioFile(str, str2, this.managerAddr, opusOption);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    protected void nativeDecodeStream(int i8, OpusOption opusOption) {
        decodeAudioStream(i8, this.managerAddr, opusOption);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    protected int nativeEncodeFile(String str, String str2, OpusOption opusOption) {
        return encodeOpusFile(str, str2, this.managerAddr, opusOption);
    }

    public void startDecodeStream(OpusOption opusOption, OnDecodeStreamCallback onDecodeStreamCallback) {
        if (!isDecodeStream()) {
            setDecodeStreamCb(onDecodeStreamCallback);
            nativeDecodeStream(1, opusOption);
        } else if (onDecodeStreamCallback != null) {
            onDecodeStreamCallback.onError(-1003, "Decoding Stream is working, please don't open again.");
        }
    }

    public void startEncodeStream(OpusOption opusOption, OnEncodeStreamCallback onEncodeStreamCallback) {
        if (!isEncodeStream()) {
            setEncodeStreamCb(onEncodeStreamCallback);
            encodeOpusStream(1, this.managerAddr, opusOption);
        } else if (onEncodeStreamCallback != null) {
            onEncodeStreamCallback.onError(-1003, "Encoding Stream is working, please don't open again.");
        }
    }

    public void startTranscodingStream(OggConfigure oggConfigure, OnDecodeStreamCallback onDecodeStreamCallback) {
        if (!isTranscoding()) {
            setDecodeStreamCb(onDecodeStreamCallback);
            transcodingOggStream(this.managerAddr, 1, oggConfigure);
        } else if (onDecodeStreamCallback != null) {
            onDecodeStreamCallback.onError(-1003, ErrorCode.getErrorMsg(-1003));
        }
    }

    public void transcodingOggFile(final String str, final String str2, final OggConfigure oggConfigure, final OnStateCallback onStateCallback) {
        if (!isTranscoding()) {
            setDecodeStateCb(onStateCallback);
            Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: com.jieli.jl_audio_decode.opus.e
                @Override // java.lang.Runnable
                public final void run() {
                    OpusManager.this.lambda$transcodingOggFile$0(str, str2, oggConfigure, onStateCallback);
                }
            });
        } else if (onStateCallback != null) {
            onStateCallback.onError(-1003, ErrorCode.getErrorMsg(-1003));
        }
    }
}
