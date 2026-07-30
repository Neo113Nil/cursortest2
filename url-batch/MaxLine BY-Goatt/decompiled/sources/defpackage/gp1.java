package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gp1 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ up1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gp1(up1 up1Var, int i) {
        super(1);
        this.m = i;
        this.n = up1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        up1 up1Var = this.n;
        switch (i) {
            case 0:
                ((op1) obj).getClass();
                return Boolean.valueOf(!up1Var.m.containsKey(Integer.valueOf(r2.r)));
            default:
                ((op1) obj).getClass();
                return Boolean.valueOf(!up1Var.m.containsKey(Integer.valueOf(r2.r)));
        }
    }
}
