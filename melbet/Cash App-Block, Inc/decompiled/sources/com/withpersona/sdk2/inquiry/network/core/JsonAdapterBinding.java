package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonAdapter;

/* loaded from: classes9.dex */
public final class JsonAdapterBinding<T> {
    private final Class<T> clazz;
    private final JsonAdapter jsonAdapter;

    public JsonAdapterBinding(Class<T> cls, JsonAdapter jsonAdapter) {
        this.clazz = cls;
        this.jsonAdapter = jsonAdapter;
    }

    public final Class<T> getClazz() {
        return this.clazz;
    }

    public final JsonAdapter getJsonAdapter() {
        return this.jsonAdapter;
    }
}
