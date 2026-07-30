package com.google.android.exoplayer2.source.rtsp;

@Deprecated
/* loaded from: classes3.dex */
final class RtspDescribeResponse {
    public final RtspHeaders headers;
    public final SessionDescription sessionDescription;
    public final int status;

    public RtspDescribeResponse(RtspHeaders rtspHeaders, int i8, SessionDescription sessionDescription) {
        this.headers = rtspHeaders;
        this.status = i8;
        this.sessionDescription = sessionDescription;
    }
}
