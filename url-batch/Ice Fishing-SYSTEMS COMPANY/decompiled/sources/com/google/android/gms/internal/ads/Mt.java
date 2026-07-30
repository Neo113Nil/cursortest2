package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;
import k2.EnumC4631b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class Mt implements At, InterfaceC3701ol, h3.c, LD, InterfaceC3352iB, InterfaceC3404jB, InterfaceC3865ro, ZP {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26392n;

    /* renamed from: u, reason: collision with root package name */
    public Object f26393u;

    public /* synthetic */ Mt(int i, Object obj) {
        this.f26392n = i;
        this.f26393u = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3404jB
    public /* synthetic */ Object a() {
        int i = SN.f27536z;
        return (C3554m) this.f26393u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3701ol, com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public void mo2b(Object obj) {
        switch (this.f26392n) {
            case 2:
                Ku ku = (Ku) this.f26393u;
                ((Pu) obj).a((Lu) ku.f26061n, ku.f26062u);
                break;
            default:
                ((LO) obj).o((IOException) this.f26393u);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZP
    public void d(Bundle bundle) {
        ((MediaCodec) this.f26393u).setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3352iB
    public /* synthetic */ Iterator g(com.bumptech.glide.manager.o oVar, CharSequence charSequence) {
        return new C3134eB(oVar, charSequence, (TA) this.f26393u, 0);
    }

    @Override // com.google.android.gms.internal.ads.ZP
    public void h(int i, FN fn, long j9, int i4) {
        ((MediaCodec) this.f26393u).queueSecureInputBuffer(i, 0, fn.i, j9, i4);
    }

    @Override // com.google.android.gms.internal.ads.ZP
    public void i(int i, int i4, int i9, long j9) {
        ((MediaCodec) this.f26393u).queueInputBuffer(i, 0, i4, j9, i9);
    }

    @Override // com.google.android.gms.internal.ads.At
    public /* synthetic */ C3322hi j(InterfaceC4302zt interfaceC4302zt) {
        return ((Pt) this.f26393u).b(interfaceC4302zt);
    }

    public JSONObject k(View view) {
        int currentModeType;
        JSONObject a9 = AbstractC3981tw.a(0, 0, 0, 0);
        UiModeManager uiModeManager = AbstractC3035cL.f29688L;
        int i = (uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : AbstractC2655Lg.f26182R;
        int i4 = i - 1;
        if (i == 0) {
            throw null;
        }
        try {
            a9.put("noOutputDevice", i4 == 0);
            return a9;
        } catch (JSONException e6) {
            AbstractC2720Pd.j("Error with setting output device status", e6);
            return a9;
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public void mo7l(Object obj) {
        Ny ny = (Ny) obj;
        Hy hy = (Hy) ((Ry) this.f26393u).f27451c;
        synchronized (hy.f25483m) {
            C3184f6 c3184f6 = hy.f25486p;
            String a9 = ny.a();
            c3184f6.h();
            ((C3239g6) c3184f6.f30000u).K(a9);
        }
    }

    public void m(int i, long j9, Nv nv, String str) {
        C2593Hm a9 = ((C3165eo) this.f26393u).a();
        a9.r(NativeAdvancedJsUtils.f18064p, "start_preload");
        a9.r("sp_ts", Long.toString(j9));
        a9.r(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, nv.a());
        a9.r("ad_unit_id", nv.f26620a);
        a9.r(com.anythink.expressad.f.a.b.aB, nv.f26622c);
        a9.r("max_ads", Integer.toString(i));
        a9.r("pv", str);
        a9.s();
    }

    public void n(Exception exc) {
        AbstractC3217fl.X("MediaCodecAudioRenderer", "Audio sink error", exc);
        C3932t0 c3932t0 = ((GP) this.f26393u).f25156m1;
        Handler handler = c3932t0.f34332a;
        if (handler != null) {
            handler.post(new RunnableC3418jP(c3932t0, exc, 5));
        }
    }

    @Override // h3.c
    public void o(h3.n nVar) {
        Yx yx = (Yx) this.f26393u;
        if (nVar.f38223d) {
            yx.cancel(false);
            return;
        }
        if (nVar.i()) {
            yx.d(nVar.g());
            return;
        }
        Exception f6 = nVar.f();
        if (f6 == null) {
            throw new IllegalStateException();
        }
        yx.e(f6);
    }

    public void p(String str, InterfaceC4279zN interfaceC4279zN) {
        AbstractC3137eE.d(interfaceC4279zN, "provider");
        ((LinkedHashMap) this.f26393u).put(str, interfaceC4279zN);
    }

    public void r(String str, InterfaceC4279zN interfaceC4279zN) {
        p(str, interfaceC4279zN);
    }

    public void s(EnumMap enumMap, long j9) {
        C2593Hm a9 = ((C3165eo) this.f26393u).a();
        a9.r(NativeAdvancedJsUtils.f18064p, "start_preload");
        a9.r("sp_ts", Long.toString(j9));
        a9.r("pv", "1");
        for (EnumC4631b enumC4631b : enumMap.keySet()) {
            String valueOf = String.valueOf(enumC4631b.name().toLowerCase(Locale.ENGLISH));
            a9.r(valueOf.concat("_count"), Integer.toString(((Integer) enumMap.get(enumC4631b)).intValue()));
        }
        a9.s();
    }

    public C4171xN t() {
        return new C4171xN((LinkedHashMap) this.f26393u);
    }

    public void u(int i, int i4, long j9, Long l9, String str, Nv nv, String str2) {
        C2593Hm a9 = ((C3165eo) this.f26393u).a();
        a9.r("plaac_ts", Long.toString(j9));
        a9.r("max_ads", Integer.toString(i));
        a9.r("cache_size", Integer.toString(i4));
        a9.r(NativeAdvancedJsUtils.f18064p, "is_ad_available");
        if (nv != null) {
            a9.r("ad_unit_id", nv.f26620a);
            a9.r(com.anythink.expressad.f.a.b.aB, nv.f26622c);
            a9.r(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, nv.a());
        }
        if (l9 != null) {
            a9.r("plaay_ts", Long.toString(l9.longValue()));
        }
        if (str != null) {
            a9.r("gqi", str);
        }
        a9.r("pv", str2);
        a9.s();
    }

    public void v(long j9, int i, int i4, String str, Nv nv, String str2) {
        C2593Hm a9 = ((C3165eo) this.f26393u).a();
        a9.r("ppla_ts", Long.toString(j9));
        a9.r(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, nv.a());
        a9.r("ad_unit_id", nv.f26620a);
        a9.r(com.anythink.expressad.f.a.b.aB, nv.f26622c);
        a9.r("max_ads", Integer.toString(i));
        a9.r("cache_size", Integer.toString(i4));
        a9.r(NativeAdvancedJsUtils.f18064p, "poll_ad");
        if (str != null) {
            a9.r("gqi", str);
        }
        a9.r("pv", str2);
        a9.s();
    }

    public void w(long j9, long j10, long j11, long j12, long j13) {
        C2593Hm a9 = ((C3165eo) this.f26393u).a();
        a9.r(NativeAdvancedJsUtils.f18064p, "iic");
        a9.r("pat", Long.toString(j9));
        a9.r("bot", Long.toString(j10));
        a9.r("cim", Long.toString(j11));
        a9.r("mbot", Long.toString(j12));
        a9.r("mim", Long.toString(j13));
        a9.s();
    }

    public void x(String str, long j9, String str2, String str3, EnumC4631b enumC4631b, int i, int i4, int i9) {
        C2593Hm a9 = ((C3165eo) this.f26393u).a();
        a9.r(NativeAdvancedJsUtils.f18064p, str);
        a9.r("pat", Long.toString(j9));
        a9.r(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, enumC4631b.name().toLowerCase(Locale.ENGLISH));
        a9.r("max_ads", Integer.toString(i));
        a9.r("cache_size", Integer.toString(i4));
        a9.r("pas", Integer.toString(i9));
        a9.r("pv", "2");
        a9.r("ad_unit_id", str3);
        a9.r(com.anythink.expressad.f.a.b.aB, str2);
        a9.s();
    }

    public void y(String str, String str2, long j9, int i, int i4, String str3, Nv nv, String str4) {
        C2593Hm a9 = ((C3165eo) this.f26393u).a();
        a9.r(str2, Long.toString(j9));
        if (nv != null) {
            a9.r("ad_unit_id", nv.f26620a);
            a9.r(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, nv.a());
            a9.r(com.anythink.expressad.f.a.b.aB, nv.f26622c);
        }
        a9.r(NativeAdvancedJsUtils.f18064p, str);
        if (str3 != null) {
            a9.r("gqi", str3);
        }
        if (i >= 0) {
            a9.r("max_ads", Integer.toString(i));
        }
        if (i4 >= 0) {
            a9.r("cache_size", Integer.toString(i4));
        }
        a9.r("pv", str4);
        a9.s();
    }

    public void z(String str, long j9, String str2, String str3, EnumC4631b enumC4631b, int i, int i4, int i9, int i10, int i11) {
        C2593Hm a9 = ((C3165eo) this.f26393u).a();
        a9.r(NativeAdvancedJsUtils.f18064p, str);
        a9.r("pat", Long.toString(j9));
        a9.r(com.anythink.expressad.f.a.b.aB, str2);
        a9.r("ad_unit_id", str3);
        a9.r("max_ads", Integer.toString(i));
        a9.r("cache_size", Integer.toString(i4));
        a9.r("tpcnt", Integer.toString(i10));
        a9.r("mpl", Integer.toString(i11));
        if (enumC4631b != null) {
            a9.r(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, enumC4631b.name().toLowerCase(Locale.ENGLISH));
        }
        if (i9 > 0) {
            a9.r("nptr", Integer.toString(i9));
        }
        a9.s();
    }

    public /* synthetic */ Mt(KO ko, C3958tQ c3958tQ, C4228yQ c4228yQ, IOException iOException, boolean z8) {
        this.f26392n = 13;
        this.f26393u = iOException;
    }

    @Override // com.google.android.gms.internal.ads.ZP
    /* renamed from: a, reason: collision with other method in class */
    public void mo3a() {
    }

    public Mt(byte b9, int i) {
        this.f26392n = i;
        switch (i) {
            case 14:
                break;
            default:
                this.f26393u = AbstractC2917aC.o(new Object[]{1, 5}, 2);
                break;
        }
    }

    public Mt(int i) {
        this.f26392n = 9;
        this.f26393u = YD.g(i);
    }

    public Mt(Ry ry) {
        this.f26392n = 6;
        Objects.requireNonNull(ry);
        this.f26393u = ry;
    }

    public /* synthetic */ Mt(GP gp) {
        this.f26392n = 15;
        Objects.requireNonNull(gp);
        this.f26393u = gp;
    }

    @Override // com.google.android.gms.internal.ads.ZP
    public void c() {
    }

    @Override // com.google.android.gms.internal.ads.ZP
    public void e() {
    }

    @Override // com.google.android.gms.internal.ads.ZP
    public void f() {
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
    }
}
