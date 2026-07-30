package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y30 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ gv2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y30(gv2 gv2Var, int i) {
        super(1);
        this.m = i;
        this.n = gv2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        gv2 gv2Var = this.n;
        switch (i) {
            case 0:
                return new l4(4, gv2Var);
            default:
                long j = ((au1) obj).a;
                gv2Var.o();
                return Unit.a;
        }
    }
}
