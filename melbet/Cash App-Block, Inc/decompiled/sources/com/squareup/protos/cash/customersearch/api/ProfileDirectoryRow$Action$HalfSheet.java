package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.internal.bridge.InternalSerializersKt;
import com.squareup.protos.cash.p2p.profile_directory.ui.ShopInfoHalfSheet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProfileDirectoryRow$Action$HalfSheet extends InternalSerializersKt {
    public final ShopInfoHalfSheet value;

    public ProfileDirectoryRow$Action$HalfSheet(ShopInfoHalfSheet shopInfoHalfSheet) {
        shopInfoHalfSheet.getClass();
        this.value = shopInfoHalfSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileDirectoryRow$Action$HalfSheet) && Intrinsics.areEqual(this.value, ((ProfileDirectoryRow$Action$HalfSheet) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "HalfSheet(value=" + this.value + ")";
    }
}
