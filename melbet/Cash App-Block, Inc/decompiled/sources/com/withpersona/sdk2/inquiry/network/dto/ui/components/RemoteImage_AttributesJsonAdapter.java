package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import org.bouncycastle.cms.CMSAttributeTableGenerator;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage_AttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableContentTypeAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;", "stringAdapter", "contentTypeAdapter", "nullableJsonLogicBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RemoteImage_AttributesJsonAdapter extends JsonAdapter {
    private volatile Constructor<RemoteImage.Attributes> constructorRef;
    private final JsonAdapter contentTypeAdapter;
    private final JsonAdapter nullableContentTypeAdapter;
    private final JsonAdapter nullableJsonLogicBooleanAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public RemoteImage_AttributesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("localAssetName", "localAssetContentType", "url", "width", "height", CMSAttributeTableGenerator.CONTENT_TYPE, "hidden");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "localAssetName");
        this.nullableContentTypeAdapter = moshi.adapter(RemoteImage.ContentType.class, emptySet, "localAssetContentType");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "url");
        this.contentTypeAdapter = moshi.adapter(RemoteImage.ContentType.class, emptySet, CMSAttributeTableGenerator.CONTENT_TYPE);
        this.nullableJsonLogicBooleanAdapter = moshi.adapter(JsonLogicBoolean.class, emptySet, "hidden");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public RemoteImage.Attributes fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        int i = -1;
        String str = null;
        RemoteImage.ContentType contentType = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        RemoteImage.ContentType contentType2 = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -2;
                    break;
                case 1:
                    contentType = (RemoteImage.ContentType) this.nullableContentTypeAdapter.fromJson(reader);
                    i &= -3;
                    break;
                case 2:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("url", "url", reader);
                    }
                    break;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    contentType2 = (RemoteImage.ContentType) this.contentTypeAdapter.fromJson(reader);
                    if (contentType2 == null) {
                        throw Util.unexpectedNull(CMSAttributeTableGenerator.CONTENT_TYPE, CMSAttributeTableGenerator.CONTENT_TYPE, reader);
                    }
                    i &= -33;
                    break;
                case 6:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    i &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i == -100) {
            JsonLogicBoolean jsonLogicBoolean2 = jsonLogicBoolean;
            RemoteImage.ContentType contentType3 = contentType2;
            String str5 = str4;
            String str6 = str3;
            String str7 = str2;
            RemoteImage.ContentType contentType4 = contentType;
            String str8 = str;
            if (str7 == null) {
                throw Util.missingProperty("url", "url", reader);
            }
            contentType3.getClass();
            return new RemoteImage.Attributes(str8, contentType4, str7, str6, str5, contentType3, jsonLogicBoolean2);
        }
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean;
        RemoteImage.ContentType contentType5 = contentType2;
        String str9 = str4;
        String str10 = str3;
        String str11 = str2;
        RemoteImage.ContentType contentType6 = contentType;
        String str12 = str;
        Constructor<RemoteImage.Attributes> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = RemoteImage.Attributes.class.getDeclaredConstructor(String.class, RemoteImage.ContentType.class, String.class, String.class, String.class, RemoteImage.ContentType.class, JsonLogicBoolean.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Constructor<RemoteImage.Attributes> constructor2 = constructor;
        if (str11 == null) {
            throw Util.missingProperty("url", "url", reader);
        }
        RemoteImage.Attributes newInstance = constructor2.newInstance(str12, contentType6, str11, str10, str9, contentType5, jsonLogicBoolean3, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, RemoteImage.Attributes value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("localAssetName");
        this.nullableStringAdapter.toJson(writer, value_.getLocalAssetName());
        writer.name("localAssetContentType");
        this.nullableContentTypeAdapter.toJson(writer, value_.getLocalAssetContentType());
        writer.name("url");
        this.stringAdapter.toJson(writer, value_.getUrl());
        writer.name("width");
        this.nullableStringAdapter.toJson(writer, value_.getWidth());
        writer.name("height");
        this.nullableStringAdapter.toJson(writer, value_.getHeight());
        writer.name(CMSAttributeTableGenerator.CONTENT_TYPE);
        this.contentTypeAdapter.toJson(writer, value_.getContentType());
        writer.name("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(44, "GeneratedJsonAdapter(RemoteImage.Attributes)");
    }
}
