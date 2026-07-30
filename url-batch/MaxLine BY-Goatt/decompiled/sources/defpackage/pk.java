package defpackage;

import android.content.Context;
import com.majelw.libystne.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class pk implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ pk(Function1 function1, vl1 vl1Var, zk zkVar, int i) {
        this.m = 0;
        this.n = function1;
        this.o = vl1Var;
        this.p = zkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        nj njVar = sz.a;
        int i2 = 2;
        Object obj3 = this.p;
        Object obj4 = this.o;
        Object obj5 = this.n;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                s93.e((Function1) obj5, (vl1) obj4, (zk) obj3, (a00) obj, s03.R(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                bd3.e((String) obj4, (Function0) obj3, (Function1) obj5, sl1.a, (a00) obj, s03.R(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                zj2.d((List) obj4, (String) obj3, (Function1) obj5, (a00) obj, s03.R(1));
                break;
            case 3:
                Context context = (Context) obj5;
                zn1 zn1Var = (zn1) obj4;
                zn1 zn1Var2 = (zn1) obj3;
                a00 a00Var = (a00) obj;
                int intValue = ((Integer) obj2).intValue();
                if (a00Var.P(1 & intValue, (intValue & 3) != 2)) {
                    String f = uj2.f(R.string.rem_clean, a00Var);
                    boolean booleanValue = ((Boolean) zn1Var.getValue()).booleanValue();
                    boolean h = a00Var.h(context);
                    Object M = a00Var.M();
                    if (h || M == njVar) {
                        M = new vj2(context, zn1Var, 3);
                        a00Var.i0(M);
                    }
                    zj2.f(f, booleanValue, (Function1) M, a00Var, 0);
                    String f2 = uj2.f(R.string.rem_gem, a00Var);
                    boolean booleanValue2 = ((Boolean) zn1Var2.getValue()).booleanValue();
                    boolean h2 = a00Var.h(context);
                    Object M2 = a00Var.M();
                    if (h2 || M2 == njVar) {
                        M2 = new vj2(context, zn1Var2, 4);
                        a00Var.i0(M2);
                    }
                    zj2.f(f2, booleanValue2, (Function1) M2, a00Var, 0);
                } else {
                    a00Var.S();
                }
                break;
            default:
                a50 a50Var = (a50) obj5;
                ij1 ij1Var = (ij1) obj4;
                zn1 zn1Var3 = (zn1) obj3;
                a00 a00Var2 = (a00) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (a00Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean h3 = a00Var2.h(a50Var) | a00Var2.h(ij1Var);
                    Object M3 = a00Var2.M();
                    if (h3 || M3 == njVar) {
                        M3 = new uz(a50Var, zn1Var3, ij1Var, i2);
                        a00Var2.i0(M3);
                    }
                    s93.q((Function0) M3, null, false, null, null, null, s93.f, a00Var2, 805306368);
                } else {
                    a00Var2.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ pk(Object obj, Object obj2, Function1 function1, int i, int i2) {
        this.m = i2;
        this.o = obj;
        this.p = obj2;
        this.n = function1;
    }

    public /* synthetic */ pk(Object obj, Object obj2, zn1 zn1Var, int i) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
        this.p = zn1Var;
    }
}
