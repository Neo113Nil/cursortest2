package C2;

import java.util.Iterator;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.C3238d;
import kotlin.jvm.internal.C3239e;
import kotlin.jvm.internal.C3241g;
import kotlin.jvm.internal.C3245k;
import kotlin.jvm.internal.C3246l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import y2.InterfaceC3527b;
import z2.AbstractC3551a;

/* loaded from: classes3.dex */
public abstract class E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f198a = MapsKt.mapOf(TuplesKt.to(kotlin.jvm.internal.H.b(String.class), AbstractC3551a.H(kotlin.jvm.internal.L.f41137a)), TuplesKt.to(kotlin.jvm.internal.H.b(Character.TYPE), AbstractC3551a.B(C3241g.f41150a)), TuplesKt.to(kotlin.jvm.internal.H.b(char[].class), AbstractC3551a.d()), TuplesKt.to(kotlin.jvm.internal.H.b(Double.TYPE), AbstractC3551a.C(C3245k.f41159a)), TuplesKt.to(kotlin.jvm.internal.H.b(double[].class), AbstractC3551a.e()), TuplesKt.to(kotlin.jvm.internal.H.b(Float.TYPE), AbstractC3551a.D(C3246l.f41160a)), TuplesKt.to(kotlin.jvm.internal.H.b(float[].class), AbstractC3551a.f()), TuplesKt.to(kotlin.jvm.internal.H.b(Long.TYPE), AbstractC3551a.F(kotlin.jvm.internal.t.f41162a)), TuplesKt.to(kotlin.jvm.internal.H.b(long[].class), AbstractC3551a.i()), TuplesKt.to(kotlin.jvm.internal.H.b(W1.v.class), AbstractC3551a.w(W1.v.f9632c)), TuplesKt.to(kotlin.jvm.internal.H.b(W1.w.class), AbstractC3551a.r()), TuplesKt.to(kotlin.jvm.internal.H.b(Integer.TYPE), AbstractC3551a.E(kotlin.jvm.internal.r.f41161a)), TuplesKt.to(kotlin.jvm.internal.H.b(int[].class), AbstractC3551a.g()), TuplesKt.to(kotlin.jvm.internal.H.b(W1.t.class), AbstractC3551a.v(W1.t.f9627c)), TuplesKt.to(kotlin.jvm.internal.H.b(W1.u.class), AbstractC3551a.q()), TuplesKt.to(kotlin.jvm.internal.H.b(Short.TYPE), AbstractC3551a.G(kotlin.jvm.internal.J.f41135a)), TuplesKt.to(kotlin.jvm.internal.H.b(short[].class), AbstractC3551a.n()), TuplesKt.to(kotlin.jvm.internal.H.b(W1.y.class), AbstractC3551a.x(W1.y.f9638c)), TuplesKt.to(kotlin.jvm.internal.H.b(W1.z.class), AbstractC3551a.s()), TuplesKt.to(kotlin.jvm.internal.H.b(Byte.TYPE), AbstractC3551a.A(C3239e.f41148a)), TuplesKt.to(kotlin.jvm.internal.H.b(byte[].class), AbstractC3551a.c()), TuplesKt.to(kotlin.jvm.internal.H.b(W1.r.class), AbstractC3551a.u(W1.r.f9622c)), TuplesKt.to(kotlin.jvm.internal.H.b(W1.s.class), AbstractC3551a.p()), TuplesKt.to(kotlin.jvm.internal.H.b(Boolean.TYPE), AbstractC3551a.z(C3238d.f41147a)), TuplesKt.to(kotlin.jvm.internal.H.b(boolean[].class), AbstractC3551a.b()), TuplesKt.to(kotlin.jvm.internal.H.b(Unit.class), AbstractC3551a.y(Unit.f41027a)), TuplesKt.to(kotlin.jvm.internal.H.b(Void.class), AbstractC3551a.l()), TuplesKt.to(kotlin.jvm.internal.H.b(kotlin.time.a.class), AbstractC3551a.I(kotlin.time.a.f41281c)));

    public static final A2.f a(String serialName, A2.e kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        d(serialName);
        return new D0(serialName, kind);
    }

    public static final InterfaceC3527b b(m2.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return (InterfaceC3527b) f198a.get(cVar);
    }

    private static final String c(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(charAt) ? CharsKt.f(charAt) : String.valueOf(charAt)));
        String substring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    private static final void d(String str) {
        Iterator it = f198a.keySet().iterator();
        while (it.hasNext()) {
            String e4 = ((m2.c) it.next()).e();
            Intrinsics.checkNotNull(e4);
            String c4 = c(e4);
            if (StringsKt.w(str, "kotlin." + c4, true) || StringsKt.w(str, c4, true)) {
                throw new IllegalArgumentException(StringsKt.f("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + c(c4) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
