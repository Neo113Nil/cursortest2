package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class UpsellCardSection$Cta$CtaButtonV2 extends zzlf {
    public final Button value;

    public UpsellCardSection$Cta$CtaButtonV2(Button button) {
        button.getClass();
        this.value = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpsellCardSection$Cta$CtaButtonV2) && Intrinsics.areEqual(this.value, ((UpsellCardSection$Cta$CtaButtonV2) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CtaButtonV2(value=" + this.value + ")";
    }
}
