package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.jh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0281jh extends N5 {
    public final Y4 b;
    public final InterfaceC0255ih c;
    public final D3 d;

    public C0281jh(Y4 y4, InterfaceC0255ih interfaceC0255ih) {
        this(y4, interfaceC0255ih, new D3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C0333lh load(M5 m5) {
        C0333lh c0333lh = (C0333lh) super.load(m5);
        c0333lh.m = ((C0204gh) m5.componentArguments).f1273a;
        c0333lh.r = this.b.t.a();
        c0333lh.w = this.b.q.a();
        C0204gh c0204gh = (C0204gh) m5.componentArguments;
        c0333lh.d = c0204gh.b;
        c0333lh.e = c0204gh.c;
        c0333lh.f = c0204gh.d;
        c0333lh.i = c0204gh.e;
        c0333lh.g = c0204gh.f;
        c0333lh.h = c0204gh.g;
        Boolean valueOf = Boolean.valueOf(c0204gh.h);
        InterfaceC0255ih interfaceC0255ih = this.c;
        c0333lh.j = valueOf;
        c0333lh.k = interfaceC0255ih;
        C0204gh c0204gh2 = (C0204gh) m5.componentArguments;
        c0333lh.v = c0204gh2.j;
        C0209gm c0209gm = m5.f949a;
        C0345m4 c0345m4 = c0209gm.n;
        c0333lh.n = c0345m4.f1369a;
        C0654ye c0654ye = c0209gm.s;
        if (c0654ye != null) {
            c0333lh.s = c0654ye.f1584a;
            c0333lh.t = c0654ye.b;
        }
        c0333lh.o = c0345m4.b;
        c0333lh.q = c0209gm.e;
        c0333lh.p = c0209gm.k;
        D3 d3 = this.d;
        Map<String, String> map = c0204gh2.i;
        A3 f = C0401oa.I.f();
        d3.getClass();
        c0333lh.u = D3.a(map, c0209gm, f);
        c0333lh.x = this.b.v.e.keySet();
        return c0333lh;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C0333lh(this.b);
    }

    public C0281jh(Y4 y4, InterfaceC0255ih interfaceC0255ih, D3 d3) {
        super(y4.getContext(), y4.b().c());
        this.b = y4;
        this.c = interfaceC0255ih;
        this.d = d3;
    }

    public final C0333lh a() {
        return new C0333lh(this.b);
    }
}
