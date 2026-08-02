package nl.dionsegijn.konfetti.models;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public final class Size {
    public final int sizeInDp;

    public Size(int i) {
        this.sizeInDp = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Size) && this.sizeInDp == ((Size) obj).sizeInDp && Float.compare(5.0f, 5.0f) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(5.0f) + (Integer.hashCode(this.sizeInDp) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sizeInDp, ", mass=5.0)", new StringBuilder("Size(sizeInDp="));
    }
}
