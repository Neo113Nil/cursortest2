package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jg1 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ bu2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jg1(bu2 bu2Var, int i) {
        super(1);
        this.m = i;
        this.n = bu2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        bu2 bu2Var = this.n;
        switch (i) {
            case 0:
                bu2Var.c(((au1) obj).a);
                break;
            default:
                t22 t22Var = (t22) obj;
                bu2Var.e(s93.P(t22Var, false));
                t22Var.a();
                break;
        }
        return Unit.a;
    }
}
