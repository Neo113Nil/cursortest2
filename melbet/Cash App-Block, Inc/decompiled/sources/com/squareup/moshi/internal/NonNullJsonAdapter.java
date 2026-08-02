package com.squareup.moshi.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;

/* loaded from: classes9.dex */
public final class NonNullJsonAdapter extends JsonAdapter {
    public final JsonAdapter delegate;

    public NonNullJsonAdapter(JsonAdapter jsonAdapter) {
        this.delegate = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        if (jsonReader.peek() != JsonReader.Token.NULL) {
            return this.delegate.fromJson(jsonReader);
        }
        throw new JsonDataException("Unexpected null at ".concat(jsonReader.getPath()));
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            throw new JsonDataException("Unexpected null at ".concat(jsonWriter.getPath()));
        }
        this.delegate.toJson(jsonWriter, obj);
    }

    public final String toString() {
        return this.delegate + ".nonNull()";
    }
}
