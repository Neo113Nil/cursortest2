package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class i extends sf1 implements Function2 {
    public int i;
    public final /* synthetic */ gn0 j;
    public final /* synthetic */ zy0 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ eh m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gn0 gn0Var, zy0 zy0Var, boolean z, eh ehVar, dn dnVar) {
        super(2, dnVar);
        this.j = gn0Var;
        this.k = zy0Var;
        this.l = z;
        this.m = ehVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((i) h((dn) obj2, (sn) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        return new i(this.j, this.k, this.l, this.m, dnVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r7.j.a(r4, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
    
        if (defpackage.mo.l(r5, r7) == r0) goto L15;
     */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        tn tnVar = tn.d;
        int i = this.i;
        zy0 zy0Var = this.k;
        if (i == 0) {
            ca0.v(obj);
            long j = fh.a;
            this.i = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca0.v(obj);
                boolean z = this.l;
                eh ehVar = this.m;
                if (z) {
                    ehVar.F = zy0Var;
                } else {
                    ehVar.B = zy0Var;
                }
                return Unit.a;
            }
            ca0.v(obj);
        }
        this.i = 2;
    }
}
