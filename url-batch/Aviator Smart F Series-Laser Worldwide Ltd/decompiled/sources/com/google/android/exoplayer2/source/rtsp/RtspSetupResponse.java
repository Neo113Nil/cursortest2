package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.RtspMessageUtil;

@Deprecated
/* loaded from: classes3.dex */
final class RtspSetupResponse {
    public final RtspMessageUtil.RtspSessionHeader sessionHeader;
    public final int status;
    public final String transport;

    public RtspSetupResponse(int i8, RtspMessageUtil.RtspSessionHeader rtspSessionHeader, String str) {
        this.status = i8;
        this.sessionHeader = rtspSessionHeader;
        this.transport = str;
    }
}
