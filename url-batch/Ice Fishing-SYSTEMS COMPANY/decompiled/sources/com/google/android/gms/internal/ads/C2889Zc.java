package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import n0.C4804d;
import p2.C4856a;

/* renamed from: com.google.android.gms.internal.ads.Zc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2889Zc implements CD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28994a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28995b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f28996c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f28997d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f28998e;

    public C2889Zc(c7.m mVar, String str, InterfaceC2838Wc interfaceC2838Wc, InterfaceC2821Vc interfaceC2821Vc) {
        this.f28994a = 0;
        this.f28998e = mVar;
        this.f28995b = str;
        this.f28997d = interfaceC2838Wc;
        this.f28996c = interfaceC2821Vc;
    }

    public J3.a a(Object obj) {
        C3320hg c3320hg = new C3320hg();
        C2753Rc f6 = ((c7.m) this.f28998e).f();
        t2.C.k("callJs > getEngine: Promise created");
        f6.p(new C2518Df(this, f6, obj, c3320hg), new C2881Yl(f6, this, c3320hg));
        return c3320hg;
    }

    @Override // com.google.android.gms.internal.ads.CD
    public final J3.a b(Object obj) {
        J3.a l9;
        OD c4;
        switch (this.f28994a) {
            case 0:
                return a(obj);
            case 1:
                MotionEvent motionEvent = (MotionEvent) this.f28998e;
                C2657Li c2657Li = (C2657Li) this.f28996c;
                c2657Li.getClass();
                int intValue = ((Integer) obj).intValue();
                Uri.Builder builder = (Uri.Builder) this.f28997d;
                if (intValue != 1) {
                    builder.appendQueryParameter((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.Eb), "10");
                    return C3686oN.c(builder.toString());
                }
                Uri.Builder buildUpon = builder.build().buildUpon();
                C3151ea c3151ea = AbstractC3368ia.Fb;
                q2.r rVar = q2.r.f40116e;
                buildUpon.appendQueryParameter((String) rVar.f40119c.a(c3151ea), "1");
                C3151ea c3151ea2 = AbstractC3368ia.Eb;
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
                buildUpon.appendQueryParameter((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2), "12");
                if (((String) this.f28995b).contains((CharSequence) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Gb))) {
                    buildUpon.authority((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Hb));
                }
                Uri build = buildUpon.build();
                C3383iq c3383iq = c2657Li.f26192c;
                c3383iq.getClass();
                try {
                    C4804d c4804d = c3383iq.f32008a;
                    Objects.requireNonNull(c4804d);
                    l9 = c4804d.d(build, motionEvent);
                } catch (Exception e6) {
                    l9 = C3686oN.l(e6);
                }
                return C3686oN.y(JD.s(l9), new C3907sc(2, builder), c2657Li.f26195f);
            case 2:
                C2946an c2946an = (C2946an) this.f28996c;
                c2946an.getClass();
                C2837Wb c2837Wb = p2.j.f39798C.f39804d;
                InterfaceC3858rh g9 = C2837Wb.g(c2946an.f29304e, new W2.b(0, 0, 0), c2946an.f29300a, c2946an.f29302c, c2946an.f29305f, null, c2946an.f29311m, c2946an.f29314p, null, null, null, c2946an.f29315q, "native-omid", c2946an.f29303d, false, false);
                W8 w82 = new W8(g9);
                g9.j0().f25412z = new C3562m7(19, w82);
                g9.loadData(Base64.encodeToString(((String) this.f28995b).getBytes(), 1), "text/html", "base64");
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ff)).booleanValue()) {
                    C4072vf c4072vf = (C4072vf) this.f28997d;
                    if (c4072vf != null) {
                        g9.j0().f25397R = c4072vf;
                    }
                    g9.j0().f25395P = (C4856a) this.f28998e;
                }
                return w82;
            case 3:
                return C3686oN.y(((InterfaceC2528Dp) this.f28997d).c((C2687Ne) this.f28998e), (CD) this.f28995b, (C3157eg) ((C4017ue) this.f28996c).f34630u);
            case 4:
                C3113dr c3113dr = (C3113dr) this.f28996c;
                Vu f6 = Vu.f(c3113dr.f30246j, 12);
                Ut ut = (Ut) this.f28997d;
                f6.p0(ut.f28114E);
                f6.a();
                InterfaceC3436jq interfaceC3436jq = (InterfaceC3436jq) this.f28995b;
                C2953au c2953au = (C2953au) this.f28998e;
                J3.a w9 = C3686oN.w(interfaceC3436jq.a(c2953au, ut), ut.f28131R, TimeUnit.MILLISECONDS, c3113dr.f30243f);
                c3113dr.f30245h.b(c2953au, ut, w9, c3113dr.f30240c);
                PA.Q(w9, c3113dr.f30247k, f6, false);
                return w9;
            case 5:
                C3173ew c3173ew = (C3173ew) this.f28996c;
                C2478Aq c2478Aq = (C2478Aq) this.f28997d;
                C4017ue c4017ue = (C4017ue) this.f28998e;
                C3870rt c3870rt = (C3870rt) this.f28995b;
                C4141wu c4141wu = (C4141wu) obj;
                synchronized (c3173ew) {
                    try {
                        c3173ew.f30555b = true;
                        c4141wu.f35085a = (InterfaceC3592mk) ((C3761pr) c2478Aq.f23905u).f33523u;
                        if (c3173ew.f30554a) {
                            c4 = C3686oN.c(new Cu(c4141wu, c3870rt));
                        } else {
                            c4017ue.q(c3870rt.f34136g, c4141wu);
                            c4 = OD.f26665u;
                        }
                    } finally {
                    }
                }
                return c4;
            case 6:
                return ((Ny) ((Zx) this.f28996c).f29116b.f27454f.get()).f((Context) this.f28997d, (View) this.f28998e, (Activity) this.f28995b);
            default:
                return ((Ny) ((Zx) this.f28996c).f29116b.f27454f.get()).g((Context) this.f28997d, (String) this.f28995b, (View) this.f28998e);
        }
    }

    public /* synthetic */ C2889Zc(C2946an c2946an, String str, C4072vf c4072vf, C4856a c4856a) {
        this.f28994a = 2;
        this.f28996c = c2946an;
        this.f28995b = str;
        this.f28997d = c4072vf;
        this.f28998e = c4856a;
    }

    public /* synthetic */ C2889Zc(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f28994a = i;
        this.f28996c = obj;
        this.f28997d = obj2;
        this.f28998e = obj3;
        this.f28995b = obj4;
    }

    public /* synthetic */ C2889Zc(Object obj, Object obj2, String str, Object obj3, int i) {
        this.f28994a = i;
        this.f28996c = obj;
        this.f28997d = obj2;
        this.f28995b = str;
        this.f28998e = obj3;
    }
}
