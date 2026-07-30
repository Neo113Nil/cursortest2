package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class np1 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ lp1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ np1(lp1 lp1Var, int i) {
        super(1);
        this.m = i;
        this.n = lp1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        lp1 lp1Var = this.n;
        switch (i) {
            case 0:
                ((String) obj).getClass();
                return Boolean.valueOf(!lp1Var.c().contains(r2));
            default:
                ((String) obj).getClass();
                return Boolean.valueOf(!lp1Var.c().contains(r2));
        }
    }
}
