package com.startapp.sdk.internal;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class g7 {

    /* renamed from: a, reason: collision with root package name */
    public OverlayActivity f248a;
    public String[] d;
    public boolean[] e;
    public String g;
    public String[] h;
    public String[] i;
    public String[] j;
    public final Ad k;
    public AdPreferences.Placement l;
    public AdInformationOverrides m;
    public String n;
    public Long o;
    public Long s;
    public com.startapp.sdk.adsbase.adinformation.a b = null;
    public d7 c = new d7(this);
    public boolean[] f = {true};
    public Boolean[] p = null;
    public int q = 0;
    public boolean r = false;

    public g7(Ad ad) {
        this.k = ad;
    }

    public final String a() {
        try {
            String[] strArr = this.h;
            return (strArr == null || strArr.length <= 0) ? "" : e0.a(strArr[0], (String) null);
        } catch (Throwable th) {
            n8.a(th);
            return "";
        }
    }

    public abstract void a(Bundle bundle);

    public boolean a(int i, KeyEvent keyEvent) {
        return false;
    }

    public void b() {
        this.f248a.runOnUiThread(new e7(this));
    }

    public abstract void b(Bundle bundle);

    public boolean c() {
        return false;
    }

    public void d() {
    }

    public void e() {
        if (this.c != null) {
            db.a(this.f248a).a(this.c);
        }
        this.c = null;
    }

    public abstract void f();

    public abstract void g();

    public void h() {
        db.a(this.f248a).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
    }

    public final void a(RelativeLayout relativeLayout) {
        OverlayActivity overlayActivity = this.f248a;
        AdInformationConfig.ImageResourceType imageResourceType = AdInformationConfig.ImageResourceType.INFO_L;
        AdPreferences.Placement placement = this.l;
        AdInformationOverrides adInformationOverrides = this.m;
        Ad ad = this.k;
        ConsentData consentData = ad != null ? ad.getConsentData() : null;
        Ad ad2 = this.k;
        String requestUrl = ad2 != null ? ad2.getRequestUrl() : null;
        Ad ad3 = this.k;
        String dParam = ad3 != null ? ad3.getDParam() : null;
        Ad ad4 = this.k;
        String erid = ad4 != null ? ad4.getErid() : null;
        Ad ad5 = this.k;
        com.startapp.sdk.adsbase.adinformation.a aVar = new com.startapp.sdk.adsbase.adinformation.a(overlayActivity, imageResourceType, placement, adInformationOverrides, consentData, requestUrl, dParam, erid, ad5 != null ? ad5.getEridUrl() : null);
        this.b = aVar;
        aVar.a(relativeLayout);
    }
}
