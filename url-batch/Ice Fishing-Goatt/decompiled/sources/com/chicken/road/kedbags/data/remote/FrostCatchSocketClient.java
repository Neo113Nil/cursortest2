package com.chicken.road.kedbags.data.remote;

import android.content.Context;
import android.webkit.WebSettings;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

/* compiled from: FrostCatchSocketClient.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000fH\u0086@¢\u0006\u0002\u0010\u0010J\"\u0010\u0011\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000fH\u0082@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/chicken/road/kedbags/data/remote/FrostCatchSocketClient;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "json", "Lkotlinx/serialization/json/Json;", "userAgent", "", "client", "Lokhttp3/OkHttpClient;", "fetch", "Lcom/chicken/road/kedbags/data/remote/FrostCatchDto;", "frame", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFrame", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FrostCatchSocketClient {
    public static final int $stable = 8;
    private final OkHttpClient client;
    private final Json json;
    private final String userAgent;

    public FrostCatchSocketClient(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.json = JsonKt.Json$default(null, new Function1() { // from class: com.chicken.road.kedbags.data.remote.FrostCatchSocketClient$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FrostCatchSocketClient.json$lambda$0((JsonBuilder) obj);
            }
        }, 1, null);
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        Intrinsics.checkNotNullExpressionValue(defaultUserAgent, "getDefaultUserAgent(...)");
        this.userAgent = defaultUserAgent;
        this.client = new OkHttpClient.Builder().connectTimeout(64000L, TimeUnit.MILLISECONDS).readTimeout(64000L, TimeUnit.MILLISECONDS).writeTimeout(64000L, TimeUnit.MILLISECONDS).pingInterval(FrostCatchConfig.PING_INTERVAL_MS, TimeUnit.MILLISECONDS).build();
    }

    static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        Json.setLenient(true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetch(Map<String, String> map, Continuation<? super FrostCatchDto> continuation) {
        FrostCatchSocketClient$fetch$1 frostCatchSocketClient$fetch$1;
        int i;
        FrostCatchDto frostCatchDto;
        if (continuation instanceof FrostCatchSocketClient$fetch$1) {
            frostCatchSocketClient$fetch$1 = (FrostCatchSocketClient$fetch$1) continuation;
            if ((frostCatchSocketClient$fetch$1.label & Integer.MIN_VALUE) != 0) {
                frostCatchSocketClient$fetch$1.label -= Integer.MIN_VALUE;
                Object obj = frostCatchSocketClient$fetch$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = frostCatchSocketClient$fetch$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    FrostCatchSocketClient$fetch$2 frostCatchSocketClient$fetch$2 = new FrostCatchSocketClient$fetch$2(this, map, null);
                    frostCatchSocketClient$fetch$1.L$0 = SpillingKt.nullOutSpilledVariable(map);
                    frostCatchSocketClient$fetch$1.label = 1;
                    obj = TimeoutKt.withTimeoutOrNull(64000L, frostCatchSocketClient$fetch$2, frostCatchSocketClient$fetch$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                frostCatchDto = (FrostCatchDto) obj;
                if (frostCatchDto == null) {
                    return frostCatchDto;
                }
                throw new IOException("WebSocket response timed out");
            }
        }
        frostCatchSocketClient$fetch$1 = new FrostCatchSocketClient$fetch$1(this, continuation);
        Object obj2 = frostCatchSocketClient$fetch$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = frostCatchSocketClient$fetch$1.label;
        if (i != 0) {
        }
        frostCatchDto = (FrostCatchDto) obj2;
        if (frostCatchDto == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitFrame(Map<String, String> map, Continuation<? super FrostCatchDto> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final String encodeToString = this.json.encodeToString(BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE)), map);
        WebSocketListener webSocketListener = new WebSocketListener() { // from class: com.chicken.road.kedbags.data.remote.FrostCatchSocketClient$awaitFrame$2$listener$1
            @Override // okhttp3.WebSocketListener
            public void onOpen(WebSocket webSocket, Response response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(response, "response");
                if (webSocket.send(encodeToString) || !atomicBoolean.compareAndSet(false, true)) {
                    return;
                }
                CancellableContinuation<FrostCatchDto> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m6577constructorimpl(ResultKt.createFailure(new IOException("Failed to send request frame"))));
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, String text) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(text, "text");
                settle(webSocket, text);
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, ByteString bytes) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                settle(webSocket, bytes.utf8());
            }

            private final void settle(WebSocket webSocket, String text) {
                Object m6577constructorimpl;
                if (atomicBoolean.compareAndSet(false, true)) {
                    webSocket.close(1000, null);
                    FrostCatchSocketClient frostCatchSocketClient = this;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        FrostCatchSocketClient$awaitFrame$2$listener$1 frostCatchSocketClient$awaitFrame$2$listener$1 = this;
                        m6577constructorimpl = Result.m6577constructorimpl((FrostCatchDto) frostCatchSocketClient.json.decodeFromString(FrostCatchDto.INSTANCE.serializer(), text));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m6577constructorimpl = Result.m6577constructorimpl(ResultKt.createFailure(th));
                    }
                    CancellableContinuation<FrostCatchDto> cancellableContinuation = cancellableContinuationImpl2;
                    Throwable m6580exceptionOrNullimpl = Result.m6580exceptionOrNullimpl(m6577constructorimpl);
                    if (m6580exceptionOrNullimpl == null) {
                        Result.Companion companion3 = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m6577constructorimpl((FrostCatchDto) m6577constructorimpl));
                    } else {
                        Result.Companion companion4 = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m6577constructorimpl(ResultKt.createFailure(m6580exceptionOrNullimpl)));
                    }
                }
            }

            @Override // okhttp3.WebSocketListener
            public void onClosing(WebSocket webSocket, int code, String reason) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(reason, "reason");
                webSocket.close(1000, null);
                if (atomicBoolean.compareAndSet(false, true)) {
                    CancellableContinuation<FrostCatchDto> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m6577constructorimpl(ResultKt.createFailure(new IOException("Socket closed before response"))));
                }
            }

            @Override // okhttp3.WebSocketListener
            public void onFailure(WebSocket webSocket, Throwable t, Response response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(t, "t");
                if (atomicBoolean.compareAndSet(false, true)) {
                    CancellableContinuation<FrostCatchDto> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m6577constructorimpl(ResultKt.createFailure(t)));
                }
            }
        };
        final WebSocket newWebSocket = this.client.newWebSocket(new Request.Builder().url(FrostCatchConfig.INSTANCE.getENDPOINT_URL()).header("User-Agent", this.userAgent).build(), webSocketListener);
        cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.chicken.road.kedbags.data.remote.FrostCatchSocketClient$awaitFrame$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                WebSocket.this.cancel();
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
