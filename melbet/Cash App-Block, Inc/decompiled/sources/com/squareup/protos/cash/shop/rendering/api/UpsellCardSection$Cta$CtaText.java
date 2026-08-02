package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import com.squareup.protos.cash.localization.LocalizedString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class UpsellCardSection$Cta$CtaText extends zzlf {
    public final LocalizedString value;

    public UpsellCardSection$Cta$CtaText(LocalizedString localizedString) {
        localizedString.getClass();
        this.value = localizedString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpsellCardSection$Cta$CtaText) && Intrinsics.areEqual(this.value, ((UpsellCardSection$Cta$CtaText) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CtaText(value=" + this.value + ")";
    }
}
