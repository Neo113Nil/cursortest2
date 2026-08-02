package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzdy;
import com.squareup.protos.franklin.common.SponsoredAccountRenderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SponsoredAccountRenderData$Role$Parent extends zzdy {
    public final SponsoredAccountRenderData.Parent value;

    public SponsoredAccountRenderData$Role$Parent(SponsoredAccountRenderData.Parent parent) {
        parent.getClass();
        this.value = parent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SponsoredAccountRenderData$Role$Parent) && Intrinsics.areEqual(this.value, ((SponsoredAccountRenderData$Role$Parent) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Parent(value=" + this.value + ")";
    }
}
