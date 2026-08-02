package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020+H\u0016J\u001a\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc_MdocComponentStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$MdocComponentStyle;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableButtonBasedPaddingStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;", "nullableButtonBasedWidthStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;", "nullableButtonBasedHeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;", "nullableButtonBasedJustifyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;", "nullableButtonBasedMarginStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;", "nullableButtonBasedBorderRadiusStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;", "nullableComplexTextBasedFontFamilyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "nullableComplexTextBasedFontSizeStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "nullableComplexTextBasedFontWeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "nullableComplexTextBasedLetterSpacingStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "nullableComplexTextBasedLineHeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "nullableComplexTextBasedTextColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "nullableButtonBasedBackgroundColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;", "nullableButtonBasedBorderColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;", "nullableButtonBasedBorderWidthStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Mdoc_MdocComponentStyleJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableButtonBasedBackgroundColorStyleAdapter;
    private final JsonAdapter nullableButtonBasedBorderColorStyleAdapter;
    private final JsonAdapter nullableButtonBasedBorderRadiusStyleAdapter;
    private final JsonAdapter nullableButtonBasedBorderWidthStyleAdapter;
    private final JsonAdapter nullableButtonBasedHeightStyleAdapter;
    private final JsonAdapter nullableButtonBasedJustifyStyleAdapter;
    private final JsonAdapter nullableButtonBasedMarginStyleAdapter;
    private final JsonAdapter nullableButtonBasedPaddingStyleAdapter;
    private final JsonAdapter nullableButtonBasedWidthStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedFontFamilyStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedFontSizeStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedFontWeightStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedLetterSpacingStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedLineHeightStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedTextColorStyleAdapter;
    private final JsonReader.Options options;

    public Mdoc_MdocComponentStyleJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("padding", "width", "height", "justify", "margin", "borderRadius", "fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "backgroundColor", "borderColor", "borderWidth");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableButtonBasedPaddingStyleAdapter = moshi.adapter(AttributeStyles.ButtonBasedPaddingStyle.class, emptySet, "padding");
        this.nullableButtonBasedWidthStyleAdapter = moshi.adapter(AttributeStyles.ButtonBasedWidthStyle.class, emptySet, "width");
        this.nullableButtonBasedHeightStyleAdapter = moshi.adapter(AttributeStyles.ButtonBasedHeightStyle.class, emptySet, "height");
        this.nullableButtonBasedJustifyStyleAdapter = moshi.adapter(AttributeStyles.ButtonBasedJustifyStyle.class, emptySet, "justify");
        this.nullableButtonBasedMarginStyleAdapter = moshi.adapter(AttributeStyles.ButtonBasedMarginStyle.class, emptySet, "margin");
        this.nullableButtonBasedBorderRadiusStyleAdapter = moshi.adapter(AttributeStyles.ButtonBasedBorderRadiusStyle.class, emptySet, "borderRadius");
        this.nullableComplexTextBasedFontFamilyStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedFontFamilyStyle.class, emptySet, "fontFamily");
        this.nullableComplexTextBasedFontSizeStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedFontSizeStyle.class, emptySet, "fontSize");
        this.nullableComplexTextBasedFontWeightStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedFontWeightStyle.class, emptySet, "fontWeight");
        this.nullableComplexTextBasedLetterSpacingStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedLetterSpacingStyle.class, emptySet, "letterSpacing");
        this.nullableComplexTextBasedLineHeightStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedLineHeightStyle.class, emptySet, "lineHeight");
        this.nullableComplexTextBasedTextColorStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedTextColorStyle.class, emptySet, "textColor");
        this.nullableButtonBasedBackgroundColorStyleAdapter = moshi.adapter(AttributeStyles.ButtonBasedBackgroundColorStyle.class, emptySet, "backgroundColor");
        this.nullableButtonBasedBorderColorStyleAdapter = moshi.adapter(AttributeStyles.ButtonBasedBorderColorStyle.class, emptySet, "borderColor");
        this.nullableButtonBasedBorderWidthStyleAdapter = moshi.adapter(AttributeStyles.ButtonBasedBorderWidthStyle.class, emptySet, "borderWidth");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Mdoc.MdocComponentStyle fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle = null;
        AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle = null;
        AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle = null;
        AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle = null;
        AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle = null;
        AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle = null;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = null;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = null;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = null;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = null;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = null;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = null;
        AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = null;
        AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = null;
        AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    buttonBasedPaddingStyle = (AttributeStyles.ButtonBasedPaddingStyle) this.nullableButtonBasedPaddingStyleAdapter.fromJson(reader);
                    break;
                case 1:
                    buttonBasedWidthStyle = (AttributeStyles.ButtonBasedWidthStyle) this.nullableButtonBasedWidthStyleAdapter.fromJson(reader);
                    break;
                case 2:
                    buttonBasedHeightStyle = (AttributeStyles.ButtonBasedHeightStyle) this.nullableButtonBasedHeightStyleAdapter.fromJson(reader);
                    break;
                case 3:
                    buttonBasedJustifyStyle = (AttributeStyles.ButtonBasedJustifyStyle) this.nullableButtonBasedJustifyStyleAdapter.fromJson(reader);
                    break;
                case 4:
                    buttonBasedMarginStyle = (AttributeStyles.ButtonBasedMarginStyle) this.nullableButtonBasedMarginStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    buttonBasedBorderRadiusStyle = (AttributeStyles.ButtonBasedBorderRadiusStyle) this.nullableButtonBasedBorderRadiusStyleAdapter.fromJson(reader);
                    break;
                case 6:
                    complexTextBasedFontFamilyStyle = (AttributeStyles.ComplexTextBasedFontFamilyStyle) this.nullableComplexTextBasedFontFamilyStyleAdapter.fromJson(reader);
                    break;
                case 7:
                    complexTextBasedFontSizeStyle = (AttributeStyles.ComplexTextBasedFontSizeStyle) this.nullableComplexTextBasedFontSizeStyleAdapter.fromJson(reader);
                    break;
                case 8:
                    complexTextBasedFontWeightStyle = (AttributeStyles.ComplexTextBasedFontWeightStyle) this.nullableComplexTextBasedFontWeightStyleAdapter.fromJson(reader);
                    break;
                case 9:
                    complexTextBasedLetterSpacingStyle = (AttributeStyles.ComplexTextBasedLetterSpacingStyle) this.nullableComplexTextBasedLetterSpacingStyleAdapter.fromJson(reader);
                    break;
                case 10:
                    complexTextBasedLineHeightStyle = (AttributeStyles.ComplexTextBasedLineHeightStyle) this.nullableComplexTextBasedLineHeightStyleAdapter.fromJson(reader);
                    break;
                case 11:
                    complexTextBasedTextColorStyle = (AttributeStyles.ComplexTextBasedTextColorStyle) this.nullableComplexTextBasedTextColorStyleAdapter.fromJson(reader);
                    break;
                case 12:
                    buttonBasedBackgroundColorStyle = (AttributeStyles.ButtonBasedBackgroundColorStyle) this.nullableButtonBasedBackgroundColorStyleAdapter.fromJson(reader);
                    break;
                case 13:
                    buttonBasedBorderColorStyle = (AttributeStyles.ButtonBasedBorderColorStyle) this.nullableButtonBasedBorderColorStyleAdapter.fromJson(reader);
                    break;
                case 14:
                    buttonBasedBorderWidthStyle = (AttributeStyles.ButtonBasedBorderWidthStyle) this.nullableButtonBasedBorderWidthStyleAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new Mdoc.MdocComponentStyle(buttonBasedPaddingStyle, buttonBasedWidthStyle, buttonBasedHeightStyle, buttonBasedJustifyStyle, buttonBasedMarginStyle, buttonBasedBorderRadiusStyle, complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, complexTextBasedTextColorStyle, buttonBasedBackgroundColorStyle, buttonBasedBorderColorStyle, buttonBasedBorderWidthStyle);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, Mdoc.MdocComponentStyle value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("padding");
        this.nullableButtonBasedPaddingStyleAdapter.toJson(writer, value_.getPadding());
        writer.name("width");
        this.nullableButtonBasedWidthStyleAdapter.toJson(writer, value_.getWidth());
        writer.name("height");
        this.nullableButtonBasedHeightStyleAdapter.toJson(writer, value_.getHeight());
        writer.name("justify");
        this.nullableButtonBasedJustifyStyleAdapter.toJson(writer, value_.getJustify());
        writer.name("margin");
        this.nullableButtonBasedMarginStyleAdapter.toJson(writer, value_.getMargin());
        writer.name("borderRadius");
        this.nullableButtonBasedBorderRadiusStyleAdapter.toJson(writer, value_.getBorderRadius());
        writer.name("fontFamily");
        this.nullableComplexTextBasedFontFamilyStyleAdapter.toJson(writer, value_.getFontFamily());
        writer.name("fontSize");
        this.nullableComplexTextBasedFontSizeStyleAdapter.toJson(writer, value_.getFontSize());
        writer.name("fontWeight");
        this.nullableComplexTextBasedFontWeightStyleAdapter.toJson(writer, value_.getFontWeight());
        writer.name("letterSpacing");
        this.nullableComplexTextBasedLetterSpacingStyleAdapter.toJson(writer, value_.getLetterSpacing());
        writer.name("lineHeight");
        this.nullableComplexTextBasedLineHeightStyleAdapter.toJson(writer, value_.getLineHeight());
        writer.name("textColor");
        this.nullableComplexTextBasedTextColorStyleAdapter.toJson(writer, value_.getTextColor());
        writer.name("backgroundColor");
        this.nullableButtonBasedBackgroundColorStyleAdapter.toJson(writer, value_.getBackgroundColor());
        writer.name("borderColor");
        this.nullableButtonBasedBorderColorStyleAdapter.toJson(writer, value_.getBorderColor());
        writer.name("borderWidth");
        this.nullableButtonBasedBorderWidthStyleAdapter.toJson(writer, value_.getBorderWidth());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(45, "GeneratedJsonAdapter(Mdoc.MdocComponentStyle)");
    }
}
