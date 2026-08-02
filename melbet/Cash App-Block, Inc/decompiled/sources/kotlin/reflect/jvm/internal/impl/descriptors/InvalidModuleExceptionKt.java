package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes9.dex */
public final class InvalidModuleExceptionKt {
    public static final ModuleCapability INVALID_MODULE_NOTIFIER_CAPABILITY = new ModuleCapability("InvalidModuleNotifier");

    public static final void moduleInvalidated(ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        InvalidModuleNotifier invalidModuleNotifier = (InvalidModuleNotifier) moduleDescriptor.getCapability(INVALID_MODULE_NOTIFIER_CAPABILITY);
        if (invalidModuleNotifier != null) {
            invalidModuleNotifier.notifyModuleInvalidated(moduleDescriptor);
        } else {
            throw new InvalidModuleException("Accessing invalid module descriptor " + moduleDescriptor);
        }
    }
}
