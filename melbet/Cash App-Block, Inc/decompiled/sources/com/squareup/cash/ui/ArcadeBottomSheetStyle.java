package com.squareup.cash.ui;

import android.util.Size;
import androidx.compose.ui.graphics.ColorKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ArcadeBottomSheetStyle implements BottomSheetStyle {
    public final Colors arcadeColors;
    public final int backgroundColor;
    public final BottomSheetHandleConfig bottomSheetHandleConfig;
    public final int cornerRadiusDp;
    public final int scrimColor;

    public ArcadeBottomSheetStyle(Colors colors) {
        colors.getClass();
        this.arcadeColors = colors;
        this.backgroundColor = ColorKt.m694toArgb8_81llA(colors.semantic.background.f1047app);
        Colors.Component component = colors.component;
        this.scrimColor = ColorKt.m694toArgb8_81llA(component.ui.dimmer.background);
        Object obj = DefaultSizes.border.entries;
        this.cornerRadiusDp = 40;
        DefaultSizes.spacing.getClass();
        this.bottomSheetHandleConfig = new BottomSheetHandleConfig(8, 32, new Size(36, 5), ColorKt.m694toArgb8_81llA(component.sheet.handle.border), 9999.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeBottomSheetStyle) && Intrinsics.areEqual(this.arcadeColors, ((ArcadeBottomSheetStyle) obj).arcadeColors);
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
        return this.arcadeColors.hashCode();
    }

    public final String toString() {
        return "ArcadeBottomSheetStyle(arcadeColors=" + this.arcadeColors + ")";
    }
}
