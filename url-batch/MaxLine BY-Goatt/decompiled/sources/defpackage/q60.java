package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q60 {
    public final /* synthetic */ oo1 a;
    public final /* synthetic */ y72 b;
    public final /* synthetic */ c82 c;
    public final /* synthetic */ i70 d;

    public q60(oo1 oo1Var, y72 y72Var, c82 c82Var, i70 i70Var) {
        this.a = oo1Var;
        this.b = y72Var;
        this.c = c82Var;
        this.d = i70Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
    
        if (r10.f(r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:27:0x004e, B:28:0x00a8, B:30:0x00b0), top: B:26:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #2 {all -> 0x00cc, blocks: (B:40:0x008c, B:42:0x0090, B:45:0x00cf, B:46:0x00d6), top: B:39:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf A[Catch: all -> 0x00cc, TRY_ENTER, TryCatch #2 {all -> 0x00cc, blocks: (B:40:0x008c, B:42:0x0090, B:45:0x00cf, B:46:0x00d6), top: B:39:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kc kcVar, r30 r30Var) {
        p60 p60Var;
        int i;
        oo1 oo1Var;
        y72 y72Var;
        c82 c82Var;
        i70 i70Var;
        Function2 function2;
        oo1 oo1Var2;
        oo1 oo1Var3;
        c82 c82Var2;
        Object obj;
        try {
            if (r30Var instanceof p60) {
                p60Var = (p60) r30Var;
                int i2 = p60Var.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    p60Var.t = i2 - Integer.MIN_VALUE;
                    Object obj2 = p60Var.r;
                    b50 b50Var = b50.m;
                    i = p60Var.t;
                    if (i != 0) {
                        ca2.b(obj2);
                        p60Var.m = kcVar;
                        oo1Var = this.a;
                        p60Var.n = oo1Var;
                        y72Var = this.b;
                        p60Var.o = y72Var;
                        c82Var = this.c;
                        p60Var.p = c82Var;
                        i70Var = this.d;
                        p60Var.q = i70Var;
                        p60Var.t = 1;
                        function2 = kcVar;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    lh.g("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                obj = p60Var.o;
                                c82Var2 = (c82) p60Var.n;
                                oo1Var2 = (oo1) p60Var.m;
                                try {
                                    ca2.b(obj2);
                                    c82Var2.m = obj;
                                    Object obj3 = c82Var2.m;
                                    oo1Var2.b(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    oo1Var2.b(null);
                                    throw th;
                                }
                            }
                            i70Var = (i70) p60Var.o;
                            c82Var2 = (c82) p60Var.n;
                            oo1Var3 = (oo1) p60Var.m;
                            try {
                                ca2.b(obj2);
                                if (!Intrinsics.b(obj2, c82Var2.m)) {
                                    oo1Var2 = oo1Var3;
                                    Object obj32 = c82Var2.m;
                                    oo1Var2.b(null);
                                    return obj32;
                                }
                                p60Var.m = oo1Var3;
                                p60Var.n = c82Var2;
                                p60Var.o = obj2;
                                p60Var.t = 3;
                                if (i70Var.k(obj2, false, p60Var) != b50Var) {
                                    obj = obj2;
                                    oo1Var2 = oo1Var3;
                                    c82Var2.m = obj;
                                    Object obj322 = c82Var2.m;
                                    oo1Var2.b(null);
                                    return obj322;
                                }
                                return b50Var;
                            } catch (Throwable th2) {
                                th = th2;
                                oo1Var2 = oo1Var3;
                                oo1Var2.b(null);
                                throw th;
                            }
                        }
                        i70Var = p60Var.q;
                        c82 c82Var3 = p60Var.p;
                        y72Var = (y72) p60Var.o;
                        oo1 oo1Var4 = (oo1) p60Var.n;
                        Function2 function22 = (Function2) p60Var.m;
                        ca2.b(obj2);
                        c82Var = c82Var3;
                        function2 = function22;
                        oo1Var = oo1Var4;
                    }
                    if (!y72Var.m) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = c82Var.m;
                    p60Var.m = oo1Var;
                    p60Var.n = c82Var;
                    p60Var.o = i70Var;
                    p60Var.p = null;
                    p60Var.q = null;
                    p60Var.t = 2;
                    Object invoke = function2.invoke(obj4, p60Var);
                    if (invoke != b50Var) {
                        oo1Var3 = oo1Var;
                        obj2 = invoke;
                        c82Var2 = c82Var;
                        if (!Intrinsics.b(obj2, c82Var2.m)) {
                        }
                    }
                    return b50Var;
                }
            }
            if (!y72Var.m) {
            }
        } catch (Throwable th3) {
            th = th3;
            oo1Var2 = oo1Var;
            oo1Var2.b(null);
            throw th;
        }
        p60Var = new p60(this, r30Var);
        Object obj22 = p60Var.r;
        b50 b50Var2 = b50.m;
        i = p60Var.t;
        if (i != 0) {
        }
    }
}
