package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes9.dex */
public final class DeserializedTypeAliasDescriptor extends AbstractTypeAliasDescriptor implements DeserializedMemberDescriptor {
    public final DeserializedContainerSource containerSource;
    public SimpleType defaultTypeImpl;
    public SimpleType expandedType;
    public final NameResolver nameResolver;
    public final ProtoBuf.TypeAlias proto;
    public List typeConstructorParameters;
    public final TypeTable typeTable;
    public SimpleType underlyingType;
    public final VersionRequirementTable versionRequirementTable;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeserializedTypeAliasDescriptor(StorageManager storageManager, DeclarationDescriptor declarationDescriptor, Annotations annotations, Name name, DescriptorVisibility descriptorVisibility, ProtoBuf.TypeAlias typeAlias, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource) {
        super(storageManager, declarationDescriptor, annotations, name, r5, descriptorVisibility);
        storageManager.getClass();
        declarationDescriptor.getClass();
        annotations.getClass();
        name.getClass();
        descriptorVisibility.getClass();
        typeAlias.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        versionRequirementTable.getClass();
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        sourceElement.getClass();
        this.proto = typeAlias;
        this.nameResolver = nameResolver;
        this.typeTable = typeTable;
        this.versionRequirementTable = versionRequirementTable;
        this.containerSource = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public ClassDescriptor getClassDescriptor() {
        if (KotlinTypeKt.isError(getExpandedType())) {
            return null;
        }
        ClassifierDescriptor mo4153getDeclarationDescriptor = getExpandedType().getConstructor().mo4153getDeclarationDescriptor();
        if (mo4153getDeclarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) mo4153getDeclarationDescriptor;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public DeserializedContainerSource getContainerSource() {
        return this.containerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public SimpleType getDefaultType() {
        SimpleType simpleType = this.defaultTypeImpl;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("defaultTypeImpl");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public SimpleType getExpandedType() {
        SimpleType simpleType = this.expandedType;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("expandedType");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public NameResolver getNameResolver() {
        return this.nameResolver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor
    public final List getTypeConstructorTypeParameters() {
        List list = this.typeConstructorParameters;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("typeConstructorParameters");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public TypeTable getTypeTable() {
        return this.typeTable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public SimpleType getUnderlyingType() {
        SimpleType simpleType = this.underlyingType;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("underlyingType");
        throw null;
    }

    public VersionRequirementTable getVersionRequirementTable() {
        return this.versionRequirementTable;
    }

    public final void initialize(List<? extends TypeParameterDescriptor> list, SimpleType simpleType, SimpleType simpleType2) {
        MemberScope memberScope;
        list.getClass();
        simpleType.getClass();
        simpleType2.getClass();
        initialize(list);
        this.underlyingType = simpleType;
        this.expandedType = simpleType2;
        this.typeConstructorParameters = TypeParameterUtilsKt.computeConstructorTypeParameters(this);
        ClassDescriptor classDescriptor = getClassDescriptor();
        if (classDescriptor == null || (memberScope = classDescriptor.getUnsubstitutedMemberScope()) == null) {
            memberScope = MemberScope.Empty.INSTANCE;
        }
        SimpleType makeUnsubstitutedType = TypeUtils.makeUnsubstitutedType(this, memberScope, new KClasses$$Lambda$2(this, 29));
        makeUnsubstitutedType.getClass();
        this.defaultTypeImpl = makeUnsubstitutedType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public TypeAliasDescriptor substitute(TypeSubstitutor typeSubstitutor) {
        typeSubstitutor.getClass();
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        DeclarationDescriptor containingDeclaration = getContainingDeclaration();
        containingDeclaration.getClass();
        Annotations annotations = getAnnotations();
        annotations.getClass();
        Name name = getName();
        name.getClass();
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.storageManager, containingDeclaration, annotations, name, getVisibility(), getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource());
        List<TypeParameterDescriptor> declaredTypeParameters = getDeclaredTypeParameters();
        SimpleType underlyingType = getUnderlyingType();
        Variance variance = Variance.INVARIANT;
        KotlinType safeSubstitute = typeSubstitutor.safeSubstitute(underlyingType, variance);
        safeSubstitute.getClass();
        SimpleType asSimpleType = TypeSubstitutionKt.asSimpleType(safeSubstitute);
        KotlinType safeSubstitute2 = typeSubstitutor.safeSubstitute(getExpandedType(), variance);
        safeSubstitute2.getClass();
        deserializedTypeAliasDescriptor.initialize(declaredTypeParameters, asSimpleType, TypeSubstitutionKt.asSimpleType(safeSubstitute2));
        return deserializedTypeAliasDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public ProtoBuf.TypeAlias getProto() {
        return this.proto;
    }
}
