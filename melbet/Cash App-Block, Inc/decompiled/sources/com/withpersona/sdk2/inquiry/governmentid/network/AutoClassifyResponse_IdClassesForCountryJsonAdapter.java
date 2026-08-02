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
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse_IdClassesForCountryJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "government-id_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AutoClassifyResponse_IdClassesForCountryJsonAdapter extends JsonAdapter {
    public final JsonAdapter listOfIdAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public AutoClassifyResponse_IdClassesForCountryJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("countryName", "countryCode", "idConfigs");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "countryName");
        this.listOfIdAdapter = moshi.adapter(Types.newParameterizedType(List.class, Id.class), emptySet, "idConfigs");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        List list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName != -1) {
                JsonAdapter jsonAdapter = this.stringAdapter;
                if (selectName == 0) {
                    str = (String) jsonAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("countryName", "countryName", jsonReader);
                    }
                } else if (selectName == 1) {
                    str2 = (String) jsonAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("countryCode", "countryCode", jsonReader);
                    }
                } else if (selectName == 2 && (list = (List) this.listOfIdAdapter.fromJson(jsonReader)) == null) {
                    throw Util.unexpectedNull("idConfigs", "idConfigs", jsonReader);
                }
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("countryName", "countryName", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("countryCode", "countryCode", jsonReader);
        }
        if (list != null) {
            return new AutoClassifyResponse.IdClassesForCountry(str, str2, list);
        }
        throw Util.missingProperty("idConfigs", "idConfigs", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        AutoClassifyResponse.IdClassesForCountry idClassesForCountry = (AutoClassifyResponse.IdClassesForCountry) obj;
        jsonWriter.getClass();
        if (idClassesForCountry == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("countryName");
        String str = idClassesForCountry.countryName;
        JsonAdapter jsonAdapter = this.stringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("countryCode");
        jsonAdapter.toJson(jsonWriter, idClassesForCountry.countryCode);
        jsonWriter.name("idConfigs");
        this.listOfIdAdapter.toJson(jsonWriter, idClassesForCountry.idConfigs);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(62, "GeneratedJsonAdapter(AutoClassifyResponse.IdClassesForCountry)");
    }
}
