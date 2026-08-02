package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes9.dex */
public final class JavaAnnotationTargetMapper$$Lambda$0 implements Function1 {
    public static final JavaAnnotationTargetMapper$$Lambda$0 INSTANCE = new JavaAnnotationTargetMapper$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KotlinType type2;
        ModuleDescriptor moduleDescriptor = (ModuleDescriptor) obj;
        JavaAnnotationTargetMapper javaAnnotationTargetMapper = JavaAnnotationTargetMapper.INSTANCE;
        moduleDescriptor.getClass();
        ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), moduleDescriptor.getBuiltIns().getBuiltInClassByFqName(StandardNames.FqNames.target));
        return (annotationParameterByName == null || (type2 = annotationParameterByName.getType()) == null) ? ErrorUtils.createErrorType(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type2;
    }
}
