package a1;

import a2.C0172a;
import d1.C0358e;

/* loaded from: classes.dex */
public final class d implements X1.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f3051a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final X1.c f3052b = new X1.c("logSource", C4.p.n(C4.p.m(a2.e.class, new C0172a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final X1.c f3053c = new X1.c("logEventDropped", C4.p.n(C4.p.m(a2.e.class, new C0172a(2))));

    @Override // X1.a
    public final void a(Object obj, Object obj2) {
        C0358e c0358e = (C0358e) obj;
        X1.e eVar = (X1.e) obj2;
        eVar.e(f3052b, c0358e.f4644a);
        eVar.e(f3053c, c0358e.f4645b);
    }
}
