package com.aiming.mdt.mobileads;

import android.app.Activity;
import com.aiming.mdt.adt.video.C0222;
import com.aiming.mdt.adt.video.InterfaceC0221;
import com.aiming.mdt.mediation.CustomVideoEvent;
import java.util.Map;

/* loaded from: classes.dex */
public class AdtimingVideo extends CustomVideoEvent implements InterfaceC0221 {
    private C0222 mVideoAd;

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public void destroy(Activity activity) {
        if (this.mVideoAd != null) {
            this.mVideoAd.m815();
            this.mVideoAd = null;
        }
        this.isDestroyed = true;
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public int getMediation() {
        return 0;
    }

    @Override // com.aiming.mdt.mediation.CustomVideoEvent
    public boolean isReady() {
        if (this.mVideoAd != null) {
            return this.mVideoAd.mo798();
        }
        return false;
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public void loadAd(Activity activity, Map<String, String> map) {
        super.loadAd(activity, map);
        if (check(activity, map)) {
            if (this.mVideoAd == null) {
                this.mVideoAd = new C0222(activity, this.mInstancesKey);
                this.mVideoAd.m816(this);
                this.mVideoAd.m817();
            } else if (this.mVideoAd.mo798()) {
                onInsReady(null);
            } else {
                this.mVideoAd.m817();
            }
        }
    }

    @Override // com.aiming.mdt.adt.InterfaceC0231
    public void onAdClicked() {
        onInsClicked();
    }

    @Override // com.aiming.mdt.adt.video.InterfaceC0221
    public void onAdClose(boolean z) {
        if (this.isDestroyed) {
            return;
        }
        onInsClose(z);
    }

    @Override // com.aiming.mdt.adt.InterfaceC0231
    public void onAdFailed(String str) {
        if (this.isDestroyed) {
            return;
        }
        onInsError(str);
    }

    @Override // com.aiming.mdt.adt.video.InterfaceC0221
    public void onAdReady() {
        if (this.isDestroyed) {
            return;
        }
        onInsReady(null);
    }

    @Override // com.aiming.mdt.adt.video.InterfaceC0221
    public void onAdRewarded() {
        callbackInsRewarded();
    }

    @Override // com.aiming.mdt.adt.video.InterfaceC0221
    public void onAdShowed() {
        if (this.isDestroyed) {
            return;
        }
        onInsShow(null);
    }

    @Override // com.aiming.mdt.mediation.CustomVideoEvent
    public boolean show(Activity activity) {
        if (this.mVideoAd == null || !this.mVideoAd.mo798()) {
            return false;
        }
        this.mVideoAd.mo795();
        return false;
    }
}
