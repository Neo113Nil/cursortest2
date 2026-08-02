package com.withpersona.sdk2.inquiry.governmentid.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse_IdAcceptedResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdAcceptedResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "government-id_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AutoClassifyResponse_IdAcceptedResponseJsonAdapter extends JsonAdapter {
    public final JsonAdapter idAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public AutoClassifyResponse_IdAcceptedResponseJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("countryCode", "idClass", "idConfig");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "countryCode");
        this.idAdapter = moshi.adapter(Id.class, emptySet, "idConfig");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Id id = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName != -1) {
                JsonAdapter jsonAdapter = this.stringAdapter;
                if (selectName == 0) {
                    str = (String) jsonAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("countryCode", "countryCode", jsonReader);
                    }
                } else if (selectName == 1) {
                    str2 = (String) jsonAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("idClass", "idClass", jsonReader);
                    }
                } else if (selectName == 2 && (id = (Id) this.idAdapter.fromJson(jsonReader)) == null) {
                    throw Util.unexpectedNull("idConfig", "idConfig", jsonReader);
                }
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("countryCode", "countryCode", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("idClass", "idClass", jsonReader);
        }
        if (id != null) {
            return new AutoClassifyResponse.IdAcceptedResponse(str, str2, id);
        }
        throw Util.missingProperty("idConfig", "idConfig", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        AutoClassifyResponse.IdAcceptedResponse idAcceptedResponse = (AutoClassifyResponse.IdAcceptedResponse) obj;
        jsonWriter.getClass();
        if (idAcceptedResponse == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("countryCode");
        String str = idAcceptedResponse.countryCode;
        JsonAdapter jsonAdapter = this.stringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("idClass");
        jsonAdapter.toJson(jsonWriter, idAcceptedResponse.idClass);
        jsonWriter.name("idConfig");
        this.idAdapter.toJson(jsonWriter, idAcceptedResponse.idConfig);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(61, "GeneratedJsonAdapter(AutoClassifyResponse.IdAcceptedResponse)");
    }
}
