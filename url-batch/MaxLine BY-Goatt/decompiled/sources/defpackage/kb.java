package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kb extends o81 implements Function2 {
    public final /* synthetic */ du1 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ k92 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ long q;
    public final /* synthetic */ vl1 r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(du1 du1Var, boolean z, k92 k92Var, boolean z2, long j, vl1 vl1Var, int i) {
        super(2);
        this.m = du1Var;
        this.n = z;
        this.o = k92Var;
        this.p = z2;
        this.q = j;
        this.r = vl1Var;
        this.s = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        iv1.j(this.m, this.n, this.o, this.p, this.q, this.r, (a00) obj, s03.R(this.s | 1));
        return Unit.a;
    }
}
