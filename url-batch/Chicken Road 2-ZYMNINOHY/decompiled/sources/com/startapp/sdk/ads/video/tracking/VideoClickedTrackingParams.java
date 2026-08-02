package com.startapp.sdk.ads.video.tracking;

/* loaded from: classes.dex */
public class VideoClickedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 940417627850369979L;
    private boolean isVideoFinished;

    public VideoClickedTrackingParams(String str, int i4, int i5, boolean z, String str2) {
        super(i4, i5, str, str2);
        this.isVideoFinished = z;
    }

    @Override // com.startapp.sdk.ads.video.tracking.VideoTrackingParams, com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(f());
        sb.append("&co=".concat(this.isVideoFinished ? "POSTROLL" : "VIDEO"));
        sb.append(h());
        return b(sb.toString());
    }
}
