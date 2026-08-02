package com.withpersona.sdk2.inquiry.network.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_FileSizeExceededError_DetailsJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableLongAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("file_size_limit");

    public GenericFileUploadErrorResponse_DocumentErrorResponse_FileSizeExceededError_DetailsJsonAdapter(Moshi moshi) {
        this.nullableLongAdapter = moshi.adapter(Long.class, EmptySet.INSTANCE, "fileSizeLimit");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError.Details fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError.Details(l);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError.Details details) {
        if (details == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("file_size_limit");
        this.nullableLongAdapter.toJson(jsonWriter, details.getFileSizeLimit());
        jsonWriter.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(104, "GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError.Details)");
    }
}
