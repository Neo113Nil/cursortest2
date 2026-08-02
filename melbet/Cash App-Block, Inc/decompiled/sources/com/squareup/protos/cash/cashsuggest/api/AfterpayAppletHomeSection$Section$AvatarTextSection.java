package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import com.squareup.protos.cash.shop.rendering.api.AvatarTextSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$AvatarTextSection extends LocalMenuHoursViewKt {
    public final AvatarTextSection value;

    public AfterpayAppletHomeSection$Section$AvatarTextSection(AvatarTextSection avatarTextSection) {
        avatarTextSection.getClass();
        this.value = avatarTextSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$AvatarTextSection) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$AvatarTextSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AvatarTextSection(value=" + this.value + ")";
    }
}
