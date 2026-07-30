package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sn extends o81 implements Function2 {
    public final /* synthetic */ String m;
    public final /* synthetic */ vl1 n;
    public final /* synthetic */ pw2 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(String str, vl1 vl1Var, pw2 pw2Var, int i, boolean z, int i2, int i3, int i4, int i5) {
        super(2);
        this.m = str;
        this.n = vl1Var;
        this.o = pw2Var;
        this.p = i;
        this.q = z;
        this.r = i2;
        this.s = i3;
        this.t = i4;
        this.u = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ll3.a(this.m, this.n, this.o, this.p, this.q, this.r, this.s, (a00) obj, s03.R(this.t | 1), this.u);
        return Unit.a;
    }
}
