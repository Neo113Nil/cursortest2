package com.startapp.sdk.ads.video.tracking;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class VideoClickedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 940417627850369979L;
    private boolean isVideoFinished;

    public VideoClickedTrackingParams(String str, int i, int i2, boolean z) {
        super(str, i, i2);
        this.isVideoFinished = z;
    }

    @Override // com.startapp.sdk.ads.video.tracking.VideoTrackingParams, com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String e() {
        return b(f() + "&co=".concat(this.isVideoFinished ? "POSTROLL" : "VIDEO") + h());
    }
}
