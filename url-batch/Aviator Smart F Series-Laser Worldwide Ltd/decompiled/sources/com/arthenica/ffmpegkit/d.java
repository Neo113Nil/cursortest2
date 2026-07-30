package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public class d implements Runnable {
    private final q completeCallback;
    private final p mediaInformationSession;
    private final Integer waitTimeout;

    public d(p pVar) {
        this(pVar, 5000);
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.getMediaInformationExecute(this.mediaInformationSession, this.waitTimeout.intValue());
        FFmpegKitConfig.getMediaInformationSessionCompleteCallback();
    }

    public d(p pVar, Integer num) {
        this.mediaInformationSession = pVar;
        pVar.getCompleteCallback();
        this.waitTimeout = num;
    }
}
