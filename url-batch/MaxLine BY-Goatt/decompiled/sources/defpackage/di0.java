package defpackage;

import com.majelw.libystne.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class di0 implements Function2 {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ Function0 n;

    public /* synthetic */ di0(int i, Function0 function0) {
        this.n = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        Function0 function0 = this.n;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                zm3.c(function0, (a00) obj, s03.R(1));
                break;
            default:
                a00 a00Var = (a00) obj;
                int intValue = ((Integer) obj2).intValue();
                if (a00Var.P(intValue & 1, (intValue & 3) != 2)) {
                    String f = uj2.f(R.string.set_insights, a00Var);
                    boolean f2 = a00Var.f(function0);
                    Object M = a00Var.M();
                    if (f2 || M == sz.a) {
                        M = new dj(13, function0);
                        a00Var.i0(M);
                    }
                    zj2.a(f, false, (Function0) M, a00Var, 0, 2);
                } else {
                    a00Var.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ di0(Function0 function0) {
        this.n = function0;
    }
}
