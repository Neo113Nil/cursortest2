package f0;

import T.C0097o;
import W.InterfaceC0113f;
import W.J;
import g0.p;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import q0.C1353B;
import q0.C1355D;
import q0.C1356E;
import q0.C1357F;
import q0.C1358G;
import q0.C1377t;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f8491a;

    /* renamed from: b, reason: collision with root package name */
    public final C1353B f8492b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f8493c;

    public /* synthetic */ e(CopyOnWriteArrayList copyOnWriteArrayList, int i4, C1353B c1353b) {
        this.f8493c = copyOnWriteArrayList;
        this.f8491a = i4;
        this.f8492b = c1353b;
    }

    public void a(InterfaceC0113f interfaceC0113f) {
        Iterator it = this.f8493c.iterator();
        while (it.hasNext()) {
            C1358G c1358g = (C1358G) it.next();
            J.Q(c1358g.f14830a, new p(interfaceC0113f, 11, c1358g.f14831b));
        }
    }

    public void b(int i4, C0097o c0097o, int i5, Object obj, long j4) {
        a(new R1.k(this, 7, new n0.g(1, i4, c0097o, i5, obj, J.Z(j4), -9223372036854775807L)));
    }

    public void c(C1377t c1377t, int i4, int i5, C0097o c0097o, int i6, Object obj, long j4, long j5) {
        a(new C1356E(this, c1377t, new n0.g(i4, i5, c0097o, i6, obj, J.Z(j4), J.Z(j5)), 1));
    }

    public void d(C1377t c1377t, int i4) {
        e(c1377t, i4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void e(C1377t c1377t, int i4, int i5, C0097o c0097o, int i6, Object obj, long j4, long j5) {
        a(new C1356E(this, c1377t, new n0.g(i4, i5, c0097o, i6, obj, J.Z(j4), J.Z(j5)), 0));
    }

    public void f(C1377t c1377t, int i4, int i5, C0097o c0097o, int i6, Object obj, long j4, long j5, IOException iOException, boolean z) {
        a(new C1357F(this, c1377t, new n0.g(i4, i5, c0097o, i6, obj, J.Z(j4), J.Z(j5)), iOException, z));
    }

    public void g(C1377t c1377t, int i4, IOException iOException, boolean z) {
        f(c1377t, i4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void h(C1377t c1377t, int i4, int i5, C0097o c0097o, int i6, Object obj, long j4, long j5, int i7) {
        a(new C1355D(this, c1377t, new n0.g(i4, i5, c0097o, i6, obj, J.Z(j4), J.Z(j5)), i7));
    }

    public void i(int i4, long j4, long j5) {
        n0.g gVar = new n0.g(1, i4, null, 3, null, J.Z(j4), J.Z(j5));
        C1353B c1353b = this.f8492b;
        c1353b.getClass();
        a(new Q1.b(this, c1353b, gVar, 6));
    }
}
