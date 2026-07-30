package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j01 extends o81 implements Function2 {
    public final /* synthetic */ xy1 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ vl1 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j01(xy1 xy1Var, String str, vl1 vl1Var, long j, int i) {
        super(2);
        this.m = xy1Var;
        this.n = str;
        this.o = vl1Var;
        this.p = j;
        this.q = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        k01.b(this.m, this.n, this.o, this.p, (a00) obj, s03.R(this.q | 1));
        return Unit.a;
    }
}
