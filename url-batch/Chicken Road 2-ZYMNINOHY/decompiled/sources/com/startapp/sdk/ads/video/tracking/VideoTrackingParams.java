package com.startapp.sdk.ads.video.tracking;

import E.AbstractC0005f;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;

/* loaded from: classes.dex */
public class VideoTrackingParams extends TrackingParams {
    private static final long serialVersionUID = 3395538490475548059L;
    private int completed;
    protected boolean internalParamsIndicator;
    private String replayParameter;
    private boolean shouldAppendOffset;
    private String videoPlayingMode;

    public VideoTrackingParams(int i4, int i5, String str, String str2) {
        super(str);
        a(i5);
        this.completed = i4;
        this.videoPlayingMode = str2;
    }

    public final VideoTrackingParams b(boolean z) {
        this.internalParamsIndicator = z;
        return this;
    }

    public final VideoTrackingParams c(boolean z) {
        this.shouldAppendOffset = z;
        return this;
    }

    @Override // com.startapp.sdk.adsbase.commontracking.TrackingParams
    public String e() {
        return b(f() + h());
    }

    public String f() {
        return "&cp=" + this.completed;
    }

    public final boolean g() {
        return this.internalParamsIndicator;
    }

    public final String h() {
        return "&vpm=" + this.videoPlayingMode;
    }

    public final String b(String str) {
        return this.internalParamsIndicator ? AbstractC0005f.q(new StringBuilder(), super.e(), str) : c();
    }

    public final VideoTrackingParams c(String str) {
        this.replayParameter = str;
        return this;
    }

    @Override // com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String c() {
        if (this.shouldAppendOffset) {
            String str = this.replayParameter;
            if (str != null) {
                return str.replace("%startapp_replay_count%", String.valueOf(b()));
            }
            return super.c();
        }
        return "";
    }
}
