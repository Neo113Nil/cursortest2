package com.withpersona.sdk2.inquiry.network.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import java.util.Map;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class ErrorResponse_Error_InvalidFieldValueErrorJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableMapOfStringUiComponentErrorAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "details");

    public ErrorResponse_Error_InvalidFieldValueErrorJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableMapOfStringUiComponentErrorAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, UiComponentError.class), emptySet, "details");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ErrorResponse.Error.InvalidFieldValueError fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Map map = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                map = (Map) this.nullableMapOfStringUiComponentErrorAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new ErrorResponse.Error.InvalidFieldValueError(str, map);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, ErrorResponse.Error.InvalidFieldValueError invalidFieldValueError) {
        if (invalidFieldValueError == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, invalidFieldValueError.getTitle());
        jsonWriter.name("details");
        this.nullableMapOfStringUiComponentErrorAdapter.toJson(jsonWriter, invalidFieldValueError.getDetails());
        jsonWriter.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(64, "GeneratedJsonAdapter(ErrorResponse.Error.InvalidFieldValueError)");
    }
}
