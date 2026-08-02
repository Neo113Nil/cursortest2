package com.squareup.protos.cash.discover.api.app.v1.model;

import app.cash.zipline.loader.internal.fetcher.FetcherKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Button$Content$StyledText extends FetcherKt {
    public final Text value;

    public Button$Content$StyledText(Text text) {
        text.getClass();
        this.value = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Button$Content$StyledText) && Intrinsics.areEqual(this.value, ((Button$Content$StyledText) obj).value);
    }

    public final Text getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "StyledText(value=" + this.value + ")";
    }
}
