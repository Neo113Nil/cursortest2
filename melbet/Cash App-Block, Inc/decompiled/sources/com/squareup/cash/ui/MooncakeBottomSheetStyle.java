package com.squareup.cash.ui;

import android.graphics.Color;
import android.util.Size;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class MooncakeBottomSheetStyle implements BottomSheetStyle {
    public final int backgroundColor;
    public final BottomSheetHandleConfig bottomSheetHandleConfig;
    public final int cornerRadiusDp;
    public final int scrimColor;
    public final ThemeInfo themeInfo;

    public MooncakeBottomSheetStyle(ThemeInfo themeInfo) {
        ColorPalette colorPalette = themeInfo.colorPalette;
        int i = colorPalette.elevatedBackground;
        int argb = Color.argb(119, 0, 0, 0);
        this.themeInfo = themeInfo;
        this.backgroundColor = i;
        this.scrimColor = argb;
        this.cornerRadiusDp = 24;
        this.bottomSheetHandleConfig = new BottomSheetHandleConfig(13, 13, new Size(32, 6), colorPalette.dragHandle, 4.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MooncakeBottomSheetStyle)) {
            return false;
        }
        MooncakeBottomSheetStyle mooncakeBottomSheetStyle = (MooncakeBottomSheetStyle) obj;
        return Intrinsics.areEqual(this.themeInfo, mooncakeBottomSheetStyle.themeInfo) && this.backgroundColor == mooncakeBottomSheetStyle.backgroundColor && this.scrimColor == mooncakeBottomSheetStyle.scrimColor;
    }

    @Override // com.squareup.cash.ui.BottomSheetStyle
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.squareup.cash.ui.BottomSheetStyle
    public final BottomSheetHandleConfig getBottomSheetHandleConfig() {
        return this.bottomSheetHandleConfig;
    }

    @Override // com.squareup.cash.ui.BottomSheetStyle
    public final int getCornerRadiusDp() {
        return this.cornerRadiusDp;
    }

    @Override // com.squareup.cash.ui.BottomSheetStyle
    public final int getScrimColor() {
        return this.scrimColor;
    }

    public final int hashCode() {
        return Integer.hashCode(this.scrimColor) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.backgroundColor, this.themeInfo.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MooncakeBottomSheetStyle(themeInfo=");
        sb.append(this.themeInfo);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", scrimColor=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.scrimColor, ")", sb);
    }
}
