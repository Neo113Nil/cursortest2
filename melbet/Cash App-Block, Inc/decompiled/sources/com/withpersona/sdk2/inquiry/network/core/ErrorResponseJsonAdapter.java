package com.withpersona.sdk2.inquiry.network.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import java.util.List;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class ErrorResponseJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableListOfErrorAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("errors");

    public ErrorResponseJsonAdapter(Moshi moshi) {
        this.nullableListOfErrorAdapter = moshi.adapter(Types.newParameterizedType(List.class, ErrorResponse.Error.class), EmptySet.INSTANCE, "errors");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ErrorResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = (List) this.nullableListOfErrorAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new ErrorResponse(list);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, ErrorResponse errorResponse) {
        if (errorResponse == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("errors");
        this.nullableListOfErrorAdapter.toJson(jsonWriter, errorResponse.getErrors());
        jsonWriter.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(35, "GeneratedJsonAdapter(ErrorResponse)");
    }
}
