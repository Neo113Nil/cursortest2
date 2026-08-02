package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.internal.SignaturePayloadKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Filter$Option$SelectionList extends SignaturePayloadKt {
    public final SelectionList value;

    public Filter$Option$SelectionList(SelectionList selectionList) {
        selectionList.getClass();
        this.value = selectionList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Filter$Option$SelectionList) && Intrinsics.areEqual(this.value, ((Filter$Option$SelectionList) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SelectionList(value=" + this.value + ")";
    }
}
