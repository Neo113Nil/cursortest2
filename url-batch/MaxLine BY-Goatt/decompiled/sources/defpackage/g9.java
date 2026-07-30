package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class g9 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ eb0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g9(eb0 eb0Var, int i) {
        super(1);
        this.m = i;
        this.n = eb0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        eb0 eb0Var = this.n;
        switch (i) {
            case 0:
                return new l4(2, eb0Var);
            default:
                if (eb0Var.r.a) {
                    eb0Var.q.invoke();
                }
                return Unit.a;
        }
    }
}
