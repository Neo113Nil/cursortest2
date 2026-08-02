package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.util.NullableArrayMapAccessor;

/* loaded from: classes9.dex */
public final class AnnotationsTypeAttributeKt {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(AnnotationsTypeAttributeKt.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1)};
    public static final NullableArrayMapAccessor annotationsAttribute$delegate;

    static {
        NullableArrayMapAccessor<TypeAttribute<?>, TypeAttribute<?>, T> generateNullableAccessor = TypeAttributes.Companion.generateNullableAccessor(Reflection.factory.getOrCreateKotlinClass(AnnotationsTypeAttribute.class));
        generateNullableAccessor.getClass();
        annotationsAttribute$delegate = generateNullableAccessor;
    }

    public static final Annotations getAnnotations(TypeAttributes typeAttributes) {
        Annotations annotations;
        typeAttributes.getClass();
        AnnotationsTypeAttribute annotationsAttribute = getAnnotationsAttribute(typeAttributes);
        return (annotationsAttribute == null || (annotations = annotationsAttribute.getAnnotations()) == null) ? Annotations.Companion.getEMPTY() : annotations;
    }

    public static final AnnotationsTypeAttribute getAnnotationsAttribute(TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return (AnnotationsTypeAttribute) annotationsAttribute$delegate.getValue((Object) typeAttributes, $$delegatedProperties[0]);
    }
}
