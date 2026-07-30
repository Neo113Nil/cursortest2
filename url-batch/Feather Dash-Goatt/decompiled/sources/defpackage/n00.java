package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class n00 extends sf1 implements s30 {
    public int i;
    public /* synthetic */ d00 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ qk l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n00(qk qkVar, dn dnVar) {
        super(3, dnVar);
        this.l = qkVar;
    }

    @Override // defpackage.s30
    public final Object a(Object obj, Object obj2, Object obj3) {
        n00 n00Var = new n00(this.l, (dn) obj3);
        n00Var.j = (d00) obj;
        n00Var.k = obj2;
        return n00Var.k(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r1.e(r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r6 == r0) goto L15;
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
            Object obj2 = this.k;
            this.j = d00Var;
            this.i = 1;
            obj = this.l.b(obj2, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    ca0.v(obj);
                    return Unit.a;
                }
                dd0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d00Var = this.j;
            ca0.v(obj);
        }
        this.j = null;
        this.i = 2;
    }
}
