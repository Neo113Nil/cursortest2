package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppletCardSection$Header$StandardHeader {
    public final AppletCardSection.StandardHeader value;

    public AppletCardSection$Header$StandardHeader(AppletCardSection.StandardHeader standardHeader) {
        standardHeader.getClass();
        this.value = standardHeader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppletCardSection$Header$StandardHeader) && Intrinsics.areEqual(this.value, ((AppletCardSection$Header$StandardHeader) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "StandardHeader(value=" + this.value + ")";
    }
}
