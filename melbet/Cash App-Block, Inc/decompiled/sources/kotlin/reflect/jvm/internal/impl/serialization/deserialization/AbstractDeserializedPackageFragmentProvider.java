package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;

/* loaded from: classes9.dex */
public abstract class AbstractDeserializedPackageFragmentProvider implements PackageFragmentProviderOptimized {
    public DeserializationComponents components;
    public final KotlinMetadataFinder finder;
    public final MemoizedFunctionToNullable fragments;
    public final ModuleDescriptor moduleDescriptor;
    public final StorageManager storageManager;

    public AbstractDeserializedPackageFragmentProvider(StorageManager storageManager, KotlinMetadataFinder kotlinMetadataFinder, ModuleDescriptor moduleDescriptor) {
        storageManager.getClass();
        kotlinMetadataFinder.getClass();
        moduleDescriptor.getClass();
        this.storageManager = storageManager;
        this.finder = kotlinMetadataFinder;
        this.moduleDescriptor = moduleDescriptor;
        this.fragments = storageManager.createMemoizedFunctionWithNullableValues(new TasksKt$awaitImpl$2$2(this, 19));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(FqName fqName, Collection<PackageFragmentDescriptor> collection) {
        fqName.getClass();
        collection.getClass();
        CollectionsKt.addIfNotNull(collection, this.fragments.invoke(fqName));
    }

    public abstract BuiltInsPackageFragmentImpl findPackage(FqName fqName);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated
    public List<PackageFragmentDescriptor> getPackageFragments(FqName fqName) {
        fqName.getClass();
        return CollectionsKt__CollectionsKt.listOfNotNull(this.fragments.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public Collection<FqName> getSubPackagesOf(FqName fqName, Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(FqName fqName) {
        fqName.getClass();
        MemoizedFunctionToNullable memoizedFunctionToNullable = this.fragments;
        return (memoizedFunctionToNullable.isComputed(fqName) ? (PackageFragmentDescriptor) memoizedFunctionToNullable.invoke(fqName) : findPackage(fqName)) == null;
    }
}
