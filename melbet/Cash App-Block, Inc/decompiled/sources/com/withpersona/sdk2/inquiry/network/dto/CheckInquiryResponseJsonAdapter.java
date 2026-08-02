package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "dataAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;", "nullableStringAdapter", "", "nullableListOfIncludedAdapter", "", "Lcom/withpersona/sdk2/inquiry/network/dto/Included;", "nullableMetaAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Meta;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CheckInquiryResponseJsonAdapter extends JsonAdapter {
    private final JsonAdapter dataAdapter;
    private final JsonAdapter nullableListOfIncludedAdapter;
    private final JsonAdapter nullableMetaAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public CheckInquiryResponseJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("data", "token", "included", "meta");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.dataAdapter = moshi.adapter(CheckInquiryResponse.Data.class, emptySet, "data");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "token");
        this.nullableListOfIncludedAdapter = moshi.adapter(Types.newParameterizedType(List.class, Included.class), emptySet, "included");
        this.nullableMetaAdapter = moshi.adapter(CheckInquiryResponse.Meta.class, emptySet, "meta");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CheckInquiryResponse fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        CheckInquiryResponse.Data data = null;
        String str = null;
        List list = null;
        CheckInquiryResponse.Meta meta = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                data = (CheckInquiryResponse.Data) this.dataAdapter.fromJson(reader);
                if (data == null) {
                    throw Util.unexpectedNull("data_", "data", reader);
                }
            } else if (selectName == 1) {
                str = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (selectName == 2) {
                list = (List) this.nullableListOfIncludedAdapter.fromJson(reader);
            } else if (selectName == 3) {
                meta = (CheckInquiryResponse.Meta) this.nullableMetaAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (data != null) {
            return new CheckInquiryResponse(data, str, list, meta);
        }
        throw Util.missingProperty("data_", "data", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CheckInquiryResponse value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("data");
        this.dataAdapter.toJson(writer, value_.getData());
        writer.name("token");
        this.nullableStringAdapter.toJson(writer, value_.getToken());
        writer.name("included");
        this.nullableListOfIncludedAdapter.toJson(writer, value_.getIncluded());
        writer.name("meta");
        this.nullableMetaAdapter.toJson(writer, value_.getMeta());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(42, "GeneratedJsonAdapter(CheckInquiryResponse)");
    }
}
