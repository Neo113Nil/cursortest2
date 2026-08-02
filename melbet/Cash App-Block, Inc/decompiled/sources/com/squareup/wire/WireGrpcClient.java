package com.squareup.wire;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final class WireGrpcClient extends GrpcClient {
    public final HttpUrl baseUrl;
    public final OkHttpClient client;

    public WireGrpcClient(OkHttpClient okHttpClient, HttpUrl httpUrl) {
        this.client = okHttpClient;
        this.baseUrl = httpUrl;
    }
}
