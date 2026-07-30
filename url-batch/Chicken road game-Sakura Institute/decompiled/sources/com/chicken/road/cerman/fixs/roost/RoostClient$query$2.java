package com.chicken.road.cerman.fixs.roost;

import android.content.Context;
import android.webkit.WebSettings;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: RoostClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/chicken/road/cerman/fixs/roost/RoostReply;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.cerman.fixs.roost.RoostClient$query$2", f = "RoostClient.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RoostClient$query$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RoostReply>, Object> {
    final /* synthetic */ String $appsId;
    final /* synthetic */ String $baseUrl;
    final /* synthetic */ String $deviceUuid;
    final /* synthetic */ String $gaid;
    final /* synthetic */ String $installReferrer;
    final /* synthetic */ long $timeoutMs;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RoostClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoostClient$query$2(String str, String str2, String str3, String str4, String str5, long j, RoostClient roostClient, Continuation<? super RoostClient$query$2> continuation) {
        super(2, continuation);
        this.$baseUrl = str;
        this.$gaid = str2;
        this.$deviceUuid = str3;
        this.$installReferrer = str4;
        this.$appsId = str5;
        this.$timeoutMs = j;
        this.this$0 = roostClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RoostClient$query$2 roostClient$query$2 = new RoostClient$query$2(this.$baseUrl, this.$gaid, this.$deviceUuid, this.$installReferrer, this.$appsId, this.$timeoutMs, this.this$0, continuation);
        roostClient$query$2.L$0 = obj;
        return roostClient$query$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RoostReply> continuation) {
        return ((RoostClient$query$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object m6819constructorimpl;
        Object m6819constructorimpl2;
        Context context;
        String tidyAgent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (StringsKt.isBlank(this.$baseUrl)) {
                return null;
            }
            if (StringsKt.endsWith$default(this.$baseUrl, "/", false, 2, (Object) null)) {
                str = this.$baseUrl;
            } else {
                str = this.$baseUrl + "/";
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                m6819constructorimpl = Result.m6819constructorimpl(HttpUrl.INSTANCE.get(str));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m6819constructorimpl = Result.m6819constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m6825isFailureimpl(m6819constructorimpl)) {
                m6819constructorimpl = null;
            }
            HttpUrl httpUrl = (HttpUrl) m6819constructorimpl;
            if (httpUrl == null) {
                return null;
            }
            HttpUrl.Builder addQueryParameter = httpUrl.newBuilder().addQueryParameter(RoostBank.INSTANCE.at(5), this.$gaid).addQueryParameter(RoostBank.INSTANCE.at(6), this.$deviceUuid).addQueryParameter(RoostBank.INSTANCE.at(7), this.$installReferrer);
            if (!StringsKt.isBlank(this.$appsId)) {
                addQueryParameter.addQueryParameter(RoostBank.INSTANCE.at(8), this.$appsId);
            }
            HttpUrl build = addQueryParameter.build();
            RoostClient roostClient = this.this$0;
            try {
                Result.Companion companion3 = Result.INSTANCE;
                context = roostClient.appContext;
                String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                Intrinsics.checkNotNullExpressionValue(defaultUserAgent, "getDefaultUserAgent(...)");
                tidyAgent = roostClient.tidyAgent(defaultUserAgent);
                m6819constructorimpl2 = Result.m6819constructorimpl(tidyAgent);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m6819constructorimpl2 = Result.m6819constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m6825isFailureimpl(m6819constructorimpl2)) {
                m6819constructorimpl2 = null;
            }
            String str2 = (String) m6819constructorimpl2;
            Request.Builder header = new Request.Builder().url(build).header("Accept", "application/json");
            String str3 = str2;
            if (str3 != null && str3.length() != 0) {
                header.header("User-Agent", str2);
            }
            Request build2 = header.get().build();
            this.label = 1;
            obj = TimeoutKt.withTimeoutOrNull(this.$timeoutMs, new AnonymousClass1(this.this$0, build2, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    /* compiled from: RoostClient.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/chicken/road/cerman/fixs/roost/RoostReply;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.chicken.road.cerman.fixs.roost.RoostClient$query$2$1", f = "RoostClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.chicken.road.cerman.fixs.roost.RoostClient$query$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RoostReply>, Object> {
        final /* synthetic */ Request $request;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RoostClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RoostClient roostClient, Request request, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = roostClient;
            this.$request = request;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$request, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RoostReply> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6819constructorimpl;
            OkHttpClient okHttpClient;
            ResponseBody body;
            String string;
            Object m6819constructorimpl2;
            RoostReply roostReply;
            Json json;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RoostClient roostClient = this.this$0;
            Request request = this.$request;
            try {
                Result.Companion companion = Result.INSTANCE;
                okHttpClient = roostClient.http;
                Response execute = okHttpClient.newCall(request).execute();
                try {
                    Response response = execute;
                    if (!response.isSuccessful() || (body = response.body()) == null || (string = body.string()) == null) {
                        roostReply = null;
                    } else {
                        try {
                            Result.Companion companion2 = Result.INSTANCE;
                            json = roostClient.json;
                            m6819constructorimpl2 = Result.m6819constructorimpl((RoostReply) json.decodeFromString(RoostReply.INSTANCE.serializer(), string));
                        } catch (Throwable th) {
                            Result.Companion companion3 = Result.INSTANCE;
                            m6819constructorimpl2 = Result.m6819constructorimpl(ResultKt.createFailure(th));
                        }
                        if (Result.m6825isFailureimpl(m6819constructorimpl2)) {
                            m6819constructorimpl2 = null;
                        }
                        roostReply = (RoostReply) m6819constructorimpl2;
                    }
                    CloseableKt.closeFinally(execute, null);
                    m6819constructorimpl = Result.m6819constructorimpl(roostReply);
                } finally {
                }
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m6819constructorimpl = Result.m6819constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m6825isFailureimpl(m6819constructorimpl)) {
                return null;
            }
            return m6819constructorimpl;
        }
    }
}
