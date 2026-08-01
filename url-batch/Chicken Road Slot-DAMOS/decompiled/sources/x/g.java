package x;

import a2.g0;
import android.view.KeyEvent;
import c2.z;
import j0.y;
import k1.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.i0;
import n0.s1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class g {
    public static final void a(int i3, d1.l lVar, Function1 function1, i0 i0Var) {
        int i10;
        i0Var.X(-932836462);
        if ((i3 & 6) == 0) {
            i10 = (i0Var.f(lVar) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= i0Var.h(function1) ? 32 : 16;
        }
        if (i0Var.O(i10 & 1, (i10 & 19) != 18)) {
            b0.i.b(h1.d.b(lVar, function1), i0Var);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new n0.r(lVar, function1, i3, 4);
        }
    }

    public static final void b(final p1.b bVar, final d1.l lVar, d1.d dVar, final a2.g gVar, float f3, i0 i0Var, final int i3) {
        int i10;
        final d1.d dVar2;
        final float f10;
        i0Var.X(1142754848);
        if ((i3 & 6) == 0) {
            i10 = ((i3 & 8) == 0 ? i0Var.f(bVar) : i0Var.h(bVar) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= i0Var.f(null) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i10 |= i0Var.f(lVar) ? 256 : 128;
        }
        int i11 = i10 | 3072;
        if ((i3 & 24576) == 0) {
            i11 |= i0Var.f(gVar) ? 16384 : 8192;
        }
        int i12 = i11 | 1769472;
        if (i0Var.O(i12 & 1, (599187 & i12) != 599186)) {
            d1.d dVar3 = d1.a.f3286s;
            i0Var.W(1899381698);
            i0Var.p(false);
            d1.l c10 = h1.d.c(h1.d.a(lVar.c(d1.i.f3304a)), bVar, gVar, 1.0f, null, 2);
            Object L = i0Var.L();
            if (L == n0.k.f6729a) {
                L = t.f10211a;
                i0Var.g0(L);
            }
            g0 g0Var = (g0) L;
            int hashCode = Long.hashCode(i0Var.T);
            d1.l C = z4.w.C(c10, i0Var);
            x0.h l10 = i0Var.l();
            c2.g.f1541a.getClass();
            z zVar = c2.f.f1533b;
            i0Var.Z();
            if (i0Var.S) {
                i0Var.k(zVar);
            } else {
                i0Var.j0();
            }
            n0.h.y(g0Var, c2.f.f1536e, i0Var);
            n0.h.y(l10, c2.f.f1535d, i0Var);
            n0.h.t(i0Var, c2.f.g);
            n0.h.y(C, c2.f.f1534c, i0Var);
            n0.h.y(Integer.valueOf(hashCode), c2.f.f1537f, i0Var);
            i0Var.p(true);
            f10 = 1.0f;
            dVar2 = dVar3;
        } else {
            i0Var.R();
            dVar2 = dVar;
            f10 = f3;
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new Function2() { // from class: x.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g.b(p1.b.this, lVar, dVar2, gVar, f10, (i0) obj, n0.h.z(i3 | 1));
                    return Unit.f5554a;
                }
            };
        }
    }

    public static final d1.l c(d1.l lVar, long j, f0 f0Var) {
        return lVar.c(new f(j, f0Var));
    }

    public static d1.l d(d1.l lVar, z.f fVar, y yVar, boolean z10, j2.g gVar, Function0 function0, int i3) {
        d1.l gVar2;
        if ((i3 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i3 & 16) != 0) {
            gVar = null;
        }
        j2.g gVar3 = gVar;
        if (yVar != null) {
            gVar2 = new i(fVar, yVar, z11, gVar3, function0);
        } else if (yVar == null) {
            gVar2 = new i(fVar, null, z11, gVar3, function0);
        } else if (fVar != null) {
            n0.v vVar = u.f10212a;
            gVar2 = new v(fVar, yVar).c(new i(fVar, null, z11, gVar3, function0));
        } else {
            gVar2 = new d1.g(d2.r.f3519t, new k(yVar, z11, gVar3, function0));
        }
        return lVar.c(gVar2);
    }

    public static final boolean e(KeyEvent keyEvent) {
        long e2 = cf.c.e(keyEvent.getKeyCode());
        return v1.a.a(e2, v1.a.f9939h) || v1.a.a(e2, v1.a.f9941k) || v1.a.a(e2, v1.a.f9945o) || v1.a.a(e2, v1.a.j);
    }
}
