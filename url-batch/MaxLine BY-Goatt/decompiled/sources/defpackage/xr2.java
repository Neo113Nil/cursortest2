package defpackage;

import androidx.compose.material3.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xr2 extends o81 implements Function2 {
    public final /* synthetic */ boolean m;
    public final /* synthetic */ Function1 n;
    public final /* synthetic */ vl1 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ wr2 q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr2(boolean z, Function1 function1, vl1 vl1Var, boolean z2, wr2 wr2Var, int i) {
        super(2);
        this.m = z;
        this.n = function1;
        this.o = vl1Var;
        this.p = z2;
        this.q = wr2Var;
        this.r = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        a.a(this.m, this.n, this.o, this.p, this.q, (a00) obj, s03.R(this.r | 1));
        return Unit.a;
    }
}
