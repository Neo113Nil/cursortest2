package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i40 extends o81 implements Function1 {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i40(boolean z, q80 q80Var, a50 a50Var) {
        super(1);
        this.n = z;
        this.o = q80Var;
        this.p = a50Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        int i = this.m;
        int i2 = 2;
        int i3 = 1;
        int i4 = 0;
        Object obj2 = this.o;
        final boolean z = this.n;
        StringBuilder sb = null;
        Object obj3 = this.p;
        switch (i) {
            case 0:
                yd ydVar = (yd) obj;
                sc1 sc1Var = (sc1) obj2;
                if (!z) {
                    return Boolean.FALSE;
                }
                wv2 wv2Var = sc1Var.e;
                d40 d40Var = sc1Var.t;
                if (wv2Var != null) {
                    nv2 f = sc1Var.d.f(qv.g(new am0(), new yw(ydVar, 1)));
                    wv2Var.a(null, f);
                    d40Var.invoke(f);
                    unit = Unit.a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    nv2 nv2Var = (nv2) obj3;
                    yd ydVar2 = nv2Var.a;
                    long j = nv2Var.b;
                    String str = ydVar2.n;
                    int i5 = jw2.c;
                    int i6 = (int) (j >> 32);
                    int i7 = (int) (j & 4294967295L);
                    str.getClass();
                    ydVar.getClass();
                    if (i7 >= i6) {
                        sb = new StringBuilder();
                        sb.append((CharSequence) str, 0, i6);
                        sb.append((CharSequence) ydVar);
                        sb.append((CharSequence) str, i7, str.length());
                    } else {
                        ch2.e(i7, i6, ") is less than start index (", "End index (");
                    }
                    String obj4 = sb.toString();
                    int length = ydVar.n.length() + i6;
                    d40Var.invoke(new nv2(obj4, 4, th2.a(length, length)));
                }
                return Boolean.TRUE;
            case 1:
                final List list = (List) obj3;
                final cp1 cp1Var = (cp1) obj2;
                fd1 fd1Var = new fd1() { // from class: wa0
                    @Override // defpackage.fd1
                    public final void o(id1 id1Var, yc1 yc1Var) {
                        boolean z2 = z;
                        List list2 = list;
                        cp1 cp1Var2 = cp1Var;
                        if (z2 && !list2.contains(cp1Var2)) {
                            list2.add(cp1Var2);
                        }
                        if (yc1Var == yc1.ON_START && !list2.contains(cp1Var2)) {
                            list2.add(cp1Var2);
                        }
                        if (yc1Var == yc1.ON_STOP) {
                            list2.remove(cp1Var2);
                        }
                    }
                };
                cp1Var.t.a(fd1Var);
                return new o8(i2, cp1Var, fd1Var);
            default:
                sh2 sh2Var = (sh2) obj;
                a50 a50Var = (a50) obj3;
                q80 q80Var = (q80) obj2;
                if (z) {
                    gy1 gy1Var = new gy1(q80Var, a50Var, i4);
                    t71[] t71VarArr = ii2.a;
                    sh2Var.d(rh2.x, new r1(null, gy1Var));
                    sh2Var.d(rh2.z, new r1(null, new gy1(q80Var, a50Var, i3)));
                } else {
                    gy1 gy1Var2 = new gy1(q80Var, a50Var, i2);
                    t71[] t71VarArr2 = ii2.a;
                    sh2Var.d(rh2.y, new r1(null, gy1Var2));
                    sh2Var.d(rh2.A, new r1(null, new gy1(q80Var, a50Var, 3)));
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i40(cp1 cp1Var, List list, boolean z) {
        super(1);
        this.o = cp1Var;
        this.n = z;
        this.p = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i40(boolean z, sc1 sc1Var, sh2 sh2Var, nv2 nv2Var) {
        super(1);
        this.n = z;
        this.o = sc1Var;
        this.p = nv2Var;
    }
}
