package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yh0 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ zh0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yh0(zh0 zh0Var, int i) {
        super(1);
        this.m = i;
        this.n = zh0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        th0 th0Var = th0.o;
        th0 th0Var2 = th0.n;
        th0 th0Var3 = th0.m;
        zh0 zh0Var = this.n;
        switch (i) {
            case 0:
                cz2 cz2Var = (cz2) obj;
                boolean a = cz2Var.a(th0Var3, th0Var2);
                eo2 eo2Var = null;
                if (!a) {
                    if (cz2Var.a(th0Var2, th0Var)) {
                        gz2 gz2Var = zh0Var.B.a;
                    } else {
                        eo2Var = xh0.d;
                    }
                }
                return eo2Var == null ? xh0.d : eo2Var;
            default:
                cz2 cz2Var2 = (cz2) obj;
                if (cz2Var2.a(th0Var3, th0Var2)) {
                    return xh0.c;
                }
                if (!cz2Var2.a(th0Var2, th0Var)) {
                    return xh0.c;
                }
                gz2 gz2Var2 = zh0Var.B.a;
                return xh0.c;
        }
    }
}
