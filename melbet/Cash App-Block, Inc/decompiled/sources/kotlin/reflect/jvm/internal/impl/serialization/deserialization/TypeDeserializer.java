package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionForAbsentTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TransformingSequence;
import kotlin.sequences.TransformingSequence$iterator$1;

/* loaded from: classes9.dex */
public final class TypeDeserializer {
    public final DeserializationContext c;
    public final MemoizedFunctionToNullable classifierDescriptors;
    public final String containerPresentableName;
    public final String debugName;
    public final TypeDeserializer parent;
    public final MemoizedFunctionToNullable typeAliasDescriptors;
    public final Map typeParameterDescriptors;

    public TypeDeserializer(DeserializationContext deserializationContext, TypeDeserializer typeDeserializer, List<ProtoBuf.TypeParameter> list, String str, String str2) {
        Map linkedHashMap;
        deserializationContext.getClass();
        list.getClass();
        str.getClass();
        str2.getClass();
        this.c = deserializationContext;
        this.parent = typeDeserializer;
        this.debugName = str;
        this.containerPresentableName = str2;
        int i = 0;
        this.classifierDescriptors = deserializationContext.getStorageManager().createMemoizedFunctionWithNullableValues(new TypeDeserializer$$Lambda$0(this, i));
        this.typeAliasDescriptors = deserializationContext.getStorageManager().createMemoizedFunctionWithNullableValues(new TypeDeserializer$$Lambda$0(this, 1));
        if (list.isEmpty()) {
            linkedHashMap = EmptyMap.INSTANCE;
            linkedHashMap.getClass();
        } else {
            linkedHashMap = new LinkedHashMap();
            for (ProtoBuf.TypeParameter typeParameter : list) {
                linkedHashMap.put(Integer.valueOf(typeParameter.getId()), new DeserializedTypeParameterDescriptor(this.c, typeParameter, i));
                i++;
            }
        }
        this.typeParameterDescriptors = linkedHashMap;
    }

