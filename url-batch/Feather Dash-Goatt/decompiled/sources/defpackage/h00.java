package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class h00 implements c00 {
    public final /* synthetic */ s40 d;
    public final /* synthetic */ zo e;

    public h00(s40 s40Var, zo zoVar) {
        this.d = s40Var;
        this.e = zoVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:22|23))(2:24|25))(2:26|27))(2:38|39)|28|29|30|(3:32|15|16)|33))|46|6|7|(0)(0)|28|29|30|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0060, code lost:
    
        if (r10.f(r9, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004d, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        r10 = new defpackage.ji1(r9);
        r9 = r9.e;
        r0.k = r9;
        r0.l = null;
        r0.i = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        if (defpackage.op.m(r10, r9, r9, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.c00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(d00 d00Var, dn dnVar) {
        g00 g00Var;
        tn tnVar;
        int i;
        d51 d51Var;
        d51 d51Var2;
        zo zoVar;
        try {
            if (dnVar instanceof g00) {
                g00Var = (g00) dnVar;
                int i2 = g00Var.i;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    g00Var.i = i2 - Integer.MIN_VALUE;
                    Object obj = g00Var.h;
                    tnVar = tn.d;
                    i = g00Var.i;
                    if (i != 0) {
                        ca0.v(obj);
                        s40 s40Var = this.d;
                        g00Var.k = this;
                        g00Var.l = d00Var;
                        g00Var.i = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                Throwable th = (Throwable) g00Var.k;
                                ca0.v(obj);
                                throw th;
                            }
                            if (i != 3) {
                                dd0.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            d51Var2 = (d51) g00Var.k;
                            try {
                                ca0.v(obj);
                                d51Var2.m();
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                d51Var2.m();
                                throw th;
                            }
                        }
                        d00Var = g00Var.l;
                        this = (h00) g00Var.k;
                        ca0.v(obj);
                    }
                    CoroutineContext coroutineContext = g00Var.e;
                    coroutineContext.getClass();
                    d51Var = new d51(d00Var, coroutineContext);
                    zoVar = this.e;
                    g00Var.k = d51Var;
                    g00Var.l = null;
                    g00Var.i = 3;
                    if (zoVar.a(d51Var, null, g00Var) != tnVar) {
                        d51Var2 = d51Var;
                        d51Var2.m();
                        return Unit.a;
                    }
                    return tnVar;
                }
            }
            zoVar = this.e;
            g00Var.k = d51Var;
            g00Var.l = null;
            g00Var.i = 3;
            if (zoVar.a(d51Var, null, g00Var) != tnVar) {
            }
            return tnVar;
        } catch (Throwable th3) {
            th = th3;
            d51Var2 = d51Var;
            d51Var2.m();
            throw th;
        }
        g00Var = new g00(this, dnVar);
        Object obj2 = g00Var.h;
        tnVar = tn.d;
        i = g00Var.i;
        if (i != 0) {
        }
        CoroutineContext coroutineContext2 = g00Var.e;
        coroutineContext2.getClass();
        d51Var = new d51(d00Var, coroutineContext2);
    }
}
