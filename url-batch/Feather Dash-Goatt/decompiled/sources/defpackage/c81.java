package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class c81 extends sf1 implements Function2 {
    public long i;
    public int j;
    public /* synthetic */ long k;
    public final /* synthetic */ d81 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c81(d81 d81Var, dn dnVar) {
        super(2, dnVar);
        this.l = d81Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        long j = ((xm1) obj).a;
        c81 c81Var = new c81(this.l, (dn) obj2);
        c81Var.k = j;
        return c81Var.k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        c81 c81Var = new c81(this.l, dnVar);
        c81Var.k = ((xm1) obj).a;
        return c81Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r15 == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        tn tnVar = tn.d;
        int i = this.j;
        d81 d81Var = this.l;
        if (i == 0) {
            ca0.v(obj);
            j = this.k;
            wo0 wo0Var = d81Var.f;
            this.k = j;
            this.j = 1;
            obj = wo0Var.b(j, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = this.i;
                    j3 = this.k;
                    ca0.v(obj);
                    return new xm1(xm1.d(j3, xm1.d(j4, ((xm1) obj).a)));
                }
                j2 = this.i;
                j = this.k;
                ca0.v(obj);
                long j5 = ((xm1) obj).a;
                wo0 wo0Var2 = d81Var.f;
                long d = xm1.d(j2, j5);
                this.k = j;
                this.i = j5;
                this.j = 3;
                obj = wo0Var2.a(d, j5, this);
                if (obj != tnVar) {
                    j3 = j;
                    j4 = j5;
                    return new xm1(xm1.d(j3, xm1.d(j4, ((xm1) obj).a)));
                }
                return tnVar;
            }
            j = this.k;
            ca0.v(obj);
        }
        long d2 = xm1.d(j, ((xm1) obj).a);
        this.k = j;
        this.i = d2;
        this.j = 2;
        obj = d81Var.a(d2, this);
        if (obj != tnVar) {
            j2 = d2;
            long j52 = ((xm1) obj).a;
            wo0 wo0Var22 = d81Var.f;
            long d3 = xm1.d(j2, j52);
            this.k = j;
            this.i = j52;
            this.j = 3;
            obj = wo0Var22.a(d3, j52, this);
            if (obj != tnVar) {
            }
        }
        return tnVar;
    }
}
