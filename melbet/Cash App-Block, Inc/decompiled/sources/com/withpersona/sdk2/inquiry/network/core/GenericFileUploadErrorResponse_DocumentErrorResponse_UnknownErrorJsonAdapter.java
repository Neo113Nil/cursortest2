package com.withpersona.sdk2.inquiry.network.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_UnknownErrorJsonAdapter extends JsonAdapter {
    private volatile Constructor<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> constructorRef;
    private final JsonAdapter nullableErrorDetailsAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "code", "details");
    private final JsonAdapter stringAdapter;

    public GenericFileUploadErrorResponse_DocumentErrorResponse_UnknownErrorJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "code");
        this.nullableErrorDetailsAdapter = moshi.adapter(ErrorDetails.class, emptySet, "details");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        ErrorDetails errorDetails = null;
        int i = -1;
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
                i &= -2;
            } else if (selectName == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                errorDetails = (ErrorDetails) this.nullableErrorDetailsAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.endObject();
        if (i == -8) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(str, str2, errorDetails);
        }
        Constructor<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError.class.getDeclaredConstructor(String.class, String.class, ErrorDetails.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(str, str2, errorDetails, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError unknownError) {
        if (unknownError == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, unknownError.getTitle());
        jsonWriter.name("code");
        this.nullableStringAdapter.toJson(jsonWriter, unknownError.getCode());
        jsonWriter.name("details");
        this.nullableErrorDetailsAdapter.toJson(jsonWriter, unknownError.getDetails());
        jsonWriter.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(87, "GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError)");
    }
}
