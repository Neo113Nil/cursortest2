package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vg1 extends o81 implements Function0 {
    public final /* synthetic */ xg1 m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg1(xg1 xg1Var, long j) {
        super(0);
        this.m = xg1Var;
        this.n = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        sg1 O0 = this.m.r.a().O0();
        O0.getClass();
        O0.c(this.n);
        return Unit.a;
    }
}
