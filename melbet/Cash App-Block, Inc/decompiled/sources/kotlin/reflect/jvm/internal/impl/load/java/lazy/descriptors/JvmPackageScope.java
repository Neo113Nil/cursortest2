package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.IndexingIterable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;

/* loaded from: classes9.dex */
public final class JvmPackageScope implements MemberScope {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(JvmPackageScope.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)};
    public final LazyJavaResolverContext c;
    public final LazyJavaPackageScope javaScope;
    public final NotNullLazyValue kotlinScopes$delegate;
    public final LazyJavaPackageFragment packageFragment;

    public JvmPackageScope(LazyJavaResolverContext lazyJavaResolverContext, JavaPackage javaPackage, LazyJavaPackageFragment lazyJavaPackageFragment) {
        lazyJavaResolverContext.getClass();
        javaPackage.getClass();
        lazyJavaPackageFragment.getClass();
        this.c = lazyJavaResolverContext;
        this.packageFragment = lazyJavaPackageFragment;
        this.javaScope = new LazyJavaPackageScope(lazyJavaResolverContext, javaPackage, lazyJavaPackageFragment);
        this.kotlinScopes$delegate = lazyJavaResolverContext.getStorageManager().createLazyValue(new KotlinKPropertyN$$Lambda$0(this, 16));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        MemberScope[] kotlinScopes = getKotlinScopes();
        kotlinScopes.getClass();
        Set<Name> flatMapClassifierNamesOrNull = MemberScopeKt.flatMapClassifierNamesOrNull(kotlinScopes.length == 0 ? EmptyList.INSTANCE : new IndexingIterable(kotlinScopes, 1));
        if (flatMapClassifierNamesOrNull == null) {
            return null;
        }
        flatMapClassifierNamesOrNull.addAll(this.javaScope.getClassifierNames());
        return flatMapClassifierNamesOrNull;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public ClassifierDescriptor mo4154getContributedClassifier(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        mo4157recordLookup(name, lookupLocation);
        ClassDescriptor mo4154getContributedClassifier = this.javaScope.mo4154getContributedClassifier(name, lookupLocation);
        if (mo4154getContributedClassifier != null) {
            return mo4154getContributedClassifier;
        }
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : getKotlinScopes()) {
            ClassifierDescriptor mo4154getContributedClassifier2 = memberScope.mo4154getContributedClassifier(name, lookupLocation);
            if (mo4154getContributedClassifier2 != null) {
                if (!(mo4154getContributedClassifier2 instanceof ClassifierDescriptorWithTypeParameters) || !((MemberDescriptor) mo4154getContributedClassifier2).isExpect()) {
                    return mo4154getContributedClassifier2;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = mo4154getContributedClassifier2;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        MemberScope[] kotlinScopes = getKotlinScopes();
        Collection<DeclarationDescriptor> contributedDescriptors = this.javaScope.getContributedDescriptors(descriptorKindFilter, function1);
        for (MemberScope memberScope : kotlinScopes) {
            contributedDescriptors = ScopeUtilsKt.concat(contributedDescriptors, memberScope.getContributedDescriptors(descriptorKindFilter, function1));
        }
        return contributedDescriptors == null ? EmptySet.INSTANCE : contributedDescriptors;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        mo4157recordLookup(name, lookupLocation);
        MemberScope[] kotlinScopes = getKotlinScopes();
        Collection<? extends SimpleFunctionDescriptor> contributedFunctions = this.javaScope.getContributedFunctions(name, lookupLocation);
        int length = kotlinScopes.length;
        int i = 0;
        Collection collection = contributedFunctions;
        while (i < length) {
            Collection concat = ScopeUtilsKt.concat(collection, kotlinScopes[i].getContributedFunctions(name, lookupLocation));
            i++;
            collection = concat;
        }
        return collection == null ? EmptySet.INSTANCE : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        mo4157recordLookup(name, lookupLocation);
        MemberScope[] kotlinScopes = getKotlinScopes();
        Collection<? extends PropertyDescriptor> contributedVariables = this.javaScope.getContributedVariables(name, lookupLocation);
        int length = kotlinScopes.length;
        int i = 0;
        Collection collection = contributedVariables;
        while (i < length) {
            Collection concat = ScopeUtilsKt.concat(collection, kotlinScopes[i].getContributedVariables(name, lookupLocation));
            i++;
            collection = concat;
        }
        return collection == null ? EmptySet.INSTANCE : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        MemberScope[] kotlinScopes = getKotlinScopes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : kotlinScopes) {
            CollectionsKt__MutableCollectionsKt.addAll(memberScope.getFunctionNames(), linkedHashSet);
        }
        linkedHashSet.addAll(this.javaScope.getFunctionNames());
        return linkedHashSet;
    }

    public final LazyJavaPackageScope getJavaScope$descriptors_jvm() {
        return this.javaScope;
    }

    public final MemberScope[] getKotlinScopes() {
        return (MemberScope[]) StorageKt.getValue(this.kotlinScopes$delegate, this, $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        MemberScope[] kotlinScopes = getKotlinScopes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : kotlinScopes) {
            CollectionsKt__MutableCollectionsKt.addAll(memberScope.getVariableNames(), linkedHashSet);
        }
        linkedHashSet.addAll(this.javaScope.getVariableNames());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup */
    public void mo4157recordLookup(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        UtilsKt.record(this.c.getComponents().getLookupTracker(), lookupLocation, this.packageFragment, name);
    }

    public String toString() {
        return "scope for " + this.packageFragment;
    }
}
