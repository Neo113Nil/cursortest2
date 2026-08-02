package com.squareup.protos.cash.cashapproxy.api;

import app.cash.local.primitives.LocalErrorKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayHubRowItem$DetailContent$Text extends LocalErrorKt {
    public final Text value;

    public AfterpayHubRowItem$DetailContent$Text(Text text) {
        text.getClass();
        this.value = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayHubRowItem$DetailContent$Text) && Intrinsics.areEqual(this.value, ((AfterpayHubRowItem$DetailContent$Text) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Text(value=" + this.value + ")";
    }
}
