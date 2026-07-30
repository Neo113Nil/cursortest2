package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class f extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public int j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((f) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 1:
                return ((f) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 2:
                return ((f) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 3:
                return ((f) h((dn) obj2, (d00) obj)).k(Unit.a);
            case 4:
                return ((f) h((dn) obj2, (sn) obj)).k(Unit.a);
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                return ((f) h((dn) obj2, (f71) obj)).k(Unit.a);
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((f) h((dn) obj2, (sn) obj)).k(Unit.a);
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((f) h((dn) obj2, (sn) obj)).k(Unit.a);
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                return ((f) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 9:
                return ((f) h((dn) obj2, (sn) obj)).k(Unit.a);
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return ((f) h((dn) obj2, (sn) obj)).k(Unit.a);
            case RequestError.STOP_TRACKING /* 11 */:
                return ((f) h((dn) obj2, (b81) obj)).k(Unit.a);
            case 12:
                return ((f) h((dn) obj2, (f71) obj)).k(Unit.a);
            case 13:
                return ((f) h((dn) obj2, (sn) obj)).k(Unit.a);
            default:
                return ((f) h((dn) obj2, (iz0) obj)).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        Object obj2 = this.m;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new f((gn0) this.k, (yy0) this.l, (rs) obj2, dnVar, 0);
            case 1:
                return new f((he) this.k, (qp0) this.l, (w3) obj2, dnVar, 1);
            case 2:
                f fVar = new f((d00) this.l, (hg) obj2, dnVar, 2);
                fVar.k = obj;
                return fVar;
            case 3:
                f fVar2 = new f((mp) obj2, dnVar, 3);
                fVar2.l = obj;
                return fVar2;
            case 4:
                f fVar3 = new f((mp) this.l, (Function2) obj2, dnVar, 4);
                fVar3.k = obj;
                return fVar3;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                f fVar4 = new f((jb) this.l, (Function2) obj2, dnVar, 5);
                fVar4.k = obj;
                return fVar4;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return new f((jb) this.k, (go0) this.l, (Function2) obj2, dnVar, 6);
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return new f((gn0) this.k, (ga0) this.l, (rs) obj2, dnVar, 7);
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                return new f((we) obj2, dnVar, 8);
            case 9:
                return new f((fb0) this.k, (hy0) this.l, (Long) obj2, dnVar, 9);
            case RequestError.EVENT_TIMEOUT /* 10 */:
                f fVar5 = new f((n11) this.l, (gm0) obj2, dnVar, 10);
                fVar5.k = obj;
                return fVar5;
            case RequestError.STOP_TRACKING /* 11 */:
                f fVar6 = new f((wt) this.l, (d81) obj2, dnVar, 11);
                fVar6.k = obj;
                return fVar6;
            case 12:
                f fVar7 = new f((d81) this.l, (Function2) obj2, dnVar, 12);
                fVar7.k = obj;
                return fVar7;
            case 13:
                f fVar8 = new f((Function2) this.l, (ao0) obj2, dnVar, 13);
                fVar8.k = obj;
                return fVar8;
            default:
                f fVar9 = new f((CoroutineContext) this.l, (c00) obj2, dnVar, 14);
                fVar9.k = obj;
                return fVar9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r0.f(r1, r13) == r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (defpackage.uq1.V(r1, r3, r13) == r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03e7, code lost:
    
        if (r13 == r6) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0387, code lost:
    
        if (r8.e(r9, r13) == r6) goto L202;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0194 A[Catch: all -> 0x0167, TryCatch #1 {all -> 0x0167, blocks: (B:83:0x0163, B:84:0x018c, B:86:0x0194, B:87:0x01a1, B:94:0x01b1, B:96:0x017e, B:100:0x01b4, B:105:0x01ba, B:106:0x01bb, B:113:0x0178, B:89:0x01a2, B:91:0x01a8), top: B:79:0x0157, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018a  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v20, types: [fg] */
    /* JADX WARN: Type inference failed for: r2v22, types: [we] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [fg] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r3v1, types: [jz0, p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0188 -> B:71:0x018c). Please report as a decompilation issue!!! */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Object obj2;
        d00 d00Var;
        Object obj3;
        ve veVar;
        boolean z;
        ?? r2 = 2;
        char c = 2;
        char c2 = 2;
        char c3 = 2;
        int i = 0;
        int i2 = 1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i3 = this.j;
                if (i3 == 0) {
                    ca0.v(obj);
                    gn0 gn0Var = (gn0) this.k;
                    yy0 yy0Var = (yy0) this.l;
                    this.j = 1;
                    if (gn0Var.a(yy0Var, this) == tnVar) {
                        return tnVar;
                    }
                } else {
                    if (i3 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                rs rsVar = (rs) this.m;
                if (rsVar != null) {
                    rsVar.a();
                }
                return Unit.a;
            case 1:
                he heVar = (he) this.k;
                tn tnVar2 = tn.d;
                int i4 = this.j;
                if (i4 == 0) {
                    ca0.v(obj);
                    wm wmVar = heVar.s;
                    fe feVar = new fe(heVar, (qp0) this.l, (w3) this.m);
                    this.j = 1;
                    wmVar.getClass();
                    s11 s11Var = (s11) feVar.invoke();
                    if (s11Var == null || wm.A0(wmVar, s11Var, 0L, 0L, 3)) {
                        obj2 = Unit.a;
                    } else {
                        tf tfVar = new tf(1, qa0.b(this));
                        tfVar.w();
                        sm smVar = new sm(feVar, tfVar);
                        ee eeVar = wmVar.w;
                        eo0 eo0Var = eeVar.a;
                        s11 s11Var2 = (s11) feVar.invoke();
                        if (s11Var2 == null) {
                            i31 i31Var = k31.d;
                            tfVar.l(Unit.a);
                        } else {
                            tfVar.y(new c(eeVar, c, smVar));
                            IntRange g = b11.g(0, eo0Var.g);
                            int i5 = g.d;
                            int i6 = g.e;
                            if (i5 <= i6) {
                                while (true) {
                                    s11 s11Var3 = (s11) ((sm) eo0Var.d[i6]).a.invoke();
                                    if (s11Var3 != null) {
                                        s11 c4 = s11Var2.c(s11Var3);
                                        if (c4.equals(s11Var2)) {
                                            eo0Var.a(i6 + 1, smVar);
                                        } else if (!c4.equals(s11Var3)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i7 = eo0Var.g - 1;
                                            if (i7 <= i6) {
                                                while (true) {
                                                    ((sm) eo0Var.d[i6]).b.t(cancellationException);
                                                    if (i7 != i6) {
                                                        i7++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i6 != i5) {
                                        i6--;
                                    }
                                }
                            }
                            eo0Var.a(0, smVar);
                            if (!wmVar.z) {
                                wmVar.B0(0L);
                            }
                        }
                        obj2 = tfVar.u();
                        if (obj2 != tn.d) {
                            obj2 = Unit.a;
                        }
                    }
                    if (obj2 == tnVar2) {
                        return tnVar2;
                    }
                } else {
                    if (i4 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 2:
                Object obj4 = tn.d;
                int i8 = this.j;
                if (i8 == 0) {
                    ca0.v(obj);
                    sn snVar = (sn) this.k;
                    d00 d00Var2 = (d00) this.l;
                    hg hgVar = (hg) this.m;
                    CoroutineContext coroutineContext = hgVar.d;
                    int i9 = hgVar.e;
                    if (i9 == -3) {
                        i9 = -2;
                    }
                    ue ueVar = hgVar.g;
                    vn vnVar = vn.g;
                    gg ggVar = new gg(hgVar, z2 ? 1 : 0, i);
                    ?? jz0Var = new jz0(jn.b(snVar, coroutineContext), yr1.i(i9, 4, ueVar));
                    jz0Var.r0(vnVar, jz0Var, ggVar);
                    this.j = 1;
                    Object n = mo.n(d00Var2, jz0Var, true, this);
                    Object obj5 = n;
                    if (n != obj4) {
                        obj5 = Unit.a;
                    }
                    if (obj5 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i8 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 3:
                mp mpVar = (mp) this.m;
                tn tnVar3 = tn.d;
                int i10 = this.j;
                if (i10 == 0) {
                    ca0.v(obj);
                    d00 d00Var3 = (d00) this.l;
                    this.l = d00Var3;
                    this.j = 1;
                    Object V = uq1.V(mpVar.g.f(), new xo(mpVar, z3 ? 1 : 0, c2), this);
                    if (V != tnVar3) {
                        d00Var = d00Var3;
                        obj = V;
                    }
                    return tnVar3;
                }
                if (i10 == 1) {
                    d00 d00Var4 = (d00) this.l;
                    ca0.v(obj);
                    d00Var = d00Var4;
                } else {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            ca0.v(obj);
                            return Unit.a;
                        }
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj3 = (ko) this.k;
                    d00Var = (d00) this.l;
                    ca0.v(obj);
                    h00 h00Var = new h00(new s40(16, new yw(new yw(new yw(new xo(mpVar, z6 ? 1 : 0, i), 10, (be1) mpVar.l.e), 12, new yo(c3, z5 ? 1 : 0, i)), 11, new k8(obj3, (dn) (z4 ? 1 : 0), i2))), new zo(mpVar, (dn) null));
                    this.l = null;
                    this.k = null;
                    this.j = 3;
                    if (!(d00Var instanceof ji1)) {
                        throw ((ji1) d00Var).d;
                    }
                    Object f = h00Var.f(d00Var, this);
                    if (f != tnVar3) {
                        f = Unit.a;
                        break;
                    }
                }
                obj3 = (xd1) obj;
                if (obj3 instanceof ko) {
                    ko koVar = (ko) obj3;
                    Object obj6 = koVar.b;
                    this.l = d00Var;
                    this.k = koVar;
                    this.j = 2;
                    break;
                } else {
                    if (obj3 instanceof wk1) {
                        dd0.j("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    if (obj3 instanceof d11) {
                        throw ((d11) obj3).b;
                    }
                    if (obj3 instanceof zy) {
                        return Unit.a;
                    }
                }
                h00 h00Var2 = new h00(new s40(16, new yw(new yw(new yw(new xo(mpVar, z6 ? 1 : 0, i), 10, (be1) mpVar.l.e), 12, new yo(c3, z5 ? 1 : 0, i)), 11, new k8(obj3, (dn) (z4 ? 1 : 0), i2))), new zo(mpVar, (dn) null));
                this.l = null;
                this.k = null;
                this.j = 3;
                if (!(d00Var instanceof ji1)) {
                }
                break;
            case 4:
                mp mpVar2 = (mp) this.l;
                tn tnVar4 = tn.d;
                int i11 = this.j;
                if (i11 == 0) {
                    ca0.v(obj);
                    sn snVar2 = (sn) this.k;
                    ej b = mo.b();
                    fl0 fl0Var = new fl0((Function2) this.m, b, mpVar2.l.q(), snVar2.f());
                    o91 o91Var = mpVar2.p;
                    Object s = ((we) o91Var.g).s(fl0Var);
                    if (s instanceof ng) {
                        Throwable th = ((ng) s).a;
                        if (th == null) {
                            throw new ph("Channel was closed normally");
                        }
                        throw th;
                    }
                    if (!(s instanceof og)) {
                        if (((AtomicInteger) ((s40) o91Var.h).e).getAndIncrement() == 0) {
                            uq1.N((sn) o91Var.d, null, new d(o91Var, z7 ? 1 : 0, 19), 3);
                        }
                        this.j = 1;
                        Object D = b.D(this);
                        return D == tnVar4 ? tnVar4 : D;
                    }
                    dd0.j("Check failed.");
                } else {
                    if (i11 == 1) {
                        ca0.v(obj);
                        return obj;
                    }
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                av0 av0Var = (av0) ((jb) this.l).d;
                tn tnVar5 = tn.d;
                int i12 = this.j;
                try {
                    if (i12 == 0) {
                        ca0.v(obj);
                        f71 f71Var = (f71) this.k;
                        av0Var.setValue(Boolean.TRUE);
                        Function2 function2 = (Function2) this.m;
                        this.j = 1;
                        if (function2.b(f71Var, this) == tnVar5) {
                            return tnVar5;
                        }
                    } else {
                        if (i12 != 1) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ca0.v(obj);
                    }
                    av0Var.setValue(Boolean.FALSE);
                    return Unit.a;
                } catch (Throwable th2) {
                    av0Var.setValue(Boolean.FALSE);
                    throw th2;
                }
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                tn tnVar6 = tn.d;
                int i13 = this.j;
                if (i13 == 0) {
                    ca0.v(obj);
                    jb jbVar = (jb) this.k;
                    lo0 lo0Var = (lo0) jbVar.c;
                    pq pqVar = (pq) jbVar.b;
                    go0 go0Var = (go0) this.l;
                    f fVar = new f(jbVar, (Function2) this.m, z8 ? 1 : 0, 5);
                    this.j = 1;
                    lo0Var.getClass();
                    if (la0.A(new ko0(go0Var, lo0Var, fVar, pqVar, null), this) == tnVar6) {
                        return tnVar6;
                    }
                } else {
                    if (i13 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                tn tnVar7 = tn.d;
                int i14 = this.j;
                if (i14 == 0) {
                    ca0.v(obj);
                    gn0 gn0Var2 = (gn0) this.k;
                    ga0 ga0Var = (ga0) this.l;
                    this.j = 1;
                    if (gn0Var2.a(ga0Var, this) == tnVar7) {
                        return tnVar7;
                    }
                } else {
                    if (i14 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                rs rsVar2 = (rs) this.m;
                if (rsVar2 != null) {
                    rsVar2.a();
                }
                return Unit.a;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                tn tnVar8 = tn.d;
                int i15 = this.j;
                try {
                    if (i15 == 0) {
                        ca0.v(obj);
                        r2 = (we) this.m;
                        veVar = new ve(r2);
                        this.k = r2;
                        this.l = veVar;
                        this.j = 1;
                        obj = veVar.b(this);
                        r2 = r2;
                        if (obj == tnVar8) {
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i15 != 1) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        veVar = (ve) this.l;
                        fg fgVar = (fg) this.k;
                        ca0.v(obj);
                        r2 = fgVar;
                        if (((Boolean) obj).booleanValue()) {
                            y40.b.set(false);
                            synchronized (pb1.c) {
                                wn0 wn0Var = pb1.j.h;
                                z = wn0Var != null && wn0Var.h();
                            }
                            if (z) {
                                pb1.a();
                            }
                            this.k = r2;
                            this.l = veVar;
                            this.j = 1;
                            obj = veVar.b(this);
                            r2 = r2;
                            if (obj == tnVar8) {
                                return tnVar8;
                            }
                            if (((Boolean) obj).booleanValue()) {
                                r2.a(null);
                                return Unit.a;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CancellationException cancellationException2 = th3 instanceof CancellationException ? th3 : null;
                        if (cancellationException2 == null) {
                            cancellationException2 = new CancellationException("Channel was consumed, consumer had failed");
                            cancellationException2.initCause(th3);
                        }
                        r2.a(cancellationException2);
                        throw th4;
                    }
                }
                break;
            case 9:
                tn tnVar9 = tn.d;
                int i16 = this.j;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ca0.v(obj);
                        return obj;
                    }
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca0.v(obj);
                ro roVar = ((fb0) this.k).c;
                fx fxVar = new fx((hy0) this.l, (Long) this.m, null);
                this.j = 1;
                Object p = gb0.p(roVar, fxVar, this);
                return p == tnVar9 ? tnVar9 : p;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                tn tnVar10 = tn.d;
                int i17 = this.j;
                if (i17 != 0) {
                    if (i17 == 1) {
                        ca0.v(obj);
                        return Unit.a;
                    }
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca0.v(obj);
                sn snVar3 = (sn) this.k;
                n11 n11Var = (n11) this.l;
                gm0 gm0Var = (gm0) this.m;
                this.j = 1;
                n11Var.a(snVar3, gm0Var, this);
                return tnVar10;
            case RequestError.STOP_TRACKING /* 11 */:
                tn tnVar11 = tn.d;
                int i18 = this.j;
                if (i18 == 0) {
                    ca0.v(obj);
                    b81 b81Var = (b81) this.k;
                    wt wtVar = (wt) this.l;
                    c cVar = new c(b81Var, 17, (d81) this.m);
                    this.j = 1;
                    if (wtVar.b(cVar, this) == tnVar11) {
                        return tnVar11;
                    }
                } else {
                    if (i18 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 12:
                tn tnVar12 = tn.d;
                int i19 = this.j;
                if (i19 == 0) {
                    ca0.v(obj);
                    f71 f71Var2 = (f71) this.k;
                    d81 d81Var = (d81) this.l;
                    d81Var.k = f71Var2;
                    Function2 function22 = (Function2) this.m;
                    b81 b81Var2 = d81Var.l;
                    this.j = 1;
                    if (function22.b(b81Var2, this) == tnVar12) {
                        return tnVar12;
                    }
                } else {
                    if (i19 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 13:
                tn tnVar13 = tn.d;
                int i20 = this.j;
                if (i20 == 0) {
                    ca0.v(obj);
                    sn snVar4 = (sn) this.k;
                    Function2 function23 = (Function2) this.l;
                    iz0 iz0Var = new iz0((ao0) this.m, snVar4.f());
                    this.j = 1;
                    if (function23.b(iz0Var, this) == tnVar13) {
                        return tnVar13;
                    }
                } else {
                    if (i20 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            default:
                c00 c00Var = (c00) this.m;
                CoroutineContext coroutineContext2 = (CoroutineContext) this.l;
                tn tnVar14 = tn.d;
                int i21 = this.j;
                if (i21 == 0) {
                    ca0.v(obj);
                    iz0 iz0Var2 = (iz0) this.k;
                    if (!Intrinsics.a(coroutineContext2, g.d)) {
                        d dVar = new d((Object) c00Var, (Object) iz0Var2, (dn) (z9 ? 1 : 0), 20);
                        this.j = 2;
                        break;
                    } else {
                        xb1 xb1Var = new xb1(iz0Var2, 0);
                        this.j = 1;
                        break;
                    }
                } else {
                    if (i21 != 1 && i21 != 2) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.m = obj;
    }
}
