package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.instagram.common.viewpoint.core.C0391Ef;
import com.instagram.common.viewpoint.core.C1153dL;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ef, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0391Ef extends QC<EY> {
    public int A01;
    public final int A02;
    public final C02006g A05;
    public final C1153dL A06;
    public final KE A07;
    public final List<String> A09;
    public int A00 = 0;
    public final Application.ActivityLifecycleCallbacks A03 = new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.ads.internal.view.rewardedvideo.EndCardV2ScreenshotRecyclerAdapter$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C1153dL c1153dL;
            Handler handler;
            Runnable runnable;
            c1153dL = C0391Ef.this.A06;
            if (activity == c1153dL.A0E()) {
                handler = C0391Ef.this.A04;
                runnable = C0391Ef.this.A08;
                handler.removeCallbacks(runnable);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Handler handler;
            Runnable runnable;
            handler = C0391Ef.this.A04;
            runnable = C0391Ef.this.A08;
            handler.post(runnable);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    };
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final Runnable A08 = new RunnableC1147dF(this);

    public C0391Ef(C1153dL c1153dL, List<String> screenshotUrls, int i, C02006g c02006g, KE ke, int i2) {
        this.A09 = screenshotUrls;
        this.A02 = i;
        this.A06 = c1153dL;
        this.A05 = c02006g;
        this.A07 = ke;
        this.A01 = i2;
        this.A04.post(this.A08);
        if (Build.VERSION.SDK_INT >= 29 && this.A06.A0E() != null) {
            this.A06.A0E().registerActivityLifecycleCallbacks(this.A03);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.QC
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final EY A0F(ViewGroup viewGroup, int i) {
        EW ew = new EW(this.A06);
        if (U7.A1C(this.A06)) {
            ew.setOnClickListener(new ViewOnClickListenerC1148dG(this));
        }
        return new EY(ew);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.QC
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final void A0K(EY ey, int i) {
        String str = this.A09.get(i % this.A09.size());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(400, -1);
        int i2 = this.A02;
        int actualPosition = this.A02;
        marginLayoutParams.setMargins(i2, 0, actualPosition, 0);
        ey.A0p().setLayoutParams(marginLayoutParams);
        ey.A0p().setUrl(str);
    }

    @Override // com.instagram.common.viewpoint.core.QC
    public final int A0B() {
        return this.A09.size() * 1000;
    }

    @Override // com.instagram.common.viewpoint.core.QC
    public final void A0L(C02006g c02006g) {
        super.A0L(c02006g);
        this.A04.removeCallbacks(this.A08);
        if (Build.VERSION.SDK_INT >= 29 && this.A06.A0E() != null) {
            this.A06.A0E().unregisterActivityLifecycleCallbacks(this.A03);
        }
    }

    public final void A0O(int i) {
        this.A01 = i;
    }
}
