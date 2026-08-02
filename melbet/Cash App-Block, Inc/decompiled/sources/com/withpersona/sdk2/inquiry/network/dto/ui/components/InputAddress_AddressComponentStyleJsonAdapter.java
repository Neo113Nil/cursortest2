package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%H\u0016J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress_AddressComponentStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$AddressComponentStyle;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableAddressTextStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$AddressTextStyle;", "nullableInputTextBackgroundColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBackgroundColorStyle;", "nullableComplexTextBasedFontFamilyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "nullableComplexTextBasedFontSizeStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "nullableComplexTextBasedFontWeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "nullableComplexTextBasedLetterSpacingStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "nullableComplexTextBasedLineHeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "nullableComplexTextBasedTextColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "nullableInputTextBorderRadiusStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderRadiusStyle;", "nullableInputTextBorderWidthStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderWidthStyle;", "nullableInputTextBorderColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderColorStyle;", "nullableInputMarginStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InputAddress_AddressComponentStyleJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableAddressTextStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedFontFamilyStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedFontSizeStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedFontWeightStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedLetterSpacingStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedLineHeightStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedTextColorStyleAdapter;
    private final JsonAdapter nullableInputMarginStyleAdapter;
    private final JsonAdapter nullableInputTextBackgroundColorStyleAdapter;
    private final JsonAdapter nullableInputTextBorderColorStyleAdapter;
    private final JsonAdapter nullableInputTextBorderRadiusStyleAdapter;
    private final JsonAdapter nullableInputTextBorderWidthStyleAdapter;
    private final JsonReader.Options options;

    public InputAddress_AddressComponentStyleJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("textStyle", "backgroundColor", "fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "borderRadius", "borderWidth", "borderColor", "margin");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableAddressTextStyleAdapter = moshi.adapter(AttributeStyles.AddressTextStyle.class, emptySet, "textStyle");
        this.nullableInputTextBackgroundColorStyleAdapter = moshi.adapter(AttributeStyles.InputTextBackgroundColorStyle.class, emptySet, "backgroundColor");
        this.nullableComplexTextBasedFontFamilyStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedFontFamilyStyle.class, emptySet, "fontFamily");
        this.nullableComplexTextBasedFontSizeStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedFontSizeStyle.class, emptySet, "fontSize");
        this.nullableComplexTextBasedFontWeightStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedFontWeightStyle.class, emptySet, "fontWeight");
        this.nullableComplexTextBasedLetterSpacingStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedLetterSpacingStyle.class, emptySet, "letterSpacing");
        this.nullableComplexTextBasedLineHeightStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedLineHeightStyle.class, emptySet, "lineHeight");
        this.nullableComplexTextBasedTextColorStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedTextColorStyle.class, emptySet, "textColor");
        this.nullableInputTextBorderRadiusStyleAdapter = moshi.adapter(AttributeStyles.InputTextBorderRadiusStyle.class, emptySet, "borderRadius");
        this.nullableInputTextBorderWidthStyleAdapter = moshi.adapter(AttributeStyles.InputTextBorderWidthStyle.class, emptySet, "borderWidth");
        this.nullableInputTextBorderColorStyleAdapter = moshi.adapter(AttributeStyles.InputTextBorderColorStyle.class, emptySet, "borderColor");
        this.nullableInputMarginStyleAdapter = moshi.adapter(AttributeStyles.InputMarginStyle.class, emptySet, "margin");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public InputAddress.AddressComponentStyle fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        AttributeStyles.AddressTextStyle addressTextStyle = null;
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = null;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = null;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = null;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = null;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = null;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = null;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = null;
        AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = null;
        AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = null;
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = null;
        AttributeStyles.InputMarginStyle inputMarginStyle = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    addressTextStyle = (AttributeStyles.AddressTextStyle) this.nullableAddressTextStyleAdapter.fromJson(reader);
                    break;
                case 1:
                    inputTextBackgroundColorStyle = (AttributeStyles.InputTextBackgroundColorStyle) this.nullableInputTextBackgroundColorStyleAdapter.fromJson(reader);
                    break;
                case 2:
                    complexTextBasedFontFamilyStyle = (AttributeStyles.ComplexTextBasedFontFamilyStyle) this.nullableComplexTextBasedFontFamilyStyleAdapter.fromJson(reader);
                    break;
                case 3:
                    complexTextBasedFontSizeStyle = (AttributeStyles.ComplexTextBasedFontSizeStyle) this.nullableComplexTextBasedFontSizeStyleAdapter.fromJson(reader);
                    break;
                case 4:
                    complexTextBasedFontWeightStyle = (AttributeStyles.ComplexTextBasedFontWeightStyle) this.nullableComplexTextBasedFontWeightStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    complexTextBasedLetterSpacingStyle = (AttributeStyles.ComplexTextBasedLetterSpacingStyle) this.nullableComplexTextBasedLetterSpacingStyleAdapter.fromJson(reader);
                    break;
                case 6:
                    complexTextBasedLineHeightStyle = (AttributeStyles.ComplexTextBasedLineHeightStyle) this.nullableComplexTextBasedLineHeightStyleAdapter.fromJson(reader);
                    break;
                case 7:
                    complexTextBasedTextColorStyle = (AttributeStyles.ComplexTextBasedTextColorStyle) this.nullableComplexTextBasedTextColorStyleAdapter.fromJson(reader);
                    break;
                case 8:
                    inputTextBorderRadiusStyle = (AttributeStyles.InputTextBorderRadiusStyle) this.nullableInputTextBorderRadiusStyleAdapter.fromJson(reader);
                    break;
                case 9:
                    inputTextBorderWidthStyle = (AttributeStyles.InputTextBorderWidthStyle) this.nullableInputTextBorderWidthStyleAdapter.fromJson(reader);
                    break;
                case 10:
                    inputTextBorderColorStyle = (AttributeStyles.InputTextBorderColorStyle) this.nullableInputTextBorderColorStyleAdapter.fromJson(reader);
                    break;
                case 11:
                    inputMarginStyle = (AttributeStyles.InputMarginStyle) this.nullableInputMarginStyleAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new InputAddress.AddressComponentStyle(addressTextStyle, inputTextBackgroundColorStyle, complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, complexTextBasedTextColorStyle, inputTextBorderRadiusStyle, inputTextBorderWidthStyle, inputTextBorderColorStyle, inputMarginStyle);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, InputAddress.AddressComponentStyle value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("textStyle");
        this.nullableAddressTextStyleAdapter.toJson(writer, value_.getTextStyle());
        writer.name("backgroundColor");
        this.nullableInputTextBackgroundColorStyleAdapter.toJson(writer, value_.getBackgroundColor());
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
        writer.name("borderRadius");
        this.nullableInputTextBorderRadiusStyleAdapter.toJson(writer, value_.getBorderRadius());
        writer.name("borderWidth");
        this.nullableInputTextBorderWidthStyleAdapter.toJson(writer, value_.getBorderWidth());
        writer.name("borderColor");
        this.nullableInputTextBorderColorStyleAdapter.toJson(writer, value_.getBorderColor());
        writer.name("margin");
        this.nullableInputMarginStyleAdapter.toJson(writer, value_.getMargin());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(56, "GeneratedJsonAdapter(InputAddress.AddressComponentStyle)");
    }
}
