package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes9.dex */
public final class ErrorModuleDescriptor implements ModuleDescriptor {
    public static final ErrorModuleDescriptor INSTANCE = new ErrorModuleDescriptor();
    public static final Lazy builtIns$delegate;
    public static final EmptyList expectedByModules;
    public static final Name stableName;

    static {
        Name special = Name.special(ErrorEntity.ERROR_MODULE.getDebugText());
        special.getClass();
        stableName = special;
        expectedByModules = EmptyList.INSTANCE;
        builtIns$delegate = LazyKt.lazy(ErrorModuleDescriptor$$Lambda$0.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        declarationDescriptorVisitor.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public KotlinBuiltIns getBuiltIns() {
        return (KotlinBuiltIns) builtIns$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public <T> T getCapability(ModuleCapability<T> moduleCapability) {
        moduleCapability.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public List<ModuleDescriptor> getExpectedByModules() {
        return expectedByModules;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public Name getName() {
        return getStableName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getOriginal() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public PackageViewDescriptor getPackage(FqName fqName) {
        fqName.getClass();
        throw new IllegalStateException("Should not be called!");
    }

    public Name getStableName() {
        return stableName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public Collection<FqName> getSubPackagesOf(FqName fqName, Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public boolean shouldSeeInternalsOf(ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        return false;
    }
}
