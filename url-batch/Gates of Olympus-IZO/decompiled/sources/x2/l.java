package x2;

import w2.M;
import w2.a0;

/* loaded from: classes.dex */
public abstract class l {
    static {
        M.a("kotlinx.serialization.json.JsonUnquotedLiteral", a0.f8646a);
    }

    public static final A a(k kVar) {
        A a3 = kVar instanceof A ? (A) kVar : null;
        if (a3 != null) {
            return a3;
        }
        throw new IllegalArgumentException("Element " + Z1.u.a(kVar.getClass()) + " is not a JsonPrimitive");
    }
}
