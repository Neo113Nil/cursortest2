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
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class UiComponentError_UiGovernmentIdNfcScanComponentErrorJsonAdapter extends JsonAdapter {
    private volatile Constructor<UiComponentError.UiGovernmentIdNfcScanComponentError> constructorRef;
    private final JsonAdapter mapOfStringStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("name", "type", "message");
    private final JsonAdapter stringAdapter;

    public UiComponentError_UiGovernmentIdNfcScanComponentErrorJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.mapOfStringStringAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, String.class), emptySet, "message");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public UiComponentError.UiGovernmentIdNfcScanComponentError fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Map map = null;
        String str2 = null;
        int i = -1;
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
                i = -3;
            } else if (selectName == 2 && (map = (Map) this.mapOfStringStringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("message", "message", jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (str == null) {
                throw Util.missingProperty("name", "name", jsonReader);
            }
            if (map != null) {
                return new UiComponentError.UiGovernmentIdNfcScanComponentError(str, str2, map);
            }
            throw Util.missingProperty("message", "message", jsonReader);
        }
        Constructor<UiComponentError.UiGovernmentIdNfcScanComponentError> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = UiComponentError.UiGovernmentIdNfcScanComponentError.class.getDeclaredConstructor(String.class, String.class, Map.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("name", "name", jsonReader);
        }
        if (map != null) {
            return constructor.newInstance(str, str2, map, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("message", "message", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, UiComponentError.UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError) {
        if (uiGovernmentIdNfcScanComponentError == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, uiGovernmentIdNfcScanComponentError.getName());
        jsonWriter.name("type");
        this.stringAdapter.toJson(jsonWriter, uiGovernmentIdNfcScanComponentError.getType());
        jsonWriter.name("message");
        this.mapOfStringStringAdapter.toJson(jsonWriter, uiGovernmentIdNfcScanComponentError.getMessage());
        jsonWriter.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(74, "GeneratedJsonAdapter(UiComponentError.UiGovernmentIdNfcScanComponentError)");
    }
}