    public static SimpleType createSimpleSuspendFunctionType(SimpleType simpleType, KotlinType kotlinType) {
        KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(simpleType);
        Annotations annotations = simpleType.getAnnotations();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(simpleType);
        List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(simpleType);
        List dropLast = CollectionsKt.dropLast(1, FunctionTypesKt.getValueParameterTypesFromFunctionType(simpleType));
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(dropLast, 10));
        Iterator it = dropLast.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, contextReceiverTypesFromFunctionType, arrayList, null, kotlinType, true).makeNullableAsSpecified(simpleType.isMarkedNullable());
    }

    public static final ArrayList simpleType$collectAllArguments(ProtoBuf.Type type2, TypeDeserializer typeDeserializer) {
        List<ProtoBuf.Type.Argument> argumentList = type2.getArgumentList();
        argumentList.getClass();
        List<ProtoBuf.Type.Argument> list = argumentList;
        ProtoBuf.Type outerType = ProtoTypeTableUtilKt.outerType(type2, typeDeserializer.c.getTypeTable());
        Iterable simpleType$collectAllArguments = outerType != null ? simpleType$collectAllArguments(outerType, typeDeserializer) : null;
        if (simpleType$collectAllArguments == null) {
            simpleType$collectAllArguments = EmptyList.INSTANCE;
        }
        return CollectionsKt.plus(simpleType$collectAllArguments, (Collection) list);
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeDeserializer typeDeserializer, ProtoBuf.Type type2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return typeDeserializer.simpleType(type2, z);
    }

    public static TypeAttributes toAttributes(List list, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeAttributeTranslator) it.next()).toAttributes(annotations, typeConstructor, declarationDescriptor));
        }
        return TypeAttributes.Companion.create(CollectionsKt__IterablesKt.flatten(arrayList));
    }

    public static final ClassDescriptor typeConstructor$notFoundClass(TypeDeserializer typeDeserializer, ProtoBuf.Type type2, int i) {
        DeserializationContext deserializationContext = typeDeserializer.c;
        ClassId classId = NameResolverUtilKt.getClassId(deserializationContext.getNameResolver(), i);
        TransformingSequence map = SequencesKt___SequencesKt.map(SequencesKt__SequencesKt.generateSequence(new TypeDeserializer$$Lambda$0(typeDeserializer, 2), type2), TypeDeserializer$$Lambda$4.INSTANCE);
        ArrayList arrayList = new ArrayList();
        Iterator it = map.iterator();
        while (true) {
            TransformingSequence$iterator$1 transformingSequence$iterator$1 = (TransformingSequence$iterator$1) it;
            if (!transformingSequence$iterator$1.hasNext()) {
                break;
            }
            arrayList.add(transformingSequence$iterator$1.next());
        }
        int count = SequencesKt___SequencesKt.count(SequencesKt__SequencesKt.generateSequence(TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1.INSTANCE, classId));
        while (arrayList.size() < count) {
            arrayList.add(0);
        }
        return deserializationContext.getComponents().getNotFoundClasses().getClass(classId, arrayList);
    }

    public final List<TypeParameterDescriptor> getOwnTypeParameters() {
        return CollectionsKt.toList(this.typeParameterDescriptors.values());
    }

    public final TypeParameterDescriptor loadTypeParameter(int i) {
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) this.typeParameterDescriptors.get(Integer.valueOf(i));
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        TypeDeserializer typeDeserializer = this.parent;
        if (typeDeserializer != null) {
            return typeDeserializer.loadTypeParameter(i);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x02dc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9, r10) == false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SimpleType simpleType(ProtoBuf.Type type2, boolean z) {
        SimpleType replacementTypeForLocalClassifiers;
        TypeConstructor createErrorTypeConstructor;
        ClassifierDescriptor classifierDescriptor;
        Object obj;
        TypeConstructor typeConstructor;
        SimpleType simpleType;
        TypeProjection typeProjection;
        KotlinType type3;
        FqName fqName;
        int size;
        SimpleType withAbbreviation;
        TypeProjectionBase typeProjectionImpl;
        TypeProjectionBase typeProjectionBase;
        type2.getClass();
        boolean hasClassName = type2.hasClassName();
        SimpleType simpleType2 = null;
        simpleType2 = null;
        simpleType2 = null;
        simpleType2 = null;
        simpleType2 = null;
        DeserializationContext deserializationContext = this.c;
        if (hasClassName) {
            if (NameResolverUtilKt.getClassId(deserializationContext.getNameResolver(), type2.getClassName()).isLocal()) {
                replacementTypeForLocalClassifiers = deserializationContext.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
            }
            replacementTypeForLocalClassifiers = null;
        } else {
            if (type2.hasTypeAliasName()) {
                if (NameResolverUtilKt.getClassId(deserializationContext.getNameResolver(), type2.getTypeAliasName()).isLocal()) {
                    replacementTypeForLocalClassifiers = deserializationContext.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
                }
            }
            replacementTypeForLocalClassifiers = null;
        }
        if (replacementTypeForLocalClassifiers != null) {
            return replacementTypeForLocalClassifiers;
        }
        if (type2.hasClassName()) {
            classifierDescriptor = (ClassifierDescriptor) this.classifierDescriptors.invoke(Integer.valueOf(type2.getClassName()));
            if (classifierDescriptor == null) {
                classifierDescriptor = typeConstructor$notFoundClass(this, type2, type2.getClassName());
            }
        } else if (type2.hasTypeParameter()) {
            classifierDescriptor = loadTypeParameter(type2.getTypeParameter());
            if (classifierDescriptor == null) {
                createErrorTypeConstructor = ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(type2.getTypeParameter()), this.containerPresentableName);
                typeConstructor = createErrorTypeConstructor;
                if (!ErrorUtils.isError(typeConstructor.mo4153getDeclarationDescriptor())) {
                    return ErrorUtils.INSTANCE.createErrorType(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, typeConstructor, typeConstructor.toString());
                }
                DeserializedAnnotations deserializedAnnotations = new DeserializedAnnotations(deserializationContext.getStorageManager(), new KClassImpl$Data$$Lambda$22(26, this, type2));
                TypeAttributes attributes = toAttributes(deserializationContext.getComponents().getTypeAttributeTranslators(), deserializedAnnotations, typeConstructor, deserializationContext.getContainingDeclaration());
                ArrayList simpleType$collectAllArguments = simpleType$collectAllArguments(type2, this);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(simpleType$collectAllArguments, 10));
                Iterator it = simpleType$collectAllArguments.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    ProtoBuf.Type.Argument argument = (ProtoBuf.Type.Argument) next;
                    List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
                    parameters.getClass();
                    TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.getOrNull(i, parameters);
                    if (argument.getProjection() != ProtoBuf.Type.Argument.Projection.STAR) {
                        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
                        ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
                        projection.getClass();
                        Variance variance = protoEnumFlags.variance(projection);
                        ProtoBuf.Type type4 = ProtoTypeTableUtilKt.type(argument, deserializationContext.getTypeTable());
                        if (type4 == null) {
                            typeProjectionImpl = new TypeProjectionImpl(ErrorUtils.createErrorType(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString()));
                        } else {
                            typeProjectionBase = new TypeProjectionImpl(variance, type(type4));
                            typeProjectionImpl = typeProjectionBase;
                        }
                    } else if (typeParameterDescriptor == null) {
                        typeProjectionImpl = new StarProjectionForAbsentTypeParameter(deserializationContext.getComponents().getModuleDescriptor().getBuiltIns());
                    } else {
                        typeProjectionBase = new StarProjectionImpl(typeParameterDescriptor);
                        typeProjectionImpl = typeProjectionBase;
                    }
                    arrayList.add(typeProjectionImpl);
                    i = i2;
                }
                List<? extends TypeProjection> list = CollectionsKt.toList(arrayList);
                ClassifierDescriptor mo4153getDeclarationDescriptor = typeConstructor.mo4153getDeclarationDescriptor();
                boolean z2 = true;
                if (z && (mo4153getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
                    SimpleType computeExpandedType = KotlinTypeFactory.computeExpandedType((TypeAliasDescriptor) mo4153getDeclarationDescriptor, list);
                    TypeAttributes attributes2 = toAttributes(deserializationContext.getComponents().getTypeAttributeTranslators(), Annotations.Companion.create(CollectionsKt.plus((Iterable) deserializedAnnotations, (Iterable) computeExpandedType.getAnnotations())), typeConstructor, deserializationContext.getContainingDeclaration());
                    if (!KotlinTypeKt.isNullable(computeExpandedType) && !type2.getNullable()) {
                        z2 = false;
                    }
                    simpleType = computeExpandedType.makeNullableAsSpecified(z2).replaceAttributes(attributes2);
                } else if (Flags.SUSPEND_TYPE.get(type2.getFlags()).booleanValue()) {
                    boolean nullable = type2.getNullable();
                    int size2 = typeConstructor.getParameters().size() - list.size();
                    if (size2 == 0) {
                        SimpleType simpleType$default = KotlinTypeFactory.simpleType$default(attributes, typeConstructor, list, nullable, (KotlinTypeRefiner) null, 16, (Object) null);
                        if (FunctionTypesKt.isFunctionType(simpleType$default) && (typeProjection = (TypeProjection) CollectionsKt.lastOrNull((List) FunctionTypesKt.getValueParameterTypesFromFunctionType(simpleType$default))) != null && (type3 = typeProjection.getType()) != null) {
                            ClassifierDescriptor mo4153getDeclarationDescriptor2 = type3.getConstructor().mo4153getDeclarationDescriptor();
                            FqName fqNameSafe = mo4153getDeclarationDescriptor2 != null ? DescriptorUtilsKt.getFqNameSafe(mo4153getDeclarationDescriptor2) : null;
                            if (type3.getArguments().size() == 1) {
                                if (!Intrinsics.areEqual(fqNameSafe, StandardNames.CONTINUATION_INTERFACE_FQ_NAME)) {
                                    fqName = TypeDeserializerKt.EXPERIMENTAL_CONTINUATION_FQ_NAME;
                                }
                                KotlinType type5 = ((TypeProjection) CollectionsKt.single((List) type3.getArguments())).getType();
                                type5.getClass();
                                DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
                                CallableDescriptor callableDescriptor = containingDeclaration instanceof CallableDescriptor ? (CallableDescriptor) containingDeclaration : null;
                                simpleType2 = Intrinsics.areEqual(callableDescriptor != null ? DescriptorUtilsKt.fqNameOrNull(callableDescriptor) : null, SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? createSimpleSuspendFunctionType(simpleType$default, type5) : createSimpleSuspendFunctionType(simpleType$default, type5);
                            }
                            simpleType2 = simpleType$default;
                        }
                    } else if (size2 == 1 && (size = list.size() - 1) >= 0) {
                        TypeConstructor typeConstructor2 = typeConstructor.getBuiltIns().getSuspendFunction(size).getTypeConstructor();
                        typeConstructor2.getClass();
                        simpleType2 = KotlinTypeFactory.simpleType$default(attributes, typeConstructor2, list, nullable, (KotlinTypeRefiner) null, 16, (Object) null);
                    }
                    simpleType = simpleType2 == null ? ErrorUtils.INSTANCE.createErrorTypeWithArguments(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list, typeConstructor, new String[0]) : simpleType2;
                } else {
                    SimpleType simpleType$default2 = KotlinTypeFactory.simpleType$default(attributes, typeConstructor, list, type2.getNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
                    if (Flags.DEFINITELY_NOT_NULL_TYPE.get(type2.getFlags()).booleanValue()) {
                        simpleType = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleType$default2, true, false, 4, null);
                        if (simpleType == null) {
                            a$$ExternalSyntheticBUOutline0.m$1(simpleType$default2, "null DefinitelyNotNullType for '");
                            return null;
                        }
                    } else {
                        simpleType = simpleType$default2;
                    }
                }
                ProtoBuf.Type abbreviatedType = ProtoTypeTableUtilKt.abbreviatedType(type2, deserializationContext.getTypeTable());
                return (abbreviatedType == null || (withAbbreviation = SpecialTypesKt.withAbbreviation(simpleType, simpleType(abbreviatedType, false))) == null) ? simpleType : withAbbreviation;
            }
        } else if (type2.hasTypeParameterName()) {
            String string2 = deserializationContext.getNameResolver().getString(type2.getTypeParameterName());
            Iterator<T> it2 = getOwnTypeParameters().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual(((TypeParameterDescriptor) obj).getName().asString(), string2)) {
                    break;
                }
            }
            TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor) obj;
            if (typeParameterDescriptor2 == null) {
                createErrorTypeConstructor = ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string2, deserializationContext.getContainingDeclaration().toString());
                typeConstructor = createErrorTypeConstructor;
                if (!ErrorUtils.isError(typeConstructor.mo4153getDeclarationDescriptor())) {
                }
            } else {
                classifierDescriptor = typeParameterDescriptor2;
            }
        } else if (type2.hasTypeAliasName()) {
            classifierDescriptor = (ClassifierDescriptor) this.typeAliasDescriptors.invoke(Integer.valueOf(type2.getTypeAliasName()));
            if (classifierDescriptor == null) {
                classifierDescriptor = typeConstructor$notFoundClass(this, type2, type2.getTypeAliasName());
            }
        } else {
            createErrorTypeConstructor = ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
            typeConstructor = createErrorTypeConstructor;
            if (!ErrorUtils.isError(typeConstructor.mo4153getDeclarationDescriptor())) {
            }
        }
        createErrorTypeConstructor = classifierDescriptor.getTypeConstructor();
        createErrorTypeConstructor.getClass();
        typeConstructor = createErrorTypeConstructor;
        if (!ErrorUtils.isError(typeConstructor.mo4153getDeclarationDescriptor())) {
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.debugName);
        TypeDeserializer typeDeserializer = this.parent;
        if (typeDeserializer == null) {
            str = "";
        } else {
            str = ". Child of " + typeDeserializer.debugName;
        }
        sb.append(str);
        return sb.toString();
    }

    public final KotlinType type(ProtoBuf.Type type2) {
        type2.getClass();
        if (!type2.hasFlexibleTypeCapabilitiesId()) {
            return simpleType(type2, true);
        }
        DeserializationContext deserializationContext = this.c;
        String string2 = deserializationContext.getNameResolver().getString(type2.getFlexibleTypeCapabilitiesId());
        SimpleType simpleType$default = simpleType$default(this, type2, false, 2, null);
        ProtoBuf.Type flexibleUpperBound = ProtoTypeTableUtilKt.flexibleUpperBound(type2, deserializationContext.getTypeTable());
        flexibleUpperBound.getClass();
        return deserializationContext.getComponents().getFlexibleTypeDeserializer().create(type2, string2, simpleType$default, simpleType$default(this, flexibleUpperBound, false, 2, null));
    }
}
