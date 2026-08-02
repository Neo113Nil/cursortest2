package com.squareup.contour;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class YFloat {
    public final float value;

    public final boolean equals(Object obj) {
        if (obj instanceof YFloat) {
            return Float.compare(this.value, ((YFloat) obj).value) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value, "YFloat(value=", ")");
    }
}
