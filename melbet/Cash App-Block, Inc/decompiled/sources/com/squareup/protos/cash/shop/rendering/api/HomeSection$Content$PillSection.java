package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzku;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class HomeSection$Content$PillSection extends zzku {
    public final PillSection value;

    public HomeSection$Content$PillSection(PillSection pillSection) {
        pillSection.getClass();
        this.value = pillSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HomeSection$Content$PillSection) && Intrinsics.areEqual(this.value, ((HomeSection$Content$PillSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PillSection(value=" + this.value + ")";
    }
}
