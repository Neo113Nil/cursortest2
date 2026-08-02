package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* loaded from: classes9.dex */
public final class JavaTypeAttributes extends ErasureTypeAttributes {
    public final SimpleType defaultType;
    public final JavaTypeFlexibility flexibility;
    public final TypeUsage howThisTypeIsUsed;
    public final boolean isForAnnotationParameter;
    public final boolean isRaw;
    public final Set visitedTypeParameters;

    public /* synthetic */ JavaTypeAttributes(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, Set set, SimpleType simpleType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeUsage, (i & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : javaTypeFlexibility, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, (i & 32) != 0 ? null : simpleType);
    }

    public static /* synthetic */ JavaTypeAttributes copy$default(JavaTypeAttributes javaTypeAttributes, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, Set set, SimpleType simpleType, int i, Object obj) {
        if ((i & 1) != 0) {
            typeUsage = javaTypeAttributes.howThisTypeIsUsed;
        }
        if ((i & 2) != 0) {
            javaTypeFlexibility = javaTypeAttributes.flexibility;
        }
        if ((i & 4) != 0) {
            z = javaTypeAttributes.isRaw;
        }
        if ((i & 8) != 0) {
            z2 = javaTypeAttributes.isForAnnotationParameter;
        }
        if ((i & 16) != 0) {
            set = javaTypeAttributes.visitedTypeParameters;
        }
        if ((i & 32) != 0) {
            simpleType = javaTypeAttributes.defaultType;
        }
        Set set2 = set;
        SimpleType simpleType2 = simpleType;
        return javaTypeAttributes.copy(typeUsage, javaTypeFlexibility, z, z2, set2, simpleType2);
    }

    public final JavaTypeAttributes copy(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, Set<? extends TypeParameterDescriptor> set, SimpleType simpleType) {
        typeUsage.getClass();
        javaTypeFlexibility.getClass();
        return new JavaTypeAttributes(typeUsage, javaTypeFlexibility, z, z2, set, simpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public boolean equals(Object obj) {
        if (!(obj instanceof JavaTypeAttributes)) {
            return false;
        }
        JavaTypeAttributes javaTypeAttributes = (JavaTypeAttributes) obj;
        return Intrinsics.areEqual(javaTypeAttributes.getDefaultType(), getDefaultType()) && javaTypeAttributes.getHowThisTypeIsUsed() == getHowThisTypeIsUsed() && javaTypeAttributes.flexibility == this.flexibility && javaTypeAttributes.isRaw == this.isRaw && javaTypeAttributes.isForAnnotationParameter == this.isForAnnotationParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public SimpleType getDefaultType() {
        return this.defaultType;
    }

    public final JavaTypeFlexibility getFlexibility() {
        return this.flexibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public TypeUsage getHowThisTypeIsUsed() {
        return this.howThisTypeIsUsed;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public Set<TypeParameterDescriptor> getVisitedTypeParameters() {
        return this.visitedTypeParameters;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public int hashCode() {
        SimpleType defaultType = getDefaultType();
        int hashCode = defaultType != null ? defaultType.hashCode() : 0;
        int hashCode2 = getHowThisTypeIsUsed().hashCode() + (hashCode * 31) + hashCode;
        int hashCode3 = this.flexibility.hashCode() + (hashCode2 * 31) + hashCode2;
        int i = (hashCode3 * 31) + (this.isRaw ? 1 : 0) + hashCode3;
        return (i * 31) + (this.isForAnnotationParameter ? 1 : 0) + i;
    }

    public final boolean isForAnnotationParameter() {
        return this.isForAnnotationParameter;
    }

    public final boolean isRaw() {
        return this.isRaw;
    }

    public final JavaTypeAttributes markIsRaw(boolean z) {
        return copy$default(this, null, null, z, false, null, null, 59, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.howThisTypeIsUsed + ", flexibility=" + this.flexibility + ", isRaw=" + this.isRaw + ", isForAnnotationParameter=" + this.isForAnnotationParameter + ", visitedTypeParameters=" + this.visitedTypeParameters + ", defaultType=" + this.defaultType + ')';
    }

    public JavaTypeAttributes withDefaultType(SimpleType simpleType) {
        return copy$default(this, null, null, false, false, null, simpleType, 31, null);
    }

    public final JavaTypeAttributes withFlexibility(JavaTypeFlexibility javaTypeFlexibility) {
        javaTypeFlexibility.getClass();
        return copy$default(this, null, javaTypeFlexibility, false, false, null, null, 61, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public JavaTypeAttributes withNewVisitedTypeParameter(TypeParameterDescriptor typeParameterDescriptor) {
        typeParameterDescriptor.getClass();
        return copy$default(this, null, null, false, false, getVisitedTypeParameters() != null ? SetsKt___SetsKt.plus(getVisitedTypeParameters(), typeParameterDescriptor) : SetsKt__SetsJVMKt.setOf(typeParameterDescriptor), null, 47, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTypeAttributes(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, Set<? extends TypeParameterDescriptor> set, SimpleType simpleType) {
        super(typeUsage, set, simpleType);
        typeUsage.getClass();
        javaTypeFlexibility.getClass();
        this.howThisTypeIsUsed = typeUsage;
        this.flexibility = javaTypeFlexibility;
        this.isRaw = z;
        this.isForAnnotationParameter = z2;
        this.visitedTypeParameters = set;
        this.defaultType = simpleType;
    }
}
