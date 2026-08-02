package com.withpersona.sdk2.inquiry.internal.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResponse;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionData;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreateInquirySessionResponseJsonAdapter extends JsonAdapter {
    public final JsonAdapter inquirySessionDataAdapter;
    public final JsonAdapter metaAdapter;
    public final JsonReader.Options options;

    public CreateInquirySessionResponseJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("data", "meta");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.inquirySessionDataAdapter = moshi.adapter(InquirySessionData.class, emptySet, "data");
        this.metaAdapter = moshi.adapter(CreateInquirySessionResponse.Meta.class, emptySet, "meta");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        InquirySessionData inquirySessionData = null;
        CreateInquirySessionResponse.Meta meta = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                inquirySessionData = (InquirySessionData) this.inquirySessionDataAdapter.fromJson(jsonReader);
                if (inquirySessionData == null) {
                    throw Util.unexpectedNull("data_", "data", jsonReader);
                }
            } else if (selectName == 1 && (meta = (CreateInquirySessionResponse.Meta) this.metaAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("meta", "meta", jsonReader);
            }
        }
        jsonReader.endObject();
        if (inquirySessionData == null) {
            throw Util.missingProperty("data_", "data", jsonReader);
        }
        if (meta != null) {
            return new CreateInquirySessionResponse(inquirySessionData, meta);
        }
        throw Util.missingProperty("meta", "meta", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        CreateInquirySessionResponse createInquirySessionResponse = (CreateInquirySessionResponse) obj;
        jsonWriter.getClass();
        if (createInquirySessionResponse == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("data");
        this.inquirySessionDataAdapter.toJson(jsonWriter, createInquirySessionResponse.data);
        jsonWriter.name("meta");
        this.metaAdapter.toJson(jsonWriter, createInquirySessionResponse.meta);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(50, "GeneratedJsonAdapter(CreateInquirySessionResponse)");
    }
}
