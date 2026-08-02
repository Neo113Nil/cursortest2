package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class HeroSection$HeroTile$FooterDetail$Detail$CountdownCaption extends zzkt {
    public final CountdownCaption value;

    public HeroSection$HeroTile$FooterDetail$Detail$CountdownCaption(CountdownCaption countdownCaption) {
        countdownCaption.getClass();
        this.value = countdownCaption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HeroSection$HeroTile$FooterDetail$Detail$CountdownCaption) && Intrinsics.areEqual(this.value, ((HeroSection$HeroTile$FooterDetail$Detail$CountdownCaption) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CountdownCaption(value=" + this.value + ")";
    }
}
