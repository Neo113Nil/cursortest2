package x0;

import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import n0.i0;
import n0.s1;
import vd.n;
import vd.o;
import vd.p;
import vd.q;
import vd.r;
import vd.s;
import vd.t;
import wd.g0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements Function2, n, o, p, q, r, s, t, vd.a, vd.b, vd.d, vd.e, vd.f, vd.g, vd.h, vd.i, vd.j, vd.k, vd.l {

    /* renamed from: d, reason: collision with root package name */
    public final int f10222d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10223e;

    /* renamed from: i, reason: collision with root package name */
    public hd.c f10224i;

    /* renamed from: r, reason: collision with root package name */
    public s1 f10225r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f10226s;

    public d(int i3, boolean z10, hd.c cVar) {
        this.f10222d = i3;
        this.f10223e = z10;
        this.f10224i = cVar;
    }

    @Override // vd.n
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return e(obj, (i0) obj2, ((Number) obj3).intValue());
    }

    public final Object b(int i3, i0 i0Var) {
        i0Var.X(this.f10222d);
        f(i0Var);
        int a9 = i3 | (i0Var.f(this) ? i.a(2, 0) : i.a(1, 0));
        hd.c cVar = this.f10224i;
        g0.c(2, cVar);
        Object invoke = ((Function2) cVar).invoke(i0Var, Integer.valueOf(a9));
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new c(2, d.class, this, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;");
        }
        return invoke;
    }

    @Override // vd.o
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (i0) obj3, ((Number) obj4).intValue());
    }

    public final Object d(Object obj, Object obj2, i0 i0Var, int i3) {
        i0Var.X(this.f10222d);
        f(i0Var);
        int a9 = i0Var.f(this) ? i.a(2, 2) : i.a(1, 2);
        hd.c cVar = this.f10224i;
        g0.c(4, cVar);
        Object c10 = ((o) cVar).c(obj, obj2, i0Var, Integer.valueOf(a9 | i3));
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new a1.h(this, obj, obj2, i3);
        }
        return c10;
    }

    public final Object e(Object obj, i0 i0Var, int i3) {
        i0Var.X(this.f10222d);
        f(i0Var);
        int a9 = i0Var.f(this) ? i.a(2, 1) : i.a(1, 1);
        hd.c cVar = this.f10224i;
        g0.c(3, cVar);
        Object a10 = ((n) cVar).a(obj, i0Var, Integer.valueOf(a9 | i3));
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new n0.r(this, obj, i3);
        }
        return a10;
    }

    public final void f(i0 i0Var) {
        s1 x10;
        if (!this.f10223e || (x10 = i0Var.x()) == null) {
            return;
        }
        x10.f6810b |= 1;
        if (i.e(this.f10225r, x10)) {
            this.f10225r = x10;
            return;
        }
        ArrayList arrayList = this.f10226s;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f10226s = arrayList2;
            arrayList2.add(x10);
            return;
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i.e((s1) arrayList.get(i3), x10)) {
                arrayList.set(i3, x10);
                return;
            }
        }
        arrayList.add(x10);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Number) obj2).intValue(), (i0) obj);
    }
}
