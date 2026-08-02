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
public final class GenericFileUploadErrorResponseJsonAdapter extends JsonAdapter {
    private final JsonAdapter listOfDocumentErrorResponseAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("errors");

    public GenericFileUploadErrorResponseJsonAdapter(Moshi moshi) {
        this.listOfDocumentErrorResponseAdapter = moshi.adapter(Types.newParameterizedType(List.class, GenericFileUploadErrorResponse.DocumentErrorResponse.class), EmptySet.INSTANCE, "errors");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GenericFileUploadErrorResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (list = (List) this.listOfDocumentErrorResponseAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("errors", "errors", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new GenericFileUploadErrorResponse(list);
        }
        throw Util.missingProperty("errors", "errors", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, GenericFileUploadErrorResponse genericFileUploadErrorResponse) {
        if (genericFileUploadErrorResponse == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("errors");
        this.listOfDocumentErrorResponseAdapter.toJson(jsonWriter, genericFileUploadErrorResponse.getErrors());
        jsonWriter.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(52, "GeneratedJsonAdapter(GenericFileUploadErrorResponse)");
    }
}
