package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;

/* loaded from: classes9.dex */
public final class NumberAdapter {
    public static final NumberAdapter INSTANCE = new NumberAdapter();

    private NumberAdapter() {
    }

    @FromJson
    public final Number fromJson(JsonReader jsonReader) {
        Object readJsonValue = jsonReader.readJsonValue();
        Number number = readJsonValue instanceof Number ? (Number) readJsonValue : null;
        if (number instanceof Double) {
            if (Double.compare(number.doubleValue(), (int) number.doubleValue()) == 0) {
                return Integer.valueOf((int) number.doubleValue());
            }
        } else if (!(number instanceof Integer)) {
            return null;
        }
        return number;
    }

    @ToJson
    public final void toJson(JsonWriter jsonWriter, Number number) {
    }
}
