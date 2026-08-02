package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements_SizeSetJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableSizeAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StyleElements_SizeSetJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableSizeAdapter;
    private final JsonReader.Options options;

    public StyleElements_SizeSetJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("top", "bottom", "left", "right");
        this.nullableSizeAdapter = moshi.adapter(StyleElements.Size.class, EmptySet.INSTANCE, "top");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public StyleElements.SizeSet fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        StyleElements.Size size = null;
        StyleElements.Size size2 = null;
        StyleElements.Size size3 = null;
        StyleElements.Size size4 = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                size = (StyleElements.Size) this.nullableSizeAdapter.fromJson(reader);
            } else if (selectName == 1) {
                size2 = (StyleElements.Size) this.nullableSizeAdapter.fromJson(reader);
            } else if (selectName == 2) {
                size3 = (StyleElements.Size) this.nullableSizeAdapter.fromJson(reader);
            } else if (selectName == 3) {
                size4 = (StyleElements.Size) this.nullableSizeAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new StyleElements.SizeSet(size, size2, size3, size4);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, StyleElements.SizeSet value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("top");
        this.nullableSizeAdapter.toJson(writer, value_.getTop());
        writer.name("bottom");
        this.nullableSizeAdapter.toJson(writer, value_.getBottom());
        writer.name("left");
        this.nullableSizeAdapter.toJson(writer, value_.getLeft());
        writer.name("right");
        this.nullableSizeAdapter.toJson(writer, value_.getRight());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(43, "GeneratedJsonAdapter(StyleElements.SizeSet)");
    }
}
