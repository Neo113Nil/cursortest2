package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class SynchronizedLazyImpl implements Lazy, Serializable {
    public volatile Object _value;
    public Function0 initializer;
    public final Object lock;

    public SynchronizedLazyImpl(Object obj, Function0 function0) {
        function0.getClass();
        this.initializer = function0;
        this._value = UNINITIALIZED_VALUE.INSTANCE;
        this.lock = obj == null ? this : obj;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object obj;
        Object obj2 = this._value;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.INSTANCE;
        if (obj2 != uninitialized_value) {
            return obj2;
        }
        synchronized (this.lock) {
            obj = this._value;
            if (obj == uninitialized_value) {
                Function0 function0 = this.initializer;
                function0.getClass();
                obj = function0.invoke();
                this._value = obj;
                this.initializer = null;
            }
        }
        return obj;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this._value != UNINITIALIZED_VALUE.INSTANCE;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ SynchronizedLazyImpl(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 2) != 0 ? null : obj, function0);
    }
}
