package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cc1 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ ec1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc1(ec1 ec1Var, int i) {
        super(1);
        this.m = i;
        this.n = ec1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        int i2 = 0;
        ec1 ec1Var = this.n;
        switch (i) {
            case 0:
                mb1 mb1Var = (mb1) ec1Var.A.invoke();
                int b = mb1Var.b();
                while (true) {
                    if (i2 >= b) {
                        i2 = -1;
                    } else if (!mb1Var.d(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int intValue = ((Number) obj).intValue();
                mb1 mb1Var2 = (mb1) ec1Var.A.invoke();
                if (intValue >= 0 && intValue < mb1Var2.b()) {
                    z71.H(ec1Var.u0(), null, new dc1(ec1Var, intValue, null, i2), 3);
                    return Boolean.TRUE;
                }
                StringBuilder n = in1.n(intValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                n.append(mb1Var2.b());
                n.append(')');
                throw new IllegalArgumentException(n.toString().toString());
        }
    }
}
