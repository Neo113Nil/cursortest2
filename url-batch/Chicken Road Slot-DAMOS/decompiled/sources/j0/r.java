package j0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n0.i0;
import n0.n2;
import n0.q1;
import n0.s1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final n2 f4893a;

    static {
        hd.h.b(new a1.k(15));
        f4893a = new n2(new a1.k(16));
    }

    public static final void a(final a aVar, final u uVar, final a0 a0Var, final f0 f0Var, final x0.d dVar, i0 i0Var, final int i3) {
        int i10;
        i0Var.X(904511636);
        if ((i3 & 6) == 0) {
            i10 = (i0Var.f(aVar) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= i0Var.f(uVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i10 |= i0Var.f(a0Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i10 |= i0Var.f(f0Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i10 |= i0Var.h(dVar) ? 16384 : 8192;
        }
        if (i0Var.O(i10 & 1, (i10 & 9363) != 9362)) {
            i0Var.T();
            if ((i3 & 1) != 0 && !i0Var.y()) {
                i0Var.R();
            }
            i0Var.q();
            y a9 = x.a();
            long j = aVar.f4757a;
            boolean e2 = i0Var.e(j);
            Object L = i0Var.L();
            if (e2 || L == n0.k.f6729a) {
                L = new g0.c(j, k1.p.b(j, 0.4f));
                i0Var.g0(L);
            }
            n0.h.b(new q1[]{b.f4788a.a(aVar), f4893a.a(uVar), x.u.f10212a.a(a9), b0.f4789a.a(a0Var), g0.d.f4224a.a((g0.c) L), g0.f4859a.a(f0Var)}, x0.i.d(-1750539308, new q(0, f0Var, dVar), i0Var), i0Var, 56);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new Function2() { // from class: j0.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r.a(a.this, uVar, a0Var, f0Var, dVar, (i0) obj, n0.h.z(i3 | 1));
                    return Unit.f5554a;
                }
            };
        }
    }

    public static final void b(a aVar, a0 a0Var, f0 f0Var, x0.d dVar, i0 i0Var, int i3) {
        int i10;
        a0 a0Var2;
        int i11;
        i0Var.X(-449719819);
        if ((i3 & 6) == 0) {
            i10 = (i0Var.f(aVar) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= 16;
        }
        if ((i3 & 384) == 0) {
            i10 |= i0Var.f(f0Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i10 |= i0Var.h(dVar) ? 2048 : 1024;
        }
        if (i0Var.O(i10 & 1, (i10 & 1171) != 1170)) {
            i0Var.T();
            if ((i3 & 1) == 0 || i0Var.y()) {
                a0Var2 = (a0) i0Var.j(b0.f4789a);
                i11 = i10 & (-113);
            } else {
                i0Var.R();
                i11 = i10 & (-113);
                a0Var2 = a0Var;
            }
            i0Var.q();
            int i12 = i11 & 14;
            int i13 = i11 << 3;
            a(aVar, (u) i0Var.j(f4893a), a0Var2, f0Var, dVar, i0Var, (i13 & 57344) | i12 | (i13 & 7168));
        } else {
            i0Var.R();
            a0Var2 = a0Var;
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new i4.b(aVar, a0Var2, f0Var, dVar, i3, 1);
        }
    }
}
