package C0;

import t1.C0656c;
import t1.InterfaceC0657d;
import t1.InterfaceC0658e;

/* loaded from: classes.dex */
public final class f implements InterfaceC0657d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f140a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final C0656c f141b = C0656c.a("requestTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final C0656c f142c = C0656c.a("requestUptimeMs");

    /* renamed from: d, reason: collision with root package name */
    public static final C0656c f143d = C0656c.a("clientInfo");

    /* renamed from: e, reason: collision with root package name */
    public static final C0656c f144e = C0656c.a("logSource");

    /* renamed from: f, reason: collision with root package name */
    public static final C0656c f145f = C0656c.a("logSourceName");

    /* renamed from: g, reason: collision with root package name */
    public static final C0656c f146g = C0656c.a("logEvent");

    /* renamed from: h, reason: collision with root package name */
    public static final C0656c f147h = C0656c.a("qosTier");

    @Override // t1.InterfaceC0654a
    public final void a(Object obj, Object obj2) {
        InterfaceC0658e interfaceC0658e = (InterfaceC0658e) obj2;
        l lVar = (l) ((s) obj);
        interfaceC0658e.e(f141b, lVar.f172a);
        interfaceC0658e.e(f142c, lVar.f173b);
        interfaceC0658e.a(f143d, lVar.f174c);
        interfaceC0658e.a(f144e, lVar.f175d);
        interfaceC0658e.a(f145f, lVar.f176e);
        interfaceC0658e.a(f146g, lVar.f177f);
        interfaceC0658e.a(f147h, w.f187f);
    }
}
