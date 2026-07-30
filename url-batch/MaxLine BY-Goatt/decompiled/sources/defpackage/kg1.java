package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kg1 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ bu2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg1(bu2 bu2Var, int i) {
        super(0);
        this.m = i;
        this.n = bu2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.m) {
            case 0:
                this.n.a();
                break;
            default:
                this.n.onCancel();
                break;
        }
        return Unit.a;
    }
}
