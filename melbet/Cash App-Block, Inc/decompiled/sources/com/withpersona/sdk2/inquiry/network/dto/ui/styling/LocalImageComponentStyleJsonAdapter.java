package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableLocalImageStrokeColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageStrokeColorStyle;", "nullableLocalImageFillColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageFillColorStyle;", "nullableLocalImageHeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageHeightStyle;", "nullableLocalImageWidthStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageWidthStyle;", "nullableLocalImageJustifyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageJustifyStyle;", "nullableLocalImageMarginStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageMarginStyle;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LocalImageComponentStyleJsonAdapter extends JsonAdapter {
    private volatile Constructor<LocalImageComponentStyle> constructorRef;
    private final JsonAdapter nullableLocalImageFillColorStyleAdapter;
    private final JsonAdapter nullableLocalImageHeightStyleAdapter;
    private final JsonAdapter nullableLocalImageJustifyStyleAdapter;
    private final JsonAdapter nullableLocalImageMarginStyleAdapter;
    private final JsonAdapter nullableLocalImageStrokeColorStyleAdapter;
    private final JsonAdapter nullableLocalImageWidthStyleAdapter;
    private final JsonReader.Options options;

    public LocalImageComponentStyleJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("strokeColor", "fillColor", "height", "width", "justify", "margin");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLocalImageStrokeColorStyleAdapter = moshi.adapter(AttributeStyles.LocalImageStrokeColorStyle.class, emptySet, "strokeColor");
        this.nullableLocalImageFillColorStyleAdapter = moshi.adapter(AttributeStyles.LocalImageFillColorStyle.class, emptySet, "fillColor");
        this.nullableLocalImageHeightStyleAdapter = moshi.adapter(AttributeStyles.LocalImageHeightStyle.class, emptySet, "height");
        this.nullableLocalImageWidthStyleAdapter = moshi.adapter(AttributeStyles.LocalImageWidthStyle.class, emptySet, "width");
        this.nullableLocalImageJustifyStyleAdapter = moshi.adapter(AttributeStyles.LocalImageJustifyStyle.class, emptySet, "justify");
        this.nullableLocalImageMarginStyleAdapter = moshi.adapter(AttributeStyles.LocalImageMarginStyle.class, emptySet, "margin");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public LocalImageComponentStyle fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        int i = -1;
        AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle = null;
        AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle = null;
        AttributeStyles.LocalImageHeightStyle localImageHeightStyle = null;
        AttributeStyles.LocalImageWidthStyle localImageWidthStyle = null;
        AttributeStyles.LocalImageJustifyStyle localImageJustifyStyle = null;
        AttributeStyles.LocalImageMarginStyle localImageMarginStyle = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    localImageStrokeColorStyle = (AttributeStyles.LocalImageStrokeColorStyle) this.nullableLocalImageStrokeColorStyleAdapter.fromJson(reader);
                    i &= -2;
                    break;
                case 1:
                    localImageFillColorStyle = (AttributeStyles.LocalImageFillColorStyle) this.nullableLocalImageFillColorStyleAdapter.fromJson(reader);
                    i &= -3;
                    break;
                case 2:
                    localImageHeightStyle = (AttributeStyles.LocalImageHeightStyle) this.nullableLocalImageHeightStyleAdapter.fromJson(reader);
                    i &= -5;
                    break;
                case 3:
                    localImageWidthStyle = (AttributeStyles.LocalImageWidthStyle) this.nullableLocalImageWidthStyleAdapter.fromJson(reader);
                    i &= -9;
                    break;
                case 4:
                    localImageJustifyStyle = (AttributeStyles.LocalImageJustifyStyle) this.nullableLocalImageJustifyStyleAdapter.fromJson(reader);
                    i &= -17;
                    break;
                case 5:
                    localImageMarginStyle = (AttributeStyles.LocalImageMarginStyle) this.nullableLocalImageMarginStyleAdapter.fromJson(reader);
                    i &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i == -64) {
            AttributeStyles.LocalImageMarginStyle localImageMarginStyle2 = localImageMarginStyle;
            AttributeStyles.LocalImageJustifyStyle localImageJustifyStyle2 = localImageJustifyStyle;
            AttributeStyles.LocalImageWidthStyle localImageWidthStyle2 = localImageWidthStyle;
            return new LocalImageComponentStyle(localImageStrokeColorStyle, localImageFillColorStyle, localImageHeightStyle, localImageWidthStyle2, localImageJustifyStyle2, localImageMarginStyle2);
        }
        AttributeStyles.LocalImageMarginStyle localImageMarginStyle3 = localImageMarginStyle;
        AttributeStyles.LocalImageJustifyStyle localImageJustifyStyle3 = localImageJustifyStyle;
        AttributeStyles.LocalImageWidthStyle localImageWidthStyle3 = localImageWidthStyle;
        AttributeStyles.LocalImageHeightStyle localImageHeightStyle2 = localImageHeightStyle;
        AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle2 = localImageFillColorStyle;
        AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle2 = localImageStrokeColorStyle;
        Constructor<LocalImageComponentStyle> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = LocalImageComponentStyle.class.getDeclaredConstructor(AttributeStyles.LocalImageStrokeColorStyle.class, AttributeStyles.LocalImageFillColorStyle.class, AttributeStyles.LocalImageHeightStyle.class, AttributeStyles.LocalImageWidthStyle.class, AttributeStyles.LocalImageJustifyStyle.class, AttributeStyles.LocalImageMarginStyle.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        LocalImageComponentStyle newInstance = constructor.newInstance(localImageStrokeColorStyle2, localImageFillColorStyle2, localImageHeightStyle2, localImageWidthStyle3, localImageJustifyStyle3, localImageMarginStyle3, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, LocalImageComponentStyle value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("strokeColor");
        this.nullableLocalImageStrokeColorStyleAdapter.toJson(writer, value_.getStrokeColor());
        writer.name("fillColor");
        this.nullableLocalImageFillColorStyleAdapter.toJson(writer, value_.getFillColor());
        writer.name("height");
        this.nullableLocalImageHeightStyleAdapter.toJson(writer, value_.getHeight());
        writer.name("width");
        this.nullableLocalImageWidthStyleAdapter.toJson(writer, value_.getWidth());
        writer.name("justify");
        this.nullableLocalImageJustifyStyleAdapter.toJson(writer, value_.getJustify());
        writer.name("margin");
        this.nullableLocalImageMarginStyleAdapter.toJson(writer, value_.getMargin());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(46, "GeneratedJsonAdapter(LocalImageComponentStyle)");
    }
}
