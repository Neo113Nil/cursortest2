package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gu2 extends o81 implements Function2 {
    public final /* synthetic */ by1 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ Function2 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ ch2 r;
    public final /* synthetic */ b41 s;
    public final /* synthetic */ Function2 t;
    public final /* synthetic */ Function2 u;
    public final /* synthetic */ fk2 v;
    public final /* synthetic */ du2 w;
    public final /* synthetic */ yx1 x;
    public final /* synthetic */ Function2 y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu2(by1 by1Var, String str, Function2 function2, boolean z, boolean z2, ch2 ch2Var, b41 b41Var, Function2 function22, Function2 function23, fk2 fk2Var, du2 du2Var, yx1 yx1Var, Function2 function24, int i) {
        super(2);
        this.m = by1Var;
        this.n = str;
        this.o = function2;
        this.p = z;
        this.q = z2;
        this.r = ch2Var;
        this.s = b41Var;
        this.t = function22;
        this.u = function23;
        this.v = fk2Var;
        this.w = du2Var;
        this.x = yx1Var;
        this.y = function24;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = s03.R(this.z | 1);
        this.m.m(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, (a00) obj, R);
        return Unit.a;
    }
}
