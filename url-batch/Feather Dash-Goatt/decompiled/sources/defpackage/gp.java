package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gp extends sf1 implements Function1 {
    public Throwable i;
    public int j;
    public final /* synthetic */ mp k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(mp mpVar, dn dnVar) {
        super(1, dnVar);
        this.k = mpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new gp(this.k, (dn) obj).k(Unit.a);
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        Throwable th;
        xd1 xd1Var;
        tn tnVar = tn.d;
        int i = this.j;
        mp mpVar = this.k;
        try {
        } catch (Throwable th2) {
            ua1 g = mpVar.g();
            this.i = th2;
            this.j = 2;
            Integer a = g.a();
            if (a != tnVar) {
                obj = a;
                th = th2;
            }
        }
        if (i == 0) {
            ca0.v(obj);
            this.j = 1;
            obj = mp.f(mpVar, true, this);
            if (obj == tnVar) {
                return tnVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = this.i;
                ca0.v(obj);
                xd1Var = new d11(th, ((Number) obj).intValue());
                return new Pair(xd1Var, Boolean.TRUE);
            }
            ca0.v(obj);
        }
        xd1Var = (xd1) obj;
        return new Pair(xd1Var, Boolean.TRUE);
    }
}
