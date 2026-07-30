package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hx1 extends o81 implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ String m;
    public final /* synthetic */ Function1 n;
    public final /* synthetic */ vl1 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ pw2 q;
    public final /* synthetic */ Function2 r;
    public final /* synthetic */ ch2 s;
    public final /* synthetic */ g81 t;
    public final /* synthetic */ f81 u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ fk2 y;
    public final /* synthetic */ du2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx1(String str, Function1 function1, vl1 vl1Var, boolean z, pw2 pw2Var, Function2 function2, ch2 ch2Var, g81 g81Var, f81 f81Var, boolean z2, int i, int i2, fk2 fk2Var, du2 du2Var, int i3, int i4) {
        super(2);
        this.m = str;
        this.n = function1;
        this.o = vl1Var;
        this.p = z;
        this.q = pw2Var;
        this.r = function2;
        this.s = ch2Var;
        this.t = g81Var;
        this.u = f81Var;
        this.v = z2;
        this.w = i;
        this.x = i2;
        this.y = fk2Var;
        this.z = du2Var;
        this.A = i3;
        this.B = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = s03.R(this.A | 1);
        int R2 = s03.R(this.B);
        kx1.a(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, (a00) obj, R, R2);
        return Unit.a;
    }
}
