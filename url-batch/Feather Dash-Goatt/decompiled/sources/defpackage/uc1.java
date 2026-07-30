package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class uc1 extends sf1 implements s30 {
    public int i;
    public /* synthetic */ d00 j;
    public /* synthetic */ int k;
    public final /* synthetic */ vc1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc1(vc1 vc1Var, dn dnVar) {
        super(3, dnVar);
        this.l = vc1Var;
    }

    @Override // defpackage.s30
    public final Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        uc1 uc1Var = new uc1(this.l, (dn) obj3);
        uc1Var.j = (d00) obj;
        uc1Var.k = intValue;
        return uc1Var.k(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        if (r1.e(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (defpackage.mo.l(Long.MAX_VALUE, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r1.e(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r1.e(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (defpackage.mo.l(0, r8) == r0) goto L32;
     */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        d00 d00Var;
        tn tnVar = tn.d;
        int i = this.i;
        if (i == 0) {
            ca0.v(obj);
            d00Var = this.j;
            if (this.k > 0) {
                la1 la1Var = la1.d;
                this.i = 1;
            } else {
                this.j = d00Var;
                this.i = 2;
            }
            return tnVar;
        }
        if (i != 1) {
            if (i == 2) {
                d00Var = this.j;
                ca0.v(obj);
                la1 la1Var2 = la1.e;
                this.j = d00Var;
                this.i = 3;
            } else if (i == 3) {
                d00Var = this.j;
                ca0.v(obj);
                this.j = d00Var;
                this.i = 4;
            } else if (i == 4) {
                d00Var = this.j;
                ca0.v(obj);
                la1 la1Var3 = la1.g;
                this.j = null;
                this.i = 5;
            } else if (i != 5) {
                dd0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        ca0.v(obj);
        return Unit.a;
    }
}
