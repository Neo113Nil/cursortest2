package com.squareup.cash.treehouse.network;

import coil3.network.okhttp.internal.CallsKt$await$2$1;
import com.squareup.kotterknife.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$1;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RealHttpClient implements HttpClient {
    public final HttpUrl baseUrl;
    public final Call.Factory callFactory;

    public RealHttpClient(Call.Factory factory, String str) {
        factory.getClass();
        this.callFactory = factory;
        HttpUrl httpUrl = null;
        if (str != null) {
            HttpUrl.Builder builder = new HttpUrl.Builder();
            builder.parse$okhttp(null, str);
            httpUrl = builder.build();
        }
        this.baseUrl = httpUrl;
    }

    public static final HttpResponse access$toHttpResponse(RealHttpClient realHttpClient, Response response) {
        int i = response.code;
        HttpHeaders httpHeaders = new HttpHeaders(CollectionsKt.toList(response.headers));
        ResponseBody responseBody = response.body;
        responseBody.getClass();
        return new HttpResponse(i, httpHeaders, responseBody.byteString());
    }

    @Override // com.squareup.cash.treehouse.network.HttpClient
    public final Object execute(HttpRequest httpRequest, Continuation continuation) {
        RequestBody$Companion$toRequestBody$1 requestBody$Companion$toRequestBody$1;
        HttpUrl build;
        int i = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        Request.Builder builder = new Request.Builder();
        String str = httpRequest.method;
        String str2 = httpRequest.url;
        ByteString byteString = httpRequest.body;
        if (byteString != null) {
            RequestBody.Companion.getClass();
            requestBody$Companion$toRequestBody$1 = new RequestBody$Companion$toRequestBody$1(null, byteString);
        } else {
            requestBody$Companion$toRequestBody$1 = null;
        }
        builder.method(str, requestBody$Companion$toRequestBody$1);
        HttpUrl httpUrl = this.baseUrl;
        if (httpUrl == null || (build = httpUrl.resolve(str2)) == null) {
            str2.getClass();
            HttpUrl.Builder builder2 = new HttpUrl.Builder();
            builder2.parse$okhttp(null, str2);
            build = builder2.build();
        }
        builder.url = build;
        HttpHeaders httpHeaders = httpRequest.headers;
        Headers.Builder builder3 = new Headers.Builder();
        for (Pair pair : httpHeaders.namesAndValues) {
            builder3.add((String) pair.first, (String) pair.second);
        }
        builder.headers = builder3.build().newBuilder();
        Call newCall = this.callFactory.newCall(new Request(builder));
        cancellableContinuationImpl.invokeOnCancellation(new CallsKt$await$2$1(newCall, i));
        ((RealCall) newCall).enqueue(new Lazy(21, cancellableContinuationImpl, this));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public /* synthetic */ RealHttpClient(Call.Factory factory) {
        this(factory, null);
    }
}
