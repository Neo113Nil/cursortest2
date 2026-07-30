package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c40 extends o81 implements Function2 {
    public final /* synthetic */ my A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ nv2 m;
    public final /* synthetic */ Function1 n;
    public final /* synthetic */ vl1 o;
    public final /* synthetic */ pw2 p;
    public final /* synthetic */ ch2 q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ bn1 s;
    public final /* synthetic */ nn2 t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ c11 x;
    public final /* synthetic */ f81 y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(nv2 nv2Var, Function1 function1, vl1 vl1Var, pw2 pw2Var, ch2 ch2Var, Function1 function12, bn1 bn1Var, nn2 nn2Var, boolean z, int i, int i2, c11 c11Var, f81 f81Var, boolean z2, my myVar, int i3, int i4) {
        super(2);
        this.m = nv2Var;
        this.n = function1;
        this.o = vl1Var;
        this.p = pw2Var;
        this.q = ch2Var;
        this.r = function12;
        this.s = bn1Var;
        this.t = nn2Var;
        this.u = z;
        this.v = i;
        this.w = i2;
        this.x = c11Var;
        this.y = f81Var;
        this.z = z2;
        this.A = myVar;
        this.B = i3;
        this.C = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = s03.R(this.B | 1);
        int R2 = s03.R(this.C);
        s93.h(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, (a00) obj, R, R2);
        return Unit.a;
    }
}
