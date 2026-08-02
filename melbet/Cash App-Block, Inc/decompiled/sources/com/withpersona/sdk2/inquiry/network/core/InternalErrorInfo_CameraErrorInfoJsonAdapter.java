package com.withpersona.sdk2.inquiry.network.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class InternalErrorInfo_CameraErrorInfoJsonAdapter extends JsonAdapter {
    private final JsonReader.Options options = JsonReader.Options.of("message");
    private final JsonAdapter stringAdapter;

    public InternalErrorInfo_CameraErrorInfoJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "message");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public InternalErrorInfo.CameraErrorInfo fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (str = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("message", "message", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new InternalErrorInfo.CameraErrorInfo(str);
        }
        throw Util.missingProperty("message", "message", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, InternalErrorInfo.CameraErrorInfo cameraErrorInfo) {
        if (cameraErrorInfo == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("message");
        this.stringAdapter.toJson(jsonWriter, cameraErrorInfo.getMessage());
        jsonWriter.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(55, "GeneratedJsonAdapter(InternalErrorInfo.CameraErrorInfo)");
    }
}
