package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.KeyEvent;
import com.appsflyer.internal.l;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class ka0 {
    public static final void A(hl hlVar, Function1 function1) {
        hlVar.b(Unit.a, new jl(12, function1));
    }

    public static final float B(long j, float f, nr nrVar) {
        float c;
        long b = wh1.b(j);
        if (xh1.a(b, 4294967296L)) {
            if (nrVar.f() <= 1.05d) {
                return nrVar.U(j);
            }
            c = wh1.c(j) / wh1.c(nrVar.a0(f));
        } else {
            if (!xh1.a(b, 8589934592L)) {
                return Float.NaN;
            }
            c = wh1.c(j);
        }
        return c * f;
    }

    public static final void C(hl hlVar, Object obj, Function2 function2) {
        if (hlVar.S || !Intrinsics.a(hlVar.L(), obj)) {
            hlVar.h0(obj);
            hlVar.b(obj, function2);
        }
    }

    public static final void D(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(la0.W(j)), i, i2, 33);
        }
    }

    public static final void E(Spannable spannable, long j, nr nrVar, int i, int i2) {
        long b = wh1.b(j);
        if (xh1.a(b, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(pk0.a(nrVar.U(j)), false), i, i2, 33);
        } else if (xh1.a(b, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(wh1.c(j)), i, i2, 33);
        }
    }

    public static final void F(Spannable spannable, mi0 mi0Var, int i, int i2) {
        if (mi0Var != null) {
            ArrayList arrayList = new ArrayList(ai.h(mi0Var));
            Iterator it = mi0Var.d.iterator();
            while (it.hasNext()) {
                arrayList.add(((li0) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static boolean G(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [zl0] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [zl0] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void H(zl0 zl0Var, Object obj, Function1 function1) {
        l7 l7Var;
        if (!zl0Var.d.r) {
            o80.b("visitAncestors called on an unattached node");
        }
        zl0 zl0Var2 = zl0Var.d.i;
        jd0 I = op.I(zl0Var);
        while (I != null) {
            if ((((zl0) I.J.g).h & 262144) != 0) {
                while (zl0Var2 != null) {
                    if ((zl0Var2.g & 262144) != 0) {
                        zq zqVar = zl0Var2;
                        ?? r4 = 0;
                        while (zqVar != 0) {
                            if (zqVar instanceof kj1) {
                                kj1 kj1Var = (kj1) zqVar;
                                if (!(obj.equals(kj1Var.h()) ? ((Boolean) function1.invoke(kj1Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((zqVar.g & 262144) != 0 && (zqVar instanceof zq)) {
                                zl0 zl0Var3 = zqVar.t;
                                int i = 0;
                                zqVar = zqVar;
                                r4 = r4;
                                while (zl0Var3 != null) {
                                    if ((zl0Var3.g & 262144) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            zqVar = zl0Var3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new eo0(new zl0[16]);
                                            }
                                            if (zqVar != 0) {
                                                r4.b(zqVar);
                                                zqVar = 0;
                                            }
                                            r4.b(zl0Var3);
                                        }
                                    }
                                    zl0Var3 = zl0Var3.j;
                                    zqVar = zqVar;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            zqVar = op.o(r4);
                        }
                    }
                    zl0Var2 = zl0Var2.i;
                }
            }
            I = I.s();
            zl0Var2 = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [zl0] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [zl0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void I(yq yqVar, String str, Function1 function1) {
        if (!((zl0) yqVar).d.r) {
            o80.b("visitSubtreeIf called on an unattached node");
        }
        eo0 eo0Var = new eo0(new zl0[16]);
        zl0 zl0Var = ((zl0) yqVar).d;
        zl0 zl0Var2 = zl0Var.j;
        if (zl0Var2 == null) {
            op.l(eo0Var, zl0Var);
        } else {
            eo0Var.b(zl0Var2);
        }
        while (true) {
            int i = eo0Var.g;
            if (i == 0) {
                return;
            }
            zl0 zl0Var3 = (zl0) eo0Var.k(i - 1);
            if ((zl0Var3.h & 262144) != 0) {
                for (zl0 zl0Var4 = zl0Var3; zl0Var4 != null && zl0Var4.r; zl0Var4 = zl0Var4.j) {
                    if ((zl0Var4.g & 262144) != 0) {
                        zq zqVar = zl0Var4;
                        ?? r6 = 0;
                        while (zqVar != 0) {
                            if (zqVar instanceof kj1) {
                                kj1 kj1Var = (kj1) zqVar;
                                jj1 jj1Var = str.equals(kj1Var.h()) ? (jj1) function1.invoke(kj1Var) : jj1.d;
                                if (jj1Var == jj1.g) {
                                    return;
                                }
                                if (jj1Var == jj1.e) {
                                    break;
                                }
                            } else if ((zqVar.g & 262144) != 0 && (zqVar instanceof zq)) {
                                zl0 zl0Var5 = zqVar.t;
                                int i2 = 0;
                                zqVar = zqVar;
                                r6 = r6;
                                while (zl0Var5 != null) {
                                    if ((zl0Var5.g & 262144) != 0) {
                                        i2++;
                                        r6 = r6;
                                        if (i2 == 1) {
                                            zqVar = zl0Var5;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new eo0(new zl0[16]);
                                            }
                                            if (zqVar != 0) {
                                                r6.b(zqVar);
                                                zqVar = 0;
                                            }
                                            r6.b(zl0Var5);
                                        }
                                    }
                                    zl0Var5 = zl0Var5.j;
                                    zqVar = zqVar;
                                    r6 = r6;
                                }
                                if (i2 == 1) {
                                }
                            }
                            zqVar = op.o(r6);
                        }
                    }
                }
            }
            op.l(eo0Var, zl0Var3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kj1] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [zl0] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [zl0] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void J(kj1 kj1Var, Function1 function1) {
        if (!((zl0) kj1Var).d.r) {
            o80.b("visitSubtreeIf called on an unattached node");
        }
        eo0 eo0Var = new eo0(new zl0[16]);
        zl0 zl0Var = ((zl0) kj1Var).d;
        zl0 zl0Var2 = zl0Var.j;
        if (zl0Var2 == null) {
            op.l(eo0Var, zl0Var);
        } else {
            eo0Var.b(zl0Var2);
        }
        while (true) {
            int i = eo0Var.g;
            if (i == 0) {
                return;
            }
            zl0 zl0Var3 = (zl0) eo0Var.k(i - 1);
            if ((zl0Var3.h & 262144) != 0) {
                for (zl0 zl0Var4 = zl0Var3; zl0Var4 != null && zl0Var4.r; zl0Var4 = zl0Var4.j) {
                    if ((zl0Var4.g & 262144) != 0) {
                        zq zqVar = zl0Var4;
                        ?? r7 = 0;
                        while (zqVar != 0) {
                            if (zqVar instanceof kj1) {
                                kj1 kj1Var2 = (kj1) zqVar;
                                jj1 jj1Var = (Intrinsics.a(kj1Var.h(), kj1Var2.h()) && kj1Var.getClass() == kj1Var2.getClass()) ? (jj1) function1.invoke(kj1Var2) : jj1.d;
                                if (jj1Var == jj1.g) {
                                    return;
                                }
                                if (jj1Var == jj1.e) {
                                    break;
                                }
                            } else if ((zqVar.g & 262144) != 0 && (zqVar instanceof zq)) {
                                zl0 zl0Var5 = zqVar.t;
                                int i2 = 0;
                                zqVar = zqVar;
                                r7 = r7;
                                while (zl0Var5 != null) {
                                    if ((zl0Var5.g & 262144) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            zqVar = zl0Var5;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new eo0(new zl0[16]);
                                            }
                                            if (zqVar != 0) {
                                                r7.b(zqVar);
                                                zqVar = 0;
                                            }
                                            r7.b(zl0Var5);
                                        }
                                    }
                                    zl0Var5 = zl0Var5.j;
                                    zqVar = zqVar;
                                    r7 = r7;
                                }
                                if (i2 == 1) {
                                }
                            }
                            zqVar = op.o(r7);
                        }
                    }
                }
            }
            op.l(eo0Var, zl0Var3);
        }
    }

    public static final void K(o7 o7Var, q7 q7Var) {
        q7Var.e.setValue(o7Var.e.getValue());
        v7 v7Var = q7Var.g;
        v7 v7Var2 = o7Var.f;
        int b = v7Var.b();
        for (int i = 0; i < b; i++) {
            v7Var.e(v7Var2.a(i), i);
        }
        q7Var.i = o7Var.h;
        q7Var.h = o7Var.g;
        q7Var.j = ((Boolean) o7Var.i.getValue()).booleanValue();
    }

    public static final Object L(ca caVar) {
        Object obj;
        CoroutineContext coroutineContext = caVar.e;
        coroutineContext.getClass();
        t80.l(coroutineContext);
        dn b = qa0.b(caVar);
        hs hsVar = b instanceof hs ? (hs) b : null;
        if (hsVar == null) {
            obj = Unit.a;
        } else {
            ln lnVar = hsVar.h;
            if (lnVar.l(coroutineContext)) {
                hsVar.j = Unit.a;
                hsVar.g = 1;
                lnVar.g(coroutineContext, hsVar);
            } else {
                rq1 rq1Var = new rq1(rq1.g);
                CoroutineContext i = coroutineContext.i(rq1Var);
                Unit unit = Unit.a;
                hsVar.j = unit;
                hsVar.g = 1;
                lnVar.g(i, hsVar);
                if (rq1Var.e) {
                    ew a = ci1.a();
                    m9 m9Var = a.i;
                    if (!(m9Var != null ? m9Var.isEmpty() : true)) {
                        if (a.g >= 4294967296L) {
                            hsVar.j = unit;
                            hsVar.g = 1;
                            a.q(hsVar);
                            obj = tn.d;
                        } else {
                            a.r(true);
                            try {
                                hsVar.run();
                                do {
                                } while (a.t());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = Unit.a;
                }
            }
            obj = tn.d;
        }
        return obj == tn.d ? obj : Unit.a;
    }

    public static final void a(hk hkVar, hl hlVar, int i) {
        hlVar.Y(-709502251);
        byte b = 0;
        int i2 = 1;
        if (hlVar.O(i & 1, (i & 3) != 2)) {
            m01 m01Var = v51.a;
            Object obj = (t51) hlVar.j(m01Var);
            hlVar.W(1967007413);
            Object[] objArr = new Object[0];
            Object L = hlVar.L();
            Object obj2 = bl.a;
            if (L == obj2) {
                L = new dd(16);
                hlVar.h0(L);
            }
            r51 r51Var = (r51) y90.z(objArr, r51.i, (Function0) L, hlVar, 384);
            r51Var.g = (t51) hlVar.j(m01Var);
            hlVar.p(false);
            Object[] objArr2 = {obj};
            int i3 = 11;
            c51 c51Var = new c51(new e9(i3, b), 3, new c(obj, i3, r51Var));
            boolean h = hlVar.h(obj) | hlVar.h(r51Var);
            Object L2 = hlVar.L();
            int i4 = 4;
            if (h || L2 == obj2) {
                L2 = new vc(obj, i4, r51Var);
                hlVar.h0(L2);
            }
            Object obj3 = (zf0) y90.z(objArr2, c51Var, (Function0) L2, hlVar, 0);
            op.a(m01Var.a(obj3), m90.J(-412824043, new il(hkVar, i4, obj3), hlVar), hlVar, 56);
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new sx(hkVar, i, i2);
        }
    }

    public static final long b(int i, int i2) {
        if (i < 0 || i2 < 0) {
            p80.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = mh1.c;
        return j;
    }

    public static final int c(int i, eo0 eo0Var) {
        int i2 = eo0Var.g - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = eo0Var.d;
            int i5 = ((ja0) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((ja0) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final zl0 d(yq yqVar, int i) {
        zl0 zl0Var = ((zl0) yqVar).d.j;
        if (zl0Var == null || (zl0Var.h & i) == 0) {
            return null;
        }
        while (zl0Var != null) {
            int i2 = zl0Var.g;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return zl0Var;
            }
            zl0Var = zl0Var.j;
        }
        return null;
    }

    public static final void e(nq0 nq0Var, qx0 qx0Var, long j) {
        tq tqVar = (tq) nq0Var.e;
        tqVar.getClass();
        zm1 zm1Var = (zm1) tqVar.c;
        zm1 zm1Var2 = (zm1) tqVar.b;
        boolean i = i(qx0Var);
        long j2 = qx0Var.b;
        if (i) {
            qo[] qoVarArr = zm1Var2.d;
            Arrays.fill(qoVarArr, 0, qoVarArr.length, (Object) null);
            zm1Var2.e = 0;
            qo[] qoVarArr2 = zm1Var.d;
            Arrays.fill(qoVarArr2, 0, qoVarArr2.length, (Object) null);
            zm1Var.e = 0;
            tqVar.a = 0L;
        }
        if (!j(qx0Var)) {
            List list = qx0Var.k;
            if (list == null) {
                list = nv.d;
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                e60 e60Var = (e60) list.get(i2);
                tqVar.a(e60Var.a, wq0.e(e60Var.c, j));
            }
            tqVar.a(j2, wq0.e(qx0Var.l, j));
        }
        if (j(qx0Var) && j2 - tqVar.a > 40) {
            qo[] qoVarArr3 = zm1Var2.d;
            Arrays.fill(qoVarArr3, 0, qoVarArr3.length, (Object) null);
            zm1Var2.e = 0;
            qo[] qoVarArr4 = zm1Var.d;
            Arrays.fill(qoVarArr4, 0, qoVarArr4.length, (Object) null);
            zm1Var.e = 0;
            tqVar.a = 0L;
        }
        tqVar.a = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0115 A[Catch: CancellationException -> 0x003d, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x003d, blocks: (B:16:0x0038, B:18:0x00fe, B:20:0x0115, B:25:0x0137, B:27:0x0147, B:29:0x0151, B:36:0x015e, B:37:0x0163, B:39:0x0164), top: B:15:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(q7 q7Var, m7 m7Var, long j, final Function1 function1, dn dnVar) {
        rf1 rf1Var;
        rf1 rf1Var2;
        tn tnVar;
        int i;
        final z11 z11Var;
        final q7 q7Var2;
        q7 q7Var3;
        Function1 function12;
        z11 z11Var2;
        Object j2;
        Function1 function13;
        o7 o7Var;
        o7 o7Var2;
        Object obj;
        Object j3;
        final m7 m7Var2 = m7Var;
        a60 a60Var = a60.k;
        if (dnVar instanceof rf1) {
            rf1Var = (rf1) dnVar;
            int i2 = rf1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rf1Var.m = i2 - Integer.MIN_VALUE;
                rf1Var2 = rf1Var;
                CoroutineContext coroutineContext = rf1Var2.e;
                Object obj2 = rf1Var2.l;
                tnVar = tn.d;
                i = rf1Var2.m;
                int i3 = 1;
                if (i != 0) {
                    ca0.v(obj2);
                    final Object b = m7Var2.b(0L);
                    final v7 f = m7Var2.f(0L);
                    z11Var = new z11();
                    if (j == Long.MIN_VALUE) {
                        try {
                            coroutineContext.getClass();
                            final float q = q(coroutineContext);
                            q7Var2 = q7Var;
                            try {
                                function12 = new Function1() { // from class: pf1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        long longValue = ((Long) obj3).longValue();
                                        m7 m7Var3 = m7Var2;
                                        c51 d = m7Var3.d();
                                        Object e = m7Var3.e();
                                        q7 q7Var4 = q7Var2;
                                        o7 o7Var3 = new o7(b, d, f, longValue, e, longValue, new of1(q7Var4, 0));
                                        ka0.n(o7Var3, longValue, q, m7Var3, q7Var4, function1);
                                        z11.this.d = o7Var3;
                                        return Unit.a;
                                    }
                                };
                                z11Var2 = z11Var;
                            } catch (CancellationException e) {
                                e = e;
                                q7Var3 = q7Var2;
                                o7Var = (o7) z11Var.d;
                                if (o7Var != null) {
                                    o7Var.i.setValue(Boolean.FALSE);
                                }
                                o7Var2 = (o7) z11Var.d;
                                if (o7Var2 != null && o7Var2.g == q7Var3.h) {
                                    q7Var3.j = false;
                                }
                                throw e;
                            }
                            try {
                                rf1Var2.h = q7Var2;
                                rf1Var2.i = m7Var2;
                                rf1Var2.j = function1;
                                rf1Var2.k = z11Var2;
                                rf1Var2.m = 1;
                                if (!m7Var2.a()) {
                                    ob1 ob1Var = new ob1(function12, i3);
                                    coroutineContext.getClass();
                                    j2 = t90.r(coroutineContext).j(ob1Var, rf1Var2);
                                } else {
                                    if (rf1Var2.g().d(a60Var) != null) {
                                        throw new ClassCastException();
                                    }
                                    j2 = t90.r(rf1Var2.g()).j(function12, rf1Var2);
                                }
                                if (j2 != tnVar) {
                                    q7Var3 = q7Var2;
                                    function13 = function1;
                                }
                                return tnVar;
                            } catch (CancellationException e2) {
                                e = e2;
                                q7Var3 = q7Var2;
                                z11Var = z11Var2;
                                o7Var = (o7) z11Var.d;
                                if (o7Var != null) {
                                }
                                o7Var2 = (o7) z11Var.d;
                                if (o7Var2 != null) {
                                }
                                throw e;
                            }
                        } catch (CancellationException e3) {
                            e = e3;
                            q7Var2 = q7Var;
                        }
                    } else {
                        z11Var2 = z11Var;
                        try {
                            o7 o7Var3 = new o7(b, m7Var2.d(), f, j, m7Var2.e(), j, new of1(q7Var, i3));
                            coroutineContext.getClass();
                            n(o7Var3, j, q(coroutineContext), m7Var2, q7Var, function1);
                            z11Var2.d = o7Var3;
                            q7Var3 = q7Var;
                            m7Var2 = m7Var;
                            function13 = function1;
                        } catch (CancellationException e4) {
                            e = e4;
                            q7Var3 = q7Var;
                            z11Var = z11Var2;
                            o7Var = (o7) z11Var.d;
                            if (o7Var != null) {
                            }
                            o7Var2 = (o7) z11Var.d;
                            if (o7Var2 != null) {
                                q7Var3.j = false;
                            }
                            throw e;
                        }
                    }
                    z11Var = z11Var2;
                } else {
                    if (i != 1 && i != 2) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z11Var = rf1Var2.k;
                    function13 = rf1Var2.j;
                    m7Var2 = rf1Var2.i;
                    q7Var3 = rf1Var2.h;
                    try {
                        ca0.v(obj2);
                    } catch (CancellationException e5) {
                        e = e5;
                        o7Var = (o7) z11Var.d;
                        if (o7Var != null) {
                        }
                        o7Var2 = (o7) z11Var.d;
                        if (o7Var2 != null) {
                        }
                        throw e;
                    }
                }
                do {
                    CoroutineContext coroutineContext2 = rf1Var2.e;
                    obj = z11Var.d;
                    obj.getClass();
                    if (((Boolean) ((o7) obj).i.getValue()).booleanValue()) {
                        return Unit.a;
                    }
                    coroutineContext2.getClass();
                    final float q2 = q(coroutineContext2);
                    final z11 z11Var3 = z11Var;
                    final Function1 function14 = function13;
                    final m7 m7Var3 = m7Var2;
                    final q7 q7Var4 = q7Var3;
                    try {
                        Function1 function15 = new Function1() { // from class: qf1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                long longValue = ((Long) obj3).longValue();
                                Object obj4 = z11.this.d;
                                obj4.getClass();
                                ka0.n((o7) obj4, longValue, q2, m7Var3, q7Var4, function14);
                                return Unit.a;
                            }
                        };
                        z11Var = z11Var3;
                        m7Var2 = m7Var3;
                        q7Var3 = q7Var4;
                        function13 = function14;
                        rf1Var2.h = q7Var3;
                        rf1Var2.i = m7Var2;
                        rf1Var2.j = function13;
                        rf1Var2.k = z11Var;
                        rf1Var2.m = 2;
                        if (!m7Var2.a()) {
                            ob1 ob1Var2 = new ob1(function15, i3);
                            coroutineContext2.getClass();
                            j3 = t90.r(coroutineContext2).j(ob1Var2, rf1Var2);
                        } else {
                            if (rf1Var2.g().d(a60Var) != null) {
                                throw new ClassCastException();
                            }
                            j3 = t90.r(rf1Var2.g()).j(function15, rf1Var2);
                        }
                    } catch (CancellationException e6) {
                        e = e6;
                        z11Var = z11Var3;
                        q7Var3 = q7Var4;
                        o7Var = (o7) z11Var.d;
                        if (o7Var != null) {
                        }
                        o7Var2 = (o7) z11Var.d;
                        if (o7Var2 != null) {
                        }
                        throw e;
                    }
                } while (j3 != tnVar);
                return tnVar;
            }
        }
        rf1Var = new rf1(dnVar);
        rf1Var2 = rf1Var;
        CoroutineContext coroutineContext3 = rf1Var2.e;
        Object obj22 = rf1Var2.l;
        tnVar = tn.d;
        i = rf1Var2.m;
        int i32 = 1;
        if (i != 0) {
        }
        do {
            CoroutineContext coroutineContext22 = rf1Var2.e;
            obj = z11Var.d;
            obj.getClass();
            if (((Boolean) ((o7) obj).i.getValue()).booleanValue()) {
            }
        } while (j3 != tnVar);
        return tnVar;
    }

    public static final Object g(q7 q7Var, Float f, az azVar, Function1 function1, sf1 sf1Var) {
        Object f2 = f(q7Var, new lg1(azVar, q7Var.d, q7Var.e.getValue(), f, q7Var.g), q7Var.h, function1, sf1Var);
        return f2 == tn.d ? f2 : Unit.a;
    }

    public static float h(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static final boolean i(qx0 qx0Var) {
        return !qx0Var.h && qx0Var.d;
    }

    public static final boolean j(qx0 qx0Var) {
        return qx0Var.h && !qx0Var.d;
    }

    public static void l(Object obj, String str) {
        if (obj != null) {
            return;
        }
        l.b(str);
    }

    public static boolean m() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            ez.b();
            ez b = ez.b();
            b.a();
            Context context = b.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static final void n(o7 o7Var, long j, float f, m7 m7Var, q7 q7Var, Function1 function1) {
        long c = f == 0.0f ? m7Var.c() : (long) ((j - o7Var.c) / f);
        o7Var.g = j;
        o7Var.e.setValue(m7Var.b(c));
        o7Var.f = m7Var.f(c);
        if (m7Var.g(c)) {
            o7Var.h = o7Var.g;
            o7Var.i.setValue(Boolean.FALSE);
        }
        K(o7Var, q7Var);
        function1.invoke(o7Var);
    }

    public static final float o(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final float q(CoroutineContext coroutineContext) {
        im0 im0Var = (im0) coroutineContext.d(a60.l);
        float u = im0Var != null ? im0Var.u() : 1.0f;
        if (u >= 0.0f) {
            return u;
        }
        ey0.b("negative scale factor");
        return u;
    }

    public static SharedPreferences r(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final Bundle s(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        dd0.e(qy0.k("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    public static final int t(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final void u(hl hlVar, Integer num, Function2 function2) {
        if (hlVar.S) {
            hlVar.b(num, function2);
        }
    }

    public static final void v(j81 j81Var) {
        op.I(j81Var).D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0176 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void w(Intent intent) {
        int parseInt;
        int i;
        String string;
        String string2;
        Object[] objArr;
        String string3;
        String string4;
        long parseLong;
        String str;
        String str2;
        if (G(intent)) {
            x(intent.getExtras(), "_nr");
        }
        int i2 = 0;
        if ((intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) ? false : m()) {
            gj1 gj1Var = (gj1) FirebaseMessaging.k.get();
            if (gj1Var == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            nl0 nl0Var = null;
            r4 = null;
            String str3 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    parseInt = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            parseInt = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                        }
                    }
                    i = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            ez b = ez.b();
                            Object obj2 = hz.m;
                            b.a();
                            string = (String) t80.c(((hz) b.d.a(iz.class)).c());
                        } catch (InterruptedException | ExecutionException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    String str4 = string;
                    ez b2 = ez.b();
                    b2.a();
                    String packageName = b2.a.getPackageName();
                    ll0 ll0Var = !nq0.B(extras) ? ll0.DISPLAY_NOTIFICATION : ll0.DATA_MESSAGE;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 == null) {
                        if (!"1".equals(extras.getString("google.priority_reduced"))) {
                            string2 = extras.getString("google.priority");
                        }
                        objArr = 2;
                        if (objArr == 2) {
                            i2 = 5;
                        } else if (objArr == 1) {
                            i2 = 10;
                        }
                        int i3 = i2;
                        string3 = extras.getString("google.message_id");
                        if (string3 == null) {
                            string3 = extras.getString("message_id");
                        }
                        String str5 = string3 != null ? string3 : "";
                        string4 = extras.getString("from");
                        if (string4 != null && string4.startsWith("/topics/")) {
                            str3 = string4;
                        }
                        String str6 = str3 != null ? str3 : "";
                        String string5 = extras.getString("collapse_key");
                        String str7 = string5 != null ? string5 : "";
                        String string6 = extras.getString("google.c.a.m_l");
                        String str8 = string6 != null ? string6 : "";
                        String string7 = extras.getString("google.c.a.c_l");
                        String str9 = string7 != null ? string7 : "";
                        if (extras.containsKey("google.c.sender.id")) {
                            try {
                                parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                            } catch (NumberFormatException e2) {
                                Log.w("FirebaseMessaging", "error parsing project number", e2);
                            }
                            nl0Var = new nl0(parseLong > 0 ? parseLong : 0L, str5, str4, ll0Var, packageName, str7, i3, i, str6, str8, str9);
                        }
                        ez b3 = ez.b();
                        oz ozVar = b3.c;
                        b3.a();
                        str = ozVar.e;
                        if (str != null) {
                            try {
                                parseLong = Long.parseLong(str);
                            } catch (NumberFormatException e3) {
                                Log.w("FirebaseMessaging", "error parsing sender ID", e3);
                            }
                            nl0Var = new nl0(parseLong > 0 ? parseLong : 0L, str5, str4, ll0Var, packageName, str7, i3, i, str6, str8, str9);
                        }
                        b3.a();
                        str2 = ozVar.b;
                        if (str2.startsWith("1:")) {
                            String[] split = str2.split(":");
                            if (split.length >= 2) {
                                String str10 = split[1];
                                if (!str10.isEmpty()) {
                                    try {
                                        parseLong = Long.parseLong(str10);
                                    } catch (NumberFormatException e4) {
                                        Log.w("FirebaseMessaging", "error parsing app ID", e4);
                                    }
                                }
                            }
                            parseLong = 0;
                        } else {
                            try {
                                parseLong = Long.parseLong(str2);
                            } catch (NumberFormatException e5) {
                                Log.w("FirebaseMessaging", "error parsing app ID", e5);
                            }
                        }
                        nl0Var = new nl0(parseLong > 0 ? parseLong : 0L, str5, str4, ll0Var, packageName, str7, i3, i, str6, str8, str9);
                    }
                    if ("high".equals(string2)) {
                        if (!"normal".equals(string2)) {
                            objArr = 0;
                        }
                        objArr = 2;
                    } else {
                        objArr = 1;
                    }
                    if (objArr == 2) {
                    }
                    int i32 = i2;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                    }
                    if (string3 != null) {
                    }
                    string4 = extras.getString("from");
                    if (string4 != null) {
                        str3 = string4;
                    }
                    if (str3 != null) {
                    }
                    String string52 = extras.getString("collapse_key");
                    if (string52 != null) {
                    }
                    String string62 = extras.getString("google.c.a.m_l");
                    if (string62 != null) {
                    }
                    String string72 = extras.getString("google.c.a.c_l");
                    if (string72 != null) {
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                    }
                    ez b32 = ez.b();
                    oz ozVar2 = b32.c;
                    b32.a();
                    str = ozVar2.e;
                    if (str != null) {
                    }
                    b32.a();
                    str2 = ozVar2.b;
                    if (str2.startsWith("1:")) {
                    }
                    nl0Var = new nl0(parseLong > 0 ? parseLong : 0L, str5, str4, ll0Var, packageName, str7, i32, i, str6, str8, str9);
                }
                i = parseInt;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                }
                String str42 = string;
                ez b22 = ez.b();
                b22.a();
                String packageName2 = b22.a.getPackageName();
                ll0 ll0Var2 = !nq0.B(extras) ? ll0.DISPLAY_NOTIFICATION : ll0.DATA_MESSAGE;
                string2 = extras.getString("google.delivered_priority");
                if (string2 == null) {
                }
                if ("high".equals(string2)) {
                }
                if (objArr == 2) {
                }
                int i322 = i2;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                }
                if (string3 != null) {
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                }
                if (str3 != null) {
                }
                String string522 = extras.getString("collapse_key");
                if (string522 != null) {
                }
                String string622 = extras.getString("google.c.a.m_l");
                if (string622 != null) {
                }
                String string722 = extras.getString("google.c.a.c_l");
                if (string722 != null) {
                }
                if (extras.containsKey("google.c.sender.id")) {
                }
                ez b322 = ez.b();
                oz ozVar22 = b322.c;
                b322.a();
                str = ozVar22.e;
                if (str != null) {
                }
                b322.a();
                str2 = ozVar22.b;
                if (str2.startsWith("1:")) {
                }
                nl0Var = new nl0(parseLong > 0 ? parseLong : 0L, str5, str42, ll0Var2, packageName2, str7, i322, i, str6, str8, str9);
            }
            if (nl0Var == null) {
                return;
            }
            try {
                xb xbVar = new xb(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                vv vvVar = new vv("proto");
                dd0 dd0Var = new dd0(4);
                hj1 hj1Var = (hj1) gj1Var;
                Set set = hj1Var.a;
                if (!set.contains(vvVar)) {
                    throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", vvVar, set));
                }
                new i8(hj1Var.b, vvVar, dd0Var, hj1Var.c).p(new ib(new ol0(nl0Var), xbVar));
            } catch (RuntimeException e6) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e6);
            }
        }
    }

    public static void x(Bundle bundle, String str) {
        try {
            ez.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str2 = nq0.B(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            ez b = ez.b();
            b.a();
            if (b.d.a(c3.class) == null) {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            } else {
                af.c();
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static final void y(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            o80.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float o = o(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * o);
                }
            }
            float sqrt = (float) Math.sqrt(o(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : o(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float o2 = o(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    o2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = o2 / fArr11[i14];
        }
    }

    public static final long z(qx0 qx0Var, boolean z) {
        long d = wq0.d(qx0Var.c, qx0Var.g);
        if (z || !qx0Var.b()) {
            return d;
        }
        return 0L;
    }

    public abstract void k();

    public abstract s11 p();
}
