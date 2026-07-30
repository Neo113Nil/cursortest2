package a1;

import a2.C0172a;
import d1.C0360g;

/* loaded from: classes.dex */
public final class g implements X1.d {

    /* renamed from: a, reason: collision with root package name */
    public static final g f3058a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final X1.c f3059b = new X1.c("startMs", C4.p.n(C4.p.m(a2.e.class, new C0172a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final X1.c f3060c = new X1.c("endMs", C4.p.n(C4.p.m(a2.e.class, new C0172a(2))));

    @Override // X1.a
    public final void a(Object obj, Object obj2) {
        C0360g c0360g = (C0360g) obj;
        X1.e eVar = (X1.e) obj2;
        eVar.b(f3059b, c0360g.f4648a);
        eVar.b(f3060c, c0360g.f4649b);
    }
}
