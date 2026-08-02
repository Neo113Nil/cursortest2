package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* loaded from: classes9.dex */
public final class DefaultBuiltIns extends KotlinBuiltIns {
    public static final Companion Companion = new Companion(null);
    public static final Lazy Instance$delegate = LazyKt.lazy(DefaultBuiltIns$$Lambda$0.INSTANCE);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final DefaultBuiltIns getInstance() {
            return (DefaultBuiltIns) DefaultBuiltIns.Instance$delegate.getValue();
        }
    }

    public DefaultBuiltIns(boolean z) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if (z) {
            createBuiltInsModule(false);
        }
    }

    public DefaultBuiltIns() {
        this(false, 1, null);
    }

    public /* synthetic */ DefaultBuiltIns(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
