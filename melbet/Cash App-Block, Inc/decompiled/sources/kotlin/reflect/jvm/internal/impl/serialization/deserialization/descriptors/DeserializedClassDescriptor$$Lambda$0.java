package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ValueClassUtilKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import okio.Path$$ExternalSyntheticBUOutline0;
import radiography.Radiography$renderScannableViewTree$1$2;

/* loaded from: classes9.dex */
public final class DeserializedClassDescriptor$$Lambda$0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final DeserializedClassDescriptor arg$0;

    public /* synthetic */ DeserializedClassDescriptor$$Lambda$0(DeserializedClassDescriptor deserializedClassDescriptor, int i) {
        this.$r8$classId = i;
        this.arg$0 = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        int i = this.$r8$classId;
        DeserializedClassDescriptor deserializedClassDescriptor = this.arg$0;
        switch (i) {
            case 0:
                if (deserializedClassDescriptor.kind.isSingleton()) {
                    ClassConstructorDescriptorImpl createPrimaryConstructorForObject = DescriptorFactory.createPrimaryConstructorForObject(deserializedClassDescriptor, SourceElement.NO_SOURCE);
                    createPrimaryConstructorForObject.setReturnType(deserializedClassDescriptor.getDefaultType());
                    return createPrimaryConstructorForObject;
                }
                List<ProtoBuf.Constructor> constructorList = deserializedClassDescriptor.classProto.getConstructorList();
                constructorList.getClass();
                Iterator<T> it = constructorList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (!Flags.IS_SECONDARY.get(((ProtoBuf.Constructor) obj).getFlags()).booleanValue()) {
                        }
                    } else {
                        obj = null;
                    }
                }
                ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) obj;
                if (constructor != null) {
                    return deserializedClassDescriptor.c.getMemberDeserializer().loadConstructor(constructor, true);
                }
                return null;
            case 1:
                DeserializationContext deserializationContext = deserializedClassDescriptor.c;
                List<ProtoBuf.Constructor> constructorList2 = deserializedClassDescriptor.classProto.getConstructorList();
                constructorList2.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : constructorList2) {
                    Boolean bool = Flags.IS_SECONDARY.get(((ProtoBuf.Constructor) obj2).getFlags());
                    bool.getClass();
                    if (bool.booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ProtoBuf.Constructor constructor2 = (ProtoBuf.Constructor) it2.next();
                    MemberDeserializer memberDeserializer = deserializationContext.getMemberDeserializer();
                    constructor2.getClass();
                    arrayList2.add(memberDeserializer.loadConstructor(constructor2, false));
                }
                return CollectionsKt.plus((Iterable) deserializationContext.getComponents().getAdditionalClassPartsProvider().getConstructors(deserializedClassDescriptor), (Collection) CollectionsKt.plus((Iterable) CollectionsKt__CollectionsKt.listOfNotNull(deserializedClassDescriptor.mo4142getUnsubstitutedPrimaryConstructor()), (Collection) arrayList2));
            case 2:
                ProtoBuf.Class r0 = deserializedClassDescriptor.classProto;
                if (!r0.hasCompanionObjectName()) {
                    return null;
                }
                ClassifierDescriptor mo4154getContributedClassifier = deserializedClassDescriptor.getMemberScope().mo4154getContributedClassifier(NameResolverUtilKt.getName(deserializedClassDescriptor.c.getNameResolver(), r0.getCompanionObjectName()), NoLookupLocation.FROM_DESERIALIZATION);
                if (mo4154getContributedClassifier instanceof ClassDescriptor) {
                    return (ClassDescriptor) mo4154getContributedClassifier;
                }
                return null;
            case 3:
                DeserializationContext deserializationContext2 = deserializedClassDescriptor.c;
                if (deserializedClassDescriptor.modality != Modality.SEALED) {
                    return EmptyList.INSTANCE;
                }
                List<Integer> sealedSubclassFqNameList = deserializedClassDescriptor.classProto.getSealedSubclassFqNameList();
                sealedSubclassFqNameList.getClass();
                if (sealedSubclassFqNameList.isEmpty()) {
                    return CliSealedClassInheritorsProvider.INSTANCE.computeSealedSubclasses(deserializedClassDescriptor, false);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Integer num : sealedSubclassFqNameList) {
                    DeserializationComponents components = deserializationContext2.getComponents();
                    NameResolver nameResolver = deserializationContext2.getNameResolver();
                    num.getClass();
                    ClassDescriptor deserializeClass = components.deserializeClass(NameResolverUtilKt.getClassId(nameResolver, num.intValue()));
                    if (deserializeClass != null) {
                        arrayList3.add(deserializeClass);
                    }
                }
                return arrayList3;
            case 4:
                DeserializedClassDescriptor deserializedClassDescriptor2 = this.arg$0;
                DeserializationContext deserializationContext3 = deserializedClassDescriptor2.c;
                if (!deserializedClassDescriptor2.isInline() && !deserializedClassDescriptor2.isValue()) {
                    return null;
                }
                boolean isAtLeast = deserializedClassDescriptor2.metadataVersion.isAtLeast(1, 5, 1);
                ValueClassRepresentation loadValueClassRepresentation = ValueClassUtilKt.loadValueClassRepresentation(deserializedClassDescriptor2.classProto, isAtLeast, deserializationContext3.getNameResolver(), deserializationContext3.getTypeTable(), new DeserializedClassDescriptor$computeValueClassRepresentation$1(1, 0, TypeDeserializer.class, deserializationContext3.getTypeDeserializer(), "simpleType", "simpleType(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;Z)Lorg/jetbrains/kotlin/types/SimpleType;"), new Radiography$renderScannableViewTree$1$2(1, deserializedClassDescriptor2, DeserializedClassDescriptor.class, "getValueClassPropertyType", "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;", 0, 4));
                if (loadValueClassRepresentation != null) {
                    return loadValueClassRepresentation;
                }
                if (isAtLeast) {
                    return null;
                }
                ClassConstructorDescriptor mo4142getUnsubstitutedPrimaryConstructor = deserializedClassDescriptor2.mo4142getUnsubstitutedPrimaryConstructor();
                if (mo4142getUnsubstitutedPrimaryConstructor == null) {
                    Path$$ExternalSyntheticBUOutline0.m$1(deserializedClassDescriptor2, "Inline class has no primary constructor: ");
                    return null;
                }
                List<ValueParameterDescriptor> valueParameters = mo4142getUnsubstitutedPrimaryConstructor.getValueParameters();
                valueParameters.getClass();
                Name name = ((ValueParameterDescriptor) CollectionsKt.first((List) valueParameters)).getName();
                name.getClass();
                SimpleType valueClassPropertyType = deserializedClassDescriptor2.getValueClassPropertyType(name);
                if (valueClassPropertyType != null) {
                    return new InlineClassRepresentation(name, valueClassPropertyType);
                }
                Path$$ExternalSyntheticBUOutline0.m$1(deserializedClassDescriptor2, "Value class has no underlying property: ");
                return null;
            case 5:
                return CollectionsKt.toList(deserializedClassDescriptor.c.getComponents().getAnnotationAndConstantLoader().loadClassAnnotations(deserializedClassDescriptor.thisAsProtoContainer));
            default:
                return TypeParameterUtilsKt.computeConstructorTypeParameters(deserializedClassDescriptor);
        }
    }
}
