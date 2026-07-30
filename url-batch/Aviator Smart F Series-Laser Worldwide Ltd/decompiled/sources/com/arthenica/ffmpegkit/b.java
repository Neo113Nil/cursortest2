package com.arthenica.ffmpegkit;

import android.util.Log;

/* loaded from: classes.dex */
public class b implements Runnable {
    private final i completeCallback;
    private final h ffmpegSession;

    public b(h hVar) {
        this.ffmpegSession = hVar;
        this.completeCallback = hVar.getCompleteCallback();
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.ffmpegExecute(this.ffmpegSession);
        i iVar = this.completeCallback;
        if (iVar != null) {
            try {
                iVar.apply(this.ffmpegSession);
            } catch (Exception e8) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside session complete callback.%s", com.arthenica.smartexception.java.a.getStackTraceString(e8)));
            }
        }
        i fFmpegSessionCompleteCallback = FFmpegKitConfig.getFFmpegSessionCompleteCallback();
        if (fFmpegSessionCompleteCallback != null) {
            try {
                fFmpegSessionCompleteCallback.apply(this.ffmpegSession);
            } catch (Exception e9) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside global complete callback.%s", com.arthenica.smartexception.java.a.getStackTraceString(e9)));
            }
        }
    }
}
