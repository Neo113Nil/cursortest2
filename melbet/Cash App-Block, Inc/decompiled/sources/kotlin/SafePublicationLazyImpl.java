package kotlin;

import com.datadog.trace.api.ConfigCollectorAtomicFieldUpdaterHelper;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class SafePublicationLazyImpl implements Lazy, Serializable {
    public static final Companion Companion = new Companion(null);
    public static final AtomicReferenceFieldUpdater valueUpdater = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    public static final /* synthetic */ long valueUpdater$offset = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.objectFieldOffset(SafePublicationLazyImpl.class.getDeclaredField("_value"));
    public volatile Object _value;
    public volatile Function0 initializer;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        SafePublicationLazyImpl safePublicationLazyImpl;
        Object obj = this._value;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.INSTANCE;
        if (obj != uninitialized_value) {
            return obj;
        }
        Function0 function0 = this.initializer;
        if (function0 != null) {
            Object invoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = valueUpdater;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                long j = valueUpdater$offset;
                safePublicationLazyImpl = this;
                if (unsafe.compareAndSwapObject(safePublicationLazyImpl, j, uninitialized_value, invoke)) {
                    safePublicationLazyImpl.initializer = null;
                    return invoke;
                }
                if (unsafe.getObjectVolatile(safePublicationLazyImpl, j) != uninitialized_value) {
                    break;
                }
                this = safePublicationLazyImpl;
            }
        } else {
            safePublicationLazyImpl = this;
        }
        return safePublicationLazyImpl._value;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this._value != UNINITIALIZED_VALUE.INSTANCE;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
