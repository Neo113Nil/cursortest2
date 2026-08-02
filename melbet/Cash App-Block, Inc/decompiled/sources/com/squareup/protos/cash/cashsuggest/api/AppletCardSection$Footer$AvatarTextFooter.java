package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.toolbar.LocalToolbarKt;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppletCardSection$Footer$AvatarTextFooter extends LocalToolbarKt {
    public final AppletCardSection.AvatarTextFooter value;

    public AppletCardSection$Footer$AvatarTextFooter(AppletCardSection.AvatarTextFooter avatarTextFooter) {
        avatarTextFooter.getClass();
        this.value = avatarTextFooter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppletCardSection$Footer$AvatarTextFooter) && Intrinsics.areEqual(this.value, ((AppletCardSection$Footer$AvatarTextFooter) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AvatarTextFooter(value=" + this.value + ")";
    }
}
