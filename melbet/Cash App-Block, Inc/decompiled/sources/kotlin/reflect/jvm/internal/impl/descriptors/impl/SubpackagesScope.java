package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* loaded from: classes9.dex */
public class SubpackagesScope extends MemberScopeImpl {
    public final FqName fqName;
    public final ModuleDescriptor moduleDescriptor;

    public SubpackagesScope(ModuleDescriptor moduleDescriptor, FqName fqName) {
        moduleDescriptor.getClass();
        fqName.getClass();
        this.moduleDescriptor = moduleDescriptor;
        this.fqName = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        if (!descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getPACKAGES_MASK())) {
            return EmptyList.INSTANCE;
        }
        FqName fqName = this.fqName;
        if (fqName.isRoot() && descriptorKindFilter.getExcludes().contains(DescriptorKindExclude.TopLevelPackages.INSTANCE)) {
            return EmptyList.INSTANCE;
        }
        ModuleDescriptor moduleDescriptor = this.moduleDescriptor;
        Collection<FqName> subPackagesOf = moduleDescriptor.getSubPackagesOf(fqName, function1);
        ArrayList arrayList = new ArrayList(subPackagesOf.size());
        Iterator<FqName> it = subPackagesOf.iterator();
        while (it.hasNext()) {
            Name shortName = it.next().shortName();
            if (((Boolean) function1.invoke(shortName)).booleanValue()) {
                shortName.getClass();
                PackageViewDescriptor packageViewDescriptor = null;
                if (!shortName.isSpecial()) {
                    PackageViewDescriptor packageViewDescriptor2 = moduleDescriptor.getPackage(fqName.child(shortName));
                    if (!packageViewDescriptor2.isEmpty()) {
                        packageViewDescriptor = packageViewDescriptor2;
                    }
                }
                CollectionsKt.addIfNotNull(arrayList, packageViewDescriptor);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "subpackages of " + this.fqName + " from " + this.moduleDescriptor;
    }
}
