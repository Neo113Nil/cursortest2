package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeParameterExtension;

/* loaded from: classes9.dex */
public final class JvmTypeParameterExtension implements KmTypeParameterExtension {
    public static final Companion Companion = new Companion(null);
    public static final KmExtensionType TYPE = new KmExtensionType(Reflection.factory.getOrCreateKotlinClass(JvmTypeParameterExtension.class));
    public final ArrayList annotations = new ArrayList();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtension
    public KmExtensionType getType() {
        return TYPE;
    }
}
