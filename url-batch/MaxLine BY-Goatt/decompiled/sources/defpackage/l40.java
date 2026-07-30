package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l40 extends o81 implements Function2 {
    public final /* synthetic */ gv2 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l40(gv2 gv2Var, boolean z, int i) {
        super(2);
        this.m = gv2Var;
        this.n = z;
        this.o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = s03.R(this.o | 1);
        s93.s(this.m, this.n, (a00) obj, R);
        return Unit.a;
    }
}
