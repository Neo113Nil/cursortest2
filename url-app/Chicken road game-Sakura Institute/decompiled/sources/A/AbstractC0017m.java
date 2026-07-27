package A;

import G.C0192d;
import G.C0216p;
import Z.C0323u;
import androidx.datastore.preferences.protobuf.C0447l;
import kotlin.jvm.internal.Intrinsics;
import r0.C1067h;

/* renamed from: A.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0017m {
    public static int a(float f4, int i2, int i4) {
        return (Float.hashCode(f4) + i2) * i4;
    }

    public static int b(int i2, int i4, int i5, int i6) {
        return C0447l.F(i2) + i4 + i5 + i6;
    }

    public static int c(int i2, int i4, long j4) {
        return (Long.hashCode(j4) + i2) * i4;
    }

    public static int d(int i2, int i4, boolean z4) {
        return (Boolean.hashCode(z4) + i2) * i4;
    }

    public static ClassCastException e(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static Object f(C0216p c0216p, boolean z4, int i2) {
        c0216p.q(z4);
        c0216p.S(i2);
        return c0216p.I();
    }

    public static String g(int i2, String str) {
        return str + i2;
    }

    public static String h(int i2, String str, String str2) {
        return str + i2 + str2;
    }

    public static String i(String str, long j4) {
        return str + j4;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String k(StringBuilder sb, float f4, char c4) {
        sb.append(f4);
        sb.append(c4);
        return sb.toString();
    }

    public static String l(StringBuilder sb, int i2, char c4) {
        sb.append(i2);
        sb.append(c4);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, char c4) {
        sb.append(str);
        sb.append(c4);
        return sb.toString();
    }

    public static String n(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder o(int i2, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i2);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder p(String str, String str2) {
        Intrinsics.checkNotNullExpressionValue(str, str2);
        return new StringBuilder();
    }

    public static void q(int i2, int i4, int i5, int i6, int i7) {
        u3.d.d(i2);
        u3.d.d(i4);
        u3.d.d(i5);
        u3.d.d(i6);
        u3.d.d(i7);
    }

    public static void r(int i2, C0216p c0216p, int i4, C1067h c1067h) {
        c0216p.c0(Integer.valueOf(i2));
        c0216p.b(Integer.valueOf(i4), c1067h);
    }

    public static void s(long j4, StringBuilder sb, String str) {
        sb.append((Object) C0323u.i(j4));
        sb.append(str);
    }

    public static void t(StringBuilder sb, int i2, String str, String str2, String str3) {
        sb.append(i2);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void u(StringBuilder sb, int i2, String str, String str2, String str3) {
        sb.append(i2);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        C0192d.T(sb.toString());
        throw null;
    }

    public static /* synthetic */ String v(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "null" : "VALUE" : "CHILD_CHANGED" : "CHILD_MOVED" : "CHILD_ADDED" : "CHILD_REMOVED";
    }

    public static /* synthetic */ String w(int i2) {
        return i2 != 1 ? i2 != 2 ? "null" : "V2" : "V1";
    }
}
