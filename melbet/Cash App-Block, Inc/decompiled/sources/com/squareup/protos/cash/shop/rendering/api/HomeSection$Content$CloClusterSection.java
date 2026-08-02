package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzku;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class HomeSection$Content$CloClusterSection extends zzku {
    public final CLOClusterSection value;

    public HomeSection$Content$CloClusterSection(CLOClusterSection cLOClusterSection) {
        cLOClusterSection.getClass();
        this.value = cLOClusterSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HomeSection$Content$CloClusterSection) && Intrinsics.areEqual(this.value, ((HomeSection$Content$CloClusterSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CloClusterSection(value=" + this.value + ")";
    }
}
