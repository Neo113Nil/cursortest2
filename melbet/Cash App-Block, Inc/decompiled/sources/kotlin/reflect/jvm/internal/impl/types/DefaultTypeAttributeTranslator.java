package kotlin.reflect.jvm.internal.impl.types;

import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes9.dex */
public final class DefaultTypeAttributeTranslator implements TypeAttributeTranslator {
    public static final DefaultTypeAttributeTranslator INSTANCE = new DefaultTypeAttributeTranslator();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator
    public TypeAttributes toAttributes(Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        annotations.getClass();
        return annotations.isEmpty() ? TypeAttributes.Companion.getEmpty() : TypeAttributes.Companion.create(CollectionsKt__CollectionsJVMKt.listOf(new AnnotationsTypeAttribute(annotations)));
    }
}
