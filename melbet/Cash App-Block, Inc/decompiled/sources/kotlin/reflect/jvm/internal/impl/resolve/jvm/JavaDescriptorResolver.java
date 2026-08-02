package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes9.dex */
public final class JavaDescriptorResolver {
    public final JavaResolverCache javaResolverCache;
    public final LazyJavaPackageFragmentProvider packageFragmentProvider;

    public JavaDescriptorResolver(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, JavaResolverCache javaResolverCache) {
        lazyJavaPackageFragmentProvider.getClass();
        javaResolverCache.getClass();
        this.packageFragmentProvider = lazyJavaPackageFragmentProvider;
        this.javaResolverCache = javaResolverCache;
    }

    public final LazyJavaPackageFragmentProvider getPackageFragmentProvider() {
        return this.packageFragmentProvider;
    }

    public final ClassDescriptor resolveClass(JavaClass javaClass) {
        LazyJavaPackageFragment lazyJavaPackageFragment;
        javaClass.getClass();
        FqName fqName = javaClass.getFqName();
        if (fqName != null && javaClass.getLightClassOriginKind() == LightClassOriginKind.SOURCE) {
            return this.javaResolverCache.getClassResolvedFromSource(fqName);
        }
        JavaClass outerClass = javaClass.getOuterClass();
        if (outerClass == null) {
            if (fqName == null || (lazyJavaPackageFragment = (LazyJavaPackageFragment) CollectionsKt.firstOrNull((List) this.packageFragmentProvider.getPackageFragments(fqName.parent()))) == null) {
                return null;
            }
            return lazyJavaPackageFragment.findClassifierByJavaClass$descriptors_jvm(javaClass);
        }
        ClassDescriptor resolveClass = resolveClass(outerClass);
        MemberScope unsubstitutedInnerClassesScope = resolveClass != null ? resolveClass.getUnsubstitutedInnerClassesScope() : null;
        ClassifierDescriptor mo4154getContributedClassifier = unsubstitutedInnerClassesScope != null ? unsubstitutedInnerClassesScope.mo4154getContributedClassifier(javaClass.getName(), NoLookupLocation.FROM_JAVA_LOADER) : null;
        if (mo4154getContributedClassifier instanceof ClassDescriptor) {
            return (ClassDescriptor) mo4154getContributedClassifier;
        }
        return null;
    }
}
