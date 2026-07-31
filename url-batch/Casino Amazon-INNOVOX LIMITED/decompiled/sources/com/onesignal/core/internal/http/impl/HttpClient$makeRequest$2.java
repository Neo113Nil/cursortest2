package com.onesignal.core.internal.http.impl;

import com.onesignal.core.internal.http.HttpResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* compiled from: HttpClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/onesignal/core/internal/http/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.core.internal.http.impl.HttpClient$makeRequest$2", f = "HttpClient.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HttpClient$makeRequest$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HttpResponse>, Object> {
    final /* synthetic */ OptionalHeaders $headers;
    final /* synthetic */ JSONObject $jsonBody;
    final /* synthetic */ String $method;
    final /* synthetic */ int $timeout;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ HttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpClient$makeRequest$2(HttpClient httpClient, String str, String str2, JSONObject jSONObject, int i, OptionalHeaders optionalHeaders, Continuation<? super HttpClient$makeRequest$2> continuation) {
        super(2, continuation);
        this.this$0 = httpClient;
        this.$url = str;
        this.$method = str2;
        this.$jsonBody = jSONObject;
        this.$timeout = i;
        this.$headers = optionalHeaders;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HttpClient$makeRequest$2(this.this$0, this.$url, this.$method, this.$jsonBody, this.$timeout, this.$headers, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpResponse> continuation) {
        return ((HttpClient$makeRequest$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object makeRequestIODispatcher;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        this.label = 1;
        makeRequestIODispatcher = this.this$0.makeRequestIODispatcher(this.$url, this.$method, this.$jsonBody, this.$timeout, this.$headers, this);
        return makeRequestIODispatcher == coroutine_suspended ? coroutine_suspended : makeRequestIODispatcher;
    }
}
