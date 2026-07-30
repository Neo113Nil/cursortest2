package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class on0 extends h31 implements Function2 {
    public n40 g;
    public pn0 h;
    public long[] i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ pn0 m;
    public final /* synthetic */ n40 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on0(pn0 pn0Var, n40 n40Var, dn dnVar) {
        super(dnVar);
        this.m = pn0Var;
        this.n = n40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((on0) h((dn) obj2, (g91) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        on0 on0Var = new on0(this.m, this.n, dnVar);
        on0Var.l = obj;
        return on0Var;
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        g91 g91Var;
        pn0 pn0Var;
        long[] jArr;
        int i;
        n40 n40Var;
        tn tnVar = tn.d;
        int i2 = this.k;
        if (i2 == 0) {
            ca0.v(obj);
            g91Var = (g91) this.l;
            pn0Var = this.m;
            nn0 nn0Var = pn0Var.e;
            jArr = nn0Var.c;
            i = nn0Var.e;
            n40Var = this.n;
        } else {
            if (i2 != 1) {
                dd0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.j;
            jArr = this.i;
            pn0Var = this.h;
            n40Var = this.g;
            g91Var = (g91) this.l;
            ca0.v(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return Unit.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        n40Var.e = i;
        Object obj2 = pn0Var.e.b[i];
        this.l = g91Var;
        this.g = n40Var;
        this.h = pn0Var;
        this.i = jArr;
        this.j = i3;
        this.k = 1;
        g91Var.a(obj2, this);
        return tnVar;
    }
}
