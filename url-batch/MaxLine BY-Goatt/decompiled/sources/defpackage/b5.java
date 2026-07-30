package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.b;
import com.majelw.libystne.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class b5 implements xt0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ b5(Function0 function0, so2 so2Var, f61 f61Var) {
        this.m = 2;
        this.p = function0;
        this.o = so2Var;
        this.n = f61Var;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        String str;
        final int i;
        final int i2;
        int i3 = this.m;
        sl1 sl1Var = sl1.a;
        nj njVar = sz.a;
        Object obj4 = this.n;
        Object obj5 = this.o;
        Object obj6 = this.p;
        switch (i3) {
            case 0:
                so2 so2Var = (so2) obj5;
                final fn2 fn2Var = (fn2) obj6;
                nh nhVar = (nh) obj4;
                a00 a00Var = (a00) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((co0) obj).getClass();
                if (a00Var.P(intValue & 1, (intValue & 17) != 16)) {
                    for (final ik ikVar : (List) so2Var.getValue()) {
                        final boolean contains = fn2Var.contains(ikVar.a);
                        String c = ikVar.c(nhVar);
                        boolean g = a00Var.g(contains) | a00Var.h(ikVar);
                        Object M = a00Var.M();
                        if (g || M == njVar) {
                            M = new Function0() { // from class: a5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String str2 = ikVar.a;
                                    boolean z = contains;
                                    fn2 fn2Var2 = fn2Var;
                                    if (z) {
                                        fn2Var2.remove(str2);
                                    } else {
                                        fn2Var2.add(str2);
                                    }
                                    return Unit.a;
                                }
                            };
                            a00Var.i0(M);
                        }
                        iv1.b(c, contains, (Function0) M, a00Var, 0);
                    }
                } else {
                    a00Var.S();
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                Function1 function1 = (Function1) obj6;
                nh nhVar2 = (nh) obj4;
                a00 a00Var2 = (a00) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((co0) obj).getClass();
                if (a00Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj7 = arrayList.get(i4);
                        i4++;
                        ik ikVar2 = (ik) obj7;
                        vl1 b = a.b(yk3.u(sl1Var, zb2.a(999.0f)), cw.n, ap.e);
                        boolean f = a00Var2.f(function1) | a00Var2.h(ikVar2);
                        Object M2 = a00Var2.M();
                        if (f || M2 == njVar) {
                            M2 = new qs(function1, ikVar2, 3);
                            a00Var2.i0(M2);
                        }
                        vl1 i5 = androidx.compose.foundation.layout.a.i(a.e(7, b, null, (Function0) M2, false), 14.0f, 8.0f);
                        oj1 e = fp.e(qb2.p, false);
                        int D = iv1.D(a00Var2);
                        v02 l = a00Var2.l();
                        vl1 E = bd3.E(a00Var2, i5);
                        pz.b.getClass();
                        o00 o00Var = oz.b;
                        a00Var2.b0();
                        if (a00Var2.S) {
                            a00Var2.k(o00Var);
                        } else {
                            a00Var2.l0();
                        }
                        uj2.e(a00Var2, e, oz.f);
                        uj2.e(a00Var2, l, oz.e);
                        sc scVar = oz.g;
                        if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                            q40.r(D, a00Var2, D, scVar);
                        }
                        uj2.e(a00Var2, E, oz.d);
                        yv2.b(ikVar2.c(nhVar2), null, ap.d(4281996880L), 0L, jq0.t, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var2.j(n13.a)).n, a00Var2, 196992, 0, 65498);
                        a00Var2.q(true);
                    }
                } else {
                    a00Var2.S();
                }
                break;
            default:
                Function0 function0 = (Function0) obj6;
                so2 so2Var2 = (so2) obj5;
                final f61 f61Var = (f61) obj4;
                a00 a00Var3 = (a00) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                zn znVar = qb2.y;
                sc scVar2 = sc.o;
                ((ha1) obj).getClass();
                if (a00Var3.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                    qw a = ow.a(new yh(12.0f, true, scVar2), qb2.A, a00Var3, 6);
                    int D2 = iv1.D(a00Var3);
                    v02 l2 = a00Var3.l();
                    vl1 E2 = bd3.E(a00Var3, sl1Var);
                    pz.b.getClass();
                    o00 o00Var2 = oz.b;
                    a00Var3.b0();
                    if (a00Var3.S) {
                        a00Var3.k(o00Var2);
                    } else {
                        a00Var3.l0();
                    }
                    sc scVar3 = oz.f;
                    uj2.e(a00Var3, a, scVar3);
                    sc scVar4 = oz.e;
                    uj2.e(a00Var3, l2, scVar4);
                    sc scVar5 = oz.g;
                    if (a00Var3.S || !Intrinsics.b(a00Var3.M(), Integer.valueOf(D2))) {
                        q40.r(D2, a00Var3, D2, scVar5);
                    }
                    sc scVar6 = oz.d;
                    uj2.e(a00Var3, E2, scVar6);
                    vl1 c2 = b.c(sl1Var, 1.0f);
                    fc2 a2 = ec2.a(s93.e, qb2.z, a00Var3, 54);
                    int D3 = iv1.D(a00Var3);
                    v02 l3 = a00Var3.l();
                    vl1 E3 = bd3.E(a00Var3, c2);
                    a00Var3.b0();
                    if (a00Var3.S) {
                        a00Var3.k(o00Var2);
                    } else {
                        a00Var3.l0();
                    }
                    uj2.e(a00Var3, a2, scVar3);
                    uj2.e(a00Var3, l3, scVar4);
                    if (a00Var3.S || !Intrinsics.b(a00Var3.M(), Integer.valueOf(D3))) {
                        q40.r(D3, a00Var3, D3, scVar5);
                    }
                    uj2.e(a00Var3, E3, scVar6);
                    yv2.b(uj2.f(R.string.jewelry_title, a00Var3), null, cw.u, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var3.j(n13.a)).c, a00Var3, 384, 0, 65530);
                    String f2 = uj2.f(R.string.jewelry_add, a00Var3);
                    x01 x01Var = s03.k;
                    if (x01Var != null) {
                        str = f2;
                    } else {
                        w01 w01Var = new w01("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        ah0 ah0Var = y33.a;
                        nn2 nn2Var = new nn2(aw.b);
                        lx0 lx0Var = new lx0(1);
                        str = f2;
                        lx0Var.k(19.0f, 13.0f);
                        lx0Var.h(-6.0f);
                        lx0Var.p(6.0f);
                        lx0Var.h(-2.0f);
                        lx0Var.p(-6.0f);
                        lx0Var.g(5.0f);
                        lx0Var.p(-2.0f);
                        lx0Var.h(6.0f);
                        lx0Var.o(5.0f);
                        lx0Var.h(2.0f);
                        lx0Var.p(6.0f);
                        lx0Var.h(6.0f);
                        lx0Var.p(2.0f);
                        lx0Var.d();
                        w01.a(w01Var, lx0Var.m, nn2Var);
                        x01Var = w01Var.b();
                        s03.k = x01Var;
                    }
                    yi1.a(str, function0, null, x01Var, false, a00Var3, 0, 20);
                    a00Var3.q(true);
                    s93.p(((d61) so2Var2.getValue()).e, ((d61) so2Var2.getValue()).f, a00Var3, 0);
                    vl1 z = s03.z(b.c(sl1Var, 1.0f), s03.G(a00Var3));
                    fc2 a3 = ec2.a(new yh(8.0f, true, scVar2), znVar, a00Var3, 6);
                    int D4 = iv1.D(a00Var3);
                    v02 l4 = a00Var3.l();
                    vl1 E4 = bd3.E(a00Var3, z);
                    a00Var3.b0();
                    if (a00Var3.S) {
                        a00Var3.k(o00Var2);
                    } else {
                        a00Var3.l0();
                    }
                    uj2.e(a00Var3, a3, scVar3);
                    uj2.e(a00Var3, l4, scVar4);
                    if (a00Var3.S || !Intrinsics.b(a00Var3.M(), Integer.valueOf(D4))) {
                        q40.r(D4, a00Var3, D4, scVar5);
                    }
                    uj2.e(a00Var3, E4, scVar6);
                    String f3 = uj2.f(R.string.section_all, a00Var3);
                    boolean z2 = ((d61) so2Var2.getValue()).b == null;
                    boolean h = a00Var3.h(f61Var);
                    Object M3 = a00Var3.M();
                    if (h || M3 == njVar) {
                        i = 0;
                        M3 = new Function0() { // from class: to1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i6 = i;
                                f61 f61Var2 = f61Var;
                                switch (i6) {
                                    case 0:
                                        f61Var2.c.i(null);
                                        break;
                                    default:
                                        f61Var2.d.i(null);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        a00Var3.i0(M3);
                    } else {
                        i = 0;
                    }
                    s93.j(f3, z2, (Function0) M3, a00Var3, i);
                    a00Var3.X(-785078716);
                    for (final String str2 : b61.a) {
                        String c3 = c61.c(str2, a00Var3);
                        boolean b2 = Intrinsics.b(((d61) so2Var2.getValue()).b, str2);
                        boolean h2 = a00Var3.h(f61Var) | a00Var3.f(str2);
                        Object M4 = a00Var3.M();
                        if (h2 || M4 == njVar) {
                            final int i6 = 1;
                            M4 = new Function0() { // from class: ro1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i7 = i6;
                                    String str3 = str2;
                                    f61 f61Var2 = f61Var;
                                    switch (i7) {
                                        case 0:
                                            f61Var2.d.i(str3);
                                            break;
                                        default:
                                            f61Var2.c.i(str3);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            a00Var3.i0(M4);
                        }
                        s93.j(c3, b2, (Function0) M4, a00Var3, 0);
                    }
                    a00Var3.q(false);
                    a00Var3.q(true);
                    vl1 z3 = s03.z(b.c(sl1Var, 1.0f), s03.G(a00Var3));
                    fc2 a4 = ec2.a(new yh(8.0f, true, scVar2), znVar, a00Var3, 6);
                    int D5 = iv1.D(a00Var3);
                    v02 l5 = a00Var3.l();
                    vl1 E5 = bd3.E(a00Var3, z3);
                    pz.b.getClass();
                    o00 o00Var3 = oz.b;
                    a00Var3.b0();
                    if (a00Var3.S) {
                        a00Var3.k(o00Var3);
                    } else {
                        a00Var3.l0();
                    }
                    uj2.e(a00Var3, a4, oz.f);
                    uj2.e(a00Var3, l5, oz.e);
                    sc scVar7 = oz.g;
                    if (a00Var3.S || !Intrinsics.b(a00Var3.M(), Integer.valueOf(D5))) {
                        q40.r(D5, a00Var3, D5, scVar7);
                    }
                    uj2.e(a00Var3, E5, oz.d);
                    String f4 = uj2.f(R.string.section_all, a00Var3);
                    boolean z4 = ((d61) so2Var2.getValue()).c == null;
                    boolean h3 = a00Var3.h(f61Var);
                    Object M5 = a00Var3.M();
                    if (h3 || M5 == njVar) {
                        final int i7 = 1;
                        M5 = new Function0() { // from class: to1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i62 = i7;
                                f61 f61Var2 = f61Var;
                                switch (i62) {
                                    case 0:
                                        f61Var2.c.i(null);
                                        break;
                                    default:
                                        f61Var2.d.i(null);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        a00Var3.i0(M5);
                    }
                    s93.j(f4, z4, (Function0) M5, a00Var3, 0);
                    a00Var3.X(-1183791384);
                    for (final String str3 : b61.b) {
                        String b3 = c61.b(str3, a00Var3);
                        boolean b4 = Intrinsics.b(((d61) so2Var2.getValue()).c, str3);
                        boolean h4 = a00Var3.h(f61Var) | a00Var3.f(str3);
                        Object M6 = a00Var3.M();
                        if (h4 || M6 == njVar) {
                            i2 = 0;
                            M6 = new Function0() { // from class: ro1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i72 = i2;
                                    String str32 = str3;
                                    f61 f61Var2 = f61Var;
                                    switch (i72) {
                                        case 0:
                                            f61Var2.d.i(str32);
                                            break;
                                        default:
                                            f61Var2.c.i(str32);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            a00Var3.i0(M6);
                        } else {
                            i2 = 0;
                        }
                        s93.j(b3, b4, (Function0) M6, a00Var3, i2);
                    }
                    a00Var3.q(false);
                    a00Var3.q(true);
                    a00Var3.q(true);
                } else {
                    a00Var3.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ b5(Object obj, Object obj2, nh nhVar, int i) {
        this.m = i;
        this.o = obj;
        this.p = obj2;
        this.n = nhVar;
    }
}
