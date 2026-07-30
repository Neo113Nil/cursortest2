package defpackage;

import com.majelw.libystne.MainActivity2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ju0 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object o;

    public /* synthetic */ ju0(boolean z, MainActivity2 mainActivity2) {
        this.m = 1;
        this.n = z;
        this.o = mainActivity2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        Object obj3 = this.o;
        final boolean z = this.n;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                bd3.d(z, (Function0) obj3, (a00) obj, s03.R(1));
                break;
            case 1:
                MainActivity2 mainActivity2 = (MainActivity2) obj3;
                a00 a00Var = (a00) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = MainActivity2.n;
                int i3 = 0;
                if (a00Var.P(intValue & 1, (intValue & 3) != 2)) {
                    Object[] objArr = new Object[0];
                    boolean g = a00Var.g(z);
                    Object M = a00Var.M();
                    if (g || M == sz.a) {
                        M = new Function0() { // from class: gh1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i4 = MainActivity2.n;
                                return ij2.j(Boolean.valueOf(z));
                            }
                        };
                        a00Var.i0(M);
                    }
                    ww2.a(false, yj1.H(-825771907, new hh1(mainActivity2, (zn1) ll3.R(objArr, (Function0) M, a00Var, 0), i3), a00Var), a00Var, 432);
                } else {
                    a00Var.S();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ap.j(z, (Function2) obj3, (a00) obj, s03.R(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ww2.a(z, (my) obj3, (a00) obj, s03.R(433));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ju0(boolean z, tt0 tt0Var, int i, int i2) {
        this.m = i2;
        this.n = z;
        this.o = tt0Var;
    }
}
