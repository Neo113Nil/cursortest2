package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage_RemoteImageComponentStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableRemoteImageHeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageHeightStyle;", "nullableRemoteImageWidthStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageWidthStyle;", "nullableRemoteImageJustifyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageJustifyStyle;", "nullableRemoteImageMarginStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageMarginStyle;", "nullableRemoteImageStrokeColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageStrokeColorStyle;", "nullableRemoteImageFillColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageFillColorStyle;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RemoteImage_RemoteImageComponentStyleJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableRemoteImageFillColorStyleAdapter;
    private final JsonAdapter nullableRemoteImageHeightStyleAdapter;
    private final JsonAdapter nullableRemoteImageJustifyStyleAdapter;
    private final JsonAdapter nullableRemoteImageMarginStyleAdapter;
    private final JsonAdapter nullableRemoteImageStrokeColorStyleAdapter;
    private final JsonAdapter nullableRemoteImageWidthStyleAdapter;
    private final JsonReader.Options options;

    public RemoteImage_RemoteImageComponentStyleJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("height", "width", "justify", "margin", "strokeColor", "fillColor");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableRemoteImageHeightStyleAdapter = moshi.adapter(AttributeStyles.RemoteImageHeightStyle.class, emptySet, "height");
        this.nullableRemoteImageWidthStyleAdapter = moshi.adapter(AttributeStyles.RemoteImageWidthStyle.class, emptySet, "width");
        this.nullableRemoteImageJustifyStyleAdapter = moshi.adapter(AttributeStyles.RemoteImageJustifyStyle.class, emptySet, "justify");
        this.nullableRemoteImageMarginStyleAdapter = moshi.adapter(AttributeStyles.RemoteImageMarginStyle.class, emptySet, "margin");
        this.nullableRemoteImageStrokeColorStyleAdapter = moshi.adapter(AttributeStyles.RemoteImageStrokeColorStyle.class, emptySet, "strokeColor");
        this.nullableRemoteImageFillColorStyleAdapter = moshi.adapter(AttributeStyles.RemoteImageFillColorStyle.class, emptySet, "fillColor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public RemoteImage.RemoteImageComponentStyle fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        AttributeStyles.RemoteImageHeightStyle remoteImageHeightStyle = null;
        AttributeStyles.RemoteImageWidthStyle remoteImageWidthStyle = null;
        AttributeStyles.RemoteImageJustifyStyle remoteImageJustifyStyle = null;
        AttributeStyles.RemoteImageMarginStyle remoteImageMarginStyle = null;
        AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle = null;
        AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    remoteImageHeightStyle = (AttributeStyles.RemoteImageHeightStyle) this.nullableRemoteImageHeightStyleAdapter.fromJson(reader);
                    break;
                case 1:
                    remoteImageWidthStyle = (AttributeStyles.RemoteImageWidthStyle) this.nullableRemoteImageWidthStyleAdapter.fromJson(reader);
                    break;
                case 2:
                    remoteImageJustifyStyle = (AttributeStyles.RemoteImageJustifyStyle) this.nullableRemoteImageJustifyStyleAdapter.fromJson(reader);
                    break;
                case 3:
                    remoteImageMarginStyle = (AttributeStyles.RemoteImageMarginStyle) this.nullableRemoteImageMarginStyleAdapter.fromJson(reader);
                    break;
                case 4:
                    remoteImageStrokeColorStyle = (AttributeStyles.RemoteImageStrokeColorStyle) this.nullableRemoteImageStrokeColorStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    remoteImageFillColorStyle = (AttributeStyles.RemoteImageFillColorStyle) this.nullableRemoteImageFillColorStyleAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new RemoteImage.RemoteImageComponentStyle(remoteImageHeightStyle, remoteImageWidthStyle, remoteImageJustifyStyle, remoteImageMarginStyle, remoteImageStrokeColorStyle, remoteImageFillColorStyle);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, RemoteImage.RemoteImageComponentStyle value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("height");
        this.nullableRemoteImageHeightStyleAdapter.toJson(writer, value_.getHeight());
        writer.name("width");
        this.nullableRemoteImageWidthStyleAdapter.toJson(writer, value_.getWidth());
        writer.name("justify");
        this.nullableRemoteImageJustifyStyleAdapter.toJson(writer, value_.getJustify());
        writer.name("margin");
        this.nullableRemoteImageMarginStyleAdapter.toJson(writer, value_.getMargin());
        writer.name("strokeColor");
        this.nullableRemoteImageStrokeColorStyleAdapter.toJson(writer, value_.getStrokeColor());
        writer.name("fillColor");
        this.nullableRemoteImageFillColorStyleAdapter.toJson(writer, value_.getFillColor());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(59, "GeneratedJsonAdapter(RemoteImage.RemoteImageComponentStyle)");
    }
}
