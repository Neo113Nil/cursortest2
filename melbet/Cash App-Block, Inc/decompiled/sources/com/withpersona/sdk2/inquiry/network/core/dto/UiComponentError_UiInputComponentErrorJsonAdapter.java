package com.withpersona.sdk2.inquiry.network.core.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class UiComponentError_UiInputComponentErrorJsonAdapter extends JsonAdapter {
    private final JsonReader.Options options = JsonReader.Options.of("name", "type", "message");
    private final JsonAdapter stringAdapter;

    public UiComponentError_UiInputComponentErrorJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "name");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public UiComponentError.UiInputComponentError fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("name", "name", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 2 && (str3 = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("message", "message", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("name", "name", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (str3 != null) {
            return new UiComponentError.UiInputComponentError(str, str2, str3);
        }
        throw Util.missingProperty("message", "message", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, UiComponentError.UiInputComponentError uiInputComponentError) {
        if (uiInputComponentError == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, uiInputComponentError.getName());
        jsonWriter.name("type");
        this.stringAdapter.toJson(jsonWriter, uiInputComponentError.getType());
        jsonWriter.name("message");
        this.stringAdapter.toJson(jsonWriter, uiInputComponentError.getMessage());
        jsonWriter.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(60, "GeneratedJsonAdapter(UiComponentError.UiInputComponentError)");
    }
}
