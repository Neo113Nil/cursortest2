package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ak0 extends tg0 implements xr {
    public i40[] j;
    public bk0 k;
    public ej0 l;
    public int m;
    public int n;
    public int o;
    public int p;
    public final /* synthetic */ i40[] q;
    public final /* synthetic */ bk0 r;
    public final /* synthetic */ ej0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak0(i40[] i40VarArr, bk0 bk0Var, ej0 ej0Var, dg dgVar) {
        super(dgVar);
        this.q = i40VarArr;
        this.r = bk0Var;
        this.s = ej0Var;
    }

    @Override // defpackage.xr
    public final Object g(Object obj, Object obj2) {
        return ((ak0) i((dg) obj2, (x50) obj)).l(sk0.a);
    }

    @Override // defpackage.f8
    public final dg i(dg dgVar, Object obj) {
        return new ak0(this.q, this.r, this.s, dgVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (defpackage.bk0.c(r7, r6, r12, r11) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0079 -> B:10:0x007a). Please report as a decompilation issue!!! */
    @Override // defpackage.f8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        int length;
        int i;
        ej0 ej0Var;
        i40[] i40VarArr;
        int i2;
        bk0 bk0Var;
        bh bhVar = bh.COROUTINE_SUSPENDED;
        int i3 = this.p;
        if (i3 == 0) {
            mv.O(obj);
            i40[] i40VarArr2 = this.q;
            length = i40VarArr2.length;
            i = 0;
            bk0 bk0Var2 = this.r;
            ej0Var = this.s;
            i40VarArr = i40VarArr2;
            i2 = 0;
            bk0Var = bk0Var2;
            if (i >= length) {
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                s9.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            length = this.o;
            i = this.n;
            int i4 = this.m;
            ej0Var = this.l;
            bk0Var = this.k;
            i40VarArr = this.j;
            mv.O(obj);
            i2 = i4;
            i++;
            if (i >= length) {
                int i5 = i2 + 1;
                int i6 = zj0.a[i40VarArr[i].ordinal()];
                if (i6 == 1) {
                    i2 = i5;
                    i++;
                    if (i >= length) {
                        return sk0.a;
                    }
                } else {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            throw new md();
                        }
                        this.j = i40VarArr;
                        this.k = bk0Var;
                        this.l = ej0Var;
                        this.m = i5;
                        this.n = i;
                        this.o = length;
                        this.p = 2;
                        if (bk0.d(bk0Var, ej0Var, i2, this) != bhVar) {
                            i4 = i5;
                            i2 = i4;
                        }
                        return bhVar;
                    }
                    this.j = i40VarArr;
                    this.k = bk0Var;
                    this.l = ej0Var;
                    this.m = i5;
                    this.n = i;
                    this.o = length;
                    this.p = 1;
                    i++;
                    if (i >= length) {
                    }
                }
            }
        }
    }
}
