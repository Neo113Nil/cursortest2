package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* loaded from: classes9.dex */
public abstract class GivenFunctionsMemberScope extends MemberScopeImpl {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(GivenFunctionsMemberScope.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0)};
    public final NotNullLazyValue allDescriptors$delegate;
    public final ClassDescriptor containingClass;

    public GivenFunctionsMemberScope(StorageManager storageManager, ClassDescriptor classDescriptor) {
        storageManager.getClass();
        classDescriptor.getClass();
        this.containingClass = classDescriptor;
        this.allDescriptors$delegate = storageManager.createLazyValue(new KotlinKPropertyN$$Lambda$0(this, 20));
    }

    public abstract List computeDeclaredFunctions();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        if (!descriptorKindFilter.acceptsKinds(DescriptorKindFilter.CALLABLES.getKindMask())) {
            return EmptyList.INSTANCE;
        }
        return (List) StorageKt.getValue(this.allDescriptors$delegate, this, $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        Collection<SimpleFunctionDescriptor> collection;
        name.getClass();
        lookupLocation.getClass();
        List list = (List) StorageKt.getValue(this.allDescriptors$delegate, this, $$delegatedProperties[0]);
        if (list.isEmpty()) {
            collection = EmptyList.INSTANCE;
        } else {
            SmartList smartList = new SmartList();
            for (Object obj : list) {
                if ((obj instanceof SimpleFunctionDescriptor) && Intrinsics.areEqual(((SimpleFunctionDescriptor) obj).getName(), name)) {
                    smartList.add(obj);
                }
            }
            collection = smartList;
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        Collection<PropertyDescriptor> collection;
        name.getClass();
        lookupLocation.getClass();
        List list = (List) StorageKt.getValue(this.allDescriptors$delegate, this, $$delegatedProperties[0]);
        if (list.isEmpty()) {
            collection = EmptyList.INSTANCE;
        } else {
            SmartList smartList = new SmartList();
            for (Object obj : list) {
                if ((obj instanceof PropertyDescriptor) && Intrinsics.areEqual(((PropertyDescriptor) obj).getName(), name)) {
                    smartList.add(obj);
                }
            }
            collection = smartList;
        }
        return collection;
    }
}
