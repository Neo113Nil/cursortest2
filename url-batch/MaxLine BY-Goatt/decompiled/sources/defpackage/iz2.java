package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class iz2 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ fz2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iz2(fz2 fz2Var, int i) {
        super(1);
        this.m = i;
        this.n = fz2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        fz2 fz2Var = this.n;
        switch (i) {
            case 0:
                return new hz2(fz2Var, 0);
            default:
                return new hz2(fz2Var, 1);
        }
    }
}
