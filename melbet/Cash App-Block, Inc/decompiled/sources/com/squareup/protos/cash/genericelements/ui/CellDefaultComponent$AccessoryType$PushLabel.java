package com.squareup.protos.cash.genericelements.ui;

import coil3.svg.internal.Utils_androidKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CellDefaultComponent$AccessoryType$PushLabel extends Utils_androidKt {
    public final String value;

    public CellDefaultComponent$AccessoryType$PushLabel(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CellDefaultComponent$AccessoryType$PushLabel) && Intrinsics.areEqual(this.value, ((CellDefaultComponent$AccessoryType$PushLabel) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PushLabel(value=", this.value, ")");
    }
}
