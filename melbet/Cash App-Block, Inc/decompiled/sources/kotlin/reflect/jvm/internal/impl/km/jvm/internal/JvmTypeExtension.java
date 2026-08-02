package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeExtension;

/* loaded from: classes9.dex */
public final class JvmTypeExtension implements KmTypeExtension {
    public static final Companion Companion = new Companion(null);
    public static final KmExtensionType TYPE = new KmExtensionType(Reflection.factory.getOrCreateKotlinClass(JvmTypeExtension.class));
    public final ArrayList annotations = new ArrayList();
    public boolean isRaw;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!JvmTypeExtension.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        JvmTypeExtension jvmTypeExtension = (JvmTypeExtension) obj;
        return this.isRaw == jvmTypeExtension.isRaw && Intrinsics.areEqual(this.annotations, jvmTypeExtension.annotations);
    }

    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtension
    public KmExtensionType getType() {
        return TYPE;
    }

    public int hashCode() {
        return this.annotations.hashCode() + (Boolean.hashCode(this.isRaw) * 31);
    }

    public final boolean isRaw() {
        return this.isRaw;
    }

    public final void setRaw(boolean z) {
        this.isRaw = z;
    }
}
