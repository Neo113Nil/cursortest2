package com.yandex.div.internal.widget.slider;

import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class SliderTextStyle {
    private final float fontSize;

    @Nullable
    private final String fontVariations;

    @NotNull
    private final Typeface fontWeight;
    private final float offsetX;
    private final float offsetY;
    private final float spacing;
    private final int textColor;

    public SliderTextStyle(float f4, float f5, @NotNull Typeface fontWeight, float f6, float f7, int i4, @Nullable String str) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        this.fontSize = f4;
        this.spacing = f5;
        this.fontWeight = fontWeight;
        this.offsetX = f6;
        this.offsetY = f7;
        this.textColor = i4;
        this.fontVariations = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SliderTextStyle)) {
            return false;
        }
        SliderTextStyle sliderTextStyle = (SliderTextStyle) obj;
        return Float.compare(this.fontSize, sliderTextStyle.fontSize) == 0 && Float.compare(this.spacing, sliderTextStyle.spacing) == 0 && Intrinsics.areEqual(this.fontWeight, sliderTextStyle.fontWeight) && Float.compare(this.offsetX, sliderTextStyle.offsetX) == 0 && Float.compare(this.offsetY, sliderTextStyle.offsetY) == 0 && this.textColor == sliderTextStyle.textColor && Intrinsics.areEqual(this.fontVariations, sliderTextStyle.fontVariations);
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    @Nullable
    public final String getFontVariations() {
        return this.fontVariations;
    }

    @NotNull
    public final Typeface getFontWeight() {
        return this.fontWeight;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getSpacing() {
        return this.spacing;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int hashCode = ((((((((((Float.hashCode(this.fontSize) * 31) + Float.hashCode(this.spacing)) * 31) + this.fontWeight.hashCode()) * 31) + Float.hashCode(this.offsetX)) * 31) + Float.hashCode(this.offsetY)) * 31) + Integer.hashCode(this.textColor)) * 31;
        String str = this.fontVariations;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "SliderTextStyle(fontSize=" + this.fontSize + ", spacing=" + this.spacing + ", fontWeight=" + this.fontWeight + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", textColor=" + this.textColor + ", fontVariations=" + this.fontVariations + ')';
    }
}
