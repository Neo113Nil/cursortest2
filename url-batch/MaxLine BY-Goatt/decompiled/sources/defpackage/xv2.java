package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xv2 extends o81 implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ String m;
    public final /* synthetic */ vl1 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ long p;
    public final /* synthetic */ jq0 q;
    public final /* synthetic */ long r;
    public final /* synthetic */ ut2 s;
    public final /* synthetic */ long t;
    public final /* synthetic */ int u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ pw2 y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv2(String str, vl1 vl1Var, long j, long j2, jq0 jq0Var, long j3, ut2 ut2Var, long j4, int i, boolean z, int i2, int i3, pw2 pw2Var, int i4, int i5, int i6) {
        super(2);
        this.m = str;
        this.n = vl1Var;
        this.o = j;
        this.p = j2;
        this.q = jq0Var;
        this.r = j3;
        this.s = ut2Var;
        this.t = j4;
        this.u = i;
        this.v = z;
        this.w = i2;
        this.x = i3;
        this.y = pw2Var;
        this.z = i4;
        this.A = i5;
        this.B = i6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = s03.R(this.z | 1);
        int R2 = s03.R(this.A);
        int i = this.B;
        yv2.b(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, (a00) obj, R, R2, i);
        return Unit.a;
    }
}
