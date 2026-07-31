package com.startapp.sdk.ads.video.tracking;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class VideoPausedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 4019115021800482057L;
    private int pauseNum;
    private PauseOrigin pauseOrigin;

    /* compiled from: Sta */
    public enum PauseOrigin {
        INAPP,
        EXTERNAL
    }

    public VideoPausedTrackingParams(String str, int i, int i2, int i3, PauseOrigin pauseOrigin) {
        super(str, i, i2);
        this.pauseNum = i3;
        this.pauseOrigin = pauseOrigin;
    }

    @Override // com.startapp.sdk.ads.video.tracking.VideoTrackingParams, com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String e() {
        return b(f() + ("&po=" + this.pauseOrigin.toString()) + ("&pn=" + this.pauseNum) + h());
    }
}
