package com.squareup.protos.cash.shop.rendering.api;

import com.datadog.android.rum.model.ErrorEvent;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class FilterGroupSection$FilterGroupItem$Style$FilterToggle extends ErrorEvent.Os.Companion {
    public final FilterGroupSection.FilterGroupItem.Toggle value;

    public FilterGroupSection$FilterGroupItem$Style$FilterToggle(FilterGroupSection.FilterGroupItem.Toggle toggle) {
        toggle.getClass();
        this.value = toggle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FilterGroupSection$FilterGroupItem$Style$FilterToggle) && Intrinsics.areEqual(this.value, ((FilterGroupSection$FilterGroupItem$Style$FilterToggle) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "FilterToggle(value=" + this.value + ")";
    }
}
