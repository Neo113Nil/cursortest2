package D0;

import t1.C0656c;
import t1.InterfaceC0657d;
import t1.InterfaceC0658e;
import w1.C0713a;

/* loaded from: classes.dex */
public final class a implements InterfaceC0657d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f309a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final C0656c f310b = new C0656c("window", C1.c.j(C1.c.i(w1.e.class, new C0713a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final C0656c f311c = new C0656c("logSourceMetrics", C1.c.j(C1.c.i(w1.e.class, new C0713a(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final C0656c f312d = new C0656c("globalMetrics", C1.c.j(C1.c.i(w1.e.class, new C0713a(3))));

    /* renamed from: e, reason: collision with root package name */
    public static final C0656c f313e = new C0656c("appNamespace", C1.c.j(C1.c.i(w1.e.class, new C0713a(4))));

    @Override // t1.InterfaceC0654a
    public final void a(Object obj, Object obj2) {
        G0.a aVar = (G0.a) obj;
        InterfaceC0658e interfaceC0658e = (InterfaceC0658e) obj2;
        interfaceC0658e.a(f310b, aVar.f810a);
        interfaceC0658e.a(f311c, aVar.f811b);
        interfaceC0658e.a(f312d, aVar.f812c);
        interfaceC0658e.a(f313e, aVar.f813d);
    }
}
