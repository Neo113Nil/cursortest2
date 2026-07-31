package com.startapp.sdk.ads.interstitials;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.uimanager.ViewProps;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.a;
import com.startapp.sdk.internal.da;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.f7;
import com.startapp.sdk.internal.f8;
import com.startapp.sdk.internal.g7;
import com.startapp.sdk.internal.hd;
import com.startapp.sdk.internal.rg;
import com.startapp.sdk.internal.xf;
import com.startapp.sdk.internal.yf;
import com.startapp.sdk.internal.zh;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class OverlayActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private g7 f87a;
    private Ad b;

    @Override // android.app.Activity
    public final void finish() {
        g7 g7Var = this.f87a;
        if (g7Var != null) {
            g7Var.h();
        }
        super.finish();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        g7 g7Var = this.f87a;
        if (g7Var == null || !g7Var.c()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g7 g7Var = this.f87a;
        if (g7Var != null) {
            g7Var.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016e  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onCreate(Bundle bundle) {
        g7 hdVar;
        g7 g7Var;
        long longExtra;
        long longExtra2;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("placement", -1);
        int intExtra2 = getIntent().getIntExtra("ad", -1);
        if (intExtra2 <= 0) {
            finish();
            return;
        }
        Ad ad = (Ad) rg.a(intExtra2, Ad.class);
        this.b = ad;
        if (ad == null) {
            finish();
            return;
        }
        if (intExtra >= 0) {
            yf yfVar = (yf) a.a(getApplicationContext()).k.a();
            AdPreferences.Placement byIndex = AdPreferences.Placement.getByIndex(intExtra);
            String adId = this.b.getAdId();
            if (adId != null) {
                yfVar.f511a.put(new xf(byIndex), adId);
            }
        }
        boolean booleanExtra = getIntent().getBooleanExtra("videoAd", false);
        requestWindowFeature(1);
        if (getIntent().getBooleanExtra("fullscreen", false) || booleanExtra) {
            getWindow().setFlags(1024, 1024);
        }
        if (this.b == null) {
            finish();
        } else {
            int intExtra3 = getIntent().getIntExtra("placement", 0);
            Intent intent = getIntent();
            AdPreferences.Placement byIndex2 = AdPreferences.Placement.getByIndex(intExtra3);
            Ad ad2 = this.b;
            switch (f7.f236a[byIndex2.ordinal()]) {
                case 1:
                    WeakHashMap weakHashMap = zh.f528a;
                    hdVar = new hd(ad2);
                    hdVar.f248a = this;
                    hdVar.g = intent.getStringExtra(ViewProps.POSITION);
                    hdVar.h = intent.getStringArrayExtra("tracking");
                    hdVar.i = intent.getStringArrayExtra("trackingClickUrl");
                    hdVar.j = intent.getStringArrayExtra("packageNames");
                    hdVar.d = intent.getStringArrayExtra("closingUrl");
                    hdVar.e = intent.getBooleanArrayExtra("smartRedirect");
                    hdVar.f = intent.getBooleanArrayExtra("browserEnabled");
                    hdVar.n = intent.getStringExtra("adTag");
                    hdVar.m = (AdInformationOverrides) intent.getSerializableExtra("adInfoOverride");
                    hdVar.l = byIndex2;
                    hdVar.d = intent.getStringArrayExtra("closingUrl");
                    hdVar.q = intent.getIntExtra("rewardDuration", 0);
                    hdVar.r = intent.getBooleanExtra("rewardedHideTimer", false);
                    if (hdVar.e == null) {
                        hdVar.e = new boolean[]{true};
                    }
                    if (hdVar.f == null) {
                        hdVar.f = new boolean[]{true};
                    }
                    longExtra = intent.getLongExtra("delayCloseInterval", -1L);
                    if (longExtra != -1) {
                        hdVar.s = Long.valueOf(longExtra);
                    }
                    longExtra2 = intent.getLongExtra("delayImpressionSeconds", -1L);
                    if (longExtra2 != -1) {
                        hdVar.o = Long.valueOf(longExtra2);
                    }
                    hdVar.p = (Boolean[]) intent.getSerializableExtra("sendRedirectHops");
                    g7Var = hdVar;
                    break;
                case 2:
                    hdVar = intent.getBooleanExtra("videoAd", false) ? new com.startapp.sdk.ads.video.a(ad2) : new da(ad2);
                    hdVar.f248a = this;
                    hdVar.g = intent.getStringExtra(ViewProps.POSITION);
                    hdVar.h = intent.getStringArrayExtra("tracking");
                    hdVar.i = intent.getStringArrayExtra("trackingClickUrl");
                    hdVar.j = intent.getStringArrayExtra("packageNames");
                    hdVar.d = intent.getStringArrayExtra("closingUrl");
                    hdVar.e = intent.getBooleanArrayExtra("smartRedirect");
                    hdVar.f = intent.getBooleanArrayExtra("browserEnabled");
                    hdVar.n = intent.getStringExtra("adTag");
                    hdVar.m = (AdInformationOverrides) intent.getSerializableExtra("adInfoOverride");
                    hdVar.l = byIndex2;
                    hdVar.d = intent.getStringArrayExtra("closingUrl");
                    hdVar.q = intent.getIntExtra("rewardDuration", 0);
                    hdVar.r = intent.getBooleanExtra("rewardedHideTimer", false);
                    if (hdVar.e == null) {
                    }
                    if (hdVar.f == null) {
                    }
                    longExtra = intent.getLongExtra("delayCloseInterval", -1L);
                    if (longExtra != -1) {
                    }
                    longExtra2 = intent.getLongExtra("delayImpressionSeconds", -1L);
                    if (longExtra2 != -1) {
                    }
                    hdVar.p = (Boolean[]) intent.getSerializableExtra("sendRedirectHops");
                    g7Var = hdVar;
                    break;
                case 5:
                case 6:
                    WeakHashMap weakHashMap2 = zh.f528a;
                    Uri data = intent.getData();
                    if (data != null) {
                        hdVar = new f8(ad2, data.toString());
                        hdVar.f248a = this;
                        hdVar.g = intent.getStringExtra(ViewProps.POSITION);
                        hdVar.h = intent.getStringArrayExtra("tracking");
                        hdVar.i = intent.getStringArrayExtra("trackingClickUrl");
                        hdVar.j = intent.getStringArrayExtra("packageNames");
                        hdVar.d = intent.getStringArrayExtra("closingUrl");
                        hdVar.e = intent.getBooleanArrayExtra("smartRedirect");
                        hdVar.f = intent.getBooleanArrayExtra("browserEnabled");
                        hdVar.n = intent.getStringExtra("adTag");
                        hdVar.m = (AdInformationOverrides) intent.getSerializableExtra("adInfoOverride");
                        hdVar.l = byIndex2;
                        hdVar.d = intent.getStringArrayExtra("closingUrl");
                        hdVar.q = intent.getIntExtra("rewardDuration", 0);
                        hdVar.r = intent.getBooleanExtra("rewardedHideTimer", false);
                        if (hdVar.e == null) {
                        }
                        if (hdVar.f == null) {
                        }
                        longExtra = intent.getLongExtra("delayCloseInterval", -1L);
                        if (longExtra != -1) {
                        }
                        longExtra2 = intent.getLongExtra("delayImpressionSeconds", -1L);
                        if (longExtra2 != -1) {
                        }
                        hdVar.p = (Boolean[]) intent.getSerializableExtra("sendRedirectHops");
                        g7Var = hdVar;
                        break;
                    }
                    break;
                case 3:
                case 4:
                    g7Var = null;
                    break;
                default:
                    hdVar = new da(ad2);
                    hdVar.f248a = this;
                    hdVar.g = intent.getStringExtra(ViewProps.POSITION);
                    hdVar.h = intent.getStringArrayExtra("tracking");
                    hdVar.i = intent.getStringArrayExtra("trackingClickUrl");
                    hdVar.j = intent.getStringArrayExtra("packageNames");
                    hdVar.d = intent.getStringArrayExtra("closingUrl");
                    hdVar.e = intent.getBooleanArrayExtra("smartRedirect");
                    hdVar.f = intent.getBooleanArrayExtra("browserEnabled");
                    hdVar.n = intent.getStringExtra("adTag");
                    hdVar.m = (AdInformationOverrides) intent.getSerializableExtra("adInfoOverride");
                    hdVar.l = byIndex2;
                    hdVar.d = intent.getStringArrayExtra("closingUrl");
                    hdVar.q = intent.getIntExtra("rewardDuration", 0);
                    hdVar.r = intent.getBooleanExtra("rewardedHideTimer", false);
                    if (hdVar.e == null) {
                    }
                    if (hdVar.f == null) {
                    }
                    longExtra = intent.getLongExtra("delayCloseInterval", -1L);
                    if (longExtra != -1) {
                    }
                    longExtra2 = intent.getLongExtra("delayImpressionSeconds", -1L);
                    if (longExtra2 != -1) {
                    }
                    hdVar.p = (Boolean[]) intent.getSerializableExtra("sendRedirectHops");
                    g7Var = hdVar;
                    break;
            }
            this.f87a = g7Var;
            if (g7Var == null) {
                finish();
            }
        }
        g7 g7Var2 = this.f87a;
        if (g7Var2 != null) {
            g7Var2.a(bundle);
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        g7 g7Var = this.f87a;
        if (g7Var != null) {
            g7Var.e();
            this.f87a = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        g7 g7Var = this.f87a;
        if (g7Var == null || g7Var.a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected final void onPause() {
        super.onPause();
        g7 g7Var = this.f87a;
        if (g7Var != null) {
            g7Var.f();
        }
        e0.d(this);
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        g7 g7Var = this.f87a;
        if (g7Var != null) {
            g7Var.g();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        g7 g7Var = this.f87a;
        if (g7Var != null) {
            g7Var.b(bundle);
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        super.onStop();
        g7 g7Var = this.f87a;
        if (g7Var != null) {
            g7Var.getClass();
        }
    }
}
