package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes9.dex */
public enum Variance {
    INVARIANT(0, true),
    IN_VARIANCE(1, false),
    OUT_VARIANCE(2, true);

    public final boolean allowsOutPosition;
    public final String label;

    Variance(int i, boolean z) {
        this.label = r2;
        this.allowsOutPosition = z;
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    public final String getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.label;
    }
}
