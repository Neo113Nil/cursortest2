package com.squareup.contour;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class YInt {
    public final int value;

    public /* synthetic */ YInt(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ YInt m3823boximpl(int i) {
        return new YInt(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof YInt) {
            return this.value == ((YInt) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value, "YInt(value=", ")");
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3824unboximpl() {
        return this.value;
    }
}
