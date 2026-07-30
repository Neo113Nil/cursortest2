package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i01 extends o81 implements Function2 {
    public final /* synthetic */ x01 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ vl1 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i01(x01 x01Var, String str, vl1 vl1Var, long j, int i, int i2) {
        super(2);
        this.m = x01Var;
        this.n = str;
        this.o = vl1Var;
        this.p = j;
        this.q = i;
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        k01.a(this.m, this.n, this.o, this.p, (a00) obj, s03.R(this.q | 1), this.r);
        return Unit.a;
    }
}
