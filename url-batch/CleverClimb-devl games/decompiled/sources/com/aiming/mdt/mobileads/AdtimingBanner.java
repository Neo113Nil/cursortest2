package com.aiming.mdt.mobileads;

import android.app.Activity;
import android.view.View;
import com.aiming.mdt.a.C0063;
import com.aiming.mdt.a.InterfaceC0105;
import com.aiming.mdt.mediation.CustomBannerEvent;
import java.util.Map;

/* loaded from: classes.dex */
public class AdtimingBanner extends CustomBannerEvent implements InterfaceC0105 {
    private C0063 mBannerAd;

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public void destroy(Activity activity) {
        if (this.mBannerAd != null) {
            this.mBannerAd.m196();
            this.mBannerAd = null;
        }
        this.isDestroyed = true;
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public int getMediation() {
        return 0;
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public void loadAd(Activity activity, Map<String, String> map) {
        super.loadAd(activity, map);
        if (check(activity, map)) {
            if (this.mBannerAd == null) {
                this.mBannerAd = new C0063(activity, this.mInstancesKey);
                this.mBannerAd.m194(this);
            }
            this.mBannerAd.m195();
        }
    }

    @Override // com.aiming.mdt.adt.InterfaceC0231
    public void onAdClicked() {
        onInsClicked();
    }

    @Override // com.aiming.mdt.adt.InterfaceC0231
    public void onAdFailed(String str) {
        if (this.isDestroyed) {
            return;
        }
        onInsError(str);
    }

    @Override // com.aiming.mdt.a.InterfaceC0105
    public void onAdReady(View view) {
        if (this.isDestroyed) {
            return;
        }
        onInsReady(view);
    }
}
