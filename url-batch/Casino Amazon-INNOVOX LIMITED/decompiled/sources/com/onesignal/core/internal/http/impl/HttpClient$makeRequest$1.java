package com.onesignal.core.internal.http.impl;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpClient.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.core.internal.http.impl.HttpClient", f = "HttpClient.kt", i = {0, 0, 0, 0, 0, 0, 1}, l = {89, 92}, m = "makeRequest", n = {"this", ImagesContract.URL, "method", "jsonBody", "headers", "timeout", ImagesContract.URL}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0"})
/* loaded from: classes3.dex */
final class HttpClient$makeRequest$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpClient$makeRequest$1(HttpClient httpClient, Continuation<? super HttpClient$makeRequest$1> continuation) {
        super(continuation);
        this.this$0 = httpClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object makeRequest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        makeRequest = this.this$0.makeRequest(null, null, null, 0, null, this);
        return makeRequest;
    }
}
