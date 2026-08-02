package com.squareup.cash.work.tinygraph.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.wire.WireJsonAdapterFactory;

/* loaded from: classes7.dex */
public abstract class ProtoDeserializer {
    public static final Moshi moshi;

    static {
        Moshi.Builder builder = new Moshi.Builder();
        builder.add((JsonAdapter.Factory) new WireJsonAdapterFactory());
        moshi = new Moshi(builder);
    }
}
