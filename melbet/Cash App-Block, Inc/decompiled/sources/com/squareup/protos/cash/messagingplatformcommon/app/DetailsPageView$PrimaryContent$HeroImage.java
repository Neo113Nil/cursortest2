package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjq;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DetailsPageView$PrimaryContent$HeroImage extends zzjq {
    public final HeroImage value;

    public DetailsPageView$PrimaryContent$HeroImage(HeroImage heroImage) {
        heroImage.getClass();
        this.value = heroImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetailsPageView$PrimaryContent$HeroImage) && Intrinsics.areEqual(this.value, ((DetailsPageView$PrimaryContent$HeroImage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "HeroImage(value=" + this.value + ")";
    }
}
