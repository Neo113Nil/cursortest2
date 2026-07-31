package u2;

import e2.InterfaceC0426e;

/* renamed from: u2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1151c {

    /* renamed from: a, reason: collision with root package name */
    public static final V1.d[] f9681a = new V1.d[0];

    /* renamed from: b, reason: collision with root package name */
    public static final m1.q f9682b = new m1.q("NULL", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final m1.q f9683c = new m1.q("UNINITIALIZED", 1);

    public static final Object a(V1.i iVar, Object obj, Object obj2, InterfaceC0426e interfaceC0426e, V1.d dVar) {
        Object h3;
        Object n3 = v2.a.n(iVar, obj2);
        try {
            C1146D c1146d = new C1146D(dVar, iVar);
            if (interfaceC0426e instanceof X1.a) {
                f2.x.d(2, interfaceC0426e);
                h3 = interfaceC0426e.h(obj, c1146d);
            } else {
                h3 = l0.c.Q(interfaceC0426e, obj, c1146d);
            }
            v2.a.i(iVar, n3);
            if (h3 == W1.a.f4608d) {
                f2.j.f(dVar, "frame");
            }
            return h3;
        } catch (Throwable th) {
            v2.a.i(iVar, n3);
            throw th;
        }
    }
}
