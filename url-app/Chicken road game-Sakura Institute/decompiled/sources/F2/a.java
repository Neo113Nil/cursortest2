package F2;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC1420d;

/* loaded from: classes.dex */
public final class a extends AbstractC1420d implements Serializable {
    @Override // z2.AbstractC1418b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        Intrinsics.checkNotNullParameter(null, "<this>");
        if (ordinal < 0) {
            return false;
        }
        throw null;
    }

    @Override // z2.AbstractC1418b
    public final int e() {
        throw null;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        throw null;
    }

    @Override // z2.AbstractC1420d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        Intrinsics.checkNotNullParameter(null, "<this>");
        if (ordinal < 0) {
            return -1;
        }
        throw null;
    }

    @Override // z2.AbstractC1420d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }
}
