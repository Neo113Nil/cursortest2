package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ja0 extends tg0 implements xr {
    public String[] j;
    public int k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ String[] p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja0(boolean z, String[] strArr, dg dgVar) {
        super(dgVar);
        this.o = z;
        this.p = strArr;
    }

    @Override // defpackage.xr
    public final Object g(Object obj, Object obj2) {
        return ((ja0) i((dg) obj2, (x50) obj)).l(sk0.a);
    }

    @Override // defpackage.f8
    public final dg i(dg dgVar, Object obj) {
        ja0 ja0Var = new ja0(this.o, this.p, dgVar);
        ja0Var.n = obj;
        return ja0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0071, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (defpackage.mc0.e(r1, "PRAGMA defer_foreign_keys = TRUE", r9) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006f, code lost:
    
        if (defpackage.mc0.e(r6, r10, r9) == r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x006f -> B:6:0x0072). Please report as a decompilation issue!!! */
    @Override // defpackage.f8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        x50 x50Var;
        x50 x50Var2;
        int length;
        int i;
        String[] strArr;
        bh bhVar = bh.COROUTINE_SUSPENDED;
        int i2 = this.m;
        if (i2 == 0) {
            mv.O(obj);
            x50Var = (x50) this.n;
            if (this.o) {
                this.n = x50Var;
                this.m = 1;
            }
        } else if (i2 == 1) {
            x50Var = (x50) this.n;
            mv.O(obj);
        } else {
            if (i2 != 2) {
                s9.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            length = this.l;
            i = this.k;
            strArr = this.j;
            x50Var2 = (x50) this.n;
            mv.O(obj);
            i++;
            if (i < length) {
                return sk0.a;
            }
            String str = "DELETE FROM `" + strArr[i] + '`';
            this.n = x50Var2;
            this.j = strArr;
            this.k = i;
            this.l = length;
            this.m = 2;
        }
        String[] strArr2 = this.p;
        x50Var2 = x50Var;
        length = strArr2.length;
        i = 0;
        strArr = strArr2;
        if (i < length) {
        }
    }
}
