package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public class p extends a {
    private final q completeCallback;
    private n mediaInformation;

    private p(String[] strArr, q qVar, m mVar) {
        super(strArr, mVar, LogRedirectionStrategy.NEVER_PRINT_LOGS);
    }

    public static p create(String[] strArr) {
        return new p(strArr, null, null);
    }

    public q getCompleteCallback() {
        return null;
    }

    public n getMediaInformation() {
        return this.mediaInformation;
    }

    @Override // com.arthenica.ffmpegkit.a, com.arthenica.ffmpegkit.u
    public boolean isFFmpeg() {
        return false;
    }

    @Override // com.arthenica.ffmpegkit.a, com.arthenica.ffmpegkit.u
    public boolean isFFprobe() {
        return false;
    }

    @Override // com.arthenica.ffmpegkit.a, com.arthenica.ffmpegkit.u
    public boolean isMediaInformation() {
        return true;
    }

    public void setMediaInformation(n nVar) {
        this.mediaInformation = nVar;
    }

    public String toString() {
        return "MediaInformationSession{sessionId=" + this.sessionId + ", createTime=" + this.createTime + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", arguments=" + FFmpegKitConfig.argumentsToString(this.arguments) + ", logs=" + getLogsAsString() + ", state=" + this.state + ", returnCode=" + this.returnCode + ", failStackTrace='" + this.failStackTrace + "'}";
    }

    public static p create(String[] strArr, q qVar) {
        return new p(strArr, qVar, null);
    }

    public static p create(String[] strArr, q qVar, m mVar) {
        return new p(strArr, qVar, mVar);
    }
}
