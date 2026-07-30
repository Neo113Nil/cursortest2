package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mp implements ro {
    public final dy d;
    public final yn e;
    public final sn g;
    public final nq0 h;
    public final oo0 i;
    public int j;
    public rc1 k;
    public final s40 l;
    public final o91 m;
    public final cg1 n;
    public final cg1 o;
    public final o91 p;

    public mp(dy dyVar, List list, yn ynVar, sn snVar) {
        list.getClass();
        this.d = dyVar;
        this.e = ynVar;
        this.g = snVar;
        dn dnVar = null;
        this.h = new nq0(9, new f(this, dnVar, 3));
        this.i = new oo0();
        this.l = new s40(17);
        o91 o91Var = new o91();
        list.getClass();
        o91Var.h = this;
        o91Var.d = new oo0();
        o91Var.e = mo.b();
        o91Var.g = CollectionsKt.y(list);
        this.m = o91Var;
        this.n = ee0.b(new wo(this, 1));
        this.o = ee0.b(new wo(this, 0));
        a3 a3Var = new a3(9, this);
        d dVar = new d(this, dnVar, 8);
        o91 o91Var2 = new o91();
        o91Var2.d = snVar;
        o91Var2.e = dVar;
        int i = 6;
        o91Var2.g = yr1.i(Integer.MAX_VALUE, 6, null);
        o91Var2.h = new s40(9);
        jb0 jb0Var = (jb0) snVar.f().d(j41.m);
        if (jb0Var != null) {
            jb0Var.h(new t4(a3Var, i, o91Var2));
        }
        this.p = o91Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:11:0x0046, B:13:0x004e, B:15:0x0052, B:16:0x0058), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(mp mpVar, fn fnVar) {
        bp bpVar;
        int i;
        oo0 oo0Var;
        int i2;
        try {
            if (fnVar instanceof bp) {
                bpVar = (bp) fnVar;
                int i3 = bpVar.l;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    bpVar.l = i3 - Integer.MIN_VALUE;
                    Object obj = bpVar.j;
                    tn tnVar = tn.d;
                    i = bpVar.l;
                    if (i != 0) {
                        ca0.v(obj);
                        oo0Var = mpVar.i;
                        bpVar.h = mpVar;
                        bpVar.i = oo0Var;
                        bpVar.l = 1;
                        if (oo0Var.e(bpVar) == tnVar) {
                            return tnVar;
                        }
                    } else {
                        if (i != 1) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oo0 oo0Var2 = bpVar.i;
                        mp mpVar2 = bpVar.h;
                        ca0.v(obj);
                        oo0Var = oo0Var2;
                        mpVar = mpVar2;
                    }
                    i2 = mpVar.j - 1;
                    mpVar.j = i2;
                    if (i2 == 0) {
                        rc1 rc1Var = mpVar.k;
                        if (rc1Var != null) {
                            rc1Var.a(null);
                        }
                        mpVar.k = null;
                    }
                    oo0Var.h(null);
                    return Unit.a;
                }
            }
            i2 = mpVar.j - 1;
            mpVar.j = i2;
            if (i2 == 0) {
            }
            oo0Var.h(null);
            return Unit.a;
        } catch (Throwable th) {
            oo0Var.h(null);
            throw th;
        }
        bpVar = new bp(mpVar, fnVar);
        Object obj2 = bpVar.j;
        tn tnVar2 = tn.d;
        i = bpVar.l;
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
    /* JADX WARN: Type inference failed for: r9v0, types: [mp] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(mp mpVar, fl0 fl0Var, fn fnVar) {
        cp cpVar;
        int i;
        qb0 qb0Var;
        Throwable a;
        ej ejVar;
        Object b;
        mp mpVar2;
        if (fnVar instanceof cp) {
            cpVar = (cp) fnVar;
            int i2 = cpVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cpVar.m = i2 - Integer.MIN_VALUE;
                Object obj = cpVar.k;
                tn tnVar = tn.d;
                i = cpVar.m;
                boolean z = true;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ej ejVar2 = cpVar.j;
                            mp mpVar3 = cpVar.i;
                            fl0 fl0Var2 = (fl0) cpVar.h;
                            ca0.v(obj);
                            ejVar = ejVar2;
                            mpVar2 = mpVar3;
                            fl0Var = fl0Var2;
                        } else if (i != 3) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    ej ejVar3 = (ej) cpVar.h;
                    ca0.v(obj);
                    mpVar = ejVar3;
                    i31 i31Var = k31.d;
                    qb0Var = mpVar;
                    a = k31.a(obj);
                    if (a != null) {
                        qb0Var.Y(obj);
                    } else {
                        qb0Var.getClass();
                        qb0Var.Y(new hj(a, false));
                    }
                    return Unit.a;
                }
                ca0.v(obj);
                ejVar = fl0Var.b;
                try {
                    i31 i31Var2 = k31.d;
                    xd1 q = mpVar.l.q();
                    if (q instanceof ko) {
                        Function2 function2 = fl0Var.a;
                        CoroutineContext coroutineContext = fl0Var.d;
                        cpVar.h = ejVar;
                        cpVar.m = 1;
                        try {
                            b = mpVar.g().b(new jp((mp) mpVar, coroutineContext, function2, (dn) null), cpVar);
                        } catch (Throwable th) {
                            th = th;
                            th = th;
                            mpVar = ejVar;
                            i31 i31Var3 = k31.d;
                            obj = new j31(th);
                            qb0Var = mpVar;
                            a = k31.a(obj);
                            if (a != null) {
                            }
                            return Unit.a;
                        }
                    } else {
                        if (!(q instanceof d11)) {
                            z = q instanceof wk1;
                        }
                        if (!z) {
                            if (q instanceof zy) {
                                throw ((zy) q).b;
                            }
                            throw new ip0();
                        }
                        if (q != fl0Var.c) {
                            q.getClass();
                            throw ((d11) q).b;
                        }
                        cpVar.h = fl0Var;
                        cpVar.i = mpVar;
                        cpVar.j = ejVar;
                        cpVar.m = 2;
                        Object h = mpVar.h(cpVar);
                        mpVar2 = mpVar;
                        if (h == tnVar) {
                        }
                    }
                    return tnVar;
                } catch (Throwable th2) {
                    th = th2;
                    mpVar = ejVar;
                    i31 i31Var32 = k31.d;
                    obj = new j31(th);
                    qb0Var = mpVar;
                    a = k31.a(obj);
                    if (a != null) {
                    }
                    return Unit.a;
                }
                Function2 function22 = fl0Var.a;
                CoroutineContext coroutineContext2 = fl0Var.d;
                cpVar.h = ejVar;
                cpVar.i = null;
                cpVar.j = null;
                cpVar.m = 3;
                b = mpVar2.g().b(new jp(mpVar2, coroutineContext2, function22, (dn) null), cpVar);
            }
        }
        cpVar = new cp(mpVar, fnVar);
        Object obj2 = cpVar.k;
        tn tnVar2 = tn.d;
        i = cpVar.m;
        boolean z2 = true;
        if (i == 0) {
        }
        Function2 function222 = fl0Var.a;
        CoroutineContext coroutineContext22 = fl0Var.d;
        cpVar.h = ejVar;
        cpVar.i = null;
        cpVar.j = null;
        cpVar.m = 3;
        b = mpVar2.g().b(new jp(mpVar2, coroutineContext22, function222, (dn) null), cpVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:11:0x0046, B:13:0x004d), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(mp mpVar, fn fnVar) {
        dp dpVar;
        int i;
        oo0 oo0Var;
        int i2;
        try {
            if (fnVar instanceof dp) {
                dpVar = (dp) fnVar;
                int i3 = dpVar.l;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dpVar.l = i3 - Integer.MIN_VALUE;
                    Object obj = dpVar.j;
                    tn tnVar = tn.d;
                    i = dpVar.l;
                    int i4 = 1;
                    dn dnVar = null;
                    if (i != 0) {
                        ca0.v(obj);
                        oo0Var = mpVar.i;
                        dpVar.h = mpVar;
                        dpVar.i = oo0Var;
                        dpVar.l = 1;
                        if (oo0Var.e(dpVar) == tnVar) {
                            return tnVar;
                        }
                    } else {
                        if (i != 1) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oo0 oo0Var2 = dpVar.i;
                        mp mpVar2 = dpVar.h;
                        ca0.v(obj);
                        oo0Var = oo0Var2;
                        mpVar = mpVar2;
                    }
                    i2 = mpVar.j + 1;
                    mpVar.j = i2;
                    if (i2 == 1) {
                        mpVar.k = uq1.N(mpVar.g, null, new xo(mpVar, dnVar, i4), 3);
                    }
                    oo0Var.h(null);
                    return Unit.a;
                }
            }
            i2 = mpVar.j + 1;
            mpVar.j = i2;
            if (i2 == 1) {
            }
            oo0Var.h(null);
            return Unit.a;
        } catch (Throwable th) {
            oo0Var.h(null);
            throw th;
        }
        dpVar = new dp(mpVar, fnVar);
        Object obj2 = dpVar.j;
        tn tnVar2 = tn.d;
        i = dpVar.l;
        int i42 = 1;
        dn dnVar2 = null;
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
    public static final Object e(mp mpVar, boolean z, dn dnVar) {
        fp fpVar;
        tn tnVar;
        int i;
        mp mpVar2;
        xd1 xd1Var;
        boolean z2;
        mp mpVar3;
        Pair pair;
        if (dnVar instanceof fp) {
            fpVar = (fp) dnVar;
            int i2 = fpVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fpVar.m = i2 - Integer.MIN_VALUE;
                Object obj = fpVar.k;
                tnVar = tn.d;
                i = fpVar.m;
                dn dnVar2 = null;
                if (i != 0) {
                    ca0.v(obj);
                    xd1 q = mpVar.l.q();
                    if (q instanceof wk1) {
                        dd0.j("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    ua1 g = mpVar.g();
                    fpVar.h = mpVar;
                    fpVar.i = q;
                    fpVar.j = z;
                    fpVar.m = 1;
                    Integer a = g.a();
                    if (a != tnVar) {
                        mpVar2 = mpVar;
                        xd1Var = q;
                        obj = a;
                    }
                    return tnVar;
                }
                if (i != 1) {
                    if (i == 2) {
                        mpVar3 = fpVar.h;
                        ca0.v(obj);
                        pair = (Pair) obj;
                        xd1 xd1Var2 = (xd1) pair.d;
                        if (((Boolean) pair.e).booleanValue()) {
                        }
                        return xd1Var2;
                    }
                    if (i != 3) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mpVar3 = fpVar.h;
                    ca0.v(obj);
                    pair = (Pair) obj;
                    xd1 xd1Var22 = (xd1) pair.d;
                    if (((Boolean) pair.e).booleanValue()) {
                        mpVar3.l.B(xd1Var22);
                    }
                    return xd1Var22;
                }
                z = fpVar.j;
                xd1Var = fpVar.i;
                mpVar2 = fpVar.h;
                ca0.v(obj);
                int intValue = ((Number) obj).intValue();
                z2 = xd1Var instanceof ko;
                int i3 = !z2 ? xd1Var.a : -1;
                if (!z2 && intValue == i3) {
                    return xd1Var;
                }
                if (z) {
                    ua1 g2 = mpVar2.g();
                    hp hpVar = new hp(mpVar2, i3, dnVar2, 0);
                    fpVar.h = mpVar2;
                    fpVar.i = null;
                    fpVar.m = 3;
                    obj = g2.c(hpVar, fpVar);
                    if (obj != tnVar) {
                        mpVar3 = mpVar2;
                        pair = (Pair) obj;
                        xd1 xd1Var222 = (xd1) pair.d;
                        if (((Boolean) pair.e).booleanValue()) {
                        }
                        return xd1Var222;
                    }
                } else {
                    ua1 g3 = mpVar2.g();
                    gp gpVar = new gp(mpVar2, null);
                    fpVar.h = mpVar2;
                    fpVar.i = null;
                    fpVar.m = 2;
                    obj = g3.b(gpVar, fpVar);
                    if (obj != tnVar) {
                        mpVar3 = mpVar2;
                        pair = (Pair) obj;
                        xd1 xd1Var2222 = (xd1) pair.d;
                        if (((Boolean) pair.e).booleanValue()) {
                        }
                        return xd1Var2222;
                    }
                }
                return tnVar;
            }
        }
        fpVar = new fp(mpVar, dnVar);
        Object obj2 = fpVar.k;
        tnVar = tn.d;
        i = fpVar.m;
        dn dnVar22 = null;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z2 = xd1Var instanceof ko;
        if (!z2) {
        }
        if (!z2) {
        }
        if (z) {
        }
        return tnVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|72|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005e, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0139 A[Catch: all -> 0x0165, TryCatch #0 {all -> 0x0165, blocks: (B:27:0x0127, B:29:0x0139, B:32:0x0141), top: B:26:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0141 A[Catch: all -> 0x0165, TRY_LEAVE, TryCatch #0 {all -> 0x0165, blocks: (B:27:0x0127, B:29:0x0139, B:32:0x0141), top: B:26:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d A[Catch: xn -> 0x005e, TryCatch #2 {xn -> 0x005e, blocks: (B:36:0x0059, B:37:0x00fc, B:40:0x0067, B:41:0x00de, B:56:0x0084, B:58:0x009d, B:59:0x00a3, B:65:0x008d, B:68:0x00cb), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(mp mpVar, boolean z, fn fnVar) {
        ip ipVar;
        z11 z11Var;
        xn xnVar;
        mp mpVar2;
        boolean z2;
        z11 z11Var2;
        xn xnVar2;
        Object b;
        x11 x11Var;
        z11 z11Var3;
        Integer a;
        mp mpVar3;
        int i;
        Object obj;
        if (fnVar instanceof ip) {
            ipVar = (ip) fnVar;
            int i2 = ipVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ipVar.p = i2 - Integer.MIN_VALUE;
                Object obj2 = ipVar.n;
                Object obj3 = tn.d;
                int i3 = 1;
                dn dnVar = null;
                switch (ipVar.p) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ca0.v(obj2);
                        if (!z) {
                            ua1 g = mpVar.g();
                            ipVar.h = mpVar;
                            ipVar.l = z;
                            ipVar.p = 3;
                            obj2 = g.a();
                            if (obj2 == obj3) {
                            }
                            int intValue = ((Number) obj2).intValue();
                            ua1 g2 = mpVar.g();
                            hp hpVar = new hp(mpVar, intValue, dnVar, i3);
                            ipVar.h = mpVar;
                            ipVar.l = z;
                            ipVar.p = 4;
                            obj2 = g2.c(hpVar, ipVar);
                            if (obj2 == obj3) {
                            }
                            return (ko) obj2;
                        }
                        ipVar.h = mpVar;
                        ipVar.l = z;
                        ipVar.p = 1;
                        obj2 = mpVar.i(ipVar);
                        if (obj2 == obj3) {
                        }
                        int hashCode = obj2 == null ? obj2.hashCode() : 0;
                        ua1 g3 = mpVar.g();
                        ipVar.h = mpVar;
                        ipVar.i = obj2;
                        ipVar.l = z;
                        ipVar.m = hashCode;
                        ipVar.p = 2;
                        a = g3.a();
                        if (a != obj3) {
                            mpVar3 = mpVar;
                            i = hashCode;
                            obj = obj2;
                            obj2 = a;
                            return new ko(i, ((Number) obj2).intValue(), obj);
                        }
                        return obj3;
                    case 1:
                        z = ipVar.l;
                        mpVar = (mp) ipVar.h;
                        ca0.v(obj2);
                        if (obj2 == null) {
                        }
                        ua1 g32 = mpVar.g();
                        ipVar.h = mpVar;
                        ipVar.i = obj2;
                        ipVar.l = z;
                        ipVar.m = hashCode;
                        ipVar.p = 2;
                        a = g32.a();
                        if (a != obj3) {
                        }
                        return obj3;
                    case 2:
                        i = ipVar.m;
                        z = ipVar.l;
                        obj = ipVar.i;
                        mpVar3 = (mp) ipVar.h;
                        try {
                            ca0.v(obj2);
                            return new ko(i, ((Number) obj2).intValue(), obj);
                        } catch (xn e) {
                            e = e;
                            mpVar = mpVar3;
                            z11Var = new z11();
                            yn ynVar = mpVar.e;
                            ipVar.h = mpVar;
                            ipVar.i = e;
                            ipVar.j = z11Var;
                            ipVar.k = z11Var;
                            ipVar.l = z;
                            ipVar.p = 5;
                            Object e2 = ynVar.e(e);
                            if (e2 != obj3) {
                                xnVar = e;
                                obj2 = e2;
                                mpVar2 = mpVar;
                                z2 = z;
                                z11Var2 = z11Var;
                                z11Var2.d = obj2;
                                x11 x11Var2 = new x11();
                                try {
                                    jp jpVar = new jp(z11Var, mpVar2, x11Var2, (dn) null);
                                    ipVar.h = xnVar;
                                    ipVar.i = z11Var;
                                    ipVar.j = x11Var2;
                                    ipVar.k = null;
                                    ipVar.p = 6;
                                    if (z2) {
                                    }
                                    if (b != obj3) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    xnVar2 = xnVar;
                                    lw.a(xnVar2, th);
                                    throw xnVar2;
                                }
                            }
                            return obj3;
                        }
                    case 3:
                        z = ipVar.l;
                        mpVar = (mp) ipVar.h;
                        ca0.v(obj2);
                        int intValue2 = ((Number) obj2).intValue();
                        ua1 g22 = mpVar.g();
                        hp hpVar2 = new hp(mpVar, intValue2, dnVar, i3);
                        ipVar.h = mpVar;
                        ipVar.l = z;
                        ipVar.p = 4;
                        obj2 = g22.c(hpVar2, ipVar);
                        if (obj2 == obj3) {
                        }
                        return (ko) obj2;
                    case 4:
                        boolean z3 = ipVar.l;
                        ca0.v(obj2);
                        return (ko) obj2;
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        z2 = ipVar.l;
                        z11Var2 = ipVar.k;
                        z11Var = (z11) ipVar.j;
                        xnVar = (xn) ipVar.i;
                        mpVar2 = (mp) ipVar.h;
                        ca0.v(obj2);
                        z11Var2.d = obj2;
                        x11 x11Var22 = new x11();
                        jp jpVar2 = new jp(z11Var, mpVar2, x11Var22, (dn) null);
                        ipVar.h = xnVar;
                        ipVar.i = z11Var;
                        ipVar.j = x11Var22;
                        ipVar.k = null;
                        ipVar.p = 6;
                        if (z2) {
                            b = mpVar2.g().b(new oo(jpVar2, dnVar, i3), ipVar);
                        } else {
                            mpVar2.getClass();
                            b = jpVar2.invoke(ipVar);
                        }
                        if (b != obj3) {
                            x11Var = x11Var22;
                            z11Var3 = z11Var;
                            Object obj4 = z11Var3.d;
                            obj3 = new ko(obj4 != null ? obj4.hashCode() : 0, x11Var.d, obj4);
                        }
                        return obj3;
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        x11Var = (x11) ipVar.j;
                        z11Var3 = (z11) ipVar.i;
                        xnVar2 = (xn) ipVar.h;
                        try {
                            ca0.v(obj2);
                            Object obj42 = z11Var3.d;
                            obj3 = new ko(obj42 != null ? obj42.hashCode() : 0, x11Var.d, obj42);
                            return obj3;
                        } catch (Throwable th2) {
                            th = th2;
                            lw.a(xnVar2, th);
                            throw xnVar2;
                        }
                    default:
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        ipVar = new ip(mpVar, fnVar);
        Object obj22 = ipVar.n;
        Object obj32 = tn.d;
        int i32 = 1;
        dn dnVar2 = null;
        switch (ipVar.p) {
        }
    }

    @Override // defpackage.ro
    public final Object c(Function2 function2, dn dnVar) {
        tl1 tl1Var = (tl1) dnVar.g().d(a60.o);
        if (tl1Var != null) {
            tl1Var.c(this);
        }
        return uq1.V(new tl1(tl1Var, this), new f(this, function2, null, 4), dnVar);
    }

    public final ua1 g() {
        return (ua1) this.o.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r2.q(r0) != r1) goto L27;
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
    public final Object h(fn fnVar) {
        ep epVar;
        int i;
        int intValue;
        mp mpVar;
        int i2;
        Throwable th;
        try {
            if (fnVar instanceof ep) {
                epVar = (ep) fnVar;
                int i3 = epVar.l;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    epVar.l = i3 - Integer.MIN_VALUE;
                    Object obj = epVar.j;
                    Object obj2 = tn.d;
                    i = epVar.l;
                    if (i != 0) {
                        ca0.v(obj);
                        ua1 g = g();
                        epVar.h = this;
                        epVar.l = 1;
                        obj = g.a();
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                dd0.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i2 = epVar.i;
                            mpVar = epVar.h;
                            try {
                                ca0.v(obj);
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                mpVar.l.B(new d11(th, i2));
                                throw th;
                            }
                        }
                        this = epVar.h;
                        ca0.v(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    o91 o91Var = this.m;
                    epVar.h = this;
                    epVar.i = intValue;
                    epVar.l = 2;
                }
            }
            o91 o91Var2 = this.m;
            epVar.h = this;
            epVar.i = intValue;
            epVar.l = 2;
        } catch (Throwable th3) {
            mpVar = this;
            i2 = intValue;
            th = th3;
            mpVar.l.B(new d11(th, i2));
            throw th;
        }
        epVar = new ep(this, fnVar);
        Object obj3 = epVar.j;
        Object obj22 = tn.d;
        i = epVar.l;
        if (i != 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    public final Object i(fn fnVar) {
        return ((gy) this.n.getValue()).a(new zo(3, (dn) null), fnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, boolean z, fn fnVar) {
        kp kpVar;
        int i;
        x11 x11Var;
        if (fnVar instanceof kp) {
            kpVar = (kp) fnVar;
            int i2 = kpVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kpVar.k = i2 - Integer.MIN_VALUE;
                Object obj2 = kpVar.i;
                tn tnVar = tn.d;
                i = kpVar.k;
                if (i != 0) {
                    ca0.v(obj2);
                    x11 x11Var2 = new x11();
                    gy gyVar = (gy) this.n.getValue();
                    lp lpVar = new lp(x11Var2, this, obj, z, null);
                    kpVar.h = x11Var2;
                    kpVar.k = 1;
                    if (gyVar.b(lpVar, kpVar) == tnVar) {
                        return tnVar;
                    }
                    x11Var = x11Var2;
                } else {
                    if (i != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x11Var = kpVar.h;
                    ca0.v(obj2);
                }
                return new Integer(x11Var.d);
            }
        }
        kpVar = new kp(this, fnVar);
        Object obj22 = kpVar.i;
        tn tnVar2 = tn.d;
        i = kpVar.k;
        if (i != 0) {
        }
        return new Integer(x11Var.d);
    }

    @Override // defpackage.ro
    public final c00 o() {
        return this.h;
    }
}
