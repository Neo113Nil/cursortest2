package a1;

import a2.C0172a;
import d1.C0357d;

/* loaded from: classes.dex */
public final class c implements X1.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f3048a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final X1.c f3049b = new X1.c("eventsDroppedCount", C4.p.n(C4.p.m(a2.e.class, new C0172a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final X1.c f3050c = new X1.c("reason", C4.p.n(C4.p.m(a2.e.class, new C0172a(3))));

    @Override // X1.a
    public final void a(Object obj, Object obj2) {
        C0357d c0357d = (C0357d) obj;
        X1.e eVar = (X1.e) obj2;
        eVar.b(f3049b, c0357d.f4641a);
        eVar.e(f3050c, c0357d.f4642b);
    }
}
