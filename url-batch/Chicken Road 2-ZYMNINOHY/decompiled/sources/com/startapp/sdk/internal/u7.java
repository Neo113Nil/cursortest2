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

/* loaded from: classes.dex */
public abstract class u7 {

    /* renamed from: a, reason: collision with root package name */
    public OverlayActivity f7658a;

    /* renamed from: d, reason: collision with root package name */
    public String[] f7661d;

    /* renamed from: e, reason: collision with root package name */
    public boolean[] f7662e;

    /* renamed from: g, reason: collision with root package name */
    public String f7664g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f7665h;

    /* renamed from: i, reason: collision with root package name */
    public String[] f7666i;

    /* renamed from: j, reason: collision with root package name */
    public String[] f7667j;

    /* renamed from: k, reason: collision with root package name */
    public Ad f7668k;

    /* renamed from: l, reason: collision with root package name */
    public AdPreferences.Placement f7669l;

    /* renamed from: m, reason: collision with root package name */
    public AdInformationOverrides f7670m;
    public String n;
    public Long o;

    /* renamed from: s, reason: collision with root package name */
    public Long f7674s;

    /* renamed from: b, reason: collision with root package name */
    public com.startapp.sdk.adsbase.adinformation.a f7659b = null;

    /* renamed from: c, reason: collision with root package name */
    public r7 f7660c = new r7(this);

    /* renamed from: f, reason: collision with root package name */
    public boolean[] f7663f = {true};

    /* renamed from: p, reason: collision with root package name */
    public Boolean[] f7671p = null;

    /* renamed from: q, reason: collision with root package name */
    public int f7672q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7673r = false;

    public abstract void a(Bundle bundle);

    public boolean a(int i4, KeyEvent keyEvent) {
        return false;
    }

    public void b() {
        this.f7658a.runOnUiThread(new s7(this));
    }

    public abstract void b(Bundle bundle);

    public boolean c() {
        return false;
    }

    public void d() {
    }

    public void e() {
        if (this.f7660c != null) {
            wb.a(this.f7658a).a(this.f7660c);
        }
        this.f7660c = null;
    }

    public abstract void f();

    public abstract void g();

    public void h() {
        wb.a(this.f7658a).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
    }

    public final String a() {
        try {
            String[] strArr = this.f7665h;
            return (strArr == null || strArr.length <= 0) ? "" : g0.a(strArr[0], (String) null);
        } catch (Throwable th) {
            d9.a(th);
            return "";
        }
    }

    public final void a(RelativeLayout relativeLayout) {
        OverlayActivity overlayActivity = this.f7658a;
        AdInformationConfig.ImageResourceType imageResourceType = AdInformationConfig.ImageResourceType.INFO_L;
        AdPreferences.Placement placement = this.f7669l;
        AdInformationOverrides adInformationOverrides = this.f7670m;
        Ad ad = this.f7668k;
        ConsentData consentData = ad != null ? ad.getConsentData() : null;
        Ad ad2 = this.f7668k;
        String requestUrl = ad2 != null ? ad2.getRequestUrl() : null;
        Ad ad3 = this.f7668k;
        String dParam = ad3 != null ? ad3.getDParam() : null;
        Ad ad4 = this.f7668k;
        String erid = ad4 != null ? ad4.getErid() : null;
        Ad ad5 = this.f7668k;
        com.startapp.sdk.adsbase.adinformation.a aVar = new com.startapp.sdk.adsbase.adinformation.a(overlayActivity, imageResourceType, placement, adInformationOverrides, consentData, requestUrl, dParam, erid, ad5 != null ? ad5.getEridUrl() : null);
        this.f7659b = aVar;
        aVar.a(relativeLayout);
    }
}
