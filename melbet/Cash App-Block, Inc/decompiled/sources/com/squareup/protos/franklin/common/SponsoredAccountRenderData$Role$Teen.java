package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzdy;
import com.squareup.protos.franklin.common.SponsoredAccountRenderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SponsoredAccountRenderData$Role$Teen extends zzdy {
    public final SponsoredAccountRenderData.Teen value;

    public SponsoredAccountRenderData$Role$Teen(SponsoredAccountRenderData.Teen teen) {
        teen.getClass();
        this.value = teen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SponsoredAccountRenderData$Role$Teen) && Intrinsics.areEqual(this.value, ((SponsoredAccountRenderData$Role$Teen) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Teen(value=" + this.value + ")";
    }
}
