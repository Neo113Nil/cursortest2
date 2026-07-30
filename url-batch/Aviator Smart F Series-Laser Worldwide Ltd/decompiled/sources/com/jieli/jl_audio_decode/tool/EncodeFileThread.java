package com.jieli.jl_audio_decode.tool;

import android.text.TextUtils;
import com.jieli.jl_audio_decode.callback.OnStateCallback;
import com.jieli.jl_audio_decode.callback.OnThreadFinishListener;
import com.jieli.jl_audio_decode.opus.model.OpusOption;
import java.io.File;

/* loaded from: classes4.dex */
public class EncodeFileThread extends OperationThread {
    private final String inFile;
    private final OpusOption opusOption;
    private final String outFile;

    public EncodeFileThread(BaseManager baseManager, String str, String str2, OpusOption opusOption, OnStateCallback onStateCallback, OnThreadFinishListener onThreadFinishListener) {
        super("EncodeFileThread", baseManager, onStateCallback, onThreadFinishListener);
        this.inFile = str;
        this.outFile = str2;
        this.opusOption = opusOption;
    }

    @Override // com.jieli.jl_audio_decode.tool.OperationThread
    public int operation() {
        return 2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (this.manager != null) {
            File file = new File(this.inFile);
            if (TextUtils.isEmpty(this.inFile) || TextUtils.isEmpty(this.outFile) || !file.exists() || !file.isFile()) {
                callbackError(-1002);
            } else {
                int nativeEncodeFile = this.manager.nativeEncodeFile(this.inFile, this.outFile, this.opusOption);
                if (nativeEncodeFile != 0) {
                    callbackError(nativeEncodeFile);
                }
            }
        } else {
            callbackError(-1);
        }
        onThreadFinish();
    }
}
