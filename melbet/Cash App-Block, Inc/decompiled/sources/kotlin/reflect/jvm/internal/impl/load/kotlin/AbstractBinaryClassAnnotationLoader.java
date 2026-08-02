package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public abstract class AbstractBinaryClassAnnotationLoader<A, S extends AnnotationsContainer<? extends A>> implements AnnotationLoader<A> {
    public static final Companion Companion = new Companion(null);
    public final KotlinClassFinder kotlinClassFinder;

    public static abstract class AnnotationsContainer<A> {
        public abstract Map<MemberSignature, List<A>> getMemberAnnotations();
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final KotlinJvmBinaryClass getSpecialCaseContainerClass(ProtoContainer protoContainer, boolean z, boolean z2, Boolean bool, boolean z3, KotlinClassFinder kotlinClassFinder, MetadataVersion metadataVersion) {
            ProtoContainer.Class outerClass;
            protoContainer.getClass();
            kotlinClassFinder.getClass();
            metadataVersion.getClass();
            if (z) {
                if (bool == null) {
                    ZslControlImpl$$ExternalSyntheticLambda1.m("isConst should not be null for property (container=", 41, protoContainer);
                    return null;
                }
                if (protoContainer instanceof ProtoContainer.Class) {
                    ProtoContainer.Class r4 = (ProtoContainer.Class) protoContainer;
                    if (r4.getKind() == ProtoBuf.Class.Kind.INTERFACE) {
                        ClassId classId = r4.getClassId();
                        Name identifier = Name.identifier("DefaultImpls");
                        identifier.getClass();
                        return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, classId.createNestedClassId(identifier), metadataVersion);
                    }
                }
                if (bool.booleanValue() && (protoContainer instanceof ProtoContainer.Package)) {
                    SourceElement source = protoContainer.getSource();
                    JvmPackagePartSource jvmPackagePartSource = source instanceof JvmPackagePartSource ? (JvmPackagePartSource) source : null;
                    JvmClassName facadeClassName = jvmPackagePartSource != null ? jvmPackagePartSource.getFacadeClassName() : null;
                    if (facadeClassName != null) {
                        ClassId.Companion companion = ClassId.Companion;
                        String internalName = facadeClassName.getInternalName();
                        internalName.getClass();
                        return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, companion.topLevel(new FqName(StringsKt__StringsJVMKt.replace(internalName, '/', '.', false))), metadataVersion);
                    }
                }
            }
            if (z2 && (protoContainer instanceof ProtoContainer.Class)) {
                ProtoContainer.Class r42 = (ProtoContainer.Class) protoContainer;
                if (r42.getKind() == ProtoBuf.Class.Kind.COMPANION_OBJECT && (outerClass = r42.getOuterClass()) != null && (outerClass.getKind() == ProtoBuf.Class.Kind.CLASS || outerClass.getKind() == ProtoBuf.Class.Kind.ENUM_CLASS || (z3 && (outerClass.getKind() == ProtoBuf.Class.Kind.INTERFACE || outerClass.getKind() == ProtoBuf.Class.Kind.ANNOTATION_CLASS)))) {
                    SourceElement source2 = outerClass.getSource();
                    KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = source2 instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) source2 : null;
                    if (kotlinJvmBinarySourceElement != null) {
                        return kotlinJvmBinarySourceElement.getBinaryClass();
                    }
                    return null;
                }
            }
            if ((protoContainer instanceof ProtoContainer.Package) && (protoContainer.getSource() instanceof JvmPackagePartSource)) {
                SourceElement source3 = protoContainer.getSource();
                source3.getClass();
                JvmPackagePartSource jvmPackagePartSource2 = (JvmPackagePartSource) source3;
                KotlinJvmBinaryClass knownJvmBinaryClass = jvmPackagePartSource2.getKnownJvmBinaryClass();
                return knownJvmBinaryClass == null ? KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, jvmPackagePartSource2.getClassId(), metadataVersion) : knownJvmBinaryClass;
            }
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PropertyRelatedElement {
        public static final /* synthetic */ PropertyRelatedElement[] $VALUES;
        public static final PropertyRelatedElement BACKING_FIELD;
        public static final PropertyRelatedElement DELEGATE_FIELD;
        public static final PropertyRelatedElement PROPERTY;

        static {
            PropertyRelatedElement propertyRelatedElement = new PropertyRelatedElement("PROPERTY", 0);
            PROPERTY = propertyRelatedElement;
            PropertyRelatedElement propertyRelatedElement2 = new PropertyRelatedElement("BACKING_FIELD", 1);
            BACKING_FIELD = propertyRelatedElement2;
            PropertyRelatedElement propertyRelatedElement3 = new PropertyRelatedElement("DELEGATE_FIELD", 2);
            DELEGATE_FIELD = propertyRelatedElement3;
            $VALUES = new PropertyRelatedElement[]{propertyRelatedElement, propertyRelatedElement2, propertyRelatedElement3};
        }

        public static PropertyRelatedElement valueOf(String str) {
            return (PropertyRelatedElement) Enum.valueOf(PropertyRelatedElement.class, str);
        }

        public static PropertyRelatedElement[] values() {
            return (PropertyRelatedElement[]) $VALUES.clone();
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AbstractBinaryClassAnnotationLoader(KotlinClassFinder kotlinClassFinder) {
        kotlinClassFinder.getClass();
        this.kotlinClassFinder = kotlinClassFinder;
    }

    public static /* synthetic */ List findClassAndLoadMemberAnnotations$default(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, ProtoContainer protoContainer, MemberSignature memberSignature, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        return abstractBinaryClassAnnotationLoader.findClassAndLoadMemberAnnotations(protoContainer, memberSignature, z2, false, bool, (i & 32) != 0 ? false : z);
    }

    public static MemberSignature getCallableSignature(MessageLite messageLite, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind, boolean z) {
        messageLite.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        annotatedCallableKind.getClass();
        if (messageLite instanceof ProtoBuf.Constructor) {
            MemberSignature.Companion companion = MemberSignature.Companion;
            JvmMemberSignature.Method jvmConstructorSignature = JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature((ProtoBuf.Constructor) messageLite, nameResolver, typeTable);
            if (jvmConstructorSignature == null) {
                return null;
            }
            return companion.fromJvmMemberSignature(jvmConstructorSignature);
        }
        if (messageLite instanceof ProtoBuf.Function) {
            MemberSignature.Companion companion2 = MemberSignature.Companion;
            JvmMemberSignature.Method jvmMethodSignature = JvmProtoBufUtil.INSTANCE.getJvmMethodSignature((ProtoBuf.Function) messageLite, nameResolver, typeTable);
            if (jvmMethodSignature == null) {
                return null;
            }
            return companion2.fromJvmMemberSignature(jvmMethodSignature);
        }
        if (!(messageLite instanceof ProtoBuf.Property)) {
            return null;
        }
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> generatedExtension = JvmProtoBuf.propertySignature;
        generatedExtension.getClass();
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull((GeneratedMessageLite.ExtendableMessage) messageLite, generatedExtension);
        if (jvmPropertySignature == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[annotatedCallableKind.ordinal()];
        if (i == 1) {
            if (!jvmPropertySignature.hasGetter()) {
                return null;
            }
            MemberSignature.Companion companion3 = MemberSignature.Companion;
            JvmProtoBuf.JvmMethodSignature getter = jvmPropertySignature.getGetter();
            getter.getClass();
            return companion3.fromMethod(nameResolver, getter);
        }
        if (i != 2) {
            if (i != 3) {
                return null;
            }
            return AbstractBinaryClassAnnotationLoaderKt.getPropertySignature((ProtoBuf.Property) messageLite, nameResolver, typeTable, true, true, z);
        }
        if (!jvmPropertySignature.hasSetter()) {
            return null;
        }
        MemberSignature.Companion companion4 = MemberSignature.Companion;
        JvmProtoBuf.JvmMethodSignature setter = jvmPropertySignature.getSetter();
        setter.getClass();
        return companion4.fromMethod(nameResolver, setter);
    }

    public static /* synthetic */ MemberSignature getCallableSignature$default(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, MessageLite messageLite, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind, boolean z, int i, Object obj) {
        if (obj != null) {
            a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: getCallableSignature");
            return null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        abstractBinaryClassAnnotationLoader.getClass();
        return getCallableSignature(messageLite, nameResolver, typeTable, annotatedCallableKind, z);
    }

    public final List findClassAndLoadMemberAnnotations(ProtoContainer protoContainer, MemberSignature memberSignature, boolean z, boolean z2, Boolean bool, boolean z3) {
        List<A> list;
        KotlinJvmBinaryClass specialCaseContainerClass = Companion.getSpecialCaseContainerClass(protoContainer, z, z2, bool, z3, this.kotlinClassFinder, getMetadataVersion());
        protoContainer.getClass();
        if (specialCaseContainerClass == null) {
            if (protoContainer instanceof ProtoContainer.Class) {
                SourceElement source = ((ProtoContainer.Class) protoContainer).getSource();
                KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = source instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) source : null;
                if (kotlinJvmBinarySourceElement != null) {
                    specialCaseContainerClass = kotlinJvmBinarySourceElement.getBinaryClass();
                }
            }
            specialCaseContainerClass = null;
        }
        return (specialCaseContainerClass == null || (list = getAnnotationsContainer(specialCaseContainerClass).getMemberAnnotations().get(memberSignature)) == null) ? EmptyList.INSTANCE : list;
    }

    public abstract AnnotationsContainer getAnnotationsContainer(KotlinJvmBinaryClass kotlinJvmBinaryClass);

    public abstract MetadataVersion getMetadataVersion();

    public final boolean isImplicitRepeatableContainer(ClassId classId) {
        KotlinJvmBinaryClass findKotlinClass;
        classId.getClass();
        return classId.getOuterClassId() != null && Intrinsics.areEqual(classId.getShortClassName().asString(), "Container") && (findKotlinClass = KotlinClassFinderKt.findKotlinClass(this.kotlinClassFinder, classId, getMetadataVersion())) != null && SpecialJvmAnnotations.INSTANCE.isAnnotatedWithContainerMetaAnnotation(findKotlinClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public abstract A loadAnnotation(ProtoBuf.Annotation annotation, NameResolver nameResolver);

    public abstract BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 loadAnnotation(ClassId classId, SourceElement sourceElement, List list);

    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotationIfNotSpecial(ClassId classId, SourceElement sourceElement, List list) {
        classId.getClass();
        sourceElement.getClass();
        list.getClass();
        if (SpecialJvmAnnotations.INSTANCE.getSPECIAL_ANNOTATIONS().contains(classId)) {
            return null;
        }
        return loadAnnotation(classId, sourceElement, list);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadCallableAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        int i;
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        if (messageLite instanceof ProtoBuf.Constructor) {
            i = ((ProtoBuf.Constructor) messageLite).getFlags();
        } else if (messageLite instanceof ProtoBuf.Function) {
            i = ((ProtoBuf.Function) messageLite).getFlags();
        } else if (messageLite instanceof ProtoBuf.Property) {
            ProtoBuf.Property property = (ProtoBuf.Property) messageLite;
            int i2 = WhenMappings.$EnumSwitchMapping$0[annotatedCallableKind.ordinal()];
            i = i2 != 1 ? i2 != 2 ? property.getFlags() : property.hasSetterFlags() ? property.getSetterFlags() : property.getFlags() : property.hasGetterFlags() ? property.getGetterFlags() : property.getFlags();
        } else {
            i = 0;
        }
        if (!Flags.HAS_ANNOTATIONS.get(i).booleanValue()) {
            return EmptyList.INSTANCE;
        }
        if (annotatedCallableKind == AnnotatedCallableKind.PROPERTY) {
            return loadPropertyAnnotations(protoContainer, (ProtoBuf.Property) messageLite, PropertyRelatedElement.PROPERTY);
        }
        MemberSignature callableSignature$default = getCallableSignature$default(this, messageLite, protoContainer.getNameResolver(), protoContainer.getTypeTable(), annotatedCallableKind, false, 16, null);
        return callableSignature$default == null ? EmptyList.INSTANCE : findClassAndLoadMemberAnnotations$default(this, protoContainer, callableSignature$default, null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadClassAnnotations(ProtoContainer.Class r4) {
        r4.getClass();
        if (!Flags.HAS_ANNOTATIONS.get(r4.getClassProto().getFlags()).booleanValue()) {
            return EmptyList.INSTANCE;
        }
        SourceElement source = r4.getSource();
        KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = source instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) source : null;
        KotlinJvmBinaryClass binaryClass = kotlinJvmBinarySourceElement != null ? kotlinJvmBinarySourceElement.getBinaryClass() : null;
        if (binaryClass == null) {
            a$$ExternalSyntheticBUOutline0.m(r4.debugFqName(), "Class for loading annotations is not found: ");
            return null;
        }
        final ArrayList arrayList = new ArrayList(1);
        binaryClass.loadClassAnnotations(new KotlinJvmBinaryClass.AnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$loadClassAnnotations$1
            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId, SourceElement sourceElement) {
                classId.getClass();
                sourceElement.getClass();
                return AbstractBinaryClassAnnotationLoader.this.loadAnnotationIfNotSpecial(classId, sourceElement, arrayList);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public void visitEnd() {
            }
        }, null);
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadContextParameterAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        return !Flags.HAS_ANNOTATIONS.get(valueParameter != null ? valueParameter.getFlags() : 0).booleanValue() ? EmptyList.INSTANCE : loadParameterAnnotations(protoContainer, messageLite, annotatedCallableKind, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadEnumEntryAnnotations(ProtoContainer protoContainer, ProtoBuf.EnumEntry enumEntry) {
        protoContainer.getClass();
        enumEntry.getClass();
        return findClassAndLoadMemberAnnotations$default(this, protoContainer, MemberSignature.Companion.fromFieldNameAndDesc(protoContainer.getNameResolver().getString(enumEntry.getName()), ClassMapperLite.mapClass(((ProtoContainer.Class) protoContainer).getClassId().asString())), null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadExtensionReceiverParameterAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        return loadParameterAnnotations(protoContainer, messageLite, annotatedCallableKind, messageLite instanceof ProtoBuf.Function ? ((ProtoBuf.Function) messageLite).getContextParameterCount() : messageLite instanceof ProtoBuf.Property ? ((ProtoBuf.Property) messageLite).getContextParameterCount() : 0);
    }

    public final List loadParameterAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i) {
        MemberSignature callableSignature$default = getCallableSignature$default(this, messageLite, protoContainer.getNameResolver(), protoContainer.getTypeTable(), annotatedCallableKind, false, 16, null);
        return callableSignature$default == null ? EmptyList.INSTANCE : findClassAndLoadMemberAnnotations$default(this, protoContainer, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(callableSignature$default, i), null, false, 60);
    }

    public final List loadPropertyAnnotations(ProtoContainer protoContainer, ProtoBuf.Property property, PropertyRelatedElement propertyRelatedElement) {
        Boolean bool = Flags.IS_CONST.get(property.getFlags());
        bool.getClass();
        boolean isMovedFromInterfaceCompanion = JvmProtoBufUtil.isMovedFromInterfaceCompanion(property);
        if (propertyRelatedElement == PropertyRelatedElement.PROPERTY) {
            MemberSignature propertySignature$default = AbstractBinaryClassAnnotationLoaderKt.getPropertySignature$default(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), false, true, false, 40, null);
            return propertySignature$default == null ? EmptyList.INSTANCE : findClassAndLoadMemberAnnotations$default(this, protoContainer, propertySignature$default, bool, isMovedFromInterfaceCompanion, 8);
        }
        MemberSignature propertySignature$default2 = AbstractBinaryClassAnnotationLoaderKt.getPropertySignature$default(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), true, false, false, 48, null);
        if (propertySignature$default2 == null) {
            return EmptyList.INSTANCE;
        }
        return StringsKt.contains((CharSequence) propertySignature$default2.getSignature(), (CharSequence) "$delegate", false) != (propertyRelatedElement == PropertyRelatedElement.DELEGATE_FIELD) ? EmptyList.INSTANCE : findClassAndLoadMemberAnnotations(protoContainer, propertySignature$default2, true, true, bool, isMovedFromInterfaceCompanion);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadPropertyBackingFieldAnnotations(ProtoContainer protoContainer, ProtoBuf.Property property) {
        protoContainer.getClass();
        property.getClass();
        return !Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue() ? EmptyList.INSTANCE : loadPropertyAnnotations(protoContainer, property, PropertyRelatedElement.BACKING_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadPropertyDelegateFieldAnnotations(ProtoContainer protoContainer, ProtoBuf.Property property) {
        protoContainer.getClass();
        property.getClass();
        return !Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue() ? EmptyList.INSTANCE : loadPropertyAnnotations(protoContainer, property, PropertyRelatedElement.DELEGATE_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadTypeAnnotations(ProtoBuf.Type type2, NameResolver nameResolver) {
        type2.getClass();
        nameResolver.getClass();
        List<ProtoBuf.Annotation> annotationList = type2.getAnnotationList();
        annotationList.getClass();
        List<ProtoBuf.Annotation> list = annotationList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (ProtoBuf.Annotation annotation : list) {
            annotation.getClass();
            arrayList.add(loadAnnotation(annotation, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadTypeParameterAnnotations(ProtoBuf.TypeParameter typeParameter, NameResolver nameResolver) {
        typeParameter.getClass();
        nameResolver.getClass();
        List<ProtoBuf.Annotation> annotationList = typeParameter.getAnnotationList();
        annotationList.getClass();
        List<ProtoBuf.Annotation> list = annotationList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (ProtoBuf.Annotation annotation : list) {
            annotation.getClass();
            arrayList.add(loadAnnotation(annotation, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadValueParameterAnnotations(final ProtoContainer protoContainer, final MessageLite messageLite, final AnnotatedCallableKind annotatedCallableKind, final int i, ProtoBuf.ValueParameter valueParameter) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        valueParameter.getClass();
        return !Flags.HAS_ANNOTATIONS.get(valueParameter.getFlags()).booleanValue() ? EmptyList.INSTANCE : (List) new Function0(this, protoContainer, messageLite, annotatedCallableKind, i) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$$Lambda$2
            public final AbstractBinaryClassAnnotationLoader arg$0;
            public final ProtoContainer arg$1;
            public final MessageLite arg$2;
            public final AnnotatedCallableKind arg$3;
            public final int arg$4;

            {
                this.arg$0 = this;
                this.arg$1 = protoContainer;
                this.arg$2 = messageLite;
                this.arg$3 = annotatedCallableKind;
                this.arg$4 = i;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
            
                if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.hasReceiver((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r0) != false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
            
                if (r1.isInner() != false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
            
                if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.hasReceiver((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r0) != false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
            
                r2 = 1;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                AbstractBinaryClassAnnotationLoader.Companion companion = AbstractBinaryClassAnnotationLoader.Companion;
                MessageLite messageLite2 = this.arg$2;
                boolean z = messageLite2 instanceof ProtoBuf.Function;
                int i2 = 0;
                int contextParameterCount = z ? ((ProtoBuf.Function) messageLite2).getContextParameterCount() : messageLite2 instanceof ProtoBuf.Property ? ((ProtoBuf.Property) messageLite2).getContextParameterCount() : 0;
                ProtoContainer protoContainer2 = this.arg$1;
                if (!z) {
                    if (!(messageLite2 instanceof ProtoBuf.Property)) {
                        if (!(messageLite2 instanceof ProtoBuf.Constructor)) {
                            throw new UnsupportedOperationException("Unsupported message: " + messageLite2.getClass());
                        }
                        protoContainer2.getClass();
                        ProtoContainer.Class r1 = (ProtoContainer.Class) protoContainer2;
                        if (r1.getKind() == ProtoBuf.Class.Kind.ENUM_CLASS) {
                            i2 = 2;
                        }
                        return this.arg$0.loadParameterAnnotations(protoContainer2, messageLite2, this.arg$3, contextParameterCount + i2 + this.arg$4);
                    }
                }
            }
        }.invoke();
    }
}
