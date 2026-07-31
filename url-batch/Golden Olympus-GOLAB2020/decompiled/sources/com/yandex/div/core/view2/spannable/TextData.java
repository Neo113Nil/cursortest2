package com.yandex.div.core.view2.spannable;

import O1.EnumC0779dc;
import O1.EnumC0791e6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class TextData {

    @Nullable
    private final String fontFamily;
    private final int fontSize;

    @NotNull
    private final EnumC0779dc fontSizeUnit;
    private final int fontSizeValue;

    @Nullable
    private final EnumC0791e6 fontWeight;

    @Nullable
    private final Integer fontWeightValue;

    @Nullable
    private final Integer lineHeight;

    @NotNull
    private final String text;
    private final int textColor;
    private final int textLength;

    public TextData(@NotNull String text, int i4, int i5, @NotNull EnumC0779dc fontSizeUnit, @Nullable String str, @Nullable EnumC0791e6 enumC0791e6, @Nullable Integer num, @Nullable Integer num2, int i6) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontSizeUnit, "fontSizeUnit");
        this.text = text;
        this.fontSize = i4;
        this.fontSizeValue = i5;
        this.fontSizeUnit = fontSizeUnit;
        this.fontFamily = str;
        this.fontWeight = enumC0791e6;
        this.fontWeightValue = num;
        this.lineHeight = num2;
        this.textColor = i6;
        this.textLength = text.length();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextData)) {
            return false;
        }
        TextData textData = (TextData) obj;
        return Intrinsics.areEqual(this.text, textData.text) && this.fontSize == textData.fontSize && this.fontSizeValue == textData.fontSizeValue && this.fontSizeUnit == textData.fontSizeUnit && Intrinsics.areEqual(this.fontFamily, textData.fontFamily) && this.fontWeight == textData.fontWeight && Intrinsics.areEqual(this.fontWeightValue, textData.fontWeightValue) && Intrinsics.areEqual(this.lineHeight, textData.lineHeight) && this.textColor == textData.textColor;
    }

    @Nullable
    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final int getFontSizeValue() {
        return this.fontSizeValue;
    }

    @Nullable
    public final EnumC0791e6 getFontWeight() {
        return this.fontWeight;
    }

    @Nullable
    public final Integer getFontWeightValue() {
        return this.fontWeightValue;
    }

    @Nullable
    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTextLength() {
        return this.textLength;
    }

    public int hashCode() {
        int hashCode = ((((((this.text.hashCode() * 31) + Integer.hashCode(this.fontSize)) * 31) + Integer.hashCode(this.fontSizeValue)) * 31) + this.fontSizeUnit.hashCode()) * 31;
        String str = this.fontFamily;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EnumC0791e6 enumC0791e6 = this.fontWeight;
        int hashCode3 = (hashCode2 + (enumC0791e6 == null ? 0 : enumC0791e6.hashCode())) * 31;
        Integer num = this.fontWeightValue;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lineHeight;
        return ((hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31) + Integer.hashCode(this.textColor);
    }

    @NotNull
    public String toString() {
        return "TextData(text=" + this.text + ", fontSize=" + this.fontSize + ", fontSizeValue=" + this.fontSizeValue + ", fontSizeUnit=" + this.fontSizeUnit + ", fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontWeightValue=" + this.fontWeightValue + ", lineHeight=" + this.lineHeight + ", textColor=" + this.textColor + ')';
    }
}
