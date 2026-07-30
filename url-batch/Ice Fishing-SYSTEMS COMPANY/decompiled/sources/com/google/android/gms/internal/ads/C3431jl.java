package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import q2.C4907p;

/* renamed from: com.google.android.gms.internal.ads.jl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3431jl implements InterfaceC3701ol, LD, k2.q, Gu, InterfaceC2821Vc, InterfaceC2838Wc, InterfaceC2505Cj {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32190n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32184u = new C3431jl(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32185v = new C3431jl(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32186w = new C3431jl(3);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32187x = new C3431jl(4);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32188y = new C3431jl(5);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32189z = new C3431jl(6);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32167A = new C3431jl(7);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32168B = new C3431jl(8);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32169C = new C3431jl(9);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32170D = new C3431jl(10);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32171E = new C3431jl(11);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32172F = new C3431jl(12);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32173G = new C3431jl(13);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32174H = new C3431jl(14);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32175I = new C3431jl(15);
    public static final /* synthetic */ C3431jl J = new C3431jl(16);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32176K = new C3431jl(17);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32177L = new C3431jl(18);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32178M = new C3431jl(19);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32179N = new C3431jl(23);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32180O = new C3431jl(24);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32181P = new C3431jl(25);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32182Q = new C3431jl(26);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ C3431jl f32183R = new C3431jl(29);

    public /* synthetic */ C3431jl(int i) {
        this.f32190n = i;
    }

    public static boolean f(Context context) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31685h6)).booleanValue()) {
            Boolean bool = (Boolean) p(new C3314ha(context, 3));
            return bool != null && bool.booleanValue();
        }
        int i = t2.C.f40822b;
        u2.i.f("Omid flag is disabled");
        return false;
    }

    public static String g() {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31685h6)).booleanValue()) {
            return "a.1.5.2-google_20241009";
        }
        return null;
    }

    public static C3330hq h(int i, int i4, WebView webView, String str, String str2, String str3) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31685h6)).booleanValue() && AbstractC2655Lg.f26175K.f26640u) {
            return (C3330hq) p(new C3112dq(i4, i, webView, str, str2, str3));
        }
        return null;
    }

    public static void i(Wv wv) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31685h6)).booleanValue() && AbstractC2655Lg.f26175K.f26640u) {
            r(new RunnableC3058cq(wv, 0));
        }
    }

    public static void j(Wv wv, View view) {
        r(new RunnableC3167eq(wv, view, 1));
    }

    public static final Set k(C3650no c3650no, Executor executor) {
        return ((Boolean) AbstractC2666Ma.f26351a.r()).booleanValue() ? Collections.singleton(new C2473Al(c3650no, executor)) : Collections.EMPTY_SET;
    }

    public static EnumC3010bw m(String str) {
        return com.anythink.expressad.foundation.g.a.f.f19277a.equals(str) ? EnumC3010bw.NATIVE : "javascript".equals(str) ? EnumC3010bw.JAVASCRIPT : EnumC3010bw.NONE;
    }

    public static Zv n(String str) {
        char c4;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c4 = 0;
            }
            c4 = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c4 = 2;
            }
            c4 = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c4 = 1;
            }
            c4 = 65535;
        }
        return c4 != 0 ? c4 != 1 ? c4 != 2 ? Zv.UNSPECIFIED : Zv.ONE_PIXEL : Zv.DEFINED_BY_JAVASCRIPT : Zv.BEGIN_TO_RENDER;
    }

    public static Xv o(String str) {
        char c4;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c4 = 0;
            }
            c4 = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c4 = 1;
            }
            c4 = 65535;
        } else {
            if (str.equals(com.anythink.basead.exoplayer.k.o.f8601a)) {
                c4 = 2;
            }
            c4 = 65535;
        }
        if (c4 == 0) {
            return Xv.HTML_DISPLAY;
        }
        if (c4 == 1) {
            return Xv.NATIVE_DISPLAY;
        }
        if (c4 != 2) {
            return null;
        }
        return Xv.VIDEO;
    }

    public static final Object p(InterfaceC3222fq interfaceC3222fq) {
        try {
            return interfaceC3222fq.a();
        } catch (RuntimeException e6) {
            p2.j.f39798C.f39808h.e("omid exception", e6);
            return null;
        }
    }

    public static final void r(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e6) {
            p2.j.f39798C.f39808h.e("omid exception", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Cj, com.google.android.gms.internal.ads.InterfaceC3404jB
    public /* synthetic */ q2.A0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3701ol, com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public void mo2b(Object obj) {
        switch (this.f32190n) {
            case 0:
                ((InterfaceC3539ll) obj).q();
                break;
            case 1:
                ((InterfaceC3647nl) obj).a();
                break;
            case 2:
                ((InterfaceC3970tl) obj).E("MalformedJson");
                break;
            case 3:
                ((InterfaceC3970tl) obj).c();
                break;
            case 4:
                ((InterfaceC3970tl) obj).f();
                break;
            case 5:
                ((InterfaceC4024ul) obj).e();
                break;
            case 6:
                ((InterfaceC4024ul) obj).g();
                break;
            case 7:
                ((InterfaceC4132wl) obj).z();
                break;
            case 8:
                ((InterfaceC4132wl) obj).a();
                break;
            case 9:
                ((InterfaceC4294zl) obj).l();
                break;
            case 10:
                ((InterfaceC2524Dl) obj).L();
                break;
            case 11:
                ((InterfaceC2524Dl) obj).C();
                break;
            case 12:
                C2558Fl c2558Fl = (C2558Fl) obj;
                if (!c2558Fl.f25012d) {
                    c2558Fl.f25010b.a(c2558Fl.f25009a, c2558Fl.f25011c);
                    c2558Fl.f25012d = true;
                    break;
                }
                break;
            case 13:
                ((InterfaceC3530lc) obj).x();
                break;
            case 14:
                ((InterfaceC3530lc) obj).a();
                break;
            case 15:
                ((k2.u) obj).onVideoEnd();
                break;
            case 16:
                ((k2.u) obj).onVideoStart();
                break;
            case 17:
                ((k2.u) obj).onVideoPlay();
                break;
            case 18:
                ((k2.u) obj).onVideoStart();
                break;
            default:
                ((k2.u) obj).onVideoPause();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2821Vc
    public /* synthetic */ Object c(JSONObject jSONObject) {
        return new C2704Oe(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2838Wc
    public JSONObject l(Object obj) {
        C2596Hp c2596Hp = (C2596Hp) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Da)).booleanValue()) {
            C2704Oe c2704Oe = c2596Hp.f25426c;
            jSONObject2.put("ad_request_url", c2704Oe.f26711f);
            jSONObject2.put("ad_request_post_body", c2704Oe.f26708c);
        }
        C2704Oe c2704Oe2 = c2596Hp.f25426c;
        jSONObject2.put("base_url", c2704Oe2.f26707b);
        jSONObject2.put("signals", c2596Hp.f25425b);
        C2664Lp c2664Lp = c2596Hp.f25424a;
        jSONObject3.put("body", c2664Lp.f26224c);
        jSONObject3.put("headers", C4907p.f40108g.f40109a.l(c2664Lp.f26223b));
        jSONObject3.put("response_code", c2664Lp.f26222a);
        jSONObject3.put("latency", c2664Lp.f26225d);
        jSONObject.put(com.anythink.core.common.m.b.g.f14683j, jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", c2704Oe2.f26713h);
        return jSONObject;
    }

    @Override // k2.q
    public /* synthetic */ void onUserEarnedReward(F2.b bVar) {
        int i = this.f32190n;
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public /* synthetic */ void mo7l(Object obj) {
        ((InterfaceC3858rh) obj).destroy();
    }

    @Override // com.google.android.gms.internal.ads.Gu
    public /* synthetic */ Object b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        t2.C.k("Ad request signals:");
        t2.C.k(jSONObject.toString(2));
        return jSONObject;
    }

    private final /* synthetic */ void d(F2.b bVar) {
    }

    private final /* synthetic */ void e(F2.b bVar) {
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
    }
}
