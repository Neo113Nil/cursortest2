package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.firebase.encoders.json.BuildConfig;
import java.net.ProtocolException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ci2 {
    public static final ai2 a(i91 i91Var, boolean z) {
        ul1 ul1Var = i91Var.P.f;
        o90 o90Var = null;
        if ((ul1Var.p & 8) != 0) {
            loop0: while (true) {
                if (ul1Var == null) {
                    break;
                }
                if ((ul1Var.o & 8) != 0) {
                    ul1 ul1Var2 = ul1Var;
                    eo1 eo1Var = null;
                    while (ul1Var2 != null) {
                        if (ul1Var2 instanceof xh2) {
                            o90Var = ul1Var2;
                            break loop0;
                        }
                        if ((ul1Var2.o & 8) != 0 && (ul1Var2 instanceof p90)) {
                            int i = 0;
                            for (ul1 ul1Var3 = ((p90) ul1Var2).B; ul1Var3 != null; ul1Var3 = ul1Var3.r) {
                                if ((ul1Var3.o & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        ul1Var2 = ul1Var3;
                                    } else {
                                        if (eo1Var == null) {
                                            eo1Var = new eo1(new ul1[16]);
                                        }
                                        if (ul1Var2 != null) {
                                            eo1Var.b(ul1Var2);
                                            ul1Var2 = null;
                                        }
                                        eo1Var.b(ul1Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        ul1Var2 = s03.c(eo1Var);
                    }
                }
                if ((ul1Var.p & 8) == 0) {
                    break;
                }
                ul1Var = ul1Var.r;
            }
        }
        o90Var.getClass();
        ul1 ul1Var4 = ((ul1) ((xh2) o90Var)).m;
        sh2 w = i91Var.w();
        if (w == null) {
            w = new sh2();
        }
        return new ai2(ul1Var4, z, i91Var, w);
    }

    public static final void b(it2 it2Var, nt2 nt2Var, String str) {
        pt2 pt2Var = pt2.h;
        pt2.i.fine(nt2Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + it2Var.a);
    }

    public static final String c(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static nm2 d() {
        return (nm2) tm2.b.get();
    }

    public static boolean e(Context context, int i) {
        if (k(context, "com.google.android.gms", i)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                yv0 a = yv0.a(context);
                a.getClass();
                if (packageInfo != null) {
                    if (!yv0.d(packageInfo, false)) {
                        if (yv0.d(packageInfo, true)) {
                            if (!xv0.a(a.a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static nm2 f(nm2 nm2Var) {
        if (nm2Var instanceof kz2) {
            kz2 kz2Var = (kz2) nm2Var;
            if (kz2Var.t == ij2.c()) {
                kz2Var.r = null;
                return nm2Var;
            }
        }
        if (nm2Var instanceof lz2) {
            lz2 lz2Var = (lz2) nm2Var;
            if (lz2Var.i == ij2.c()) {
                lz2Var.h = null;
                return nm2Var;
            }
        }
        nm2 h = tm2.h(nm2Var, null, false);
        h.j();
        return h;
    }

    public static Object g(Function0 function0, Function1 function1) {
        nm2 kz2Var;
        if (function1 == null) {
            return function0.invoke();
        }
        nm2 nm2Var = (nm2) tm2.b.get();
        if (nm2Var instanceof kz2) {
            kz2 kz2Var2 = (kz2) nm2Var;
            if (kz2Var2.t == ij2.c()) {
                Function1 function12 = kz2Var2.r;
                Function1 function13 = kz2Var2.s;
                try {
                    ((kz2) nm2Var).r = tm2.l(function1, function12, true);
                    ((kz2) nm2Var).s = function13;
                    return function0.invoke();
                } finally {
                    kz2Var2.r = function12;
                    kz2Var2.s = function13;
                }
            }
        }
        if (nm2Var == null || (nm2Var instanceof yn1)) {
            kz2Var = new kz2(nm2Var instanceof yn1 ? (yn1) nm2Var : null, function1, null, true, false);
        } else {
            if (function1 == null) {
                return function0.invoke();
            }
            kz2Var = nm2Var.u(function1);
        }
        try {
            nm2 j = kz2Var.j();
            try {
                Object invoke = function0.invoke();
                nm2.q(j);
                kz2Var.c();
                return invoke;
            } catch (Throwable th) {
                nm2.q(j);
                throw th;
            }
        } catch (Throwable th2) {
            kz2Var.c();
            throw th2;
        }
    }

    public static yf h(String str) {
        int i;
        String str2;
        boolean o = tp2.o(str, "HTTP/1.", false);
        s52 s52Var = s52.HTTP_1_0;
        if (o) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                s52Var = s52.HTTP_1_1;
            }
        } else {
            if (!tp2.o(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                str2 = BuildConfig.FLAVOR;
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
            }
            return new yf(s52Var, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static final pw2 i(pw2 pw2Var, u81 u81Var) {
        un2 un2Var = pw2Var.a;
        pv2 pv2Var = vn2.d;
        pv2 pv2Var2 = un2Var.a;
        if (pv2Var2.equals(ov2.a)) {
            pv2Var2 = vn2.d;
        }
        pv2 pv2Var3 = pv2Var2;
        long j = un2Var.b;
        tw2[] tw2VarArr = sw2.b;
        if ((j & 1095216660480L) == 0) {
            j = vn2.a;
        }
        long j2 = j;
        jq0 jq0Var = un2Var.c;
        if (jq0Var == null) {
            jq0Var = jq0.q;
        }
        jq0 jq0Var2 = jq0Var;
        fq0 fq0Var = un2Var.d;
        fq0 fq0Var2 = new fq0(fq0Var != null ? fq0Var.a : 0);
        gq0 gq0Var = un2Var.e;
        gq0 gq0Var2 = new gq0(gq0Var != null ? gq0Var.a : 65535);
        ip0 ip0Var = un2Var.f;
        if (ip0Var == null) {
            ip0Var = ip0.m;
        }
        ip0 ip0Var2 = ip0Var;
        String str = un2Var.g;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        String str2 = str;
        long j3 = un2Var.h;
        if ((j3 & 1095216660480L) == 0) {
            j3 = vn2.b;
        }
        long j4 = j3;
        nn nnVar = un2Var.i;
        nn nnVar2 = new nn(nnVar != null ? nnVar.a : 0.0f);
        qv2 qv2Var = un2Var.j;
        if (qv2Var == null) {
            qv2Var = qv2.c;
        }
        qv2 qv2Var2 = qv2Var;
        sf1 sf1Var = un2Var.k;
        if (sf1Var == null) {
            sf1 sf1Var2 = sf1.o;
            sf1Var = s03.t();
        }
        sf1 sf1Var3 = sf1Var;
        long j5 = un2Var.l;
        if (j5 == 16) {
            j5 = vn2.c;
        }
        long j6 = j5;
        xt2 xt2Var = un2Var.m;
        if (xt2Var == null) {
            xt2Var = xt2.b;
        }
        xt2 xt2Var2 = xt2Var;
        dk2 dk2Var = un2Var.n;
        if (dk2Var == null) {
            dk2Var = dk2.d;
        }
        dk2 dk2Var2 = dk2Var;
        e22 e22Var = un2Var.o;
        ae0 ae0Var = un2Var.p;
        if (ae0Var == null) {
            ae0Var = vl0.a;
        }
        un2 un2Var2 = new un2(pv2Var3, j2, jq0Var2, fq0Var2, gq0Var2, ip0Var2, str2, j4, nnVar2, qv2Var2, sf1Var3, j6, xt2Var2, dk2Var2, e22Var, ae0Var);
        ez1 ez1Var = pw2Var.b;
        int i = fz1.b;
        int i2 = ez1Var.a;
        int i3 = 5;
        if (i2 == Integer.MIN_VALUE) {
            i2 = 5;
        }
        int i4 = ez1Var.b;
        if (i4 == 3) {
            int ordinal = u81Var.ordinal();
            if (ordinal == 0) {
                i3 = 4;
            } else if (ordinal != 1) {
                a.b();
                return null;
            }
        } else if (i4 == Integer.MIN_VALUE) {
            int ordinal2 = u81Var.ordinal();
            if (ordinal2 == 0) {
                i3 = 1;
            } else {
                if (ordinal2 != 1) {
                    a.b();
                    return null;
                }
                i3 = 2;
            }
        } else {
            i3 = i4;
        }
        long j7 = ez1Var.c;
        if ((j7 & 1095216660480L) == 0) {
            j7 = fz1.a;
        }
        rv2 rv2Var = ez1Var.d;
        if (rv2Var == null) {
            rv2Var = rv2.c;
        }
        a22 a22Var = ez1Var.e;
        ud1 ud1Var = ez1Var.f;
        int i5 = ez1Var.g;
        if (i5 == 0) {
            i5 = pd1.b;
        }
        int i6 = ez1Var.h;
        if (i6 == Integer.MIN_VALUE) {
            i6 = 1;
        }
        hw2 hw2Var = ez1Var.i;
        if (hw2Var == null) {
            hw2Var = hw2.c;
        }
        return new pw2(un2Var2, new ez1(i2, i3, j7, rv2Var, a22Var, ud1Var, i5, i6, hw2Var), pw2Var.c);
    }

    public static void j(nm2 nm2Var, nm2 nm2Var2, Function1 function1) {
        if (nm2Var != nm2Var2) {
            nm2Var2.getClass();
            nm2.q(nm2Var);
            nm2Var2.c();
        } else if (nm2Var instanceof kz2) {
            ((kz2) nm2Var).r = function1;
        } else if (nm2Var instanceof lz2) {
            ((lz2) nm2Var).h = function1;
        } else {
            dm0.i(nm2Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static boolean k(Context context, String str, int i) {
        mm a = i93.a(context);
        a.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ((Context) a.a).getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static final n53 l(gu guVar, u53 u53Var, i50 i50Var, a00 a00Var) {
        ar0 g;
        if (u53Var instanceof jx0) {
            t53 viewModelStore = u53Var.getViewModelStore();
            q53 defaultViewModelProviderFactory = ((jx0) u53Var).getDefaultViewModelProviderFactory();
            viewModelStore.getClass();
            defaultViewModelProviderFactory.getClass();
            i50Var.getClass();
            g = new ar0(viewModelStore, defaultViewModelProviderFactory, i50Var);
        } else {
            g = dq2.g(u53Var, null, 6);
        }
        js0 js0Var = (js0) g.n;
        String b = guVar.b();
        if (b != null) {
            return js0Var.x(guVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        }
        lh.e("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static String m(Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                str = "null";
            } else {
                try {
                    str = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    str = "<" + str2 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i2] = str;
            i2++;
        }
        StringBuilder sb = new StringBuilder((length * 16) + 29);
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = "expected a non-null reference".indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) "expected a non-null reference", i3, indexOf);
            sb.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb.append((CharSequence) "expected a non-null reference", i3, 29);
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean n(byte b) {
        return b > -65;
    }
}
