package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class um extends sf1 implements Function2 {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ sl1 k;
    public final /* synthetic */ wm l;
    public final /* synthetic */ ke m;
    public final /* synthetic */ long n;
    public final /* synthetic */ jb0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um(sl1 sl1Var, wm wmVar, ke keVar, long j, jb0 jb0Var, dn dnVar) {
        super(2, dnVar);
        this.k = sl1Var;
        this.l = wmVar;
        this.m = keVar;
        this.n = j;
        this.o = jb0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((um) h((dn) obj2, (b81) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        um umVar = new um(this.k, this.l, this.m, this.n, this.o, dnVar);
        umVar.j = obj;
        return umVar;
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        tn tnVar = tn.d;
        int i = this.i;
        if (i == 0) {
            ca0.v(obj);
            b81 b81Var = (b81) this.j;
            long j = this.n;
            wm wmVar = this.l;
            ke keVar = this.m;
            float z0 = wm.z0(wmVar, keVar, j);
            sl1 sl1Var = this.k;
            sl1Var.e = z0;
            tm tmVar = new tm(wmVar, sl1Var, this.o, b81Var);
            kc kcVar = new kc(wmVar, sl1Var, keVar, 3);
            this.i = 1;
            if (sl1Var.a(tmVar, kcVar, this) == tnVar) {
                return tnVar;
            }
        } else {
            if (i != 1) {
                dd0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ca0.v(obj);
        }
        return Unit.a;
    }
}
