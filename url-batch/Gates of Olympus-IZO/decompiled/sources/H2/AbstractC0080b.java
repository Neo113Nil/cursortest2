package H2;

import I.C0089d;
import I.C0113p;
import androidx.datastore.preferences.protobuf.C0202l;
import b0.C0288u;
import h.AbstractC0416e;
import t0.C0900h;

/* renamed from: H2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0080b {
    public static int a(float f3, int i3, int i4) {
        return (Float.hashCode(f3) + i3) * i4;
    }

    public static int b(int i3, int i4, int i5) {
        return (Integer.hashCode(i3) + i4) * i5;
    }

    public static int c(int i3, int i4, int i5, int i6) {
        return C0202l.F(i3) + i4 + i5 + i6;
    }

    public static int d(int i3, int i4, long j3) {
        return (Long.hashCode(j3) + i3) * i4;
    }

    public static int e(int i3, int i4, String str) {
        return (str.hashCode() + i3) * i4;
    }

    public static int f(int i3, int i4, boolean z3) {
        return (Boolean.hashCode(z3) + i3) * i4;
    }

    public static String g(int i3, int i4, String str, String str2) {
        return str + i3 + str2 + i4;
    }

    public static String h(String str, int i3) {
        return str + i3;
    }

    public static String i(String str, int i3, String str2) {
        return str + i3 + str2;
    }

    public static String j(StringBuilder sb, float f3, char c3) {
        sb.append(f3);
        sb.append(c3);
        return sb.toString();
    }

    public static String k(StringBuilder sb, int i3, char c3) {
        sb.append(i3);
        sb.append(c3);
        return sb.toString();
    }

    public static StringBuilder l(String str, int i3, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i3);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder m(String str, String str2) {
        Z1.i.e(str, str2);
        return new StringBuilder();
    }

    public static /* synthetic */ void n(int i3) {
        if (i3 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        Z1.i.i(nullPointerException, Z1.i.class.getName());
        throw nullPointerException;
    }

    public static void o(int i3, int i4, int i5, int i6, int i7) {
        AbstractC0416e.d(i3);
        AbstractC0416e.d(i4);
        AbstractC0416e.d(i5);
        AbstractC0416e.d(i6);
        AbstractC0416e.d(i7);
    }

    public static void p(int i3, C0113p c0113p, int i4, C0900h c0900h) {
        c0113p.a0(Integer.valueOf(i3));
        c0113p.b(Integer.valueOf(i4), c0900h);
    }

    public static void q(long j3, StringBuilder sb, String str) {
        sb.append((Object) C0288u.i(j3));
        sb.append(str);
    }

    public static /* synthetic */ void r(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void s(String str, int i3) {
        if (i3 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = Z1.i.class.getName();
            int i4 = 0;
            while (!stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            while (stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            StackTraceElement stackTraceElement = stackTrace[i4];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            Z1.i.i(nullPointerException, Z1.i.class.getName());
            throw nullPointerException;
        }
    }

    public static void t(StringBuilder sb, int i3, String str, String str2, String str3) {
        sb.append(i3);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void u(StringBuilder sb, int i3, String str, String str2, String str3) {
        sb.append(i3);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        C0089d.S(sb.toString());
        throw null;
    }

    public static /* synthetic */ String v(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? "null" : "Idle" : "LookaheadLayingOut" : "LayingOut" : "LookaheadMeasuring" : "Measuring";
    }
}
