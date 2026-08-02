package com.withpersona.sdk2.inquiry.network.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;

/* loaded from: classes9.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedPdfError_DetailsJsonAdapter extends JsonAdapter {
    private final JsonReader.Options options = JsonReader.Options.of(new String[0]);

    public GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedPdfError_DetailsJsonAdapter(Moshi moshi) {
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError.Details fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(this.options) == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError.Details();
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError.Details details) {
        if (details == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(100, "GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError.Details)");
    }
}
