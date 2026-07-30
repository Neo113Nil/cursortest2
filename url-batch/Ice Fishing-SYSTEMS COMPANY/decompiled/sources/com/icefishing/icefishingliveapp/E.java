package com.icefishing.icefishingliveapp;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import com.anythink.interstitial.api.ATInterstitial;
import com.facebook.ads.InterstitialAd;
import g1.C4524d;
import k2.C4635f;
import k2.C4636g;
import k4.C4649d;
import k4.C4650e;
import k4.C4651f;
import k4.DialogC4646a;
import v2.AbstractC5123a;

/* loaded from: classes2.dex */
public final /* synthetic */ class E implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36550n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h4.c f36551u;

    public /* synthetic */ E(h4.c cVar, int i) {
        this.f36550n = i;
        this.f36551u = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h4.c cVar = this.f36551u;
        int i = 1;
        switch (this.f36550n) {
            case 0:
                cVar.getClass();
                int i4 = SplashActivity.f37047A;
                SplashActivity splashActivity = (SplashActivity) cVar.f38233u;
                if (splashActivity.f()) {
                    if (splashActivity.f37050x.f36499a.getBoolean("IsFirstTimeLaunch", true)) {
                        splashActivity.f37050x.getClass();
                        A.f36498b.putBoolean("IsFirstTimeLaunch", false);
                        A.f36498b.apply();
                        splashActivity.f37048v = new Intent(splashActivity, (Class<?>) IntroActivity.class);
                    } else {
                        splashActivity.f37048v = new Intent(splashActivity, (Class<?>) StartActivity.class);
                    }
                    E e6 = new E(cVar, i);
                    if (splashActivity.f()) {
                        splashActivity.runOnUiThread(new D5.b(14, splashActivity, e6));
                        break;
                    }
                }
                break;
            default:
                SplashActivity splashActivity2 = (SplashActivity) cVar.f38233u;
                k4.m e9 = k4.m.e(splashActivity2.f37049w);
                String str = k4.m.f38803t;
                String str2 = k4.m.f38795l;
                String str3 = k4.m.J;
                C4524d c4524d = new C4524d(16, cVar);
                e9.getClass();
                k4.m.f38768A = c4524d;
                try {
                    DialogC4646a dialogC4646a = new DialogC4646a(splashActivity2);
                    k4.m.f38809z = dialogC4646a;
                    if (dialogC4646a.getWindow() != null) {
                        k4.m.f38809z.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                    }
                    k4.m.f38809z.setCanceledOnTouchOutside(false);
                    k4.m.f38809z.setCancelable(false);
                    if (!splashActivity2.isFinishing()) {
                        k4.m.f38809z.show();
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                if (k4.m.f38790f != 1) {
                    if (k4.m.f38809z.isShowing()) {
                        k4.m.f38809z.dismiss();
                    }
                    k4.m.f();
                    if (k4.m.f38791g == 1) {
                        k4.m.g(splashActivity2);
                        break;
                    }
                } else if (k4.m.f38773F != 1) {
                    if (k4.m.f38772E != 1) {
                        if (k4.m.f38793j != 1) {
                            if (k4.m.f38809z.isShowing()) {
                                k4.m.f38809z.dismiss();
                            }
                            k4.m.f();
                            break;
                        } else {
                            AbstractC5123a.b(splashActivity2, str2, new C4636g(new C4635f(1)), new C4651f(0, splashActivity2, c4524d, e9));
                            break;
                        }
                    } else {
                        ATInterstitial aTInterstitial = new ATInterstitial(splashActivity2, str);
                        e9.f38811b = aTInterstitial;
                        aTInterstitial.setAdListener(new C4650e(0, splashActivity2, c4524d, e9));
                        e9.f38811b.load();
                        break;
                    }
                } else {
                    InterstitialAd interstitialAd = new InterstitialAd(splashActivity2, str3);
                    k4.m.f38780N = interstitialAd;
                    interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new C4649d(e9, c4524d, splashActivity2)).build());
                    break;
                }
                break;
        }
    }
}
