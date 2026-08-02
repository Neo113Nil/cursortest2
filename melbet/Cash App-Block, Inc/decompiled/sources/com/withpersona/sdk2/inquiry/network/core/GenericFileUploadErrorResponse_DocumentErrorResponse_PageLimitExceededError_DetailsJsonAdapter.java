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
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_PageLimitExceededError_DetailsJsonAdapter extends JsonAdapter {
    private final JsonAdapter intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("page_limit");

    public GenericFileUploadErrorResponse_DocumentErrorResponse_PageLimitExceededError_DetailsJsonAdapter(Moshi moshi) {
        this.intAdapter = moshi.adapter(Integer.TYPE, EmptySet.INSTANCE, "pageLimit");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (num = (Integer) this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("pageLimit", "page_limit", jsonReader);
            }
        }
        jsonReader.endObject();
        if (num != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details(num.intValue());
        }
        throw Util.missingProperty("pageLimit", "page_limit", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details details) {
        if (details == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("page_limit");
        this.intAdapter.toJson(jsonWriter, Integer.valueOf(details.getPageLimit()));
        jsonWriter.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(105, "GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details)");
    }
}
