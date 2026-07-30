package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.material3.MinimumInteractiveModifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jr2 extends o81 implements Function2 {
    public final /* synthetic */ vl1 m;
    public final /* synthetic */ fk2 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ float p;
    public final /* synthetic */ bn1 q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ float t;
    public final /* synthetic */ my u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr2(vl1 vl1Var, fk2 fk2Var, long j, float f, bn1 bn1Var, boolean z, Function0 function0, float f2, my myVar) {
        super(2);
        this.m = vl1Var;
        this.n = fk2Var;
        this.o = j;
        this.p = f;
        this.q = bn1Var;
        this.r = z;
        this.s = function0;
        this.t = f2;
        this.u = myVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a00 a00Var = (a00) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
            a00Var.S();
        } else {
            bp2 bp2Var = c41.a;
            vl1 k = this.m.k(MinimumInteractiveModifier.a);
            vl1 d = a.d(kr2.b(((ca0) a00Var.j(p00.h)).D(this.t), kr2.c(this.o, this.p, a00Var), k, this.n), this.q, za2.a(a00Var, 0, 7), this.r, null, this.s, 24);
            oj1 e = fp.e(qb2.p, true);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, d);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e, oz.f);
            uj2.e(a00Var, l, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            this.u.invoke(a00Var, 0);
            a00Var.q(true);
        }
        return Unit.a;
    }
}
