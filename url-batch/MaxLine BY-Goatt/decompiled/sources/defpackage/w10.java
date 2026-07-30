package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class w10 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ n12 n;

    public /* synthetic */ w10(n12 n12Var, int i) {
        this.m = i;
        this.n = n12Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        n12 n12Var = this.n;
        m12 m12Var = (m12) obj;
        switch (i) {
            case 0:
                m12.g(m12Var, n12Var, 0, 0);
                break;
            default:
                m12.i(m12Var, n12Var, 0, 0);
                break;
        }
        return Unit.a;
    }
}
