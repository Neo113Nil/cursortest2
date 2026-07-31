package D2;

import C2.S;
import E2.a0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;
import kotlin.text.StringsKt;
import z2.AbstractC3551a;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final A2.f f407a = S.a("kotlinx.serialization.json.JsonUnquotedLiteral", AbstractC3551a.H(L.f41137a));

    public static final z a(Boolean bool) {
        return bool == null ? u.INSTANCE : new q(bool, false, null, 4, null);
    }

    public static final z b(Number number) {
        return number == null ? u.INSTANCE : new q(number, false, null, 4, null);
    }

    public static final z c(String str) {
        return str == null ? u.INSTANCE : new q(str, true, null, 4, null);
    }

    private static final Void d(i iVar, String str) {
        throw new IllegalArgumentException("Element " + H.b(iVar.getClass()) + " is not a " + str);
    }

    public static final Boolean e(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return a0.d(zVar.e());
    }

    public static final String f(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        if (zVar instanceof u) {
            return null;
        }
        return zVar.e();
    }

    public static final double g(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return Double.parseDouble(zVar.e());
    }

    public static final Double h(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return StringsKt.j(zVar.e());
    }

    public static final float i(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return Float.parseFloat(zVar.e());
    }

    public static final int j(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return Integer.parseInt(zVar.e());
    }

    public static final z k(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        z zVar = iVar instanceof z ? (z) iVar : null;
        if (zVar != null) {
            return zVar;
        }
        d(iVar, "JsonPrimitive");
        throw new W1.f();
    }

    public static final A2.f l() {
        return f407a;
    }

    public static final long m(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return Long.parseLong(zVar.e());
    }

    public static final Long n(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return StringsKt.n(zVar.e());
    }
}
