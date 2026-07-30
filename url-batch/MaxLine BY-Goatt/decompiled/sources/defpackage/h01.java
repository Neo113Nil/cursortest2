package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h01 extends o81 implements Function2 {
    public final /* synthetic */ Function0 m;
    public final /* synthetic */ vl1 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ g01 p;
    public final /* synthetic */ my q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h01(Function0 function0, vl1 vl1Var, boolean z, g01 g01Var, my myVar, int i) {
        super(2);
        this.m = function0;
        this.n = vl1Var;
        this.o = z;
        this.p = g01Var;
        this.q = myVar;
        this.r = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ap.h(this.m, this.n, this.o, this.p, this.q, (a00) obj, s03.R(this.r | 1));
        return Unit.a;
    }
}
