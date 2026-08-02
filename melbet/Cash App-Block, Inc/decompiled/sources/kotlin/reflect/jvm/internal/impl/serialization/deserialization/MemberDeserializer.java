package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes9.dex */
public final class MemberDeserializer {
    public final AnnotationDeserializer annotationDeserializer;
    public final DeserializationContext c;

    public MemberDeserializer(DeserializationContext deserializationContext) {
        deserializationContext.getClass();
        this.c = deserializationContext;
        this.annotationDeserializer = new AnnotationDeserializer(deserializationContext.getComponents().getModuleDescriptor(), deserializationContext.getComponents().getNotFoundClasses());
    }

    public static /* synthetic */ PropertyDescriptor loadProperty$default(MemberDeserializer memberDeserializer, ProtoBuf.Property property, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return memberDeserializer.loadProperty(property, z);
    }

    public final ProtoContainer asProtoContainer(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            FqName fqName = ((PackageFragmentDescriptor) declarationDescriptor).getFqName();
            DeserializationContext deserializationContext = this.c;
            return new ProtoContainer.Package(fqName, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), deserializationContext.getContainerSource());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization();
        }
        return null;
    }

    public final ArrayList contextReceivers(List list, List list2, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind) {
        MemberDeserializer memberDeserializer = this;
        DeserializationContext deserializationContext = memberDeserializer.c;
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        containingDeclaration.getClass();
        CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
        DeclarationDescriptor containingDeclaration2 = callableDescriptor.getContainingDeclaration();
        containingDeclaration2.getClass();
        ProtoContainer asProtoContainer = memberDeserializer.asProtoContainer(containingDeclaration2);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            ProtoBuf.Type type2 = (ProtoBuf.Type) obj;
            ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) CollectionsKt.getOrNull(i, list2);
            ReceiverParameterDescriptor createContextReceiverParameterForCallable = DescriptorFactory.createContextReceiverParameterForCallable(callableDescriptor, deserializationContext.getTypeDeserializer().type(type2), null, (asProtoContainer == null || !Flags.HAS_ANNOTATIONS.get((valueParameter == null || !valueParameter.hasFlags()) ? 0 : valueParameter.getFlags()).booleanValue()) ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(deserializationContext.getStorageManager(), new MemberDeserializer$$Lambda$5(memberDeserializer, asProtoContainer, extendableMessage, annotatedCallableKind, i, valueParameter, 1)), i);
            if (createContextReceiverParameterForCallable != null) {
                arrayList.add(createContextReceiverParameterForCallable);
            }
            memberDeserializer = this;
            i = i2;
        }
        return arrayList;
    }

    public final Annotations getAnnotations(GeneratedMessageLite.ExtendableMessage extendableMessage, int i, AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.HAS_ANNOTATIONS.get(i).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.c.getStorageManager(), new MemberDeserializer$$Lambda$2(this, extendableMessage, annotatedCallableKind, 0));
    }

    public final Annotations getPropertyFieldAnnotations(final ProtoBuf.Property property, final boolean z) {
        return !Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.c.getStorageManager(), new Function0(this, z, property) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$3
            public final MemberDeserializer arg$0;
            public final boolean arg$1;
            public final ProtoBuf.Property arg$2;

            {
                this.arg$0 = this;
                this.arg$1 = z;
                this.arg$2 = property;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                MemberDeserializer memberDeserializer = this.arg$0;
                DeserializationContext deserializationContext = memberDeserializer.c;
                ProtoContainer asProtoContainer = memberDeserializer.asProtoContainer(deserializationContext.getContainingDeclaration());
                if (asProtoContainer != null) {
                    boolean z2 = this.arg$1;
                    ProtoBuf.Property property2 = this.arg$2;
                    list = z2 ? CollectionsKt.toList(deserializationContext.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(asProtoContainer, property2)) : CollectionsKt.toList(deserializationContext.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(asProtoContainer, property2));
                } else {
                    list = null;
                }
                return list == null ? EmptyList.INSTANCE : list;
            }
        });
    }

    public final ClassConstructorDescriptor loadConstructor(ProtoBuf.Constructor constructor, boolean z) {
        constructor.getClass();
        DeserializationContext deserializationContext = this.c;
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        containingDeclaration.getClass();
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        int flags = constructor.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, getAnnotations(constructor, flags, annotatedCallableKind), z, CallableMemberDescriptor.Kind.DECLARATION, constructor, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), deserializationContext.getVersionRequirementTable(), deserializationContext.getContainerSource(), null, 1024, null);
        MemberDeserializer memberDeserializer = DeserializationContext.childContext$default(this.c, deserializedClassConstructorDescriptor, EmptyList.INSTANCE, null, null, null, null, 60, null).getMemberDeserializer();
        List valueParameterList = constructor.getValueParameterList();
        valueParameterList.getClass();
        deserializedClassConstructorDescriptor.initialize(memberDeserializer.valueParameters(valueParameterList, constructor, annotatedCallableKind), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(constructor.getFlags())));
        deserializedClassConstructorDescriptor.setReturnType(classDescriptor.getDefaultType());
        deserializedClassConstructorDescriptor.setExpect(classDescriptor.isExpect());
        deserializedClassConstructorDescriptor.setHasStableParameterNames(!Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES.get(constructor.getFlags()).booleanValue());
        return deserializedClassConstructorDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SimpleFunctionDescriptor loadFunction(ProtoBuf.Function function) {
        int i;
        KotlinType type2;
        function.getClass();
        if (function.hasFlags()) {
            i = function.getFlags();
        } else {
            int oldFlags = function.getOldFlags();
            i = ((oldFlags >> 8) << 6) + (oldFlags & 63);
        }
        int i2 = i;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations annotations = getAnnotations(function, i2, annotatedCallableKind);
        boolean hasReceiver = ProtoTypeTableUtilKt.hasReceiver(function);
        int i3 = 1;
        DeserializationContext deserializationContext = this.c;
        Annotations deserializedAnnotations = hasReceiver ? new DeserializedAnnotations(deserializationContext.getStorageManager(), new MemberDeserializer$$Lambda$2(this, function, annotatedCallableKind, i3)) : Annotations.Companion.getEMPTY();
        VersionRequirementTable empty = Intrinsics.areEqual(DescriptorUtilsKt.getFqNameSafe(deserializationContext.getContainingDeclaration()).child(NameResolverUtilKt.getName(deserializationContext.getNameResolver(), function.getName())), SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? VersionRequirementTable.Companion.getEMPTY() : deserializationContext.getVersionRequirementTable();
        Annotations annotations2 = deserializedAnnotations;
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        Name name = NameResolverUtilKt.getName(deserializationContext.getNameResolver(), function.getName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(containingDeclaration, 0 == true ? 1 : 0, annotations, name, ProtoEnumFlagsUtilsKt.memberKind(protoEnumFlags, Flags.MEMBER_KIND.get(i2)), function, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), empty, deserializationContext.getContainerSource(), null, 1024, null);
        List<ProtoBuf.TypeParameter> typeParameterList = function.getTypeParameterList();
        typeParameterList.getClass();
        DeserializationContext childContext$default = DeserializationContext.childContext$default(this.c, deserializedSimpleFunctionDescriptor, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf.Type receiverType = ProtoTypeTableUtilKt.receiverType(function, deserializationContext.getTypeTable());
        ReceiverParameterDescriptor createExtensionReceiverParameterForCallable = (receiverType == null || (type2 = childContext$default.getTypeDeserializer().type(receiverType)) == null) ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, type2, annotations2);
        DeclarationDescriptor containingDeclaration2 = deserializationContext.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration2 instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration2 : null;
        ReceiverParameterDescriptor thisAsReceiverParameter = classDescriptor != null ? classDescriptor.getThisAsReceiverParameter() : null;
        MemberDeserializer memberDeserializer = childContext$default.getMemberDeserializer();
        List<ProtoBuf.Type> contextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(function, deserializationContext.getTypeTable());
        List<ProtoBuf.ValueParameter> contextParameterList = function.getContextParameterList();
        contextParameterList.getClass();
        ArrayList contextReceivers = memberDeserializer.contextReceivers(contextReceiverTypes, contextParameterList, function, annotatedCallableKind);
        List<TypeParameterDescriptor> ownTypeParameters = childContext$default.getTypeDeserializer().getOwnTypeParameters();
        MemberDeserializer memberDeserializer2 = childContext$default.getMemberDeserializer();
        List valueParameterList = function.getValueParameterList();
        valueParameterList.getClass();
        List valueParameters = memberDeserializer2.valueParameters(valueParameterList, function, annotatedCallableKind);
        KotlinType type3 = childContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(function, deserializationContext.getTypeTable()));
        Modality modality = protoEnumFlags.modality(Flags.MODALITY.get(i2));
        DescriptorVisibility descriptorVisibility = ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(i2));
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        deserializedSimpleFunctionDescriptor.initialize(createExtensionReceiverParameterForCallable, thisAsReceiverParameter, contextReceivers, ownTypeParameters, valueParameters, type3, modality, descriptorVisibility, emptyMap);
        Boolean bool = Flags.IS_OPERATOR.get(i2);
        bool.getClass();
        deserializedSimpleFunctionDescriptor.setOperator(bool.booleanValue());
        Boolean bool2 = Flags.IS_INFIX.get(i2);
        bool2.getClass();
        deserializedSimpleFunctionDescriptor.setInfix(bool2.booleanValue());
        Boolean bool3 = Flags.IS_EXTERNAL_FUNCTION.get(i2);
        bool3.getClass();
        deserializedSimpleFunctionDescriptor.setExternal(bool3.booleanValue());
        Boolean bool4 = Flags.IS_INLINE.get(i2);
        bool4.getClass();
        deserializedSimpleFunctionDescriptor.setInline(bool4.booleanValue());
        Boolean bool5 = Flags.IS_TAILREC.get(i2);
        bool5.getClass();
        deserializedSimpleFunctionDescriptor.setTailrec(bool5.booleanValue());
        Boolean bool6 = Flags.IS_SUSPEND.get(i2);
        bool6.getClass();
        deserializedSimpleFunctionDescriptor.setSuspend(bool6.booleanValue());
        Boolean bool7 = Flags.IS_EXPECT_FUNCTION.get(i2);
        bool7.getClass();
        deserializedSimpleFunctionDescriptor.setExpect(bool7.booleanValue());
        deserializedSimpleFunctionDescriptor.setHasStableParameterNames(!Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES.get(i2).booleanValue());
        Pair<CallableDescriptor.UserDataKey<?>, Object> deserializeContractFromFunction = deserializationContext.getComponents().getContractDeserializer().deserializeContractFromFunction(function, deserializedSimpleFunctionDescriptor, deserializationContext.getTypeTable(), childContext$default.getTypeDeserializer());
        if (deserializeContractFromFunction != null) {
            deserializedSimpleFunctionDescriptor.putInUserDataMap((CallableDescriptor.UserDataKey) deserializeContractFromFunction.first, deserializeContractFromFunction.second);
        }
        return deserializedSimpleFunctionDescriptor;
    }

    public final PropertyDescriptor loadProperty(ProtoBuf.Property property, boolean z) {
        int i;
        Annotations annotations;
        boolean z2;
        Flags.FlagField<ProtoBuf.Visibility> flagField;
        Flags.FlagField<ProtoBuf.Modality> flagField2;
        ProtoEnumFlags protoEnumFlags;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        boolean z3;
        KotlinType type2;
        property.getClass();
        if (property.hasFlags()) {
            i = property.getFlags();
        } else {
            int oldFlags = property.getOldFlags();
            i = ((oldFlags >> 8) << 6) + (oldFlags & 63);
        }
        DeserializationContext deserializationContext = this.c;
        if (z) {
            Annotations.Companion companion = Annotations.Companion;
            List<ProtoBuf.Annotation> annotationList = property.getAnnotationList();
            annotationList.getClass();
            List<ProtoBuf.Annotation> list = annotationList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (ProtoBuf.Annotation annotation : list) {
                annotation.getClass();
                arrayList.add(this.annotationDeserializer.deserializeAnnotation(annotation, deserializationContext.getNameResolver()));
            }
            annotations = companion.create(arrayList);
        } else {
            annotations = null;
        }
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        if (annotations == null) {
            annotations = getAnnotations(property, i, AnnotatedCallableKind.PROPERTY);
        }
        ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.INSTANCE;
        Flags.FlagField<ProtoBuf.Modality> flagField3 = Flags.MODALITY;
        Modality modality = protoEnumFlags2.modality(flagField3.get(i));
        Flags.FlagField<ProtoBuf.Visibility> flagField4 = Flags.VISIBILITY;
        DescriptorVisibility descriptorVisibility = ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags2, flagField4.get(i));
        Boolean bool = Flags.IS_VAR.get(i);
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        Name name = NameResolverUtilKt.getName(deserializationContext.getNameResolver(), property.getName());
        CallableMemberDescriptor.Kind memberKind = ProtoEnumFlagsUtilsKt.memberKind(protoEnumFlags2, Flags.MEMBER_KIND.get(i));
        Boolean bool2 = Flags.IS_LATEINIT.get(i);
        bool2.getClass();
        boolean booleanValue2 = bool2.booleanValue();
        Boolean bool3 = Flags.IS_CONST.get(i);
        bool3.getClass();
        boolean booleanValue3 = bool3.booleanValue();
        Boolean bool4 = Flags.IS_EXTERNAL_PROPERTY.get(i);
        bool4.getClass();
        boolean booleanValue4 = bool4.booleanValue();
        Boolean bool5 = Flags.IS_DELEGATED.get(i);
        bool5.getClass();
        boolean booleanValue5 = bool5.booleanValue();
        Boolean bool6 = Flags.IS_EXPECT_PROPERTY.get(i);
        bool6.getClass();
        int i2 = i;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor = new DeserializedPropertyDescriptor(containingDeclaration, null, annotations, modality, descriptorVisibility, booleanValue, name, memberKind, booleanValue2, booleanValue3, booleanValue4, booleanValue5, bool6.booleanValue(), property, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), deserializationContext.getVersionRequirementTable(), deserializationContext.getContainerSource());
        List<ProtoBuf.TypeParameter> typeParameterList = property.getTypeParameterList();
        typeParameterList.getClass();
        DeserializationContext childContext$default = DeserializationContext.childContext$default(this.c, deserializedPropertyDescriptor, typeParameterList, null, null, null, null, 60, null);
        Boolean bool7 = Flags.HAS_GETTER.get(i2);
        bool7.getClass();
        boolean booleanValue6 = bool7.booleanValue();
        Annotations deserializedAnnotations = (booleanValue6 && ProtoTypeTableUtilKt.hasReceiver(property)) ? new DeserializedAnnotations(deserializationContext.getStorageManager(), new MemberDeserializer$$Lambda$2(this, property, AnnotatedCallableKind.PROPERTY_GETTER, 1)) : Annotations.Companion.getEMPTY();
        KotlinType type3 = childContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(property, deserializationContext.getTypeTable()));
        List<? extends TypeParameterDescriptor> ownTypeParameters = childContext$default.getTypeDeserializer().getOwnTypeParameters();
        DeclarationDescriptor containingDeclaration2 = deserializationContext.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration2 instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration2 : null;
        ReceiverParameterDescriptor thisAsReceiverParameter = classDescriptor != null ? classDescriptor.getThisAsReceiverParameter() : null;
        ProtoBuf.Type receiverType = ProtoTypeTableUtilKt.receiverType(property, deserializationContext.getTypeTable());
        ReceiverParameterDescriptor createExtensionReceiverParameterForCallable = (receiverType == null || (type2 = childContext$default.getTypeDeserializer().type(receiverType)) == null) ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedPropertyDescriptor, type2, deserializedAnnotations);
        MemberDeserializer memberDeserializer = childContext$default.getMemberDeserializer();
        List<ProtoBuf.Type> contextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(property, deserializationContext.getTypeTable());
        List<ProtoBuf.ValueParameter> contextParameterList = property.getContextParameterList();
        contextParameterList.getClass();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_GETTER;
        deserializedPropertyDescriptor.setType(type3, ownTypeParameters, thisAsReceiverParameter, createExtensionReceiverParameterForCallable, memberDeserializer.contextReceivers(contextReceiverTypes, contextParameterList, property, annotatedCallableKind));
        Boolean bool8 = Flags.HAS_ANNOTATIONS.get(i2);
        bool8.getClass();
        int accessorFlags = Flags.getAccessorFlags(bool8.booleanValue(), flagField4.get(i2), flagField3.get(i2), false, false, false);
        if (booleanValue6) {
            int getterFlags = property.hasGetterFlags() ? property.getGetterFlags() : accessorFlags;
            Boolean bool9 = Flags.IS_NOT_DEFAULT.get(getterFlags);
            bool9.getClass();
            boolean booleanValue7 = bool9.booleanValue();
            Boolean bool10 = Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags);
            bool10.getClass();
            boolean booleanValue8 = bool10.booleanValue();
            Boolean bool11 = Flags.IS_INLINE_ACCESSOR.get(getterFlags);
            bool11.getClass();
            boolean booleanValue9 = bool11.booleanValue();
            Annotations annotations2 = getAnnotations(property, getterFlags, annotatedCallableKind);
            if (booleanValue7) {
                z2 = true;
                flagField = flagField4;
                flagField2 = flagField3;
                protoEnumFlags = protoEnumFlags2;
                propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations2, protoEnumFlags2.modality(flagField3.get(getterFlags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags2, flagField4.get(getterFlags)), !booleanValue7, booleanValue8, booleanValue9, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
            } else {
                z2 = true;
                flagField = flagField4;
                flagField2 = flagField3;
                protoEnumFlags = protoEnumFlags2;
                propertyGetterDescriptorImpl = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotations2);
                propertyGetterDescriptorImpl.getClass();
            }
            propertyGetterDescriptorImpl.initialize(deserializedPropertyDescriptor.getReturnType());
        } else {
            z2 = true;
            flagField = flagField4;
            flagField2 = flagField3;
            protoEnumFlags = protoEnumFlags2;
            propertyGetterDescriptorImpl = null;
        }
        if (Flags.HAS_SETTER.get(i2).booleanValue()) {
            if (property.hasSetterFlags()) {
                accessorFlags = property.getSetterFlags();
            }
            int i3 = accessorFlags;
            Boolean bool12 = Flags.IS_NOT_DEFAULT.get(i3);
            bool12.getClass();
            boolean booleanValue10 = bool12.booleanValue();
            Boolean bool13 = Flags.IS_EXTERNAL_ACCESSOR.get(i3);
            bool13.getClass();
            boolean booleanValue11 = bool13.booleanValue();
            Boolean bool14 = Flags.IS_INLINE_ACCESSOR.get(i3);
            bool14.getClass();
            boolean booleanValue12 = bool14.booleanValue();
            AnnotatedCallableKind annotatedCallableKind2 = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotations3 = getAnnotations(property, i3, annotatedCallableKind2);
            if (booleanValue10) {
                propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl;
                PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotations3, protoEnumFlags.modality(flagField2.get(i3)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, flagField.get(i3)), !booleanValue10, booleanValue11, booleanValue12, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
                propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) CollectionsKt.single(DeserializationContext.childContext$default(childContext$default, propertySetterDescriptorImpl2, EmptyList.INSTANCE, null, null, null, null, 60, null).getMemberDeserializer().valueParameters(CollectionsKt__CollectionsJVMKt.listOf(property.getSetterValueParameter()), property, annotatedCallableKind2)));
            } else {
                propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl;
                PropertySetterDescriptorImpl createDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotations3, Annotations.Companion.getEMPTY());
                createDefaultSetter.getClass();
                propertySetterDescriptorImpl = createDefaultSetter;
            }
        } else {
            propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl;
            propertySetterDescriptorImpl = null;
        }
        int i4 = 0;
        if (Flags.HAS_CONSTANT.get(i2).booleanValue()) {
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new MemberDeserializer$$Lambda$0(this, property, deserializedPropertyDescriptor, i4));
        }
        DeclarationDescriptor containingDeclaration3 = deserializationContext.getContainingDeclaration();
        ClassDescriptor classDescriptor2 = containingDeclaration3 instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration3 : null;
        if ((classDescriptor2 != null ? classDescriptor2.getKind() : null) == ClassKind.ANNOTATION_CLASS) {
            z3 = z2;
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new MemberDeserializer$$Lambda$0(this, property, deserializedPropertyDescriptor, z3 ? 1 : 0));
        } else {
            z3 = z2;
        }
        deserializedPropertyDescriptor.initialize(propertyGetterDescriptorImpl2, propertySetterDescriptorImpl, new FieldDescriptorImpl(getPropertyFieldAnnotations(property, false), deserializedPropertyDescriptor), new FieldDescriptorImpl(getPropertyFieldAnnotations(property, z3), deserializedPropertyDescriptor));
        return deserializedPropertyDescriptor;
    }

    public final TypeAliasDescriptor loadTypeAlias(ProtoBuf.TypeAlias typeAlias) {
        typeAlias.getClass();
        Annotations.Companion companion = Annotations.Companion;
        List<ProtoBuf.Annotation> annotationList = typeAlias.getAnnotationList();
        annotationList.getClass();
        List<ProtoBuf.Annotation> list = annotationList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            DeserializationContext deserializationContext = this.c;
            if (!hasNext) {
                DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(deserializationContext.getStorageManager(), deserializationContext.getContainingDeclaration(), companion.create(arrayList), NameResolverUtilKt.getName(deserializationContext.getNameResolver(), typeAlias.getName()), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(typeAlias.getFlags())), typeAlias, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), deserializationContext.getVersionRequirementTable(), deserializationContext.getContainerSource());
                List<ProtoBuf.TypeParameter> typeParameterList = typeAlias.getTypeParameterList();
                typeParameterList.getClass();
                DeserializationContext childContext$default = DeserializationContext.childContext$default(this.c, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
                deserializedTypeAliasDescriptor.initialize(childContext$default.getTypeDeserializer().getOwnTypeParameters(), childContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.underlyingType(typeAlias, deserializationContext.getTypeTable()), false), childContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.expandedType(typeAlias, deserializationContext.getTypeTable()), false));
                return deserializedTypeAliasDescriptor;
            }
            ProtoBuf.Annotation annotation = (ProtoBuf.Annotation) it.next();
            annotation.getClass();
            arrayList.add(this.annotationDeserializer.deserializeAnnotation(annotation, deserializationContext.getNameResolver()));
        }
    }

    public final List valueParameters(List list, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind) {
        MemberDeserializer memberDeserializer = this;
        DeserializationContext deserializationContext = memberDeserializer.c;
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        containingDeclaration.getClass();
        CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
        DeclarationDescriptor containingDeclaration2 = callableDescriptor.getContainingDeclaration();
        containingDeclaration2.getClass();
        ProtoContainer asProtoContainer = memberDeserializer.asProtoContainer(containingDeclaration2);
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            KotlinType kotlinType = null;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            Annotations empty = (asProtoContainer == null || !Flags.HAS_ANNOTATIONS.get(flags).booleanValue()) ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(deserializationContext.getStorageManager(), new MemberDeserializer$$Lambda$5(memberDeserializer, asProtoContainer, extendableMessage, annotatedCallableKind, i, valueParameter, 0));
            Name name = NameResolverUtilKt.getName(deserializationContext.getNameResolver(), valueParameter.getName());
            KotlinType type2 = deserializationContext.getTypeDeserializer().type(ProtoTypeTableUtilKt.type(valueParameter, deserializationContext.getTypeTable()));
            Boolean bool = Flags.DECLARES_DEFAULT_VALUE.get(flags);
            bool.getClass();
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = Flags.IS_CROSSINLINE.get(flags);
            bool2.getClass();
            boolean booleanValue2 = bool2.booleanValue();
            Boolean bool3 = Flags.IS_NOINLINE.get(flags);
            bool3.getClass();
            boolean booleanValue3 = bool3.booleanValue();
            ProtoBuf.Type varargElementType = ProtoTypeTableUtilKt.varargElementType(valueParameter, deserializationContext.getTypeTable());
            if (varargElementType != null) {
                kotlinType = deserializationContext.getTypeDeserializer().type(varargElementType);
            }
            SourceElement sourceElement = SourceElement.NO_SOURCE;
            sourceElement.getClass();
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new ValueParameterDescriptorImpl(callableDescriptor, null, i, empty, name, type2, booleanValue, booleanValue2, booleanValue3, kotlinType, sourceElement));
            arrayList = arrayList2;
            i = i2;
            memberDeserializer = this;
        }
        return CollectionsKt.toList(arrayList);
    }
}
