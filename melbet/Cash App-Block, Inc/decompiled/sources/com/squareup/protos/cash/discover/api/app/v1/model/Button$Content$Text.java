package com.squareup.protos.cash.discover.api.app.v1.model;

import app.cash.zipline.loader.internal.fetcher.FetcherKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Button$Content$Text extends FetcherKt {
    public final String value;

    public Button$Content$Text(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Button$Content$Text) && Intrinsics.areEqual(this.value, ((Button$Content$Text) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(value=", this.value, ")");
    }
}
