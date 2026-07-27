package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.nh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0853nh extends T5 {

    /* renamed from: b, reason: collision with root package name */
    public final C0608e5 f8868b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0827mh f8869c;

    /* renamed from: d, reason: collision with root package name */
    public final K3 f8870d;

    public C0853nh(C0608e5 c0608e5, InterfaceC0827mh interfaceC0827mh) {
        this(c0608e5, interfaceC0827mh, new K3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.T5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C0905ph load(S5 s5) {
        C0905ph c0905ph = (C0905ph) super.load(s5);
        c0905ph.f9016m = ((C0775kh) s5.componentArguments).f8622a;
        c0905ph.f9021r = this.f8868b.f8104t.a();
        c0905ph.f9026w = this.f8868b.f8101q.a();
        C0775kh c0775kh = (C0775kh) s5.componentArguments;
        c0905ph.f9007d = c0775kh.f8623b;
        c0905ph.f9008e = c0775kh.f8624c;
        c0905ph.f9009f = c0775kh.f8625d;
        c0905ph.f9012i = c0775kh.f8626e;
        c0905ph.f9010g = c0775kh.f8627f;
        c0905ph.f9011h = c0775kh.f8628g;
        Boolean valueOf = Boolean.valueOf(c0775kh.f8629h);
        InterfaceC0827mh interfaceC0827mh = this.f8869c;
        c0905ph.f9013j = valueOf;
        c0905ph.f9014k = interfaceC0827mh;
        C0775kh c0775kh2 = (C0775kh) s5.componentArguments;
        c0905ph.f9025v = c0775kh2.f8631j;
        C0754jm c0754jm = s5.f7418a;
        C0969s4 c0969s4 = c0754jm.f8572n;
        c0905ph.f9017n = c0969s4.f9228a;
        De de = c0754jm.f8577s;
        if (de != null) {
            c0905ph.f9022s = de.f6683a;
            c0905ph.f9023t = de.f6684b;
        }
        c0905ph.f9018o = c0969s4.f9229b;
        c0905ph.f9020q = c0754jm.f8563e;
        c0905ph.f9019p = c0754jm.f8569k;
        K3 k3 = this.f8870d;
        Map<String, String> map = c0775kh2.f8630i;
        H3 f3 = C1027ua.f9366H.f();
        k3.getClass();
        c0905ph.f9024u = K3.a(map, c0754jm, f3);
        c0905ph.f9027x = this.f8868b.f8106v.f9566e.keySet();
        return c0905ph;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C0905ph(this.f8868b);
    }

    public C0853nh(C0608e5 c0608e5, InterfaceC0827mh interfaceC0827mh, K3 k3) {
        super(c0608e5.getContext(), c0608e5.b().c());
        this.f8868b = c0608e5;
        this.f8869c = interfaceC0827mh;
        this.f8870d = k3;
    }

    public final C0905ph a() {
        return new C0905ph(this.f8868b);
    }
}
