package com.startapp.sdk.adsbase.commontracking;

/* loaded from: classes.dex */
public class CloseTrackingParams extends TrackingParams {
    private static final long serialVersionUID = -1873434013300932473L;
    private final long duration;

    public CloseTrackingParams(String str, long j4) {
        super(str);
        this.duration = j4;
    }

    @Override // com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String e() {
        return super.e() + "&displayDuration=" + Math.max(0L, this.duration);
    }
}
