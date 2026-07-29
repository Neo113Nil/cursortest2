package com.aiming.mdt.mobileads;

import android.app.Activity;
import com.aiming.mdt.adt.interactive.C0202;
import com.aiming.mdt.adt.interactive.InterfaceC0212;
import com.aiming.mdt.mediation.CustomInteractiveEvent;
import java.util.Map;

/* loaded from: classes.dex */
public class AdtimingInteractive extends CustomInteractiveEvent implements InterfaceC0212 {
    private C0202 mInteractiveAd;

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public void destroy(Activity activity) {
        if (this.mInteractiveAd != null) {
            this.mInteractiveAd.m799();
            this.mInteractiveAd = null;
        }
        this.isDestroyed = true;
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public int getMediation() {
        return 0;
    }

    @Override // com.aiming.mdt.mediation.CustomInteractiveEvent
    public boolean isReady() {
        if (this.isDestroyed || this.mInteractiveAd == null) {
            return false;
        }
        return this.mInteractiveAd.mo798();
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public void loadAd(Activity activity, Map<String, String> map) {
        super.loadAd(activity, map);
        if (check(activity, map)) {
            if (this.mInteractiveAd == null) {
                this.mInteractiveAd = new C0202(activity, this.mInstancesKey);
                this.mInteractiveAd.m796(this);
                this.mInteractiveAd.m797();
            } else if (this.mInteractiveAd.mo798()) {
                onInsReady(null);
            } else {
                this.mInteractiveAd.m797();
            }
        }
    }

    @Override // com.aiming.mdt.adt.InterfaceC0231
    public void onAdClicked() {
    }

    @Override // com.aiming.mdt.adt.interactive.InterfaceC0212
    public void onAdClose() {
        if (this.isDestroyed) {
            return;
        }
        onInsClose(true);
    }

    @Override // com.aiming.mdt.adt.InterfaceC0231
    public void onAdFailed(String str) {
        if (this.isDestroyed) {
            return;
        }
        onInsError(str);
    }

    @Override // com.aiming.mdt.adt.interactive.InterfaceC0212
    public void onAdReady() {
        if (this.isDestroyed) {
            return;
        }
        onInsReady(null);
    }

    @Override // com.aiming.mdt.adt.interactive.InterfaceC0212
    public void onAdShowed() {
        if (this.isDestroyed) {
            return;
        }
        onInsShow(null);
    }

    @Override // com.aiming.mdt.mediation.CustomInteractiveEvent
    public boolean show(Activity activity) {
        if (!this.isDestroyed && this.mInteractiveAd != null && this.mInteractiveAd.mo798()) {
            this.mInteractiveAd.mo795();
        }
        return false;
    }
}
