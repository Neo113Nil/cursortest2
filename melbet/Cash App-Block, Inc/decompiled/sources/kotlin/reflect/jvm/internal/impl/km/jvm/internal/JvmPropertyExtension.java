package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPropertyExtension;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmFieldSignature;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature;

/* loaded from: classes9.dex */
public final class JvmPropertyExtension implements KmPropertyExtension {
    public static final Companion Companion = new Companion(null);
    public static final KmExtensionType TYPE = new KmExtensionType(Reflection.factory.getOrCreateKotlinClass(JvmPropertyExtension.class));
    public JvmFieldSignature fieldSignature;
    public JvmMethodSignature getterSignature;
    public int jvmFlags;
    public JvmMethodSignature setterSignature;
    public JvmMethodSignature syntheticMethodForAnnotations;
    public JvmMethodSignature syntheticMethodForDelegate;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final JvmFieldSignature getFieldSignature() {
        return this.fieldSignature;
    }

    public final JvmMethodSignature getGetterSignature() {
        return this.getterSignature;
    }

    public final int getJvmFlags() {
        return this.jvmFlags;
    }

    public final JvmMethodSignature getSetterSignature() {
        return this.setterSignature;
    }

    public final JvmMethodSignature getSyntheticMethodForAnnotations() {
        return this.syntheticMethodForAnnotations;
    }

    public final JvmMethodSignature getSyntheticMethodForDelegate() {
        return this.syntheticMethodForDelegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtension
    public KmExtensionType getType() {
        return TYPE;
    }

    public final void setFieldSignature(JvmFieldSignature jvmFieldSignature) {
        this.fieldSignature = jvmFieldSignature;
    }

    public final void setGetterSignature(JvmMethodSignature jvmMethodSignature) {
        this.getterSignature = jvmMethodSignature;
    }

    public final void setJvmFlags(int i) {
        this.jvmFlags = i;
    }

    public final void setSetterSignature(JvmMethodSignature jvmMethodSignature) {
        this.setterSignature = jvmMethodSignature;
    }

    public final void setSyntheticMethodForAnnotations(JvmMethodSignature jvmMethodSignature) {
        this.syntheticMethodForAnnotations = jvmMethodSignature;
    }

    public final void setSyntheticMethodForDelegate(JvmMethodSignature jvmMethodSignature) {
        this.syntheticMethodForDelegate = jvmMethodSignature;
    }
}
