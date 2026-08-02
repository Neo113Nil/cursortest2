package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzku;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class HomeSection$Content$ClusterSection extends zzku {
    public final ClusterSection value;

    public HomeSection$Content$ClusterSection(ClusterSection clusterSection) {
        clusterSection.getClass();
        this.value = clusterSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HomeSection$Content$ClusterSection) && Intrinsics.areEqual(this.value, ((HomeSection$Content$ClusterSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ClusterSection(value=" + this.value + ")";
    }
}
