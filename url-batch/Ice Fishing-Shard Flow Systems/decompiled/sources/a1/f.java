package a1;

import a2.C0172a;
import d1.C0359f;

/* loaded from: classes.dex */
public final class f implements X1.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f3055a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final X1.c f3056b = new X1.c("currentCacheSizeBytes", C4.p.n(C4.p.m(a2.e.class, new C0172a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final X1.c f3057c = new X1.c("maxCacheSizeBytes", C4.p.n(C4.p.m(a2.e.class, new C0172a(2))));

    @Override // X1.a
    public final void a(Object obj, Object obj2) {
        C0359f c0359f = (C0359f) obj;
        X1.e eVar = (X1.e) obj2;
        eVar.b(f3056b, c0359f.f4646a);
        eVar.b(f3057c, c0359f.f4647b);
    }
}
