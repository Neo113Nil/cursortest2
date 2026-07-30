package defpackage;

import com.google.firebase.datastorage.JavaDataStorage;
import defpackage.aa2;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i70 implements n60 {
    public final cl0 m;
    public final at0 n;
    public final a50 o;
    public final x60 p;
    public final qo1 q;
    public int r;
    public jo2 s;
    public final j70 t;
    public final js0 u;
    public final y91 v;
    public final y91 w;
    public final js0 x;

    public i70(cl0 cl0Var, List list, at0 at0Var, a50 a50Var) {
        list.getClass();
        this.m = cl0Var;
        this.n = at0Var;
        this.o = a50Var;
        o30 o30Var = null;
        this.p = new x60(2, new ed(6, o30Var, this));
        this.q = new qo1();
        this.t = new j70();
        js0 js0Var = new js0();
        list.getClass();
        js0Var.p = this;
        js0Var.m = new qo1();
        int i = 1;
        dx dxVar = new dx(true);
        dxVar.R(null);
        js0Var.n = dxVar;
        js0Var.o = zv.M(list);
        this.u = js0Var;
        this.v = ya1.b(new s60(this, i));
        this.w = ya1.b(new s60(this, 0));
        j6 j6Var = new j6(13, this);
        v vVar = new v(22, o30Var, this);
        js0 js0Var2 = new js0();
        js0Var2.m = a50Var;
        js0Var2.n = vVar;
        js0Var2.o = s93.g(Integer.MAX_VALUE, 6, null);
        js0Var2.p = new ar0(9);
        g61 g61Var = (g61) a50Var.n().m(qb2.U);
        if (g61Var != null) {
            g61Var.o(new ih2(i, j6Var, js0Var2));
        }
        this.x = js0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:11:0x0046, B:13:0x004e, B:15:0x0052, B:16:0x0058, B:17:0x005a), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(i70 i70Var, r30 r30Var) {
        y60 y60Var;
        int i;
        qo1 qo1Var;
        int i2;
        try {
            if (r30Var instanceof y60) {
                y60Var = (y60) r30Var;
                int i3 = y60Var.q;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    y60Var.q = i3 - Integer.MIN_VALUE;
                    Object obj = y60Var.o;
                    b50 b50Var = b50.m;
                    i = y60Var.q;
                    if (i != 0) {
                        ca2.b(obj);
                        qo1Var = i70Var.q;
                        y60Var.m = i70Var;
                        y60Var.n = qo1Var;
                        y60Var.q = 1;
                        if (qo1Var.f(y60Var) == b50Var) {
                            return b50Var;
                        }
                    } else {
                        if (i != 1) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qo1 qo1Var2 = y60Var.n;
                        i70 i70Var2 = y60Var.m;
                        ca2.b(obj);
                        qo1Var = qo1Var2;
                        i70Var = i70Var2;
                    }
                    i2 = i70Var.r - 1;
                    i70Var.r = i2;
                    if (i2 == 0) {
                        jo2 jo2Var = i70Var.s;
                        if (jo2Var != null) {
                            jo2Var.f(null);
                        }
                        i70Var.s = null;
                    }
                    Unit unit = Unit.a;
                    qo1Var.b(null);
                    return Unit.a;
                }
            }
            i2 = i70Var.r - 1;
            i70Var.r = i2;
            if (i2 == 0) {
            }
            Unit unit2 = Unit.a;
            qo1Var.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qo1Var.b(null);
            throw th;
        }
        y60Var = new y60(i70Var, r30Var);
        Object obj2 = y60Var.o;
        b50 b50Var2 = b50.m;
        i = y60Var.q;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(8:(1:(1:(2:12|13))(3:15|16|17))|37|38|23|24|(1:26)(1:29)|27|28)(5:39|40|41|(3:43|44|45)(3:49|(1:51)(1:66)|(2:53|(2:55|(1:57))(2:58|59))(2:60|(2:62|63)(2:64|65)))|31)|18|19|20))|69|6|7|(0)(0)|18|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        if (r9 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0033, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r9v0, types: [i70] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(i70 i70Var, el1 el1Var, r30 r30Var) {
        z60 z60Var;
        int i;
        n61 n61Var;
        Throwable a;
        dx dxVar;
        Object b;
        i70 i70Var2;
        if (r30Var instanceof z60) {
            z60Var = (z60) r30Var;
            int i2 = z60Var.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z60Var.r = i2 - Integer.MIN_VALUE;
                Object obj = z60Var.p;
                b50 b50Var = b50.m;
                i = z60Var.r;
                boolean z = true;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            dx dxVar2 = z60Var.o;
                            i70 i70Var3 = z60Var.n;
                            el1 el1Var2 = (el1) z60Var.m;
                            ca2.b(obj);
                            dxVar = dxVar2;
                            i70Var2 = i70Var3;
                            el1Var = el1Var2;
                        } else if (i != 3) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    dx dxVar3 = (dx) z60Var.m;
                    ca2.b(obj);
                    i70Var = dxVar3;
                    aa2.a aVar = aa2.m;
                    n61Var = i70Var;
                    a = aa2.a(obj);
                    if (a != null) {
                        n61Var.U(obj);
                    } else {
                        n61Var.getClass();
                        n61Var.U(new gx(a, false));
                    }
                    return Unit.a;
                }
                ca2.b(obj);
                dxVar = el1Var.b;
                try {
                    aa2.a aVar2 = aa2.m;
                    qo2 b2 = i70Var.t.b();
                    if (b2 instanceof h60) {
                        Function2 function2 = el1Var.a;
                        CoroutineContext coroutineContext = el1Var.d;
                        z60Var.m = dxVar;
                        z60Var.r = 1;
                        try {
                            b = i70Var.h().b(new f70((i70) i70Var, coroutineContext, function2, (o30) null), z60Var);
                        } catch (Throwable th) {
                            th = th;
                            th = th;
                            i70Var = dxVar;
                            aa2.a aVar3 = aa2.m;
                            obj = new ba2(th);
                            n61Var = i70Var;
                            a = aa2.a(obj);
                            if (a != null) {
                            }
                            return Unit.a;
                        }
                    } else {
                        if (!(b2 instanceof g62)) {
                            z = b2 instanceof u13;
                        }
                        if (!z) {
                            if (b2 instanceof zl0) {
                                throw ((zl0) b2).b;
                            }
                            throw new bs1();
                        }
                        if (b2 != el1Var.c) {
                            b2.getClass();
                            throw ((g62) b2).b;
                        }
                        z60Var.m = el1Var;
                        z60Var.n = i70Var;
                        z60Var.o = dxVar;
                        z60Var.r = 2;
                        Object i3 = i70Var.i(z60Var);
                        i70Var2 = i70Var;
                        if (i3 == b50Var) {
                        }
                    }
                    return b50Var;
                } catch (Throwable th2) {
                    th = th2;
                    i70Var = dxVar;
                    aa2.a aVar32 = aa2.m;
                    obj = new ba2(th);
                    n61Var = i70Var;
                    a = aa2.a(obj);
                    if (a != null) {
                    }
                    return Unit.a;
                }
                Function2 function22 = el1Var.a;
                CoroutineContext coroutineContext2 = el1Var.d;
                z60Var.m = dxVar;
                z60Var.n = null;
                z60Var.o = null;
                z60Var.r = 3;
                b = i70Var2.h().b(new f70(i70Var2, coroutineContext2, function22, (o30) null), z60Var);
            }
        }
        z60Var = new z60(i70Var, r30Var);
        Object obj2 = z60Var.p;
        b50 b50Var2 = b50.m;
        i = z60Var.r;
        boolean z2 = true;
        if (i == 0) {
        }
        Function2 function222 = el1Var.a;
        CoroutineContext coroutineContext22 = el1Var.d;
        z60Var.m = dxVar;
        z60Var.n = null;
        z60Var.o = null;
        z60Var.r = 3;
        b = i70Var2.h().b(new f70(i70Var2, coroutineContext22, function222, (o30) null), z60Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[Catch: all -> 0x005c, TryCatch #0 {all -> 0x005c, blocks: (B:11:0x0046, B:13:0x004d, B:14:0x005e), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(i70 i70Var, r30 r30Var) {
        a70 a70Var;
        int i;
        qo1 qo1Var;
        int i2;
        try {
            if (r30Var instanceof a70) {
                a70Var = (a70) r30Var;
                int i3 = a70Var.q;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    a70Var.q = i3 - Integer.MIN_VALUE;
                    Object obj = a70Var.o;
                    b50 b50Var = b50.m;
                    i = a70Var.q;
                    int i4 = 1;
                    o30 o30Var = null;
                    if (i != 0) {
                        ca2.b(obj);
                        qo1Var = i70Var.q;
                        a70Var.m = i70Var;
                        a70Var.n = qo1Var;
                        a70Var.q = 1;
                        if (qo1Var.f(a70Var) == b50Var) {
                            return b50Var;
                        }
                    } else {
                        if (i != 1) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qo1 qo1Var2 = a70Var.n;
                        i70 i70Var2 = a70Var.m;
                        ca2.b(obj);
                        qo1Var = qo1Var2;
                        i70Var = i70Var2;
                    }
                    i2 = i70Var.r + 1;
                    i70Var.r = i2;
                    if (i2 == 1) {
                        i70Var.s = z71.H(i70Var.o, null, new t60(i70Var, o30Var, i4), 3);
                    }
                    Unit unit = Unit.a;
                    qo1Var.b(null);
                    return Unit.a;
                }
            }
            i2 = i70Var.r + 1;
            i70Var.r = i2;
            if (i2 == 1) {
            }
            Unit unit2 = Unit.a;
            qo1Var.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qo1Var.b(null);
            throw th;
        }
        a70Var = new a70(i70Var, r30Var);
        Object obj2 = a70Var.o;
        b50 b50Var2 = b50.m;
        i = a70Var.q;
        int i42 = 1;
        o30 o30Var2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(i70 i70Var, boolean z, o30 o30Var) {
        c70 c70Var;
        b50 b50Var;
        int i;
        i70 i70Var2;
        qo2 qo2Var;
        boolean z2;
        i70 i70Var3;
        Pair pair;
        if (o30Var instanceof c70) {
            c70Var = (c70) o30Var;
            int i2 = c70Var.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c70Var.r = i2 - Integer.MIN_VALUE;
                Object obj = c70Var.p;
                b50Var = b50.m;
                i = c70Var.r;
                if (i != 0) {
                    ca2.b(obj);
                    qo2 b = i70Var.t.b();
                    if (b instanceof u13) {
                        lh.g("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    ll2 h = i70Var.h();
                    c70Var.m = i70Var;
                    c70Var.n = b;
                    c70Var.o = z;
                    c70Var.r = 1;
                    Integer a = h.a();
                    if (a != b50Var) {
                        i70Var2 = i70Var;
                        qo2Var = b;
                        obj = a;
                    }
                    return b50Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        i70Var3 = c70Var.m;
                        ca2.b(obj);
                        pair = (Pair) obj;
                        qo2 qo2Var2 = (qo2) pair.m;
                        if (((Boolean) pair.n).booleanValue()) {
                        }
                        return qo2Var2;
                    }
                    if (i != 3) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i70Var3 = c70Var.m;
                    ca2.b(obj);
                    pair = (Pair) obj;
                    qo2 qo2Var22 = (qo2) pair.m;
                    if (((Boolean) pair.n).booleanValue()) {
                        i70Var3.t.c(qo2Var22);
                    }
                    return qo2Var22;
                }
                z = c70Var.o;
                qo2Var = c70Var.n;
                i70Var2 = c70Var.m;
                ca2.b(obj);
                int intValue = ((Number) obj).intValue();
                z2 = qo2Var instanceof h60;
                int i3 = !z2 ? qo2Var.a : -1;
                if (!z2 && intValue == i3) {
                    return qo2Var;
                }
                if (z) {
                    ll2 h2 = i70Var2.h();
                    d70 d70Var = new d70(i70Var2, i3, null, 0);
                    c70Var.m = i70Var2;
                    c70Var.n = null;
                    c70Var.r = 3;
                    obj = h2.c(d70Var, c70Var);
                    if (obj != b50Var) {
                        i70Var3 = i70Var2;
                        pair = (Pair) obj;
                        qo2 qo2Var222 = (qo2) pair.m;
                        if (((Boolean) pair.n).booleanValue()) {
                        }
                        return qo2Var222;
                    }
                } else {
                    ll2 h3 = i70Var2.h();
                    c60 c60Var = new c60(i70Var2, null);
                    c70Var.m = i70Var2;
                    c70Var.n = null;
                    c70Var.r = 2;
                    obj = h3.b(c60Var, c70Var);
                    if (obj != b50Var) {
                        i70Var3 = i70Var2;
                        pair = (Pair) obj;
                        qo2 qo2Var2222 = (qo2) pair.m;
                        if (((Boolean) pair.n).booleanValue()) {
                        }
                        return qo2Var2222;
                    }
                }
                return b50Var;
            }
        }
        c70Var = new c70(i70Var, o30Var);
        Object obj2 = c70Var.p;
        b50Var = b50.m;
        i = c70Var.r;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z2 = qo2Var instanceof h60;
        if (!z2) {
        }
        if (!z2) {
        }
        if (z) {
        }
        return b50Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|72|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005e, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013f A[Catch: all -> 0x016b, TryCatch #2 {all -> 0x016b, blocks: (B:27:0x012d, B:29:0x013f, B:32:0x0147), top: B:26:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0147 A[Catch: all -> 0x016b, TRY_LEAVE, TryCatch #2 {all -> 0x016b, blocks: (B:27:0x012d, B:29:0x013f, B:32:0x0147), top: B:26:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d A[Catch: f50 -> 0x005e, TryCatch #0 {f50 -> 0x005e, blocks: (B:36:0x0059, B:37:0x00fc, B:40:0x0067, B:41:0x00de, B:56:0x0084, B:58:0x009d, B:59:0x00a3, B:65:0x008d, B:68:0x00cb), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(i70 i70Var, boolean z, r30 r30Var) {
        e70 e70Var;
        c82 c82Var;
        d42 dataStore_delegate$lambda$0;
        f50 f50Var;
        i70 i70Var2;
        boolean z2;
        c82 c82Var2;
        f50 f50Var2;
        Object b;
        a82 a82Var;
        c82 c82Var3;
        Integer a;
        i70 i70Var3;
        int i;
        Object obj;
        if (r30Var instanceof e70) {
            e70Var = (e70) r30Var;
            int i2 = e70Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e70Var.u = i2 - Integer.MIN_VALUE;
                Object obj2 = e70Var.s;
                Object obj3 = b50.m;
                int i3 = 1;
                o30 o30Var = null;
                switch (e70Var.u) {
                    case 0:
                        ca2.b(obj2);
                        if (!z) {
                            ll2 h = i70Var.h();
                            e70Var.m = i70Var;
                            e70Var.q = z;
                            e70Var.u = 3;
                            obj2 = h.a();
                            if (obj2 == obj3) {
                            }
                            int intValue = ((Number) obj2).intValue();
                            ll2 h2 = i70Var.h();
                            d70 d70Var = new d70(i70Var, intValue, null, 1);
                            e70Var.m = i70Var;
                            e70Var.q = z;
                            e70Var.u = 4;
                            obj2 = h2.c(d70Var, e70Var);
                            if (obj2 == obj3) {
                            }
                            return (h60) obj2;
                        }
                        e70Var.m = i70Var;
                        e70Var.q = z;
                        e70Var.u = 1;
                        obj2 = i70Var.j(e70Var);
                        if (obj2 == obj3) {
                        }
                        int hashCode = obj2 == null ? obj2.hashCode() : 0;
                        ll2 h3 = i70Var.h();
                        e70Var.m = i70Var;
                        e70Var.n = obj2;
                        e70Var.q = z;
                        e70Var.r = hashCode;
                        e70Var.u = 2;
                        a = h3.a();
                        if (a != obj3) {
                            i70Var3 = i70Var;
                            i = hashCode;
                            obj = obj2;
                            obj2 = a;
                            return new h60(i, ((Number) obj2).intValue(), obj);
                        }
                        return obj3;
                    case 1:
                        z = e70Var.q;
                        i70Var = (i70) e70Var.m;
                        ca2.b(obj2);
                        if (obj2 == null) {
                        }
                        ll2 h32 = i70Var.h();
                        e70Var.m = i70Var;
                        e70Var.n = obj2;
                        e70Var.q = z;
                        e70Var.r = hashCode;
                        e70Var.u = 2;
                        a = h32.a();
                        if (a != obj3) {
                        }
                        return obj3;
                    case 2:
                        i = e70Var.r;
                        z = e70Var.q;
                        obj = e70Var.n;
                        i70Var3 = (i70) e70Var.m;
                        try {
                            ca2.b(obj2);
                            return new h60(i, ((Number) obj2).intValue(), obj);
                        } catch (f50 e) {
                            e = e;
                            i70Var = i70Var3;
                            c82Var = new c82();
                            at0 at0Var = i70Var.n;
                            e70Var.m = i70Var;
                            e70Var.n = e;
                            e70Var.o = c82Var;
                            e70Var.p = c82Var;
                            e70Var.q = z;
                            e70Var.u = 5;
                            dataStore_delegate$lambda$0 = JavaDataStorage.dataStore_delegate$lambda$0(((l51) at0Var.m).n, e);
                            if (dataStore_delegate$lambda$0 != obj3) {
                                f50Var = e;
                                obj2 = dataStore_delegate$lambda$0;
                                i70Var2 = i70Var;
                                z2 = z;
                                c82Var2 = c82Var;
                                c82Var2.m = obj2;
                                a82 a82Var2 = new a82();
                                try {
                                    f70 f70Var = new f70(c82Var, i70Var2, a82Var2, (o30) null);
                                    e70Var.m = f50Var;
                                    e70Var.n = c82Var;
                                    e70Var.o = a82Var2;
                                    e70Var.p = null;
                                    e70Var.u = 6;
                                    if (z2) {
                                    }
                                    if (b != obj3) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    f50Var2 = f50Var;
                                    wi0.a(f50Var2, th);
                                    throw f50Var2;
                                }
                            }
                            return obj3;
                        }
                    case 3:
                        z = e70Var.q;
                        i70Var = (i70) e70Var.m;
                        ca2.b(obj2);
                        int intValue2 = ((Number) obj2).intValue();
                        ll2 h22 = i70Var.h();
                        d70 d70Var2 = new d70(i70Var, intValue2, null, 1);
                        e70Var.m = i70Var;
                        e70Var.q = z;
                        e70Var.u = 4;
                        obj2 = h22.c(d70Var2, e70Var);
                        if (obj2 == obj3) {
                        }
                        return (h60) obj2;
                    case 4:
                        boolean z3 = e70Var.q;
                        ca2.b(obj2);
                        return (h60) obj2;
                    case 5:
                        z2 = e70Var.q;
                        c82Var2 = e70Var.p;
                        c82Var = (c82) e70Var.o;
                        f50Var = (f50) e70Var.n;
                        i70Var2 = (i70) e70Var.m;
                        ca2.b(obj2);
                        c82Var2.m = obj2;
                        a82 a82Var22 = new a82();
                        f70 f70Var2 = new f70(c82Var, i70Var2, a82Var22, (o30) null);
                        e70Var.m = f50Var;
                        e70Var.n = c82Var;
                        e70Var.o = a82Var22;
                        e70Var.p = null;
                        e70Var.u = 6;
                        if (z2) {
                            b = i70Var2.h().b(new k60(i3, o30Var, f70Var2), e70Var);
                        } else {
                            i70Var2.getClass();
                            b = f70Var2.invoke(e70Var);
                        }
                        if (b != obj3) {
                            a82Var = a82Var22;
                            c82Var3 = c82Var;
                            Object obj4 = c82Var3.m;
                            obj3 = new h60(obj4 != null ? obj4.hashCode() : 0, a82Var.m, obj4);
                        }
                        return obj3;
                    case 6:
                        a82Var = (a82) e70Var.o;
                        c82Var3 = (c82) e70Var.n;
                        f50Var2 = (f50) e70Var.m;
                        try {
                            ca2.b(obj2);
                            Object obj42 = c82Var3.m;
                            obj3 = new h60(obj42 != null ? obj42.hashCode() : 0, a82Var.m, obj42);
                            return obj3;
                        } catch (Throwable th2) {
                            th = th2;
                            wi0.a(f50Var2, th);
                            throw f50Var2;
                        }
                    default:
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        e70Var = new e70(i70Var, r30Var);
        Object obj22 = e70Var.s;
        Object obj32 = b50.m;
        int i32 = 1;
        o30 o30Var2 = null;
        switch (e70Var.u) {
        }
    }

    @Override // defpackage.n60
    public final Object a(Function2 function2, pr2 pr2Var) {
        a33 a33Var = (a33) pr2Var.getContext().m(by1.F);
        if (a33Var != null) {
            a33Var.a(this);
        }
        return z71.V(new a33(a33Var, this), new ed(this, function2, (o30) null, 7), pr2Var);
    }

    @Override // defpackage.n60
    public final xm0 f() {
        return this.p;
    }

    public final ll2 h() {
        return (ll2) this.w.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r2.F(r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(r30 r30Var) {
        b70 b70Var;
        int i;
        int intValue;
        i70 i70Var;
        int i2;
        Throwable th;
        try {
            if (r30Var instanceof b70) {
                b70Var = (b70) r30Var;
                int i3 = b70Var.q;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    b70Var.q = i3 - Integer.MIN_VALUE;
                    Object obj = b70Var.o;
                    Object obj2 = b50.m;
                    i = b70Var.q;
                    if (i != 0) {
                        ca2.b(obj);
                        ll2 h = h();
                        b70Var.m = this;
                        b70Var.q = 1;
                        obj = h.a();
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i2 = b70Var.n;
                            i70Var = b70Var.m;
                            try {
                                ca2.b(obj);
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                i70Var.t.c(new g62(th, i2));
                                throw th;
                            }
                        }
                        this = b70Var.m;
                        ca2.b(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    js0 js0Var = this.u;
                    b70Var.m = this;
                    b70Var.n = intValue;
                    b70Var.q = 2;
                }
            }
            js0 js0Var2 = this.u;
            b70Var.m = this;
            b70Var.n = intValue;
            b70Var.q = 2;
        } catch (Throwable th3) {
            i70Var = this;
            i2 = intValue;
            th = th3;
            i70Var.t.c(new g62(th, i2));
            throw th;
        }
        b70Var = new b70(this, r30Var);
        Object obj3 = b70Var.o;
        Object obj22 = b50.m;
        i = b70Var.q;
        if (i != 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    public final Object j(r30 r30Var) {
        return ((fl0) this.v.getValue()).a(new v60(3, (o30) null), r30Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, boolean z, r30 r30Var) {
        g70 g70Var;
        int i;
        a82 a82Var;
        if (r30Var instanceof g70) {
            g70Var = (g70) r30Var;
            int i2 = g70Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g70Var.p = i2 - Integer.MIN_VALUE;
                Object obj2 = g70Var.n;
                b50 b50Var = b50.m;
                i = g70Var.p;
                if (i != 0) {
                    ca2.b(obj2);
                    a82 a82Var2 = new a82();
                    fl0 fl0Var = (fl0) this.v.getValue();
                    h70 h70Var = new h70(a82Var2, this, obj, z, null);
                    g70Var.m = a82Var2;
                    g70Var.p = 1;
                    if (fl0Var.b(h70Var, g70Var) == b50Var) {
                        return b50Var;
                    }
                    a82Var = a82Var2;
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a82Var = g70Var.m;
                    ca2.b(obj2);
                }
                return new Integer(a82Var.m);
            }
        }
        g70Var = new g70(this, r30Var);
        Object obj22 = g70Var.n;
        b50 b50Var2 = b50.m;
        i = g70Var.p;
        if (i != 0) {
        }
        return new Integer(a82Var.m);
    }
}
