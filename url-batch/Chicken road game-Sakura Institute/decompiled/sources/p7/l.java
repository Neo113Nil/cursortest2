package p7;

import o7.a1;
import o7.n0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class l {
    static {
        n0.a("kotlinx.serialization.json.JsonUnquotedLiteral", a1.f6856a);
    }

    public static final z a(k kVar) {
        z zVar = kVar instanceof z ? (z) kVar : null;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalArgumentException("Element " + r6.w.a(kVar.getClass()) + " is not a JsonPrimitive");
    }
}
