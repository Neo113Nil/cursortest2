package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class RawSubstitution extends TypeSubstitution {
    public static final Companion Companion = new Companion(null);
    public static final JavaTypeAttributes lowerTypeAttr;
    public static final JavaTypeAttributes upperTypeAttr;
    public final RawProjectionComputer projectionComputer;
    public final TypeParameterUpperBoundEraser typeParameterUpperBoundEraser;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        lowerTypeAttr = JavaTypeAttributesKt.toAttributes$default(typeUsage, false, true, null, 5, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        upperTypeAttr = JavaTypeAttributesKt.toAttributes$default(typeUsage, false, true, null, 5, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    public RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.projectionComputer = rawProjectionComputer;
        this.typeParameterUpperBoundEraser = typeParameterUpperBoundEraser == null ? new TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, null) : typeParameterUpperBoundEraser;
    }

    public final Pair eraseInflexibleBasedOnClassDescriptor(SimpleType simpleType, ClassDescriptor classDescriptor, JavaTypeAttributes javaTypeAttributes) {
        if (simpleType.getConstructor().getParameters().isEmpty()) {
            return new Pair(simpleType, Boolean.FALSE);
        }
        if (KotlinBuiltIns.isArray(simpleType)) {
            TypeProjection typeProjection = simpleType.getArguments().get(0);
            Variance projectionKind = typeProjection.getProjectionKind();
            KotlinType type2 = typeProjection.getType();
            type2.getClass();
            return new Pair(KotlinTypeFactory.simpleType$default(simpleType.getAttributes(), simpleType.getConstructor(), CollectionsKt__CollectionsJVMKt.listOf(new TypeProjectionImpl(projectionKind, eraseType(type2, javaTypeAttributes))), simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null), Boolean.FALSE);
        }
        JavaTypeAttributes javaTypeAttributes2 = javaTypeAttributes;
        if (KotlinTypeKt.isError(simpleType)) {
            return new Pair(ErrorUtils.createErrorType(ErrorTypeKind.ERROR_RAW_TYPE, simpleType.getConstructor().toString()), Boolean.FALSE);
        }
        MemberScope memberScope = classDescriptor.getMemberScope(this);
        memberScope.getClass();
        TypeAttributes attributes = simpleType.getAttributes();
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        typeConstructor.getClass();
        List<TypeParameterDescriptor> parameters = classDescriptor.getTypeConstructor().getParameters();
        parameters.getClass();
        List<TypeParameterDescriptor> list = parameters;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            typeParameterDescriptor.getClass();
            arrayList.add(ErasureProjectionComputer.computeProjection$default(this.projectionComputer, typeParameterDescriptor, javaTypeAttributes2, this.typeParameterUpperBoundEraser, null, 8, null));
            javaTypeAttributes2 = javaTypeAttributes;
        }
        return new Pair(KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(attributes, typeConstructor, arrayList, simpleType.isMarkedNullable(), memberScope, new AbstractTypeChecker$$Lambda$0(classDescriptor, this, simpleType, javaTypeAttributes, 6)), Boolean.TRUE);
    }

    public final KotlinType eraseType(KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes) {
        ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
        if (mo4153getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return eraseType(this.typeParameterUpperBoundEraser.getErasedUpperBound((TypeParameterDescriptor) mo4153getDeclarationDescriptor, javaTypeAttributes.markIsRaw(true)), javaTypeAttributes);
        }
        if (!(mo4153getDeclarationDescriptor instanceof ClassDescriptor)) {
            Path$$ExternalSyntheticBUOutline0.m$1(mo4153getDeclarationDescriptor, "Unexpected declaration kind: ");
            return null;
        }
        ClassifierDescriptor mo4153getDeclarationDescriptor2 = FlexibleTypesKt.upperIfFlexible(kotlinType).getConstructor().mo4153getDeclarationDescriptor();
        if (!(mo4153getDeclarationDescriptor2 instanceof ClassDescriptor)) {
            f$$ExternalSyntheticLambda0.m(34, mo4153getDeclarationDescriptor2, "\" while for lower it's \"", mo4153getDeclarationDescriptor, "For some reason declaration for upper bound is not a class but \"");
            return null;
        }
        Pair eraseInflexibleBasedOnClassDescriptor = eraseInflexibleBasedOnClassDescriptor(FlexibleTypesKt.lowerIfFlexible(kotlinType), (ClassDescriptor) mo4153getDeclarationDescriptor, lowerTypeAttr);
        SimpleType simpleType = (SimpleType) eraseInflexibleBasedOnClassDescriptor.first;
        boolean booleanValue = ((Boolean) eraseInflexibleBasedOnClassDescriptor.second).booleanValue();
        Pair eraseInflexibleBasedOnClassDescriptor2 = eraseInflexibleBasedOnClassDescriptor(FlexibleTypesKt.upperIfFlexible(kotlinType), (ClassDescriptor) mo4153getDeclarationDescriptor2, upperTypeAttr);
        SimpleType simpleType2 = (SimpleType) eraseInflexibleBasedOnClassDescriptor2.first;
        return (booleanValue || ((Boolean) eraseInflexibleBasedOnClassDescriptor2.second).booleanValue()) ? new RawTypeImpl(simpleType, simpleType2) : KotlinTypeFactory.flexibleType(simpleType, simpleType2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: get */
    public TypeProjectionImpl mo4156get(KotlinType kotlinType) {
        kotlinType.getClass();
        return new TypeProjectionImpl(eraseType(kotlinType, new JavaTypeAttributes(TypeUsage.COMMON, null, false, false, null, null, 62, null)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawSubstitution() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeParameterUpperBoundEraser);
    }
}
