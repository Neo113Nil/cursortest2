package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.squareup.protos.cash.shop.rendering.api.UpsellCardSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class UpsellCardSection$TrailingContent$LogoStack extends zzlg {
    public final UpsellCardSection.AvatarStack value;

    public UpsellCardSection$TrailingContent$LogoStack(UpsellCardSection.AvatarStack avatarStack) {
        avatarStack.getClass();
        this.value = avatarStack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpsellCardSection$TrailingContent$LogoStack) && Intrinsics.areEqual(this.value, ((UpsellCardSection$TrailingContent$LogoStack) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LogoStack(value=" + this.value + ")";
    }
}
