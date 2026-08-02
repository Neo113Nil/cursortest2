package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;

/* loaded from: classes9.dex */
public final class LazyJavaStaticClassScope extends LazyJavaStaticScope {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final JavaClass jClass;
    public final JavaClassDescriptor ownerDescriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(LazyJavaResolverContext lazyJavaResolverContext, JavaClass javaClass, JavaClassDescriptor javaClassDescriptor) {
        super(lazyJavaResolverContext);
        lazyJavaResolverContext.getClass();
        javaClass.getClass();
        javaClassDescriptor.getClass();
        this.jClass = javaClass;
        this.ownerDescriptor = javaClassDescriptor;
    }

    public static PropertyDescriptor getRealOriginal(PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor.getKind().isReal()) {
            return propertyDescriptor;
        }
        Collection<? extends PropertyDescriptor> overriddenDescriptors = propertyDescriptor.getOverriddenDescriptors();
        overriddenDescriptors.getClass();
        Collection<? extends PropertyDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        for (PropertyDescriptor propertyDescriptor2 : collection) {
            propertyDescriptor2.getClass();
            arrayList.add(getRealOriginal(propertyDescriptor2));
        }
        return (PropertyDescriptor) CollectionsKt.single(CollectionsKt.toList(CollectionsKt.toMutableSet(arrayList)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set computeClassNames(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
        descriptorKindFilter.getClass();
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set computeFunctionNames(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
        descriptorKindFilter.getClass();
        LinkedHashSet mutableSet = CollectionsKt.toMutableSet(((DeclaredMemberIndex) this.declaredMemberIndex.invoke()).getMethodNames());
        JavaClassDescriptor javaClassDescriptor = this.ownerDescriptor;
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(javaClassDescriptor);
        Set<Name> functionNames = parentJavaStaticClassScope != null ? parentJavaStaticClassScope.getFunctionNames() : null;
        if (functionNames == null) {
            functionNames = EmptySet.INSTANCE;
        }
        mutableSet.addAll(functionNames);
        if (this.jClass.isEnum()) {
            mutableSet.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new Name[]{StandardNames.ENUM_VALUE_OF, StandardNames.ENUM_VALUES}));
        }
        LazyJavaResolverContext lazyJavaResolverContext = this.c;
        mutableSet.addAll(lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().getStaticFunctionNames(javaClassDescriptor, lazyJavaResolverContext));
        return mutableSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void computeImplicitlyDeclaredFunctions(Name name, ArrayList arrayList) {
        name.getClass();
        LazyJavaResolverContext lazyJavaResolverContext = this.c;
        lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateStaticFunctions(this.ownerDescriptor, name, arrayList, lazyJavaResolverContext);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.jClass, LazyJavaScope$$Lambda$9.INSTANCE$2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void computeNonDeclaredFunctions(LinkedHashSet linkedHashSet, Name name) {
        name.getClass();
        JavaClassDescriptor javaClassDescriptor = this.ownerDescriptor;
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(javaClassDescriptor);
        Collection set = parentJavaStaticClassScope == null ? EmptySet.INSTANCE : CollectionsKt.toSet(parentJavaStaticClassScope.getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        LazyJavaResolverContext lazyJavaResolverContext = this.c;
        Collection resolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, set, linkedHashSet, this.ownerDescriptor, lazyJavaResolverContext.getComponents().getErrorReporter(), lazyJavaResolverContext.getComponents().getKotlinTypeChecker().getOverridingUtil());
        resolveOverridesForStaticMembers.getClass();
        linkedHashSet.addAll(resolveOverridesForStaticMembers);
        if (this.jClass.isEnum()) {
            if (name.equals(StandardNames.ENUM_VALUE_OF)) {
                SimpleFunctionDescriptor createEnumValueOfMethod = DescriptorFactory.createEnumValueOfMethod(javaClassDescriptor);
                createEnumValueOfMethod.getClass();
                linkedHashSet.add(createEnumValueOfMethod);
            } else if (name.equals(StandardNames.ENUM_VALUES)) {
                SimpleFunctionDescriptor createEnumValuesMethod = DescriptorFactory.createEnumValuesMethod(javaClassDescriptor);
                createEnumValuesMethod.getClass();
                linkedHashSet.add(createEnumValuesMethod);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void computeNonDeclaredProperties(Name name, ArrayList arrayList) {
        ArrayList arrayList2;
        Name name2;
        name.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        TasksKt$awaitImpl$2$2 tasksKt$awaitImpl$2$2 = new TasksKt$awaitImpl$2$2(name, 12);
        JavaClassDescriptor javaClassDescriptor = this.ownerDescriptor;
        DFS.dfs(CollectionsKt__CollectionsJVMKt.listOf(javaClassDescriptor), LazyJavaStaticClassScope$$Lambda$3.INSTANCE, new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(javaClassDescriptor, linkedHashSet, tasksKt$awaitImpl$2$2));
        boolean isEmpty = arrayList.isEmpty();
        LazyJavaResolverContext lazyJavaResolverContext = this.c;
        if (isEmpty) {
            Name name3 = name;
            arrayList2 = arrayList;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                PropertyDescriptor realOriginal = getRealOriginal((PropertyDescriptor) obj);
                Object obj2 = linkedHashMap.get(realOriginal);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(realOriginal, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Name name4 = name3;
                Collection resolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name4, (Collection) ((Map.Entry) it.next()).getValue(), arrayList2, this.ownerDescriptor, lazyJavaResolverContext.getComponents().getErrorReporter(), lazyJavaResolverContext.getComponents().getKotlinTypeChecker().getOverridingUtil());
                resolveOverridesForStaticMembers.getClass();
                CollectionsKt__MutableCollectionsKt.addAll(resolveOverridesForStaticMembers, arrayList3);
                name3 = name4;
            }
            name2 = name3;
            arrayList2.addAll(arrayList3);
        } else {
            Collection resolveOverridesForStaticMembers2 = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, linkedHashSet, arrayList, this.ownerDescriptor, lazyJavaResolverContext.getComponents().getErrorReporter(), lazyJavaResolverContext.getComponents().getKotlinTypeChecker().getOverridingUtil());
            arrayList2 = arrayList;
            resolveOverridesForStaticMembers2.getClass();
            arrayList2.addAll(resolveOverridesForStaticMembers2);
            name2 = name;
        }
        if (this.jClass.isEnum() && name2.equals(StandardNames.ENUM_ENTRIES)) {
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList2, DescriptorFactory.createEnumEntriesProperty(javaClassDescriptor));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set computePropertyNames(DescriptorKindFilter descriptorKindFilter) {
        descriptorKindFilter.getClass();
        LinkedHashSet mutableSet = CollectionsKt.toMutableSet(((DeclaredMemberIndex) this.declaredMemberIndex.invoke()).getFieldNames());
        LazyJavaScope$$Lambda$9 lazyJavaScope$$Lambda$9 = LazyJavaScope$$Lambda$9.INSTANCE$3;
        JavaClassDescriptor javaClassDescriptor = this.ownerDescriptor;
        DFS.dfs(CollectionsKt__CollectionsJVMKt.listOf(javaClassDescriptor), LazyJavaStaticClassScope$$Lambda$3.INSTANCE, new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(javaClassDescriptor, mutableSet, lazyJavaScope$$Lambda$9));
        if (this.jClass.isEnum()) {
            mutableSet.add(StandardNames.ENUM_ENTRIES);
        }
        return mutableSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public ClassifierDescriptor mo4154getContributedClassifier(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclarationDescriptor getOwnerDescriptor() {
        return this.ownerDescriptor;
    }
}
