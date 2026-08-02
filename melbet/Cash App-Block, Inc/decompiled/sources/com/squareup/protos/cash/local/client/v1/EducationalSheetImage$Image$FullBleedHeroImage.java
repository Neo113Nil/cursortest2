package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhu;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class EducationalSheetImage$Image$FullBleedHeroImage extends zzhu {
    public final LocalImage value;

    public EducationalSheetImage$Image$FullBleedHeroImage(LocalImage localImage) {
        localImage.getClass();
        this.value = localImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EducationalSheetImage$Image$FullBleedHeroImage) && Intrinsics.areEqual(this.value, ((EducationalSheetImage$Image$FullBleedHeroImage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "FullBleedHeroImage(value=" + this.value + ")";
    }
}
