package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yn0 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ zn0 n;
    public final /* synthetic */ bo0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn0(zn0 zn0Var, bo0 bo0Var, int i) {
        super(1);
        this.m = i;
        this.n = zn0Var;
        this.o = bo0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2;
        int i3 = this.m;
        bo0 bo0Var = this.o;
        int i4 = 0;
        zn0 zn0Var = this.n;
        switch (i3) {
            case 0:
                n12 n12Var = (n12) obj;
                if (n12Var != null) {
                    bo0Var.getClass();
                    i4 = n12Var.e0();
                    i = n12Var.d0();
                } else {
                    i = 0;
                }
                zn0Var.e = new n31(n31.a(i4, i));
                zn0Var.b = n12Var;
                break;
            default:
                n12 n12Var2 = (n12) obj;
                if (n12Var2 != null) {
                    bo0Var.getClass();
                    i4 = n12Var2.e0();
                    i2 = n12Var2.d0();
                } else {
                    i2 = 0;
                }
                zn0Var.f = new n31(n31.a(i4, i2));
                zn0Var.d = n12Var2;
                break;
        }
        return Unit.a;
    }
}
