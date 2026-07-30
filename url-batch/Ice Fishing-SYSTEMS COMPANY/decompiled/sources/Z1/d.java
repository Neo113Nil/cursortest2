package Z1;

import D.y;

/* loaded from: classes.dex */
public final class d implements R3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f4209a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final R3.c f4210b = new R3.c("logSource", y.q(y.p(U3.e.class, new U3.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final R3.c f4211c = new R3.c("logEventDropped", y.q(y.p(U3.e.class, new U3.a(2))));

    @Override // R3.a
    public final void a(Object obj, Object obj2) {
        c2.e eVar = (c2.e) obj;
        R3.e eVar2 = (R3.e) obj2;
        eVar2.a(f4210b, eVar.f5704a);
        eVar2.a(f4211c, eVar.f5705b);
    }
}
