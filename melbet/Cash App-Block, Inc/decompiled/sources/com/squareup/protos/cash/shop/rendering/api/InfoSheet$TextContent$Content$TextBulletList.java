package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class InfoSheet$TextContent$Content$TextBulletList extends zzkv {
    public final InfoSheet.TextBulletList value;

    public InfoSheet$TextContent$Content$TextBulletList(InfoSheet.TextBulletList textBulletList) {
        textBulletList.getClass();
        this.value = textBulletList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InfoSheet$TextContent$Content$TextBulletList) && Intrinsics.areEqual(this.value, ((InfoSheet$TextContent$Content$TextBulletList) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TextBulletList(value=" + this.value + ")";
    }
}
