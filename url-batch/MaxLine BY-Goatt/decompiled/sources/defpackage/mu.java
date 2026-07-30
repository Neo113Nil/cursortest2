package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mu extends pr2 implements xt0 {
    public int m;
    public /* synthetic */ s42 n;
    public /* synthetic */ long o;
    public final /* synthetic */ nu p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu(nu nuVar, o30 o30Var) {
        super(3, o30Var);
        this.p = nuVar;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        long j = ((au1) obj2).a;
        mu muVar = new mu(this.p, (o30) obj3);
        muVar.n = (s42) obj;
        muVar.o = j;
        return muVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = b50.m;
        int i = this.m;
        if (i == 0) {
            ca2.b(obj);
            s42 s42Var = this.n;
            long j = this.o;
            nu nuVar = this.p;
            if (nuVar.G) {
                this.m = 1;
                bn1 bn1Var = nuVar.C;
                if (bn1Var == null || (obj2 = j8.t(new x(s42Var, j, bn1Var, nuVar, null), this)) != obj3) {
                    obj2 = Unit.a;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
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
