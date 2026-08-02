package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhu;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class EducationalSheetImage$Image$TiledHeroImage extends zzhu {
    public final TiledHeroImage value;

    public EducationalSheetImage$Image$TiledHeroImage(TiledHeroImage tiledHeroImage) {
        tiledHeroImage.getClass();
        this.value = tiledHeroImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EducationalSheetImage$Image$TiledHeroImage) && Intrinsics.areEqual(this.value, ((EducationalSheetImage$Image$TiledHeroImage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TiledHeroImage(value=" + this.value + ")";
    }
}
