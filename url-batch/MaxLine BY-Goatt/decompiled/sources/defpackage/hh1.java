package defpackage;

import androidx.compose.foundation.layout.b;
import com.majelw.libystne.MainActivity2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class hh1 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ MainActivity2 n;
    public final /* synthetic */ zn1 o;

    public /* synthetic */ hh1(MainActivity2 mainActivity2, zn1 zn1Var, int i) {
        this.m = i;
        this.n = mainActivity2;
        this.o = zn1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        zn1 zn1Var = this.o;
        MainActivity2 mainActivity2 = this.n;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                a00 a00Var = (a00) obj;
                int intValue = ((Integer) obj2).intValue();
                int i4 = MainActivity2.n;
                if (a00Var.P(intValue & 1, (intValue & 3) != 2)) {
                    kr2.a(b.b(sl1.a, 1.0f), null, 0L, 0L, yj1.H(504546072, new hh1(mainActivity2, zn1Var, i3), a00Var), a00Var, 12582918, 126);
                } else {
                    a00Var.S();
                }
                break;
            default:
                a00 a00Var2 = (a00) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i5 = MainActivity2.n;
                if (!a00Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    a00Var2.S();
                } else if (((Boolean) zn1Var.getValue()).booleanValue()) {
                    a00Var2.X(-1453467381);
                    ap.a(null, a00Var2, 0);
                    a00Var2.q(false);
                } else {
                    a00Var2.X(-1453390966);
                    boolean h = a00Var2.h(mainActivity2) | a00Var2.f(zn1Var);
                    Object M = a00Var2.M();
                    if (h || M == sz.a) {
                        M = new h00(i2, mainActivity2, zn1Var);
                        a00Var2.i0(M);
                    }
                    zm3.c((Function0) M, a00Var2, 0);
                    a00Var2.q(false);
                }
                break;
        }
        return Unit.a;
    }
}
