package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a9 extends o81 implements Function2 {
    public final /* synthetic */ vl1 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(vl1 vl1Var, int i, int i2) {
        super(2);
        this.m = vl1Var;
        this.n = i;
        this.o = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = s03.R(this.n | 1);
        int i = this.o;
        e9.b(this.m, (a00) obj, R, i);
        return Unit.a;
    }
}
