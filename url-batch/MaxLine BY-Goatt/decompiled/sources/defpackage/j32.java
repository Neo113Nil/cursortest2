package defpackage;

import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j32 implements uy2, e62 {
    public final j10 a;
    public final boolean b;
    public final bi c;
    public final AtomicBoolean d;

    public j32(j10 j10Var, boolean z) {
        j10Var.getClass();
        this.a = j10Var;
        this.b = z;
        this.c = new bi();
        this.d = new AtomicBoolean(false);
    }

    @Override // defpackage.uy2
    public final Object a(ty2 ty2Var, Function2 function2, pr2 pr2Var) {
        if (this.d.get()) {
            s03.P(21, "Connection is recycled");
            throw null;
        }
        x00 x00Var = (x00) pr2Var.getContext().m(x00.n);
        if (x00Var != null && x00Var.m == this) {
            return g(ty2Var, function2, pr2Var);
        }
        s03.P(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.b32
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Function1 function1, r30 r30Var) {
        i32 i32Var;
        int i;
        j10 j10Var;
        try {
            try {
                if (r30Var instanceof i32) {
                    i32Var = (i32) r30Var;
                    int i2 = i32Var.s;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        i32Var.s = i2 - Integer.MIN_VALUE;
                        Object obj = i32Var.q;
                        b50 b50Var = b50.m;
                        i = i32Var.s;
                        if (i != 0) {
                            ca2.b(obj);
                            if (this.d.get()) {
                                s03.P(21, "Connection is recycled");
                                throw null;
                            }
                            x00 x00Var = (x00) i32Var.getContext().m(x00.n);
                            if (x00Var == null || x00Var.m != this) {
                                s03.P(21, "Attempted to use connection on a different coroutine");
                                throw null;
                            }
                            i32Var.m = this;
                            i32Var.n = str;
                            i32Var.o = function1;
                            j10Var = this.a;
                            i32Var.p = j10Var;
                            i32Var.s = 1;
                            if (j10Var.n.f(i32Var) == b50Var) {
                                return b50Var;
                            }
                        } else {
                            if (i != 1) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j10 j10Var2 = i32Var.p;
                            function1 = i32Var.o;
                            str = i32Var.n;
                            j32 j32Var = i32Var.m;
                            ca2.b(obj);
                            j10Var = j10Var2;
                            this = j32Var;
                        }
                        c32 c32Var = new c32(this, this.a.M(str));
                        Object invoke = function1.invoke(c32Var);
                        yk3.w(c32Var, null);
                        return invoke;
                    }
                }
                Object invoke2 = function1.invoke(c32Var);
                yk3.w(c32Var, null);
                return invoke2;
            } finally {
            }
            c32 c32Var2 = new c32(this, this.a.M(str));
        } finally {
            j10Var.b(null);
        }
        i32Var = new i32(this, r30Var);
        Object obj2 = i32Var.q;
        b50 b50Var2 = b50.m;
        i = i32Var.s;
        if (i != 0) {
        }
    }

    @Override // defpackage.e62
    public final nc2 c() {
        return this.a;
    }

    @Override // defpackage.uy2
    public final Object d(pr2 pr2Var) {
        if (this.d.get()) {
            s03.P(21, "Connection is recycled");
            throw null;
        }
        x00 x00Var = (x00) pr2Var.getContext().m(x00.n);
        if (x00Var != null && x00Var.m == this) {
            return Boolean.valueOf(!this.c.isEmpty());
        }
        s03.P(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:11:0x004e, B:13:0x005a, B:18:0x0065, B:19:0x0093, B:23:0x006d, B:24:0x0072, B:25:0x0073, B:26:0x0079, B:27:0x007f), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:11:0x004e, B:13:0x005a, B:18:0x0065, B:19:0x0093, B:23:0x006d, B:24:0x0072, B:25:0x0073, B:26:0x0079, B:27:0x007f), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ty2 ty2Var, r30 r30Var) {
        f32 f32Var;
        int i;
        j10 j10Var;
        bi biVar;
        try {
            if (r30Var instanceof f32) {
                f32Var = (f32) r30Var;
                int i2 = f32Var.r;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    f32Var.r = i2 - Integer.MIN_VALUE;
                    Object obj = f32Var.p;
                    b50 b50Var = b50.m;
                    i = f32Var.r;
                    if (i != 0) {
                        ca2.b(obj);
                        f32Var.m = this;
                        f32Var.n = ty2Var;
                        j10Var = this.a;
                        f32Var.o = j10Var;
                        f32Var.r = 1;
                        if (j10Var.n.f(f32Var) == b50Var) {
                            return b50Var;
                        }
                    } else {
                        if (i != 1) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j10 j10Var2 = f32Var.o;
                        ty2Var = f32Var.n;
                        j32 j32Var = f32Var.m;
                        ca2.b(obj);
                        j10Var = j10Var2;
                        this = j32Var;
                    }
                    biVar = this.c;
                    j10 j10Var3 = this.a;
                    int i3 = biVar.o;
                    if (biVar.isEmpty()) {
                        s03.l(j10Var3, "SAVEPOINT '" + i3 + '\'');
                    } else {
                        int ordinal = ty2Var.ordinal();
                        if (ordinal == 0) {
                            s03.l(j10Var3, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            s03.l(j10Var3, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                throw new bs1();
                            }
                            s03.l(j10Var3, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                    }
                    biVar.addLast(new e32(i3));
                    Unit unit = Unit.a;
                    j10Var.b(null);
                    return unit;
                }
            }
            biVar = this.c;
            j10 j10Var32 = this.a;
            int i32 = biVar.o;
            if (biVar.isEmpty()) {
            }
            biVar.addLast(new e32(i32));
            Unit unit2 = Unit.a;
            j10Var.b(null);
            return unit2;
        } catch (Throwable th) {
            j10Var.b(null);
            throw th;
        }
        f32Var = new f32(this, r30Var);
        Object obj2 = f32Var.p;
        b50 b50Var2 = b50.m;
        i = f32Var.r;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:11:0x0050, B:13:0x005a, B:15:0x0064, B:17:0x006d, B:18:0x00aa, B:22:0x0075, B:23:0x008a, B:25:0x0090, B:26:0x0096, B:27:0x00b0, B:28:0x00b7), top: B:10:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0 A[Catch: all -> 0x0073, TRY_ENTER, TryCatch #0 {all -> 0x0073, blocks: (B:11:0x0050, B:13:0x005a, B:15:0x0064, B:17:0x006d, B:18:0x00aa, B:22:0x0075, B:23:0x008a, B:25:0x0090, B:26:0x0096, B:27:0x00b0, B:28:0x00b7), top: B:10:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z, r30 r30Var) {
        g32 g32Var;
        int i;
        j10 j10Var;
        bi biVar;
        try {
            if (r30Var instanceof g32) {
                g32Var = (g32) r30Var;
                int i2 = g32Var.r;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    g32Var.r = i2 - Integer.MIN_VALUE;
                    Object obj = g32Var.p;
                    b50 b50Var = b50.m;
                    i = g32Var.r;
                    if (i != 0) {
                        ca2.b(obj);
                        g32Var.m = this;
                        j10Var = this.a;
                        g32Var.n = j10Var;
                        g32Var.o = z;
                        g32Var.r = 1;
                        if (j10Var.n.f(g32Var) == b50Var) {
                            return b50Var;
                        }
                    } else {
                        if (i != 1) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = g32Var.o;
                        j10 j10Var2 = g32Var.n;
                        j32 j32Var = g32Var.m;
                        ca2.b(obj);
                        j10Var = j10Var2;
                        this = j32Var;
                    }
                    biVar = this.c;
                    j10 j10Var3 = this.a;
                    if (!biVar.isEmpty()) {
                        throw new IllegalStateException("Not in a transaction");
                    }
                    e32 e32Var = (e32) vv.p(biVar);
                    if (z) {
                        e32Var.getClass();
                        if (biVar.isEmpty()) {
                            s03.l(j10Var3, "END TRANSACTION");
                        } else {
                            s03.l(j10Var3, "RELEASE SAVEPOINT '" + e32Var.a + '\'');
                        }
                    } else if (biVar.isEmpty()) {
                        s03.l(j10Var3, "ROLLBACK TRANSACTION");
                    } else {
                        s03.l(j10Var3, "ROLLBACK TRANSACTION TO SAVEPOINT '" + e32Var.a + '\'');
                    }
                    Unit unit = Unit.a;
                    j10Var.b(null);
                    return unit;
                }
            }
            biVar = this.c;
            j10 j10Var32 = this.a;
            if (!biVar.isEmpty()) {
            }
        } catch (Throwable th) {
            j10Var.b(null);
            throw th;
        }
        g32Var = new g32(this, r30Var);
        Object obj2 = g32Var.p;
        b50 b50Var2 = b50.m;
        i = g32Var.r;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x007d, code lost:
    
        if (e(r11, r0) == r1) goto L52;
     */
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
    public final Object g(ty2 ty2Var, Function2 function2, r30 r30Var) {
        h32 h32Var;
        Object obj;
        b50 b50Var;
        int i;
        j32 j32Var;
        int i2;
        SQLException e;
        Throwable th;
        try {
            if (r30Var instanceof h32) {
                h32Var = (h32) r30Var;
                int i3 = h32Var.r;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    h32Var.r = i3 - Integer.MIN_VALUE;
                    obj = h32Var.p;
                    b50Var = b50.m;
                    i = h32Var.r;
                    if (i != 0) {
                        ca2.b(obj);
                        if (ty2Var == null) {
                            ty2Var = ty2.m;
                        }
                        h32Var.m = this;
                        h32Var.n = (Serializable) function2;
                        h32Var.r = 1;
                    } else if (i == 1) {
                        function2 = (Function2) h32Var.n;
                        this = (j32) h32Var.m;
                        ca2.b(obj);
                    } else {
                        if (i != 2) {
                            if (i == 3 || i == 4) {
                                Object obj2 = h32Var.m;
                                ca2.b(obj);
                                return obj2;
                            }
                            if (i != 5) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th = (Throwable) h32Var.n;
                            th = (Throwable) h32Var.m;
                            try {
                                ca2.b(obj);
                                throw th;
                            } catch (SQLException e2) {
                                e = e2;
                                if (th != null) {
                                    throw e;
                                }
                                wi0.a(th, e);
                                throw th;
                            }
                        }
                        i2 = h32Var.o;
                        j32Var = (j32) h32Var.m;
                        try {
                            ca2.b(obj);
                            boolean z = i2 != 0;
                            h32Var.m = obj;
                            h32Var.r = 3;
                            return j32Var.f(z, h32Var) != b50Var ? b50Var : obj;
                        } catch (Throwable th2) {
                            th = th2;
                            this = j32Var;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                try {
                                    h32Var.m = th;
                                    h32Var.n = th3;
                                    h32Var.r = 5;
                                    if (this.f(false, h32Var) != b50Var) {
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
                    d32 d32Var = new d32(0, this);
                    h32Var.m = this;
                    h32Var.n = null;
                    h32Var.o = 1;
                    h32Var.r = 2;
                    obj = function2.invoke(d32Var, h32Var);
                    if (obj != b50Var) {
                        j32Var = this;
                        i2 = 1;
                        if (i2 != 0) {
                        }
                        h32Var.m = obj;
                        h32Var.r = 3;
                        if (j32Var.f(z, h32Var) != b50Var) {
                        }
                    }
                }
            }
            d32 d32Var2 = new d32(0, this);
            h32Var.m = this;
            h32Var.n = null;
            h32Var.o = 1;
            h32Var.r = 2;
            obj = function2.invoke(d32Var2, h32Var);
            if (obj != b50Var) {
            }
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
        h32Var = new h32(this, r30Var);
        obj = h32Var.p;
        b50Var = b50.m;
        i = h32Var.r;
        if (i != 0) {
        }
    }
}
