package D2;

import C2.M;
import C2.a0;

/* loaded from: classes.dex */
public abstract class l {
    static {
        M.a("kotlinx.serialization.json.JsonUnquotedLiteral", a0.f733a);
    }

    public static final A a(k kVar) {
        A a3 = kVar instanceof A ? (A) kVar : null;
        if (a3 != null) {
            return a3;
        }
        throw new IllegalArgumentException("Element " + f2.v.a(kVar.getClass()) + " is not a JsonPrimitive");
    }
}
