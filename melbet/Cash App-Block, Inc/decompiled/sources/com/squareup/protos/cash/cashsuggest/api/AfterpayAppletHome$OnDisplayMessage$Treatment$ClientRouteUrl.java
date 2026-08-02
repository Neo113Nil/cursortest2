package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuCardKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl extends LocalMenuCardKt {
    public final String value;

    public AfterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl) && Intrinsics.areEqual(this.value, ((AfterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRouteUrl(value=", this.value, ")");
    }
}
