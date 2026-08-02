package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: classes9.dex */
public final class AnnotationTypeQualifierResolver extends AbstractAnnotationTypeQualifierResolver<AnnotationDescriptor> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationTypeQualifierResolver(JavaTypeEnhancementState javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        javaTypeEnhancementState.getClass();
    }

    public static List toEnumNames(ConstantValue constantValue) {
        if (!(constantValue instanceof ArrayValue)) {
            return constantValue instanceof EnumValue ? CollectionsKt__CollectionsJVMKt.listOf(((EnumValue) constantValue).getEnumEntryName().getIdentifier()) : EmptyList.INSTANCE;
        }
        List<? extends ConstantValue<?>> value = ((ArrayValue) constantValue).getValue();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(toEnumNames((ConstantValue) it.next()), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public Iterable enumArguments(Object obj, boolean z) {
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        annotationDescriptor.getClass();
        Map<Name, ConstantValue<?>> allValueArguments = annotationDescriptor.getAllValueArguments();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Name, ConstantValue<?>> entry : allValueArguments.entrySet()) {
            CollectionsKt__MutableCollectionsKt.addAll((!z || Intrinsics.areEqual(entry.getKey(), JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) ? toEnumNames(entry.getValue()) : EmptyList.INSTANCE, arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public FqName getFqName(Object obj) {
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        annotationDescriptor.getClass();
        return annotationDescriptor.getFqName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public Object getKey(Object obj) {
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        annotationDescriptor.getClass();
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        annotationClass.getClass();
        return annotationClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public Iterable getMetaAnnotations(Object obj) {
        Annotations annotations;
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        annotationDescriptor.getClass();
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        return (annotationClass == null || (annotations = annotationClass.getAnnotations()) == null) ? EmptyList.INSTANCE : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public boolean isK2() {
        return false;
    }
}
