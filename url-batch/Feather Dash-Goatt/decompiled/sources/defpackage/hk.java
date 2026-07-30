package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hk implements Function2, s30, t30, u30, v30, w30, x30, y30, f30, g30, i30, j30, k30, l30, m30, n30, o30, p30, q30 {
    public final int d;
    public final boolean e;
    public z30 g;
    public i11 h;
    public ArrayList i;

    public hk(int i, boolean z, z30 z30Var) {
        this.d = i;
        this.e = z;
        this.g = z30Var;
    }

    @Override // defpackage.s30
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return e(obj, (hl) obj2, ((Number) obj3).intValue());
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2) {
        return c(((Number) obj2).intValue(), (hl) obj);
    }

    public final Object c(int i, hl hlVar) {
        hlVar.Y(this.d);
        h(hlVar);
        int o = i | (hlVar.f(this) ? m90.o(2, 0) : m90.o(1, 0));
        z30 z30Var = this.g;
        tj1.b(2, z30Var);
        Object b = ((Function2) z30Var).b(hlVar, Integer.valueOf(o));
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new gk(2, this, hk.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return b;
    }

    public final Object e(Object obj, hl hlVar, int i) {
        hlVar.Y(this.d);
        h(hlVar);
        int i2 = 1;
        int o = hlVar.f(this) ? m90.o(2, 1) : m90.o(1, 1);
        z30 z30Var = this.g;
        tj1.b(3, z30Var);
        Object a = ((s30) z30Var).a(obj, hlVar, Integer.valueOf(o | i));
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new ag(i, i2, this, obj);
        }
        return a;
    }

    @Override // defpackage.t30
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return g(obj, obj2, (hl) obj3, ((Number) obj4).intValue());
    }

    public final Object g(Object obj, Object obj2, hl hlVar, int i) {
        hlVar.Y(this.d);
        h(hlVar);
        int o = hlVar.f(this) ? m90.o(2, 2) : m90.o(1, 2);
        z30 z30Var = this.g;
        tj1.b(4, z30Var);
        Object f = ((t30) z30Var).f(obj, obj2, hlVar, Integer.valueOf(o | i));
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new fk(this, obj, obj2, i, 0);
        }
        return f;
    }

    public final void h(hl hlVar) {
        i11 x;
        if (!this.e || (x = hlVar.x()) == null) {
            return;
        }
        x.b |= 1;
        i11 i11Var = this.h;
        if (i11Var == null || !i11Var.a() || i11Var == x || Intrinsics.a(i11Var.c, x.c)) {
            this.h = x;
            return;
        }
        ArrayList arrayList = this.i;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.i = arrayList2;
            arrayList2.add(x);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            i11 i11Var2 = (i11) arrayList.get(i);
            if (i11Var2 == null || !i11Var2.a() || i11Var2 == x || Intrinsics.a(i11Var2.c, x.c)) {
                arrayList.set(i, x);
                return;
            }
        }
        arrayList.add(x);
    }
}
