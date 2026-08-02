package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse_DataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "attributesAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CheckInquiryResponse_DataJsonAdapter extends JsonAdapter {
    private final JsonAdapter attributesAdapter;
    private volatile Constructor<CheckInquiryResponse.Data> constructorRef;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public CheckInquiryResponse_DataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("id", "type", "attributes");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.attributesAdapter = moshi.adapter(CheckInquiryResponse.Attributes.class, emptySet, "attributes");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CheckInquiryResponse.Data fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        String str2 = null;
        CheckInquiryResponse.Attributes attributes = null;
        int i = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw Util.unexpectedNull("id", "id", reader);
                }
            } else if (selectName == 1) {
                str2 = (String) this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw Util.unexpectedNull("type", "type", reader);
                }
            } else if (selectName == 2) {
                attributes = (CheckInquiryResponse.Attributes) this.attributesAdapter.fromJson(reader);
                if (attributes == null) {
                    throw Util.unexpectedNull("attributes", "attributes", reader);
                }
                i = -5;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i == -5) {
            if (str == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            if (str2 == null) {
                throw Util.missingProperty("type", "type", reader);
            }
            attributes.getClass();
            return new CheckInquiryResponse.Data(str, str2, attributes);
        }
        Constructor<CheckInquiryResponse.Data> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CheckInquiryResponse.Data.class.getDeclaredConstructor(String.class, String.class, CheckInquiryResponse.Attributes.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (str == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        if (str2 == null) {
            throw Util.missingProperty("type", "type", reader);
        }
        CheckInquiryResponse.Data newInstance = constructor.newInstance(str, str2, attributes, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CheckInquiryResponse.Data value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.name("attributes");
        this.attributesAdapter.toJson(writer, value_.getAttributes());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(47, "GeneratedJsonAdapter(CheckInquiryResponse.Data)");
    }
}
