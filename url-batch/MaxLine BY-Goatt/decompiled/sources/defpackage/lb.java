package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lb extends o81 implements Function1 {
    public final /* synthetic */ du1 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(du1 du1Var, boolean z, boolean z2) {
        super(1);
        this.m = du1Var;
        this.n = z;
        this.o = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        sh2 sh2Var = (sh2) obj;
        long a = this.m.a();
        sh2Var.d(lh2.a, new kh2(this.n ? xw0.n : xw0.o, a, this.o ? 1 : 3, ap.D(a)));
        return Unit.a;
    }
}
