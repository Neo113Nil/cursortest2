package com.squareup.contour;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class XInt {
    public final int value;

    public final boolean equals(Object obj) {
        if (obj instanceof XInt) {
            return this.value == ((XInt) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value, "XInt(value=", ")");
    }
}
