package D0;

import t1.C0656c;
import t1.InterfaceC0657d;
import t1.InterfaceC0658e;
import w1.C0713a;

/* loaded from: classes.dex */
public final class f implements InterfaceC0657d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f323a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final C0656c f324b = new C0656c("currentCacheSizeBytes", C1.c.j(C1.c.i(w1.e.class, new C0713a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final C0656c f325c = new C0656c("maxCacheSizeBytes", C1.c.j(C1.c.i(w1.e.class, new C0713a(2))));

    @Override // t1.InterfaceC0654a
    public final void a(Object obj, Object obj2) {
        G0.f fVar = (G0.f) obj;
        InterfaceC0658e interfaceC0658e = (InterfaceC0658e) obj2;
        interfaceC0658e.e(f324b, fVar.f829a);
        interfaceC0658e.e(f325c, fVar.f830b);
    }
}
