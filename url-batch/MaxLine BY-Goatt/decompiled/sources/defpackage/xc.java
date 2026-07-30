package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xc extends o81 implements Function1 {
    public final /* synthetic */ zc m;
    public final /* synthetic */ n12 n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(zc zcVar, n12 n12Var, long j) {
        super(1);
        this.m = zcVar;
        this.n = n12Var;
        this.o = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f6 f6Var = this.m.b;
        n12 n12Var = this.n;
        m12.h((m12) obj, n12Var, f6Var.a(zm3.d(n12Var.m, n12Var.n), this.o, u81.m));
        return Unit.a;
    }
}
