package com.yandex.div.core.view2.spannable;

import O1.EnumC0779dc;
import O1.EnumC0791e6;
import O1.EnumC1169z8;
import O1.Ld;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class SpanData implements Comparable<SpanData> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final EnumC0779dc DEFAULT_FONT_SIZE_UNIT = EnumC0779dc.SP;

    @Nullable
    private final Ld alignmentVertical;
    private final int baselineOffset;
    private final int end;

    @Nullable
    private final String fontFamily;

    @Nullable
    private final String fontFeatureSettings;

    @Nullable
    private final Integer fontSize;

    @NotNull
    private final EnumC0779dc fontSizeUnit;

    @Nullable
    private final JSONObject fontVariationSettings;

    @Nullable
    private final EnumC0791e6 fontWeight;

    @Nullable
    private final Integer fontWeightValue;

    @Nullable
    private final Double letterSpacing;

    @Nullable
    private final Integer lineHeight;
    private final int start;

    @Nullable
    private final EnumC1169z8 strike;

    @Nullable
    private final Integer textColor;

    @Nullable
    private final ShadowData textShadow;

    @Nullable
    private final Integer topOffset;

    @Nullable
    private final Integer topOffsetEnd;

    @Nullable
    private final Integer topOffsetStart;

    @Nullable
    private final EnumC1169z8 underline;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SpanData empty$div_release(int i4, int i5) {
            return new SpanData(i4, i5, null, 0, null, null, null, SpanData.DEFAULT_FONT_SIZE_UNIT, null, null, null, null, null, null, null, null, null, null, null, null);
        }

        @NotNull
        public final SpanData lineHeight$div_release(int i4, int i5, int i6) {
            return new SpanData(i4, i5, null, 0, null, null, null, SpanData.DEFAULT_FONT_SIZE_UNIT, null, null, null, null, Integer.valueOf(i6), null, null, null, null, null, null, null);
        }

        private Companion() {
        }
    }

    public SpanData(int i4, int i5, @Nullable Ld ld, int i6, @Nullable String str, @Nullable String str2, @Nullable Integer num, @NotNull EnumC0779dc fontSizeUnit, @Nullable EnumC0791e6 enumC0791e6, @Nullable Integer num2, @Nullable JSONObject jSONObject, @Nullable Double d4, @Nullable Integer num3, @Nullable EnumC1169z8 enumC1169z8, @Nullable Integer num4, @Nullable ShadowData shadowData, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable EnumC1169z8 enumC1169z82) {
        Intrinsics.checkNotNullParameter(fontSizeUnit, "fontSizeUnit");
        this.start = i4;
        this.end = i5;
        this.alignmentVertical = ld;
        this.baselineOffset = i6;
        this.fontFamily = str;
        this.fontFeatureSettings = str2;
        this.fontSize = num;
        this.fontSizeUnit = fontSizeUnit;
        this.fontWeight = enumC0791e6;
        this.fontWeightValue = num2;
        this.fontVariationSettings = jSONObject;
        this.letterSpacing = d4;
        this.lineHeight = num3;
        this.strike = enumC1169z8;
        this.textColor = num4;
        this.textShadow = shadowData;
        this.topOffset = num5;
        this.topOffsetStart = num6;
        this.topOffsetEnd = num7;
        this.underline = enumC1169z82;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanData)) {
            return false;
        }
        SpanData spanData = (SpanData) obj;
        return this.start == spanData.start && this.end == spanData.end && this.alignmentVertical == spanData.alignmentVertical && this.baselineOffset == spanData.baselineOffset && Intrinsics.areEqual(this.fontFamily, spanData.fontFamily) && Intrinsics.areEqual(this.fontFeatureSettings, spanData.fontFeatureSettings) && Intrinsics.areEqual(this.fontSize, spanData.fontSize) && this.fontSizeUnit == spanData.fontSizeUnit && this.fontWeight == spanData.fontWeight && Intrinsics.areEqual(this.fontWeightValue, spanData.fontWeightValue) && Intrinsics.areEqual(this.fontVariationSettings, spanData.fontVariationSettings) && Intrinsics.areEqual((Object) this.letterSpacing, (Object) spanData.letterSpacing) && Intrinsics.areEqual(this.lineHeight, spanData.lineHeight) && this.strike == spanData.strike && Intrinsics.areEqual(this.textColor, spanData.textColor) && Intrinsics.areEqual(this.textShadow, spanData.textShadow) && Intrinsics.areEqual(this.topOffset, spanData.topOffset) && Intrinsics.areEqual(this.topOffsetStart, spanData.topOffsetStart) && Intrinsics.areEqual(this.topOffsetEnd, spanData.topOffsetEnd) && this.underline == spanData.underline;
    }

    @Nullable
    public final Ld getAlignmentVertical() {
        return this.alignmentVertical;
    }

    public final int getBaselineOffset() {
        return this.baselineOffset;
    }

    public final int getEnd() {
        return this.end;
    }

    @Nullable
    public final String getFontFamily() {
        return this.fontFamily;
    }

    @Nullable
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    @Nullable
    public final Integer getFontSize() {
        return this.fontSize;
    }

    @Nullable
    public final JSONObject getFontVariationSettings() {
        return this.fontVariationSettings;
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
    public final Double getLetterSpacing() {
        return this.letterSpacing;
    }

    @Nullable
    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    public final int getStart() {
        return this.start;
    }

    @Nullable
    public final EnumC1169z8 getStrike() {
        return this.strike;
    }

    @Nullable
    public final Integer getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final ShadowData getTextShadow() {
        return this.textShadow;
    }

    @Nullable
    public final Integer getTopOffset() {
        return this.topOffset;
    }

    @Nullable
    public final Integer getTopOffsetEnd() {
        return this.topOffsetEnd;
    }

    @Nullable
    public final Integer getTopOffsetStart() {
        return this.topOffsetStart;
    }

    @Nullable
    public final EnumC1169z8 getUnderline() {
        return this.underline;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31;
        Ld ld = this.alignmentVertical;
        int hashCode2 = (((hashCode + (ld == null ? 0 : ld.hashCode())) * 31) + Integer.hashCode(this.baselineOffset)) * 31;
        String str = this.fontFamily;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fontFeatureSettings;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.fontSize;
        int hashCode5 = (((hashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.fontSizeUnit.hashCode()) * 31;
        EnumC0791e6 enumC0791e6 = this.fontWeight;
        int hashCode6 = (hashCode5 + (enumC0791e6 == null ? 0 : enumC0791e6.hashCode())) * 31;
        Integer num2 = this.fontWeightValue;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        JSONObject jSONObject = this.fontVariationSettings;
        int hashCode8 = (hashCode7 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        Double d4 = this.letterSpacing;
        int hashCode9 = (hashCode8 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num3 = this.lineHeight;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        EnumC1169z8 enumC1169z8 = this.strike;
        int hashCode11 = (hashCode10 + (enumC1169z8 == null ? 0 : enumC1169z8.hashCode())) * 31;
        Integer num4 = this.textColor;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        ShadowData shadowData = this.textShadow;
        int hashCode13 = (hashCode12 + (shadowData == null ? 0 : shadowData.hashCode())) * 31;
        Integer num5 = this.topOffset;
        int hashCode14 = (hashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.topOffsetStart;
        int hashCode15 = (hashCode14 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.topOffsetEnd;
        int hashCode16 = (hashCode15 + (num7 == null ? 0 : num7.hashCode())) * 31;
        EnumC1169z8 enumC1169z82 = this.underline;
        return hashCode16 + (enumC1169z82 != null ? enumC1169z82.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.alignmentVertical == null && this.baselineOffset == 0 && this.fontFamily == null && this.fontFeatureSettings == null && this.fontSize == null && this.fontSizeUnit == DEFAULT_FONT_SIZE_UNIT && this.fontWeight == null && this.fontWeightValue == null && this.letterSpacing == null && this.lineHeight == null && this.strike == null && this.textColor == null && this.textShadow == null && this.topOffset == null && this.topOffsetStart == null && this.topOffsetEnd == null && this.underline == null;
    }

    @NotNull
    public final SpanData mergeWith(@NotNull SpanData span, int i4, int i5) {
        Intrinsics.checkNotNullParameter(span, "span");
        Ld ld = span.alignmentVertical;
        if (ld == null) {
            ld = this.alignmentVertical;
        }
        Ld ld2 = ld;
        int i6 = span.baselineOffset;
        if (i6 == 0) {
            i6 = this.baselineOffset;
        }
        int i7 = i6;
        String str = span.fontFamily;
        if (str == null) {
            str = this.fontFamily;
        }
        String str2 = str;
        String str3 = span.fontFeatureSettings;
        if (str3 == null) {
            str3 = this.fontFeatureSettings;
        }
        String str4 = str3;
        Integer num = span.fontSize;
        if (num == null) {
            num = this.fontSize;
        }
        Integer num2 = num;
        EnumC0779dc enumC0779dc = span.fontSizeUnit;
        if (enumC0779dc == DEFAULT_FONT_SIZE_UNIT) {
            enumC0779dc = this.fontSizeUnit;
        }
        EnumC0779dc enumC0779dc2 = enumC0779dc;
        EnumC0791e6 enumC0791e6 = span.fontWeight;
        if (enumC0791e6 == null) {
            enumC0791e6 = this.fontWeight;
        }
        EnumC0791e6 enumC0791e62 = enumC0791e6;
        Integer num3 = span.fontWeightValue;
        if (num3 == null) {
            num3 = this.fontWeightValue;
        }
        Integer num4 = num3;
        JSONObject jSONObject = span.fontVariationSettings;
        if (jSONObject == null) {
            jSONObject = this.fontVariationSettings;
        }
        JSONObject jSONObject2 = jSONObject;
        Double d4 = span.letterSpacing;
        if (d4 == null) {
            d4 = this.letterSpacing;
        }
        Double d5 = d4;
        Integer num5 = span.lineHeight;
        if (num5 == null) {
            num5 = this.lineHeight;
        }
        Integer num6 = num5;
        EnumC1169z8 enumC1169z8 = span.strike;
        if (enumC1169z8 == null) {
            enumC1169z8 = this.strike;
        }
        EnumC1169z8 enumC1169z82 = enumC1169z8;
        Integer num7 = span.textColor;
        if (num7 == null) {
            num7 = this.textColor;
        }
        Integer num8 = num7;
        ShadowData shadowData = span.textShadow;
        if (shadowData == null) {
            shadowData = this.textShadow;
        }
        ShadowData shadowData2 = shadowData;
        Integer num9 = span.topOffset;
        Integer num10 = num9 == null ? this.topOffset : num9;
        Integer num11 = num9 != null ? span.topOffsetStart : this.topOffsetStart;
        Integer num12 = num9 != null ? span.topOffsetEnd : this.topOffsetEnd;
        EnumC1169z8 enumC1169z83 = span.underline;
        if (enumC1169z83 == null) {
            enumC1169z83 = this.underline;
        }
        return new SpanData(i4, i5, ld2, i7, str2, str4, num2, enumC0779dc2, enumC0791e62, num4, jSONObject2, d5, num6, enumC1169z82, num8, shadowData2, num10, num11, num12, enumC1169z83);
    }

    @NotNull
    public String toString() {
        return "SpanData(start=" + this.start + ", end=" + this.end + ", alignmentVertical=" + this.alignmentVertical + ", baselineOffset=" + this.baselineOffset + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", fontSize=" + this.fontSize + ", fontSizeUnit=" + this.fontSizeUnit + ", fontWeight=" + this.fontWeight + ", fontWeightValue=" + this.fontWeightValue + ", fontVariationSettings=" + this.fontVariationSettings + ", letterSpacing=" + this.letterSpacing + ", lineHeight=" + this.lineHeight + ", strike=" + this.strike + ", textColor=" + this.textColor + ", textShadow=" + this.textShadow + ", topOffset=" + this.topOffset + ", topOffsetStart=" + this.topOffsetStart + ", topOffsetEnd=" + this.topOffsetEnd + ", underline=" + this.underline + ')';
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull SpanData other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.start - other.start;
    }
}
