package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* loaded from: classes9.dex */
public final class FallbackBuiltIns extends KotlinBuiltIns {
    public static final Companion Companion = new Companion(null);
    public static final FallbackBuiltIns Instance;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final KotlinBuiltIns getInstance() {
            return FallbackBuiltIns.Instance;
        }
    }

    static {
        FallbackBuiltIns fallbackBuiltIns = new FallbackBuiltIns(new LockBasedStorageManager("FallbackBuiltIns"));
        fallbackBuiltIns.createBuiltInsModule(true);
        Instance = fallbackBuiltIns;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public final PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return PlatformDependentDeclarationFilter.All.INSTANCE;
    }
}
