package defpackage;

import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.time.a;
import kotlin.time.b;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b10 implements y00 {
    public final a32 m;
    public final a32 n;
    public final ThreadLocal o;
    public final AtomicBoolean p;
    public final long q;

    public b10(final t21 t21Var, final String str, int i) {
        long b;
        str.getClass();
        this.o = new ThreadLocal();
        final int i2 = 0;
        this.p = new AtomicBoolean(false);
        a.C0002a c0002a = a.m;
        se0 se0Var = se0.SECONDS;
        if (se0Var.compareTo(se0Var) <= 0) {
            int i3 = re0.a;
            b = 60000000000L;
        } else {
            b = b.b(30L, se0Var);
        }
        this.q = b;
        if (i <= 0) {
            lh.e("Maximum number of readers must be greater than 0");
            throw null;
        }
        this.m = new a32(i, new Function0() { // from class: z00
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                String str2 = str;
                t21 t21Var2 = t21Var;
                switch (i4) {
                    case 0:
                        nc2 b2 = t21Var2.b(str2);
                        s03.l(b2, "PRAGMA query_only = 1");
                        return b2;
                    default:
                        return t21Var2.b(str2);
                }
            }
        });
        final int i4 = 1;
        this.n = new a32(1, new Function0() { // from class: z00
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i4;
                String str2 = str;
                t21 t21Var2 = t21Var;
                switch (i42) {
                    case 0:
                        nc2 b2 = t21Var2.b(str2);
                        s03.l(b2, "PRAGMA query_only = 1");
                        return b2;
                    default:
                        return t21Var2.b(str2);
                }
            }
        });
    }

    public final void b(boolean z) {
        String str = z ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append("\n\nWriter pool:\n");
        this.n.c(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.m.c(sb);
        s03.P(5, sb.toString());
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.p.compareAndSet(false, true)) {
            this.m.b();
            this.n.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01aa A[Catch: all -> 0x01c2, TRY_LEAVE, TryCatch #3 {all -> 0x01c2, blocks: (B:16:0x01a4, B:18:0x01aa, B:23:0x01b4, B:20:0x01b9), top: B:15:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0144 A[Catch: all -> 0x0161, TryCatch #2 {all -> 0x0161, blocks: (B:62:0x013e, B:64:0x0144, B:68:0x015d, B:69:0x0167, B:73:0x0171, B:77:0x01c3, B:78:0x01ca, B:79:0x01cb, B:80:0x01cc, B:81:0x01cf), top: B:61:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cc A[Catch: all -> 0x0161, TryCatch #2 {all -> 0x0161, blocks: (B:62:0x013e, B:64:0x0144, B:68:0x015d, B:69:0x0167, B:73:0x0171, B:77:0x01c3, B:78:0x01ca, B:79:0x01cb, B:80:0x01cc, B:81:0x01cf), top: B:61:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0078  */
    @Override // defpackage.y00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(boolean z, Function2 function2, r30 r30Var) {
        a10 a10Var;
        int i;
        c82 c82Var;
        Throwable th;
        a32 a32Var;
        CoroutineContext context;
        c82 c82Var2;
        c82 c82Var3;
        a32 a32Var2;
        c82 c82Var4;
        CoroutineContext coroutineContext;
        b10 b10Var;
        boolean z2;
        c82 c82Var5;
        b10 b10Var2;
        c82 c82Var6;
        j10 j10Var;
        j32 j32Var;
        j32 j32Var2;
        b10 b10Var3 = this;
        boolean z3 = z;
        Function2 function22 = function2;
        try {
            if (r30Var instanceof a10) {
                a10Var = (a10) r30Var;
                int i2 = a10Var.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    a10Var.v = i2 - Integer.MIN_VALUE;
                    Object obj = a10Var.t;
                    b50 b50Var = b50.m;
                    i = a10Var.v;
                    int i3 = 4;
                    CoroutineContext coroutineContext2 = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    Object[] objArr3 = 0;
                    Object[] objArr4 = 0;
                    if (i != 0) {
                        ca2.b(obj);
                        if (b10Var3.p.get()) {
                            s03.P(21, "Connection pool is closed");
                            throw null;
                        }
                        ThreadLocal threadLocal = b10Var3.o;
                        j32 j32Var3 = (j32) threadLocal.get();
                        nj njVar = x00.n;
                        if (j32Var3 == null) {
                            x00 x00Var = (x00) a10Var.getContext().m(njVar);
                            j32Var3 = x00Var != null ? x00Var.m : null;
                        }
                        if (j32Var3 == null) {
                            a32 a32Var3 = z3 ? b10Var3.m : b10Var3.n;
                            c82 c82Var7 = new c82();
                            try {
                                context = a10Var.getContext();
                                c82Var2 = new c82();
                                try {
                                    long j = b10Var3.q;
                                    ed edVar = new ed((Object) c82Var2, (Object) a32Var3, (o30) (objArr == true ? 1 : 0), i3);
                                    a10Var.m = b10Var3;
                                    a10Var.n = (Serializable) function22;
                                    a10Var.o = a32Var3;
                                    c82Var3 = c82Var7;
                                    try {
                                        a10Var.p = c82Var3;
                                        a10Var.q = context;
                                        a10Var.r = c82Var2;
                                        a10Var.s = z3;
                                        a10Var.v = 3;
                                        if (ux2.a(j, edVar, a10Var) != b50Var) {
                                            a32Var2 = a32Var3;
                                            c82Var4 = c82Var3;
                                            coroutineContext = context;
                                            b10Var = b10Var3;
                                            z2 = z3;
                                            c82Var5 = c82Var2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        a32Var2 = a32Var3;
                                        c82Var4 = c82Var3;
                                        c82 c82Var8 = c82Var4;
                                        b10Var2 = b10Var3;
                                        c82Var6 = c82Var8;
                                        j10Var = (j10) c82Var2.m;
                                        if (j10Var == null) {
                                        }
                                        c82Var6.m = j32Var;
                                        if (!(th instanceof sx2)) {
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c82Var3 = c82Var7;
                                }
                            } catch (Throwable th4) {
                                c82Var = c82Var7;
                                th = th4;
                                a32Var = a32Var3;
                                throw th;
                            }
                        } else {
                            if (!z3 && j32Var3.b) {
                                s03.P(1, "Cannot upgrade connection from reader to writer");
                                throw null;
                            }
                            if (a10Var.getContext().m(njVar) == null) {
                                x00 x00Var2 = new x00(j32Var3);
                                threadLocal.getClass();
                                CoroutineContext c = f.c(x00Var2, new ax2(j32Var3, threadLocal));
                                v vVar = new v(function22, j32Var3, objArr2 == true ? 1 : 0, 14);
                                a10Var.v = 1;
                                Object V = z71.V(c, vVar, a10Var);
                                if (V != b50Var) {
                                    return V;
                                }
                            } else {
                                a10Var.v = 2;
                                Object invoke = function22.invoke(j32Var3, a10Var);
                                if (invoke != b50Var) {
                                    return invoke;
                                }
                            }
                        }
                        return b50Var;
                    }
                    if (i == 1) {
                        ca2.b(obj);
                        return obj;
                    }
                    if (i == 2) {
                        ca2.b(obj);
                        return obj;
                    }
                    if (i == 3) {
                        z2 = a10Var.s;
                        c82Var5 = a10Var.r;
                        CoroutineContext coroutineContext3 = a10Var.q;
                        c82Var4 = a10Var.p;
                        a32Var2 = a10Var.o;
                        Function2 function23 = (Function2) a10Var.n;
                        b10Var = (b10) a10Var.m;
                        try {
                            ca2.b(obj);
                            coroutineContext = coroutineContext3;
                            function22 = function23;
                        } catch (Throwable th5) {
                            th = th5;
                            c82Var2 = c82Var5;
                            z3 = z2;
                            b10Var3 = b10Var;
                            context = coroutineContext3;
                            function22 = function23;
                            c82 c82Var82 = c82Var4;
                            b10Var2 = b10Var3;
                            c82Var6 = c82Var82;
                            j10Var = (j10) c82Var2.m;
                            if (j10Var == null) {
                            }
                            c82Var6.m = j32Var;
                            if (!(th instanceof sx2)) {
                            }
                        }
                    } else {
                        if (i != 4) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c82Var6 = (c82) a10Var.n;
                        a32Var = (a32) a10Var.m;
                        try {
                            ca2.b(obj);
                            try {
                                j32Var2 = (j32) c82Var6.m;
                                if (j32Var2 != null) {
                                    if (j32Var2.d.compareAndSet(false, true)) {
                                        try {
                                            s03.l(j32Var2.a, "ROLLBACK TRANSACTION");
                                        } catch (SQLException unused) {
                                        }
                                    }
                                    j10 j10Var2 = j32Var2.a;
                                    j10Var2.o = null;
                                    j10Var2.p = null;
                                    a32Var.d(j10Var2);
                                }
                            } catch (Throwable unused2) {
                            }
                            return obj;
                        } catch (Throwable th6) {
                            th = th6;
                            c82Var = c82Var6;
                            th = th;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    c82Var2 = c82Var5;
                    z3 = z2;
                    c82Var6 = c82Var4;
                    b10Var2 = b10Var;
                    context = coroutineContext;
                    th = null;
                    j10Var = (j10) c82Var2.m;
                    if (j10Var == null) {
                        context.getClass();
                        j10Var.o = context;
                        j10Var.p = new Throwable();
                        j32Var = new j32(j10Var, b10Var2.m != b10Var2.n && z3);
                    } else {
                        j32Var = null;
                    }
                    c82Var6.m = j32Var;
                    if (!(th instanceof sx2)) {
                        b10Var2.b(z3);
                        throw null;
                    }
                    if (th != null) {
                        throw th;
                    }
                    if (j32Var == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    b10Var2.getClass();
                    x00 x00Var3 = new x00(j32Var);
                    ThreadLocal threadLocal2 = b10Var2.o;
                    threadLocal2.getClass();
                    CoroutineContext c2 = f.c(x00Var3, new ax2(j32Var, threadLocal2));
                    v vVar2 = new v(function22, c82Var6, objArr3 == true ? 1 : 0, 15);
                    a10Var.m = a32Var2;
                    a10Var.n = c82Var6;
                    a10Var.o = null;
                    a10Var.p = null;
                    a10Var.q = null;
                    a10Var.r = null;
                    a10Var.v = 4;
                    obj = z71.V(c2, vVar2, a10Var);
                    if (obj != b50Var) {
                        a32Var = a32Var2;
                        j32Var2 = (j32) c82Var6.m;
                        if (j32Var2 != null) {
                        }
                        return obj;
                    }
                    return b50Var;
                }
            }
            j10Var = (j10) c82Var2.m;
            if (j10Var == null) {
            }
            c82Var6.m = j32Var;
            if (!(th instanceof sx2)) {
            }
        } catch (Throwable th7) {
            th = th7;
            c82Var = c82Var6;
            a32Var = a32Var2;
            th = th;
            throw th;
        }
        a10Var = new a10(b10Var3, r30Var);
        Object obj2 = a10Var.t;
        b50 b50Var2 = b50.m;
        i = a10Var.v;
        int i32 = 4;
        CoroutineContext coroutineContext22 = null;
        Object[] objArr5 = 0;
        Object[] objArr22 = 0;
        Object[] objArr32 = 0;
        Object[] objArr42 = 0;
        if (i != 0) {
        }
        c82Var2 = c82Var5;
        z3 = z2;
        c82Var6 = c82Var4;
        b10Var2 = b10Var;
        context = coroutineContext;
        th = null;
    }

    public b10(t21 t21Var) {
        long b;
        this.o = new ThreadLocal();
        this.p = new AtomicBoolean(false);
        a.C0002a c0002a = a.m;
        se0 se0Var = se0.SECONDS;
        if (se0Var.compareTo(se0Var) <= 0) {
            int i = re0.a;
            b = 60000000000L;
        } else {
            b = b.b(30L, se0Var);
        }
        this.q = b;
        a32 a32Var = new a32(1, new dj(2, t21Var));
        this.m = a32Var;
        this.n = a32Var;
    }
}
