package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020-H\u0016J\u001a\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature_ESignatureComponentStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableESignaturePrimaryButtonStylesAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignaturePrimaryButtonStyles;", "nullableESignatureSecondaryButtonStylesAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureSecondaryButtonStyles;", "nullableESignatureTitleStylesContainerAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureTitleStylesContainer;", "nullableESignatureTextStylesContainerAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureTextStylesContainer;", "nullableESignatureFillColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureFillColorStyle;", "nullableESignatureBackgroundColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBackgroundColorStyle;", "nullableComplexTextBasedFontFamilyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "nullableComplexTextBasedFontSizeStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "nullableComplexTextBasedFontWeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "nullableComplexTextBasedLetterSpacingStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "nullableComplexTextBasedLineHeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "nullableESignatureTextColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureTextColorStyle;", "nullableESignatureBorderRadiusStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBorderRadiusStyle;", "nullableESignatureBorderWidthStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBorderWidthStyle;", "nullableESignatureBorderColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBorderColorStyle;", "nullableInputMarginStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ESignature_ESignatureComponentStyleJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableComplexTextBasedFontFamilyStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedFontSizeStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedFontWeightStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedLetterSpacingStyleAdapter;
    private final JsonAdapter nullableComplexTextBasedLineHeightStyleAdapter;
    private final JsonAdapter nullableESignatureBackgroundColorStyleAdapter;
    private final JsonAdapter nullableESignatureBorderColorStyleAdapter;
    private final JsonAdapter nullableESignatureBorderRadiusStyleAdapter;
    private final JsonAdapter nullableESignatureBorderWidthStyleAdapter;
    private final JsonAdapter nullableESignatureFillColorStyleAdapter;
    private final JsonAdapter nullableESignaturePrimaryButtonStylesAdapter;
    private final JsonAdapter nullableESignatureSecondaryButtonStylesAdapter;
    private final JsonAdapter nullableESignatureTextColorStyleAdapter;
    private final JsonAdapter nullableESignatureTextStylesContainerAdapter;
    private final JsonAdapter nullableESignatureTitleStylesContainerAdapter;
    private final JsonAdapter nullableInputMarginStyleAdapter;
    private final JsonReader.Options options;

    public ESignature_ESignatureComponentStyleJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("buttonPrimaryStyle", "buttonSecondaryStyle", "titleStyle", "textStyle", "fillColor", "backgroundColor", "fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "borderRadius", "borderWidth", "borderColor", "margin");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableESignaturePrimaryButtonStylesAdapter = moshi.adapter(AttributeStyles.ESignaturePrimaryButtonStyles.class, emptySet, "buttonPrimaryStyle");
        this.nullableESignatureSecondaryButtonStylesAdapter = moshi.adapter(AttributeStyles.ESignatureSecondaryButtonStyles.class, emptySet, "buttonSecondaryStyle");
        this.nullableESignatureTitleStylesContainerAdapter = moshi.adapter(AttributeStyles.ESignatureTitleStylesContainer.class, emptySet, "titleStyle");
        this.nullableESignatureTextStylesContainerAdapter = moshi.adapter(AttributeStyles.ESignatureTextStylesContainer.class, emptySet, "textStyle");
        this.nullableESignatureFillColorStyleAdapter = moshi.adapter(AttributeStyles.ESignatureFillColorStyle.class, emptySet, "fillColor");
        this.nullableESignatureBackgroundColorStyleAdapter = moshi.adapter(AttributeStyles.ESignatureBackgroundColorStyle.class, emptySet, "backgroundColor");
        this.nullableComplexTextBasedFontFamilyStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedFontFamilyStyle.class, emptySet, "fontFamily");
        this.nullableComplexTextBasedFontSizeStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedFontSizeStyle.class, emptySet, "fontSize");
        this.nullableComplexTextBasedFontWeightStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedFontWeightStyle.class, emptySet, "fontWeight");
        this.nullableComplexTextBasedLetterSpacingStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedLetterSpacingStyle.class, emptySet, "letterSpacing");
        this.nullableComplexTextBasedLineHeightStyleAdapter = moshi.adapter(AttributeStyles.ComplexTextBasedLineHeightStyle.class, emptySet, "lineHeight");
        this.nullableESignatureTextColorStyleAdapter = moshi.adapter(AttributeStyles.ESignatureTextColorStyle.class, emptySet, "textColor");
        this.nullableESignatureBorderRadiusStyleAdapter = moshi.adapter(AttributeStyles.ESignatureBorderRadiusStyle.class, emptySet, "borderRadius");
        this.nullableESignatureBorderWidthStyleAdapter = moshi.adapter(AttributeStyles.ESignatureBorderWidthStyle.class, emptySet, "borderWidth");
        this.nullableESignatureBorderColorStyleAdapter = moshi.adapter(AttributeStyles.ESignatureBorderColorStyle.class, emptySet, "borderColor");
        this.nullableInputMarginStyleAdapter = moshi.adapter(AttributeStyles.InputMarginStyle.class, emptySet, "margin");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ESignature.ESignatureComponentStyle fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        AttributeStyles.ESignaturePrimaryButtonStyles eSignaturePrimaryButtonStyles = null;
        AttributeStyles.ESignatureSecondaryButtonStyles eSignatureSecondaryButtonStyles = null;
        AttributeStyles.ESignatureTitleStylesContainer eSignatureTitleStylesContainer = null;
        AttributeStyles.ESignatureTextStylesContainer eSignatureTextStylesContainer = null;
        AttributeStyles.ESignatureFillColorStyle eSignatureFillColorStyle = null;
        AttributeStyles.ESignatureBackgroundColorStyle eSignatureBackgroundColorStyle = null;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = null;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = null;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = null;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = null;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = null;
        AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle = null;
        AttributeStyles.ESignatureBorderRadiusStyle eSignatureBorderRadiusStyle = null;
        AttributeStyles.ESignatureBorderWidthStyle eSignatureBorderWidthStyle = null;
        AttributeStyles.ESignatureBorderColorStyle eSignatureBorderColorStyle = null;
        AttributeStyles.InputMarginStyle inputMarginStyle = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    eSignaturePrimaryButtonStyles = (AttributeStyles.ESignaturePrimaryButtonStyles) this.nullableESignaturePrimaryButtonStylesAdapter.fromJson(reader);
                    break;
                case 1:
                    eSignatureSecondaryButtonStyles = (AttributeStyles.ESignatureSecondaryButtonStyles) this.nullableESignatureSecondaryButtonStylesAdapter.fromJson(reader);
                    break;
                case 2:
                    eSignatureTitleStylesContainer = (AttributeStyles.ESignatureTitleStylesContainer) this.nullableESignatureTitleStylesContainerAdapter.fromJson(reader);
                    break;
                case 3:
                    eSignatureTextStylesContainer = (AttributeStyles.ESignatureTextStylesContainer) this.nullableESignatureTextStylesContainerAdapter.fromJson(reader);
                    break;
                case 4:
                    eSignatureFillColorStyle = (AttributeStyles.ESignatureFillColorStyle) this.nullableESignatureFillColorStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    eSignatureBackgroundColorStyle = (AttributeStyles.ESignatureBackgroundColorStyle) this.nullableESignatureBackgroundColorStyleAdapter.fromJson(reader);
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
                    eSignatureTextColorStyle = (AttributeStyles.ESignatureTextColorStyle) this.nullableESignatureTextColorStyleAdapter.fromJson(reader);
                    break;
                case 12:
                    eSignatureBorderRadiusStyle = (AttributeStyles.ESignatureBorderRadiusStyle) this.nullableESignatureBorderRadiusStyleAdapter.fromJson(reader);
                    break;
                case 13:
                    eSignatureBorderWidthStyle = (AttributeStyles.ESignatureBorderWidthStyle) this.nullableESignatureBorderWidthStyleAdapter.fromJson(reader);
                    break;
                case 14:
                    eSignatureBorderColorStyle = (AttributeStyles.ESignatureBorderColorStyle) this.nullableESignatureBorderColorStyleAdapter.fromJson(reader);
                    break;
                case 15:
                    inputMarginStyle = (AttributeStyles.InputMarginStyle) this.nullableInputMarginStyleAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new ESignature.ESignatureComponentStyle(eSignaturePrimaryButtonStyles, eSignatureSecondaryButtonStyles, eSignatureTitleStylesContainer, eSignatureTextStylesContainer, eSignatureFillColorStyle, eSignatureBackgroundColorStyle, complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, eSignatureTextColorStyle, eSignatureBorderRadiusStyle, eSignatureBorderWidthStyle, eSignatureBorderColorStyle, inputMarginStyle);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, ESignature.ESignatureComponentStyle value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("buttonPrimaryStyle");
        this.nullableESignaturePrimaryButtonStylesAdapter.toJson(writer, value_.getButtonPrimaryStyle());
        writer.name("buttonSecondaryStyle");
        this.nullableESignatureSecondaryButtonStylesAdapter.toJson(writer, value_.getButtonSecondaryStyle());
        writer.name("titleStyle");
        this.nullableESignatureTitleStylesContainerAdapter.toJson(writer, value_.getTitleStyle());
        writer.name("textStyle");
        this.nullableESignatureTextStylesContainerAdapter.toJson(writer, value_.getTextStyle());
        writer.name("fillColor");
        this.nullableESignatureFillColorStyleAdapter.toJson(writer, value_.getFillColor());
        writer.name("backgroundColor");
        this.nullableESignatureBackgroundColorStyleAdapter.toJson(writer, value_.getBackgroundColor());
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
        this.nullableESignatureTextColorStyleAdapter.toJson(writer, value_.getTextColor());
        writer.name("borderRadius");
        this.nullableESignatureBorderRadiusStyleAdapter.toJson(writer, value_.getBorderRadius());
        writer.name("borderWidth");
        this.nullableESignatureBorderWidthStyleAdapter.toJson(writer, value_.getBorderWidth());
        writer.name("borderColor");
        this.nullableESignatureBorderColorStyleAdapter.toJson(writer, value_.getBorderColor());
        writer.name("margin");
        this.nullableInputMarginStyleAdapter.toJson(writer, value_.getMargin());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(57, "GeneratedJsonAdapter(ESignature.ESignatureComponentStyle)");
    }
}
