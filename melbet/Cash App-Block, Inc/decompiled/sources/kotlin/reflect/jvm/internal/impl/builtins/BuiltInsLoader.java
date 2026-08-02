package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes9.dex */
public interface BuiltInsLoader {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final Lazy Instance$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) DefaultBuiltIns$$Lambda$0.INSTANCE$1);

        public final BuiltInsLoader getInstance() {
            return (BuiltInsLoader) Instance$delegate.getValue();
        }
    }

    PackageFragmentProvider createPackageFragmentProvider(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Iterable<? extends ClassDescriptorFactory> iterable, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z);
}
