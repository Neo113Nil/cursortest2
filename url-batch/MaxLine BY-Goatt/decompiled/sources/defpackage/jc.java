package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jc {
    public final k03 a;
    public final Object b;
    public final nd c;
    public final lz1 d;
    public final lz1 e;
    public final no1 f;
    public final sd g;
    public final sd h;
    public final sd i;
    public final sd j;

    public jc(Object obj, k03 k03Var, Object obj2) {
        this.a = k03Var;
        this.b = obj2;
        nd ndVar = new nd(k03Var, obj, null, 60);
        this.c = ndVar;
        this.d = ij2.j(Boolean.FALSE);
        this.e = ij2.j(obj);
        this.f = new no1();
        new eo2(obj2);
        sd sdVar = ndVar.o;
        boolean z = sdVar instanceof od;
        sd sdVar2 = z ? yj1.e : sdVar instanceof pd ? yj1.f : sdVar instanceof qd ? yj1.g : yj1.h;
        this.g = sdVar2;
        sd sdVar3 = z ? yj1.a : sdVar instanceof pd ? yj1.b : sdVar instanceof qd ? yj1.c : yj1.d;
        this.h = sdVar3;
        this.i = sdVar2;
        this.j = sdVar3;
    }

    public static final Object a(jc jcVar, Object obj) {
        k03 k03Var = jcVar.a;
        sd sdVar = jcVar.j;
        sd sdVar2 = jcVar.i;
        if (!Intrinsics.b(sdVar2, jcVar.g) || !Intrinsics.b(sdVar, jcVar.h)) {
            sd sdVar3 = (sd) k03Var.a.invoke(obj);
            int b = sdVar3.b();
            boolean z = false;
            for (int i = 0; i < b; i++) {
                if (sdVar3.a(i) < sdVar2.a(i) || sdVar3.a(i) > sdVar.a(i)) {
                    sdVar3.e(i, d.b(sdVar3.a(i), sdVar2.a(i), sdVar.a(i)));
                    z = true;
                }
            }
            if (z) {
                return k03Var.b.invoke(sdVar3);
            }
        }
        return obj;
    }

    public static final void b(jc jcVar) {
        nd ndVar = jcVar.c;
        ndVar.o.d();
        ndVar.p = Long.MIN_VALUE;
        jcVar.d.setValue(Boolean.FALSE);
    }

    public static Object c(jc jcVar, Object obj, md mdVar, Function1 function1, o30 o30Var, int i) {
        Object invoke = jcVar.a.b.invoke(jcVar.c.o);
        Function1 function12 = (i & 8) != 0 ? null : function1;
        Object d = jcVar.d();
        k03 k03Var = jcVar.a;
        return no1.a(jcVar.f, new hc(jcVar, invoke, new bt2(mdVar, k03Var, d, obj, (sd) k03Var.a.invoke(invoke)), jcVar.c.p, function12, null), o30Var);
    }

    public final Object d() {
        return this.c.n.getValue();
    }

    public final Object e(o30 o30Var, Object obj) {
        Object a = no1.a(this.f, new ic(this, obj, null), o30Var);
        return a == b50.m ? a : Unit.a;
    }

    public /* synthetic */ jc(Object obj, k03 k03Var, Object obj2, int i) {
        this(obj, k03Var, (i & 4) != 0 ? null : obj2);
    }
}
