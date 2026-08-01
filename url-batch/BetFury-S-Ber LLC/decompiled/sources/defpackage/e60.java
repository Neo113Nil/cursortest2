package defpackage;

import android.database.SQLException;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class e60 implements ej0, h70 {
    public final pe a;
    public final boolean b;
    public final z6 c;
    public final AtomicBoolean d;

    public e60(pe peVar, boolean z) {
        peVar.getClass();
        this.a = peVar;
        this.b = z;
        this.c = new z6();
        this.d = new AtomicBoolean(false);
    }

    @Override // defpackage.ej0
    public final Object a(dj0 dj0Var, xr xrVar, tg0 tg0Var) {
        if (this.d.get()) {
            gk0.S("Connection is recycled", 21);
            throw null;
        }
        qg qgVar = tg0Var.g;
        qgVar.getClass();
        ee eeVar = (ee) qgVar.w(ee.g);
        if (eeVar != null && eeVar.f == this) {
            return g(dj0Var, xrVar, tg0Var);
        }
        gk0.S("Attempted to use connection on a different coroutine", 21);
        throw null;
    }

    @Override // defpackage.h70
    public final cb0 b() {
        return this.a;
    }

    @Override // defpackage.ej0
    public final Object c(tg0 tg0Var) {
        if (this.d.get()) {
            gk0.S("Connection is recycled", 21);
            throw null;
        }
        qg qgVar = tg0Var.g;
        qgVar.getClass();
        ee eeVar = (ee) qgVar.w(ee.g);
        if (eeVar != null && eeVar.f == this) {
            return Boolean.valueOf(!this.c.isEmpty());
        }
        gk0.S("Attempted to use connection on a different coroutine", 21);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.v50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, tr trVar, eg egVar) {
        d60 d60Var;
        int i;
        pe peVar;
        try {
            try {
                if (egVar instanceof d60) {
                    d60Var = (d60) egVar;
                    int i2 = d60Var.o;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        d60Var.o = i2 - Integer.MIN_VALUE;
                        Object obj = d60Var.m;
                        bh bhVar = bh.COROUTINE_SUSPENDED;
                        i = d60Var.o;
                        if (i != 0) {
                            mv.O(obj);
                            if (this.d.get()) {
                                gk0.S("Connection is recycled", 21);
                                throw null;
                            }
                            qg qgVar = d60Var.g;
                            qgVar.getClass();
                            ee eeVar = (ee) qgVar.w(ee.g);
                            if (eeVar == null || eeVar.f != this) {
                                gk0.S("Attempted to use connection on a different coroutine", 21);
                                throw null;
                            }
                            d60Var.i = this;
                            d60Var.j = str;
                            d60Var.k = trVar;
                            peVar = this.a;
                            d60Var.l = peVar;
                            d60Var.o = 1;
                            if (peVar.g.n(d60Var) == bhVar) {
                                return bhVar;
                            }
                        } else {
                            if (i != 1) {
                                s9.u("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            pe peVar2 = d60Var.l;
                            trVar = d60Var.k;
                            str = d60Var.j;
                            e60 e60Var = d60Var.i;
                            mv.O(obj);
                            peVar = peVar2;
                            this = e60Var;
                        }
                        w50 w50Var = new w50(this, this.a.N(str));
                        Object h = trVar.h(w50Var);
                        mv.h(w50Var, null);
                        return h;
                    }
                }
                Object h2 = trVar.h(w50Var);
                mv.h(w50Var, null);
                return h2;
            } finally {
            }
            w50 w50Var2 = new w50(this, this.a.N(str));
        } finally {
            peVar.i(null);
        }
        d60Var = new d60(this, egVar);
        Object obj2 = d60Var.m;
        bh bhVar2 = bh.COROUTINE_SUSPENDED;
        i = d60Var.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:11:0x004c, B:13:0x0058, B:19:0x0068, B:20:0x0096, B:24:0x0070, B:25:0x0075, B:26:0x0076, B:27:0x007c, B:28:0x0082), top: B:10:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:11:0x004c, B:13:0x0058, B:19:0x0068, B:20:0x0096, B:24:0x0070, B:25:0x0075, B:26:0x0076, B:27:0x007c, B:28:0x0082), top: B:10:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(dj0 dj0Var, eg egVar) {
        a60 a60Var;
        int i;
        pe peVar;
        z6 z6Var;
        try {
            if (egVar instanceof a60) {
                a60Var = (a60) egVar;
                int i2 = a60Var.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    a60Var.n = i2 - Integer.MIN_VALUE;
                    Object obj = a60Var.l;
                    bh bhVar = bh.COROUTINE_SUSPENDED;
                    i = a60Var.n;
                    if (i != 0) {
                        mv.O(obj);
                        a60Var.i = this;
                        a60Var.j = dj0Var;
                        peVar = this.a;
                        a60Var.k = peVar;
                        a60Var.n = 1;
                        if (peVar.n(a60Var) == bhVar) {
                            return bhVar;
                        }
                    } else {
                        if (i != 1) {
                            s9.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pe peVar2 = a60Var.k;
                        dj0Var = a60Var.j;
                        e60 e60Var = a60Var.i;
                        mv.O(obj);
                        peVar = peVar2;
                        this = e60Var;
                    }
                    z6Var = this.c;
                    pe peVar3 = this.a;
                    int i3 = z6Var.h;
                    if (z6Var.isEmpty()) {
                        gk0.p(peVar3, "SAVEPOINT '" + i3 + '\'');
                    } else {
                        int i4 = z50.a[dj0Var.ordinal()];
                        if (i4 == 1) {
                            gk0.p(peVar3, "BEGIN DEFERRED TRANSACTION");
                        } else if (i4 == 2) {
                            gk0.p(peVar3, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (i4 != 3) {
                                throw new md();
                            }
                            gk0.p(peVar3, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                    }
                    z6Var.addLast(new y50(i3));
                    sk0 sk0Var = sk0.a;
                    peVar.i(null);
                    return sk0Var;
                }
            }
            z6Var = this.c;
            pe peVar32 = this.a;
            int i32 = z6Var.h;
            if (z6Var.isEmpty()) {
            }
            z6Var.addLast(new y50(i32));
            sk0 sk0Var2 = sk0.a;
            peVar.i(null);
            return sk0Var2;
        } catch (Throwable th) {
            peVar.i(null);
            throw th;
        }
        a60Var = new a60(this, egVar);
        Object obj2 = a60Var.l;
        bh bhVar2 = bh.COROUTINE_SUSPENDED;
        i = a60Var.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:11:0x004e, B:13:0x0058, B:15:0x0061, B:17:0x0070, B:19:0x0079, B:20:0x00b6, B:24:0x0081, B:25:0x0096, B:27:0x009c, B:28:0x00a2, B:29:0x00bc, B:30:0x00c3, B:31:0x00c4, B:32:0x00cb), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:11:0x004e, B:13:0x0058, B:15:0x0061, B:17:0x0070, B:19:0x0079, B:20:0x00b6, B:24:0x0081, B:25:0x0096, B:27:0x009c, B:28:0x00a2, B:29:0x00bc, B:30:0x00c3, B:31:0x00c4, B:32:0x00cb), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z, eg egVar) {
        b60 b60Var;
        int i;
        pe peVar;
        z6 z6Var;
        try {
            if (egVar instanceof b60) {
                b60Var = (b60) egVar;
                int i2 = b60Var.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    b60Var.n = i2 - Integer.MIN_VALUE;
                    Object obj = b60Var.l;
                    bh bhVar = bh.COROUTINE_SUSPENDED;
                    i = b60Var.n;
                    if (i != 0) {
                        mv.O(obj);
                        b60Var.i = this;
                        peVar = this.a;
                        b60Var.j = peVar;
                        b60Var.k = z;
                        b60Var.n = 1;
                        if (peVar.n(b60Var) == bhVar) {
                            return bhVar;
                        }
                    } else {
                        if (i != 1) {
                            s9.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = b60Var.k;
                        pe peVar2 = b60Var.j;
                        e60 e60Var = b60Var.i;
                        mv.O(obj);
                        peVar = peVar2;
                        this = e60Var;
                    }
                    z6Var = this.c;
                    pe peVar3 = this.a;
                    if (!z6Var.isEmpty()) {
                        throw new IllegalStateException("Not in a transaction");
                    }
                    z6Var.getClass();
                    if (z6Var.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    y50 y50Var = (y50) z6Var.b(z6Var.a() - 1);
                    if (z) {
                        y50Var.getClass();
                        if (z6Var.isEmpty()) {
                            gk0.p(peVar3, "END TRANSACTION");
                        } else {
                            gk0.p(peVar3, "RELEASE SAVEPOINT '" + y50Var.a + '\'');
                        }
                    } else if (z6Var.isEmpty()) {
                        gk0.p(peVar3, "ROLLBACK TRANSACTION");
                    } else {
                        gk0.p(peVar3, "ROLLBACK TRANSACTION TO SAVEPOINT '" + y50Var.a + '\'');
                    }
                    sk0 sk0Var = sk0.a;
                    peVar.i(null);
                    return sk0Var;
                }
            }
            z6Var = this.c;
            pe peVar32 = this.a;
            if (!z6Var.isEmpty()) {
            }
        } catch (Throwable th) {
            peVar.i(null);
            throw th;
        }
        b60Var = new b60(this, egVar);
        Object obj2 = b60Var.l;
        bh bhVar2 = bh.COROUTINE_SUSPENDED;
        i = b60Var.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x007d, code lost:
    
        if (e(r11, r0) == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(dj0 dj0Var, xr xrVar, eg egVar) {
        c60 c60Var;
        Object obj;
        bh bhVar;
        int i;
        e60 e60Var;
        int i2;
        SQLException e;
        Throwable th;
        try {
            if (egVar instanceof c60) {
                c60Var = (c60) egVar;
                int i3 = c60Var.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c60Var.n = i3 - Integer.MIN_VALUE;
                    obj = c60Var.l;
                    bhVar = bh.COROUTINE_SUSPENDED;
                    i = c60Var.n;
                    Object[] objArr = 0;
                    if (i != 0) {
                        mv.O(obj);
                        if (dj0Var == null) {
                            dj0Var = dj0.DEFERRED;
                        }
                        c60Var.i = this;
                        c60Var.j = (Serializable) xrVar;
                        c60Var.n = 1;
                    } else if (i == 1) {
                        xrVar = (xr) c60Var.j;
                        this = (e60) c60Var.i;
                        mv.O(obj);
                    } else {
                        if (i != 2) {
                            if (i == 3 || i == 4) {
                                Object obj2 = c60Var.i;
                                mv.O(obj);
                                return obj2;
                            }
                            if (i != 5) {
                                s9.u("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th = (Throwable) c60Var.j;
                            th = (Throwable) c60Var.i;
                            try {
                                mv.O(obj);
                                throw th;
                            } catch (SQLException e2) {
                                e = e2;
                                if (th != null) {
                                    throw e;
                                }
                                bi.f(th, e);
                                throw th;
                            }
                        }
                        i2 = c60Var.k;
                        e60Var = (e60) c60Var.i;
                        try {
                            mv.O(obj);
                            boolean z = i2 != 0;
                            c60Var.i = obj;
                            c60Var.n = 3;
                            return e60Var.f(z, c60Var) != bhVar ? bhVar : obj;
                        } catch (Throwable th2) {
                            th = th2;
                            this = e60Var;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                try {
                                    c60Var.i = th;
                                    c60Var.j = th3;
                                    c60Var.n = 5;
                                    if (this.f(false, c60Var) != bhVar) {
                                        throw th3;
                                    }
                                } catch (SQLException e3) {
                                    e = e3;
                                    th = th3;
                                    if (th != null) {
                                    }
                                }
                            }
                        }
                    }
                    x50 x50Var = new x50(objArr == true ? 1 : 0, this);
                    c60Var.i = this;
                    c60Var.j = null;
                    c60Var.k = 1;
                    c60Var.n = 2;
                    obj = xrVar.g(x50Var, c60Var);
                    if (obj != bhVar) {
                        e60Var = this;
                        i2 = 1;
                        if (i2 != 0) {
                        }
                        c60Var.i = obj;
                        c60Var.n = 3;
                        if (e60Var.f(z, c60Var) != bhVar) {
                        }
                    }
                }
            }
            x50 x50Var2 = new x50(objArr == true ? 1 : 0, this);
            c60Var.i = this;
            c60Var.j = null;
            c60Var.k = 1;
            c60Var.n = 2;
            obj = xrVar.g(x50Var2, c60Var);
            if (obj != bhVar) {
            }
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
        c60Var = new c60(this, egVar);
        obj = c60Var.l;
        bhVar = bh.COROUTINE_SUSPENDED;
        i = c60Var.n;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
    }
}
