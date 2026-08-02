package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;

/* loaded from: classes9.dex */
public final class CliStdlibClassFinderImpl implements StdlibClassFinder {
    public static final CliStdlibClassFinderImpl INSTANCE = new CliStdlibClassFinderImpl();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder
    public final ClassDescriptor findEnumEntriesClass(ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        return FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, StandardClassIds.INSTANCE.getEnumEntries());
    }
}
