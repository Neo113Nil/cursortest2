package com.squareup.cash.stablecoin.viewmodels.widgets;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class StablecoinHomeDisclosuresWidgetViewEvent$DisclosuresClicked {
    public final String url;

    public StablecoinHomeDisclosuresWidgetViewEvent$DisclosuresClicked(String str) {
        str.getClass();
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StablecoinHomeDisclosuresWidgetViewEvent$DisclosuresClicked) && Intrinsics.areEqual(this.url, ((StablecoinHomeDisclosuresWidgetViewEvent$DisclosuresClicked) obj).url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisclosuresClicked(url=", this.url, ")");
    }
}
