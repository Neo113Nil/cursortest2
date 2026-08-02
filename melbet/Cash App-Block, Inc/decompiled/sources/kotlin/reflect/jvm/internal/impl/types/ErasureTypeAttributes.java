package kotlin.reflect.jvm.internal.impl.types;

import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* loaded from: classes9.dex */
public class ErasureTypeAttributes {
    public final SimpleType defaultType;
    public final TypeUsage howThisTypeIsUsed;
    public final Set visitedTypeParameters;

    public ErasureTypeAttributes(TypeUsage typeUsage, Set<? extends TypeParameterDescriptor> set, SimpleType simpleType) {
        typeUsage.getClass();
        this.howThisTypeIsUsed = typeUsage;
        this.visitedTypeParameters = set;
        this.defaultType = simpleType;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ErasureTypeAttributes)) {
            return false;
        }
        ErasureTypeAttributes erasureTypeAttributes = (ErasureTypeAttributes) obj;
        return Intrinsics.areEqual(erasureTypeAttributes.getDefaultType(), getDefaultType()) && erasureTypeAttributes.getHowThisTypeIsUsed() == getHowThisTypeIsUsed();
    }

    public SimpleType getDefaultType() {
        return this.defaultType;
    }

    public TypeUsage getHowThisTypeIsUsed() {
        return this.howThisTypeIsUsed;
    }

    public Set<TypeParameterDescriptor> getVisitedTypeParameters() {
        return this.visitedTypeParameters;
    }

    public int hashCode() {
        SimpleType defaultType = getDefaultType();
        int hashCode = defaultType != null ? defaultType.hashCode() : 0;
        return getHowThisTypeIsUsed().hashCode() + (hashCode * 31) + hashCode;
    }

    public ErasureTypeAttributes withNewVisitedTypeParameter(TypeParameterDescriptor typeParameterDescriptor) {
        typeParameterDescriptor.getClass();
        TypeUsage howThisTypeIsUsed = getHowThisTypeIsUsed();
        Set<TypeParameterDescriptor> visitedTypeParameters = getVisitedTypeParameters();
        return new ErasureTypeAttributes(howThisTypeIsUsed, visitedTypeParameters != null ? SetsKt___SetsKt.plus(visitedTypeParameters, typeParameterDescriptor) : SetsKt__SetsJVMKt.setOf(typeParameterDescriptor), getDefaultType());
    }
}
