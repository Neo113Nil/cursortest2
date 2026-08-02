package com.squareup.cash.work.service.api.payroll;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/service/api/payroll/PayStubDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/service/api/payroll/PayStubData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PayStubDataJsonAdapter extends JsonAdapter {
    public final JsonReader.Options options;
    public final JsonAdapter payStubAttributesAdapter;
    public final JsonAdapter stringAdapter;

    public PayStubDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("id", "type", "attributes");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.payStubAttributesAdapter = moshi.adapter(PayStubAttributes.class, emptySet, "attributes");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        PayStubAttributes payStubAttributes = null;
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
                } else if (selectName == 2 && (payStubAttributes = (PayStubAttributes) this.payStubAttributesAdapter.fromJson(jsonReader)) == null) {
                    throw Util.unexpectedNull("attributes", "attributes", jsonReader);
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
        if (payStubAttributes != null) {
            return new PayStubData(str, str2, payStubAttributes);
        }
        throw Util.missingProperty("attributes", "attributes", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        PayStubData payStubData = (PayStubData) obj;
        jsonWriter.getClass();
        if (payStubData == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        String str = payStubData.id;
        JsonAdapter jsonAdapter = this.stringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("type");
        jsonAdapter.toJson(jsonWriter, payStubData.f1219type);
        jsonWriter.name("attributes");
        this.payStubAttributesAdapter.toJson(jsonWriter, payStubData.attributes);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(33, "GeneratedJsonAdapter(PayStubData)");
    }
}
