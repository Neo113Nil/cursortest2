package com.squareup.protos.cash.genericelements.ui;

import coil3.size.ViewSizeResolverKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CellActivityComponent$AccessoryType$Amount extends ViewSizeResolverKt {
    public final String value;

    public CellActivityComponent$AccessoryType$Amount(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CellActivityComponent$AccessoryType$Amount) && Intrinsics.areEqual(this.value, ((CellActivityComponent$AccessoryType$Amount) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Amount(value=", this.value, ")");
    }
}
