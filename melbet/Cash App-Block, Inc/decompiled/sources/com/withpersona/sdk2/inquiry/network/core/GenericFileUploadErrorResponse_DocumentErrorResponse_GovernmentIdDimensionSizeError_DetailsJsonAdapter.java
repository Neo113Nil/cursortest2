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
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter extends JsonAdapter {
    private final JsonAdapter intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("min_dimension_size", "max_dimension_size");

    public GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter(Moshi moshi) {
        this.intAdapter = moshi.adapter(Integer.TYPE, EmptySet.INSTANCE, "minDimensionSize");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Integer num2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("minDimensionSize", "min_dimension_size", jsonReader);
                }
            } else if (selectName == 1 && (num2 = (Integer) this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("maxDimensionSize", "max_dimension_size", jsonReader);
            }
        }
        jsonReader.endObject();
        if (num == null) {
            throw Util.missingProperty("minDimensionSize", "min_dimension_size", jsonReader);
        }
        int intValue = num.intValue();
        if (num2 != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details(intValue, num2.intValue());
        }
        throw Util.missingProperty("maxDimensionSize", "max_dimension_size", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details details) {
        if (details == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("min_dimension_size");
        this.intAdapter.toJson(jsonWriter, Integer.valueOf(details.getMinDimensionSize()));
        jsonWriter.name("max_dimension_size");
        this.intAdapter.toJson(jsonWriter, Integer.valueOf(details.getMaxDimensionSize()));
        jsonWriter.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(113, "GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details)");
    }
}
