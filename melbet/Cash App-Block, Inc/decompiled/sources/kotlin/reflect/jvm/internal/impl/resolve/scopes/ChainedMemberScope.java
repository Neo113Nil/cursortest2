package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.IndexingIterable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* loaded from: classes9.dex */
public final class ChainedMemberScope implements MemberScope {
    public static final Companion Companion = new Companion(null);
    public final String debugName;
    public final MemberScope[] scopes;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final MemberScope create(String str, Iterable<? extends MemberScope> iterable) {
            str.getClass();
            iterable.getClass();
            SmartList smartList = new SmartList();
            for (MemberScope memberScope : iterable) {
                if (memberScope != MemberScope.Empty.INSTANCE) {
                    if (memberScope instanceof ChainedMemberScope) {
                        CollectionsKt__MutableCollectionsKt.addAll(smartList, ((ChainedMemberScope) memberScope).scopes);
                    } else {
                        smartList.add(memberScope);
                    }
                }
            }
            return createOrSingle$descriptors(str, smartList);
        }

        public final MemberScope createOrSingle$descriptors(String str, List<? extends MemberScope> list) {
            str.getClass();
            list.getClass();
            int size = list.size();
            return size != 0 ? size != 1 ? new ChainedMemberScope(str, (MemberScope[]) list.toArray(new MemberScope[0]), null) : list.get(0) : MemberScope.Empty.INSTANCE;
        }
    }

    public ChainedMemberScope(String str, MemberScope[] memberScopeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.debugName = str;
        this.scopes = memberScopeArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        MemberScope[] memberScopeArr = this.scopes;
        memberScopeArr.getClass();
        return MemberScopeKt.flatMapClassifierNamesOrNull(memberScopeArr.length == 0 ? EmptyList.INSTANCE : new IndexingIterable(memberScopeArr, 1));
    }

    public final List<MemberScope> getComponentScopes() {
        return ArraysKt___ArraysKt.toList(this.scopes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public ClassifierDescriptor mo4154getContributedClassifier(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : this.scopes) {
            ClassifierDescriptor mo4154getContributedClassifier = memberScope.mo4154getContributedClassifier(name, lookupLocation);
            if (mo4154getContributedClassifier != null) {
                if (!(mo4154getContributedClassifier instanceof ClassifierDescriptorWithTypeParameters) || !((MemberDescriptor) mo4154getContributedClassifier).isExpect()) {
                    return mo4154getContributedClassifier;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = mo4154getContributedClassifier;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        MemberScope[] memberScopeArr = this.scopes;
        int length = memberScopeArr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedDescriptors(descriptorKindFilter, function1);
        }
        Collection<DeclarationDescriptor> collection = null;
        for (MemberScope memberScope : memberScopeArr) {
            collection = ScopeUtilsKt.concat(collection, memberScope.getContributedDescriptors(descriptorKindFilter, function1));
        }
        return collection == null ? EmptySet.INSTANCE : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        MemberScope[] memberScopeArr = this.scopes;
        int length = memberScopeArr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedFunctions(name, lookupLocation);
        }
        Collection<SimpleFunctionDescriptor> collection = null;
        for (MemberScope memberScope : memberScopeArr) {
            collection = ScopeUtilsKt.concat(collection, memberScope.getContributedFunctions(name, lookupLocation));
        }
        return collection == null ? EmptySet.INSTANCE : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        MemberScope[] memberScopeArr = this.scopes;
        int length = memberScopeArr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedVariables(name, lookupLocation);
        }
        Collection<PropertyDescriptor> collection = null;
        for (MemberScope memberScope : memberScopeArr) {
            collection = ScopeUtilsKt.concat(collection, memberScope.getContributedVariables(name, lookupLocation));
        }
        return collection == null ? EmptySet.INSTANCE : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : this.scopes) {
            CollectionsKt__MutableCollectionsKt.addAll(memberScope.getFunctionNames(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : this.scopes) {
            CollectionsKt__MutableCollectionsKt.addAll(memberScope.getVariableNames(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup */
    public void mo4157recordLookup(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        for (MemberScope memberScope : this.scopes) {
            memberScope.mo4157recordLookup(name, lookupLocation);
        }
    }

    public String toString() {
        return this.debugName;
    }
}
