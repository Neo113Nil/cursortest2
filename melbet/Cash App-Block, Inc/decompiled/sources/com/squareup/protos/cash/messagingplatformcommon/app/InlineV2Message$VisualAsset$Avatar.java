package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.ui.UiAvatar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InlineV2Message$VisualAsset$Avatar {
    public final UiAvatar value;

    public InlineV2Message$VisualAsset$Avatar(UiAvatar uiAvatar) {
        uiAvatar.getClass();
        this.value = uiAvatar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InlineV2Message$VisualAsset$Avatar) && Intrinsics.areEqual(this.value, ((InlineV2Message$VisualAsset$Avatar) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Avatar(value=", ")");
    }
}
