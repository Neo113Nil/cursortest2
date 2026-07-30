package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class a81 extends sf1 implements Function2 {
    public d81 i;
    public y11 j;
    public long k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ d81 n;
    public final /* synthetic */ y11 o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a81(d81 d81Var, y11 y11Var, long j, dn dnVar) {
        super(2, dnVar);
        this.n = d81Var;
        this.o = y11Var;
        this.p = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((a81) h((dn) obj2, (b81) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        a81 a81Var = new a81(this.n, this.o, this.p, dnVar);
        a81Var.m = obj;
        return a81Var;
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        d81 d81Var;
        d81 d81Var2;
        y11 y11Var;
        long j;
        tn tnVar = tn.d;
        int i = this.l;
        if (i == 0) {
            ca0.v(obj);
            b81 b81Var = (b81) this.m;
            d81Var = this.n;
            z71 z71Var = new z71(d81Var, b81Var);
            xp xpVar = d81Var.c;
            y11 y11Var2 = this.o;
            long j2 = y11Var2.d;
            et0 et0Var = d81Var.d;
            et0 et0Var2 = et0.e;
            long j3 = this.p;
            float d = d81Var.d(et0Var == et0Var2 ? xm1.b(j3) : xm1.c(j3));
            this.m = d81Var;
            this.i = d81Var;
            this.j = y11Var2;
            this.k = j2;
            this.l = 1;
            xpVar.getClass();
            obj = uq1.V(xpVar.b, new wp(d, xpVar, z71Var, null), this);
            if (obj == tnVar) {
                return tnVar;
            }
            d81Var2 = d81Var;
            y11Var = y11Var2;
            j = j2;
        } else {
            if (i != 1) {
                dd0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.k;
            y11Var = this.j;
            d81Var = this.i;
            d81Var2 = (d81) this.m;
            ca0.v(obj);
        }
        float d2 = d81Var2.d(((Number) obj).floatValue());
        y11Var.d = d81Var.d == et0.e ? xm1.a(j, d2, 0.0f, 2) : xm1.a(j, 0.0f, d2, 1);
        return Unit.a;
    }
}
