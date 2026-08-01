package s7;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v0 extends x1 {
    public final t0 A;
    public final t0 B;

    /* renamed from: i, reason: collision with root package name */
    public char f9047i;

    /* renamed from: r, reason: collision with root package name */
    public long f9048r;

    /* renamed from: s, reason: collision with root package name */
    public String f9049s;

    /* renamed from: t, reason: collision with root package name */
    public final t0 f9050t;

    /* renamed from: u, reason: collision with root package name */
    public final t0 f9051u;

    /* renamed from: v, reason: collision with root package name */
    public final t0 f9052v;

    /* renamed from: w, reason: collision with root package name */
    public final t0 f9053w;

    /* renamed from: x, reason: collision with root package name */
    public final t0 f9054x;

    /* renamed from: y, reason: collision with root package name */
    public final t0 f9055y;

    /* renamed from: z, reason: collision with root package name */
    public final t0 f9056z;

    public v0(q1 q1Var) {
        super(q1Var);
        this.f9047i = (char) 0;
        this.f9048r = -1L;
        this.f9050t = new t0(this, 6, false, false);
        this.f9051u = new t0(this, 6, true, false);
        this.f9052v = new t0(this, 6, false, true);
        this.f9053w = new t0(this, 5, false, false);
        this.f9054x = new t0(this, 5, true, false);
        this.f9055y = new t0(this, 5, false, true);
        this.f9056z = new t0(this, 4, false, false);
        this.A = new t0(this, 3, false, false);
        this.B = new t0(this, 2, false, false);
    }

    public static u0 A(String str) {
        if (str == null) {
            return null;
        }
        return new u0(str);
    }

    public static String D(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String E = E(obj, z10);
        String E2 = E(obj2, z10);
        String E3 = E(obj3, z10);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(E)) {
            sb2.append(str2);
            sb2.append(E);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(E2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(E2);
        }
        if (!TextUtils.isEmpty(E3)) {
            sb2.append(str3);
            sb2.append(E3);
        }
        return sb2.toString();
    }

    public static String E(Object obj, boolean z10) {
        int lastIndexOf;
        String className;
        int lastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = String.valueOf(round).length();
            String str = charAt == '-' ? "-" : "";
            StringBuilder sb2 = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(round2).length());
            sb2.append(str);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str);
            sb2.append(round2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof u0 ? ((u0) obj).f9040a : z10 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
        String canonicalName = q1.class.getCanonicalName();
        String substring = (TextUtils.isEmpty(canonicalName) || (lastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, lastIndexOf);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTrace.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (lastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, lastIndexOf2)).equals(substring)) {
                    sb3.append(": ");
                    sb3.append(stackTraceElement);
                    break;
                }
            }
            i3++;
        }
        return sb3.toString();
    }

    public final void B(int i3, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(C(), i3)) {
            Log.println(i3, C(), D(false, str, obj, obj2, obj3));
        }
        if (z11 || i3 < 5) {
            return;
        }
        c7.c0.g(str);
        o1 o1Var = ((q1) this.f1478d).f8938u;
        if (o1Var == null) {
            Log.println(6, C(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!o1Var.f9095e) {
                Log.println(6, C(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i3 >= 9) {
                i3 = 8;
            }
            o1Var.B(new s0(this, i3, str, obj, obj2, obj3));
        }
    }

    public final String C() {
        String str;
        synchronized (this) {
            try {
                if (this.f9049s == null) {
                    ((q1) ((q1) this.f1478d).f8935r.f1478d).getClass();
                    this.f9049s = "FA";
                }
                c7.c0.g(this.f9049s);
                str = this.f9049s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // s7.x1
    public final boolean t() {
        return false;
    }

    public final t0 w() {
        return this.f9050t;
    }

    public final t0 x() {
        return this.f9053w;
    }

    public final t0 y() {
        return this.A;
    }

    public final t0 z() {
        return this.B;
    }
}
