package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class KmPropertyAccessorAttributes {
    public final ArrayList annotations;
    public int flags;

    public KmPropertyAccessorAttributes(int i) {
        this.flags = i;
        this.annotations = new ArrayList(0);
    }

    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    public final int getFlags$kotlin_metadata() {
        return this.flags;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.flags = i;
    }

    public KmPropertyAccessorAttributes() {
        this(0);
    }
}
