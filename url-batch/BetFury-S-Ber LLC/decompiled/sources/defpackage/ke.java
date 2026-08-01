package defpackage;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ke implements fe {
    public final u50 f;
    public final u50 g;
    public final ThreadLocal h;
    public final AtomicBoolean i;
    public final long j;

    public ke(final i5 i5Var, final String str, int i) {
        long S;
        str.getClass();
        this.h = new ThreadLocal();
        final int i2 = 0;
        this.i = new AtomicBoolean(false);
        int i3 = el.h;
        gl glVar = gl.SECONDS;
        glVar.getClass();
        final int i4 = 1;
        if (glVar.compareTo(glVar) <= 0) {
            gl glVar2 = gl.NANOSECONDS;
            glVar2.getClass();
            S = glVar2.getTimeUnit$kotlin_stdlib().convert(30L, glVar.getTimeUnit$kotlin_stdlib()) << 1;
            int i5 = fl.a;
        } else {
            S = mv.S(30L, glVar);
        }
        this.j = S;
        if (i <= 0) {
            s9.k("Maximum number of readers must be greater than 0");
            throw null;
        }
        this.f = new u50(i, new ir() { // from class: ge
            @Override // defpackage.ir
            public final Object a() {
                int i6 = i2;
                String str2 = str;
                i5 i5Var2 = i5Var;
                switch (i6) {
                    case 0:
                        cb0 c = i5Var2.c(str2);
                        gk0.p(c, "PRAGMA query_only = 1");
                        return c;
                    default:
                        return i5Var2.c(str2);
                }
            }
        });
        this.g = new u50(1, new ir() { // from class: ge
            @Override // defpackage.ir
            public final Object a() {
                int i6 = i4;
                String str2 = str;
                i5 i5Var2 = i5Var;
                switch (i6) {
                    case 0:
                        cb0 c = i5Var2.c(str2);
                        gk0.p(c, "PRAGMA query_only = 1");
                        return c;
                    default:
                        return i5Var2.c(str2);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.i.compareAndSet(false, true)) {
            this.f.b();
            this.g.b();
        }
    }

    public final void i(boolean z) {
        String str = z ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append("\n\nWriter pool:\n");
        this.g.c(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.f.c(sb);
        gk0.S(sb.toString(), 5);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0195 A[Catch: all -> 0x01ac, TRY_LEAVE, TryCatch #6 {all -> 0x01ac, blocks: (B:17:0x018f, B:19:0x0195, B:24:0x019e, B:21:0x01a3), top: B:16:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130 A[Catch: all -> 0x014d, TryCatch #7 {all -> 0x014d, blocks: (B:62:0x012a, B:64:0x0130, B:68:0x0149, B:69:0x0153, B:73:0x015d, B:77:0x01ad, B:78:0x01b4, B:79:0x01b5, B:80:0x01b6, B:81:0x01b9), top: B:61:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b6 A[Catch: all -> 0x014d, TryCatch #7 {all -> 0x014d, blocks: (B:62:0x012a, B:64:0x0130, B:68:0x0149, B:69:0x0153, B:73:0x015d, B:77:0x01ad, B:78:0x01b4, B:79:0x01b5, B:80:0x01b6, B:81:0x01b9), top: B:61:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x007b  */
    @Override // defpackage.fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(boolean z, xr xrVar, dg dgVar) {
        ie ieVar;
        int i;
        u50 u50Var;
        a90 a90Var;
        Throwable th;
        u50 u50Var2;
        a90 a90Var2;
        a90 a90Var3;
        ke keVar;
        boolean z2;
        a90 a90Var4;
        a90 a90Var5;
        pe peVar;
        e60 e60Var;
        e60 e60Var2;
        ke keVar2 = this;
        boolean z3 = z;
        xr xrVar2 = xrVar;
        try {
            if (dgVar instanceof ie) {
                ieVar = (ie) dgVar;
                int i2 = ieVar.r;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ieVar.r = i2 - Integer.MIN_VALUE;
                    qg qgVar = ieVar.g;
                    Object obj = ieVar.p;
                    bh bhVar = bh.COROUTINE_SUSPENDED;
                    i = ieVar.r;
                    int i3 = 0;
                    boolean z4 = true;
                    char c = 1;
                    qg qgVar2 = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    Object[] objArr3 = 0;
                    Object[] objArr4 = 0;
                    if (i != 0) {
                        mv.O(obj);
                        if (keVar2.i.get()) {
                            gk0.S("Connection pool is closed", 21);
                            throw null;
                        }
                        ThreadLocal threadLocal = keVar2.h;
                        e60 e60Var3 = (e60) threadLocal.get();
                        sl slVar = ee.g;
                        if (e60Var3 == null) {
                            qgVar.getClass();
                            ee eeVar = (ee) qgVar.w(slVar);
                            e60Var3 = eeVar != null ? eeVar.f : null;
                        }
                        if (e60Var3 == null) {
                            u50Var = z3 ? keVar2.f : keVar2.g;
                            a90Var = new a90();
                            try {
                                qgVar.getClass();
                                a90Var2 = new a90();
                                try {
                                    long j = keVar2.j;
                                    he heVar = new he((Object) a90Var2, (Object) u50Var, (dg) (objArr == true ? 1 : 0), i3);
                                    ieVar.i = keVar2;
                                    ieVar.j = xrVar2;
                                    ieVar.k = u50Var;
                                    ieVar.l = a90Var;
                                    ieVar.m = qgVar;
                                    ieVar.n = a90Var2;
                                    ieVar.o = z3;
                                    ieVar.r = 3;
                                    if (ud0.E(j, heVar, ieVar) != bhVar) {
                                        a90Var3 = a90Var;
                                        keVar = keVar2;
                                        z2 = z3;
                                        a90Var4 = a90Var2;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    a90 a90Var6 = a90Var;
                                    keVar = keVar2;
                                    a90Var5 = a90Var6;
                                    peVar = (pe) a90Var2.f;
                                    if (peVar == null) {
                                    }
                                    a90Var5.f = e60Var;
                                    if (!(th instanceof hi0)) {
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                u50Var2 = u50Var;
                                throw th;
                            }
                        } else {
                            if (!z3 && e60Var3.b) {
                                gk0.S("Cannot upgrade connection from reader to writer", 1);
                                throw null;
                            }
                            qgVar.getClass();
                            if (qgVar.w(slVar) == null) {
                                ee eeVar2 = new ee(e60Var3);
                                threadLocal.getClass();
                                qg I = mv.I(eeVar2, new zh0(e60Var3, threadLocal));
                                je jeVar = new je(xrVar2, e60Var3, objArr2 == true ? 1 : 0, i3);
                                ieVar.r = 1;
                                Object V = gk0.V(I, jeVar, ieVar);
                                if (V != bhVar) {
                                    return V;
                                }
                            } else {
                                ieVar.r = 2;
                                Object g = xrVar2.g(e60Var3, ieVar);
                                if (g != bhVar) {
                                    return g;
                                }
                            }
                        }
                        return bhVar;
                    }
                    if (i == 1) {
                        mv.O(obj);
                        return obj;
                    }
                    if (i == 2) {
                        mv.O(obj);
                        return obj;
                    }
                    if (i == 3) {
                        z2 = ieVar.o;
                        a90Var4 = ieVar.n;
                        qgVar = ieVar.m;
                        a90 a90Var7 = ieVar.l;
                        u50Var = ieVar.k;
                        xr xrVar3 = (xr) ieVar.j;
                        keVar = (ke) ieVar.i;
                        try {
                            mv.O(obj);
                            a90Var3 = a90Var7;
                            xrVar2 = xrVar3;
                        } catch (Throwable th4) {
                            th = th4;
                            a90Var2 = a90Var4;
                            z3 = z2;
                            keVar2 = keVar;
                            a90Var = a90Var7;
                            xrVar2 = xrVar3;
                            a90 a90Var62 = a90Var;
                            keVar = keVar2;
                            a90Var5 = a90Var62;
                            peVar = (pe) a90Var2.f;
                            if (peVar == null) {
                            }
                            a90Var5.f = e60Var;
                            if (!(th instanceof hi0)) {
                            }
                        }
                    } else {
                        if (i != 4) {
                            s9.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a90Var5 = (a90) ieVar.j;
                        u50Var2 = (u50) ieVar.i;
                        try {
                            mv.O(obj);
                            try {
                                e60Var2 = (e60) a90Var5.f;
                                if (e60Var2 != null) {
                                    if (e60Var2.d.compareAndSet(false, true)) {
                                        try {
                                            gk0.p(e60Var2.a, "ROLLBACK TRANSACTION");
                                        } catch (SQLException unused) {
                                        }
                                    }
                                    pe peVar2 = e60Var2.a;
                                    peVar2.h = null;
                                    peVar2.i = null;
                                    u50Var2.d(peVar2);
                                }
                            } catch (Throwable unused2) {
                            }
                            return obj;
                        } catch (Throwable th5) {
                            th = th5;
                            a90Var = a90Var5;
                            th = th;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    a90Var2 = a90Var4;
                    z3 = z2;
                    a90Var5 = a90Var3;
                    th = null;
                    peVar = (pe) a90Var2.f;
                    if (peVar == null) {
                        qgVar.getClass();
                        peVar.h = qgVar;
                        peVar.i = new Throwable();
                        e60Var = new e60(peVar, keVar.f != keVar.g && z3);
                    } else {
                        e60Var = null;
                    }
                    a90Var5.f = e60Var;
                    if (!(th instanceof hi0)) {
                        keVar.i(z3);
                        throw null;
                    }
                    if (th != null) {
                        throw th;
                    }
                    if (e60Var == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    keVar.getClass();
                    ee eeVar3 = new ee(e60Var);
                    ThreadLocal threadLocal2 = keVar.h;
                    threadLocal2.getClass();
                    qg I2 = mv.I(eeVar3, new zh0(e60Var, threadLocal2));
                    je jeVar2 = new je(xrVar2, a90Var5, objArr3 == true ? 1 : 0, c == true ? 1 : 0);
                    ieVar.i = u50Var;
                    ieVar.j = a90Var5;
                    ieVar.k = null;
                    ieVar.l = null;
                    ieVar.m = null;
                    ieVar.n = null;
                    ieVar.r = 4;
                    obj = gk0.V(I2, jeVar2, ieVar);
                    if (obj != bhVar) {
                        u50Var2 = u50Var;
                        e60Var2 = (e60) a90Var5.f;
                        if (e60Var2 != null) {
                        }
                        return obj;
                    }
                    return bhVar;
                }
            }
            peVar = (pe) a90Var2.f;
            if (peVar == null) {
            }
            a90Var5.f = e60Var;
            if (!(th instanceof hi0)) {
            }
        } catch (Throwable th6) {
            th = th6;
            a90Var = a90Var5;
            u50Var2 = u50Var;
            th = th;
            throw th;
        }
        ieVar = new ie(keVar2, dgVar);
        qg qgVar3 = ieVar.g;
        Object obj2 = ieVar.p;
        bh bhVar2 = bh.COROUTINE_SUSPENDED;
        i = ieVar.r;
        int i32 = 0;
        boolean z42 = true;
        char c2 = 1;
        qg qgVar22 = null;
        Object[] objArr5 = 0;
        Object[] objArr22 = 0;
        Object[] objArr32 = 0;
        Object[] objArr42 = 0;
        if (i != 0) {
        }
        a90Var2 = a90Var4;
        z3 = z2;
        a90Var5 = a90Var3;
        th = null;
    }

    public ke(i5 i5Var) {
        long S;
        this.h = new ThreadLocal();
        this.i = new AtomicBoolean(false);
        int i = el.h;
        gl glVar = gl.SECONDS;
        glVar.getClass();
        int i2 = 1;
        if (glVar.compareTo(glVar) <= 0) {
            gl glVar2 = gl.NANOSECONDS;
            glVar2.getClass();
            S = glVar2.getTimeUnit$kotlin_stdlib().convert(30L, glVar.getTimeUnit$kotlin_stdlib()) << 1;
            int i3 = fl.a;
        } else {
            S = mv.S(30L, glVar);
        }
        this.j = S;
        u50 u50Var = new u50(1, new h2(i2, i5Var));
        this.f = u50Var;
        this.g = u50Var;
    }
}
