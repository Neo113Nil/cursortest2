package com.squareup.contour;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class XFloat {
    public final float value;

    public final boolean equals(Object obj) {
        if (obj instanceof XFloat) {
            return Float.compare(this.value, ((XFloat) obj).value) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value, "XFloat(value=", ")");
    }
}
