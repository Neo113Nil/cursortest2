package kotlin.reflect.jvm.internal.impl.types.model;

/* loaded from: classes9.dex */
public enum TypeVariance {
    IN("in"),
    OUT("out"),
    INV("");

    public final String presentation;

    TypeVariance(String str) {
        this.presentation = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.presentation;
    }
}
