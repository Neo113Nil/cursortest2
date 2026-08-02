package kotlin;

import java.io.Serializable;

/* loaded from: classes9.dex */
public final class InitializedLazyImpl implements Lazy, Serializable {
    public final Object value;

    public InitializedLazyImpl(Object obj) {
        this.value = obj;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        return this.value;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return true;
    }

    public final String toString() {
        return String.valueOf(this.value);
    }
}
