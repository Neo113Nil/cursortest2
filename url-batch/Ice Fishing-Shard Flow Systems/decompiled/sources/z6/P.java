package z6;

import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.C0636a;
import kotlin.jvm.internal.C0637b;
import kotlin.jvm.internal.C0640e;
import kotlin.jvm.internal.C0643h;
import kotlin.jvm.internal.Intrinsics;
import m6.C0694b;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f8753a;

    static {
        C0643h a7 = kotlin.jvm.internal.E.a(String.class);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.H.f6155a, "<this>");
        Pair pair = new Pair(a7, U.f8759a);
        C0643h a8 = kotlin.jvm.internal.E.a(Character.TYPE);
        Intrinsics.checkNotNullParameter(C0640e.f6159a, "<this>");
        Pair pair2 = new Pair(a8, C1072l.f8797a);
        Pair pair3 = new Pair(kotlin.jvm.internal.E.a(char[].class), C1071k.f8796c);
        C0643h a9 = kotlin.jvm.internal.E.a(Double.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.j.f6164a, "<this>");
        Pair pair4 = new Pair(a9, C1076p.f8803a);
        Pair pair5 = new Pair(kotlin.jvm.internal.E.a(double[].class), C1075o.f8802c);
        C0643h a10 = kotlin.jvm.internal.E.a(Float.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.k.f6165a, "<this>");
        Pair pair6 = new Pair(a10, C1080u.f8815a);
        Pair pair7 = new Pair(kotlin.jvm.internal.E.a(float[].class), C1079t.f8814c);
        C0643h a11 = kotlin.jvm.internal.E.a(Long.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.q.f6168a, "<this>");
        Pair pair8 = new Pair(a11, F.f8737a);
        Pair pair9 = new Pair(kotlin.jvm.internal.E.a(long[].class), E.f8736c);
        C0643h a12 = kotlin.jvm.internal.E.a(R5.A.class);
        Intrinsics.checkNotNullParameter(R5.A.f2400e, "<this>");
        Pair pair10 = new Pair(a12, d0.f8777a);
        Pair pair11 = new Pair(kotlin.jvm.internal.E.a(R5.B.class), c0.f8774c);
        C0643h a13 = kotlin.jvm.internal.E.a(Integer.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.o.f6167a, "<this>");
        Pair pair12 = new Pair(a13, C1085z.f8830a);
        Pair pair13 = new Pair(kotlin.jvm.internal.E.a(int[].class), C1084y.f8829c);
        C0643h a14 = kotlin.jvm.internal.E.a(R5.x.class);
        Intrinsics.checkNotNullParameter(R5.x.f2438e, "<this>");
        Pair pair14 = new Pair(a14, a0.f8769a);
        Pair pair15 = new Pair(kotlin.jvm.internal.E.a(R5.y.class), Z.f8768c);
        C0643h a15 = kotlin.jvm.internal.E.a(Short.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.G.f6154a, "<this>");
        Pair pair16 = new Pair(a15, T.f8757a);
        Pair pair17 = new Pair(kotlin.jvm.internal.E.a(short[].class), S.f8756c);
        C0643h a16 = kotlin.jvm.internal.E.a(R5.E.class);
        Intrinsics.checkNotNullParameter(R5.E.f2404e, "<this>");
        Pair pair18 = new Pair(a16, g0.f8787a);
        Pair pair19 = new Pair(kotlin.jvm.internal.E.a(R5.F.class), f0.f8784c);
        C0643h a17 = kotlin.jvm.internal.E.a(Byte.TYPE);
        Intrinsics.checkNotNullParameter(C0637b.f6157a, "<this>");
        Pair pair20 = new Pair(a17, C1069i.f8792a);
        Pair pair21 = new Pair(kotlin.jvm.internal.E.a(byte[].class), C1068h.f8789c);
        C0643h a18 = kotlin.jvm.internal.E.a(R5.t.class);
        Intrinsics.checkNotNullParameter(R5.t.f2432e, "<this>");
        Pair pair22 = new Pair(a18, X.f8764a);
        Pair pair23 = new Pair(kotlin.jvm.internal.E.a(R5.v.class), W.f8763c);
        C0643h a19 = kotlin.jvm.internal.E.a(Boolean.TYPE);
        Intrinsics.checkNotNullParameter(C0636a.f6156a, "<this>");
        Pair pair24 = new Pair(a19, C1066f.f8782a);
        Pair pair25 = new Pair(kotlin.jvm.internal.E.a(boolean[].class), C1065e.f8779c);
        C0643h a20 = kotlin.jvm.internal.E.a(Unit.class);
        Intrinsics.checkNotNullParameter(Unit.f6114a, "<this>");
        Pair pair26 = new Pair(a20, h0.f8790b);
        Pair pair27 = new Pair(kotlin.jvm.internal.E.a(Void.class), H.f8740a);
        C0643h a21 = kotlin.jvm.internal.E.a(C0694b.class);
        Intrinsics.checkNotNullParameter(C0694b.f6584e, "<this>");
        f8753a = kotlin.collections.I.e(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, new Pair(a21, C1077q.f8805a));
    }

    public static final String a(String str) {
        String valueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        if (Character.isLowerCase(charAt)) {
            String valueOf2 = String.valueOf(charAt);
            Intrinsics.c(valueOf2, "null cannot be cast to non-null type java.lang.String");
            Locale locale = Locale.ROOT;
            valueOf = valueOf2.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(valueOf, "toUpperCase(...)");
            if (valueOf.length() <= 1) {
                valueOf = String.valueOf(Character.toTitleCase(charAt));
            } else if (charAt != 329) {
                char charAt2 = valueOf.charAt(0);
                String substring = valueOf.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                Intrinsics.c(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                valueOf = charAt2 + lowerCase;
            }
        } else {
            valueOf = String.valueOf(charAt);
        }
        sb.append((Object) valueOf);
        String substring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        sb.append(substring2);
        return sb.toString();
    }
}
