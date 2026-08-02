package kotlin.reflect.jvm.internal.impl.km.internal.extensions;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class KmExtensionType {
    public final KClass klass;

    public KmExtensionType(KClass kClass) {
        kClass.getClass();
        this.klass = kClass;
    }

    public boolean equals(Object obj) {
        if (obj instanceof KmExtensionType) {
            return Intrinsics.areEqual(this.klass, ((KmExtensionType) obj).klass);
        }
        return false;
    }

    public int hashCode() {
        return this.klass.hashCode();
    }

    public String toString() {
        return PapaEvent.getJavaClass(this.klass).getName();
    }
}
