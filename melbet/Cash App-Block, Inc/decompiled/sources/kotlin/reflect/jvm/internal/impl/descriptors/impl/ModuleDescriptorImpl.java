package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleExceptionKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.platform.TargetPlatform;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class ModuleDescriptorImpl extends DeclarationDescriptorImpl implements ModuleDescriptor {
    public final KotlinBuiltIns builtIns;
    public final Map capabilities;
    public ModuleDependencies dependencies;
    public final boolean isValid;
    public PackageFragmentProvider packageFragmentProviderForModuleContent;
    public final Lazy packageFragmentProviderForWholeModuleWithDependencies$delegate;
    public final PackageViewDescriptorFactory packageViewDescriptorFactory;
    public final MemoizedFunctionToNotNull packages;
    public final StorageManager storageManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(Name name, StorageManager storageManager, KotlinBuiltIns kotlinBuiltIns, TargetPlatform targetPlatform, Map<ModuleCapability<?>, ? extends Object> map, Name name2) {
        super(Annotations.Companion.getEMPTY(), name);
        name.getClass();
        storageManager.getClass();
        kotlinBuiltIns.getClass();
        map.getClass();
        this.storageManager = storageManager;
        this.builtIns = kotlinBuiltIns;
        if (!name.isSpecial()) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) name, "Module name must be special: ");
            throw null;
        }
        this.capabilities = map;
        PackageViewDescriptorFactory packageViewDescriptorFactory = (PackageViewDescriptorFactory) getCapability(PackageViewDescriptorFactory.Companion.getCAPABILITY());
        this.packageViewDescriptorFactory = packageViewDescriptorFactory == null ? PackageViewDescriptorFactory.Default.INSTANCE : packageViewDescriptorFactory;
        this.isValid = true;
        this.packages = storageManager.createMemoizedFunction(new TasksKt$awaitImpl$2$2(this, 2));
        this.packageFragmentProviderForWholeModuleWithDependencies$delegate = LazyKt.lazy(new KotlinKPropertyN$$Lambda$0(this, 11));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public /* bridge */ <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return (R) ModuleDescriptor.DefaultImpls.accept(this, declarationDescriptorVisitor, d);
    }

    public void assertValid() {
        if (isValid()) {
            return;
        }
        InvalidModuleExceptionKt.moduleInvalidated(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public KotlinBuiltIns getBuiltIns() {
        return this.builtIns;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public <T> T getCapability(ModuleCapability<T> moduleCapability) {
        moduleCapability.getClass();
        T t = (T) this.capabilities.get(moduleCapability);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public /* bridge */ DeclarationDescriptor getContainingDeclaration() {
        return ModuleDescriptor.DefaultImpls.getContainingDeclaration(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public List<ModuleDescriptor> getExpectedByModules() {
        ModuleDependencies moduleDependencies = this.dependencies;
        if (moduleDependencies != null) {
            return moduleDependencies.getDirectExpectedByDependencies();
        }
        String name = getName().toString();
        name.getClass();
        f$$ExternalSyntheticLambda0.m$1("Dependencies of module ", name, " were not set");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public PackageViewDescriptor getPackage(FqName fqName) {
        fqName.getClass();
        assertValid();
        return (PackageViewDescriptor) this.packages.invoke(fqName);
    }

    public final PackageFragmentProvider getPackageFragmentProvider() {
        assertValid();
        return (CompositePackageFragmentProvider) this.packageFragmentProviderForWholeModuleWithDependencies$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public Collection<FqName> getSubPackagesOf(FqName fqName, Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        assertValid();
        return getPackageFragmentProvider().getSubPackagesOf(fqName, function1);
    }

    public final void initialize(PackageFragmentProvider packageFragmentProvider) {
        packageFragmentProvider.getClass();
        this.packageFragmentProviderForModuleContent = packageFragmentProvider;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public final void setDependencies(List<ModuleDescriptorImpl> list, Set<ModuleDescriptorImpl> set) {
        list.getClass();
        set.getClass();
        setDependencies(new ModuleDependenciesImpl(list, set, EmptyList.INSTANCE, EmptySet.INSTANCE));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public boolean shouldSeeInternalsOf(ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        if (this == moduleDescriptor) {
            return true;
        }
        ModuleDependencies moduleDependencies = this.dependencies;
        moduleDependencies.getClass();
        return CollectionsKt.contains(moduleDependencies.getModulesWhoseInternalsAreVisible(), moduleDescriptor) || getExpectedByModules().contains(moduleDescriptor) || moduleDescriptor.getExpectedByModules().contains(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (!isValid()) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        PackageFragmentProvider packageFragmentProvider = this.packageFragmentProviderForModuleContent;
        sb.append(packageFragmentProvider != null ? packageFragmentProvider.getClass().getSimpleName() : null);
        return sb.toString();
    }

    public final void setDependencies(ModuleDependencies moduleDependencies) {
        moduleDependencies.getClass();
        this.dependencies = moduleDependencies;
    }

    public final void setDependencies(ModuleDescriptorImpl... moduleDescriptorImplArr) {
        moduleDescriptorImplArr.getClass();
        setDependencies(ArraysKt___ArraysKt.toList(moduleDescriptorImplArr));
    }

    public final void setDependencies(List<ModuleDescriptorImpl> list) {
        list.getClass();
        setDependencies(list, EmptySet.INSTANCE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(Name name, StorageManager storageManager, KotlinBuiltIns kotlinBuiltIns, TargetPlatform targetPlatform) {
        this(name, storageManager, kotlinBuiltIns, targetPlatform, null, null, 48, null);
        name.getClass();
        storageManager.getClass();
        kotlinBuiltIns.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ModuleDescriptorImpl(Name name, StorageManager storageManager, KotlinBuiltIns kotlinBuiltIns, TargetPlatform targetPlatform, Map map, Name name2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, storageManager, kotlinBuiltIns, targetPlatform, map, (i & 32) != 0 ? null : name2);
        targetPlatform = (i & 8) != 0 ? null : targetPlatform;
        if ((i & 16) != 0) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
    }
}
