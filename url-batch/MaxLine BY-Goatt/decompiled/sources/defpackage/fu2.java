package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fu2 extends o81 implements Function2 {
    public final /* synthetic */ by1 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ b41 o;
    public final /* synthetic */ du2 p;
    public final /* synthetic */ fk2 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu2(by1 by1Var, boolean z, b41 b41Var, du2 du2Var, fk2 fk2Var, int i) {
        super(2);
        this.m = by1Var;
        this.n = z;
        this.o = b41Var;
        this.p = du2Var;
        this.q = fk2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = s03.R(114822145);
        this.m.l(this.n, this.o, this.p, this.q, (a00) obj, R);
        return Unit.a;
    }
}
