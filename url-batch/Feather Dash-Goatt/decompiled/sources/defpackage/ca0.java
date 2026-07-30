package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Trace;
import android.util.Log;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class ca0 {
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0289, code lost:
    
        if (r44.g(true) != false) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0301 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final am0 am0Var, wf0 wf0Var, final ku0 ku0Var, final xp xpVar, final boolean z, final i5 i5Var, final id idVar, final j9 j9Var, final Function1 function1, hl hlVar, final int i, final int i2) {
        int i3;
        int i4;
        wf0 wf0Var2;
        int i5;
        boolean z2;
        Object obj;
        boolean z3;
        boolean f;
        Object qf0Var;
        wf0 wf0Var3;
        boolean z4;
        xz0 xz0Var;
        am0 am0Var2;
        hlVar.Y(924924659);
        if ((i & 6) == 0) {
            i3 = (hlVar.f(am0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= hlVar.f(wf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= hlVar.f(ku0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= hlVar.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= hlVar.g(true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= hlVar.f(xpVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= hlVar.g(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= hlVar.f(i5Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= hlVar.f(idVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (hlVar.f(j9Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i6 = i4 | 432;
        if ((i2 & 3072) == 0) {
            i6 |= hlVar.h(function1) ? 2048 : 1024;
        }
        if (hlVar.O(i3 & 1, ((i3 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            hlVar.T();
            if ((i & 1) != 0 && !hlVar.y()) {
                hlVar.R();
            }
            int i7 = i3 & (-234881025);
            hlVar.q();
            int i8 = i7 >> 3;
            int i9 = i8 & 14;
            int i10 = i9 | ((i6 >> 6) & 112);
            ao0 H = gb0.H(function1, hlVar);
            boolean z5 = (((i10 & 14) ^ 6) > 4 && hlVar.f(wf0Var)) || (i10 & 6) == 4;
            Object L = hlVar.L();
            Object obj2 = bl.a;
            if (z5 || L == obj2) {
                de0 de0Var = new de0();
                de0Var.a = new xu0(Integer.MAX_VALUE);
                de0Var.b = new xu0(Integer.MAX_VALUE);
                j50 j50Var = j50.B;
                i5 = i6;
                te0 te0Var = new te0(H, 1);
                i8 i8Var = wb1.a;
                L = new nf0(0, 0, yd1.class, new xr(new kc(new xr(te0Var, j50Var), wf0Var, de0Var, 5), j50Var), "value", "getValue()Ljava/lang/Object;");
                hlVar.h0(L);
            } else {
                i5 = i6;
            }
            xz0 xz0Var2 = (xz0) L;
            int i11 = i7 >> 9;
            int i12 = (i11 & 112) | i9;
            boolean z6 = ((((i12 & 112) ^ 48) > 32 && hlVar.g(true)) || (i12 & 48) == 32) | ((((i12 & 14) ^ 6) > 4 && hlVar.f(wf0Var)) || (i12 & 6) == 4);
            Object L2 = hlVar.L();
            if (z6 || L2 == obj2) {
                L2 = new df0(wf0Var);
                hlVar.h0(L2);
            }
            df0 df0Var = (df0) L2;
            Object L3 = hlVar.L();
            if (L3 == obj2) {
                L3 = p4.A(g.d, hlVar);
                hlVar.h0(L3);
            }
            sn snVar = (sn) L3;
            k50 k50Var = (k50) hlVar.j(yl.g);
            me1 me1Var = !((Boolean) hlVar.j(yl.v)).booleanValue() ? ne1.a : null;
            int i13 = i5 << 18;
            int i14 = (i7 & 65520) | (i11 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | ((i5 << 27) & 1879048192);
            boolean z7 = ((((i14 & 896) ^ 384) > 256 && hlVar.f(ku0Var)) || (i14 & 384) == 256) | ((((i14 & 112) ^ 48) > 32 && hlVar.f(wf0Var)) || (i14 & 48) == 32) | ((((i14 & 7168) ^ 3072) > 2048 && hlVar.g(false)) || (i14 & 3072) == 2048);
            if (((57344 & i14) ^ 24576) <= 16384) {
            }
            if ((i14 & 24576) != 16384) {
                z2 = false;
                boolean d = z7 | z2 | hlVar.d(0) | ((((i14 & 3670016) ^ 1572864) <= 1048576 && hlVar.f(idVar)) || (i14 & 1572864) == 1048576);
                if (((i14 & 29360128) ^ 12582912) <= 8388608) {
                    obj = null;
                    if (hlVar.f(null)) {
                        z3 = true;
                        f = (((i14 & 234881024) ^ 100663296) <= 67108864 && hlVar.f(obj)) | d | z3 | ((((i14 & 1879048192) ^ 805306368) <= 536870912 && hlVar.f(j9Var)) || (i14 & 805306368) == 536870912) | hlVar.f(k50Var) | hlVar.f(me1Var);
                        Object L4 = hlVar.L();
                        if (!f || L4 == obj2) {
                            wf0Var3 = wf0Var;
                            z4 = true;
                            qf0Var = new qf0(wf0Var3, ku0Var, xz0Var2, j9Var, snVar, k50Var, me1Var, idVar);
                            xz0Var = xz0Var2;
                            hlVar.h0(qf0Var);
                        } else {
                            qf0Var = L4;
                            xz0Var = xz0Var2;
                            z4 = true;
                            wf0Var3 = wf0Var;
                        }
                        qf0 qf0Var2 = (qf0) qf0Var;
                        et0 et0Var = et0.d;
                        if (z) {
                            hlVar.W(-2077147368);
                            if ((((i8 & 14) ^ 6) <= 4 || !hlVar.f(wf0Var3)) && (i8 & 6) != 4) {
                                z4 = false;
                            }
                            boolean d2 = z4 | hlVar.d(0);
                            Object L5 = hlVar.L();
                            if (d2 || L5 == obj2) {
                                L5 = new jf0(wf0Var3);
                                hlVar.h0(L5);
                            }
                            am0Var2 = mo.y((jf0) L5, wf0Var3.o, et0Var);
                            hlVar.p(false);
                        } else {
                            hlVar.W(-2076718545);
                            hlVar.p(false);
                            am0Var2 = xl0.a;
                        }
                        wf0Var2 = wf0Var3;
                        t90.a(xz0Var, op.K(m90.D(am0Var.c(wf0Var3.l).c(wf0Var3.m), xz0Var, df0Var, et0Var, z).c(am0Var2).c((am0) wf0Var3.n.i), wf0Var3, et0Var, i5Var, z, xpVar, wf0Var3.g), wf0Var2.p, qf0Var2, hlVar, 0);
                    }
                } else {
                    obj = null;
                }
                z3 = false;
                f = (((i14 & 234881024) ^ 100663296) <= 67108864 && hlVar.f(obj)) | d | z3 | ((((i14 & 1879048192) ^ 805306368) <= 536870912 && hlVar.f(j9Var)) || (i14 & 805306368) == 536870912) | hlVar.f(k50Var) | hlVar.f(me1Var);
                Object L42 = hlVar.L();
                if (f) {
                }
                wf0Var3 = wf0Var;
                z4 = true;
                qf0Var = new qf0(wf0Var3, ku0Var, xz0Var2, j9Var, snVar, k50Var, me1Var, idVar);
                xz0Var = xz0Var2;
                hlVar.h0(qf0Var);
                qf0 qf0Var22 = (qf0) qf0Var;
                et0 et0Var2 = et0.d;
                if (z) {
                }
                wf0Var2 = wf0Var3;
                t90.a(xz0Var, op.K(m90.D(am0Var.c(wf0Var3.l).c(wf0Var3.m), xz0Var, df0Var, et0Var2, z).c(am0Var2).c((am0) wf0Var3.n.i), wf0Var3, et0Var2, i5Var, z, xpVar, wf0Var3.g), wf0Var2.p, qf0Var22, hlVar, 0);
            }
            z2 = true;
            boolean d3 = z7 | z2 | hlVar.d(0) | ((((i14 & 3670016) ^ 1572864) <= 1048576 && hlVar.f(idVar)) || (i14 & 1572864) == 1048576);
            if (((i14 & 29360128) ^ 12582912) <= 8388608) {
            }
            z3 = false;
            f = (((i14 & 234881024) ^ 100663296) <= 67108864 && hlVar.f(obj)) | d3 | z3 | ((((i14 & 1879048192) ^ 805306368) <= 536870912 && hlVar.f(j9Var)) || (i14 & 805306368) == 536870912) | hlVar.f(k50Var) | hlVar.f(me1Var);
            Object L422 = hlVar.L();
            if (f) {
            }
            wf0Var3 = wf0Var;
            z4 = true;
            qf0Var = new qf0(wf0Var3, ku0Var, xz0Var2, j9Var, snVar, k50Var, me1Var, idVar);
            xz0Var = xz0Var2;
            hlVar.h0(qf0Var);
            qf0 qf0Var222 = (qf0) qf0Var;
            et0 et0Var22 = et0.d;
            if (z) {
            }
            wf0Var2 = wf0Var3;
            t90.a(xz0Var, op.K(m90.D(am0Var.c(wf0Var3.l).c(wf0Var3.m), xz0Var, df0Var, et0Var22, z).c(am0Var2).c((am0) wf0Var3.n.i), wf0Var3, et0Var22, i5Var, z, xpVar, wf0Var3.g), wf0Var2.p, qf0Var222, hlVar, 0);
        } else {
            wf0Var2 = wf0Var;
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            final wf0 wf0Var4 = wf0Var2;
            r.d = new Function2() { // from class: of0
                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    ca0.a(am0.this, wf0Var4, ku0Var, xpVar, z, i5Var, idVar, j9Var, function1, (hl) obj3, gb0.P(i | 1), gb0.P(i2));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(hl hlVar, am0 am0Var) {
        ud udVar = ud.f;
        int hashCode = Long.hashCode(hlVar.T);
        am0 N = p4.N(hlVar, am0Var);
        kw0 l = hlVar.l();
        yk.b.getClass();
        xl xlVar = xk.b;
        hlVar.a0();
        if (hlVar.S) {
            hlVar.k(xlVar);
        } else {
            hlVar.k0();
        }
        ka0.C(hlVar, udVar, xk.e);
        ka0.C(hlVar, l, xk.d);
        ka0.A(hlVar, xk.g);
        ka0.C(hlVar, N, xk.c);
        ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
        hlVar.p(true);
    }

    public static kf1 c() {
        return new kf1(null);
    }

    public static final long d(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static void e(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        l.b(str);
    }

    public static final j31 g(Throwable th) {
        th.getClass();
        return new j31(th);
    }

    public static x51 h(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            x51 x51Var = new x51();
            new LinkedHashMap();
            ov ovVar = ov.d;
            ovVar.getClass();
            x51Var.a = new mc(ovVar);
            return x51Var;
        }
        ClassLoader classLoader = x51.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        xj0 xj0Var = new xj0(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            xj0Var.put(str, bundle.get(str));
        }
        xj0Var.b();
        xj0Var.q = true;
        if (xj0Var.m <= 0) {
            xj0Var = xj0.s;
            xj0Var.getClass();
        }
        x51 x51Var2 = new x51();
        new LinkedHashMap();
        x51Var2.a = new mc(xj0Var);
        return x51Var2;
    }

    public static tn1 i(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                newInstance.getClass();
                return (tn1) newInstance;
            } catch (IllegalAccessException e) {
                dd0.i("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                dd0.i("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            dd0.i("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    public static String j(ff ffVar) {
        StringBuilder sb = new StringBuilder(ffVar.size());
        for (int i = 0; i < ffVar.size(); i++) {
            byte a = ffVar.a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        sb.append("\\n");
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final int k(int i, List list) {
        int i2;
        int i3 = ((qu0) CollectionsKt.s(list)).c;
        if (i > ((qu0) CollectionsKt.s(list)).c) {
            p80.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            qu0 qu0Var = (qu0) list.get(i2);
            char c = qu0Var.b > i ? (char) 1 : qu0Var.c <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder n = qy0.n("Found paragraph index ", i2, " should be in range [0, ");
        n.append(list.size());
        n.append(").\nDebug info: index=");
        n.append(i);
        n.append(", paragraphs=[");
        n.append(zh0.a(list, null, new q1(18), 31));
        n.append(']');
        p80.a(n.toString());
        return i2;
    }

    public static final int l(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            qu0 qu0Var = (qu0) list.get(i3);
            char c = qu0Var.d > i ? (char) 1 : qu0Var.e <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static mi0 m() {
        i8 i8Var = fx0.a;
        i8Var.getClass();
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((sc1) i8Var.h)) {
            try {
                mi0 mi0Var = (mi0) i8Var.g;
                if (mi0Var != null && localeList == ((LocaleList) i8Var.e)) {
                    return mi0Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new li0(localeList.get(i)));
                }
                mi0 mi0Var2 = new mi0(arrayList);
                i8Var.e = localeList;
                i8Var.g = mi0Var2;
                return mi0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ib1 n() {
        return (ib1) pb1.b.get();
    }

    public static final Object o(h81 h81Var, t81 t81Var) {
        Object g = h81Var.d.g(t81Var);
        if (g == null) {
            return null;
        }
        return g;
    }

    public static void p(final Context context) {
        final boolean z;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (ka0.r(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            final ng1 ng1Var = new ng1();
            new Runnable() { // from class: q01
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    ng1 ng1Var2 = ng1Var;
                    try {
                        if (!(Binder.getCallingUid() == context2.getApplicationInfo().uid)) {
                            Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                            return;
                        }
                        SharedPreferences.Editor edit = ka0.r(context2).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                        if (z) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } finally {
                        ng1Var2.c(null);
                    }
                }
            }.run();
        }
        z = true;
        final ng1 ng1Var2 = new ng1();
        new Runnable() { // from class: q01
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                ng1 ng1Var22 = ng1Var2;
                try {
                    if (!(Binder.getCallingUid() == context2.getApplicationInfo().uid)) {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                        return;
                    }
                    SharedPreferences.Editor edit = ka0.r(context2).edit();
                    edit.putBoolean("proxy_notification_initialized", true);
                    edit.apply();
                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                    if (z) {
                        notificationManager.setNotificationDelegate("com.google.android.gms");
                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                        notificationManager.setNotificationDelegate(null);
                    }
                } finally {
                    ng1Var22.c(null);
                }
            }
        }.run();
    }

    public static final boolean q(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final boolean r(jd0 jd0Var) {
        if (jd0Var.m == null) {
            return false;
        }
        jd0 s = jd0Var.s();
        return (s != null ? s.m : null) == null || jd0Var.K.b;
    }

    public static ib1 s(ib1 ib1Var) {
        if (ib1Var instanceof cj1) {
            cj1 cj1Var = (cj1) ib1Var;
            if (cj1Var.t == t90.l()) {
                cj1Var.r = null;
                return ib1Var;
            }
        }
        if (ib1Var instanceof dj1) {
            dj1 dj1Var = (dj1) ib1Var;
            if (dj1Var.i == t90.l()) {
                dj1Var.h = null;
                return ib1Var;
            }
        }
        ib1 g = pb1.g(ib1Var, null, false);
        g.j();
        return g;
    }

    public static Object t(vr vrVar, Function0 function0) {
        ib1 cj1Var;
        ib1 ib1Var = (ib1) pb1.b.get();
        if (ib1Var instanceof cj1) {
            cj1 cj1Var2 = (cj1) ib1Var;
            if (cj1Var2.t == t90.l()) {
                Function1 function1 = cj1Var2.r;
                Function1 function12 = cj1Var2.s;
                try {
                    ((cj1) ib1Var).r = pb1.k(vrVar, function1, true);
                    ((cj1) ib1Var).s = function12;
                    return function0.invoke();
                } finally {
                    cj1Var2.r = function1;
                    cj1Var2.s = function12;
                }
            }
        }
        if (ib1Var == null || (ib1Var instanceof zn0)) {
            cj1Var = new cj1(ib1Var instanceof zn0 ? (zn0) ib1Var : null, vrVar, null, true, false);
        } else {
            cj1Var = ib1Var.u(vrVar);
        }
        try {
            ib1 j = cj1Var.j();
            try {
                Object invoke = function0.invoke();
                ib1.q(j);
                cj1Var.c();
                return invoke;
            } catch (Throwable th) {
                ib1.q(j);
                throw th;
            }
        } catch (Throwable th2) {
            cj1Var.c();
            throw th2;
        }
    }

    public static void u(ib1 ib1Var, ib1 ib1Var2, Function1 function1) {
        if (ib1Var != ib1Var2) {
            ib1Var2.getClass();
            ib1.q(ib1Var);
            ib1Var2.c();
        } else if (ib1Var instanceof cj1) {
            ((cj1) ib1Var).r = function1;
        } else if (ib1Var instanceof dj1) {
            ((dj1) ib1Var).h = function1;
        } else {
            af.j(ib1Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static final void v(Object obj) {
        if (obj instanceof j31) {
            throw ((j31) obj).d;
        }
    }

    public static final i90 w(c90 c90Var) {
        return new i90(c90Var.a, c90Var.b, c90Var.c, c90Var.d);
    }

    public static final long x(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final double y(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }
}
