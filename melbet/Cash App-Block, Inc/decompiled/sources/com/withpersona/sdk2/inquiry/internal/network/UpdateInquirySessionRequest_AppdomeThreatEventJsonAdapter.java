package com.withpersona.sdk2.inquiry.internal.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest_AppdomeThreatEventJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$AppdomeThreatEvent;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UpdateInquirySessionRequest_AppdomeThreatEventJsonAdapter extends JsonAdapter {
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public UpdateInquirySessionRequest_AppdomeThreatEventJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("name", "timestamp", "reasonData");
        this.stringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "name");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName != -1) {
                JsonAdapter jsonAdapter = this.stringAdapter;
                if (selectName == 0) {
                    str = (String) jsonAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("name", "name", jsonReader);
                    }
                } else if (selectName == 1) {
                    str2 = (String) jsonAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("timestamp", "timestamp", jsonReader);
                    }
                } else if (selectName == 2 && (str3 = (String) jsonAdapter.fromJson(jsonReader)) == null) {
                    throw Util.unexpectedNull("reasonData", "reasonData", jsonReader);
                }
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("name", "name", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("timestamp", "timestamp", jsonReader);
        }
        if (str3 != null) {
            return new UpdateInquirySessionRequest.AppdomeThreatEvent(str, str2, str3);
        }
        throw Util.missingProperty("reasonData", "reasonData", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        UpdateInquirySessionRequest.AppdomeThreatEvent appdomeThreatEvent = (UpdateInquirySessionRequest.AppdomeThreatEvent) obj;
        jsonWriter.getClass();
        if (appdomeThreatEvent == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        String str = appdomeThreatEvent.name;
        JsonAdapter jsonAdapter = this.stringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("timestamp");
        jsonAdapter.toJson(jsonWriter, appdomeThreatEvent.timestamp);
        jsonWriter.name("reasonData");
        jsonAdapter.toJson(jsonWriter, appdomeThreatEvent.reasonData);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(68, "GeneratedJsonAdapter(UpdateInquirySessionRequest.AppdomeThreatEvent)");
    }
}
