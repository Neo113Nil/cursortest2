package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup_InputRadioGroupComponentStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableTextBasedMarginStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedMarginStyle;", "nullableInputRadioGroupFontFamilyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontFamilyStyle;", "nullableInputRadioGroupFontSizeStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontSizeStyle;", "nullableInputRadioGroupFontWeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontWeightStyle;", "nullableInputRadioGroupLetterSpacingStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLetterSpacingStyle;", "nullableInputRadioGroupLineHeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLineHeightStyle;", "nullableInputRadioGroupTextColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupTextColorStyle;", "nullableTextBasedTextColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InputRadioGroup_InputRadioGroupComponentStyleJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableInputRadioGroupFontFamilyStyleAdapter;
    private final JsonAdapter nullableInputRadioGroupFontSizeStyleAdapter;
    private final JsonAdapter nullableInputRadioGroupFontWeightStyleAdapter;
    private final JsonAdapter nullableInputRadioGroupLetterSpacingStyleAdapter;
    private final JsonAdapter nullableInputRadioGroupLineHeightStyleAdapter;
    private final JsonAdapter nullableInputRadioGroupTextColorStyleAdapter;
    private final JsonAdapter nullableTextBasedMarginStyleAdapter;
    private final JsonAdapter nullableTextBasedTextColorStyleAdapter;
    private final JsonReader.Options options;

    public InputRadioGroup_InputRadioGroupComponentStyleJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("margin", "fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "textColorHighlight");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableTextBasedMarginStyleAdapter = moshi.adapter(AttributeStyles.TextBasedMarginStyle.class, emptySet, "margin");
        this.nullableInputRadioGroupFontFamilyStyleAdapter = moshi.adapter(AttributeStyles.InputRadioGroupFontFamilyStyle.class, emptySet, "fontFamily");
        this.nullableInputRadioGroupFontSizeStyleAdapter = moshi.adapter(AttributeStyles.InputRadioGroupFontSizeStyle.class, emptySet, "fontSize");
        this.nullableInputRadioGroupFontWeightStyleAdapter = moshi.adapter(AttributeStyles.InputRadioGroupFontWeightStyle.class, emptySet, "fontWeight");
        this.nullableInputRadioGroupLetterSpacingStyleAdapter = moshi.adapter(AttributeStyles.InputRadioGroupLetterSpacingStyle.class, emptySet, "letterSpacing");
        this.nullableInputRadioGroupLineHeightStyleAdapter = moshi.adapter(AttributeStyles.InputRadioGroupLineHeightStyle.class, emptySet, "lineHeight");
        this.nullableInputRadioGroupTextColorStyleAdapter = moshi.adapter(AttributeStyles.InputRadioGroupTextColorStyle.class, emptySet, "textColor");
        this.nullableTextBasedTextColorStyleAdapter = moshi.adapter(AttributeStyles.TextBasedTextColorStyle.class, emptySet, "textColorHighlight");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public InputRadioGroup.InputRadioGroupComponentStyle fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = null;
        AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = null;
        AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = null;
        AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = null;
        AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = null;
        AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = null;
        AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = null;
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    textBasedMarginStyle = (AttributeStyles.TextBasedMarginStyle) this.nullableTextBasedMarginStyleAdapter.fromJson(reader);
                    break;
                case 1:
                    inputRadioGroupFontFamilyStyle = (AttributeStyles.InputRadioGroupFontFamilyStyle) this.nullableInputRadioGroupFontFamilyStyleAdapter.fromJson(reader);
                    break;
                case 2:
                    inputRadioGroupFontSizeStyle = (AttributeStyles.InputRadioGroupFontSizeStyle) this.nullableInputRadioGroupFontSizeStyleAdapter.fromJson(reader);
                    break;
                case 3:
                    inputRadioGroupFontWeightStyle = (AttributeStyles.InputRadioGroupFontWeightStyle) this.nullableInputRadioGroupFontWeightStyleAdapter.fromJson(reader);
                    break;
                case 4:
                    inputRadioGroupLetterSpacingStyle = (AttributeStyles.InputRadioGroupLetterSpacingStyle) this.nullableInputRadioGroupLetterSpacingStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    inputRadioGroupLineHeightStyle = (AttributeStyles.InputRadioGroupLineHeightStyle) this.nullableInputRadioGroupLineHeightStyleAdapter.fromJson(reader);
                    break;
                case 6:
                    inputRadioGroupTextColorStyle = (AttributeStyles.InputRadioGroupTextColorStyle) this.nullableInputRadioGroupTextColorStyleAdapter.fromJson(reader);
                    break;
                case 7:
                    textBasedTextColorStyle = (AttributeStyles.TextBasedTextColorStyle) this.nullableTextBasedTextColorStyleAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new InputRadioGroup.InputRadioGroupComponentStyle(textBasedMarginStyle, inputRadioGroupFontFamilyStyle, inputRadioGroupFontSizeStyle, inputRadioGroupFontWeightStyle, inputRadioGroupLetterSpacingStyle, inputRadioGroupLineHeightStyle, inputRadioGroupTextColorStyle, textBasedTextColorStyle);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, InputRadioGroup.InputRadioGroupComponentStyle value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("margin");
        this.nullableTextBasedMarginStyleAdapter.toJson(writer, value_.getMargin());
        writer.name("fontFamily");
        this.nullableInputRadioGroupFontFamilyStyleAdapter.toJson(writer, value_.getFontFamily());
        writer.name("fontSize");
        this.nullableInputRadioGroupFontSizeStyleAdapter.toJson(writer, value_.getFontSize());
        writer.name("fontWeight");
        this.nullableInputRadioGroupFontWeightStyleAdapter.toJson(writer, value_.getFontWeight());
        writer.name("letterSpacing");
        this.nullableInputRadioGroupLetterSpacingStyleAdapter.toJson(writer, value_.getLetterSpacing());
        writer.name("lineHeight");
        this.nullableInputRadioGroupLineHeightStyleAdapter.toJson(writer, value_.getLineHeight());
        writer.name("textColor");
        this.nullableInputRadioGroupTextColorStyleAdapter.toJson(writer, value_.getTextColor());
        writer.name("textColorHighlight");
        this.nullableTextBasedTextColorStyleAdapter.toJson(writer, value_.getTextColorHighlight());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(67, "GeneratedJsonAdapter(InputRadioGroup.InputRadioGroupComponentStyle)");
    }
}
