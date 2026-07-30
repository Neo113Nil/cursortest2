package a0;

import android.content.ClipDescription;
import android.os.CancellationSignal;
import c7.m1;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.q2;
import d0.r2;
import d0.u3;
import g0.m2;
import g0.q1;
import g0.t1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import l.k1;
import l.l1;
import l.n1;
import l.o1;
import l.p1;
import s1.l2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f196g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f197h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f198i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, int i7, Object obj2) {
        super(1);
        this.f196g = i7;
        this.f197h = obj;
        this.f198i = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x0523  */
    @Override // q6.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj) {
        w.j0 j0Var;
        boolean z8;
        s1.b1 b1Var;
        d6.z zVar;
        l.a0 a0Var;
        int i7 = 3;
        int i8 = 2;
        int i9 = 1;
        int i10 = 0;
        switch (this.f196g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                l1.v vVar = (l1.v) obj;
                b6.c cVar = (b6.c) this.f197h;
                long j8 = vVar.f5832c;
                s sVar = (s) this.f198i;
                x0 x0Var = (x0) cVar.f1394g;
                if (!x0Var.h() || x0Var.j().f4065a.f373f.length() == 0 || (j0Var = x0Var.f178d) == null || j0Var.d() == null) {
                    i9 = 0;
                } else {
                    cVar.D(x0Var.j(), j8, false, sVar);
                }
                if (i9 != 0) {
                    vVar.a();
                }
                return d6.z.f2639a;
            case 1:
                n.e eVar = (n.e) obj;
                x0 x0Var2 = (x0) this.f197h;
                g0.g1 g1Var = x0Var2.f184j;
                boolean b9 = a2.j0.b(x0Var2.j().f4066b);
                n.j jVar = (n.j) this.f198i;
                n.e.b(eVar, new w.i(1), !b9 && ((Boolean) g1Var.getValue()).booleanValue(), new a1(jVar, x0Var2, i10));
                n.e.b(eVar, new w.i(2), !b9, new a1(jVar, x0Var2, i9));
                if (((Boolean) g1Var.getValue()).booleanValue() && (b1Var = x0Var2.f180f) != null) {
                    ClipDescription primaryClipDescription = ((s1.h) b1Var).f8238a.getPrimaryClipDescription();
                    if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                        z8 = true;
                        n.e.b(eVar, new w.i(3), z8, new a1(jVar, x0Var2, i8));
                        n.e.b(eVar, new w.i(4), a2.j0.c(x0Var2.j().f4066b) != x0Var2.j().f4065a.f373f.length(), new a1(jVar, x0Var2, i7));
                        return d6.z.f2639a;
                    }
                }
                z8 = false;
                n.e.b(eVar, new w.i(3), z8, new a1(jVar, x0Var2, i8));
                n.e.b(eVar, new w.i(4), a2.j0.c(x0Var2.j().f4066b) != x0Var2.j().f4065a.f373f.length(), new a1(jVar, x0Var2, i7));
                return d6.z.f2639a;
            case 2:
                ((CancellationSignal) this.f197h).cancel();
                ((m1) this.f198i).c(null);
                return d6.z.f2639a;
            case 3:
                r1.f0 f0Var = (r1.f0) obj;
                long j9 = ((y0.f) ((e0.j) this.f197h).get()).f9792a;
                float d8 = y0.f.d(j9);
                if (d8 > 0.0f) {
                    float y4 = f0Var.y(r2.f2358a);
                    b1.c cVar2 = f0Var.f7767f;
                    float y8 = f0Var.y(((q.h0) this.f198i).b(f0Var.getLayoutDirection())) - y4;
                    float f9 = 2;
                    float f10 = (y4 * f9) + d8 + y8;
                    m2.k layoutDirection = f0Var.getLayoutDirection();
                    int[] iArr = q2.f2327a;
                    float d9 = iArr[layoutDirection.ordinal()] == 1 ? y0.f.d(cVar2.d()) - f10 : y8 < 0.0f ? 0.0f : y8;
                    if (iArr[f0Var.getLayoutDirection().ordinal()] == 1) {
                        f10 = y0.f.d(cVar2.d()) - (y8 >= 0.0f ? y8 : 0.0f);
                    }
                    float f11 = f10;
                    float b10 = y0.f.b(j9);
                    float f12 = (-b10) / f9;
                    float f13 = b10 / f9;
                    b1.b bVar = cVar2.f1234g;
                    long p6 = bVar.p();
                    bVar.k().o();
                    try {
                        ((b1.b) ((b6.c) bVar.f1230g).f1394g).k().j(d9, f12, f11, f13, 0);
                        f0Var.b();
                    } finally {
                        m.s(bVar, p6);
                    }
                } else {
                    f0Var.b();
                }
                return d6.z.f2639a;
            case 4:
                ((e0.g) this.f197h).f2682a.setValue(new q.w((q.s0) this.f198i, (q.s0) obj));
                return d6.z.f2639a;
            case 5:
                z0.l0.m((b1.e) obj, (z0.j0) this.f197h, ((z0.u) ((u3) this.f198i).f2460a.get()).f10059a);
                return d6.z.f2639a;
            case 6:
                w0.c cVar3 = (w0.c) obj;
                return cVar3.b(new s1.l0(10, new y(((z0.p0) this.f197h).g(cVar3.f9477f.d(), cVar3.f9477f.getLayoutDirection(), cVar3), 5, (u3) this.f198i)));
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                g0.g gVar = (g0.g) this.f197h;
                Object obj2 = gVar.f3726g;
                g0.f fVar = (g0.f) this.f198i;
                synchronized (obj2) {
                    gVar.f3728i.remove(fVar);
                    if (gVar.f3728i.isEmpty()) {
                        gVar.f3730k.set(0);
                    }
                }
                return d6.z.f2639a;
            case 8:
                androidx.room.m mVar = (androidx.room.m) this.f197h;
                Object obj3 = mVar.f1094b;
                c7.h hVar = (c7.h) this.f198i;
                synchronized (obj3) {
                    ((ArrayList) mVar.f1095c).remove(hVar);
                }
                return d6.z.f2639a;
            case q.c.f7259c /* 9 */:
                Throwable th = (Throwable) obj;
                t1 t1Var = (t1) this.f197h;
                Object obj4 = t1Var.f3908b;
                Throwable th2 = (Throwable) this.f198i;
                synchronized (obj4) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th != null) {
                        try {
                            if (th instanceof CancellationException) {
                                th = null;
                            }
                            if (th != null) {
                                d6.a.a(th2, th);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    t1Var.f3910d = th2;
                    f7.q0 q0Var = t1Var.f3924r;
                    q1 q1Var = q1.f3860f;
                    q0Var.getClass();
                    q0Var.l(null, q1Var);
                }
                return d6.z.f2639a;
            case q.c.f7261e /* 10 */:
                ((g0.u) this.f197h).w(obj);
                i.b0 b0Var = (i.b0) this.f198i;
                if (b0Var != null) {
                    b0Var.a(obj);
                }
                return d6.z.f2639a;
            case 11:
                d6.z zVar2 = d6.z.f2639a;
                Throwable th4 = (Throwable) obj;
                ((c1.a) this.f197h).f(th4);
                e7.e eVar2 = (e7.e) ((g3.k) this.f198i).f4162i;
                eVar2.k(th4, false);
                do {
                    Object a3 = e7.l.a(eVar2.d());
                    if (a3 != null) {
                        c7.n nVar = ((g3.c0) a3).f4104b;
                        Throwable cancellationException = th4 == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th4;
                        nVar.getClass();
                        nVar.O(new c7.p(cancellationException, false));
                        zVar = zVar2;
                    } else {
                        zVar = null;
                    }
                } while (zVar != null);
                return zVar2;
            case 12:
                return ((c7.r) this.f197h).f(((List) this.f198i).get(((Number) obj).intValue()));
            case 13:
                return ((c7.r) this.f197h).f(((List) this.f198i).get(((Number) obj).intValue()));
            case 14:
                return ((c7.r) this.f197h).f(((List) this.f198i).get(((Number) obj).intValue()));
            case q.c.f7263g /* 15 */:
                p1.m0 m0Var = (p1.m0) obj;
                p1.n0 n0Var = (p1.n0) this.f197h;
                float e9 = ((k.v) this.f198i).f5276c.e();
                m0Var.getClass();
                long c4 = a8.m.c(0, 0);
                p1.m0.a(m0Var, n0Var);
                n0Var.j0(m2.h.c(c4, n0Var.f7067j), e9, null);
                return d6.z.f2639a;
            case 16:
                l1 l1Var = (l1) obj;
                i.x xVar = ((k.m) this.f197h).f5242d;
                m2 m2Var = (m2) xVar.e(l1Var.b());
                long j10 = m2Var != null ? ((m2.j) m2Var.getValue()).f6321a : 0L;
                m2 m2Var2 = (m2) xVar.e(l1Var.c());
                long j11 = m2Var2 != null ? ((m2.j) m2Var2.getValue()).f6321a : 0L;
                k.o0 o0Var = (k.o0) ((k.l) this.f198i).f5235b.getValue();
                return (o0Var == null || (a0Var = (l.a0) o0Var.f5253a.d(new m2.j(j10), new m2.j(j11))) == null) ? l.e.k(7, null) : a0Var;
            case 17:
                l.h0 h0Var = (l.h0) this.f197h;
                l.f0 f0Var2 = (l.f0) this.f198i;
                h0Var.f5500a.b(f0Var2);
                h0Var.f5501b.setValue(Boolean.TRUE);
                return new l.j0(h0Var, i10, f0Var2);
            case 18:
                c7.a0.p((h7.c) this.f197h, null, c7.y.f1759i, new c0.v((p1) this.f198i, null), 1);
                return new o1(0);
            case 19:
                p1 p1Var = (p1) this.f197h;
                p1 p1Var2 = (p1) this.f198i;
                p1Var.f5619j.add(p1Var2);
                return new l.j0(p1Var, i9, p1Var2);
            case 20:
                return new l.j0((p1) this.f197h, i8, (k1) this.f198i);
            case 21:
                p1 p1Var3 = (p1) this.f197h;
                n1 n1Var = (n1) this.f198i;
                p1Var3.f5618i.add(n1Var);
                return new l.j0(p1Var3, i7, n1Var);
            case 22:
                r1.f0 f0Var3 = (r1.f0) obj;
                f0Var3.b();
                b1.e.n(f0Var3, ((z0.g0) this.f197h).f9995a, (z0.p) this.f198i, 0.0f, null, 60);
                return d6.z.f2639a;
            case 23:
                r1.f0 f0Var4 = (r1.f0) obj;
                f0Var4.b();
                b1.e.n(f0Var4, (z0.j) this.f197h, (z0.p) this.f198i, 0.0f, null, 60);
                return d6.z.f2639a;
            case 24:
                ((p.j) this.f197h).c((p.h) this.f198i);
                return d6.z.f2639a;
            case 25:
                ((l1.i) this.f197h).f5811a.n((o.h) this.f198i);
                return d6.z.f2639a;
            case 26:
                m1.c cVar4 = (m1.c) this.f197h;
                m1.b bVar2 = cVar4.f6304b;
                m1.b bVar3 = cVar4.f6303a;
                a8.m.i(cVar4, (l1.v) obj);
                o.x0 x0Var3 = (o.x0) this.f198i;
                float a9 = ((l2) r1.f.i(x0Var3, s1.f1.f8228q)).a();
                long j12 = t6.a.j(a9, a9);
                if (m2.o.b(j12) <= 0.0f || m2.o.c(j12) <= 0.0f) {
                    a.a.M("maximumVelocity should be a positive value. You specified=" + ((Object) m2.o.f(j12)));
                    throw null;
                }
                long j13 = t6.a.j(bVar3.b(m2.o.b(j12)), bVar2.b(m2.o.c(j12)));
                e6.k.c0(0, r9.length, null, bVar3.f6298b);
                bVar3.f6299c = 0;
                e6.k.c0(0, r7.length, null, bVar2.f6298b);
                bVar2.f6299c = 0;
                cVar4.f6305c = 0L;
                e7.e eVar3 = x0Var3.f6796y;
                if (eVar3 != null) {
                    int i11 = o.g0.f6621a;
                    eVar3.e(new o.q(t6.a.j(Float.isNaN(m2.o.b(j13)) ? 0.0f : m2.o.b(j13), Float.isNaN(m2.o.c(j13)) ? 0.0f : m2.o.c(j13))));
                }
                return d6.z.f2639a;
            case 27:
                o.d1 d1Var = (o.d1) this.f197h;
                o.f1 f1Var = (o.f1) this.f198i;
                long j14 = ((o.o) obj).f6708a;
                long a10 = f1Var.f6612d == o.j0.f6658g ? y0.c.a(j14, 0.0f, 1) : y0.c.a(j14, 0.0f, 2);
                o.f1 f1Var2 = d1Var.f6593a;
                f1Var2.f6615g = 1;
                m.w0 w0Var = f1Var2.f6610b;
                if (w0Var == null || !(f1Var2.f6609a.d() || f1Var2.f6609a.a())) {
                    o.f1.a(f1Var2, f1Var2.f6616h, a10, 1);
                } else {
                    w0Var.a(a10, f1Var2.f6615g, f1Var2.f6618j);
                }
                return d6.z.f2639a;
            case 28:
                ((Number) obj).longValue();
                o.t1 t1Var2 = (o.t1) this.f197h;
                float f14 = t1Var2.f6752e;
                t1Var2.f6752e = 0.0f;
                ((q6.c) this.f198i).f(Float.valueOf(f14));
                return d6.z.f2639a;
            default:
                p2.v vVar2 = (p2.v) this.f197h;
                vVar2.setPositionProvider((p2.y) this.f198i);
                vVar2.l();
                return new p2.h();
        }
    }
}
