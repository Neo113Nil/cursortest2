package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;

/* loaded from: classes9.dex */
public final class ReflectionTypes {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(ReflectionTypes.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new PropertyReference1Impl(ReflectionTypes.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new PropertyReference1Impl(ReflectionTypes.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new PropertyReference1Impl(ReflectionTypes.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new PropertyReference1Impl(ReflectionTypes.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)};
    public static final Companion Companion = new Companion(null);
    public final ClassLookup kClass$delegate;
    public final Lazy kotlinReflectScope$delegate;
    public final NotFoundClasses notFoundClasses;

    public final class ClassLookup {
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final KotlinType createKPropertyStarType(ModuleDescriptor moduleDescriptor) {
            moduleDescriptor.getClass();
            ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, StandardNames.FqNames.kProperty);
            if (findClassAcrossModuleDependencies == null) {
                return null;
            }
            TypeAttributes empty = TypeAttributes.Companion.getEmpty();
            List<TypeParameterDescriptor> parameters = findClassAcrossModuleDependencies.getTypeConstructor().getParameters();
            parameters.getClass();
            Object single = CollectionsKt.single((List) parameters);
            single.getClass();
            return KotlinTypeFactory.simpleNotNullType(empty, findClassAcrossModuleDependencies, CollectionsKt__CollectionsJVMKt.listOf(new StarProjectionImpl((TypeParameterDescriptor) single)));
        }
    }

    public ReflectionTypes(ModuleDescriptor moduleDescriptor, NotFoundClasses notFoundClasses) {
        moduleDescriptor.getClass();
        notFoundClasses.getClass();
        this.notFoundClasses = notFoundClasses;
        this.kotlinReflectScope$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new KotlinKPropertyN$$Lambda$0(moduleDescriptor, 4));
        this.kClass$delegate = new ClassLookup();
    }

    public static final ClassDescriptor access$find(ReflectionTypes reflectionTypes, String str, int i) {
        reflectionTypes.getClass();
        Name identifier = Name.identifier(str);
        identifier.getClass();
        ClassifierDescriptor mo4154getContributedClassifier = ((MemberScope) reflectionTypes.kotlinReflectScope$delegate.getValue()).mo4154getContributedClassifier(identifier, NoLookupLocation.FROM_REFLECTION);
        ClassDescriptor classDescriptor = mo4154getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) mo4154getContributedClassifier : null;
        return classDescriptor == null ? reflectionTypes.notFoundClasses.getClass(new ClassId(StandardNames.KOTLIN_REFLECT_FQ_NAME, identifier), CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(i))) : classDescriptor;
    }

    public final ClassDescriptor getKClass() {
        KProperty kProperty = $$delegatedProperties[0];
        this.kClass$delegate.getClass();
        kProperty.getClass();
        return access$find(this, CapitalizeDecapitalizeKt.capitalizeAsciiOnly(kProperty.getName()), 1);
    }
}
