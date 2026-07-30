package com.google.android.exoplayer2.source.rtsp;

@Deprecated
/* loaded from: classes3.dex */
final class RtspResponse {
    public final RtspHeaders headers;
    public final String messageBody;
    public final int status;

    public RtspResponse(int i8, RtspHeaders rtspHeaders, String str) {
        this.status = i8;
        this.headers = rtspHeaders;
        this.messageBody = str;
    }

    public RtspResponse(int i8, RtspHeaders rtspHeaders) {
        this(i8, rtspHeaders, "");
    }
}
