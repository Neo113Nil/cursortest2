package a3;

import a2.v0;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.g0;
import d2.d1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import n0.h0;
import n0.i0;
import n0.s1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final u8.d f245a = new u8.d(1);

    public static final void a(int i3, d1.l lVar, Function1 function1, i0 i0Var) {
        int i10;
        int i11;
        f5.e eVar;
        androidx.lifecycle.u uVar;
        x2.l lVar2;
        Object obj = c.f201s;
        i0Var.X(-180024211);
        if ((i3 & 6) == 0) {
            i10 = (i0Var.h(function1) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= i0Var.f(lVar) ? 32 : 16;
        }
        int i12 = i10 | 384;
        if ((i3 & 3072) == 0) {
            i12 |= i0Var.h(obj) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i12 |= i0Var.h(obj) ? 16384 : 8192;
        }
        if (i0Var.O(i12 & 1, (i12 & 9363) != 9362)) {
            int hashCode = Long.hashCode(i0Var.T);
            d1.l C = z4.w.C(lVar.c(v.f269a).c(i1.s.f4630a).c(c0.f203a).c(y.f272a), i0Var);
            x2.c cVar = (x2.c) i0Var.j(d1.f3384h);
            x2.l lVar3 = (x2.l) i0Var.j(d1.f3389n);
            x0.h l10 = i0Var.l();
            androidx.lifecycle.u uVar2 = (androidx.lifecycle.u) i0Var.j(i4.e.f4646a);
            f5.e eVar2 = (f5.e) i0Var.j(g5.a.f4273a);
            i0Var.W(1314774735);
            int i13 = i12 & 14;
            int hashCode2 = Long.hashCode(i0Var.T);
            Context context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f465b);
            h0 u2 = n0.h.u(i0Var);
            a1.m mVar = (a1.m) i0Var.j(a1.p.f46a);
            View view = (View) i0Var.j(AndroidCompositionLocals_androidKt.f469f);
            boolean h10 = i0Var.h(context) | ((((i13 & 14) ^ 6) > 4 && i0Var.f(function1)) || (i13 & 6) == 4) | i0Var.h(u2) | i0Var.h(mVar) | i0Var.d(hashCode2) | i0Var.h(view);
            Object L = i0Var.L();
            if (h10 || L == n0.k.f6729a) {
                i11 = hashCode;
                eVar = eVar2;
                uVar = uVar2;
                lVar2 = lVar3;
                Object rVar = new r(context, function1, u2, mVar, hashCode2, view);
                i0Var.g0(rVar);
                L = rVar;
            } else {
                i11 = hashCode;
                lVar2 = lVar3;
                eVar = eVar2;
                uVar = uVar2;
            }
            Function0 function0 = (Function0) L;
            i0Var.S(125, 1, null, null);
            i0Var.f6713r = true;
            if (i0Var.S) {
                i0Var.k(function0);
            } else {
                i0Var.j0();
            }
            c2.g.f1541a.getClass();
            n0.h.y(l10, c2.f.f1535d, i0Var);
            n0.h.y(C, q.f252r, i0Var);
            n0.h.y(cVar, q.f253s, i0Var);
            n0.h.y(uVar, q.f254t, i0Var);
            n0.h.y(eVar, q.f255u, i0Var);
            n0.h.y(lVar2, q.f256v, i0Var);
            n0.h.y(Integer.valueOf(i11), c2.f.f1537f, i0Var);
            n0.h.y(obj, q.f250e, i0Var);
            n0.h.y(obj, q.f251i, i0Var);
            i0Var.p(true);
            i0Var.p(false);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new v0(function1, lVar, i3);
        }
    }

    public static final void b(Function1 function1, d1.l lVar, Function1 function12, i0 i0Var, int i3) {
        c cVar = c.f201s;
        i0Var.X(-1783766393);
        int i10 = (i0Var.h(function1) ? 4 : 2) | i3 | (i0Var.f(lVar) ? 32 : 16) | 384;
        if (i0Var.O(i10 & 1, (i10 & 147) != 146)) {
            a((i10 & 14) | 3072 | (i10 & 112) | 24576, lVar, function1, i0Var);
            function12 = cVar;
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new p(function1, lVar, function12, i3);
        }
    }

    public static final View c(d1.k kVar) {
        e0 e0Var = c2.k.u(kVar.f3305d).C;
        View interopView = e0Var != null ? e0Var.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        kotlin.collections.i0.l("Could not fetch interop view");
        return null;
    }

    public static final void d(e0 e0Var, g0 g0Var) {
        long K = ((c2.q) g0Var.S.f1493d).K(0L);
        int round = Math.round(Float.intBitsToFloat((int) (K >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (K & 4294967295L)));
        e0Var.layout(round, round2, e0Var.getMeasuredWidth() + round, e0Var.getMeasuredHeight() + round2);
    }

    public static final e0 e(g0 g0Var) {
        e0 e0Var = g0Var.C;
        if (e0Var != null) {
            return e0Var;
        }
        throw v4.a.h("Required value was null.");
    }
}
