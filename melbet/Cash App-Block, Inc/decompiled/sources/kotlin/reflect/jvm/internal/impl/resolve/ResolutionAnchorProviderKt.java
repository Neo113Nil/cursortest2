package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* loaded from: classes9.dex */
public final class ResolutionAnchorProviderKt {
    public static final ModuleCapability RESOLUTION_ANCHOR_PROVIDER_CAPABILITY = new ModuleCapability("ResolutionAnchorProvider");

    public static final ModuleDescriptor getResolutionAnchorIfAny(ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        ResolutionAnchorProvider resolutionAnchorProvider = (ResolutionAnchorProvider) moduleDescriptor.getCapability(RESOLUTION_ANCHOR_PROVIDER_CAPABILITY);
        if (resolutionAnchorProvider != null) {
            return resolutionAnchorProvider.getResolutionAnchor(moduleDescriptor);
        }
        return null;
    }
}
