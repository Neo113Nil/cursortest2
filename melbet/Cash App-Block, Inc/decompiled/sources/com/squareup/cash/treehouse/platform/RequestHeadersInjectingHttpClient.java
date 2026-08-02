package com.squareup.cash.treehouse.platform;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.treehouse.network.HttpClient;
import com.squareup.cash.treehouse.network.HttpHeaders;
import com.squareup.cash.treehouse.network.HttpRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RequestHeadersInjectingHttpClient implements HttpClient {
    public HttpClient delegate;
    public final HttpHeaders extraHeaders;

    public RequestHeadersInjectingHttpClient(HttpClient httpClient, HttpHeaders httpHeaders) {
        httpClient.getClass();
        this.extraHeaders = httpHeaders;
        this.delegate = httpClient;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        HttpClient httpClient = this.delegate;
        if (httpClient != null) {
            httpClient.close();
        }
        this.delegate = null;
    }

    @Override // com.squareup.cash.treehouse.network.HttpClient
    public final Object execute(HttpRequest httpRequest, Continuation continuation) {
        HttpClient httpClient = this.delegate;
        if (httpClient == null) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        HttpHeaders httpHeaders = httpRequest.headers;
        httpHeaders.getClass();
        List list = this.extraHeaders.namesAndValues;
        ArrayList arrayList = new ArrayList();
        for (Pair pair : httpHeaders.namesAndValues) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (StringsKt__StringsJVMKt.equals((String) ((Pair) it.next()).first, (String) pair.first, true)) {
                        break;
                    }
                }
            }
            arrayList.add(pair);
        }
        CollectionsKt__MutableCollectionsKt.addAll(list, arrayList);
        HttpHeaders httpHeaders2 = new HttpHeaders(arrayList);
        String str = httpRequest.method;
        String str2 = httpRequest.url;
        ByteString byteString = httpRequest.body;
        str.getClass();
        str2.getClass();
        return httpClient.execute(new HttpRequest(str, str2, httpHeaders2, byteString), continuation);
    }
}
