package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eda {
    private final boolean a;
    private final float b;

    public eda(boolean z, float f) {
        this.a = z;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eda) {
            eda edaVar = (eda) obj;
            if (this.a == edaVar.a) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(edaVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "TextWidthCalcResult{isTextFitting=" + this.a + ", actualResultTextWidth=" + this.b + "}";
    }

    public eda() {
        throw null;
    }
}
