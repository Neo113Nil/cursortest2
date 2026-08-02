package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox_InputCheckboxComponentStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox$InputCheckboxComponentStyle;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableInputCheckboxFontFamilyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontFamilyStyle;", "nullableInputCheckboxFontSizeStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontSizeStyle;", "nullableInputCheckboxFontWeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontWeightStyle;", "nullableInputCheckboxLetterSpacingStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;", "nullableInputCheckboxLineHeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxLineHeightStyle;", "nullableInputCheckboxTextColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxTextColorStyle;", "nullableTextBasedTextColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InputCheckbox_InputCheckboxComponentStyleJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableInputCheckboxFontFamilyStyleAdapter;
    private final JsonAdapter nullableInputCheckboxFontSizeStyleAdapter;
    private final JsonAdapter nullableInputCheckboxFontWeightStyleAdapter;
    private final JsonAdapter nullableInputCheckboxLetterSpacingStyleAdapter;
    private final JsonAdapter nullableInputCheckboxLineHeightStyleAdapter;
    private final JsonAdapter nullableInputCheckboxTextColorStyleAdapter;
    private final JsonAdapter nullableTextBasedTextColorStyleAdapter;
    private final JsonReader.Options options;

    public InputCheckbox_InputCheckboxComponentStyleJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "textColorHighlight");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableInputCheckboxFontFamilyStyleAdapter = moshi.adapter(AttributeStyles.InputCheckboxFontFamilyStyle.class, emptySet, "fontFamily");
        this.nullableInputCheckboxFontSizeStyleAdapter = moshi.adapter(AttributeStyles.InputCheckboxFontSizeStyle.class, emptySet, "fontSize");
        this.nullableInputCheckboxFontWeightStyleAdapter = moshi.adapter(AttributeStyles.InputCheckboxFontWeightStyle.class, emptySet, "fontWeight");
        this.nullableInputCheckboxLetterSpacingStyleAdapter = moshi.adapter(AttributeStyles.InputCheckboxLetterSpacingStyle.class, emptySet, "letterSpacing");
        this.nullableInputCheckboxLineHeightStyleAdapter = moshi.adapter(AttributeStyles.InputCheckboxLineHeightStyle.class, emptySet, "lineHeight");
        this.nullableInputCheckboxTextColorStyleAdapter = moshi.adapter(AttributeStyles.InputCheckboxTextColorStyle.class, emptySet, "textColor");
        this.nullableTextBasedTextColorStyleAdapter = moshi.adapter(AttributeStyles.TextBasedTextColorStyle.class, emptySet, "textColorHighlight");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public InputCheckbox.InputCheckboxComponentStyle fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = null;
        AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = null;
        AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = null;
        AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = null;
        AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = null;
        AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = null;
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    inputCheckboxFontFamilyStyle = (AttributeStyles.InputCheckboxFontFamilyStyle) this.nullableInputCheckboxFontFamilyStyleAdapter.fromJson(reader);
                    break;
                case 1:
                    inputCheckboxFontSizeStyle = (AttributeStyles.InputCheckboxFontSizeStyle) this.nullableInputCheckboxFontSizeStyleAdapter.fromJson(reader);
                    break;
                case 2:
                    inputCheckboxFontWeightStyle = (AttributeStyles.InputCheckboxFontWeightStyle) this.nullableInputCheckboxFontWeightStyleAdapter.fromJson(reader);
                    break;
                case 3:
                    inputCheckboxLetterSpacingStyle = (AttributeStyles.InputCheckboxLetterSpacingStyle) this.nullableInputCheckboxLetterSpacingStyleAdapter.fromJson(reader);
                    break;
                case 4:
                    inputCheckboxLineHeightStyle = (AttributeStyles.InputCheckboxLineHeightStyle) this.nullableInputCheckboxLineHeightStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    inputCheckboxTextColorStyle = (AttributeStyles.InputCheckboxTextColorStyle) this.nullableInputCheckboxTextColorStyleAdapter.fromJson(reader);
                    break;
                case 6:
                    textBasedTextColorStyle = (AttributeStyles.TextBasedTextColorStyle) this.nullableTextBasedTextColorStyleAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new InputCheckbox.InputCheckboxComponentStyle(inputCheckboxFontFamilyStyle, inputCheckboxFontSizeStyle, inputCheckboxFontWeightStyle, inputCheckboxLetterSpacingStyle, inputCheckboxLineHeightStyle, inputCheckboxTextColorStyle, textBasedTextColorStyle);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, InputCheckbox.InputCheckboxComponentStyle value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("fontFamily");
        this.nullableInputCheckboxFontFamilyStyleAdapter.toJson(writer, value_.getFontFamily());
        writer.name("fontSize");
        this.nullableInputCheckboxFontSizeStyleAdapter.toJson(writer, value_.getFontSize());
        writer.name("fontWeight");
        this.nullableInputCheckboxFontWeightStyleAdapter.toJson(writer, value_.getFontWeight());
        writer.name("letterSpacing");
        this.nullableInputCheckboxLetterSpacingStyleAdapter.toJson(writer, value_.getLetterSpacing());
        writer.name("lineHeight");
        this.nullableInputCheckboxLineHeightStyleAdapter.toJson(writer, value_.getLineHeight());
        writer.name("textColor");
        this.nullableInputCheckboxTextColorStyleAdapter.toJson(writer, value_.getTextColor());
        writer.name("textColorHighlight");
        this.nullableTextBasedTextColorStyleAdapter.toJson(writer, value_.getTextColorHighlight());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(63, "GeneratedJsonAdapter(InputCheckbox.InputCheckboxComponentStyle)");
    }
}
