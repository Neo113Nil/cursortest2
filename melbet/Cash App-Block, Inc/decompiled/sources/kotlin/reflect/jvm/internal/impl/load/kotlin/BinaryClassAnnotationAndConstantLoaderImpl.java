package kotlin.reflect.jvm.internal.impl.load.kotlin;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.text.StringsKt;

/* loaded from: classes9.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl extends AbstractBinaryClassAnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {
    public final AnnotationDeserializer annotationDeserializer;
    public MetadataVersion metadataVersion;
    public final ModuleDescriptor module;
    public final NotFoundClasses notFoundClasses;

    public abstract class AbstractAnnotationArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public AbstractAnnotationArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(Name name, Object obj) {
            visitConstantValue(name, BinaryClassAnnotationAndConstantLoaderImpl.access$createConstant(BinaryClassAnnotationAndConstantLoaderImpl.this, name, obj));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(final Name name, ClassId classId) {
            classId.getClass();
            final ArrayList arrayList = new ArrayList();
            SourceElement sourceElement = SourceElement.NO_SOURCE;
            sourceElement.getClass();
            final BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 loadAnnotation = BinaryClassAnnotationAndConstantLoaderImpl.this.loadAnnotation(classId, sourceElement, arrayList);
            return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, name, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitAnnotation$1
                public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 $$delegate_0;
                public final /* synthetic */ ArrayList $list;
                public final /* synthetic */ Name $name;
                public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor this$0;

                {
                    this.this$0 = this;
                    this.$name = name;
                    this.$list = arrayList;
                    this.$$delegate_0 = BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1.this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visit(Name name2, Object obj) {
                    visit(name2, obj);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name2, ClassId classId2) {
                    classId2.getClass();
                    return visitAnnotation(name2, classId2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name2) {
                    return visitArray(name2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitClassLiteral(Name name2, ClassLiteralValue classLiteralValue) {
                    classLiteralValue.getClass();
                    visitClassLiteral(name2, classLiteralValue);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitEnd() {
                    visitEnd();
                    this.this$0.visitConstantValue(this.$name, new AnnotationValue((AnnotationDescriptor) CollectionsKt.single((List) this.$list)));
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitEnum(Name name2, ClassId classId2, Name name3) {
                    classId2.getClass();
                    name3.getClass();
                    visitEnum(name2, classId2, name3);
                }
            };
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
            return new BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1(BinaryClassAnnotationAndConstantLoaderImpl.this, name, this);
        }

        public abstract void visitArrayValue(Name name, ArrayList arrayList);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
            classLiteralValue.getClass();
            visitConstantValue(name, new KClassValue(classLiteralValue));
        }

        public abstract void visitConstantValue(Name name, ConstantValue constantValue);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(Name name, ClassId classId, Name name2) {
            classId.getClass();
            name2.getClass();
            visitConstantValue(name, new EnumValue(classId, name2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryClassAnnotationAndConstantLoaderImpl(ModuleDescriptor moduleDescriptor, NotFoundClasses notFoundClasses, StorageManager storageManager, KotlinClassFinder kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        moduleDescriptor.getClass();
        notFoundClasses.getClass();
        storageManager.getClass();
        kotlinClassFinder.getClass();
        this.module = moduleDescriptor;
        this.notFoundClasses = notFoundClasses;
        this.annotationDeserializer = new AnnotationDeserializer(moduleDescriptor, notFoundClasses);
        this.metadataVersion = MetadataVersion.INSTANCE;
    }

    public static final ConstantValue access$createConstant(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, Name name, Object obj) {
        ConstantValue<?> createConstantValue = ConstantValueFactory.INSTANCE.createConstantValue(obj, binaryClassAnnotationAndConstantLoaderImpl.module);
        if (createConstantValue != null) {
            return createConstantValue;
        }
        return ErrorValue.Companion.create("Unsupported annotation argument: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public MetadataVersion getMetadataVersion() {
        return this.metadataVersion;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1] */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public final BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 loadAnnotation(final ClassId classId, final SourceElement sourceElement, final List list) {
        classId.getClass();
        sourceElement.getClass();
        list.getClass();
        final ClassDescriptor findNonGenericClassAcrossDependencies = FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.module, classId, this.notFoundClasses);
        return new AbstractAnnotationArgumentVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1
            public final HashMap arguments;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.arguments = new HashMap();
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            public void visitArrayValue(Name name, ArrayList<ConstantValue<?>> arrayList) {
                arrayList.getClass();
                if (name == null) {
                    return;
                }
                ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(name, findNonGenericClassAcrossDependencies);
                if (annotationParameterByName != null) {
                    ConstantValueFactory constantValueFactory = ConstantValueFactory.INSTANCE;
                    List<? extends ConstantValue<?>> compact = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList);
                    KotlinType type2 = annotationParameterByName.getType();
                    type2.getClass();
                    this.arguments.put(name, constantValueFactory.createArrayValue(compact, type2));
                    return;
                }
                if (BinaryClassAnnotationAndConstantLoaderImpl.this.isImplicitRepeatableContainer(classId) && Intrinsics.areEqual(name.asString(), "value")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (obj instanceof AnnotationValue) {
                            arrayList2.add(obj);
                        }
                    }
                    List list2 = list;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        list2.add(((AnnotationValue) it.next()).getValue());
                    }
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            public void visitConstantValue(Name name, ConstantValue<?> constantValue) {
                constantValue.getClass();
                if (name != null) {
                    this.arguments.put(name, constantValue);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitEnd() {
                ClassId classId2 = classId;
                classId2.getClass();
                HashMap hashMap = this.arguments;
                hashMap.getClass();
                boolean equals = classId2.equals(SpecialJvmAnnotations.INSTANCE.getJAVA_LANG_ANNOTATION_REPEATABLE());
                BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = BinaryClassAnnotationAndConstantLoaderImpl.this;
                boolean z = false;
                if (equals) {
                    Object obj = hashMap.get(Name.identifier("value"));
                    KClassValue kClassValue = obj instanceof KClassValue ? (KClassValue) obj : null;
                    if (kClassValue != null) {
                        KClassValue.Value value = kClassValue.getValue();
                        KClassValue.Value.NormalClass normalClass = value instanceof KClassValue.Value.NormalClass ? (KClassValue.Value.NormalClass) value : null;
                        if (normalClass != null) {
                            z = binaryClassAnnotationAndConstantLoaderImpl.isImplicitRepeatableContainer(normalClass.getClassId());
                        }
                    }
                }
                if (z || binaryClassAnnotationAndConstantLoaderImpl.isImplicitRepeatableContainer(classId2)) {
                    return;
                }
                list.add(new AnnotationDescriptorImpl(findNonGenericClassAcrossDependencies.getDefaultType(), hashMap, sourceElement));
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    public Object loadConstant(String str, Object obj) {
        str.getClass();
        obj.getClass();
        if (StringsKt.contains((CharSequence) "ZBCS", (CharSequence) str, false)) {
            int intValue = ((Integer) obj).intValue();
            int hashCode = str.hashCode();
            if (hashCode == 66) {
                if (str.equals("B")) {
                    obj = Byte.valueOf((byte) intValue);
                }
                a$$ExternalSyntheticBUOutline0.m$1((Object) str);
                return null;
            }
            if (hashCode == 67) {
                if (str.equals("C")) {
                    obj = Character.valueOf((char) intValue);
                }
                a$$ExternalSyntheticBUOutline0.m$1((Object) str);
                return null;
            }
            if (hashCode == 83) {
                if (str.equals("S")) {
                    obj = Short.valueOf((short) intValue);
                }
                a$$ExternalSyntheticBUOutline0.m$1((Object) str);
                return null;
            }
            if (hashCode == 90 && str.equals("Z")) {
                obj = Boolean.valueOf(intValue != 0);
            }
            a$$ExternalSyntheticBUOutline0.m$1((Object) str);
            return null;
        }
        return ConstantValueFactory.INSTANCE.createConstantValue(obj, this.module);
    }

    public void setMetadataVersion(MetadataVersion metadataVersion) {
        metadataVersion.getClass();
        this.metadataVersion = metadataVersion;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    public Object transformToUnsignedConstant(Object obj) {
        ConstantValue constantValue = (ConstantValue) obj;
        constantValue.getClass();
        return constantValue instanceof ByteValue ? new UByteValue(((ByteValue) constantValue).getValue().byteValue()) : constantValue instanceof ShortValue ? new UShortValue(((ShortValue) constantValue).getValue().shortValue()) : constantValue instanceof IntValue ? new UIntValue(((IntValue) constantValue).getValue().intValue()) : constantValue instanceof LongValue ? new ULongValue(((LongValue) constantValue).getValue().longValue()) : constantValue;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public AnnotationDescriptor loadAnnotation(ProtoBuf.Annotation annotation, NameResolver nameResolver) {
        annotation.getClass();
        nameResolver.getClass();
        return this.annotationDeserializer.deserializeAnnotation(annotation, nameResolver);
    }
}
