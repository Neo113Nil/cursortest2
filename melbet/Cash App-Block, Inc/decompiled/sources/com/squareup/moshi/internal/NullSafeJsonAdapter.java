package com.squareup.moshi.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;

/* loaded from: classes.dex */
public final class NullSafeJsonAdapter extends JsonAdapter {
    public final JsonAdapter delegate;

    public NullSafeJsonAdapter(JsonAdapter jsonAdapter) {
        this.delegate = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        if (jsonReader.peek() != JsonReader.Token.NULL) {
            return this.delegate.fromJson(jsonReader);
        }
        jsonReader.nextNull();
        return null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.delegate.toJson(jsonWriter, obj);
        }
    }

    public final String toString() {
        return this.delegate + ".nullSafe()";
    }
}
