package q0;

import T.C0097o;
import java.io.IOException;
import java.util.Objects;

/* renamed from: q0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1368j implements H, f0.f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15029a;

    /* renamed from: b, reason: collision with root package name */
    public f0.e f15030b;

    /* renamed from: c, reason: collision with root package name */
    public f0.e f15031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1370l f15032d;

    public C1368j(AbstractC1370l abstractC1370l, Object obj) {
        this.f15032d = abstractC1370l;
        this.f15030b = abstractC1370l.a(null);
        this.f15031c = new f0.e(abstractC1370l.f14948d.f8493c, 0, null);
        this.f15029a = obj;
    }

    @Override // q0.H
    public final void a(int i4, C1353B c1353b, n0.g gVar) {
        if (g(i4, c1353b)) {
            f0.e eVar = this.f15030b;
            n0.g h2 = h(gVar, c1353b);
            C1353B c1353b2 = eVar.f8492b;
            c1353b2.getClass();
            eVar.a(new Q1.b(eVar, c1353b2, h2, 6));
        }
    }

    @Override // q0.H
    public final void b(int i4, C1353B c1353b, n0.g gVar) {
        if (g(i4, c1353b)) {
            f0.e eVar = this.f15030b;
            n0.g h2 = h(gVar, c1353b);
            eVar.getClass();
            eVar.a(new R1.k(eVar, 7, h2));
        }
    }

    @Override // q0.H
    public final void c(int i4, C1353B c1353b, C1377t c1377t, n0.g gVar, int i5) {
        if (g(i4, c1353b)) {
            f0.e eVar = this.f15030b;
            n0.g h2 = h(gVar, c1353b);
            eVar.getClass();
            eVar.a(new C1355D(eVar, c1377t, h2, i5));
        }
    }

    @Override // q0.H
    public final void d(int i4, C1353B c1353b, C1377t c1377t, n0.g gVar) {
        if (g(i4, c1353b)) {
            f0.e eVar = this.f15030b;
            n0.g h2 = h(gVar, c1353b);
            eVar.getClass();
            eVar.a(new C1356E(eVar, c1377t, h2, 1));
        }
    }

    @Override // q0.H
    public final void e(int i4, C1353B c1353b, C1377t c1377t, n0.g gVar, IOException iOException, boolean z) {
        if (g(i4, c1353b)) {
            f0.e eVar = this.f15030b;
            n0.g h2 = h(gVar, c1353b);
            eVar.getClass();
            eVar.a(new C1357F(eVar, c1377t, h2, iOException, z));
        }
    }

    @Override // q0.H
    public final void f(int i4, C1353B c1353b, C1377t c1377t, n0.g gVar) {
        if (g(i4, c1353b)) {
            f0.e eVar = this.f15030b;
            n0.g h2 = h(gVar, c1353b);
            eVar.getClass();
            eVar.a(new C1356E(eVar, c1377t, h2, 0));
        }
    }

    public final boolean g(int i4, C1353B c1353b) {
        C1353B c1353b2;
        Object obj = this.f15029a;
        AbstractC1370l abstractC1370l = this.f15032d;
        if (c1353b != null) {
            c1353b2 = abstractC1370l.x(obj, c1353b);
            if (c1353b2 == null) {
                return false;
            }
        } else {
            c1353b2 = null;
        }
        int z = abstractC1370l.z(i4, obj);
        f0.e eVar = this.f15030b;
        if (eVar.f8491a != z || !Objects.equals(eVar.f8492b, c1353b2)) {
            this.f15030b = new f0.e(abstractC1370l.f14947c.f8493c, z, c1353b2);
        }
        f0.e eVar2 = this.f15031c;
        if (eVar2.f8491a == z && Objects.equals(eVar2.f8492b, c1353b2)) {
            return true;
        }
        this.f15031c = new f0.e(abstractC1370l.f14948d.f8493c, z, c1353b2);
        return true;
    }

    public final n0.g h(n0.g gVar, C1353B c1353b) {
        long j4 = gVar.f14561d;
        AbstractC1370l abstractC1370l = this.f15032d;
        Object obj = this.f15029a;
        long y4 = abstractC1370l.y(j4, obj);
        long j5 = gVar.f14562e;
        long y5 = abstractC1370l.y(j5, obj);
        return (y4 == j4 && y5 == j5) ? gVar : new n0.g(gVar.f14558a, gVar.f14559b, (C0097o) gVar.f14563f, gVar.f14560c, gVar.f14564g, y4, y5);
    }
}
