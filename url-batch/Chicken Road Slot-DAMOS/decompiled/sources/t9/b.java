package t9;

import androidx.lifecycle.a1;
import b0.i;
import b0.w0;
import b5.d0;
import b5.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.h;
import n0.i0;
import n0.k;
import n0.s1;
import n9.l;
import wd.c0;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final x0.d f9325a = new x0.d(-1213987135, false, new a());

    public static final void a(Function0 function0, Function0 function02, c cVar, i0 i0Var, int i3) {
        c cVar2;
        c cVar3;
        int i10;
        c cVar4;
        function0.getClass();
        function02.getClass();
        i0Var.X(1338636269);
        int i11 = i3 | (i0Var.h(function0) ? 4 : 2) | (i0Var.h(function02) ? 32 : 16) | 128;
        if (i0Var.O(i11 & 1, (i11 & 147) != 146)) {
            i0Var.T();
            if ((i3 & 1) == 0 || i0Var.y()) {
                a1 a9 = l4.a.a(i0Var);
                if (a9 == null) {
                    kotlin.collections.i0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    cVar3 = (c) w.L(c0.a(c.class), a9.f(), k7.e.n(a9), xe.b.a(i0Var));
                    i10 = i11 & (-897);
                }
            } else {
                i0Var.R();
                i10 = i11 & (-897);
                cVar3 = cVar;
            }
            i0Var.q();
            Object L = i0Var.L();
            n0.e eVar = k.f6729a;
            if (L == eVar) {
                L = new v.b(Float.valueOf(0.0f), Float.valueOf(0.01f));
                i0Var.g0(L);
            }
            v.b bVar = (v.b) L;
            Unit unit = Unit.f5554a;
            boolean h10 = i0Var.h(bVar);
            Object L2 = i0Var.L();
            if (h10 || L2 == eVar) {
                L2 = new d0(bVar, null, 8);
                i0Var.g0(L2);
            }
            h.f(unit, (Function2) L2, i0Var);
            boolean h11 = ((i10 & 14) == 4) | i0Var.h(cVar3) | ((i10 & 112) == 32);
            Object L3 = i0Var.L();
            if (h11 || L3 == eVar) {
                c cVar5 = cVar3;
                t tVar = new t(cVar5, function0, function02, null, 10);
                cVar4 = cVar5;
                i0Var.g0(tVar);
                L3 = tVar;
            } else {
                cVar4 = cVar3;
            }
            h.f(unit, (Function2) L3, i0Var);
            i.a(w0.a(1.0f), null, x0.i.d(1042263767, new ge.g(6, bVar), i0Var), i0Var, 3078, 6);
            cVar2 = cVar4;
        } else {
            i0Var.R();
            cVar2 = cVar;
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new l(function0, function02, cVar2, i3, 4);
        }
    }

    public static final void b(final float f3, d1.l lVar, i0 i0Var, int i3) {
        i0Var.X(1379257806);
        int i10 = (i0Var.c(f3) ? 4 : 2) | i3 | (i0Var.f(lVar) ? 32 : 16);
        if (i0Var.O(i10 & 1, (i10 & 19) != 18)) {
            boolean z10 = (i10 & 14) == 4;
            Object L = i0Var.L();
            if (z10 || L == k.f6729a) {
                L = new Function1() { // from class: t9.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        m1.d dVar = (m1.d) obj;
                        dVar.getClass();
                        float b10 = j1.e.b(dVar.u()) * 0.15f;
                        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.u() >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.u() & 4294967295L));
                        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                        long j = u9.a.j;
                        float f10 = f3 * 280.0f;
                        dVar.R(j, f10, floatToRawIntBits, new m1.g(b10, 0.0f, 1, 0, 26));
                        dVar.R(u9.a.f9706h, f10, floatToRawIntBits, new m1.g(0.65f * b10, 0.0f, 1, 0, 26));
                        return Unit.f5554a;
                    }
                };
                i0Var.g0(L);
            }
            x.g.a((i10 >> 3) & 14, lVar, (Function1) L, i0Var);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new n9.h(f3, lVar, i3, 1);
        }
    }
}
