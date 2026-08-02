package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode_QRCodeComponentStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode$QRCodeComponentStyle;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableQRCodeWidthStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeWidthStyle;", "nullableQRCodeJustifyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeJustifyStyle;", "nullableQRCodeMarginStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeMarginStyle;", "nullableQRCodeStrokeColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeStrokeColorStyle;", "nullableQRCodeFillColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeFillColorStyle;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class QRCode_QRCodeComponentStyleJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableQRCodeFillColorStyleAdapter;
    private final JsonAdapter nullableQRCodeJustifyStyleAdapter;
    private final JsonAdapter nullableQRCodeMarginStyleAdapter;
    private final JsonAdapter nullableQRCodeStrokeColorStyleAdapter;
    private final JsonAdapter nullableQRCodeWidthStyleAdapter;
    private final JsonReader.Options options;

    public QRCode_QRCodeComponentStyleJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("width", "justify", "margin", "strokeColor", "fillColor");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableQRCodeWidthStyleAdapter = moshi.adapter(AttributeStyles.QRCodeWidthStyle.class, emptySet, "width");
        this.nullableQRCodeJustifyStyleAdapter = moshi.adapter(AttributeStyles.QRCodeJustifyStyle.class, emptySet, "justify");
        this.nullableQRCodeMarginStyleAdapter = moshi.adapter(AttributeStyles.QRCodeMarginStyle.class, emptySet, "margin");
        this.nullableQRCodeStrokeColorStyleAdapter = moshi.adapter(AttributeStyles.QRCodeStrokeColorStyle.class, emptySet, "strokeColor");
        this.nullableQRCodeFillColorStyleAdapter = moshi.adapter(AttributeStyles.QRCodeFillColorStyle.class, emptySet, "fillColor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public QRCode.QRCodeComponentStyle fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        AttributeStyles.QRCodeWidthStyle qRCodeWidthStyle = null;
        AttributeStyles.QRCodeJustifyStyle qRCodeJustifyStyle = null;
        AttributeStyles.QRCodeMarginStyle qRCodeMarginStyle = null;
        AttributeStyles.QRCodeStrokeColorStyle qRCodeStrokeColorStyle = null;
        AttributeStyles.QRCodeFillColorStyle qRCodeFillColorStyle = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                qRCodeWidthStyle = (AttributeStyles.QRCodeWidthStyle) this.nullableQRCodeWidthStyleAdapter.fromJson(reader);
            } else if (selectName == 1) {
                qRCodeJustifyStyle = (AttributeStyles.QRCodeJustifyStyle) this.nullableQRCodeJustifyStyleAdapter.fromJson(reader);
            } else if (selectName == 2) {
                qRCodeMarginStyle = (AttributeStyles.QRCodeMarginStyle) this.nullableQRCodeMarginStyleAdapter.fromJson(reader);
            } else if (selectName == 3) {
                qRCodeStrokeColorStyle = (AttributeStyles.QRCodeStrokeColorStyle) this.nullableQRCodeStrokeColorStyleAdapter.fromJson(reader);
            } else if (selectName == 4) {
                qRCodeFillColorStyle = (AttributeStyles.QRCodeFillColorStyle) this.nullableQRCodeFillColorStyleAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new QRCode.QRCodeComponentStyle(qRCodeWidthStyle, qRCodeJustifyStyle, qRCodeMarginStyle, qRCodeStrokeColorStyle, qRCodeFillColorStyle);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, QRCode.QRCodeComponentStyle value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("width");
        this.nullableQRCodeWidthStyleAdapter.toJson(writer, value_.getWidth());
        writer.name("justify");
        this.nullableQRCodeJustifyStyleAdapter.toJson(writer, value_.getJustify());
        writer.name("margin");
        this.nullableQRCodeMarginStyleAdapter.toJson(writer, value_.getMargin());
        writer.name("strokeColor");
        this.nullableQRCodeStrokeColorStyleAdapter.toJson(writer, value_.getStrokeColor());
        writer.name("fillColor");
        this.nullableQRCodeFillColorStyleAdapter.toJson(writer, value_.getFillColor());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(49, "GeneratedJsonAdapter(QRCode.QRCodeComponentStyle)");
    }
}
