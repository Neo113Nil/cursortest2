package j3;

import M2.F;
import M2.I;
import e2.C0559a;
import i3.M;
import i3.a0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7214a = 0;

    static {
        Intrinsics.checkNotNullParameter(I.f3583a, "<this>");
        M.a("kotlinx.serialization.json.JsonUnquotedLiteral", a0.f7055a);
    }

    public static final int a(B b4) {
        Intrinsics.checkNotNullParameter(b4, "<this>");
        try {
            long i2 = new C0559a(b4.getContent()).i();
            if (-2147483648L <= i2 && i2 <= 2147483647L) {
                return (int) i2;
            }
            throw new NumberFormatException(b4.getContent() + " is not an Int");
        } catch (k3.d e4) {
            throw new NumberFormatException(e4.getMessage());
        }
    }

    public static final B b(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        B b4 = mVar instanceof B ? (B) mVar : null;
        if (b4 != null) {
            return b4;
        }
        throw new IllegalArgumentException("Element " + F.a(mVar.getClass()) + " is not a JsonPrimitive");
    }
}
