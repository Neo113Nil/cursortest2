package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class InfoSheet$TextContent$Content$NumberedList extends zzkv {
    public final InfoSheet.NumberedList value;

    public InfoSheet$TextContent$Content$NumberedList(InfoSheet.NumberedList numberedList) {
        numberedList.getClass();
        this.value = numberedList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InfoSheet$TextContent$Content$NumberedList) && Intrinsics.areEqual(this.value, ((InfoSheet$TextContent$Content$NumberedList) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "NumberedList(value=" + this.value + ")";
    }
}
