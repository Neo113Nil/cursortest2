package com.squareup.wire;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.wire.internal.EnumJsonFormatter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class EnumJsonAdapter extends JsonAdapter {
    public final EnumJsonFormatter enumJsonFormatter;

    public EnumJsonAdapter(EnumJsonFormatter enumJsonFormatter) {
        this.enumJsonFormatter = enumJsonFormatter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        String nextString = jsonReader.nextString();
        nextString.getClass();
        Enum r3 = (Enum) this.enumJsonFormatter.fromString(nextString);
        if (r3 != null) {
            return r3;
        }
        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Unexpected ", nextString, " at path ");
        m3m.append(jsonReader.getPath());
        throw new JsonDataException(m3m.toString());
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Comparable comparable = (Enum) obj;
        jsonWriter.getClass();
        if (comparable == null) {
            jsonWriter.nullValue();
            return;
        }
        WireEnum wireEnum = (WireEnum) comparable;
        Object obj2 = (String) this.enumJsonFormatter.valueToString.get(wireEnum);
        if (obj2 == null) {
            obj2 = Integer.valueOf(wireEnum.getValue());
        }
        if (obj2 instanceof Number) {
            jsonWriter.value((Number) obj2);
        } else {
            jsonWriter.value(obj2.toString());
        }
    }
}
