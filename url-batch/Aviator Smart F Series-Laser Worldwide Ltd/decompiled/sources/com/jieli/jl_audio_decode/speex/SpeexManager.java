package com.jieli.jl_audio_decode.speex;

import com.jieli.jl_audio_decode.callback.OnDecodeStreamCallback;
import com.jieli.jl_audio_decode.callback.OnStateCallback;
import com.jieli.jl_audio_decode.callback.OnThreadFinishListener;
import com.jieli.jl_audio_decode.constant.DecodeConstant;
import com.jieli.jl_audio_decode.exceptions.SpeexException;
import com.jieli.jl_audio_decode.opus.model.OpusOption;
import com.jieli.jl_audio_decode.tool.AddStreamDataThread;
import com.jieli.jl_audio_decode.tool.BaseManager;
import com.jieli.jl_audio_decode.tool.DecodeFileThread;
import com.jieli.jl_audio_decode.tool.EncodeFileThread;

/* loaded from: classes4.dex */
public class SpeexManager extends BaseManager {
    private static final String TAG = "SpeexManager";
    private AddStreamDataThread mAddStreamDataThread;
    private volatile OnStateCallback mDecodeFileCallback;
    private DecodeFileThread mDecodeFileThread;
    private volatile OnDecodeStreamCallback mDecodeStreamCallback;
    private volatile OnStateCallback mEncodeFileCallback;
    private EncodeFileThread mEncodeFileThread;
    private volatile long managerAddr = initNativeID();

