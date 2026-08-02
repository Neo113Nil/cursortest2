package com.withpersona.sdk2.inquiry.network.core.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import java.util.Map;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class UiComponentError_UiInputAddressComponentErrorJsonAdapter extends JsonAdapter {
    private final JsonAdapter mapOfStringStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("name", "type", "message");
    private final JsonAdapter stringAdapter;

    public UiComponentError_UiInputAddressComponentErrorJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.mapOfStringStringAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, String.class), emptySet, "message");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public UiComponentError.UiInputAddressComponentError fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Map map = null;
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
            } else if (selectName == 2 && (map = (Map) this.mapOfStringStringAdapter.fromJson(jsonReader)) == null) {
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
        if (map != null) {
            return new UiComponentError.UiInputAddressComponentError(str, str2, map);
        }
        throw Util.missingProperty("message", "message", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, UiComponentError.UiInputAddressComponentError uiInputAddressComponentError) {
        if (uiInputAddressComponentError == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, uiInputAddressComponentError.getName());
        jsonWriter.name("type");
        this.stringAdapter.toJson(jsonWriter, uiInputAddressComponentError.getType());
        jsonWriter.name("message");
        this.mapOfStringStringAdapter.toJson(jsonWriter, uiInputAddressComponentError.getMessage());
        jsonWriter.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(67, "GeneratedJsonAdapter(UiComponentError.UiInputAddressComponentError)");
    }
}
