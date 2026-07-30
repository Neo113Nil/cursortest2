package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.s7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3885s7 implements InterfaceC3065cx {

    /* renamed from: a, reason: collision with root package name */
    public final Fw f34198a;

    /* renamed from: b, reason: collision with root package name */
    public final C2518Df f34199b;

    /* renamed from: c, reason: collision with root package name */
    public final B7 f34200c;

    /* renamed from: d, reason: collision with root package name */
    public final C3831r7 f34201d;

    /* renamed from: e, reason: collision with root package name */
    public final C3562m7 f34202e;

    /* renamed from: f, reason: collision with root package name */
    public final D7 f34203f;

    /* renamed from: g, reason: collision with root package name */
    public final E0 f34204g;

    /* renamed from: h, reason: collision with root package name */
    public final Rx f34205h;

    public C3885s7(Fw fw, C2518Df c2518Df, B7 b72, C3831r7 c3831r7, C3562m7 c3562m7, D7 d72, E0 e02, Rx rx) {
        this.f34198a = fw;
        this.f34199b = c2518Df;
        this.f34200c = b72;
        this.f34201d = c3831r7;
        this.f34202e = c3562m7;
        this.f34203f = d72;
        this.f34204g = e02;
        this.f34205h = rx;
    }

    public final HashMap a() {
        long j9;
        HashMap hashMap = new HashMap();
        Fw fw = this.f34198a;
        h3.n nVar = (h3.n) this.f34199b.f24456x;
        D6 d62 = Jw.f25851a;
        if (nVar.i()) {
            d62 = (D6) nVar.g();
        }
        hashMap.put("v", fw.f25050a);
        hashMap.put("gms", Boolean.valueOf(fw.f25052c));
        hashMap.put("gv", Long.valueOf(d62.x0()));
        hashMap.put("int", d62.v0());
        hashMap.put("attts", Long.valueOf(d62.A0().B()));
        hashMap.put("att", d62.A0().D());
        hashMap.put("attkid", d62.A0().C());
        hashMap.put("up", Boolean.valueOf(this.f34201d.f33968a));
        hashMap.put("t", new Throwable());
        E0 e02 = this.f34204g;
        hashMap.put("tcq", Long.valueOf(e02.f24621a));
        hashMap.put("tpq", Long.valueOf(e02.f24622b));
        hashMap.put("tcv", Long.valueOf(e02.f24623c));
        hashMap.put("tpv", Long.valueOf(e02.f24624d));
        hashMap.put("tchv", Long.valueOf(e02.f24625e));
        hashMap.put("tphv", Long.valueOf(e02.f24626f));
        hashMap.put("tcc", Long.valueOf(e02.f24627g));
        hashMap.put("tpc", Long.valueOf(e02.f24628h));
        C3562m7 c3562m7 = this.f34202e;
        if (c3562m7 != null) {
            synchronized (C3562m7.class) {
                try {
                    NetworkCapabilities networkCapabilities = (NetworkCapabilities) c3562m7.f32668u;
                    if (networkCapabilities != null) {
                        if (networkCapabilities.hasTransport(4)) {
                            j9 = 2;
                        } else if (((NetworkCapabilities) c3562m7.f32668u).hasTransport(1)) {
                            j9 = 1;
                        } else if (((NetworkCapabilities) c3562m7.f32668u).hasTransport(0)) {
                            j9 = 0;
                        }
                    }
                    j9 = -1;
                } finally {
                }
            }
            hashMap.put(com.anythink.expressad.foundation.g.a.f19233W, Long.valueOf(j9));
        }
        D7 d72 = this.f34203f;
        hashMap.put("vs", Long.valueOf(d72.f24343d ? d72.f24341b - d72.f24340a : -1L));
        long j10 = d72.f24342c;
        d72.f24342c = -1L;
        hashMap.put("vf", Long.valueOf(j10));
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065cx
    public final HashMap c() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065cx
    public final HashMap d() {
        return a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065cx
    public final HashMap i() {
        HashMap a9 = a();
        Rx rx = this.f34205h;
        List list = (List) rx.f27448u;
        rx.f27448u = Collections.EMPTY_LIST;
        a9.put(com.anythink.expressad.foundation.d.d.f18715E, list);
        return a9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065cx
    public final HashMap o() {
        HashMap a9 = a();
        B7 b72 = this.f34200c;
        if (b72.f23989E <= -2) {
            WeakReference weakReference = b72.f23985A;
            if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                b72.f23989E = -3L;
            }
        }
        a9.put("lts", Long.valueOf(b72.f23989E));
        return a9;
    }
}
