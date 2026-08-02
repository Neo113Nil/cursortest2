package com.squareup.protos.cash.shop.rendering.api;

import com.datadog.android.rum.model.LongTaskEvent;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.ui.UiAvatar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class UpsellSheet$TopContent$Avatar extends LongTaskEvent.Companion {
    public final UiAvatar value;

    public UpsellSheet$TopContent$Avatar(UiAvatar uiAvatar) {
        uiAvatar.getClass();
        this.value = uiAvatar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpsellSheet$TopContent$Avatar) && Intrinsics.areEqual(this.value, ((UpsellSheet$TopContent$Avatar) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Avatar(value=", ")");
    }
}
