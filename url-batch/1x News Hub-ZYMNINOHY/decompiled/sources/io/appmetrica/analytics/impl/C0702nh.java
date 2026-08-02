package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.nh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0702nh extends T5 {

    /* renamed from: b, reason: collision with root package name */
    public final C0457e5 f7951b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0676mh f7952c;

    /* renamed from: d, reason: collision with root package name */
    public final K3 f7953d;

    public C0702nh(C0457e5 c0457e5, InterfaceC0676mh interfaceC0676mh) {
        this(c0457e5, interfaceC0676mh, new K3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.T5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C0754ph load(S5 s5) {
        C0754ph c0754ph = (C0754ph) super.load(s5);
        c0754ph.f8090m = ((C0624kh) s5.componentArguments).f7722a;
        c0754ph.f8094r = this.f7951b.f7242t.a();
        c0754ph.f8098w = this.f7951b.f7239q.a();
        C0624kh c0624kh = (C0624kh) s5.componentArguments;
        c0754ph.f8082d = c0624kh.f7723b;
        c0754ph.f8083e = c0624kh.f7724c;
        c0754ph.f = c0624kh.f7725d;
        c0754ph.f8086i = c0624kh.f7726e;
        c0754ph.f8084g = c0624kh.f;
        c0754ph.f8085h = c0624kh.f7727g;
        Boolean valueOf = Boolean.valueOf(c0624kh.f7728h);
        InterfaceC0676mh interfaceC0676mh = this.f7952c;
        c0754ph.f8087j = valueOf;
        c0754ph.f8088k = interfaceC0676mh;
        C0624kh c0624kh2 = (C0624kh) s5.componentArguments;
        c0754ph.v = c0624kh2.f7730j;
        C0603jm c0603jm = s5.f6596a;
        C0818s4 c0818s4 = c0603jm.f7675n;
        c0754ph.f8091n = c0818s4.f8289a;
        De de = c0603jm.f7679s;
        if (de != null) {
            c0754ph.f8095s = de.f5898a;
            c0754ph.f8096t = de.f5899b;
        }
        c0754ph.o = c0818s4.f8290b;
        c0754ph.f8093q = c0603jm.f7667e;
        c0754ph.f8092p = c0603jm.f7672k;
        K3 k3 = this.f7953d;
        Map<String, String> map = c0624kh2.f7729i;
        H3 f = C0876ua.f8420H.f();
        k3.getClass();
        c0754ph.f8097u = K3.a(map, c0603jm, f);
        c0754ph.f8099x = this.f7951b.v.f8610e.keySet();
        return c0754ph;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C0754ph(this.f7951b);
    }

    public C0702nh(C0457e5 c0457e5, InterfaceC0676mh interfaceC0676mh, K3 k3) {
        super(c0457e5.getContext(), c0457e5.b().c());
        this.f7951b = c0457e5;
        this.f7952c = interfaceC0676mh;
        this.f7953d = k3;
    }

    public final C0754ph a() {
        return new C0754ph(this.f7951b);
    }
}
