package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonReader;

/* loaded from: classes9.dex */
public final class JsonReaderUtilsKt {
    public static final String nextStringOrNull(JsonReader jsonReader) {
        if (jsonReader.peek() != JsonReader.Token.NULL) {
            return jsonReader.nextString();
        }
        jsonReader.nextNull();
        return null;
    }
}
