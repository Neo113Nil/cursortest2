package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class my implements Function2, xt0, yt0, zt0, au0, bu0, cu0, du0, jt0, kt0, mt0, nt0, ot0, pt0, qt0, rt0, st0, ut0, vt0 {
    public final int m;
    public final boolean n;
    public Object o;
    public n72 p;
    public ArrayList q;

    public my(int i, Object obj, boolean z) {
        this.m = i;
        this.n = z;
        this.o = obj;
    }

    @Override // defpackage.xt0
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return d(obj, (a00) obj2, ((Number) obj3).intValue());
    }

    @Override // defpackage.yt0
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        return e(obj, obj2, (a00) obj3, ((Number) obj4).intValue());
    }

    public final Object c(int i, a00 a00Var) {
        a00Var.Z(this.m);
        f(a00Var);
        int l = i | (a00Var.f(this) ? yj1.l(2, 0) : yj1.l(1, 0));
        Object obj = this.o;
        obj.getClass();
        s03.f(2, obj);
        Object invoke = ((Function2) obj).invoke(a00Var, Integer.valueOf(l));
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new ly(2, 8, my.class, this, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;");
        }
        return invoke;
    }

    public final Object d(Object obj, a00 a00Var, int i) {
        a00Var.Z(this.m);
        f(a00Var);
        int l = a00Var.f(this) ? yj1.l(2, 1) : yj1.l(1, 1);
        Object obj2 = this.o;
        obj2.getClass();
        s03.f(3, obj2);
        Object a = ((xt0) obj2).a(obj, a00Var, Integer.valueOf(l | i));
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new ky(i, 0, this, obj);
        }
        return a;
    }

    public final Object e(Object obj, Object obj2, a00 a00Var, int i) {
        a00Var.Z(this.m);
        f(a00Var);
        int l = a00Var.f(this) ? yj1.l(2, 2) : yj1.l(1, 2);
        Object obj3 = this.o;
        obj3.getClass();
        s03.f(4, obj3);
        Object b = ((yt0) obj3).b(obj, obj2, a00Var, Integer.valueOf(l | i));
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new us(this, obj, obj2, i, 1);
        }
        return b;
    }

    public final void f(a00 a00Var) {
        n72 y;
        if (!this.n || (y = a00Var.y()) == null) {
            return;
        }
        y.b |= 1;
        n72 n72Var = this.p;
        if (n72Var == null || !n72Var.a() || n72Var == y || Intrinsics.b(n72Var.c, y.c)) {
            this.p = y;
            return;
        }
        ArrayList arrayList = this.q;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.q = arrayList2;
            arrayList2.add(y);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            n72 n72Var2 = (n72) arrayList.get(i);
            if (n72Var2 == null || !n72Var2.a() || n72Var2 == y || Intrinsics.b(n72Var2.c, y.c)) {
                arrayList.set(i, y);
                return;
            }
        }
        arrayList.add(y);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return c(((Number) obj2).intValue(), (a00) obj);
    }
}
