package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class en extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ fn n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ en(fn fnVar, int i) {
        super(0);
        this.m = i;
        this.n = fnVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        fn fnVar = this.n;
        switch (i) {
            case 0:
                fnVar.I0();
                break;
            default:
                tl1 tl1Var = fnVar.A;
                tl1Var.getClass();
                ((wl1) tl1Var).f(fnVar);
                break;
        }
        return Unit.a;
    }
}
