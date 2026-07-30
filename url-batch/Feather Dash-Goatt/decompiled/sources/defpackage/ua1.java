package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ua1 {
    public final oo0 a = new oo0();
    public final s40 b = new s40(9);
    public final nq0 c = new nq0(9, new m6(2, null, 1));

    public ua1(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.b.e).get());
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
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [oo0] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Function1 function1, fn fnVar) {
        sa1 sa1Var;
        int i;
        oo0 oo0Var;
        try {
            if (fnVar instanceof sa1) {
                sa1Var = (sa1) fnVar;
                int i2 = sa1Var.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sa1Var.l = i2 - Integer.MIN_VALUE;
                    Object obj = sa1Var.j;
                    tn tnVar = tn.d;
                    i = sa1Var.l;
                    if (i != 0) {
                        ca0.v(obj);
                        sa1Var.h = function1;
                        oo0 oo0Var2 = this.a;
                        sa1Var.i = oo0Var2;
                        sa1Var.l = 1;
                        Object e = oo0Var2.e(sa1Var);
                        oo0Var = oo0Var2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                dd0.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oo0 oo0Var3 = (oo0) sa1Var.h;
                            ca0.v(obj);
                            this = oo0Var3;
                            return obj;
                        }
                        oo0 oo0Var4 = sa1Var.i;
                        function1 = (Function1) sa1Var.h;
                        ca0.v(obj);
                        oo0Var = oo0Var4;
                    }
                    sa1Var.h = oo0Var;
                    sa1Var.i = null;
                    sa1Var.l = 2;
                    obj = function1.invoke(sa1Var);
                    this = oo0Var;
                }
            }
            if (i != 0) {
            }
            sa1Var.h = oo0Var;
            sa1Var.i = null;
            sa1Var.l = 2;
            obj = function1.invoke(sa1Var);
            this = oo0Var;
        } finally {
            this.h(null);
        }
        sa1Var = new sa1(this, fnVar);
        Object obj2 = sa1Var.j;
        tn tnVar2 = tn.d;
        i = sa1Var.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Function2 function2, fn fnVar) {
        ta1 ta1Var;
        int i;
        oo0 oo0Var;
        boolean z;
        Throwable th;
        if (fnVar instanceof ta1) {
            ta1Var = (ta1) fnVar;
            int i2 = ta1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ta1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = ta1Var.j;
                Object obj2 = tn.d;
                i = ta1Var.l;
                if (i != 0) {
                    ca0.v(obj);
                    oo0 oo0Var2 = this.a;
                    boolean f = oo0Var2.f();
                    try {
                        Object valueOf = Boolean.valueOf(f);
                        ta1Var.h = oo0Var2;
                        ta1Var.i = f;
                        ta1Var.l = 1;
                        Object b = function2.b(valueOf, ta1Var);
                        if (b == obj2) {
                            return obj2;
                        }
                        oo0Var = oo0Var2;
                        z = f;
                        obj = b;
                    } catch (Throwable th2) {
                        oo0Var = oo0Var2;
                        z = f;
                        th = th2;
                        if (z) {
                            oo0Var.h(null);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = ta1Var.i;
                    oo0Var = ta1Var.h;
                    try {
                        ca0.v(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                        }
                        throw th;
                    }
                }
                if (z) {
                    oo0Var.h(null);
                }
                return obj;
            }
        }
        ta1Var = new ta1(this, fnVar);
        Object obj3 = ta1Var.j;
        Object obj22 = tn.d;
        i = ta1Var.l;
        if (i != 0) {
        }
        if (z) {
        }
        return obj3;
    }
}
