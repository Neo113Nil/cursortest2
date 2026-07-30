package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lq1 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ so2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lq1(so2 so2Var, int i) {
        super(1);
        this.m = i;
        this.n = so2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                ((ia2) obj).a(((Number) this.n.getValue()).floatValue());
                break;
            default:
                ((ia2) obj).a(((Number) this.n.getValue()).floatValue());
                break;
        }
        return Unit.a;
    }
}
