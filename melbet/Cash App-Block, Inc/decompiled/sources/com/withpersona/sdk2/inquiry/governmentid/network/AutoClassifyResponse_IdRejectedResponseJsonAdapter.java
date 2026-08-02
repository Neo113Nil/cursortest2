package com.withpersona.sdk2.inquiry.governmentid.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse_IdRejectedResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdRejectedResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "government-id_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AutoClassifyResponse_IdRejectedResponseJsonAdapter extends JsonAdapter {
    public final JsonAdapter listOfIdClassesForCountryAdapter;
    public final JsonReader.Options options;

    public AutoClassifyResponse_IdRejectedResponseJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("idClassesByCountries");
        this.listOfIdClassesForCountryAdapter = moshi.adapter(Types.newParameterizedType(List.class, AutoClassifyResponse.IdClassesForCountry.class), EmptySet.INSTANCE, "idClassesByCountries");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        List list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (list = (List) this.listOfIdClassesForCountryAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("idClassesByCountries", "idClassesByCountries", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new AutoClassifyResponse.IdRejectedResponse(list);
        }
        throw Util.missingProperty("idClassesByCountries", "idClassesByCountries", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        AutoClassifyResponse.IdRejectedResponse idRejectedResponse = (AutoClassifyResponse.IdRejectedResponse) obj;
        jsonWriter.getClass();
        if (idRejectedResponse == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("idClassesByCountries");
        this.listOfIdClassesForCountryAdapter.toJson(jsonWriter, idRejectedResponse.idClassesByCountries);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(61, "GeneratedJsonAdapter(AutoClassifyResponse.IdRejectedResponse)");
    }
}
