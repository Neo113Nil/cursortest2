package com.withpersona.sdk2.inquiry.internal.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.internal.network.ExchangeOneTimeLinkCodeRequest;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ExchangeOneTimeLinkCodeRequestJsonAdapter extends JsonAdapter {
    public final JsonAdapter dataAdapter;
    public final JsonReader.Options options;

    public ExchangeOneTimeLinkCodeRequestJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("data");
        this.dataAdapter = moshi.adapter(ExchangeOneTimeLinkCodeRequest.Data.class, EmptySet.INSTANCE, "data");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        ExchangeOneTimeLinkCodeRequest.Data data = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (data = (ExchangeOneTimeLinkCodeRequest.Data) this.dataAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("data_", "data", jsonReader);
            }
        }
        jsonReader.endObject();
        if (data != null) {
            return new ExchangeOneTimeLinkCodeRequest(data);
        }
        throw Util.missingProperty("data_", "data", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        ExchangeOneTimeLinkCodeRequest exchangeOneTimeLinkCodeRequest = (ExchangeOneTimeLinkCodeRequest) obj;
        jsonWriter.getClass();
        if (exchangeOneTimeLinkCodeRequest == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("data");
        this.dataAdapter.toJson(jsonWriter, exchangeOneTimeLinkCodeRequest.data);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(52, "GeneratedJsonAdapter(ExchangeOneTimeLinkCodeRequest)");
    }
}
