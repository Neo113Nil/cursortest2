package dev.cct.translatorapp.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ApiService.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.util.ApiService", f = "ApiService.kt", i = {}, l = {87, 88}, m = "searchDictionary", n = {}, s = {})
/* loaded from: classes3.dex */
final class ApiService$searchDictionary$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ApiService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApiService$searchDictionary$1(ApiService apiService, Continuation<? super ApiService$searchDictionary$1> continuation) {
        super(continuation);
        this.this$0 = apiService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.searchDictionary(null, this);
    }
}
