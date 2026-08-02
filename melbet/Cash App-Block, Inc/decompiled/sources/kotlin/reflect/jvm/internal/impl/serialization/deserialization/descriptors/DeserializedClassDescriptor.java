package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.stripe.android.uicore.elements.OTPController$special$$inlined$combineAsStateFlow$2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDeclarationsFromSupertypeConflictDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes9.dex */
public final class DeserializedClassDescriptor extends AbstractClassDescriptor implements DeserializedDescriptor {
    public final Annotations annotations;
    public final DeserializationContext c;
    public final ClassId classId;
    public final ProtoBuf.Class classProto;
    public final NullableLazyValue companionObjectDescriptor;
    public final NotNullLazyValue constructors;
    public final DeclarationDescriptor containingDeclaration;
    public final EnumEntryClassDescriptors enumEntries;
    public final ClassKind kind;
    public final ScopesHolderForClass memberScopeHolder;
    public final BinaryVersion metadataVersion;
    public final Modality modality;
    public final NullableLazyValue primaryConstructor;
    public final NotNullLazyValue sealedSubclasses;
    public final SourceElement sourceElement;
    public final MemberScopeImpl staticScope;
    public final ProtoContainer.Class thisAsProtoContainer;
    public final DeserializedClassTypeConstructor typeConstructor;
    public final NullableLazyValue valueClassRepresentation;
    public final DescriptorVisibility visibility;

