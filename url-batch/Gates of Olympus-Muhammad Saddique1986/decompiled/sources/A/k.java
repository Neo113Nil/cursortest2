package A;

import I.C0143d;
import I.C0167p;
import androidx.datastore.preferences.protobuf.C0258l;
import b0.C0352v;
import t0.C0995h;

/* loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static int a(float f3, int i3, int i4) {
        return (Float.hashCode(f3) + i3) * i4;
    }

    public static int b(int i3, int i4, int i5, int i6) {
        return C0258l.F(i3) + i4 + i5 + i6;
    }

    public static int c(int i3, int i4, long j3) {
        return (Long.hashCode(j3) + i3) * i4;
    }

    public static int d(int i3, int i4, String str) {
        return (str.hashCode() + i3) * i4;
    }

    public static int e(int i3, int i4, boolean z3) {
        return (Boolean.hashCode(z3) + i3) * i4;
    }

    public static String f(int i3, int i4, String str, String str2) {
        return str + i3 + str2 + i4;
    }

    public static String g(int i3, String str, String str2) {
        return str + i3 + str2;
    }

    public static String h(String str, int i3) {
        return str + i3;
    }

    public static String i(StringBuilder sb, float f3, char c2) {
        sb.append(f3);
        sb.append(c2);
        return sb.toString();
    }

    public static String j(StringBuilder sb, int i3, char c2) {
        sb.append(i3);
        sb.append(c2);
        return sb.toString();
    }

    public static StringBuilder k(int i3, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i3);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder l(String str, String str2) {
        f2.j.e(str, str2);
        return new StringBuilder();
    }

    public static /* synthetic */ void m(int i3) {
        if (i3 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        f2.j.i(nullPointerException, f2.j.class.getName());
        throw nullPointerException;
    }

    public static void n(int i3, int i4, int i5, int i6, int i7) {
        l0.c.d(i3);
        l0.c.d(i4);
        l0.c.d(i5);
        l0.c.d(i6);
        l0.c.d(i7);
    }

    public static void o(int i3, C0167p c0167p, int i4, C0995h c0995h) {
        c0167p.a0(Integer.valueOf(i3));
        c0167p.b(Integer.valueOf(i4), c0995h);
    }

    public static void p(long j3, StringBuilder sb, String str) {
        sb.append((Object) C0352v.i(j3));
        sb.append(str);
    }

    public static void q(G1.m mVar, long j3) {
        mVar.h().a();
        mVar.z(j3);
    }

    public static /* synthetic */ void r(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void s(String str, int i3) {
        if (i3 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = f2.j.class.getName();
            int i4 = 0;
            while (!stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            while (stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            StackTraceElement stackTraceElement = stackTrace[i4];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            f2.j.i(nullPointerException, f2.j.class.getName());
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
        C0143d.T(sb.toString());
        throw null;
    }

    public static /* synthetic */ String v(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? "null" : "Idle" : "LookaheadLayingOut" : "LayingOut" : "LookaheadMeasuring" : "Measuring";
    }
}
