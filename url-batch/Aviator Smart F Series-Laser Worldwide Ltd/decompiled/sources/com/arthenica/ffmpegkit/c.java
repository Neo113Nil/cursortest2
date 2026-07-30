package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public class c implements Runnable {
    private final k completeCallback;
    private final j ffprobeSession;

    public c(j jVar) {
        this.ffprobeSession = jVar;
        jVar.getCompleteCallback();
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.ffprobeExecute(this.ffprobeSession);
        FFmpegKitConfig.getFFprobeSessionCompleteCallback();
    }
}
