package a0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m {
    public static int a(float f9, int i7, int i8) {
        return (Float.hashCode(f9) + i7) * i8;
    }

    public static int b(int i7, int i8, int i9) {
        return androidx.datastore.preferences.protobuf.l.s(i7) + i8 + i9;
    }

    public static int c(int i7, int i8, int i9, int i10) {
        return androidx.datastore.preferences.protobuf.l.t(i7) + i8 + i9 + i10;
    }

    public static int d(int i7, int i8, long j8) {
        return (Long.hashCode(j8) + i7) * i8;
    }

    public static int e(int i7, int i8, boolean z8) {
        return (Boolean.hashCode(z8) + i7) * i8;
    }

    public static ClassCastException f(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String g(int i7, String str, String str2) {
        return str + i7 + str2;
    }

    public static String h(long j8, String str) {
        return str + j8;
    }

    public static String i(String str, int i7) {
        return str + i7;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String k(StringBuilder sb, float f9, char c4) {
        sb.append(f9);
        sb.append(c4);
        return sb.toString();
    }

    public static String l(StringBuilder sb, int i7, char c4) {
        sb.append(i7);
        sb.append(c4);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder n(int i7, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i7);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder o(String str, String str2) {
        r6.k.e(str, str2);
        return new StringBuilder();
    }

    public static void p(int i7, int i8, int i9, int i10, int i11) {
        r4.a.d(i7);
        r4.a.d(i8);
        r4.a.d(i9);
        r4.a.d(i10);
        r4.a.d(i11);
    }

    public static void q(int i7, g0.p pVar, int i8, r1.h hVar) {
        pVar.a0(Integer.valueOf(i7));
        pVar.b(Integer.valueOf(i8), hVar);
    }

    public static void r(long j8, StringBuilder sb, String str) {
        sb.append((Object) z0.u.i(j8));
        sb.append(str);
    }

    public static void s(b1.b bVar, long j8) {
        bVar.k().n();
        bVar.C(j8);
    }

    public static void t(StringBuilder sb, int i7, String str, String str2, String str3) {
        sb.append(i7);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void u(StringBuilder sb, int i7, String str, String str2, String str3) {
        sb.append(i7);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        g0.d.S(sb.toString());
        throw null;
    }

    public static /* synthetic */ String v(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "null" : "VALUE" : "CHILD_CHANGED" : "CHILD_MOVED" : "CHILD_ADDED" : "CHILD_REMOVED";
    }

    public static /* synthetic */ String w(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "null" : "Idle" : "LookaheadLayingOut" : "LayingOut" : "LookaheadMeasuring" : "Measuring";
    }
}
