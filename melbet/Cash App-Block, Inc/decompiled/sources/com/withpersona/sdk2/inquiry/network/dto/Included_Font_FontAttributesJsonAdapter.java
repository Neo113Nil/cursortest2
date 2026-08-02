package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.Included;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/Included_Font_FontAttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font$FontAttributes;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableFontWeightAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Included_Font_FontAttributesJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableFontWeightAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public Included_Font_FontAttributesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("fontFamilyName", "fontWeight", "url");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "fontFamilyName");
        this.nullableFontWeightAdapter = moshi.adapter(StyleElements.FontWeight.class, emptySet, "fontWeight");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Included.Font.FontAttributes fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        StyleElements.FontWeight fontWeight = null;
        String str2 = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (selectName == 1) {
                fontWeight = (StyleElements.FontWeight) this.nullableFontWeightAdapter.fromJson(reader);
            } else if (selectName == 2) {
                str2 = (String) this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new Included.Font.FontAttributes(str, fontWeight, str2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, Included.Font.FontAttributes value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("fontFamilyName");
        this.nullableStringAdapter.toJson(writer, value_.getFontFamilyName());
        writer.name("fontWeight");
        this.nullableFontWeightAdapter.toJson(writer, value_.getFontWeight());
        writer.name("url");
        this.nullableStringAdapter.toJson(writer, value_.getUrl());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(50, "GeneratedJsonAdapter(Included.Font.FontAttributes)");
    }
}
