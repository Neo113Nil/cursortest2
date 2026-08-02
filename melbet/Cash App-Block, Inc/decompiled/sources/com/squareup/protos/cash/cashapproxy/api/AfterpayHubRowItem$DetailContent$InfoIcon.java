package com.squareup.protos.cash.cashapproxy.api;

import app.cash.local.primitives.LocalErrorKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayHubRowItem$DetailContent$InfoIcon extends LocalErrorKt {
    public final TextWithInfo value;

    public AfterpayHubRowItem$DetailContent$InfoIcon(TextWithInfo textWithInfo) {
        textWithInfo.getClass();
        this.value = textWithInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayHubRowItem$DetailContent$InfoIcon) && Intrinsics.areEqual(this.value, ((AfterpayHubRowItem$DetailContent$InfoIcon) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InfoIcon(value=" + this.value + ")";
    }
}
