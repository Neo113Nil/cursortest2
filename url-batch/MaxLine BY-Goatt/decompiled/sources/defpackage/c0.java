package defpackage;

import androidx.compose.foundation.d;
import androidx.compose.ui.layout.a;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c0 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i, int i2, Object obj) {
        super(2);
        this.m = i2;
        this.n = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        sl1 sl1Var = sl1.a;
        boolean z = false;
        Object obj3 = this.n;
        switch (i) {
            case 0:
                a00 a00Var = (a00) obj;
                int intValue = ((Number) obj2).intValue();
                if (a00Var.P(intValue & 1, (intValue & 3) != 2)) {
                    ((d0) obj3).b(0, a00Var);
                } else {
                    a00Var.S();
                }
                return Unit.a;
            case 1:
                ((v8) obj3).k(((Number) obj).intValue(), (ai2) obj2);
                return Unit.a;
            case 2:
                a00 a00Var2 = (a00) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (a00Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object M = a00Var2.M();
                    if (M == sz.a) {
                        M = o3.s;
                        a00Var2.i0(M);
                    }
                    j8.g(wh2.a(sl1Var, (Function1) M), (Function2) ((zn1) obj3).getValue(), a00Var2, 0);
                } else {
                    a00Var2.S();
                }
                return Unit.a;
            case 3:
                th0 th0Var = (th0) obj;
                th0 th0Var2 = (th0) obj2;
                th0 th0Var3 = th0.o;
                if (th0Var == th0Var3 && th0Var2 == th0Var3 && !((uj0) obj3).a.b) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                ((Number) obj2).intValue();
                fp.a((vl1) obj3, (a00) obj, s03.R(1));
                return Unit.a;
            case 5:
                ((Number) obj2).intValue();
                ((qz) obj3).b(s03.R(1), (a00) obj);
                return Unit.a;
            case 6:
                vl1 vl1Var = (vl1) obj;
                vl1 vl1Var2 = (tl1) obj2;
                a00 a00Var3 = (a00) obj3;
                if (vl1Var2 instanceof rz) {
                    xt0 xt0Var = ((rz) vl1Var2).r;
                    s03.f(3, xt0Var);
                    vl1Var2 = bd3.D(a00Var3, (vl1) xt0Var.a(sl1Var, a00Var3, 0));
                }
                return vl1Var.k(vl1Var2);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Number) obj2).intValue();
                s93.r((gv2) obj3, (a00) obj, s03.R(1));
                return Unit.a;
            case 8:
                ((Number) obj2).intValue();
                yk3.e((ab0) obj3, (a00) obj, s03.R(1));
                return Unit.a;
            case 9:
                ((Number) obj2).intValue();
                ((ya0) obj3).b(s03.R(1), (a00) obj);
                return Unit.a;
            case 10:
                a00 a00Var4 = (a00) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (a00Var4.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    List list = (List) obj3;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Function2 function2 = (Function2) list.get(i2);
                        int hashCode = Long.hashCode(a00Var4.T);
                        pz.b.getClass();
                        k8 k8Var = oz.c;
                        a00Var4.b0();
                        if (a00Var4.S) {
                            a00Var4.k(k8Var);
                        } else {
                            a00Var4.l0();
                        }
                        sc scVar = oz.g;
                        if (a00Var4.S || !Intrinsics.b(a00Var4.M(), Integer.valueOf(hashCode))) {
                            q40.r(hashCode, a00Var4, hashCode, scVar);
                        }
                        function2.invoke(a00Var4, 0);
                        a00Var4.q(true);
                    }
                } else {
                    a00Var4.S();
                }
                return Unit.a;
            case 11:
                ((Number) obj2).intValue();
                return new mw0(((mw0) ((Function1) obj3).invoke((ra1) obj)).a);
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                ((bu2) obj3).e(((au1) obj2).a);
                return Unit.a;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                a00 a00Var5 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var5.B()) {
                    a00Var5.S();
                } else {
                    fp.a(d.a(yk3.u(a.c(sl1Var, "indicatorRipple"), kk2.a(5, a00Var5)), (ii1) obj3, za2.a(a00Var5, 0, 7)), a00Var5, 0);
                }
                return Unit.a;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                ry1 ry1Var = (ry1) obj3;
                ry1Var.r.i(ry1Var.i(((Number) obj2).intValue()));
                return Unit.a;
            case 15:
                ((Number) obj2).intValue();
                ((m32) obj3).b(s03.R(1), (a00) obj);
                return Unit.a;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                tf2 tf2Var = (tf2) obj3;
                z71.H(tf2Var.u0(), null, new sf2(tf2Var, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                return new s31(yk3.h(0, ((zn) obj3).a(0, (int) (4294967295L & ((x31) obj).a))));
            default:
                return new s31(((ao) obj3).a(0L, ((x31) obj).a, (u81) obj2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i, Object obj) {
        super(2);
        this.m = i;
        this.n = obj;
    }
}
