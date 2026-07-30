package kotlin;

import java.io.Serializable;
import y5.f;

/* loaded from: classes3.dex */
public final class InitializedLazyImpl<T> implements f, Serializable {
    private final T value;

    public InitializedLazyImpl(T t7) {
        this.value = t7;
    }

    @Override // y5.f
    public T getValue() {
        return this.value;
    }

    @Override // y5.f
    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
