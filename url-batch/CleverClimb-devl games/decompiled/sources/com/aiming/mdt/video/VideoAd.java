package com.aiming.mdt.video;

import android.app.Activity;
import com.aiming.mdt.a.C0027;
import com.aiming.mdt.a.C0046;

/* loaded from: classes.dex */
public class VideoAd {
    private C0046 mVideo;

    public VideoAd(Activity activity, String str, VideoAdListener videoAdListener) {
        this.mVideo = C0027.m24().m25(activity, str, videoAdListener);
        this.mVideo.m136(videoAdListener);
    }

    public void destroy() {
        this.mVideo.mo73();
    }

    public boolean isReady() {
        return this.mVideo.mo71();
    }

    public void loadAd() {
        this.mVideo.m898();
    }

    public void setExtId(String str) {
        this.mVideo.m137(str);
    }

    public void showAd() {
        this.mVideo.m138();
    }
}
