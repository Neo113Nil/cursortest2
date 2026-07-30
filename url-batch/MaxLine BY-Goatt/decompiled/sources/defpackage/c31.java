package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c31 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ n12 o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c31(int i, n12 n12Var, int i2) {
        super(1);
        this.m = 1;
        this.n = i;
        this.o = n12Var;
        this.p = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        int i2 = this.p;
        int i3 = this.n;
        n12 n12Var = this.o;
        switch (i) {
            case 0:
                m12.g((m12) obj, n12Var, i3, i2);
                break;
            case 1:
                m12.g((m12) obj, n12Var, si1.b((i3 - n12Var.m) / 2.0f), si1.b((i2 - n12Var.n) / 2.0f));
                break;
            case 2:
                m12.j((m12) obj, n12Var, i3, i2);
                break;
            default:
                m12.g((m12) obj, n12Var, -i3, -i2);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c31(n12 n12Var, int i, int i2, int i3) {
        super(1);
        this.m = i3;
        this.o = n12Var;
        this.n = i;
        this.p = i2;
    }
}
