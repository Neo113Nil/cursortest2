package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocationStatus;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ValueUnitElement$ValueUnit$RenderedText extends LocationStatus {
    public final String value;

    public GenericProfileElement$ValueUnitElement$ValueUnit$RenderedText(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$ValueUnitElement$ValueUnit$RenderedText) && Intrinsics.areEqual(this.value, ((GenericProfileElement$ValueUnitElement$ValueUnit$RenderedText) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RenderedText(value=", this.value, ")");
    }
}
