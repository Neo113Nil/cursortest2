package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes9.dex */
public final class LazyJavaAnnotationDescriptor implements PossiblyExternalAnnotationDescriptor {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(LazyJavaAnnotationDescriptor.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0), new PropertyReference1Impl(LazyJavaAnnotationDescriptor.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new PropertyReference1Impl(LazyJavaAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};
    public final NotNullLazyValue allValueArguments$delegate;
    public final LazyJavaResolverContext c;
    public final NullableLazyValue fqName$delegate;
    public final boolean isFreshlySupportedTypeUseAnnotation;
    public final boolean isIdeExternalAnnotation;
    public final JavaAnnotation javaAnnotation;
    public final JavaSourceElement source;
    public final NotNullLazyValue type$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyJavaAnnotationDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotation javaAnnotation, boolean z) {
        lazyJavaResolverContext.getClass();
        javaAnnotation.getClass();
        this.c = lazyJavaResolverContext;
        this.javaAnnotation = javaAnnotation;
        StorageManager storageManager = lazyJavaResolverContext.getStorageManager();
        final Object[] objArr = 0 == true ? 1 : 0;
        this.fqName$delegate = storageManager.createNullableLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$$Lambda$0
            public final LazyJavaAnnotationDescriptor arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = objArr;
                LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.arg$0;
                switch (i) {
                    case 0:
                        ClassId classId = lazyJavaAnnotationDescriptor.javaAnnotation.getClassId();
                        if (classId != null) {
                            return classId.asSingleFqName();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr = LazyJavaAnnotationDescriptor.$$delegatedProperties;
                        FqName fqName = lazyJavaAnnotationDescriptor.getFqName();
                        JavaAnnotation javaAnnotation2 = lazyJavaAnnotationDescriptor.javaAnnotation;
                        LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaAnnotationDescriptor.c;
                        if (fqName == null) {
                            return ErrorUtils.createErrorType(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, javaAnnotation2.toString());
                        }
                        ClassDescriptor mapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(JavaToKotlinClassMapper.INSTANCE, fqName, lazyJavaResolverContext2.getModule().getBuiltIns(), null, 4, null);
                        if (mapJavaToKotlin$default == null) {
                            JavaClass resolve = javaAnnotation2.resolve();
                            ClassDescriptor resolveClass = resolve != null ? lazyJavaResolverContext2.getComponents().getModuleClassResolver().resolveClass(resolve) : null;
                            mapJavaToKotlin$default = resolveClass == null ? FindClassInModuleKt.findNonGenericClassAcrossDependencies(lazyJavaResolverContext2.getModule(), ClassId.Companion.topLevel(fqName), lazyJavaResolverContext2.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses()) : resolveClass;
                        }
                        return mapJavaToKotlin$default.getDefaultType();
                    default:
                        Collection<JavaAnnotationArgument> arguments = lazyJavaAnnotationDescriptor.javaAnnotation.getArguments();
                        ArrayList arrayList = new ArrayList();
                        for (JavaAnnotationArgument javaAnnotationArgument : arguments) {
                            Name name = javaAnnotationArgument.getName();
                            if (name == null) {
                                name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
                            }
                            ConstantValue resolveAnnotationArgument = lazyJavaAnnotationDescriptor.resolveAnnotationArgument(javaAnnotationArgument);
                            Pair pair = resolveAnnotationArgument != null ? new Pair(name, resolveAnnotationArgument) : null;
                            if (pair != null) {
                                arrayList.add(pair);
                            }
                        }
                        return MapsKt__MapsKt.toMap(arrayList);
                }
            }
        });
        final int i = 1;
        this.type$delegate = lazyJavaResolverContext.getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$$Lambda$0
            public final LazyJavaAnnotationDescriptor arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.arg$0;
                switch (i2) {
                    case 0:
                        ClassId classId = lazyJavaAnnotationDescriptor.javaAnnotation.getClassId();
                        if (classId != null) {
                            return classId.asSingleFqName();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr = LazyJavaAnnotationDescriptor.$$delegatedProperties;
                        FqName fqName = lazyJavaAnnotationDescriptor.getFqName();
                        JavaAnnotation javaAnnotation2 = lazyJavaAnnotationDescriptor.javaAnnotation;
                        LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaAnnotationDescriptor.c;
                        if (fqName == null) {
                            return ErrorUtils.createErrorType(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, javaAnnotation2.toString());
                        }
                        ClassDescriptor mapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(JavaToKotlinClassMapper.INSTANCE, fqName, lazyJavaResolverContext2.getModule().getBuiltIns(), null, 4, null);
                        if (mapJavaToKotlin$default == null) {
                            JavaClass resolve = javaAnnotation2.resolve();
                            ClassDescriptor resolveClass = resolve != null ? lazyJavaResolverContext2.getComponents().getModuleClassResolver().resolveClass(resolve) : null;
                            mapJavaToKotlin$default = resolveClass == null ? FindClassInModuleKt.findNonGenericClassAcrossDependencies(lazyJavaResolverContext2.getModule(), ClassId.Companion.topLevel(fqName), lazyJavaResolverContext2.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses()) : resolveClass;
                        }
                        return mapJavaToKotlin$default.getDefaultType();
                    default:
                        Collection<JavaAnnotationArgument> arguments = lazyJavaAnnotationDescriptor.javaAnnotation.getArguments();
                        ArrayList arrayList = new ArrayList();
                        for (JavaAnnotationArgument javaAnnotationArgument : arguments) {
                            Name name = javaAnnotationArgument.getName();
                            if (name == null) {
                                name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
                            }
                            ConstantValue resolveAnnotationArgument = lazyJavaAnnotationDescriptor.resolveAnnotationArgument(javaAnnotationArgument);
                            Pair pair = resolveAnnotationArgument != null ? new Pair(name, resolveAnnotationArgument) : null;
                            if (pair != null) {
                                arrayList.add(pair);
                            }
                        }
                        return MapsKt__MapsKt.toMap(arrayList);
                }
            }
        });
        this.source = lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaAnnotation);
        final int i2 = 2;
        this.allValueArguments$delegate = lazyJavaResolverContext.getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$$Lambda$0
            public final LazyJavaAnnotationDescriptor arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.arg$0;
                switch (i22) {
                    case 0:
                        ClassId classId = lazyJavaAnnotationDescriptor.javaAnnotation.getClassId();
                        if (classId != null) {
                            return classId.asSingleFqName();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr = LazyJavaAnnotationDescriptor.$$delegatedProperties;
                        FqName fqName = lazyJavaAnnotationDescriptor.getFqName();
                        JavaAnnotation javaAnnotation2 = lazyJavaAnnotationDescriptor.javaAnnotation;
                        LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaAnnotationDescriptor.c;
                        if (fqName == null) {
                            return ErrorUtils.createErrorType(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, javaAnnotation2.toString());
                        }
                        ClassDescriptor mapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(JavaToKotlinClassMapper.INSTANCE, fqName, lazyJavaResolverContext2.getModule().getBuiltIns(), null, 4, null);
                        if (mapJavaToKotlin$default == null) {
                            JavaClass resolve = javaAnnotation2.resolve();
                            ClassDescriptor resolveClass = resolve != null ? lazyJavaResolverContext2.getComponents().getModuleClassResolver().resolveClass(resolve) : null;
                            mapJavaToKotlin$default = resolveClass == null ? FindClassInModuleKt.findNonGenericClassAcrossDependencies(lazyJavaResolverContext2.getModule(), ClassId.Companion.topLevel(fqName), lazyJavaResolverContext2.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses()) : resolveClass;
                        }
                        return mapJavaToKotlin$default.getDefaultType();
                    default:
                        Collection<JavaAnnotationArgument> arguments = lazyJavaAnnotationDescriptor.javaAnnotation.getArguments();
                        ArrayList arrayList = new ArrayList();
                        for (JavaAnnotationArgument javaAnnotationArgument : arguments) {
                            Name name = javaAnnotationArgument.getName();
                            if (name == null) {
                                name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
                            }
                            ConstantValue resolveAnnotationArgument = lazyJavaAnnotationDescriptor.resolveAnnotationArgument(javaAnnotationArgument);
                            Pair pair = resolveAnnotationArgument != null ? new Pair(name, resolveAnnotationArgument) : null;
                            if (pair != null) {
                                arrayList.add(pair);
                            }
                        }
                        return MapsKt__MapsKt.toMap(arrayList);
                }
            }
        });
        this.isIdeExternalAnnotation = javaAnnotation.isIdeExternalAnnotation();
        this.isFreshlySupportedTypeUseAnnotation = javaAnnotation.isFreshlySupportedTypeUseAnnotation() || z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.allValueArguments$delegate, this, $$delegatedProperties[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public FqName getFqName() {
        return (FqName) StorageKt.getValue(this.fqName$delegate, this, $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SimpleType getType() {
        return (SimpleType) StorageKt.getValue(this.type$delegate, this, $$delegatedProperties[1]);
    }

    public final boolean isFreshlySupportedTypeUseAnnotation() {
        return this.isFreshlySupportedTypeUseAnnotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.isIdeExternalAnnotation;
    }

    public final ConstantValue resolveAnnotationArgument(JavaAnnotationArgument javaAnnotationArgument) {
        KotlinType arrayType;
        if (javaAnnotationArgument instanceof JavaLiteralAnnotationArgument) {
            return ConstantValueFactory.createConstantValue$default(ConstantValueFactory.INSTANCE, ((JavaLiteralAnnotationArgument) javaAnnotationArgument).getValue(), null, 2, null);
        }
        if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
            JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
            ClassId enumClassId = javaEnumValueAnnotationArgument.getEnumClassId();
            Name entryName = javaEnumValueAnnotationArgument.getEntryName();
            if (enumClassId == null || entryName == null) {
                return null;
            }
            return new EnumValue(enumClassId, entryName);
        }
        boolean z = javaAnnotationArgument instanceof JavaArrayAnnotationArgument;
        LazyJavaResolverContext lazyJavaResolverContext = this.c;
        if (!z) {
            if (javaAnnotationArgument instanceof JavaAnnotationAsAnnotationArgument) {
                return new AnnotationValue(new LazyJavaAnnotationDescriptor(this.c, ((JavaAnnotationAsAnnotationArgument) javaAnnotationArgument).getAnnotation(), false, 4, null));
            }
            if (javaAnnotationArgument instanceof JavaClassObjectAnnotationArgument) {
                return KClassValue.Companion.create(lazyJavaResolverContext.getTypeResolver().transformJavaType(((JavaClassObjectAnnotationArgument) javaAnnotationArgument).getReferencedType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null)));
            }
            return null;
        }
        JavaArrayAnnotationArgument javaArrayAnnotationArgument = (JavaArrayAnnotationArgument) javaAnnotationArgument;
        Name name = javaArrayAnnotationArgument.getName();
        if (name == null) {
            name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
        }
        name.getClass();
        List<JavaAnnotationArgument> elements = javaArrayAnnotationArgument.getElements();
        if (KotlinTypeKt.isError(getType())) {
            return null;
        }
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(this);
        annotationClass.getClass();
        ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(name, annotationClass);
        if (annotationParameterByName == null || (arrayType = annotationParameterByName.getType()) == null) {
            arrayType = lazyJavaResolverContext.getComponents().getModule().getBuiltIns().getArrayType(Variance.INVARIANT, ErrorUtils.createErrorType(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
            arrayType.getClass();
        }
        List<JavaAnnotationArgument> list = elements;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ConstantValue resolveAnnotationArgument = resolveAnnotationArgument((JavaAnnotationArgument) it.next());
            if (resolveAnnotationArgument == null) {
                resolveAnnotationArgument = new NullValue();
            }
            arrayList.add(resolveAnnotationArgument);
        }
        return ConstantValueFactory.INSTANCE.createArrayValue(arrayList, arrayType);
    }

    public String toString() {
        return DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.FQ_NAMES_IN_TYPES, this, null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public JavaSourceElement getSource() {
        return this.source;
    }

    public /* synthetic */ LazyJavaAnnotationDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotation javaAnnotation, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotation, (i & 4) != 0 ? false : z);
    }
}
