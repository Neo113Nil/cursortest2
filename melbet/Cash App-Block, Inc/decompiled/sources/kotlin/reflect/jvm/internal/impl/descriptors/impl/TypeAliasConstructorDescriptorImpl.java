package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes9.dex */
public final class TypeAliasConstructorDescriptorImpl extends FunctionDescriptorImpl implements TypeAliasConstructorDescriptor {
    public static final Companion Companion = new Companion(null);
    public final StorageManager storageManager;
    public final TypeAliasDescriptor typeAliasDescriptor;
    public ClassConstructorDescriptor underlyingConstructorDescriptor;
    public final NullableLazyValue withDispatchReceiver$delegate;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final TypeSubstitutor access$getTypeSubstitutorForUnderlyingClass(Companion companion, TypeAliasDescriptor typeAliasDescriptor) {
            companion.getClass();
            if (typeAliasDescriptor.getClassDescriptor() == null) {
                return null;
            }
            return TypeSubstitutor.create(typeAliasDescriptor.getExpandedType());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public final TypeAliasConstructorDescriptor createIfAvailable(StorageManager storageManager, TypeAliasDescriptor typeAliasDescriptor, ClassConstructorDescriptor classConstructorDescriptor) {
            ClassConstructorDescriptor substitute;
            List<ReceiverParameterDescriptor> list;
            storageManager.getClass();
            typeAliasDescriptor.getClass();
            classConstructorDescriptor.getClass();
            TypeSubstitutor create = typeAliasDescriptor.getClassDescriptor() == null ? null : TypeSubstitutor.create(typeAliasDescriptor.getExpandedType());
            if (create != null && (substitute = classConstructorDescriptor.substitute(create)) != null) {
                Annotations annotations = classConstructorDescriptor.getAnnotations();
                CallableMemberDescriptor.Kind kind = classConstructorDescriptor.getKind();
                kind.getClass();
                SourceElement source = typeAliasDescriptor.getSource();
                source.getClass();
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = new TypeAliasConstructorDescriptorImpl(storageManager, typeAliasDescriptor, substitute, null, annotations, kind, source, null);
                List<ValueParameterDescriptor> substitutedValueParameters = FunctionDescriptorImpl.getSubstitutedValueParameters(typeAliasConstructorDescriptorImpl, classConstructorDescriptor.getValueParameters(), create);
                if (substitutedValueParameters != null) {
                    SimpleType lowerIfFlexible = FlexibleTypesKt.lowerIfFlexible(substitute.getReturnType().unwrap());
                    SimpleType defaultType = typeAliasDescriptor.getDefaultType();
                    defaultType.getClass();
                    SimpleType withAbbreviation = SpecialTypesKt.withAbbreviation(lowerIfFlexible, defaultType);
                    ReceiverParameterDescriptor dispatchReceiverParameter = classConstructorDescriptor.getDispatchReceiverParameter();
                    ReceiverParameterDescriptor createExtensionReceiverParameterForCallable = dispatchReceiverParameter != null ? DescriptorFactory.createExtensionReceiverParameterForCallable(typeAliasConstructorDescriptorImpl, create.safeSubstitute(dispatchReceiverParameter.getType(), Variance.INVARIANT), Annotations.Companion.getEMPTY()) : null;
                    ClassDescriptor classDescriptor = typeAliasDescriptor.getClassDescriptor();
                    if (classDescriptor != null) {
                        List<ReceiverParameterDescriptor> contextReceiverParameters = classConstructorDescriptor.getContextReceiverParameters();
                        contextReceiverParameters.getClass();
                        List<ReceiverParameterDescriptor> list2 = contextReceiverParameters;
                        list = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        int i = 0;
                        for (Object obj : list2) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            ReceiverParameterDescriptor receiverParameterDescriptor = (ReceiverParameterDescriptor) obj;
                            KotlinType safeSubstitute = create.safeSubstitute(receiverParameterDescriptor.getType(), Variance.INVARIANT);
                            ReceiverValue value = receiverParameterDescriptor.getValue();
                            value.getClass();
                            list.add(DescriptorFactory.createContextReceiverParameterForClass(classDescriptor, safeSubstitute, ((ImplicitContextReceiver) value).getCustomLabelName(), Annotations.Companion.getEMPTY(), i));
                            i = i2;
                        }
                    } else {
                        list = EmptyList.INSTANCE;
                    }
                    typeAliasConstructorDescriptorImpl.initialize(createExtensionReceiverParameterForCallable, null, list, typeAliasDescriptor.getDeclaredTypeParameters(), substitutedValueParameters, withAbbreviation, Modality.FINAL, typeAliasDescriptor.getVisibility());
                    return typeAliasConstructorDescriptorImpl;
                }
            }
            return null;
        }
    }

    public TypeAliasConstructorDescriptorImpl(StorageManager storageManager, TypeAliasDescriptor typeAliasDescriptor, ClassConstructorDescriptor classConstructorDescriptor, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, Annotations annotations, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(typeAliasDescriptor, typeAliasConstructorDescriptor, kind, SpecialNames.INIT, annotations, sourceElement);
        this.storageManager = storageManager;
        this.typeAliasDescriptor = typeAliasDescriptor;
        setActual(getTypeAliasDescriptor().isActual());
        this.withDispatchReceiver$delegate = storageManager.createNullableLazyValue(new KClassImpl$Data$$Lambda$22(19, this, classConstructorDescriptor));
        this.underlyingConstructorDescriptor = classConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public TypeAliasConstructorDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z) {
        declarationDescriptor.getClass();
        modality.getClass();
        descriptorVisibility.getClass();
        kind.getClass();
        FunctionDescriptor build = newCopyBuilder().setOwner(declarationDescriptor).setModality(modality).setVisibility(descriptorVisibility).setKind(kind).setCopyOverrides(z).build();
        build.getClass();
        return (TypeAliasConstructorDescriptor) build;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        declarationDescriptor.getClass();
        kind.getClass();
        annotations.getClass();
        sourceElement.getClass();
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind != kind2) {
            CallableMemberDescriptor.Kind kind3 = CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return new TypeAliasConstructorDescriptorImpl(this.storageManager, getTypeAliasDescriptor(), getUnderlyingConstructorDescriptor(), this, annotations, kind2, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public ClassDescriptor getConstructedClass() {
        ClassDescriptor constructedClass = getUnderlyingConstructorDescriptor().getConstructedClass();
        constructedClass.getClass();
        return constructedClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public TypeAliasConstructorDescriptor getOriginal() {
        FunctionDescriptor original = super.getOriginal();
        original.getClass();
        return (TypeAliasConstructorDescriptor) original;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        KotlinType returnType = super.getReturnType();
        returnType.getClass();
        return returnType;
    }

    public TypeAliasDescriptor getTypeAliasDescriptor() {
        return this.typeAliasDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor
    public ClassConstructorDescriptor getUnderlyingConstructorDescriptor() {
        return this.underlyingConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public boolean isPrimary() {
        return getUnderlyingConstructorDescriptor().isPrimary();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public TypeAliasConstructorDescriptor substitute(TypeSubstitutor typeSubstitutor) {
        typeSubstitutor.getClass();
        FunctionDescriptor substitute = super.substitute(typeSubstitutor);
        substitute.getClass();
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) substitute;
        TypeSubstitutor create = TypeSubstitutor.create(typeAliasConstructorDescriptorImpl.getReturnType());
        create.getClass();
        ClassConstructorDescriptor substitute2 = getUnderlyingConstructorDescriptor().getOriginal().substitute(create);
        if (substitute2 == null) {
            return null;
        }
        typeAliasConstructorDescriptorImpl.underlyingConstructorDescriptor = substitute2;
        return typeAliasConstructorDescriptorImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public TypeAliasDescriptor getContainingDeclaration() {
        return getTypeAliasDescriptor();
    }

    public /* synthetic */ TypeAliasConstructorDescriptorImpl(StorageManager storageManager, TypeAliasDescriptor typeAliasDescriptor, ClassConstructorDescriptor classConstructorDescriptor, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, Annotations annotations, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, typeAliasDescriptor, classConstructorDescriptor, typeAliasConstructorDescriptor, annotations, kind, sourceElement);
    }
}
