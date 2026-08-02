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
    public OverlayActivity f4518a;

    /* renamed from: d, reason: collision with root package name */
    public String[] f4521d;

    /* renamed from: e, reason: collision with root package name */
    public boolean[] f4522e;

    /* renamed from: g, reason: collision with root package name */
    public String f4523g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f4524h;

    /* renamed from: i, reason: collision with root package name */
    public String[] f4525i;

    /* renamed from: j, reason: collision with root package name */
    public String[] f4526j;

    /* renamed from: k, reason: collision with root package name */
    public Ad f4527k;

    /* renamed from: l, reason: collision with root package name */
    public AdPreferences.Placement f4528l;

    /* renamed from: m, reason: collision with root package name */
    public AdInformationOverrides f4529m;

    /* renamed from: n, reason: collision with root package name */
    public String f4530n;
    public Long o;

    /* renamed from: s, reason: collision with root package name */
    public Long f4534s;

    /* renamed from: b, reason: collision with root package name */
    public com.startapp.sdk.adsbase.adinformation.a f4519b = null;

    /* renamed from: c, reason: collision with root package name */
    public r7 f4520c = new r7(this);
    public boolean[] f = {true};

    /* renamed from: p, reason: collision with root package name */
    public Boolean[] f4531p = null;

    /* renamed from: q, reason: collision with root package name */
    public int f4532q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4533r = false;

    public abstract void a(Bundle bundle);

    public boolean a(int i3, KeyEvent keyEvent) {
        return false;
    }

    public void b() {
        this.f4518a.runOnUiThread(new s7(this));
    }

    public abstract void b(Bundle bundle);

    public boolean c() {
        return false;
    }

    public void d() {
    }

    public void e() {
        if (this.f4520c != null) {
            wb.a(this.f4518a).a(this.f4520c);
        }
        this.f4520c = null;
    }

    public abstract void f();

    public abstract void g();

    public void h() {
        wb.a(this.f4518a).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
    }

    public final String a() {
        try {
            String[] strArr = this.f4524h;
            return (strArr == null || strArr.length <= 0) ? "" : g0.a(strArr[0], (String) null);
        } catch (Throwable th) {
            d9.a(th);
            return "";
        }
    }

    public final void a(RelativeLayout relativeLayout) {
        OverlayActivity overlayActivity = this.f4518a;
        AdInformationConfig.ImageResourceType imageResourceType = AdInformationConfig.ImageResourceType.INFO_L;
        AdPreferences.Placement placement = this.f4528l;
        AdInformationOverrides adInformationOverrides = this.f4529m;
        Ad ad = this.f4527k;
        ConsentData consentData = ad != null ? ad.getConsentData() : null;
        Ad ad2 = this.f4527k;
        String requestUrl = ad2 != null ? ad2.getRequestUrl() : null;
        Ad ad3 = this.f4527k;
        String dParam = ad3 != null ? ad3.getDParam() : null;
        Ad ad4 = this.f4527k;
        String erid = ad4 != null ? ad4.getErid() : null;
        Ad ad5 = this.f4527k;
        com.startapp.sdk.adsbase.adinformation.a aVar = new com.startapp.sdk.adsbase.adinformation.a(overlayActivity, imageResourceType, placement, adInformationOverrides, consentData, requestUrl, dParam, erid, ad5 != null ? ad5.getEridUrl() : null);
        this.f4519b = aVar;
        aVar.a(relativeLayout);
    }
}
