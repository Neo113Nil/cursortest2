package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class qk implements xt0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ qk(int i, Object obj, Object obj2) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0107  */
    @Override // defpackage.xt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, Object obj2, Object obj3) {
        boolean z;
        long j;
        long j2;
        long j3;
        gc2 gc2Var;
        long j4;
        boolean h;
        Object M;
        Typeface typeface;
        int i = this.m;
        nj njVar = sz.a;
        Object obj4 = this.o;
        Object obj5 = this.n;
        boolean z2 = true;
        switch (i) {
            case 0:
                zk zkVar = (zk) obj5;
                so2 so2Var = (so2) obj4;
                a00 a00Var = (a00) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ha1) obj).getClass();
                if (a00Var.P(intValue & 1, (intValue & 17) != 16)) {
                    int i2 = ((vk) so2Var.getValue()).e;
                    int i3 = ((vk) so2Var.getValue()).f;
                    String str = ((vk) so2Var.getValue()).b;
                    boolean h2 = a00Var.h(zkVar);
                    Object M2 = a00Var.M();
                    if (h2 || M2 == njVar) {
                        M2 = new rk(1, zkVar, zk.class, "setQuery", "setQuery(Ljava/lang/String;)V", 0, 0, 0);
                        a00Var.i0(M2);
                    }
                    Function1 function1 = (Function1) ((j71) M2);
                    jk jkVar = ((vk) so2Var.getValue()).a;
                    boolean h3 = a00Var.h(zkVar);
                    Object M3 = a00Var.M();
                    if (h3 || M3 == njVar) {
                        rk rkVar = new rk(1, zkVar, zk.class, "setKind", "setKind(Lcom/majelw/libystne/data/AtlasKind;)V", 0, 0, 1);
                        a00Var.i0(rkVar);
                        M3 = rkVar;
                    }
                    s93.d(i2, i3, str, function1, jkVar, (Function1) ((j71) M3), a00Var, 0);
                } else {
                    a00Var.S();
                }
                break;
            case 1:
                op1 op1Var = (op1) obj5;
                up1 up1Var = (up1) obj4;
                gc2 gc2Var2 = (gc2) obj;
                a00 a00Var2 = (a00) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                gc2Var2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= a00Var2.f(gc2Var2) ? 4 : 2;
                }
                if (a00Var2.P(intValue2 & 1, (intValue2 & 19) != 18)) {
                    for (final is2 is2Var : ph1.a) {
                        if (op1Var != null) {
                            int i4 = op1.u;
                            Sequence c = aj2.c(op1Var, bl0.K);
                            if (c != null) {
                                Iterator it = c.iterator();
                                while (it.hasNext()) {
                                    if (Intrinsics.b(((op1) it.next()).s, is2Var.a)) {
                                        z = z2;
                                        j = aw.c;
                                        j2 = cw.m;
                                        j3 = cw.j;
                                        long j5 = aw.g;
                                        jq1 w = yj1.w((gw) a00Var2.j(hw.a));
                                        if (j == 16) {
                                            gc2Var = gc2Var2;
                                            j4 = j;
                                        } else {
                                            gc2Var = gc2Var2;
                                            j4 = w.a;
                                        }
                                        if (j == 16) {
                                            j = w.b;
                                        }
                                        long j6 = j;
                                        if (j2 == 16) {
                                            j2 = w.c;
                                        }
                                        long j7 = j2;
                                        long j8 = j3 == 16 ? j3 : w.d;
                                        if (j3 == 16) {
                                            j3 = w.e;
                                        }
                                        jq1 jq1Var = new jq1(j4, j6, j7, j8, j3, j5 == 16 ? j5 : w.f, j5 == 16 ? j5 : w.g);
                                        h = a00Var2.h(up1Var) | a00Var2.f(is2Var);
                                        M = a00Var2.M();
                                        if (!h || M == njVar) {
                                            M = new h00(3, is2Var, up1Var);
                                            a00Var2.i0(M);
                                        }
                                        final int i5 = 0;
                                        final int i6 = 1;
                                        gc2Var2 = gc2Var;
                                        iv1.h(gc2Var2, z, (Function0) M, yj1.H(-2121671861, new Function2() { // from class: oh1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                int i7 = i5;
                                                is2 is2Var2 = is2Var;
                                                switch (i7) {
                                                    case 0:
                                                        a00 a00Var3 = (a00) obj6;
                                                        int intValue3 = ((Integer) obj7).intValue();
                                                        if (a00Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                            k01.a(is2Var2.c, uj2.f(is2Var2.b, a00Var3), null, 0L, a00Var3, 0, 12);
                                                        } else {
                                                            a00Var3.S();
                                                        }
                                                        break;
                                                    default:
                                                        a00 a00Var4 = (a00) obj6;
                                                        int intValue4 = ((Integer) obj7).intValue();
                                                        if (a00Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                            yv2.b(uj2.f(is2Var2.b, a00Var4), null, 0L, mi2.l(10), null, 0L, null, 0L, 0, false, 1, 0, null, a00Var4, 3072, 3456, 118774);
                                                        } else {
                                                            a00Var4.S();
                                                        }
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        }, a00Var2), null, false, yj1.H(599821992, new Function2() { // from class: oh1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                int i7 = i6;
                                                is2 is2Var2 = is2Var;
                                                switch (i7) {
                                                    case 0:
                                                        a00 a00Var3 = (a00) obj6;
                                                        int intValue3 = ((Integer) obj7).intValue();
                                                        if (a00Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                            k01.a(is2Var2.c, uj2.f(is2Var2.b, a00Var3), null, 0L, a00Var3, 0, 12);
                                                        } else {
                                                            a00Var3.S();
                                                        }
                                                        break;
                                                    default:
                                                        a00 a00Var4 = (a00) obj6;
                                                        int intValue4 = ((Integer) obj7).intValue();
                                                        if (a00Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                            yv2.b(uj2.f(is2Var2.b, a00Var4), null, 0L, mi2.l(10), null, 0L, null, 0L, 0, false, 1, 0, null, a00Var4, 3072, 3456, 118774);
                                                        } else {
                                                            a00Var4.S();
                                                        }
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        }, a00Var2), false, jq1Var, a00Var2, (intValue2 & 14) | 1575936);
                                        z2 = true;
                                    }
                                }
                            }
                        }
                        z = false;
                        j = aw.c;
                        j2 = cw.m;
                        j3 = cw.j;
                        long j52 = aw.g;
                        jq1 w2 = yj1.w((gw) a00Var2.j(hw.a));
                        if (j == 16) {
                        }
                        if (j == 16) {
                        }
                        long j62 = j;
                        if (j2 == 16) {
                        }
                        long j72 = j2;
                        if (j3 == 16) {
                        }
                        if (j3 == 16) {
                        }
                        jq1 jq1Var2 = new jq1(j4, j62, j72, j8, j3, j52 == 16 ? j52 : w2.f, j52 == 16 ? j52 : w2.g);
                        h = a00Var2.h(up1Var) | a00Var2.f(is2Var);
                        M = a00Var2.M();
                        if (!h) {
                        }
                        M = new h00(3, is2Var, up1Var);
                        a00Var2.i0(M);
                        final int i52 = 0;
                        final int i62 = 1;
                        gc2Var2 = gc2Var;
                        iv1.h(gc2Var2, z, (Function0) M, yj1.H(-2121671861, new Function2() { // from class: oh1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                int i7 = i52;
                                is2 is2Var2 = is2Var;
                                switch (i7) {
                                    case 0:
                                        a00 a00Var3 = (a00) obj6;
                                        int intValue3 = ((Integer) obj7).intValue();
                                        if (a00Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                                            k01.a(is2Var2.c, uj2.f(is2Var2.b, a00Var3), null, 0L, a00Var3, 0, 12);
                                        } else {
                                            a00Var3.S();
                                        }
                                        break;
                                    default:
                                        a00 a00Var4 = (a00) obj6;
                                        int intValue4 = ((Integer) obj7).intValue();
                                        if (a00Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                                            yv2.b(uj2.f(is2Var2.b, a00Var4), null, 0L, mi2.l(10), null, 0L, null, 0L, 0, false, 1, 0, null, a00Var4, 3072, 3456, 118774);
                                        } else {
                                            a00Var4.S();
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        }, a00Var2), null, false, yj1.H(599821992, new Function2() { // from class: oh1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                int i7 = i62;
                                is2 is2Var2 = is2Var;
                                switch (i7) {
                                    case 0:
                                        a00 a00Var3 = (a00) obj6;
                                        int intValue3 = ((Integer) obj7).intValue();
                                        if (a00Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                                            k01.a(is2Var2.c, uj2.f(is2Var2.b, a00Var3), null, 0L, a00Var3, 0, 12);
                                        } else {
                                            a00Var3.S();
                                        }
                                        break;
                                    default:
                                        a00 a00Var4 = (a00) obj6;
                                        int intValue4 = ((Integer) obj7).intValue();
                                        if (a00Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                                            yv2.b(uj2.f(is2Var2.b, a00Var4), null, 0L, mi2.l(10), null, 0L, null, 0L, 0, false, 1, 0, null, a00Var4, 3072, 3456, 118774);
                                        } else {
                                            a00Var4.S();
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        }, a00Var2), false, jq1Var2, a00Var2, (intValue2 & 14) | 1575936);
                        z2 = true;
                    }
                } else {
                    a00Var2.S();
                }
                break;
            default:
                Spannable spannable = (Spannable) obj5;
                ma maVar = (ma) obj4;
                un2 un2Var = (un2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int intValue4 = ((Integer) obj3).intValue();
                ip0 ip0Var = un2Var.f;
                jq0 jq0Var = un2Var.c;
                if (jq0Var == null) {
                    jq0Var = jq0.q;
                }
                fq0 fq0Var = un2Var.d;
                int i7 = fq0Var != null ? fq0Var.a : 0;
                gq0 gq0Var = un2Var.e;
                int i8 = gq0Var != null ? gq0Var.a : 65535;
                na naVar = (na) maVar.n;
                j13 b = ((jp0) naVar.q).b(ip0Var, jq0Var, i7, i8);
                if (b instanceof i13) {
                    Object obj6 = ((i13) b).m;
                    obj6.getClass();
                    typeface = (Typeface) obj6;
                } else {
                    mh mhVar = new mh(b, naVar.v);
                    naVar.v = mhVar;
                    Object obj7 = mhVar.p;
                    obj7.getClass();
                    typeface = (Typeface) obj7;
                }
                spannable.setSpan(new lp0(1, typeface), intValue3, intValue4, 33);
                break;
        }
        return Unit.a;
    }
}
