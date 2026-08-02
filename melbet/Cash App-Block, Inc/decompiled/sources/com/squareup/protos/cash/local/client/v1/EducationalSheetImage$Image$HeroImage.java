package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhu;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class EducationalSheetImage$Image$HeroImage extends zzhu {
    public final LocalImage value;

    public EducationalSheetImage$Image$HeroImage(LocalImage localImage) {
        localImage.getClass();
        this.value = localImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EducationalSheetImage$Image$HeroImage) && Intrinsics.areEqual(this.value, ((EducationalSheetImage$Image$HeroImage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "HeroImage(value=" + this.value + ")";
    }
}
