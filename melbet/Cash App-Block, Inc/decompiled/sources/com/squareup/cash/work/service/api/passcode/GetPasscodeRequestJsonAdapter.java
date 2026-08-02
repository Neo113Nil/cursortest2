package com.squareup.cash.work.service.api.passcode;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/service/api/passcode/GetPasscodeRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/service/api/passcode/GetPasscodeRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetPasscodeRequestJsonAdapter extends JsonAdapter {
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public GetPasscodeRequestJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("employee_token");
        this.stringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "employeeToken");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (str = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("employeeToken", "employee_token", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new GetPasscodeRequest(str);
        }
        throw Util.missingProperty("employeeToken", "employee_token", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        GetPasscodeRequest getPasscodeRequest = (GetPasscodeRequest) obj;
        jsonWriter.getClass();
        if (getPasscodeRequest == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("employee_token");
        this.stringAdapter.toJson(jsonWriter, getPasscodeRequest.employeeToken);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(40, "GeneratedJsonAdapter(GetPasscodeRequest)");
    }
}
