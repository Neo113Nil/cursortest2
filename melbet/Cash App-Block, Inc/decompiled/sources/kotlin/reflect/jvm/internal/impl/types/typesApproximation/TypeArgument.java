package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes9.dex */
public final class TypeArgument {
    public final KotlinType inProjection;
    public final KotlinType outProjection;
    public final TypeParameterDescriptor typeParameter;

    public TypeArgument(TypeParameterDescriptor typeParameterDescriptor, KotlinType kotlinType, KotlinType kotlinType2) {
        typeParameterDescriptor.getClass();
        kotlinType.getClass();
        kotlinType2.getClass();
        this.typeParameter = typeParameterDescriptor;
        this.inProjection = kotlinType;
        this.outProjection = kotlinType2;
    }
}
