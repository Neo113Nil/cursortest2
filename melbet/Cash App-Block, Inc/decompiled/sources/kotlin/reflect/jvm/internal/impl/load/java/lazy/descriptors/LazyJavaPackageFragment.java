package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* loaded from: classes9.dex */
public final class LazyJavaPackageFragment extends PackageFragmentDescriptorImpl {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(LazyJavaPackageFragment.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0), new PropertyReference1Impl(LazyJavaPackageFragment.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0)};
    public final Annotations annotations;
    public final NotNullLazyValue binaryClasses$delegate;
    public final LazyJavaResolverContext c;
    public final JavaPackage jPackage;
    public final MetadataVersion metadataVersion;
    public final NotNullLazyValue partToFacade$delegate;
    public final JvmPackageScope scope;
    public final NotNullLazyValue subPackages;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(LazyJavaResolverContext lazyJavaResolverContext, JavaPackage javaPackage) {
        super(lazyJavaResolverContext.getModule(), javaPackage.getFqName());
        lazyJavaResolverContext.getClass();
        javaPackage.getClass();
        this.jPackage = javaPackage;
        LazyJavaResolverContext childForClassOrPackage$default = ContextKt.childForClassOrPackage$default(lazyJavaResolverContext, this, null, 0, 6, null);
        this.c = childForClassOrPackage$default;
        this.metadataVersion = lazyJavaResolverContext.getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration().getMetadataVersion();
        final int i = 0;
        this.binaryClasses$delegate = childForClassOrPackage$default.getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$$Lambda$0
            public final LazyJavaPackageFragment arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LazyJavaPackageFragment lazyJavaPackageFragment = this.arg$0;
                switch (i2) {
                    case 0:
                        LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaPackageFragment.c;
                        List<String> findPackageParts = lazyJavaResolverContext2.getComponents().getPackagePartProvider().findPackageParts(lazyJavaPackageFragment.getFqName().asString());
                        ArrayList arrayList = new ArrayList();
                        for (String str : findPackageParts) {
                            ClassId.Companion companion = ClassId.Companion;
                            FqName fqNameForTopLevelClassMaybeWithDollars = JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars();
                            fqNameForTopLevelClassMaybeWithDollars.getClass();
                            KotlinJvmBinaryClass findKotlinClass = KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext2.getComponents().getKotlinClassFinder(), companion.topLevel(fqNameForTopLevelClassMaybeWithDollars), lazyJavaPackageFragment.metadataVersion);
                            Pair pair = findKotlinClass != null ? new Pair(str, findKotlinClass) : null;
                            if (pair != null) {
                                arrayList.add(pair);
                            }
                        }
                        return MapsKt__MapsKt.toMap(arrayList);
                    case 1:
                        Collection<JavaPackage> subPackages = lazyJavaPackageFragment.jPackage.getSubPackages();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(subPackages, 10));
                        Iterator<T> it = subPackages.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((JavaPackage) it.next()).getFqName());
                        }
                        return arrayList2;
                    default:
                        KProperty[] kPropertyArr = LazyJavaPackageFragment.$$delegatedProperties;
                        HashMap hashMap = new HashMap();
                        for (Map.Entry<String, KotlinJvmBinaryClass> entry : lazyJavaPackageFragment.getBinaryClasses$descriptors_jvm().entrySet()) {
                            String key = entry.getKey();
                            KotlinJvmBinaryClass value = entry.getValue();
                            JvmClassName byInternalName = JvmClassName.byInternalName(key);
                            byInternalName.getClass();
                            KotlinClassHeader classHeader = value.getClassHeader();
                            int i3 = LazyJavaPackageFragment.WhenMappings.$EnumSwitchMapping$0[classHeader.getKind().ordinal()];
                            if (i3 == 1) {
                                String multifileClassName = classHeader.getMultifileClassName();
                                if (multifileClassName != null) {
                                    hashMap.put(byInternalName, JvmClassName.byInternalName(multifileClassName));
                                }
                            } else if (i3 == 2) {
                                hashMap.put(byInternalName, byInternalName);
                            }
                        }
                        return hashMap;
                }
            }
        });
        this.scope = new JvmPackageScope(childForClassOrPackage$default, javaPackage, this);
        final int i2 = 1;
        this.subPackages = childForClassOrPackage$default.getStorageManager().createRecursionTolerantLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$$Lambda$0
            public final LazyJavaPackageFragment arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LazyJavaPackageFragment lazyJavaPackageFragment = this.arg$0;
                switch (i22) {
                    case 0:
                        LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaPackageFragment.c;
                        List<String> findPackageParts = lazyJavaResolverContext2.getComponents().getPackagePartProvider().findPackageParts(lazyJavaPackageFragment.getFqName().asString());
                        ArrayList arrayList = new ArrayList();
                        for (String str : findPackageParts) {
                            ClassId.Companion companion = ClassId.Companion;
                            FqName fqNameForTopLevelClassMaybeWithDollars = JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars();
                            fqNameForTopLevelClassMaybeWithDollars.getClass();
                            KotlinJvmBinaryClass findKotlinClass = KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext2.getComponents().getKotlinClassFinder(), companion.topLevel(fqNameForTopLevelClassMaybeWithDollars), lazyJavaPackageFragment.metadataVersion);
                            Pair pair = findKotlinClass != null ? new Pair(str, findKotlinClass) : null;
                            if (pair != null) {
                                arrayList.add(pair);
                            }
                        }
                        return MapsKt__MapsKt.toMap(arrayList);
                    case 1:
                        Collection<JavaPackage> subPackages = lazyJavaPackageFragment.jPackage.getSubPackages();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(subPackages, 10));
                        Iterator<T> it = subPackages.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((JavaPackage) it.next()).getFqName());
                        }
                        return arrayList2;
                    default:
                        KProperty[] kPropertyArr = LazyJavaPackageFragment.$$delegatedProperties;
                        HashMap hashMap = new HashMap();
                        for (Map.Entry<String, KotlinJvmBinaryClass> entry : lazyJavaPackageFragment.getBinaryClasses$descriptors_jvm().entrySet()) {
                            String key = entry.getKey();
                            KotlinJvmBinaryClass value = entry.getValue();
                            JvmClassName byInternalName = JvmClassName.byInternalName(key);
                            byInternalName.getClass();
                            KotlinClassHeader classHeader = value.getClassHeader();
                            int i3 = LazyJavaPackageFragment.WhenMappings.$EnumSwitchMapping$0[classHeader.getKind().ordinal()];
                            if (i3 == 1) {
                                String multifileClassName = classHeader.getMultifileClassName();
                                if (multifileClassName != null) {
                                    hashMap.put(byInternalName, JvmClassName.byInternalName(multifileClassName));
                                }
                            } else if (i3 == 2) {
                                hashMap.put(byInternalName, byInternalName);
                            }
                        }
                        return hashMap;
                }
            }
        }, EmptyList.INSTANCE);
        this.annotations = childForClassOrPackage$default.getComponents().getJavaTypeEnhancementState().getDisabledDefaultAnnotations() ? Annotations.Companion.getEMPTY() : LazyJavaAnnotationsKt.resolveAnnotations(childForClassOrPackage$default, javaPackage);
        final int i3 = 2;
        this.partToFacade$delegate = childForClassOrPackage$default.getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$$Lambda$0
            public final LazyJavaPackageFragment arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LazyJavaPackageFragment lazyJavaPackageFragment = this.arg$0;
                switch (i22) {
                    case 0:
                        LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaPackageFragment.c;
                        List<String> findPackageParts = lazyJavaResolverContext2.getComponents().getPackagePartProvider().findPackageParts(lazyJavaPackageFragment.getFqName().asString());
                        ArrayList arrayList = new ArrayList();
                        for (String str : findPackageParts) {
                            ClassId.Companion companion = ClassId.Companion;
                            FqName fqNameForTopLevelClassMaybeWithDollars = JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars();
                            fqNameForTopLevelClassMaybeWithDollars.getClass();
                            KotlinJvmBinaryClass findKotlinClass = KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext2.getComponents().getKotlinClassFinder(), companion.topLevel(fqNameForTopLevelClassMaybeWithDollars), lazyJavaPackageFragment.metadataVersion);
                            Pair pair = findKotlinClass != null ? new Pair(str, findKotlinClass) : null;
                            if (pair != null) {
                                arrayList.add(pair);
                            }
                        }
                        return MapsKt__MapsKt.toMap(arrayList);
                    case 1:
                        Collection<JavaPackage> subPackages = lazyJavaPackageFragment.jPackage.getSubPackages();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(subPackages, 10));
                        Iterator<T> it = subPackages.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((JavaPackage) it.next()).getFqName());
                        }
                        return arrayList2;
                    default:
                        KProperty[] kPropertyArr = LazyJavaPackageFragment.$$delegatedProperties;
                        HashMap hashMap = new HashMap();
                        for (Map.Entry<String, KotlinJvmBinaryClass> entry : lazyJavaPackageFragment.getBinaryClasses$descriptors_jvm().entrySet()) {
                            String key = entry.getKey();
                            KotlinJvmBinaryClass value = entry.getValue();
                            JvmClassName byInternalName = JvmClassName.byInternalName(key);
                            byInternalName.getClass();
                            KotlinClassHeader classHeader = value.getClassHeader();
                            int i32 = LazyJavaPackageFragment.WhenMappings.$EnumSwitchMapping$0[classHeader.getKind().ordinal()];
                            if (i32 == 1) {
                                String multifileClassName = classHeader.getMultifileClassName();
                                if (multifileClassName != null) {
                                    hashMap.put(byInternalName, JvmClassName.byInternalName(multifileClassName));
                                }
                            } else if (i32 == 2) {
                                hashMap.put(byInternalName, byInternalName);
                            }
                        }
                        return hashMap;
                }
            }
        });
    }

    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(JavaClass javaClass) {
        javaClass.getClass();
        return this.scope.getJavaScope$descriptors_jvm().findClassifierByJavaClass$descriptors_jvm(javaClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.annotations;
    }

    public final Map<String, KotlinJvmBinaryClass> getBinaryClasses$descriptors_jvm() {
        return (Map) StorageKt.getValue(this.binaryClasses$delegate, this, $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        return new KotlinJvmBinaryPackageSourceElement(this);
    }

    public final List<FqName> getSubPackageFqNames$descriptors_jvm() {
        return (List) this.subPackages.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        return "Lazy Java package fragment: " + getFqName() + " of module " + this.c.getComponents().getModule();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public JvmPackageScope getMemberScope() {
        return this.scope;
    }
}
