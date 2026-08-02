package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes9.dex */
public class LazyPackageViewDescriptorImpl extends DeclarationDescriptorImpl implements PackageViewDescriptor {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(LazyPackageViewDescriptorImpl.class, "fragments", "getFragments()Ljava/util/List;", 0), new PropertyReference1Impl(LazyPackageViewDescriptorImpl.class, "empty", "getEmpty()Z", 0)};
    public final NotNullLazyValue empty$delegate;
    public final FqName fqName;
    public final NotNullLazyValue fragments$delegate;
    public final LazyScopeAdapter memberScope;
    public final ModuleDescriptorImpl module;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(ModuleDescriptorImpl moduleDescriptorImpl, FqName fqName, StorageManager storageManager) {
        super(Annotations.Companion.getEMPTY(), fqName.shortNameOrSpecial());
        moduleDescriptorImpl.getClass();
        fqName.getClass();
        storageManager.getClass();
        this.module = moduleDescriptorImpl;
        this.fqName = fqName;
        final int i = 0;
        this.fragments$delegate = storageManager.createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$$Lambda$0
            public final LazyPackageViewDescriptorImpl arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.arg$0;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LazyPackageViewDescriptorImpl.$$delegatedProperties;
                        return PackageFragmentProviderKt.packageFragments(lazyPackageViewDescriptorImpl.getModule().getPackageFragmentProvider(), lazyPackageViewDescriptorImpl.getFqName());
                    case 1:
                        KProperty[] kPropertyArr2 = LazyPackageViewDescriptorImpl.$$delegatedProperties;
                        return Boolean.valueOf(PackageFragmentProviderKt.isEmpty(lazyPackageViewDescriptorImpl.getModule().getPackageFragmentProvider(), lazyPackageViewDescriptorImpl.getFqName()));
                    default:
                        KProperty[] kPropertyArr3 = LazyPackageViewDescriptorImpl.$$delegatedProperties;
                        if (lazyPackageViewDescriptorImpl.isEmpty()) {
                            return MemberScope.Empty.INSTANCE;
                        }
                        List<PackageFragmentDescriptor> fragments = lazyPackageViewDescriptorImpl.getFragments();
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(fragments, 10));
                        Iterator<T> it = fragments.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((PackageFragmentDescriptor) it.next()).getMemberScope());
                        }
                        ArrayList plus = CollectionsKt.plus((Collection) arrayList, (Object) new SubpackagesScope(lazyPackageViewDescriptorImpl.getModule(), lazyPackageViewDescriptorImpl.getFqName()));
                        return ChainedMemberScope.Companion.create("package view scope for " + lazyPackageViewDescriptorImpl.getFqName() + " in " + lazyPackageViewDescriptorImpl.getModule().getName(), plus);
                }
            }
        });
        final int i2 = 1;
        this.empty$delegate = storageManager.createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$$Lambda$0
            public final LazyPackageViewDescriptorImpl arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.arg$0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LazyPackageViewDescriptorImpl.$$delegatedProperties;
                        return PackageFragmentProviderKt.packageFragments(lazyPackageViewDescriptorImpl.getModule().getPackageFragmentProvider(), lazyPackageViewDescriptorImpl.getFqName());
                    case 1:
                        KProperty[] kPropertyArr2 = LazyPackageViewDescriptorImpl.$$delegatedProperties;
                        return Boolean.valueOf(PackageFragmentProviderKt.isEmpty(lazyPackageViewDescriptorImpl.getModule().getPackageFragmentProvider(), lazyPackageViewDescriptorImpl.getFqName()));
                    default:
                        KProperty[] kPropertyArr3 = LazyPackageViewDescriptorImpl.$$delegatedProperties;
                        if (lazyPackageViewDescriptorImpl.isEmpty()) {
                            return MemberScope.Empty.INSTANCE;
                        }
                        List<PackageFragmentDescriptor> fragments = lazyPackageViewDescriptorImpl.getFragments();
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(fragments, 10));
                        Iterator<T> it = fragments.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((PackageFragmentDescriptor) it.next()).getMemberScope());
                        }
                        ArrayList plus = CollectionsKt.plus((Collection) arrayList, (Object) new SubpackagesScope(lazyPackageViewDescriptorImpl.getModule(), lazyPackageViewDescriptorImpl.getFqName()));
                        return ChainedMemberScope.Companion.create("package view scope for " + lazyPackageViewDescriptorImpl.getFqName() + " in " + lazyPackageViewDescriptorImpl.getModule().getName(), plus);
                }
            }
        });
        final int i3 = 2;
        this.memberScope = new LazyScopeAdapter(storageManager, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$$Lambda$0
            public final LazyPackageViewDescriptorImpl arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.arg$0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LazyPackageViewDescriptorImpl.$$delegatedProperties;
                        return PackageFragmentProviderKt.packageFragments(lazyPackageViewDescriptorImpl.getModule().getPackageFragmentProvider(), lazyPackageViewDescriptorImpl.getFqName());
                    case 1:
                        KProperty[] kPropertyArr2 = LazyPackageViewDescriptorImpl.$$delegatedProperties;
                        return Boolean.valueOf(PackageFragmentProviderKt.isEmpty(lazyPackageViewDescriptorImpl.getModule().getPackageFragmentProvider(), lazyPackageViewDescriptorImpl.getFqName()));
                    default:
                        KProperty[] kPropertyArr3 = LazyPackageViewDescriptorImpl.$$delegatedProperties;
                        if (lazyPackageViewDescriptorImpl.isEmpty()) {
                            return MemberScope.Empty.INSTANCE;
                        }
                        List<PackageFragmentDescriptor> fragments = lazyPackageViewDescriptorImpl.getFragments();
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(fragments, 10));
                        Iterator<T> it = fragments.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((PackageFragmentDescriptor) it.next()).getMemberScope());
                        }
                        ArrayList plus = CollectionsKt.plus((Collection) arrayList, (Object) new SubpackagesScope(lazyPackageViewDescriptorImpl.getModule(), lazyPackageViewDescriptorImpl.getFqName()));
                        return ChainedMemberScope.Companion.create("package view scope for " + lazyPackageViewDescriptorImpl.getFqName() + " in " + lazyPackageViewDescriptorImpl.getModule().getName(), plus);
                }
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        declarationDescriptorVisitor.getClass();
        return declarationDescriptorVisitor.visitPackageViewDescriptor(this, d);
    }

    public boolean equals(Object obj) {
        PackageViewDescriptor packageViewDescriptor = obj instanceof PackageViewDescriptor ? (PackageViewDescriptor) obj : null;
        return packageViewDescriptor != null && Intrinsics.areEqual(getFqName(), packageViewDescriptor.getFqName()) && Intrinsics.areEqual(getModule(), packageViewDescriptor.getModule());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public PackageViewDescriptor getContainingDeclaration() {
        if (getFqName().isRoot()) {
            return null;
        }
        return getModule().getPackage(getFqName().parent());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public FqName getFqName() {
        return this.fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public List<PackageFragmentDescriptor> getFragments() {
        return (List) StorageKt.getValue(this.fragments$delegate, this, $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public MemberScope getMemberScope() {
        return this.memberScope;
    }

    public int hashCode() {
        return getFqName().hashCode() + (getModule().hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public boolean isEmpty() {
        return ((Boolean) StorageKt.getValue(this.empty$delegate, this, $$delegatedProperties[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public ModuleDescriptorImpl getModule() {
        return this.module;
    }
}
