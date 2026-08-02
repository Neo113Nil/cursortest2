package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;

/* loaded from: classes9.dex */
public final class LazyJavaPackageScope extends LazyJavaStaticScope {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final MemoizedFunctionToNullable classes;
    public final JavaPackage jPackage;
    public final NullableLazyValue knownClassNamesInPackage;
    public final LazyJavaPackageFragment ownerDescriptor;

    public final class FindClassRequest {
        public final JavaClass javaClass;
        public final Name name;

        public FindClassRequest(Name name, JavaClass javaClass) {
            name.getClass();
            this.name = name;
            this.javaClass = javaClass;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof FindClassRequest) {
                return Intrinsics.areEqual(this.name, ((FindClassRequest) obj).name);
            }
            return false;
        }

        public final int hashCode() {
            return this.name.hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(LazyJavaResolverContext lazyJavaResolverContext, JavaPackage javaPackage, LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(lazyJavaResolverContext);
        lazyJavaResolverContext.getClass();
        javaPackage.getClass();
        lazyJavaPackageFragment.getClass();
        this.jPackage = javaPackage;
        this.ownerDescriptor = lazyJavaPackageFragment;
        this.knownClassNamesInPackage = lazyJavaResolverContext.getStorageManager().createNullableLazyValue(new KClassImpl$Data$$Lambda$22(24, lazyJavaResolverContext, this));
        this.classes = lazyJavaResolverContext.getStorageManager().createMemoizedFunctionWithNullableValues(new OverridingUtil.AnonymousClass7(19, this, lazyJavaResolverContext));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set computeClassNames(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
        descriptorKindFilter.getClass();
        if (!descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getNON_SINGLETON_CLASSIFIERS_MASK())) {
            return EmptySet.INSTANCE;
        }
        Set set = (Set) this.knownClassNamesInPackage.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(Name.identifier((String) it.next()));
            }
            return hashSet;
        }
        if (function1 == null) {
            function1 = FunctionsKt.alwaysTrue();
        }
        Collection<JavaClass> classes = this.jPackage.getClasses(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JavaClass javaClass : classes) {
            Name name = javaClass.getLightClassOriginKind() == LightClassOriginKind.SOURCE ? null : javaClass.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set computeFunctionNames(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
        descriptorKindFilter.getClass();
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final DeclaredMemberIndex computeMemberIndex() {
        return DeclaredMemberIndex.Empty.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void computeNonDeclaredFunctions(LinkedHashSet linkedHashSet, Name name) {
        name.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set computePropertyNames(DescriptorKindFilter descriptorKindFilter) {
        descriptorKindFilter.getClass();
        return EmptySet.INSTANCE;
    }

    public final ClassDescriptor findClassifier(Name name, JavaClass javaClass) {
        if (!SpecialNames.INSTANCE.isSafeIdentifier(name)) {
            return null;
        }
        Set set = (Set) this.knownClassNamesInPackage.invoke();
        if (javaClass == null && set != null && !set.contains(name.asString())) {
            return null;
        }
        return (ClassDescriptor) this.classes.invoke(new FindClassRequest(name, javaClass));
    }

    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(JavaClass javaClass) {
        javaClass.getClass();
        return findClassifier(javaClass.getName(), javaClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public ClassDescriptor mo4154getContributedClassifier(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return findClassifier(name, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
        if (!descriptorKindFilter.acceptsKinds(companion.getNON_SINGLETON_CLASSIFIERS_MASK() | companion.getCLASSIFIERS_MASK())) {
            return EmptyList.INSTANCE;
        }
        Iterable iterable = (Iterable) this.allDescriptors.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) obj;
            if (declarationDescriptor instanceof ClassDescriptor) {
                Name name = ((ClassDescriptor) declarationDescriptor).getName();
                name.getClass();
                if (((Boolean) function1.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return EmptyList.INSTANCE;
    }

    public final MetadataVersion getMetadataVersion() {
        return this.c.getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration().getMetadataVersion();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclarationDescriptor getOwnerDescriptor() {
        return this.ownerDescriptor;
    }
}
