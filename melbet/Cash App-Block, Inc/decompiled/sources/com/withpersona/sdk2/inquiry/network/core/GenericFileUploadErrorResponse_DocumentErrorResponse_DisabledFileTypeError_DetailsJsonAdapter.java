package com.withpersona.sdk2.inquiry.network.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import java.util.List;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_DisabledFileTypeError_DetailsJsonAdapter extends JsonAdapter {
    private final JsonAdapter listOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("uploaded_file_type", "enabled_file_types");
    private final JsonAdapter stringAdapter;

    public GenericFileUploadErrorResponse_DocumentErrorResponse_DisabledFileTypeError_DetailsJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "uploadedFileType");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "enabledFileTypes");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        List list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("uploadedFileType", "uploaded_file_type", jsonReader);
                }
            } else if (selectName == 1 && (list = (List) this.listOfStringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("enabledFileTypes", "enabled_file_types", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("uploadedFileType", "uploaded_file_type", jsonReader);
        }
        if (list != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details(str, list);
        }
        throw Util.missingProperty("enabledFileTypes", "enabled_file_types", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details details) {
        if (details == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("uploaded_file_type");
        this.stringAdapter.toJson(jsonWriter, details.getUploadedFileType());
        jsonWriter.name("enabled_file_types");
        this.listOfStringAdapter.toJson(jsonWriter, details.getEnabledFileTypes());
        jsonWriter.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(104, "GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details)");
    }
}
