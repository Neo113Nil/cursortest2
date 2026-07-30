package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public class j extends a {
    private final k completeCallback;

    private j(String[] strArr, k kVar, m mVar, LogRedirectionStrategy logRedirectionStrategy) {
        super(strArr, mVar, logRedirectionStrategy);
    }

    public static j create(String[] strArr) {
        return new j(strArr, null, null, FFmpegKitConfig.getLogRedirectionStrategy());
    }

    public k getCompleteCallback() {
        return null;
    }

    @Override // com.arthenica.ffmpegkit.a, com.arthenica.ffmpegkit.u
    public boolean isFFmpeg() {
        return false;
    }

    @Override // com.arthenica.ffmpegkit.a, com.arthenica.ffmpegkit.u
    public boolean isFFprobe() {
        return true;
    }

    @Override // com.arthenica.ffmpegkit.a, com.arthenica.ffmpegkit.u
    public boolean isMediaInformation() {
        return false;
    }

    public String toString() {
        return "FFprobeSession{sessionId=" + this.sessionId + ", createTime=" + this.createTime + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", arguments=" + FFmpegKitConfig.argumentsToString(this.arguments) + ", logs=" + getLogsAsString() + ", state=" + this.state + ", returnCode=" + this.returnCode + ", failStackTrace='" + this.failStackTrace + "'}";
    }

    public static j create(String[] strArr, k kVar) {
        return new j(strArr, kVar, null, FFmpegKitConfig.getLogRedirectionStrategy());
    }

    public static j create(String[] strArr, k kVar, m mVar) {
        return new j(strArr, kVar, mVar, FFmpegKitConfig.getLogRedirectionStrategy());
    }

    public static j create(String[] strArr, k kVar, m mVar, LogRedirectionStrategy logRedirectionStrategy) {
        return new j(strArr, kVar, mVar, logRedirectionStrategy);
    }
}
