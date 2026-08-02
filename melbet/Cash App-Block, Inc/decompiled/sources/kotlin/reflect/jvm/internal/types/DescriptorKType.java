package kotlin.reflect.jvm.internal.types;

import com.google.crypto.tink.subtle.PrfAesCmac;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.ReflectedLambdaFakeContainerSource;
import kotlin.reflect.jvm.internal.CreateKCallableVisitor;
import kotlin.reflect.jvm.internal.EmptyContainerForLocal;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.KTypeAliasImpl;
import kotlin.reflect.jvm.internal.KTypeParameterImpl;
import kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.LocalDelegatedPropertyFakeContainerSource;
import kotlin.reflect.jvm.internal.ReflectProperties$LazySoftVal;
import kotlin.reflect.jvm.internal.SystemPropertiesKt;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class DescriptorKType extends AbstractKType {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(DescriptorKType.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0), new PropertyReference1Impl(DescriptorKType.class, "arguments", "getArguments()Ljava/util/List;", 0)};
    public final ReflectProperties$LazySoftVal arguments$delegate;
    public final ReflectProperties$LazySoftVal classifier$delegate;
    public final boolean isAbbreviation;

    /* renamed from: type, reason: collision with root package name */
    public final KotlinType f1540type;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKType(KotlinType kotlinType, Function0 function0, boolean z) {
        super(function0);
        kotlinType.getClass();
        this.f1540type = kotlinType;
        this.isAbbreviation = z;
        this.classifier$delegate = TuplesKt.lazySoft(null, new DescriptorKType$$Lambda$0(this, 0));
        this.arguments$delegate = TuplesKt.lazySoft(null, new DescriptorKType$$Lambda$1(0, this, function0));
    }

    public final KClassifier convert(KotlinType kotlinType) {
        KDeclarationContainerImpl kDeclarationContainerImpl;
        Class<?> klass;
        KTypeParameterOwnerImpl kTypeParameterOwnerImpl;
        KotlinType type2;
        if (this.isAbbreviation) {
            ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
            NotFoundClasses.MockClassDescriptor mockClassDescriptor = mo4153getDeclarationDescriptor instanceof NotFoundClasses.MockClassDescriptor ? (NotFoundClasses.MockClassDescriptor) mo4153getDeclarationDescriptor : null;
            if (mockClassDescriptor != null) {
                return new KTypeAliasImpl(DescriptorUtilsKt.getFqNameSafe(mockClassDescriptor));
            }
        }
        ClassifierDescriptor mo4153getDeclarationDescriptor2 = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
        if (mo4153getDeclarationDescriptor2 instanceof ClassDescriptor) {
            Class<?> javaClass = UtilKt.toJavaClass((ClassDescriptor) mo4153getDeclarationDescriptor2);
            if (javaClass != null) {
                if (!KotlinBuiltIns.isArray(kotlinType)) {
                    if (TypeUtils.isNullableType(kotlinType)) {
                        return new KClassImpl(javaClass);
                    }
                    Class<?> primitiveByWrapper = ReflectClassUtilKt.getPrimitiveByWrapper(javaClass);
                    if (primitiveByWrapper != null) {
                        javaClass = primitiveByWrapper;
                    }
                    return new KClassImpl(javaClass);
                }
                TypeProjection typeProjection = (TypeProjection) CollectionsKt.singleOrNull((List) kotlinType.getArguments());
                if (typeProjection == null || (type2 = typeProjection.getType()) == null) {
                    return new KClassImpl(javaClass);
                }
                KClassifier convert = convert(TypeUtilsKt.makeNullable(type2));
                if (convert != null) {
                    return new KClassImpl(UtilKt.createArrayType(PapaEvent.getJavaObjectType(KTypesJvm.getJvmErasure(convert))));
                }
                f$$ExternalSyntheticLambda0.m$1(this, "Cannot determine classifier for array element type: ");
                return null;
            }
        } else if (mo4153getDeclarationDescriptor2 instanceof TypeParameterDescriptor) {
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) mo4153getDeclarationDescriptor2;
            DeclarationDescriptor containingDeclaration = typeParameterDescriptor.getContainingDeclaration();
            containingDeclaration.getClass();
            if (containingDeclaration instanceof ClassDescriptor) {
                kTypeParameterOwnerImpl = PrfAesCmac.toKClassImpl((ClassDescriptor) containingDeclaration);
            } else if (containingDeclaration instanceof CallableMemberDescriptor) {
                DeclarationDescriptor containingDeclaration2 = ((CallableMemberDescriptor) containingDeclaration).getContainingDeclaration();
                containingDeclaration2.getClass();
                if (containingDeclaration2 instanceof ClassDescriptor) {
                    kDeclarationContainerImpl = PrfAesCmac.toKClassImpl((ClassDescriptor) containingDeclaration2);
                } else {
                    DeserializedMemberDescriptor deserializedMemberDescriptor = containingDeclaration instanceof DeserializedMemberDescriptor ? (DeserializedMemberDescriptor) containingDeclaration : null;
                    if (deserializedMemberDescriptor == null) {
                        f$$ExternalSyntheticLambda0.m$1(containingDeclaration, "Non-class callable descriptor must be deserialized: ");
                        return null;
                    }
                    DeserializedContainerSource containerSource = deserializedMemberDescriptor.getContainerSource();
                    if (containerSource instanceof JvmPackagePartSource) {
                        JvmPackagePartSource jvmPackagePartSource = (JvmPackagePartSource) containerSource;
                        KotlinJvmBinaryClass knownJvmBinaryClass = jvmPackagePartSource.getKnownJvmBinaryClass();
                        ReflectKotlinClass reflectKotlinClass = knownJvmBinaryClass instanceof ReflectKotlinClass ? (ReflectKotlinClass) knownJvmBinaryClass : null;
                        if (reflectKotlinClass == null || (klass = reflectKotlinClass.getKlass()) == null) {
                            StringBuilder sb = new StringBuilder("Container of top-level deserialized member is not resolved: ");
                            sb.append(deserializedMemberDescriptor);
                            KotlinJvmBinaryClass knownJvmBinaryClass2 = jvmPackagePartSource.getKnownJvmBinaryClass();
                            sb.append(" (");
                            sb.append(knownJvmBinaryClass2);
                            throw new KotlinReflectionInternalError(sb.toString());
                        }
                        KDeclarationContainer orCreateKotlinPackage = Reflection.factory.getOrCreateKotlinPackage(klass);
                        orCreateKotlinPackage.getClass();
                        kDeclarationContainerImpl = (KPackageImpl) orCreateKotlinPackage;
                    } else if (containerSource instanceof LocalDelegatedPropertyFakeContainerSource) {
                        kDeclarationContainerImpl = ((LocalDelegatedPropertyFakeContainerSource) containerSource).container;
                    } else {
                        if (!(containerSource instanceof ReflectedLambdaFakeContainerSource)) {
                            f$$ExternalSyntheticLambda0.m$1(deserializedMemberDescriptor, "Container of deserialized member is not resolved: ");
                            return null;
                        }
                        kDeclarationContainerImpl = EmptyContainerForLocal.INSTANCE;
                    }
                }
                Object accept = containingDeclaration.accept(new CreateKCallableVisitor(kDeclarationContainerImpl), Unit.INSTANCE);
                accept.getClass();
                kTypeParameterOwnerImpl = (KTypeParameterOwnerImpl) accept;
            } else {
                f$$ExternalSyntheticLambda0.m$1(containingDeclaration, "Unknown type parameter container: ");
            }
            return new KTypeParameterImpl(kTypeParameterOwnerImpl, typeParameterDescriptor);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean equals(Object obj) {
        if (!SystemPropertiesKt.useK1Implementation) {
            return super.equals(obj);
        }
        if (!(obj instanceof DescriptorKType)) {
            return false;
        }
        DescriptorKType descriptorKType = (DescriptorKType) obj;
        return Intrinsics.areEqual(this.f1540type, descriptorKType.f1540type) && Intrinsics.areEqual(getClassifier(), descriptorKType.getClassifier()) && Intrinsics.areEqual(getArguments(), descriptorKType.getArguments());
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final KType getAbbreviation() {
        SimpleType abbreviation = SpecialTypesKt.getAbbreviation(this.f1540type);
        if (abbreviation != null) {
            return new DescriptorKType(abbreviation, this.computeJavaType, true);
        }
        return null;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return UtilKt.computeAnnotations(this.f1540type);
    }

    @Override // kotlin.reflect.KType
    public final List getArguments() {
        KProperty kProperty = $$delegatedProperties[1];
        Object invoke = this.arguments$delegate.invoke();
        invoke.getClass();
        return (List) invoke;
    }

    @Override // kotlin.reflect.KType
    public final KClassifier getClassifier() {
        KProperty kProperty = $$delegatedProperties[0];
        return (KClassifier) this.classifier$delegate.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final KClass getMutableCollectionClass() {
        ClassifierDescriptor mo4153getDeclarationDescriptor = this.f1540type.getConstructor().mo4153getDeclarationDescriptor();
        final ClassDescriptor classDescriptor = mo4153getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo4153getDeclarationDescriptor : null;
        if (classDescriptor == null || !JavaToKotlinClassMapper.INSTANCE.isMutable(classDescriptor)) {
            return null;
        }
        if (!SystemPropertiesKt.useK1Implementation) {
            FqName fqNameSafe = DescriptorUtilsKt.getFqNameSafe(classDescriptor);
            KClassifier classifier = getClassifier();
            classifier.getClass();
            return MutableCollectionKClassKt.getMutableCollectionKClass((KClass) classifier, fqNameSafe);
        }
        KClassifier classifier2 = getClassifier();
        classifier2.getClass();
        final int i = 0;
        final int i2 = 1;
        return new MutableCollectionKClass((KClass) classifier2, DescriptorUtilsKt.getFqNameSafe(classDescriptor).asString(), new Function1(classDescriptor, i) { // from class: kotlin.reflect.jvm.internal.types.DescriptorKType$$Lambda$2
            public final /* synthetic */ int $r8$classId;
            public final ClassDescriptor arg$0;

            {
                this.$r8$classId = i;
                this.arg$0 = classDescriptor;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = this.$r8$classId;
                ClassDescriptor classDescriptor2 = this.arg$0;
                MutableCollectionKClass mutableCollectionKClass = (MutableCollectionKClass) obj;
                switch (i3) {
                    case 0:
                        mutableCollectionKClass.getClass();
                        List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor2.getDeclaredTypeParameters();
                        declaredTypeParameters.getClass();
                        List<TypeParameterDescriptor> list = declaredTypeParameters;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        for (TypeParameterDescriptor typeParameterDescriptor : list) {
                            typeParameterDescriptor.getClass();
                            arrayList.add(new KTypeParameterImpl(mutableCollectionKClass, typeParameterDescriptor));
                        }
                        return arrayList;
                    default:
                        mutableCollectionKClass.getClass();
                        Collection<KotlinType> supertypes = classDescriptor2.getTypeConstructor().getSupertypes();
                        supertypes.getClass();
                        Collection<KotlinType> collection = supertypes;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
                        Iterator<T> it = collection.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new DescriptorKType((KotlinType) it.next(), null));
                        }
                        return arrayList2;
                }
            }
        }, new Function1(classDescriptor, i2) { // from class: kotlin.reflect.jvm.internal.types.DescriptorKType$$Lambda$2
            public final /* synthetic */ int $r8$classId;
            public final ClassDescriptor arg$0;

            {
                this.$r8$classId = i2;
                this.arg$0 = classDescriptor;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = this.$r8$classId;
                ClassDescriptor classDescriptor2 = this.arg$0;
                MutableCollectionKClass mutableCollectionKClass = (MutableCollectionKClass) obj;
                switch (i3) {
                    case 0:
                        mutableCollectionKClass.getClass();
                        List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor2.getDeclaredTypeParameters();
                        declaredTypeParameters.getClass();
                        List<TypeParameterDescriptor> list = declaredTypeParameters;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        for (TypeParameterDescriptor typeParameterDescriptor : list) {
                            typeParameterDescriptor.getClass();
                            arrayList.add(new KTypeParameterImpl(mutableCollectionKClass, typeParameterDescriptor));
                        }
                        return arrayList;
                    default:
                        mutableCollectionKClass.getClass();
                        Collection<KotlinType> supertypes = classDescriptor2.getTypeConstructor().getSupertypes();
                        supertypes.getClass();
                        Collection<KotlinType> collection = supertypes;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
                        Iterator<T> it = collection.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new DescriptorKType((KotlinType) it.next(), null));
                        }
                        return arrayList2;
                }
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final int hashCode() {
        if (!SystemPropertiesKt.useK1Implementation) {
            return super.hashCode();
        }
        int hashCode = this.f1540type.hashCode() * 31;
        KClassifier classifier = getClassifier();
        return getArguments().hashCode() + ((hashCode + (classifier != null ? classifier.hashCode() : 0)) * 31);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isDefinitelyNotNullType() {
        return SpecialTypesKt.isDefinitelyNotNullType(this.f1540type);
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return this.f1540type.isMarkedNullable();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isNothingType() {
        return KotlinBuiltIns.isNothingOrNullableNothing(this.f1540type);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isRawType() {
        return this.f1540type instanceof RawType;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isSuspendFunctionType() {
        return FunctionTypesKt.isSuspendFunctionType(this.f1540type);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final AbstractKType lowerBoundIfFlexible() {
        UnwrappedType unwrap2 = this.f1540type.unwrap();
        if (unwrap2 instanceof FlexibleType) {
            return new DescriptorKType(((FlexibleType) unwrap2).getLowerBound(), null);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final AbstractKType makeDefinitelyNotNullAsSpecified(boolean z) {
        SimpleType original;
        KotlinType kotlinType = this.f1540type;
        if (z) {
            original = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, kotlinType.unwrap(), true, false, 4, null);
            if (original == null) {
                return this;
            }
        } else {
            DefinitelyNotNullType definitelyNotNullType = kotlinType instanceof DefinitelyNotNullType ? (DefinitelyNotNullType) kotlinType : null;
            if (definitelyNotNullType == null || (original = definitelyNotNullType.getOriginal()) == null) {
                return this;
            }
        }
        return new DescriptorKType(original, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final AbstractKType makeNullableAsSpecified(boolean z) {
        KotlinType kotlinType = this.f1540type;
        if (!FlexibleTypesKt.isFlexible(kotlinType) && kotlinType.isMarkedNullable() == z) {
            return this;
        }
        KotlinType makeNullableAsSpecified = TypeUtils.makeNullableAsSpecified(kotlinType, z);
        makeNullableAsSpecified.getClass();
        return new DescriptorKType(makeNullableAsSpecified, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final AbstractKType upperBoundIfFlexible() {
        UnwrappedType unwrap2 = this.f1540type.unwrap();
        if (unwrap2 instanceof FlexibleType) {
            return new DescriptorKType(((FlexibleType) unwrap2).getUpperBound(), null);
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DescriptorKType(KotlinType kotlinType, Function0 function0) {
        this(kotlinType, function0, false);
        kotlinType.getClass();
    }
}
