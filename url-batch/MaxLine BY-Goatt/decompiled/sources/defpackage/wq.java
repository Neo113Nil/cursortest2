package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wq extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq(Function0 function0, vl1 vl1Var, boolean z, fk2 fk2Var, tq tqVar, s03 s03Var, yx1 yx1Var, my myVar, int i) {
        super(2);
        this.m = 0;
        this.n = function0;
        this.o = vl1Var;
        this.p = z;
        this.q = fk2Var;
        this.r = tqVar;
        this.s = yx1Var;
        this.t = myVar;
        this.u = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r0 != false) goto L28;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        int i2 = this.u;
        Object obj3 = this.t;
        Object obj4 = this.s;
        Object obj5 = this.r;
        Object obj6 = this.q;
        Object obj7 = this.o;
        boolean z = true;
        Object obj8 = this.n;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int R = s03.R(1 | i2);
                s93.f((Function0) obj8, (vl1) obj7, this.p, (fk2) obj6, (tq) obj5, null, (yx1) obj4, (my) obj3, (a00) obj, R);
                break;
            case 1:
                ((Number) obj2).intValue();
                my myVar = (my) obj3;
                int R2 = s03.R(1 | i2);
                s93.q((Function0) obj8, (vl1) obj7, this.p, (fk2) obj6, (tq) obj5, (yx1) obj4, myVar, (a00) obj, R2);
                break;
            default:
                a00 a00Var = (a00) obj;
                gv2 gv2Var = (gv2) obj8;
                sc1 sc1Var = (sc1) obj7;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
                    a00Var.S();
                } else {
                    z30 z30Var = new z30(sc1Var, (Function1) obj6, (nv2) obj5, (cu1) obj4, (ca0) obj3, this.u);
                    int D = iv1.D(a00Var);
                    v02 l = a00Var.l();
                    vl1 E = bd3.E(a00Var, sl1.a);
                    pz.b.getClass();
                    o00 o00Var = oz.b;
                    a00Var.b0();
                    if (a00Var.S) {
                        a00Var.k(o00Var);
                    } else {
                        a00Var.l0();
                    }
                    uj2.e(a00Var, z30Var, oz.f);
                    uj2.e(a00Var, l, oz.e);
                    sc scVar = oz.g;
                    if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                        q40.r(D, a00Var, D, scVar);
                    }
                    uj2.e(a00Var, E, oz.d);
                    a00Var.q(true);
                    zw0 a = sc1Var.a();
                    zw0 zw0Var = zw0.m;
                    boolean z2 = this.p;
                    if (a != zw0Var && sc1Var.c() != null) {
                        t81 c = sc1Var.c();
                        c.getClass();
                        if (c.y()) {
                        }
                    }
                    z = false;
                    s93.s(gv2Var, z, a00Var, 0);
                    if (sc1Var.a() == zw0.o && z2) {
                        a00Var.X(-2032274);
                        s93.r(gv2Var, a00Var, 0);
                        a00Var.q(false);
                    } else {
                        a00Var.X(-1955394);
                        a00Var.q(false);
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wq(Object obj, Object obj2, boolean z, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        super(2);
        this.m = i2;
        this.n = obj;
        this.o = obj2;
        this.p = z;
        this.q = obj3;
        this.r = obj4;
        this.s = obj5;
        this.t = obj6;
        this.u = i;
    }
}
