package com.withpersona.sdk2.inquiry.network.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class ErrorResponse_Error_UnauthenticatedErrorJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "details");

    public ErrorResponse_Error_UnauthenticatedErrorJsonAdapter(Moshi moshi) {
        this.nullableStringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "title");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ErrorResponse.Error.UnauthenticatedError fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new ErrorResponse.Error.UnauthenticatedError(str, str2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, ErrorResponse.Error.UnauthenticatedError unauthenticatedError) {
        if (unauthenticatedError == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, unauthenticatedError.getTitle());
        jsonWriter.name("details");
        this.nullableStringAdapter.toJson(jsonWriter, unauthenticatedError.getDetails());
        jsonWriter.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(62, "GeneratedJsonAdapter(ErrorResponse.Error.UnauthenticatedError)");
    }
}
