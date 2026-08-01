package j0;

import b0.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n0.i0;
import n0.s1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final d1.l f4878a = w0.d(m0.g.f6308d);

    public static final void a(final p1.b bVar, final d1.l lVar, final long j, i0 i0Var, final int i3) {
        int i10;
        d1.l lVar2;
        i0Var.X(-2142239481);
        if ((i3 & 6) == 0) {
            i10 = (i0Var.h(bVar) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= i0Var.f(null) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i10 |= i0Var.f(lVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i10 |= i0Var.e(j) ? 2048 : 1024;
        }
        boolean z10 = true;
        if (i0Var.O(i10 & 1, (i10 & 1171) != 1170)) {
            i0Var.T();
            if ((i3 & 1) != 0 && !i0Var.y()) {
                i0Var.R();
            }
            i0Var.q();
            if ((((i10 & 7168) ^ 3072) <= 2048 || !i0Var.e(j)) && (i10 & 3072) != 2048) {
                z10 = false;
            }
            Object L = i0Var.L();
            if (z10 || L == n0.k.f6729a) {
                k1.j jVar = k1.p.c(j, k1.p.g) ? null : new k1.j(5, j);
                i0Var.g0(jVar);
                L = jVar;
            }
            k1.j jVar2 = (k1.j) L;
            i0Var.W(-536832197);
            i0Var.p(false);
            boolean a9 = j1.e.a(bVar.d(), 9205357640488583168L);
            d1.i iVar = d1.i.f3304a;
            if (!a9) {
                long d10 = bVar.d();
                if (!Float.isInfinite(Float.intBitsToFloat((int) (d10 >> 32))) || !Float.isInfinite(Float.intBitsToFloat((int) (d10 & 4294967295L)))) {
                    lVar2 = iVar;
                    b0.p.a(h1.d.c(lVar.c(lVar2), bVar, a2.h.f96b, 0.0f, jVar2, 22).c(iVar), i0Var, 0);
                }
            }
            lVar2 = f4878a;
            b0.p.a(h1.d.c(lVar.c(lVar2), bVar, a2.h.f96b, 0.0f, jVar2, 22).c(iVar), i0Var, 0);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new Function2() { // from class: j0.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l.a(p1.b.this, lVar, j, (i0) obj, n0.h.z(i3 | 1));
                    return Unit.f5554a;
                }
            };
        }
    }

    public static final void b(final q1.f fVar, d1.l lVar, long j, i0 i0Var, final int i3) {
        i0 i0Var2;
        final long j3;
        final d1.l lVar2;
        i0Var.X(-126890956);
        int i10 = (i0Var.f(fVar) ? 4 : 2) | i3 | 384;
        if (i0Var.O(i10 & 1, (i10 & 1171) != 1170)) {
            i0Var.T();
            if ((i3 & 1) == 0 || i0Var.y()) {
                lVar = d1.i.f3304a;
            } else {
                i0Var.R();
            }
            d1.l lVar3 = lVar;
            i0Var.q();
            i0Var2 = i0Var;
            a(q1.b.d(fVar, i0Var), lVar3, j, i0Var2, 3512);
            j3 = j;
            lVar2 = lVar3;
        } else {
            i0Var2 = i0Var;
            j3 = j;
            i0Var2.R();
            lVar2 = lVar;
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new Function2(lVar2, j3, i3) { // from class: j0.k

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ d1.l f4876e;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ long f4877i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int z10 = n0.h.z(3121);
                    l.b(q1.f.this, this.f4876e, this.f4877i, (i0) obj, z10);
                    return Unit.f5554a;
                }
            };
        }
    }
}
