package u0;

import e1.C0312c;
import e1.InterfaceC0313d;
import e1.InterfaceC0314e;

/* loaded from: classes.dex */
public final class f implements InterfaceC0313d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f10481a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final C0312c f10482b = C0312c.a("requestTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final C0312c f10483c = C0312c.a("requestUptimeMs");

    /* renamed from: d, reason: collision with root package name */
    public static final C0312c f10484d = C0312c.a("clientInfo");

    /* renamed from: e, reason: collision with root package name */
    public static final C0312c f10485e = C0312c.a("logSource");
    public static final C0312c f = C0312c.a("logSourceName");

    /* renamed from: g, reason: collision with root package name */
    public static final C0312c f10486g = C0312c.a("logEvent");

    /* renamed from: h, reason: collision with root package name */
    public static final C0312c f10487h = C0312c.a("qosTier");

    @Override // e1.InterfaceC0310a
    public final void a(Object obj, Object obj2) {
        InterfaceC0314e interfaceC0314e = (InterfaceC0314e) obj2;
        l lVar = (l) ((s) obj);
        interfaceC0314e.a(f10482b, lVar.f10510a);
        interfaceC0314e.a(f10483c, lVar.f10511b);
        interfaceC0314e.d(f10484d, lVar.f10512c);
        interfaceC0314e.d(f10485e, lVar.f10513d);
        interfaceC0314e.d(f, lVar.f10514e);
        interfaceC0314e.d(f10486g, lVar.f);
        interfaceC0314e.d(f10487h, w.f10524a);
    }
}
