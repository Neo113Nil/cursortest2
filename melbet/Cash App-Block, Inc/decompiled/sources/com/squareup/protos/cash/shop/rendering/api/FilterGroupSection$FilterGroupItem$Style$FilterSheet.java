package com.squareup.protos.cash.shop.rendering.api;

import com.datadog.android.rum.model.ErrorEvent;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class FilterGroupSection$FilterGroupItem$Style$FilterSheet extends ErrorEvent.Os.Companion {
    public final FilterGroupSection.FilterGroupItem.Sheet value;

    public FilterGroupSection$FilterGroupItem$Style$FilterSheet(FilterGroupSection.FilterGroupItem.Sheet sheet) {
        sheet.getClass();
        this.value = sheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FilterGroupSection$FilterGroupItem$Style$FilterSheet) && Intrinsics.areEqual(this.value, ((FilterGroupSection$FilterGroupItem$Style$FilterSheet) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "FilterSheet(value=" + this.value + ")";
    }
}
