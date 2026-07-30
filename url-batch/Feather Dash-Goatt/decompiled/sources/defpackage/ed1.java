package defpackage;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ed1 extends sf1 implements Function2 {
    public bd1 i;
    public boolean j;
    public int k;
    public final /* synthetic */ Context l;
    public final /* synthetic */ nd1 m;
    public final /* synthetic */ ix n;
    public final /* synthetic */ ka o;
    public final /* synthetic */ rz p;
    public final /* synthetic */ ao0 q;
    public final /* synthetic */ ao0 r;
    public final /* synthetic */ ao0 s;
    public final /* synthetic */ ao0 t;
    public final /* synthetic */ ao0 u;
    public final /* synthetic */ yu0 v;
    public final /* synthetic */ ao0 w;
    public final /* synthetic */ ao0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed1(Context context, nd1 nd1Var, ix ixVar, ka kaVar, rz rzVar, ao0 ao0Var, ao0 ao0Var2, ao0 ao0Var3, ao0 ao0Var4, ao0 ao0Var5, yu0 yu0Var, ao0 ao0Var6, ao0 ao0Var7, dn dnVar) {
        super(2, dnVar);
        this.l = context;
        this.m = nd1Var;
        this.n = ixVar;
        this.o = kaVar;
        this.p = rzVar;
        this.q = ao0Var;
        this.r = ao0Var2;
        this.s = ao0Var3;
        this.t = ao0Var4;
        this.u = ao0Var5;
        this.v = yu0Var;
        this.w = ao0Var6;
        this.x = ao0Var7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(yu0 yu0Var, ao0 ao0Var, ao0 ao0Var2, fn fnVar) {
        dd1 dd1Var;
        Object obj;
        int i;
        Object obj2;
        ao0 ao0Var3;
        if (fnVar instanceof dd1) {
            dd1Var = (dd1) fnVar;
            int i2 = dd1Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dd1Var.k = i2 - Integer.MIN_VALUE;
                Object obj3 = dd1Var.j;
                obj = tn.d;
                i = dd1Var.k;
                if (i != 0) {
                    ca0.v(obj3);
                    long h = yu0Var.h();
                    dd1Var.h = ao0Var;
                    dd1Var.i = ao0Var2;
                    dd1Var.k = 1;
                    long currentTimeMillis = 1500 - (System.currentTimeMillis() - h);
                    if (currentTimeMillis > 0) {
                        obj2 = mo.l(currentTimeMillis, dd1Var);
                        if (obj2 != obj) {
                            obj2 = Unit.a;
                        }
                    } else {
                        obj2 = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ao0Var3 = dd1Var.i;
                        ao0Var = dd1Var.h;
                        ca0.v(obj3);
                        ao0Var3.setValue(jd1.e);
                        ao0Var.setValue(Boolean.FALSE);
                        return Unit.a;
                    }
                    ao0Var2 = dd1Var.i;
                    ao0Var = dd1Var.h;
                    ca0.v(obj3);
                }
                ao0Var.setValue(Boolean.TRUE);
                dd1Var.h = ao0Var;
                dd1Var.i = ao0Var2;
                dd1Var.k = 2;
                if (mo.l(260L, dd1Var) != obj) {
                    ao0Var3 = ao0Var2;
                    ao0Var3.setValue(jd1.e);
                    ao0Var.setValue(Boolean.FALSE);
                    return Unit.a;
                }
                return obj;
            }
        }
        dd1Var = new dd1(fnVar);
        Object obj32 = dd1Var.j;
        obj = tn.d;
        i = dd1Var.k;
        if (i != 0) {
        }
        ao0Var.setValue(Boolean.TRUE);
        dd1Var.h = ao0Var;
        dd1Var.i = ao0Var2;
        dd1Var.k = 2;
        if (mo.l(260L, dd1Var) != obj) {
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((ed1) h((dn) obj2, (sn) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        return new ed1(this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, dnVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x015f, code lost:
    
        if (defpackage.gb0.e((defpackage.bd1) r3, r5, r10, true, r22) == r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0094, code lost:
    
        if (o(r4, r7, r8, r22) == r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bf, code lost:
    
        if (r10.a(r22) == r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0144, code lost:
    
        if (r3 == r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b3, code lost:
    
        if (r10.a(r22) == r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0170, code lost:
    
        if (o(r4, r7, r8, r22) != r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c7, code lost:
    
        if (r3 == r1) goto L97;
     */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        bd1 bd1Var;
        boolean z;
        Object A;
        boolean z2;
        boolean z3;
        String str;
        Object A2;
        bd1 bd1Var2;
        tn tnVar = tn.d;
        int i = this.k;
        yu0 yu0Var = this.v;
        ao0 ao0Var = this.u;
        ao0 ao0Var2 = this.s;
        ao0 ao0Var3 = this.q;
        ao0 ao0Var4 = this.r;
        nd1 nd1Var = this.m;
        ao0 ao0Var5 = this.t;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ca0.v(obj);
                if (((jd1) ao0Var3.getValue()) != jd1.d) {
                    return Unit.a;
                }
                gb0.d(ao0Var4, false);
                ao0Var2.setValue(Boolean.FALSE);
                int ordinal = ((vd1) ao0Var5.getValue()).a.ordinal();
                rz rzVar = this.p;
                ka kaVar = this.o;
                bd1Var = null;
                ix ixVar = this.n;
                Context context = this.l;
                if (ordinal == 0) {
                    if (gb0.z(context)) {
                        z = true;
                        ixVar.getClass();
                        if (!StringsKt.n("https://featherrdash.com/config.php")) {
                            this.k = 3;
                            A = la0.A(new id1(context, ixVar, kaVar, rzVar, null), this);
                            break;
                        } else {
                            this.k = 2;
                            break;
                        }
                    } else {
                        this.k = 1;
                        Object p = gb0.p(nd1Var.a, new yo(2, null, 4), this);
                        if (p != tnVar) {
                            p = Unit.a;
                        }
                        if (p != tnVar) {
                            z2 = true;
                            gb0.d(ao0Var4, z2);
                            return Unit.a;
                        }
                    }
                } else if (ordinal == 1) {
                    if (!gb0.z(context)) {
                        ao0Var4.setValue(Boolean.TRUE);
                        return Unit.a;
                    }
                    if (!StringsKt.n(((vd1) ao0Var5.getValue()).b)) {
                        vd1 vd1Var = (vd1) ao0Var5.getValue();
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        long j = vd1Var.c;
                        z3 = j > 0 && currentTimeMillis >= j;
                        ixVar.getClass();
                        if (!StringsKt.n("https://featherrdash.com/config.php") && !((Boolean) ao0Var.getValue()).booleanValue()) {
                            ao0 ao0Var6 = this.w;
                            if (!((Boolean) ao0Var6.getValue()).booleanValue() && (((str = (String) this.x.getValue()) == null || StringsKt.n(str)) && (z3 || !StringsKt.n(((vd1) ao0Var5.getValue()).b)))) {
                                ao0Var6.setValue(Boolean.TRUE);
                                this.j = z3;
                                this.k = 7;
                                A2 = la0.A(new id1(context, ixVar, kaVar, rzVar, null), this);
                                break;
                            }
                        }
                        this.i = null;
                        this.j = z3;
                        this.k = 9;
                        break;
                    } else {
                        this.k = 6;
                        break;
                    }
                } else {
                    if (ordinal != 2) {
                        l.a();
                        return null;
                    }
                    this.k = 5;
                    break;
                }
                return tnVar;
            case 1:
                ca0.v(obj);
                z2 = true;
                gb0.d(ao0Var4, z2);
                return Unit.a;
            case 2:
                ca0.v(obj);
                return Unit.a;
            case 3:
                ca0.v(obj);
                A = obj;
                z = true;
                bd1 bd1Var3 = (bd1) A;
                ao0Var.setValue(Boolean.valueOf(((bd1Var3 instanceof ad1) || Intrinsics.a(bd1Var3, zc1.a)) ? z : false));
                vd1 vd1Var2 = (vd1) ao0Var5.getValue();
                this.i = bd1Var3;
                this.k = 4;
                if (gb0.e(bd1Var3, vd1Var2, nd1Var, false, this) != tnVar) {
                    bd1Var2 = bd1Var3;
                    gb0.d(ao0Var4, Intrinsics.a(bd1Var2, yc1.a));
                    return Unit.a;
                }
                return tnVar;
            case 4:
                bd1Var2 = this.i;
                ca0.v(obj);
                gb0.d(ao0Var4, Intrinsics.a(bd1Var2, yc1.a));
                return Unit.a;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
            case 9:
                ca0.v(obj);
                return Unit.a;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                ca0.v(obj);
                return Unit.a;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                z3 = this.j;
                ca0.v(obj);
                A2 = obj;
                bd1Var = null;
                vd1 vd1Var3 = (vd1) ao0Var5.getValue();
                this.i = bd1Var;
                this.j = z3;
                this.k = 8;
                break;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                z3 = this.j;
                ca0.v(obj);
                this.i = null;
                this.j = z3;
                this.k = 9;
                break;
            default:
                dd0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
