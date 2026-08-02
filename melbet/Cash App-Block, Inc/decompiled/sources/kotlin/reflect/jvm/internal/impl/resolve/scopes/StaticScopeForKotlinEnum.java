package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* loaded from: classes9.dex */
public final class StaticScopeForKotlinEnum extends MemberScopeImpl {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(StaticScopeForKotlinEnum.class, "functions", "getFunctions()Ljava/util/List;", 0), new PropertyReference1Impl(StaticScopeForKotlinEnum.class, "properties", "getProperties()Ljava/util/List;", 0)};
    public final ClassDescriptor containingClass;
    public final boolean enumEntriesCanBeUsed;
    public final NotNullLazyValue functions$delegate;
    public final NotNullLazyValue properties$delegate;

    public StaticScopeForKotlinEnum(StorageManager storageManager, ClassDescriptor classDescriptor, boolean z) {
        storageManager.getClass();
        classDescriptor.getClass();
        this.containingClass = classDescriptor;
        this.enumEntriesCanBeUsed = z;
        classDescriptor.getKind();
        ClassKind classKind = ClassKind.CLASS;
        final int i = 0;
        this.functions$delegate = storageManager.createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum$$Lambda$0
            public final StaticScopeForKotlinEnum arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StaticScopeForKotlinEnum staticScopeForKotlinEnum = this.arg$0;
                switch (i2) {
                    case 0:
                        ClassDescriptor classDescriptor2 = staticScopeForKotlinEnum.containingClass;
                        return CollectionsKt__CollectionsKt.listOf((Object[]) new SimpleFunctionDescriptor[]{DescriptorFactory.createEnumValueOfMethod(classDescriptor2), DescriptorFactory.createEnumValuesMethod(classDescriptor2)});
                    default:
                        return staticScopeForKotlinEnum.enumEntriesCanBeUsed ? CollectionsKt__CollectionsKt.listOfNotNull(DescriptorFactory.createEnumEntriesProperty(staticScopeForKotlinEnum.containingClass)) : EmptyList.INSTANCE;
                }
            }
        });
        final int i2 = 1;
        this.properties$delegate = storageManager.createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum$$Lambda$0
            public final StaticScopeForKotlinEnum arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StaticScopeForKotlinEnum staticScopeForKotlinEnum = this.arg$0;
                switch (i22) {
                    case 0:
                        ClassDescriptor classDescriptor2 = staticScopeForKotlinEnum.containingClass;
                        return CollectionsKt__CollectionsKt.listOf((Object[]) new SimpleFunctionDescriptor[]{DescriptorFactory.createEnumValueOfMethod(classDescriptor2), DescriptorFactory.createEnumValuesMethod(classDescriptor2)});
                    default:
                        return staticScopeForKotlinEnum.enumEntriesCanBeUsed ? CollectionsKt__CollectionsKt.listOfNotNull(DescriptorFactory.createEnumEntriesProperty(staticScopeForKotlinEnum.containingClass)) : EmptyList.INSTANCE;
                }
            }
        });
    }

    public Void getContributedClassifier(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public List<CallableMemberDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        KProperty[] kPropertyArr = $$delegatedProperties;
        return CollectionsKt.plus((Iterable) StorageKt.getValue(this.properties$delegate, this, kPropertyArr[1]), (Collection) StorageKt.getValue(this.functions$delegate, this, kPropertyArr[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public SmartList<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        List list = (List) StorageKt.getValue(this.functions$delegate, this, $$delegatedProperties[0]);
        SmartList<SimpleFunctionDescriptor> smartList = new SmartList<>();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((SimpleFunctionDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        List list = (List) StorageKt.getValue(this.properties$delegate, this, $$delegatedProperties[1]);
        SmartList smartList = new SmartList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((PropertyDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ClassifierDescriptor mo4154getContributedClassifier(Name name, LookupLocation lookupLocation) {
        return (ClassifierDescriptor) getContributedClassifier(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public /* bridge */ /* synthetic */ Collection getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
        return getContributedDescriptors(descriptorKindFilter, (Function1<? super Name, Boolean>) function1);
    }
}
