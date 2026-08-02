package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* loaded from: classes9.dex */
public final class StdlibClassFinderKt {
    public static final ModuleCapability STDLIB_CLASS_FINDER_CAPABILITY = new ModuleCapability("StdlibClassFinder");

    public static final StdlibClassFinder getStdlibClassFinder(ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        StdlibClassFinder stdlibClassFinder = (StdlibClassFinder) moduleDescriptor.getCapability(STDLIB_CLASS_FINDER_CAPABILITY);
        return stdlibClassFinder == null ? CliStdlibClassFinderImpl.INSTANCE : stdlibClassFinder;
    }
}
