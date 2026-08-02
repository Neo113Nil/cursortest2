package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzlc;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class RowSection$Row$Type$AvatarRow extends zzlc {
    public final RowSection.AvatarRow value;

    public RowSection$Row$Type$AvatarRow(RowSection.AvatarRow avatarRow) {
        avatarRow.getClass();
        this.value = avatarRow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RowSection$Row$Type$AvatarRow) && Intrinsics.areEqual(this.value, ((RowSection$Row$Type$AvatarRow) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AvatarRow(value=" + this.value + ")";
    }
}
