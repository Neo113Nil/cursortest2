package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qg2 extends pr2 implements Function1 {
    public int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ tg2 p;
    public final /* synthetic */ fz2 q;
    public final /* synthetic */ float r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg2(Object obj, Object obj2, tg2 tg2Var, fz2 fz2Var, float f, o30 o30Var) {
        super(1, o30Var);
        this.n = obj;
        this.o = obj2;
        this.p = tg2Var;
        this.q = fz2Var;
        this.r = f;
    }

    @Override // defpackage.hn
    public final o30 create(o30 o30Var) {
        return new qg2(this.n, this.o, this.p, this.q, this.r, o30Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((qg2) create((o30) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        b50 b50Var = b50.m;
        int i = this.m;
        if (i == 0) {
            ca2.b(obj);
            pg2 pg2Var = new pg2(this.n, this.o, this.p, this.q, this.r, null);
            this.m = 1;
            if (j8.t(pg2Var, this) == b50Var) {
                return b50Var;
            }
        } else {
            if (i != 1) {
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ca2.b(obj);
        }
        return Unit.a;
    }
}
