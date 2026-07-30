package defpackage;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gc extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(y72 y72Var, up1 up1Var, op1 op1Var, Bundle bundle) {
        super(1);
        this.m = 3;
        this.q = y72Var;
        this.n = up1Var;
        this.o = op1Var;
        this.p = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.n;
        Object obj5 = this.q;
        switch (i) {
            case 0:
                ld ldVar = (ld) obj;
                Function1 function1 = (Function1) obj2;
                jc jcVar = (jc) obj4;
                nk2.q(ldVar, jcVar.c);
                lz1 lz1Var = ldVar.e;
                Object a = jc.a(jcVar, lz1Var.getValue());
                if (!Intrinsics.b(a, lz1Var.getValue())) {
                    jcVar.c.n.setValue(a);
                    ((nd) obj3).n.setValue(a);
                    if (function1 != null) {
                        function1.invoke(jcVar);
                    }
                    ldVar.i.setValue(Boolean.FALSE);
                    ldVar.d.invoke();
                    ((y72) obj5).m = true;
                } else if (function1 != null) {
                    function1.invoke(jcVar);
                }
                return Unit.a;
            case 1:
                sc1 sc1Var = (sc1) obj4;
                if (sc1Var.b()) {
                    sv2 sv2Var = (sv2) obj3;
                    t21 t21Var = sc1Var.d;
                    d40 d40Var = sc1Var.t;
                    d40 d40Var2 = sc1Var.u;
                    c82 c82Var = new c82();
                    oc ocVar = new oc(t21Var, d40Var, c82Var, 12);
                    i22 i22Var = sv2Var.a;
                    i22Var.b((nv2) obj2, (c11) obj5, ocVar, d40Var2);
                    wv2 wv2Var = new wv2(sv2Var, i22Var);
                    sv2Var.b.set(wv2Var);
                    c82Var.m = wv2Var;
                    sc1Var.e = wv2Var;
                }
                return new xa(1);
            case 2:
                xb1 xb1Var = (xb1) obj4;
                xb1Var.c = new mh((kb1) obj3, (gq2) obj2, (eb) obj5, 19);
                return new l4(6, xb1Var);
            default:
                cp1 cp1Var = (cp1) obj;
                cp1Var.getClass();
                ((y72) obj5).m = true;
                ((up1) obj4).a((op1) obj3, (Bundle) obj2, cp1Var, ah0.m);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gc(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(1);
        this.m = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
        this.q = obj4;
    }
}
