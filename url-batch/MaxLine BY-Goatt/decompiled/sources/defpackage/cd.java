package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cd extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ fz2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cd(fz2 fz2Var, int i) {
        super(0);
        this.m = i;
        this.n = fz2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        fz2 fz2Var = this.n;
        switch (i) {
            case 0:
                Object j = fz2Var.a.j();
                th0 th0Var = th0.o;
                return Boolean.valueOf(j == th0Var && fz2Var.d.getValue() == th0Var);
            default:
                return Long.valueOf(fz2Var.b());
        }
    }
}
