package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bc1 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ ec1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bc1(ec1 ec1Var, int i) {
        super(0);
        this.m = i;
        this.n = ec1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        ec1 ec1Var = this.n;
        switch (i) {
            case 0:
                return Float.valueOf(ec1Var.B.a() - ec1Var.B.e());
            case 1:
                return Float.valueOf(ec1Var.B.b());
            default:
                return Float.valueOf(ec1Var.B.f());
        }
    }
}
