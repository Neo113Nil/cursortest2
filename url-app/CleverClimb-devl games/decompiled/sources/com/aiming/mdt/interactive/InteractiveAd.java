package com.aiming.mdt.interactive;

import android.app.Activity;
import com.aiming.mdt.a.C0121;
import com.aiming.mdt.a.C0132;

/* loaded from: classes.dex */
public class InteractiveAd {
    private C0132 mInteractive;

    public InteractiveAd(Activity activity, String str, InteractiveAdListener interactiveAdListener) {
        this.mInteractive = C0121.m465().m469(activity, str, interactiveAdListener);
        this.mInteractive.m504(interactiveAdListener);
    }

    public void destroy() {
        this.mInteractive.mo73();
    }

    public boolean isReady() {
        return this.mInteractive.mo71();
    }

    public void loadAd() {
        this.mInteractive.m898();
    }

    public void showAd() {
        this.mInteractive.m503();
    }
}
