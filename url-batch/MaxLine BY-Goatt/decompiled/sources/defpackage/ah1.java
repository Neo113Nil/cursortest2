package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ah1 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ bh1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ah1(bh1 bh1Var, int i) {
        super(0);
        this.m = i;
        this.n = bh1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        bh1 bh1Var = this.n;
        switch (i) {
            case 0:
                t81 t81Var = (t81) bh1Var.G.getValue();
                return new au1(t81Var != null ? t81Var.T(0L) : 9205357640488583168L);
            case 1:
                return new au1(bh1Var.I);
            default:
                bh1Var.I0();
                return Unit.a;
        }
    }
}
