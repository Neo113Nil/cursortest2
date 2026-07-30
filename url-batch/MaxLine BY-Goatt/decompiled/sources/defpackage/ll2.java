package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ll2 {
    public final qo1 a = new qo1();
    public final ar0 b = new ar0(9);
    public final x60 c = new x60(2, new ub(2, null, 2));

    public ll2(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.b.n).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [ll2] */
    /* JADX WARN: Type inference failed for: r6v1, types: [oo1] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [oo1] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Function1 function1, r30 r30Var) {
        jl2 jl2Var;
        int i;
        qo1 qo1Var;
        try {
            if (r30Var instanceof jl2) {
                jl2Var = (jl2) r30Var;
                int i2 = jl2Var.q;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jl2Var.q = i2 - Integer.MIN_VALUE;
                    Object obj = jl2Var.o;
                    b50 b50Var = b50.m;
                    i = jl2Var.q;
                    if (i != 0) {
                        ca2.b(obj);
                        jl2Var.m = function1;
                        qo1 qo1Var2 = this.a;
                        jl2Var.n = qo1Var2;
                        jl2Var.q = 1;
                        Object f = qo1Var2.f(jl2Var);
                        qo1Var = qo1Var2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oo1 oo1Var = (oo1) jl2Var.m;
                            ca2.b(obj);
                            this = oo1Var;
                            return obj;
                        }
                        qo1 qo1Var3 = jl2Var.n;
                        function1 = (Function1) jl2Var.m;
                        ca2.b(obj);
                        qo1Var = qo1Var3;
                    }
                    jl2Var.m = qo1Var;
                    jl2Var.n = null;
                    jl2Var.q = 2;
                    obj = function1.invoke(jl2Var);
                    this = qo1Var;
                }
            }
            if (i != 0) {
            }
            jl2Var.m = qo1Var;
            jl2Var.n = null;
            jl2Var.q = 2;
            obj = function1.invoke(jl2Var);
            this = qo1Var;
        } finally {
            this.b(null);
        }
        jl2Var = new jl2(this, r30Var);
        Object obj2 = jl2Var.o;
        b50 b50Var2 = b50.m;
        i = jl2Var.q;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Function2 function2, r30 r30Var) {
        kl2 kl2Var;
        int i;
        qo1 qo1Var;
        boolean z;
        Throwable th;
        if (r30Var instanceof kl2) {
            kl2Var = (kl2) r30Var;
            int i2 = kl2Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kl2Var.q = i2 - Integer.MIN_VALUE;
                Object obj = kl2Var.o;
                Object obj2 = b50.m;
                i = kl2Var.q;
                if (i != 0) {
                    ca2.b(obj);
                    qo1 qo1Var2 = this.a;
                    boolean g = qo1Var2.g();
                    try {
                        Object valueOf = Boolean.valueOf(g);
                        kl2Var.m = qo1Var2;
                        kl2Var.n = g;
                        kl2Var.q = 1;
                        Object invoke = function2.invoke(valueOf, kl2Var);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        qo1Var = qo1Var2;
                        z = g;
                        obj = invoke;
                    } catch (Throwable th2) {
                        qo1Var = qo1Var2;
                        z = g;
                        th = th2;
                        if (z) {
                            qo1Var.b(null);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = kl2Var.n;
                    qo1Var = kl2Var.m;
                    try {
                        ca2.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                        }
                        throw th;
                    }
                }
                if (z) {
                    qo1Var.b(null);
                }
                return obj;
            }
        }
        kl2Var = new kl2(this, r30Var);
        Object obj3 = kl2Var.o;
        Object obj22 = b50.m;
        i = kl2Var.q;
        if (i != 0) {
        }
        if (z) {
        }
        return obj3;
    }
}
