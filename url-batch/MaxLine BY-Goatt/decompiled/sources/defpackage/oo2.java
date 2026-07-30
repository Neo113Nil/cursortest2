package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oo2 extends pr2 implements xt0 {
    public int m;
    public /* synthetic */ ym0 n;
    public /* synthetic */ int o;
    public final /* synthetic */ po2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo2(po2 po2Var, o30 o30Var) {
        super(3, o30Var);
        this.p = po2Var;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        oo2 oo2Var = new oo2(this.p, (o30) obj3);
        oo2Var.n = (ym0) obj;
        oo2Var.o = intValue;
        return oo2Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (r0.d(r13, r12) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (defpackage.n90.a(r1, r12) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r0.d(r13, r12) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        if (r13.d(r0, r12) == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ym0 ym0Var;
        po2 po2Var = this.p;
        long j = po2Var.b;
        b50 b50Var = b50.m;
        int i = this.m;
        if (i == 0) {
            ca2.b(obj);
            ym0 ym0Var2 = this.n;
            if (this.o > 0) {
                al2 al2Var = al2.m;
                this.m = 1;
            } else {
                long j2 = po2Var.a;
                this.n = ym0Var2;
                this.m = 2;
                if (n90.a(j2, this) != b50Var) {
                    ym0Var = ym0Var2;
                    if (j > 0) {
                    }
                    al2 al2Var2 = al2.o;
                    this.n = null;
                    this.m = 5;
                }
            }
            return b50Var;
        }
        if (i != 1) {
            if (i == 2) {
                ym0Var = this.n;
                ca2.b(obj);
                if (j > 0) {
                    al2 al2Var3 = al2.n;
                    this.n = ym0Var;
                    this.m = 3;
                }
                al2 al2Var22 = al2.o;
                this.n = null;
                this.m = 5;
            } else if (i == 3) {
                ym0Var = this.n;
                ca2.b(obj);
                this.n = ym0Var;
                this.m = 4;
            } else if (i == 4) {
                ym0Var = this.n;
                ca2.b(obj);
                al2 al2Var222 = al2.o;
                this.n = null;
                this.m = 5;
            } else if (i != 5) {
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        ca2.b(obj);
        return Unit.a;
    }
}
