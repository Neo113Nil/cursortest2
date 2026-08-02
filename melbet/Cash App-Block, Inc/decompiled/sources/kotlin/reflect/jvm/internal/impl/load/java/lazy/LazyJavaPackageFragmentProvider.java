package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.InitializedLazyImpl;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder$$Util;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* loaded from: classes9.dex */
public final class LazyJavaPackageFragmentProvider implements PackageFragmentProviderOptimized {
    public final LazyJavaResolverContext c;
    public final CacheWithNotNullValues packageFragments;

    public LazyJavaPackageFragmentProvider(JavaResolverComponents javaResolverComponents) {
        javaResolverComponents.getClass();
        LazyJavaResolverContext lazyJavaResolverContext = new LazyJavaResolverContext(javaResolverComponents, TypeParameterResolver.EMPTY.INSTANCE, new InitializedLazyImpl(null));
        this.c = lazyJavaResolverContext;
        this.packageFragments = lazyJavaResolverContext.getStorageManager().createCacheWithNotNullValues();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(FqName fqName, Collection<PackageFragmentDescriptor> collection) {
        fqName.getClass();
        collection.getClass();
        CollectionsKt.addIfNotNull(collection, getPackageFragment(fqName));
    }

    public final LazyJavaPackageFragment getPackageFragment(FqName fqName) {
        JavaPackage findPackage$default = JavaClassFinder$$Util.findPackage$default(this.c.getComponents().getFinder(), fqName, false, 2, null);
        if (findPackage$default == null) {
            return null;
        }
        return (LazyJavaPackageFragment) this.packageFragments.computeIfAbsent(fqName, new KClassImpl$Data$$Lambda$22(23, this, findPackage$default));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated
    public List<LazyJavaPackageFragment> getPackageFragments(FqName fqName) {
        fqName.getClass();
        return CollectionsKt__CollectionsKt.listOfNotNull(getPackageFragment(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public List<FqName> getSubPackagesOf(FqName fqName, Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        LazyJavaPackageFragment packageFragment = getPackageFragment(fqName);
        List<FqName> subPackageFqNames$descriptors_jvm = packageFragment != null ? packageFragment.getSubPackageFqNames$descriptors_jvm() : null;
        return subPackageFqNames$descriptors_jvm == null ? EmptyList.INSTANCE : subPackageFqNames$descriptors_jvm;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(FqName fqName) {
        fqName.getClass();
        return JavaClassFinder$$Util.findPackage$default(this.c.getComponents().getFinder(), fqName, false, 2, null) == null;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.c.getComponents().getModule();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public /* bridge */ /* synthetic */ Collection getSubPackagesOf(FqName fqName, Function1 function1) {
        return getSubPackagesOf(fqName, (Function1<? super Name, Boolean>) function1);
    }
}
