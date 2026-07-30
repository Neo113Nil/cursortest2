package defpackage;

import androidx.compose.material3.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yr2 extends o81 implements Function2 {
    public final /* synthetic */ vl1 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ wr2 p;
    public final /* synthetic */ b41 q;
    public final /* synthetic */ fk2 r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr2(vl1 vl1Var, boolean z, boolean z2, wr2 wr2Var, b41 b41Var, fk2 fk2Var, int i) {
        super(2);
        this.m = vl1Var;
        this.n = z;
        this.o = z2;
        this.p = wr2Var;
        this.q = b41Var;
        this.r = fk2Var;
        this.s = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        a.b(this.m, this.n, this.o, this.p, this.q, this.r, (a00) obj, s03.R(this.s | 1));
        return Unit.a;
    }
}
