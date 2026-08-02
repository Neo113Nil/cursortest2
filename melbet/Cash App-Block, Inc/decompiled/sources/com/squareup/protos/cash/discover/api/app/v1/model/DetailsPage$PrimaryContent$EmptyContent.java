package com.squareup.protos.cash.discover.api.app.v1.model;

import array.SortOrder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DetailsPage$PrimaryContent$EmptyContent extends SortOrder {
    public final EmptyPrimaryContent value;

    public DetailsPage$PrimaryContent$EmptyContent(EmptyPrimaryContent emptyPrimaryContent) {
        emptyPrimaryContent.getClass();
        this.value = emptyPrimaryContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetailsPage$PrimaryContent$EmptyContent) && Intrinsics.areEqual(this.value, ((DetailsPage$PrimaryContent$EmptyContent) obj).value);
    }

    public final EmptyPrimaryContent getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EmptyContent(value=" + this.value + ")";
    }
}
