package com.withpersona.sdk2.inquiry.network.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_FileLimitExceededErrorJsonAdapter extends JsonAdapter {
    private final JsonAdapter detailsAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "code", "details");
    private final JsonAdapter stringAdapter;

    public GenericFileUploadErrorResponse_DocumentErrorResponse_FileLimitExceededErrorJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.detailsAdapter = moshi.adapter(GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError.Details.class, emptySet, "details");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError.Details details = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("code", "code", jsonReader);
                }
            } else if (selectName == 2 && (details = (GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError.Details) this.detailsAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("details", "details", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("code", "code", jsonReader);
        }
        if (details != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError(str, str2, details);
        }
        throw Util.missingProperty("details", "details", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError fileLimitExceededError) {
        if (fileLimitExceededError == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, fileLimitExceededError.getTitle());
        jsonWriter.name("code");
        this.stringAdapter.toJson(jsonWriter, fileLimitExceededError.getCode());
        jsonWriter.name("details");
        this.detailsAdapter.toJson(jsonWriter, fileLimitExceededError.getDetails());
        jsonWriter.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(97, "GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError)");
    }
}
