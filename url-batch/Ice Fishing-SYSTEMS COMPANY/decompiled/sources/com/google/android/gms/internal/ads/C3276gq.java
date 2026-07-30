package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONObject;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.gq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3276gq {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31104a;

    /* renamed from: b, reason: collision with root package name */
    public final C5107a f31105b;

    /* renamed from: c, reason: collision with root package name */
    public final Ut f31106c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3858rh f31107d;

    /* renamed from: e, reason: collision with root package name */
    public final C3165eo f31108e;

    /* renamed from: f, reason: collision with root package name */
    public C2955aw f31109f;

    public C3276gq(Context context, C5107a c5107a, Ut ut, InterfaceC3858rh interfaceC3858rh, C3165eo c3165eo) {
        this.f31104a = context;
        this.f31105b = c5107a;
        this.f31106c = ut;
        this.f31107d = interfaceC3858rh;
        this.f31108e = c3165eo;
    }

    public final synchronized boolean a() {
        InterfaceC3858rh interfaceC3858rh;
        Ut ut = this.f31106c;
        if (ut.f28133T) {
            C3151ea c3151ea = AbstractC3368ia.f31685h6;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.k6)).booleanValue() && (interfaceC3858rh = this.f31107d) != null) {
                    if (this.f31109f != null) {
                        int i = t2.C.f40822b;
                        u2.i.f("Omid javascript session service already started for ad.");
                        return false;
                    }
                    Context context = this.f31104a;
                    p2.j jVar = p2.j.f39798C;
                    jVar.f39823x.getClass();
                    if (!C3431jl.f(context)) {
                        int i4 = t2.C.f40822b;
                        u2.i.f("Unable to initialize omid.");
                        return false;
                    }
                    C3761pr c3761pr = ut.f28135V;
                    c3761pr.getClass();
                    if (((JSONObject) c3761pr.f33523u).optBoolean((String) rVar.f40119c.a(AbstractC3368ia.f31731m6), true)) {
                        C5107a c5107a = this.f31105b;
                        C3431jl c3431jl = jVar.f39823x;
                        WebView s3 = interfaceC3858rh.s();
                        c3431jl.getClass();
                        C2955aw c2955aw = (C2955aw) C3431jl.p(new C2593Hm(10, c5107a, s3));
                        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31722l6)).booleanValue()) {
                            C3165eo c3165eo = this.f31108e;
                            String str = c2955aw != null ? "1" : "0";
                            C2593Hm a9 = c3165eo.a();
                            a9.r("omid_js_session_success", str);
                            a9.s();
                        }
                        if (c2955aw == null) {
                            int i9 = t2.C.f40822b;
                            u2.i.f("Unable to create javascript session service.");
                            return false;
                        }
                        int i10 = t2.C.f40822b;
                        u2.i.e("Created omid javascript session service.");
                        this.f31109f = c2955aw;
                        interfaceC3858rh.f0(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void b() {
        InterfaceC3858rh interfaceC3858rh;
        try {
            C2955aw c2955aw = this.f31109f;
            if (c2955aw == null || (interfaceC3858rh = this.f31107d) == null) {
                return;
            }
            Iterator it = interfaceC3858rh.B().iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                p2.j.f39798C.f39823x.getClass();
                C3431jl.r(new RunnableC3329hp(2, c2955aw, view));
            }
            interfaceC3858rh.a("onSdkLoaded", C3944tC.f34377z);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        InterfaceC3858rh interfaceC3858rh;
        if (this.f31109f == null || (interfaceC3858rh = this.f31107d) == null) {
            return;
        }
        interfaceC3858rh.a("onSdkImpression", C3944tC.f34377z);
    }
}