    public final class DeserializedClassMemberScope extends DeserializedMemberScope {
        public final NotNullLazyValue allDescriptors;
        public final KotlinTypeRefiner kotlinTypeRefiner;
        public final NotNullLazyValue refinedSupertypes;
        public final /* synthetic */ DeserializedClassDescriptor this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DeserializedClassMemberScope(DeserializedClassDescriptor deserializedClassDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
            super(r1, r2, r3, r4, new OTPController$special$$inlined$combineAsStateFlow$2(2, r5));
            kotlinTypeRefiner.getClass();
            this.this$0 = deserializedClassDescriptor;
            DeserializationContext c = deserializedClassDescriptor.getC();
            List<ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
            functionList.getClass();
            List<ProtoBuf.Property> propertyList = deserializedClassDescriptor.getClassProto().getPropertyList();
            propertyList.getClass();
            List<ProtoBuf.TypeAlias> typeAliasList = deserializedClassDescriptor.getClassProto().getTypeAliasList();
            typeAliasList.getClass();
            List<Integer> nestedClassNameList = deserializedClassDescriptor.getClassProto().getNestedClassNameList();
            nestedClassNameList.getClass();
            List<Integer> list = nestedClassNameList;
            NameResolver nameResolver = deserializedClassDescriptor.getC().getNameResolver();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(NameResolverUtilKt.getName(nameResolver, ((Number) it.next()).intValue()));
            }
            this.kotlinTypeRefiner = kotlinTypeRefiner;
            final int i = 0;
            this.allDescriptors = getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$$Lambda$1
                public final DeserializedClassDescriptor.DeserializedClassMemberScope arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = i;
                    DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope = this.arg$0;
                    switch (i2) {
                        case 0:
                            return deserializedClassMemberScope.computeDescriptors(DescriptorKindFilter.ALL, MemberScope.Companion.getALL_NAME_FILTER(), NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                        default:
                            return deserializedClassMemberScope.kotlinTypeRefiner.refineSupertypes(deserializedClassMemberScope.this$0);
                    }
                }
            });
            final int i2 = 1;
            this.refinedSupertypes = getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$$Lambda$1
                public final DeserializedClassDescriptor.DeserializedClassMemberScope arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i2;
                    DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope = this.arg$0;
                    switch (i22) {
                        case 0:
                            return deserializedClassMemberScope.computeDescriptors(DescriptorKindFilter.ALL, MemberScope.Companion.getALL_NAME_FILTER(), NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                        default:
                            return deserializedClassMemberScope.kotlinTypeRefiner.refineSupertypes(deserializedClassMemberScope.this$0);
                    }
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final void addEnumEntryDescriptors(ArrayList arrayList, Function1 function1) {
            ?? r0;
            function1.getClass();
            EnumEntryClassDescriptors enumEntryClassDescriptors = this.this$0.enumEntries;
            if (enumEntryClassDescriptors != null) {
                Set<Name> keySet = enumEntryClassDescriptors.enumEntryProtos.keySet();
                r0 = new ArrayList();
                for (Name name : keySet) {
                    name.getClass();
                    ClassDescriptor classDescriptor = (ClassDescriptor) enumEntryClassDescriptors.enumEntryByName.invoke(name);
                    if (classDescriptor != null) {
                        r0.add(classDescriptor);
                    }
                }
            } else {
                r0 = 0;
            }
            if (r0 == 0) {
                r0 = EmptyList.INSTANCE;
            }
            arrayList.addAll(r0);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final void computeNonDeclaredFunctions(Name name, ArrayList arrayList) {
            name.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Collection) this.refinedSupertypes.invoke()).iterator();
            while (it.hasNext()) {
                arrayList2.addAll(((KotlinType) it.next()).getMemberScope().getContributedFunctions(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            arrayList.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctions(name, this.this$0));
            generateFakeOverrides(name, arrayList2, arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final void computeNonDeclaredProperties$1(Name name, ArrayList arrayList) {
            name.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Collection) this.refinedSupertypes.invoke()).iterator();
            while (it.hasNext()) {
                arrayList2.addAll(((KotlinType) it.next()).getMemberScope().getContributedVariables(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            generateFakeOverrides(name, arrayList2, arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final ClassId createClassId(Name name) {
            name.getClass();
            return this.this$0.classId.createNestedClassId(name);
        }

        public final void generateFakeOverrides(Name name, ArrayList arrayList, final ArrayList arrayList2) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            getC().getComponents().getKotlinTypeChecker().getOverridingUtil().generateOverridesInFunctionGroup(name, arrayList, arrayList3, this.this$0, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1
                @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                public void addFakeOverride(CallableMemberDescriptor callableMemberDescriptor) {
                    callableMemberDescriptor.getClass();
                    OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, null);
                    arrayList2.add(callableMemberDescriptor);
                }

                @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                public final void conflict(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                    callableMemberDescriptor.getClass();
                    callableMemberDescriptor2.getClass();
                    if (callableMemberDescriptor2 instanceof FunctionDescriptorImpl) {
                        ((FunctionDescriptorImpl) callableMemberDescriptor2).putInUserDataMap(DeserializedDeclarationsFromSupertypeConflictDataKey.INSTANCE, callableMemberDescriptor);
                    }
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        /* renamed from: getContributedClassifier */
        public final ClassifierDescriptor mo4154getContributedClassifier(Name name, LookupLocation lookupLocation) {
            ClassDescriptor classDescriptor;
            name.getClass();
            lookupLocation.getClass();
            mo4157recordLookup(name, lookupLocation);
            EnumEntryClassDescriptors enumEntryClassDescriptors = this.this$0.enumEntries;
            return (enumEntryClassDescriptors == null || (classDescriptor = (ClassDescriptor) enumEntryClassDescriptors.enumEntryByName.invoke(name)) == null) ? super.mo4154getContributedClassifier(name, lookupLocation) : classDescriptor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public final Collection getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
            descriptorKindFilter.getClass();
            function1.getClass();
            return (Collection) this.allDescriptors.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public final Collection getContributedFunctions(Name name, LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            mo4157recordLookup(name, lookupLocation);
            return super.getContributedFunctions(name, lookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Collection getContributedVariables(Name name, LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            mo4157recordLookup(name, lookupLocation);
            return super.getContributedVariables(name, lookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final Set getNonDeclaredClassifierNames() {
            List<KotlinType> supertypes = this.this$0.typeConstructor.getSupertypes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = supertypes.iterator();
            while (it.hasNext()) {
                Set<Name> classifierNames = ((KotlinType) it.next()).getMemberScope().getClassifierNames();
                if (classifierNames == null) {
                    return null;
                }
                CollectionsKt__MutableCollectionsKt.addAll(classifierNames, linkedHashSet);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final Set getNonDeclaredFunctionNames() {
            DeserializedClassDescriptor deserializedClassDescriptor = this.this$0;
            List<KotlinType> supertypes = deserializedClassDescriptor.typeConstructor.getSupertypes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = supertypes.iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(((KotlinType) it.next()).getMemberScope().getFunctionNames(), linkedHashSet);
            }
            linkedHashSet.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctionsNames(deserializedClassDescriptor));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final Set getNonDeclaredVariableNames() {
            List<KotlinType> supertypes = this.this$0.typeConstructor.getSupertypes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = supertypes.iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(((KotlinType) it.next()).getMemberScope().getVariableNames(), linkedHashSet);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final boolean isDeclaredFunctionAvailable(SimpleFunctionDescriptor simpleFunctionDescriptor) {
            simpleFunctionDescriptor.getClass();
            return getC().getComponents().getPlatformDependentDeclarationFilter().isFunctionAvailable(this.this$0, simpleFunctionDescriptor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        /* renamed from: recordLookup */
        public final void mo4157recordLookup(Name name, LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            UtilsKt.record(getC().getComponents().getLookupTracker(), lookupLocation, this.this$0, name);
        }
    }

    public final class EnumEntryClassDescriptors {
        public final MemoizedFunctionToNullable enumEntryByName;
        public final LinkedHashMap enumEntryProtos;
        public final NotNullLazyValue enumMemberNames;

        public EnumEntryClassDescriptors() {
            List<ProtoBuf.EnumEntry> enumEntryList = DeserializedClassDescriptor.this.getClassProto().getEnumEntryList();
            enumEntryList.getClass();
            List<ProtoBuf.EnumEntry> list = enumEntryList;
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
            for (Object obj : list) {
                linkedHashMap.put(NameResolverUtilKt.getName(DeserializedClassDescriptor.this.getC().getNameResolver(), ((ProtoBuf.EnumEntry) obj).getName()), obj);
            }
            this.enumEntryProtos = linkedHashMap;
            this.enumEntryByName = DeserializedClassDescriptor.this.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new OverridingUtil.AnonymousClass7(23, this, DeserializedClassDescriptor.this));
            this.enumMemberNames = DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new KotlinKPropertyN$$Lambda$0(this, 24));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(DeserializationContext deserializationContext, ProtoBuf.Class r18, NameResolver nameResolver, BinaryVersion binaryVersion, SourceElement sourceElement) {
        super(deserializationContext.getStorageManager(), NameResolverUtilKt.getClassId(nameResolver, r18.getFqName()).getShortClassName());
        MemberScopeImpl memberScopeImpl;
        deserializationContext.getClass();
        r18.getClass();
        nameResolver.getClass();
        binaryVersion.getClass();
        sourceElement.getClass();
        this.classProto = r18;
        this.metadataVersion = binaryVersion;
        this.sourceElement = sourceElement;
        this.classId = NameResolverUtilKt.getClassId(nameResolver, r18.getFqName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        this.modality = protoEnumFlags.modality(Flags.MODALITY.get(r18.getFlags()));
        this.visibility = ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(r18.getFlags()));
        ClassKind classKind = protoEnumFlags.classKind(Flags.CLASS_KIND.get(r18.getFlags()));
        this.kind = classKind;
        List<ProtoBuf.TypeParameter> typeParameterList = r18.getTypeParameterList();
        typeParameterList.getClass();
        ProtoBuf.TypeTable typeTable = r18.getTypeTable();
        typeTable.getClass();
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = r18.getVersionRequirementTable();
        versionRequirementTable.getClass();
        DeserializationContext childContext = deserializationContext.childContext(this, typeParameterList, nameResolver, typeTable2, companion.create(versionRequirementTable), binaryVersion);
        this.c = childContext;
        Boolean bool = Flags.HAS_ENUM_ENTRIES.get(r18.getFlags());
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        ClassKind classKind2 = ClassKind.ENUM_CLASS;
        int i = 0;
        if (classKind == classKind2) {
            memberScopeImpl = new StaticScopeForKotlinEnum(childContext.getStorageManager(), this, booleanValue || Intrinsics.areEqual(childContext.getComponents().getEnumEntriesDeserializationSupport().canSynthesizeEnumEntries(), Boolean.TRUE));
        } else {
            memberScopeImpl = MemberScope.Empty.INSTANCE;
        }
        this.staticScope = memberScopeImpl;
        this.typeConstructor = new DeserializedClassTypeConstructor();
        this.memberScopeHolder = ScopesHolderForClass.Companion.create(this, childContext.getStorageManager(), childContext.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner(), new DeserializedClassDescriptor$memberScopeHolder$1(1, 0, DeserializedClassMemberScope.class, this, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V"));
        this.enumEntries = classKind == classKind2 ? new EnumEntryClassDescriptors() : null;
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        this.containingDeclaration = containingDeclaration;
        this.primaryConstructor = childContext.getStorageManager().createNullableLazyValue(new DeserializedClassDescriptor$$Lambda$0(this, i));
        this.constructors = childContext.getStorageManager().createLazyValue(new DeserializedClassDescriptor$$Lambda$0(this, 1));
        this.companionObjectDescriptor = childContext.getStorageManager().createNullableLazyValue(new DeserializedClassDescriptor$$Lambda$0(this, 2));
        this.sealedSubclasses = childContext.getStorageManager().createLazyValue(new DeserializedClassDescriptor$$Lambda$0(this, 3));
        this.valueClassRepresentation = childContext.getStorageManager().createNullableLazyValue(new DeserializedClassDescriptor$$Lambda$0(this, 4));
        NameResolver nameResolver2 = childContext.getNameResolver();
        TypeTable typeTable3 = childContext.getTypeTable();
        DeserializedClassDescriptor deserializedClassDescriptor = containingDeclaration instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) containingDeclaration : null;
        this.thisAsProtoContainer = new ProtoContainer.Class(r18, nameResolver2, typeTable3, sourceElement, deserializedClassDescriptor != null ? deserializedClassDescriptor.thisAsProtoContainer : null);
        this.annotations = !Flags.HAS_ANNOTATIONS.get(r18.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(childContext.getStorageManager(), new DeserializedClassDescriptor$$Lambda$0(this, 5));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.annotations;
    }

    public final DeserializationContext getC() {
        return this.c;
    }

    public final ProtoBuf.Class getClassProto() {
        return this.classProto;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo4141getCompanionObjectDescriptor() {
        return (ClassDescriptor) this.companionObjectDescriptor.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassConstructorDescriptor> getConstructors() {
        return (Collection) this.constructors.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ReceiverParameterDescriptor> getContextReceivers() {
        DeserializationContext deserializationContext = this.c;
        List<ProtoBuf.Type> contextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(this.classProto, deserializationContext.getTypeTable());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(contextReceiverTypes, 10));
        Iterator<T> it = contextReceiverTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(new ReceiverParameterDescriptorImpl(getThisAsReceiverParameter(), new ContextClassReceiver(this, deserializationContext.getTypeDeserializer().type((ProtoBuf.Type) it.next()), null, null), Annotations.Companion.getEMPTY()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.c.getTypeDeserializer().getOwnTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        return this.kind;
    }

    public final DeserializedClassMemberScope getMemberScope() {
        return (DeserializedClassMemberScope) this.memberScopeHolder.getScope(this.c.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner());
    }

    public final BinaryVersion getMetadataVersion() {
        return this.metadataVersion;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        return this.modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        return this.sourceElement;
    }

    public final ProtoContainer.Class getThisAsProtoContainer$deserialization() {
        return this.thisAsProtoContainer;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this.memberScopeHolder.getScope(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo4142getUnsubstitutedPrimaryConstructor() {
        return (ClassConstructorDescriptor) this.primaryConstructor.invoke();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        if (r0 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SimpleType getValueClassPropertyType(Name name) {
        Iterator it = getMemberScope().getContributedVariables(name, NoLookupLocation.FROM_DESERIALIZATION).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                PropertyDescriptor propertyDescriptor = (PropertyDescriptor) next;
                if (propertyDescriptor.getExtensionReceiverParameter() == null && propertyDescriptor.getContextReceiverParameters().isEmpty()) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) obj;
        return (SimpleType) (propertyDescriptor2 != null ? propertyDescriptor2.getType() : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return (ValueClassRepresentation) this.valueClassRepresentation.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        return this.visibility;
    }

    public final boolean hasNestedClass$deserialization(Name name) {
        name.getClass();
        return getMemberScope().getClassNames$deserialization().contains(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return Flags.CLASS_KIND.get(this.classProto.getFlags()) == ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        Boolean bool = Flags.IS_DATA.get(this.classProto.getFlags());
        bool.getClass();
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        Boolean bool = Flags.IS_EXPECT_CLASS.get(this.classProto.getFlags());
        bool.getClass();
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        Boolean bool = Flags.IS_EXTERNAL_CLASS.get(this.classProto.getFlags());
        bool.getClass();
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        Boolean bool = Flags.IS_FUN_INTERFACE.get(this.classProto.getFlags());
        bool.getClass();
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return Flags.IS_VALUE_CLASS.get(this.classProto.getFlags()).booleanValue() && this.metadataVersion.isAtMost(1, 4, 1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        Boolean bool = Flags.IS_INNER.get(this.classProto.getFlags());
        bool.getClass();
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return Flags.IS_VALUE_CLASS.get(this.classProto.getFlags()).booleanValue() && this.metadataVersion.isAtLeast(1, 4, 2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(isExpect() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    public final class DeserializedClassTypeConstructor extends AbstractClassTypeConstructor {
        public final NotNullLazyValue parameters;

        public DeserializedClassTypeConstructor() {
            super(DeserializedClassDescriptor.this.getC().getStorageManager());
            this.parameters = DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new DeserializedClassDescriptor$$Lambda$0(DeserializedClassDescriptor.this, 6));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final Collection computeSupertypes() {
            String asString;
            FqName asSingleFqName;
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            List<ProtoBuf.Type> supertypes = ProtoTypeTableUtilKt.supertypes(deserializedClassDescriptor.getClassProto(), deserializedClassDescriptor.getC().getTypeTable());
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(supertypes, 10));
            Iterator<T> it = supertypes.iterator();
            while (it.hasNext()) {
                arrayList.add(deserializedClassDescriptor.getC().getTypeDeserializer().type((ProtoBuf.Type) it.next()));
            }
            ArrayList plus = CollectionsKt.plus((Iterable) deserializedClassDescriptor.getC().getComponents().getAdditionalClassPartsProvider().getSupertypes(deserializedClassDescriptor), (Collection) arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = plus.iterator();
            while (it2.hasNext()) {
                ClassifierDescriptor mo4153getDeclarationDescriptor = ((KotlinType) it2.next()).getConstructor().mo4153getDeclarationDescriptor();
                NotFoundClasses.MockClassDescriptor mockClassDescriptor = mo4153getDeclarationDescriptor instanceof NotFoundClasses.MockClassDescriptor ? (NotFoundClasses.MockClassDescriptor) mo4153getDeclarationDescriptor : null;
                if (mockClassDescriptor != null) {
                    arrayList2.add(mockClassDescriptor);
                }
            }
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporter = deserializedClassDescriptor.getC().getComponents().getErrorReporter();
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    NotFoundClasses.MockClassDescriptor mockClassDescriptor2 = (NotFoundClasses.MockClassDescriptor) it3.next();
                    ClassId classId = DescriptorUtilsKt.getClassId(mockClassDescriptor2);
                    if (classId == null || (asSingleFqName = classId.asSingleFqName()) == null || (asString = asSingleFqName.asString()) == null) {
                        asString = mockClassDescriptor2.getName().asString();
                        asString.getClass();
                    }
                    arrayList3.add(asString);
                }
                errorReporter.reportIncompleteHierarchy(deserializedClassDescriptor, arrayList3);
            }
            return CollectionsKt.toList(plus);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: getDeclarationDescriptor */
        public final ClassDescriptor mo4153getDeclarationDescriptor() {
            return DeserializedClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final List getParameters() {
            return (List) this.parameters.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final SupertypeLoopChecker getSupertypeLoopChecker() {
            return SupertypeLoopChecker.EMPTY.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean isDenotable() {
            return true;
        }

        public final String toString() {
            String name = DeserializedClassDescriptor.this.getName().toString();
            name.getClass();
            return name;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: getDeclarationDescriptor */
        public final ClassifierDescriptor mo4153getDeclarationDescriptor() {
            return DeserializedClassDescriptor.this;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScopeImpl getStaticScope() {
        return this.staticScope;
    }
}
