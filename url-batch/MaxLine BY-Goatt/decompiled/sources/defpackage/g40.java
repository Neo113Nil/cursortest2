package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class g40 extends o81 implements Function1 {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g40(sc1 sc1Var, to0 to0Var, boolean z, gv2 gv2Var, cu1 cu1Var) {
        super(1);
        this.o = sc1Var;
        this.p = to0Var;
        this.n = z;
        this.q = gv2Var;
        this.r = cu1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        Object obj2 = this.r;
        boolean z = this.n;
        Object obj3 = this.q;
        Object obj4 = this.p;
        int i2 = 1;
        Object obj5 = this.o;
        switch (i) {
            case 0:
                long j = ((au1) obj).a;
                sc1 sc1Var = (sc1) obj5;
                to0 to0Var = (to0) obj4;
                if (sc1Var.b()) {
                    kn2 kn2Var = sc1Var.c;
                    if (kn2Var != null) {
                        ((r90) kn2Var).b();
                    }
                } else {
                    to0Var.getClass();
                    to0Var.a(new cv2(i2, 26));
                }
                if (sc1Var.b() && z) {
                    if (sc1Var.a() != zw0.n) {
                        cw2 d = sc1Var.d();
                        if (d != null) {
                            t21 t21Var = sc1Var.d;
                            d40 d40Var = sc1Var.t;
                            int b = ((cu1) obj2).b(d.b(true, j));
                            d40Var.invoke(nv2.a((nv2) t21Var.n, null, th2.a(b, b), 5));
                            if (sc1Var.a.a.n.length() > 0) {
                                sc1Var.k.setValue(zw0.o);
                            }
                        }
                    } else {
                        ((gv2) obj3).e(new au1(j));
                    }
                }
                break;
            default:
                cp1 cp1Var = (cp1) obj;
                cp1Var.getClass();
                ((y72) obj5).m = true;
                ((y72) obj4).m = true;
                ((up1) obj3).n(cp1Var, z, (bi) obj2);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g40(y72 y72Var, y72 y72Var2, up1 up1Var, boolean z, bi biVar) {
        super(1);
        this.o = y72Var;
        this.p = y72Var2;
        this.q = up1Var;
        this.n = z;
        this.r = biVar;
    }
}
