package com.squareup.cash.work.service.api.taxforms;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/service/api/taxforms/TaxFormAttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/service/api/taxforms/TaxFormAttributes;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TaxFormAttributesJsonAdapter extends JsonAdapter {
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;

    public TaxFormAttributesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("period_start", "period_end", "period_display", "filename", "description", "form_name", "download_url");
        this.nullableStringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "periodStart");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            JsonAdapter jsonAdapter = this.nullableStringAdapter;
            switch (selectName) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str2 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str4 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str5 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str6 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str7 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        return new TaxFormAttributes(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        TaxFormAttributes taxFormAttributes = (TaxFormAttributes) obj;
        jsonWriter.getClass();
        if (taxFormAttributes == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("period_start");
        String str = taxFormAttributes.periodStart;
        JsonAdapter jsonAdapter = this.nullableStringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("period_end");
        jsonAdapter.toJson(jsonWriter, taxFormAttributes.periodEnd);
        jsonWriter.name("period_display");
        jsonAdapter.toJson(jsonWriter, taxFormAttributes.periodDisplay);
        jsonWriter.name("filename");
        jsonAdapter.toJson(jsonWriter, taxFormAttributes.filename);
        jsonWriter.name("description");
        jsonAdapter.toJson(jsonWriter, taxFormAttributes.description);
        jsonWriter.name("form_name");
        jsonAdapter.toJson(jsonWriter, taxFormAttributes.formName);
        jsonWriter.name("download_url");
        jsonAdapter.toJson(jsonWriter, taxFormAttributes.downloadUrl);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(39, "GeneratedJsonAdapter(TaxFormAttributes)");
    }
}
