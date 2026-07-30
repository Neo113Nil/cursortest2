package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pg2 extends pr2 implements Function2 {
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ tg2 q;
    public final /* synthetic */ fz2 r;
    public final /* synthetic */ float s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg2(Object obj, Object obj2, tg2 tg2Var, fz2 fz2Var, float f, o30 o30Var) {
        super(2, o30Var);
        this.o = obj;
        this.p = obj2;
        this.q = tg2Var;
        this.r = fz2Var;
        this.s = f;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        pg2 pg2Var = new pg2(this.o, this.p, this.q, this.r, this.s, o30Var);
        pg2Var.n = obj;
        return pg2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pg2) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        b50 b50Var = b50.m;
        int i = this.m;
        o30 o30Var = null;
        tg2 tg2Var = this.q;
        if (i == 0) {
            ca2.b(obj);
            a50 a50Var = (a50) this.n;
            Object obj2 = this.o;
            Object obj3 = this.p;
            if (Intrinsics.b(obj2, obj3)) {
                tg2Var.z = null;
                if (Intrinsics.b(tg2Var.o.getValue(), obj2)) {
                    return Unit.a;
                }
            } else {
                tg2.x(tg2Var);
            }
            boolean b = Intrinsics.b(obj2, obj3);
            float f = this.s;
            if (!b) {
                fz2 fz2Var = this.r;
                fz2Var.q(obj2);
                fz2Var.o(0L);
                tg2Var.n.setValue(obj2);
                fz2Var.j(f);
            }
            tg2Var.G(f);
            if (tg2Var.y.h()) {
                z71.H(a50Var, null, new fj(7, o30Var, tg2Var), 3);
            } else {
                tg2Var.x = Long.MIN_VALUE;
            }
            this.m = 1;
            if (tg2.B(tg2Var, this) == b50Var) {
                return b50Var;
            }
        } else {
            if (i != 1) {
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ca2.b(obj);
        }
        tg2Var.F();
        return Unit.a;
    }
}
