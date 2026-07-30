package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vm extends sf1 implements Function2 {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wm k;
    public final /* synthetic */ sl1 l;
    public final /* synthetic */ ke m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm(wm wmVar, sl1 sl1Var, ke keVar, long j, dn dnVar) {
        super(2, dnVar);
        this.k = wmVar;
        this.l = sl1Var;
        this.m = keVar;
        this.n = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((vm) h((dn) obj2, (sn) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        vm vmVar = new vm(this.k, this.l, this.m, this.n, dnVar);
        vmVar.j = obj;
        return vmVar;
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        wm wmVar = this.k;
        ee eeVar = wmVar.w;
        tn tnVar = tn.d;
        int i = this.i;
        try {
            try {
                if (i == 0) {
                    ca0.v(obj);
                    jb0 t = t80.t(((sn) this.j).f());
                    wmVar.z = true;
                    d81 d81Var = wmVar.t;
                    go0 go0Var = go0.d;
                    um umVar = new um(this.l, wmVar, this.m, this.n, t, null);
                    this.i = 1;
                    if (d81Var.f(go0Var, umVar, this) == tnVar) {
                        return tnVar;
                    }
                } else {
                    if (i != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                eeVar.b();
                wmVar.z = false;
                eeVar.a(null);
                wmVar.x = false;
                return Unit.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            wmVar.z = false;
            eeVar.a(null);
            wmVar.x = false;
            throw th;
        }
    }
}
