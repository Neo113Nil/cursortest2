package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vh3 extends ok3 {
    public char o;
    public long p;
    public String q;
    public final g10 r;
    public final g10 s;
    public final g10 t;
    public final g10 u;
    public final g10 v;
    public final g10 w;
    public final g10 x;
    public final g10 y;
    public final g10 z;

    public vh3(pj3 pj3Var) {
        super(pj3Var);
        this.o = (char) 0;
        this.p = -1L;
        this.r = new g10(this, 6, false, false);
        this.s = new g10(this, 6, true, false);
        this.t = new g10(this, 6, false, true);
        this.u = new g10(this, 5, false, false);
        this.v = new g10(this, 5, true, false);
        this.w = new g10(this, 5, false, true);
        this.x = new g10(this, 4, false, false);
        this.y = new g10(this, 3, false, false);
        this.z = new g10(this, 2, false, false);
    }

    public static th3 E(String str) {
        if (str == null) {
            return null;
        }
        return new th3(str);
    }

    public static String H(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String I = I(obj, z);
        String I2 = I(obj2, z);
        String I3 = I(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(I)) {
            sb.append(str2);
            sb.append(I);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(I2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(I2);
        }
        if (!TextUtils.isEmpty(I3)) {
            sb.append(str3);
            sb.append(I3);
        }
        return sb.toString();
    }

    public static String I(Object obj, boolean z) {
        int lastIndexOf;
        String className;
        int lastIndexOf2;
        String str = BuildConfig.FLAVOR;
        if (obj == null) {
            return BuildConfig.FLAVOR;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = String.valueOf(round).length();
            if (charAt == '-') {
                str = "-";
            }
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(round2).length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof th3 ? ((th3) obj).a : z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = pj3.class.getCanonicalName();
        String substring = (TextUtils.isEmpty(canonicalName) || (lastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? BuildConfig.FLAVOR : canonicalName.substring(0, lastIndexOf);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (lastIndexOf2 = className.lastIndexOf(46)) == -1) ? BuildConfig.FLAVOR : className.substring(0, lastIndexOf2)).equals(substring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
            i++;
        }
        return sb2.toString();
    }

    public final g10 A() {
        return this.r;
    }

    public final g10 B() {
        return this.u;
    }

    public final g10 C() {
        return this.y;
    }

    public final g10 D() {
        return this.z;
    }

    public final void F(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(G(), i)) {
            Log.println(i, G(), H(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        ll3.v(str);
        lj3 lj3Var = ((pj3) this.m).s;
        if (lj3Var == null) {
            Log.println(6, G(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!lj3Var.n) {
                Log.println(6, G(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            lj3Var.F(new rh3(this, i, str, obj, obj2, obj3));
        }
    }

    public final String G() {
        String str;
        synchronized (this) {
            try {
                if (this.q == null) {
                    ((pj3) ((pj3) this.m).p.m).getClass();
                    this.q = "FA";
                }
                ll3.v(this.q);
                str = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // defpackage.ok3
    public final boolean x() {
        return false;
    }
}
