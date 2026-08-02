package com.withpersona.sdk2.inquiry.featureflag.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse_FeatureFlagDataResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse$FeatureFlagDataResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "feature-flag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FeatureFlagResponse_FeatureFlagDataResponseJsonAdapter extends JsonAdapter {
    public final JsonAdapter booleanAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public FeatureFlagResponse_FeatureFlagDataResponseJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("id", "type", "enabled");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "enabled");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName != -1) {
                JsonAdapter jsonAdapter = this.stringAdapter;
                if (selectName == 0) {
                    str = (String) jsonAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                } else if (selectName == 1) {
                    str2 = (String) jsonAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("type", "type", jsonReader);
                    }
                } else if (selectName == 2 && (bool = (Boolean) this.booleanAdapter.fromJson(jsonReader)) == null) {
                    throw Util.unexpectedNull("enabled", "enabled", jsonReader);
                }
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (bool != null) {
            return new FeatureFlagResponse.FeatureFlagDataResponse(str, str2, bool.booleanValue());
        }
        throw Util.missingProperty("enabled", "enabled", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        FeatureFlagResponse.FeatureFlagDataResponse featureFlagDataResponse = (FeatureFlagResponse.FeatureFlagDataResponse) obj;
        jsonWriter.getClass();
        if (featureFlagDataResponse == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        String str = featureFlagDataResponse.id;
        JsonAdapter jsonAdapter = this.stringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("type");
        jsonAdapter.toJson(jsonWriter, featureFlagDataResponse.f1452type);
        jsonWriter.name("enabled");
        this.booleanAdapter.toJson(jsonWriter, Boolean.valueOf(featureFlagDataResponse.enabled));
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(65, "GeneratedJsonAdapter(FeatureFlagResponse.FeatureFlagDataResponse)");
    }
}
