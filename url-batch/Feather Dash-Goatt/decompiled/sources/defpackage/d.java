package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.feathherdashh.dashgame.R;
import com.feathherdashh.dashgame.startup.FeatherFirebaseMessagingService;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class d extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public int j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i, ao0 ao0Var, ao0 ao0Var2, dn dnVar) {
        super(2, dnVar);
        this.i = 23;
        this.j = i;
        this.k = ao0Var;
        this.l = ao0Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 1:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 2:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 3:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 4:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((d) h((dn) obj2, (uo) obj)).k(Unit.a);
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                return ((d) h((dn) obj2, (fl0) obj)).k(Unit.a);
            case 9:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case RequestError.STOP_TRACKING /* 11 */:
                ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
                return tn.d;
            case 12:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 13:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 14:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 15:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 16:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 17:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 18:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 19:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 20:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 21:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 22:
                return ((d) h((dn) obj2, obj)).k(Unit.a);
            case 23:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 24:
                return ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
            default:
                ((d) h((dn) obj2, (sn) obj)).k(Unit.a);
                return tn.d;
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        Object obj2 = this.l;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new d((gn0) this.k, (q60) obj2, dnVar, 0);
            case 1:
                return new d((gn0) this.k, (r60) obj2, dnVar, 1);
            case 2:
                return new d((z8) this.k, (iw0) obj2, dnVar, 2);
            case 3:
                return new d((de) this.k, (s11) obj2, dnVar, 3);
            case 4:
                return new d((he) this.k, (kc) obj2, dnVar, 4);
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                return new d((tk) this.k, (Runnable) obj2, dnVar, 5);
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                d dVar = new d((List) obj2, dnVar, 6);
                dVar.k = obj;
                return dVar;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return new d((Function2) this.k, (ko) obj2, dnVar, 7);
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                d dVar2 = new d((mp) obj2, dnVar, 8);
                dVar2.k = obj;
                return dVar2;
            case 9:
                return new d((FeatherFirebaseMessagingService) this.k, (String) obj2, dnVar, 9);
            case RequestError.EVENT_TIMEOUT /* 10 */:
                d dVar3 = new d((rz) obj2, dnVar, 10);
                dVar3.k = obj;
                return dVar3;
            case RequestError.STOP_TRACKING /* 11 */:
                return new d((z8) obj2, dnVar, 11);
            case 12:
                return new d((fb0) this.k, (Function1) obj2, dnVar, 12);
            case 13:
                return new d((fb0) this.k, (hy0) obj2, dnVar, 13);
            case 14:
                d dVar4 = new d((fg) obj2, dnVar, 14);
                dVar4.k = obj;
                return dVar4;
            case 15:
                d dVar5 = new d((zr) obj2, dnVar, 15);
                dVar5.k = obj;
                return dVar5;
            case 16:
                return new d((d81) this.k, (Function2) obj2, dnVar, 16);
            case 17:
                d dVar6 = new d((j6) obj2, dnVar, 17);
                dVar6.k = obj;
                return dVar6;
            case 18:
                return new d((pt) this.k, (v71) obj2, dnVar, 18);
            case 19:
                return new d((o91) obj2, dnVar, 19);
            case 20:
                return new d((c00) this.k, (iz0) obj2, dnVar, 20);
            case 21:
                return new d((vg) this.k, (p7) obj2, dnVar, 21);
            case 22:
                d dVar7 = new d((d00) obj2, dnVar, 22);
                dVar7.k = obj;
                return dVar7;
            case 23:
                return new d(this.j, (ao0) this.k, (ao0) obj2, dnVar);
            case 24:
                return new d((o11) this.k, (View) obj2, dnVar, 24);
            default:
                return new d((zd1) this.k, (jm0) obj2, dnVar, 25);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c8, code lost:
    
        if (r3 != r1) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d3, code lost:
    
        if (r2.b(r3, r14) == r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0318  */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, zu1] */
    /* JADX WARN: Type inference failed for: r10v0, types: [dn, java.lang.Object, java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v53 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v63, types: [int] */
    /* JADX WARN: Type inference failed for: r1v64, types: [jb0] */
    /* JADX WARN: Type inference failed for: r1v68, types: [jb0] */
    /* JADX WARN: Type inference failed for: r2v90, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, tf] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0318 -> B:141:0x02d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01d3 -> B:90:0x01d7). Please report as a decompilation issue!!! */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        j31 j31Var;
        FirebaseMessaging firebaseMessaging;
        y11 y11Var;
        c cVar;
        CoroutineContext coroutineContext;
        Object p;
        Object G;
        Object c;
        Object m;
        sn snVar;
        Object obj2;
        float s;
        float s2;
        d81 d81Var;
        Object obj3;
        d dVar;
        int i = 2;
        int i2 = 3;
        int i3 = 0;
        int i4 = 1;
        ?? r10 = 0;
        r10 = 0;
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i5 = this.j;
                if (i5 == 0) {
                    ca0.v(obj);
                    gn0 gn0Var = (gn0) this.k;
                    q60 q60Var = (q60) this.l;
                    this.j = 1;
                    if (gn0Var.a(q60Var, this) == tnVar) {
                        return tnVar;
                    }
                } else {
                    if (i5 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 1:
                tn tnVar2 = tn.d;
                int i6 = this.j;
                if (i6 == 0) {
                    ca0.v(obj);
                    gn0 gn0Var2 = (gn0) this.k;
                    r60 r60Var = (r60) this.l;
                    this.j = 1;
                    if (gn0Var2.a(r60Var, this) == tnVar2) {
                        return tnVar2;
                    }
                } else {
                    if (i6 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 2:
                Object obj4 = tn.d;
                int i7 = this.j;
                if (i7 == 0) {
                    ca0.v(obj);
                    yw ywVar = ((z8) this.k).b;
                    iw0 iw0Var = (iw0) this.l;
                    this.j = 1;
                    Object p2 = gb0.p(n8.b.a((Context) ywVar.e, n8.a[0]), new k8(iw0Var, (dn) r10, i3), this);
                    Object obj5 = p2;
                    if (p2 != obj4) {
                        obj5 = Unit.a;
                    }
                    if (obj5 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i7 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 3:
                tn tnVar3 = tn.d;
                int i8 = this.j;
                if (i8 == 0) {
                    ca0.v(obj);
                    de deVar = (de) this.k;
                    ce ceVar = new ce(i3, (s11) this.l);
                    this.j = 1;
                    if (la0.w(deVar, ceVar, this) == tnVar3) {
                        return tnVar3;
                    }
                } else {
                    if (i8 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 4:
                tn tnVar4 = tn.d;
                int i9 = this.j;
                if (i9 == 0) {
                    ca0.v(obj);
                    he heVar = (he) this.k;
                    kc kcVar = (kc) this.l;
                    this.j = 1;
                    if (la0.w(heVar, kcVar, this) == tnVar4) {
                        return tnVar4;
                    }
                } else {
                    if (i9 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                tk tkVar = (tk) this.k;
                tn tnVar5 = tn.d;
                int i10 = this.j;
                if (i10 == 0) {
                    ca0.v(obj);
                    h21 h21Var = tkVar.f;
                    this.j = 1;
                    Object a = h21Var.a(0.0f - h21Var.c, this);
                    if (a != tnVar5) {
                        a = Unit.a;
                    }
                    if (a == tnVar5) {
                        return tnVar5;
                    }
                } else {
                    if (i10 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                tkVar.c.a.setValue(Boolean.FALSE);
                ((Runnable) this.l).run();
                return Unit.a;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                tn tnVar6 = tn.d;
                int i11 = this.j;
                if (i11 == 0) {
                    ca0.v(obj);
                    uo uoVar = (uo) this.k;
                    List list = (List) this.l;
                    this.j = 1;
                    if (yr1.z(list, uoVar, this) == tnVar6) {
                        return tnVar6;
                    }
                } else {
                    if (i11 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                tn tnVar7 = tn.d;
                int i12 = this.j;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ca0.v(obj);
                        return obj;
                    }
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca0.v(obj);
                Function2 function2 = (Function2) this.k;
                Object obj6 = ((ko) this.l).b;
                this.j = 1;
                Object b = function2.b(obj6, this);
                return b == tnVar7 ? tnVar7 : b;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                tn tnVar8 = tn.d;
                int i13 = this.j;
                if (i13 == 0) {
                    ca0.v(obj);
                    fl0 fl0Var = (fl0) this.k;
                    mp mpVar = (mp) this.l;
                    this.j = 1;
                    if (mp.b(mpVar, fl0Var, this) == tnVar8) {
                        return tnVar8;
                    }
                } else {
                    if (i13 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 9:
                tn tnVar9 = tn.d;
                int i14 = this.j;
                if (i14 == 0) {
                    ca0.v(obj);
                    j50 j50Var = j50.w;
                    FeatherFirebaseMessagingService featherFirebaseMessagingService = (FeatherFirebaseMessagingService) this.k;
                    String str = (String) this.l;
                    this.j = 1;
                    if (j50Var.r(featherFirebaseMessagingService, str, this) == tnVar9) {
                        return tnVar9;
                    }
                } else {
                    if (i14 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                sn snVar2 = (sn) this.k;
                tn tnVar10 = tn.d;
                int i15 = this.j;
                if (i15 != 0) {
                    if (i15 == 1) {
                        ca0.v(obj);
                        return obj;
                    }
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca0.v(obj);
                rz rzVar = (rz) this.l;
                this.k = snVar2;
                this.j = 1;
                ?? tfVar = new tf(1, qa0.b(this));
                tfVar.w();
                try {
                    i31 i31Var = k31.d;
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(ez.b());
                    }
                    firebaseMessaging.getClass();
                    ng1 ng1Var = new ng1();
                    firebaseMessaging.f.execute(new x4(firebaseMessaging, 5, ng1Var));
                    ?? r0 = ng1Var.a;
                    s40 s40Var = new s40(24, new qz(rzVar, i3, tfVar));
                    r0.getClass();
                    w21 w21Var = og1.a;
                    r0.e(w21Var, s40Var);
                    r0.c(w21Var, new yw((Object) tfVar, 9, rzVar));
                    j31Var = r0;
                } catch (Throwable th) {
                    i31 i31Var2 = k31.d;
                    j31Var = new j31(th);
                }
                if (k31.a(j31Var) != null && (tfVar.v() instanceof yp0)) {
                    Context context = rzVar.a;
                    context.getClass();
                    String string = context.getApplicationContext().getSharedPreferences("feather_firebase_push_token", 0).getString("push_token", null);
                    if (string != null && !StringsKt.n(string)) {
                        r10 = string;
                    }
                    tfVar.l(r10);
                }
                Object u = tfVar.u();
                tn tnVar11 = tn.d;
                return u == tnVar10 ? tnVar10 : u;
            case RequestError.STOP_TRACKING /* 11 */:
                tn tnVar12 = tn.d;
                int i16 = this.j;
                if (i16 == 0) {
                    ca0.v(obj);
                    y11Var = new y11();
                } else {
                    if (i16 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y11Var = (y11) this.k;
                    ca0.v(obj);
                }
                do {
                    cVar = new c(y11Var, 6, (z8) this.l);
                    this.k = y11Var;
                    this.j = 1;
                    coroutineContext = this.e;
                    coroutineContext.getClass();
                } while (t90.r(coroutineContext).j(cVar, this) != tnVar12);
                return tnVar12;
            case 12:
                fb0 fb0Var = (fb0) this.k;
                ThreadLocal threadLocal = fb0Var.b;
                tn tnVar13 = tn.d;
                int i17 = this.j;
                try {
                    if (i17 == 0) {
                        ca0.v(obj);
                        Object obj7 = threadLocal.get();
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.a(obj7, bool)) {
                            dd0.j("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                            return null;
                        }
                        threadLocal.set(bool);
                        ro roVar = fb0Var.c;
                        k8 k8Var = new k8((Function1) this.l, (dn) r10, i2);
                        this.j = 1;
                        p = gb0.p(roVar, k8Var, this);
                        if (p == tnVar13) {
                            return tnVar13;
                        }
                    } else {
                        if (i17 != 1) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ca0.v(obj);
                        p = obj;
                    }
                    return (qn0) p;
                } finally {
                    threadLocal.set(Boolean.FALSE);
                }
            case 13:
                tn tnVar14 = tn.d;
                int i18 = this.j;
                if (i18 == 0) {
                    ca0.v(obj);
                    c00 o = ((fb0) this.k).c.o();
                    this.j = 1;
                    G = p4.G(o, this);
                    if (G == tnVar14) {
                        return tnVar14;
                    }
                } else {
                    if (i18 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                    G = obj;
                }
                qn0 qn0Var = (qn0) G;
                if (qn0Var == null || (c = qn0Var.c((hy0) this.l)) == null) {
                    return -1L;
                }
                return c;
            case 14:
                tn tnVar15 = tn.d;
                ?? r1 = this.j;
                try {
                    if (r1 == 0) {
                        ca0.v(obj);
                        rc1 N = uq1.N((sn) this.k, null, new rp(i, r10), 3);
                        fg fgVar = (fg) this.l;
                        this.k = N;
                        this.j = 1;
                        m = fgVar.m(this);
                        r1 = N;
                        if (m == tnVar15) {
                            return tnVar15;
                        }
                    } else {
                        if (r1 != 1) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jb0 jb0Var = (jb0) this.k;
                        ca0.v(obj);
                        m = obj;
                        r1 = jb0Var;
                    }
                    return (qm0) m;
                } finally {
                    r1.a(null);
                }
            case 15:
                zr zrVar = (zr) this.l;
                tn tnVar16 = tn.d;
                int i19 = this.j;
                try {
                    if (i19 == 0) {
                        ca0.v(obj);
                        snVar = (sn) this.k;
                    } else {
                        if (i19 == 1) {
                            snVar = (sn) this.k;
                            ca0.v(obj);
                            obj2 = obj;
                            sn snVar3 = snVar;
                            s = ((nr) zrVar.e).s(6.0f);
                            s2 = ((nr) zrVar.e).s(1.0f);
                            d81Var = (d81) zrVar.b;
                            this.k = snVar3;
                            this.j = 2;
                            if (zr.a(zrVar, d81Var, (qm0) obj2, s, s2, this) != tnVar16) {
                                snVar = snVar3;
                            }
                            return tnVar16;
                        }
                        if (i19 != 2) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        snVar = (sn) this.k;
                        ca0.v(obj);
                    }
                    if (!t80.B(snVar.f())) {
                        zrVar.g = null;
                        return Unit.a;
                    }
                    we weVar = (we) zrVar.f;
                    this.k = snVar;
                    this.j = 1;
                    weVar.getClass();
                    obj2 = we.D(weVar, this);
                    if (obj2 == tnVar16) {
                        return tnVar16;
                    }
                    sn snVar32 = snVar;
                    s = ((nr) zrVar.e).s(6.0f);
                    s2 = ((nr) zrVar.e).s(1.0f);
                    d81Var = (d81) zrVar.b;
                    this.k = snVar32;
                    this.j = 2;
                    if (zr.a(zrVar, d81Var, (qm0) obj2, s, s2, this) != tnVar16) {
                    }
                    return tnVar16;
                } catch (Throwable th2) {
                    zrVar.g = null;
                    throw th2;
                }
            case 16:
                tn tnVar17 = tn.d;
                int i20 = this.j;
                if (i20 == 0) {
                    ca0.v(obj);
                    d81 d81Var2 = (d81) this.k;
                    go0 go0Var = go0.e;
                    Function2 function22 = (Function2) this.l;
                    this.j = 1;
                    if (d81Var2.f(go0Var, function22, this) == tnVar17) {
                        return tnVar17;
                    }
                } else {
                    if (i20 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 17:
                tn tnVar18 = tn.d;
                int i21 = this.j;
                if (i21 != 0) {
                    if (i21 == 1) {
                        ca0.v(obj);
                        return Unit.a;
                    }
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca0.v(obj);
                sn snVar4 = (sn) this.k;
                j6 j6Var = (j6) this.l;
                ca1 ca1Var = j6Var.s.a;
                ws wsVar = new ws(j6Var, i2, snVar4);
                this.j = 1;
                ca1Var.getClass();
                ca1.k(ca1Var, wsVar, this);
                return tnVar18;
            case 18:
                tn tnVar19 = tn.d;
                int i22 = this.j;
                if (i22 == 0) {
                    ca0.v(obj);
                    pt ptVar = (pt) this.k;
                    float f = ptVar.b ? -1.0f : 1.0f;
                    d81 d81Var3 = ((v71) this.l).R;
                    long j = ptVar.a;
                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
                    long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                    long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat2);
                    this.j = 1;
                    if (d81Var3.b((floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), false, this) == tnVar19) {
                        return tnVar19;
                    }
                } else {
                    if (i22 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 19:
                o91 o91Var = (o91) this.l;
                tn tnVar20 = tn.d;
                int i23 = this.j;
                if (i23 == 0) {
                    ca0.v(obj);
                    if (((AtomicInteger) ((s40) o91Var.h).e).get() <= 0) {
                        dd0.j("Check failed.");
                        return null;
                    }
                    t80.l(((sn) o91Var.d).f());
                    dVar = (d) o91Var.e;
                    we weVar2 = (we) o91Var.g;
                    this.k = dVar;
                    this.j = 1;
                    weVar2.getClass();
                    obj3 = we.D(weVar2, this);
                } else if (i23 == 1) {
                    dVar = (d) this.k;
                    ca0.v(obj);
                    obj3 = obj;
                    this.k = null;
                    this.j = 2;
                    break;
                } else {
                    if (i23 != 2) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                    if (((AtomicInteger) ((s40) o91Var.h).e).decrementAndGet() == 0) {
                        return Unit.a;
                    }
                    t80.l(((sn) o91Var.d).f());
                    dVar = (d) o91Var.e;
                    we weVar22 = (we) o91Var.g;
                    this.k = dVar;
                    this.j = 1;
                    weVar22.getClass();
                    obj3 = we.D(weVar22, this);
                    break;
                }
            case 20:
                tn tnVar21 = tn.d;
                int i24 = this.j;
                if (i24 == 0) {
                    ca0.v(obj);
                    c00 c00Var = (c00) this.k;
                    xb1 xb1Var = new xb1((iz0) this.l, 1);
                    this.j = 1;
                    if (c00Var.f(xb1Var, this) == tnVar21) {
                        return tnVar21;
                    }
                } else {
                    if (i24 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 21:
                tn tnVar22 = tn.d;
                int i25 = this.j;
                if (i25 == 0) {
                    ca0.v(obj);
                    l7 l7Var = (l7) ((vg) this.k).c;
                    Float f2 = new Float(0.0f);
                    p7 p7Var = (p7) this.l;
                    this.j = 1;
                    if (l7.c(l7Var, f2, p7Var, null, this, 12) == tnVar22) {
                        return tnVar22;
                    }
                } else {
                    if (i25 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 22:
                tn tnVar23 = tn.d;
                int i26 = this.j;
                if (i26 == 0) {
                    ca0.v(obj);
                    Object obj8 = this.k;
                    d00 d00Var = (d00) this.l;
                    this.j = 1;
                    if (d00Var.e(obj8, this) == tnVar23) {
                        return tnVar23;
                    }
                } else {
                    if (i26 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 23:
                tn tnVar24 = tn.d;
                ca0.v(obj);
                int i27 = this.j;
                ao0 ao0Var = (ao0) this.k;
                if (i27 != ((Number) ao0Var.getValue()).intValue()) {
                    ao0Var.setValue(Integer.valueOf(i27));
                    WebView webView = (WebView) ((ao0) this.l).getValue();
                    if (webView != null) {
                        ViewParent parent = webView.getParent();
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup != null) {
                            int i28 = ln1.a;
                            fn1.a(viewGroup);
                        }
                        x80 x80Var = webView instanceof x80 ? (x80) webView : null;
                        if (x80Var != null) {
                            e4 e4Var = x80Var.d;
                            x80Var.removeCallbacks(e4Var);
                            x80Var.postDelayed(e4Var, 180L);
                            x80Var.postDelayed(e4Var, 520L);
                        }
                    }
                }
                return Unit.a;
            case 24:
                o11 o11Var = (o11) this.k;
                ?? r2 = (View) this.l;
                Object obj9 = tn.d;
                int i29 = this.j;
                try {
                    if (i29 == 0) {
                        ca0.v(obj);
                        this.j = 1;
                        Object F = p4.F(o11Var.u, new yo(i, r10, i4), this);
                        if ((F == obj9 ? F : Unit.a) == obj9) {
                            return obj9;
                        }
                    } else {
                        if (i29 != 1) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ca0.v(obj);
                    }
                    return Unit.a;
                } finally {
                    if (vp1.b(r2) == o11Var) {
                        r2.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                }
            default:
                tn tnVar25 = tn.d;
                int i30 = this.j;
                if (i30 == 0) {
                    ca0.v(obj);
                    zd1 zd1Var = (zd1) this.k;
                    x8 x8Var = new x8(i2, (jm0) this.l);
                    this.j = 1;
                    if (zd1Var.f(x8Var, this) == tnVar25) {
                        return tnVar25;
                    }
                } else {
                    if (i30 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                throw new kc0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.k = obj;
        this.l = obj2;
    }
}
