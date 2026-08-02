package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'H\u0016J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate_InputDateComponentStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate$InputDateComponentStyle;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableComplexTextBasedFontFamilyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "nullableComplexTextBasedFontSizeStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "nullableComplexTextBasedFontWeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "nullableComplexTextBasedLetterSpacingStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "nullableComplexTextBasedLineHeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "nullableDateSelectTextColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectTextColorStyle;", "nullableDateSelectBorderRadiusStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBorderRadiusStyle;", "nullableDateSelectBorderWidthStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBorderWidthStyle;", "nullableDateSelectBackgroundColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBackgroundColorStyle;", "nullableDateSelectBorderColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBorderColorStyle;", "nullableInputMarginStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "nullableTextBasedJustifyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;", "nullableDateSelectStrokeColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectStrokeColorStyle;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InputDate_InputDateComponentStyleJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableComplexTextBasedFontFamilyStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedFontSizeStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedFontWeightStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedLetterSpacingStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedLineHeightStyleAdapter;
    private final JsonAdapter nullableDateSelectBackgroundColorStyleAdapter;
    private final JsonAdapter nullableDateSelectBorderColorStyleAdapter;
    private final JsonAdapter nullableDateSelectBorderRadiusStyleAdapter;
    private final JsonAdapter nullableDateSelectBorderWidthStyleAdapter;
    private final JsonAdapter nullableDateSelectStrokeColorStyleAdapter;
    private final JsonAdapter nullableDateSelectTextColorStyleAdapter;
    private final JsonAdapter nullableInputMarginStyleAdapter;
    private final JsonAdapter nullableTextBasedJustifyStyleAdapter;
    private final JsonReader.Options options;

    public InputDate_InputDateComponentStyleJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "borderRadius", "borderWidth", "backgroundColor", "borderColor", "margin", "justify", "strokeColor");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableComplexTextBasedFontFamilyStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedFontFamilyStyle.class, emptySet, "fontFamily");
        this.nullableComplexTextBasedFontSizeStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedFontSizeStyle.class, emptySet, "fontSize");
        this.nullableComplexTextBasedFontWeightStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedFontWeightStyle.class, emptySet, "fontWeight");
        this.nullableComplexTextBasedLetterSpacingStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedLetterSpacingStyle.class, emptySet, "letterSpacing");
        this.nullableComplexTextBasedLineHeightStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedLineHeightStyle.class, emptySet, "lineHeight");
        this.nullableDateSelectTextColorStyleAdapter = moshi.adapter(AttributeStyles.DateSelectTextColorStyle.class, emptySet, "textColor");
        this.nullableDateSelectBorderRadiusStyleAdapter = moshi.adapter(AttributeStyles.DateSelectBorderRadiusStyle.class, emptySet, "borderRadius");
        this.nullableDateSelectBorderWidthStyleAdapter = moshi.adapter(AttributeStyles.DateSelectBorderWidthStyle.class, emptySet, "borderWidth");
        this.nullableDateSelectBackgroundColorStyleAdapter = moshi.adapter(AttributeStyles.DateSelectBackgroundColorStyle.class, emptySet, "backgroundColor");
        this.nullableDateSelectBorderColorStyleAdapter = moshi.adapter(AttributeStyles.DateSelectBorderColorStyle.class, emptySet, "borderColor");
        this.nullableInputMarginStyleAdapter = moshi.adapter(AttributeStyles.InputMarginStyle.class, emptySet, "margin");
        this.nullableTextBasedJustifyStyleAdapter = moshi.adapter(AttributeStyles.TextBasedJustifyStyle.class, emptySet, "justify");
        this.nullableDateSelectStrokeColorStyleAdapter = moshi.adapter(AttributeStyles.DateSelectStrokeColorStyle.class, emptySet, "strokeColor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public InputDate.InputDateComponentStyle fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = null;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = null;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = null;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = null;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = null;
        AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle = null;
        AttributeStyles.DateSelectBorderRadiusStyle dateSelectBorderRadiusStyle = null;
        AttributeStyles.DateSelectBorderWidthStyle dateSelectBorderWidthStyle = null;
        AttributeStyles.DateSelectBackgroundColorStyle dateSelectBackgroundColorStyle = null;
        AttributeStyles.DateSelectBorderColorStyle dateSelectBorderColorStyle = null;
        AttributeStyles.InputMarginStyle inputMarginStyle = null;
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = null;
        AttributeStyles.DateSelectStrokeColorStyle dateSelectStrokeColorStyle = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    complexTextBasedFontFamilyStyle = (AttributeStyles.ComplexTextBasedFontFamilyStyle) this.nullableComplexTextBasedFontFamilyStyleAdapter.fromJson(reader);
                    break;
                case 1:
                    complexTextBasedFontSizeStyle = (AttributeStyles.ComplexTextBasedFontSizeStyle) this.nullableComplexTextBasedFontSizeStyleAdapter.fromJson(reader);
                    break;
                case 2:
                    complexTextBasedFontWeightStyle = (AttributeStyles.ComplexTextBasedFontWeightStyle) this.nullableComplexTextBasedFontWeightStyleAdapter.fromJson(reader);
                    break;
                case 3:
                    complexTextBasedLetterSpacingStyle = (AttributeStyles.ComplexTextBasedLetterSpacingStyle) this.nullableComplexTextBasedLetterSpacingStyleAdapter.fromJson(reader);
                    break;
                case 4:
                    complexTextBasedLineHeightStyle = (AttributeStyles.ComplexTextBasedLineHeightStyle) this.nullableComplexTextBasedLineHeightStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    dateSelectTextColorStyle = (AttributeStyles.DateSelectTextColorStyle) this.nullableDateSelectTextColorStyleAdapter.fromJson(reader);
                    break;
                case 6:
                    dateSelectBorderRadiusStyle = (AttributeStyles.DateSelectBorderRadiusStyle) this.nullableDateSelectBorderRadiusStyleAdapter.fromJson(reader);
                    break;
                case 7:
                    dateSelectBorderWidthStyle = (AttributeStyles.DateSelectBorderWidthStyle) this.nullableDateSelectBorderWidthStyleAdapter.fromJson(reader);
                    break;
                case 8:
                    dateSelectBackgroundColorStyle = (AttributeStyles.DateSelectBackgroundColorStyle) this.nullableDateSelectBackgroundColorStyleAdapter.fromJson(reader);
                    break;
                case 9:
                    dateSelectBorderColorStyle = (AttributeStyles.DateSelectBorderColorStyle) this.nullableDateSelectBorderColorStyleAdapter.fromJson(reader);
                    break;
                case 10:
                    inputMarginStyle = (AttributeStyles.InputMarginStyle) this.nullableInputMarginStyleAdapter.fromJson(reader);
                    break;
                case 11:
                    textBasedJustifyStyle = (AttributeStyles.TextBasedJustifyStyle) this.nullableTextBasedJustifyStyleAdapter.fromJson(reader);
                    break;
                case 12:
                    dateSelectStrokeColorStyle = (AttributeStyles.DateSelectStrokeColorStyle) this.nullableDateSelectStrokeColorStyleAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new InputDate.InputDateComponentStyle(complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, dateSelectTextColorStyle, dateSelectBorderRadiusStyle, dateSelectBorderWidthStyle, dateSelectBackgroundColorStyle, dateSelectBorderColorStyle, inputMarginStyle, textBasedJustifyStyle, dateSelectStrokeColorStyle);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, InputDate.InputDateComponentStyle value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
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
        this.nullableDateSelectTextColorStyleAdapter.toJson(writer, value_.getTextColor());
        writer.name("borderRadius");
        this.nullableDateSelectBorderRadiusStyleAdapter.toJson(writer, value_.getBorderRadius());
        writer.name("borderWidth");
        this.nullableDateSelectBorderWidthStyleAdapter.toJson(writer, value_.getBorderWidth());
        writer.name("backgroundColor");
        this.nullableDateSelectBackgroundColorStyleAdapter.toJson(writer, value_.getBackgroundColor());
        writer.name("borderColor");
        this.nullableDateSelectBorderColorStyleAdapter.toJson(writer, value_.getBorderColor());
        writer.name("margin");
        this.nullableInputMarginStyleAdapter.toJson(writer, value_.getMargin());
        writer.name("justify");
        this.nullableTextBasedJustifyStyleAdapter.toJson(writer, value_.getJustify());
        writer.name("strokeColor");
        this.nullableDateSelectStrokeColorStyleAdapter.toJson(writer, value_.getStrokeColor());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(55, "GeneratedJsonAdapter(InputDate.InputDateComponentStyle)");
    }
}