    static {
        try {
            System.loadLibrary(DecodeConstant.JL_SPEEX_LIB);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public SpeexManager() {
        if (this.managerAddr == 0) {
            throw new SpeexException("Can not load jl_speex lib");
        }
    }

    private void addStreamData(byte[] bArr) {
        if (bArr != null) {
            if (this.mAddStreamDataThread == null) {
                AddStreamDataThread addStreamDataThread = new AddStreamDataThread(this, 1, this.mDecodeStreamCallback, new OnThreadFinishListener() { // from class: com.jieli.jl_audio_decode.speex.a
                    @Override // com.jieli.jl_audio_decode.callback.OnThreadFinishListener
                    public final void onThreadFinish(long j8) {
                        SpeexManager.this.lambda$addStreamData$2(j8);
                    }
                });
                this.mAddStreamDataThread = addStreamDataThread;
                addStreamDataThread.start();
            }
            this.mAddStreamDataThread.addStreamData(bArr);
        }
    }

    private native int decodeAudioFile(String str, String str2, long j8);

    private native void decodeAudioStream(int i8, long j8);

    private native int encodeAudioFile(String str, String str2, long j8);

    private native int getAudioStreamState(long j8);

    private native long initNativeID();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addStreamData$2(long j8) {
        AddStreamDataThread addStreamDataThread = this.mAddStreamDataThread;
        if (addStreamDataThread == null || addStreamDataThread.getId() != j8) {
            return;
        }
        this.mAddStreamDataThread = null;
        setDecodeStreamCallback(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startDecodeFileThread$0(long j8) {
        DecodeFileThread decodeFileThread = this.mDecodeFileThread;
        if (decodeFileThread == null || decodeFileThread.getId() != j8) {
            return;
        }
        this.mDecodeFileCallback = null;
        setDecodeFileCallback(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startEncodeFileThread$1(long j8) {
        EncodeFileThread encodeFileThread = this.mEncodeFileThread;
        if (encodeFileThread == null || encodeFileThread.getId() != j8) {
            return;
        }
        this.mEncodeFileThread = null;
        setEncodeFileCallback(null);
    }

    private native int nativeDestroy(long j8);

    private native boolean saveAudioStream(byte[] bArr, long j8);

    private void startDecodeFileThread(String str, String str2) {
        if (this.mDecodeFileThread == null) {
            DecodeFileThread decodeFileThread = new DecodeFileThread(this, str, str2, new OpusOption(), this.mDecodeFileCallback, new OnThreadFinishListener() { // from class: com.jieli.jl_audio_decode.speex.c
                @Override // com.jieli.jl_audio_decode.callback.OnThreadFinishListener
                public final void onThreadFinish(long j8) {
                    SpeexManager.this.lambda$startDecodeFileThread$0(j8);
                }
            });
            this.mDecodeFileThread = decodeFileThread;
            decodeFileThread.start();
        }
    }

    private void startEncodeFileThread(String str, String str2) {
        if (this.mEncodeFileThread == null) {
            EncodeFileThread encodeFileThread = new EncodeFileThread(this, str, str2, new OpusOption(), this.mEncodeFileCallback, new OnThreadFinishListener() { // from class: com.jieli.jl_audio_decode.speex.b
                @Override // com.jieli.jl_audio_decode.callback.OnThreadFinishListener
                public final void onThreadFinish(long j8) {
                    SpeexManager.this.lambda$startEncodeFileThread$1(j8);
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
            this.mAddStreamDataThread = null;
        }
    }

    private void stopDecodeFileThread() {
        DecodeFileThread decodeFileThread = this.mDecodeFileThread;
        if (decodeFileThread != null) {
            decodeFileThread.interrupt();
            this.mDecodeFileThread = null;
        }
    }

    private void stopEncodeFileThread() {
        EncodeFileThread encodeFileThread = this.mEncodeFileThread;
        if (encodeFileThread != null) {
            encodeFileThread.interrupt();
            this.mEncodeFileThread = null;
        }
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void decodeFile(String str, String str2, OnStateCallback onStateCallback) {
        if (this.mDecodeFileThread == null) {
            setDecodeFileCallback(onStateCallback);
            startDecodeFileThread(str, str2);
        } else if (onStateCallback != null) {
            onStateCallback.onError(-1003, "In process, please wait.");
        }
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void encodeFile(String str, String str2, OnStateCallback onStateCallback) {
        if (this.mEncodeFileThread == null) {
            setEncodeFileCallback(onStateCallback);
            startEncodeFileThread(str, str2);
        } else if (onStateCallback != null) {
            onStateCallback.onError(-1003, "In process, please wait.");
        }
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public boolean isDecodeStream() {
        return getAudioStreamState(this.managerAddr) == 1;
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    protected boolean nativeAddAudioStream(int i8, byte[] bArr) {
        if (this.managerAddr == 0) {
            return false;
        }
        return saveAudioStream(bArr, this.managerAddr);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
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
        if (this.mDecodeStreamCallback != null) {
            this.mDecodeStreamCallback.onDecodeStream(bArr);
        }
    }

    protected void onStateCallback(int i8, int i9, int i10, String str) {
        if (i8 == 1) {
            if (this.mDecodeFileCallback != null) {
                if (i9 == 0) {
                    this.mDecodeFileCallback.onComplete(str);
                    return;
                } else if (i9 == 1) {
                    this.mDecodeFileCallback.onStart();
                    return;
                } else {
                    if (i9 != 2) {
                        return;
                    }
                    this.mDecodeFileCallback.onError(i10, str);
                    return;
                }
            }
            return;
        }
        if (i8 == 2) {
            if (this.mEncodeFileCallback != null) {
                if (i9 == 0) {
                    this.mEncodeFileCallback.onComplete(str);
                    return;
                } else if (i9 == 1) {
                    this.mEncodeFileCallback.onStart();
                    return;
                } else {
                    if (i9 != 2) {
                        return;
                    }
                    this.mEncodeFileCallback.onError(i10, str);
                    return;
                }
            }
            return;
        }
        if (i8 == 3 && this.mDecodeStreamCallback != null) {
            if (i9 == 0) {
                this.mDecodeStreamCallback.onComplete(str);
            } else if (i9 == 1) {
                this.mDecodeStreamCallback.onStart();
            } else {
                if (i9 != 2) {
                    return;
                }
                this.mDecodeStreamCallback.onError(i10, str);
            }
        }
    }

    public void release() {
        if (isDecodeStream()) {
            stopDecodeStream();
        }
        stopEncodeFileThread();
        stopDecodeFileThread();
        stopAddDataThread();
        setDecodeFileCallback(null);
        setEncodeFileCallback(null);
        setDecodeStreamCallback(null);
        if (nativeDestroy(this.managerAddr) == 0) {
            this.managerAddr = 0L;
        }
    }

    public void setDecodeFileCallback(OnStateCallback onStateCallback) {
        this.mDecodeFileCallback = onStateCallback;
    }

    public void setDecodeStreamCallback(OnDecodeStreamCallback onDecodeStreamCallback) {
        this.mDecodeStreamCallback = onDecodeStreamCallback;
    }

    public void setEncodeFileCallback(OnStateCallback onStateCallback) {
        this.mEncodeFileCallback = onStateCallback;
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void startDecodeStream(OnDecodeStreamCallback onDecodeStreamCallback) {
        if (!isDecodeStream()) {
            setDecodeStreamCallback(onDecodeStreamCallback);
            nativeDecodeStream(1);
        } else if (onDecodeStreamCallback != null) {
            onDecodeStreamCallback.onError(-1003, "Decoding Stream is working, please don't open again.");
        }
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void stopDecodeStream() {
        if (isDecodeStream()) {
            nativeDecodeStream(0);
        }
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void writeAudioStream(byte[] bArr) {
        if (isDecodeStream()) {
            addStreamData(bArr);
        }
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    protected int nativeDecodeFile(String str, String str2, OpusOption opusOption) {
        if (this.managerAddr == 0) {
            return -1000;
        }
        return decodeAudioFile(str, str2, this.managerAddr);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    protected void nativeDecodeStream(int i8, OpusOption opusOption) {
        decodeAudioStream(i8, this.managerAddr);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    protected int nativeEncodeFile(String str, String str2, OpusOption opusOption) {
        if (this.managerAddr == 0) {
            return -1000;
        }
        return encodeAudioFile(str, str2, this.managerAddr);
    }
}
