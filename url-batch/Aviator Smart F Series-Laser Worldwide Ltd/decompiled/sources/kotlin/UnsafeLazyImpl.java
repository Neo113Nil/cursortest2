package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.s;
import y5.f;
import y5.t;

/* loaded from: classes3.dex */
public final class UnsafeLazyImpl<T> implements f, Serializable {
    private Object _value;
    private f6.a initializer;

    public UnsafeLazyImpl(f6.a initializer) {
        s.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
        this._value = t.INSTANCE;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // y5.f
    public T getValue() {
        if (this._value == t.INSTANCE) {
            f6.a aVar = this.initializer;
            s.checkNotNull(aVar);
            this._value = aVar.invoke();
            this.initializer = null;
        }
        return (T) this._value;
    }

    @Override // y5.f
    public boolean isInitialized() {
        return this._value != t.INSTANCE;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
