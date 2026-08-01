package io.ktor.client.plugins.websocket;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.plugins.websocket.WebSockets;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import io.ktor.http.HttpMethod;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLParserKt;
import io.ktor.http.URLProtocol;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import io.ktor.websocket.WebSocketSessionKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: builders.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u001a'\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006\u001aW\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0087\u0001\u0010\u0007\u001a\u00020\u0001*\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001aa\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00142\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a.\u0010\u001b\u001a\u00020\r*\u00020\b2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a^\u0010\u001b\u001a\u00020\r*\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a8\u0010\u001b\u001a\u00020\r*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00142\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001aW\u0010\u001f\u001a\u00020\u0001*\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0087\u0001\u0010\u001f\u001a\u00020\u0001*\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001aa\u0010\u001f\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00142\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001aW\u0010 \u001a\u00020\u0001*\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0087\u0001\u0010 \u001a\u00020\u0001*\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001aa\u0010 \u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00142\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u00062'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"WebSockets", "", "Lio/ktor/client/HttpClientConfig;", "config", "Lkotlin/Function1;", "Lio/ktor/client/plugins/websocket/WebSockets$Config;", "Lkotlin/ExtensionFunctionType;", "webSocket", "Lio/ktor/client/HttpClient;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "block", "Lkotlin/Function2;", "Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;", "Lkotlin/coroutines/Continuation;", "", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", FirebaseAnalytics.Param.METHOD, "Lio/ktor/http/HttpMethod;", "host", "", AgentOptions.PORT, "", "path", "(Lio/ktor/client/HttpClient;Lio/ktor/http/HttpMethod;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "urlString", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "webSocketSession", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/client/HttpClient;Lio/ktor/http/HttpMethod;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ws", "wss", "ktor-client-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BuildersKt {
    public static final void WebSockets(HttpClientConfig<?> httpClientConfig, final Function1<? super WebSockets.Config, Unit> config) {
        Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        httpClientConfig.install(WebSockets.INSTANCE, new Function1<WebSockets.Config, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$WebSockets$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WebSockets.Config config2) {
                invoke2(config2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(WebSockets.Config install) {
                Intrinsics.checkNotNullParameter(install, "$this$install");
                config.invoke(install);
            }
        });
    }

    public static final Object webSocketSession(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super DefaultClientWebSocketSession> continuation) {
        HttpClientPluginKt.plugin(httpClient, WebSockets.INSTANCE);
        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.url(new Function2<URLBuilder, URLBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$statement$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(URLBuilder uRLBuilder, URLBuilder uRLBuilder2) {
                invoke2(uRLBuilder, uRLBuilder2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(URLBuilder url, URLBuilder it) {
                Intrinsics.checkNotNullParameter(url, "$this$url");
                Intrinsics.checkNotNullParameter(it, "it");
                url.setProtocol(URLProtocol.INSTANCE.getWS());
                url.setPort(url.getProtocol().getDefaultPort());
            }
        });
        function1.invoke(httpRequestBuilder);
        BuildersKt__Builders_commonKt.launch$default(httpClient, null, null, new BuildersKt$webSocketSession$2(new HttpStatement(httpRequestBuilder, httpClient), CompletableDeferred$default, null), 3, null);
        return CompletableDeferred$default.await(continuation);
    }

    public static /* synthetic */ Object webSocketSession$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            httpMethod = HttpMethod.INSTANCE.getGet();
        }
        HttpMethod httpMethod2 = httpMethod;
        String str3 = (i & 2) != 0 ? null : str;
        Integer num2 = (i & 4) != 0 ? null : num;
        String str4 = (i & 8) != 0 ? null : str2;
        if ((i & 16) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        return webSocketSession(httpClient, httpMethod2, str3, num2, str4, function1, continuation);
    }

    public static final Object webSocketSession(HttpClient httpClient, final HttpMethod httpMethod, final String str, final Integer num, final String str2, final Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super DefaultClientWebSocketSession> continuation) {
        return webSocketSession(httpClient, new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                invoke2(httpRequestBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(HttpRequestBuilder webSocketSession) {
                Intrinsics.checkNotNullParameter(webSocketSession, "$this$webSocketSession");
                webSocketSession.setMethod(HttpMethod.this);
                HttpRequestKt.url$default(webSocketSession, "ws", str, num, str2, null, 16, null);
                function1.invoke(webSocketSession);
            }
        }, continuation);
    }

    public static /* synthetic */ Object webSocketSession$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        return webSocketSession(httpClient, str, function1, continuation);
    }

    public static final Object webSocketSession(HttpClient httpClient, final String str, final Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super DefaultClientWebSocketSession> continuation) {
        return webSocketSession(httpClient, new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                invoke2(httpRequestBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(HttpRequestBuilder webSocketSession) {
                Intrinsics.checkNotNullParameter(webSocketSession, "$this$webSocketSession");
                URLParserKt.takeFrom(webSocketSession.getUrl(), str);
                function1.invoke(webSocketSession);
            }
        }, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|76|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0089, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5 A[Catch: all -> 0x0089, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0089, blocks: (B:20:0x004c, B:21:0x0143, B:23:0x005b, B:24:0x011d, B:31:0x010b, B:37:0x0131, B:41:0x0085, B:43:0x00f5, B:51:0x0144, B:52:0x014b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0144 A[Catch: all -> 0x0089, TryCatch #3 {all -> 0x0089, blocks: (B:20:0x004c, B:21:0x0143, B:23:0x005b, B:24:0x011d, B:31:0x010b, B:37:0x0131, B:41:0x0085, B:43:0x00f5, B:51:0x0144, B:52:0x014b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r10v1, types: [io.ktor.client.statement.HttpStatement] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r9v1, types: [io.ktor.client.statement.HttpResponse] */
    /* JADX WARN: Type inference failed for: r9v5, types: [io.ktor.client.statement.HttpResponse, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object webSocket(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        BuildersKt$webSocket$1 buildersKt$webSocket$1;
        HttpStatement httpStatement;
        Function2 function22;
        HttpStatement httpStatement2;
        Function2 function23;
        HttpResponse httpResponse;
        DefaultClientWebSocketSession defaultClientWebSocketSession;
        DefaultClientWebSocketSession defaultClientWebSocketSession2;
        HttpStatement httpStatement3;
        HttpResponse httpResponse2;
        HttpStatement httpStatement4;
        HttpResponse httpResponse3;
        try {
            if (continuation instanceof BuildersKt$webSocket$1) {
                buildersKt$webSocket$1 = (BuildersKt$webSocket$1) continuation;
                if ((buildersKt$webSocket$1.label & Integer.MIN_VALUE) != 0) {
                    buildersKt$webSocket$1.label -= Integer.MIN_VALUE;
                    Object obj = buildersKt$webSocket$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (buildersKt$webSocket$1.label) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            HttpClientPluginKt.plugin(httpClient, WebSockets.INSTANCE);
                            HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                            httpRequestBuilder.url(new Function2<URLBuilder, URLBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$webSocket$session$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(URLBuilder uRLBuilder, URLBuilder uRLBuilder2) {
                                    invoke2(uRLBuilder, uRLBuilder2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(URLBuilder url, URLBuilder it) {
                                    Intrinsics.checkNotNullParameter(url, "$this$url");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    url.setProtocol(URLProtocol.INSTANCE.getWS());
                                }
                            });
                            function1.invoke(httpRequestBuilder);
                            HttpStatement httpStatement5 = new HttpStatement(httpRequestBuilder, httpClient);
                            buildersKt$webSocket$1.L$0 = function2;
                            buildersKt$webSocket$1.L$1 = httpStatement5;
                            buildersKt$webSocket$1.label = 1;
                            obj = httpStatement5.executeUnsafe(buildersKt$webSocket$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            httpStatement = httpStatement5;
                            function22 = function2;
                            function1 = (HttpResponse) obj;
                            try {
                                HttpClientCall call = function1.getCall();
                                KType typeOf = Reflection.typeOf(DefaultClientWebSocketSession.class);
                                TypeInfo typeInfoImpl = TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(typeOf), Reflection.getOrCreateKotlinClass(DefaultClientWebSocketSession.class), typeOf);
                                buildersKt$webSocket$1.L$0 = function22;
                                buildersKt$webSocket$1.L$1 = httpStatement;
                                buildersKt$webSocket$1.L$2 = function1;
                                buildersKt$webSocket$1.label = 2;
                                obj = call.bodyNullable(typeInfoImpl, buildersKt$webSocket$1);
                                if (obj != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                Function2 function24 = function22;
                                httpStatement2 = httpStatement;
                                function23 = function24;
                                httpResponse = function1;
                                if (obj != null) {
                                    throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.DefaultClientWebSocketSession");
                                }
                                defaultClientWebSocketSession = (DefaultClientWebSocketSession) obj;
                                BuildersKt$webSocket$1 buildersKt$webSocket$12 = buildersKt$webSocket$1;
                                try {
                                    buildersKt$webSocket$1.L$0 = httpStatement2;
                                    buildersKt$webSocket$1.L$1 = httpResponse;
                                    buildersKt$webSocket$1.L$2 = defaultClientWebSocketSession;
                                    buildersKt$webSocket$1.label = 3;
                                    if (function23.invoke(defaultClientWebSocketSession, buildersKt$webSocket$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    defaultClientWebSocketSession2 = defaultClientWebSocketSession;
                                    httpResponse2 = httpResponse;
                                    httpStatement3 = httpStatement2;
                                    buildersKt$webSocket$1.L$0 = httpStatement3;
                                    buildersKt$webSocket$1.L$1 = httpResponse2;
                                    buildersKt$webSocket$1.L$2 = null;
                                    buildersKt$webSocket$1.label = 4;
                                    httpResponse3 = httpResponse2;
                                    httpStatement4 = httpStatement3;
                                    if (WebSocketSessionKt.close$default(defaultClientWebSocketSession2, null, buildersKt$webSocket$1, 1, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    buildersKt$webSocket$1.L$0 = Unit.INSTANCE;
                                    buildersKt$webSocket$1.L$1 = null;
                                    buildersKt$webSocket$1.label = 6;
                                    if (httpStatement4.cleanup(httpResponse3, buildersKt$webSocket$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    return Unit.INSTANCE;
                                } catch (Throwable th) {
                                    th = th;
                                    buildersKt$webSocket$1.L$0 = httpStatement2;
                                    buildersKt$webSocket$1.L$1 = httpResponse;
                                    buildersKt$webSocket$1.L$2 = th;
                                    buildersKt$webSocket$1.label = 5;
                                    if (WebSocketSessionKt.close$default(defaultClientWebSocketSession, null, buildersKt$webSocket$1, 1, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                function2 = httpStatement;
                                th = th2;
                                buildersKt$webSocket$1.L$0 = th;
                                buildersKt$webSocket$1.L$1 = null;
                                buildersKt$webSocket$1.L$2 = null;
                                buildersKt$webSocket$1.label = 7;
                                if (function2.cleanup(function1, buildersKt$webSocket$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                throw th;
                            }
                        case 1:
                            httpStatement = (HttpStatement) buildersKt$webSocket$1.L$1;
                            Function2 function25 = (Function2) buildersKt$webSocket$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            function22 = function25;
                            function1 = (HttpResponse) obj;
                            HttpClientCall call2 = function1.getCall();
                            KType typeOf2 = Reflection.typeOf(DefaultClientWebSocketSession.class);
                            TypeInfo typeInfoImpl2 = TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(typeOf2), Reflection.getOrCreateKotlinClass(DefaultClientWebSocketSession.class), typeOf2);
                            buildersKt$webSocket$1.L$0 = function22;
                            buildersKt$webSocket$1.L$1 = httpStatement;
                            buildersKt$webSocket$1.L$2 = function1;
                            buildersKt$webSocket$1.label = 2;
                            obj = call2.bodyNullable(typeInfoImpl2, buildersKt$webSocket$1);
                            if (obj != coroutine_suspended) {
                            }
                            break;
                        case 2:
                            HttpResponse httpResponse4 = (HttpResponse) buildersKt$webSocket$1.L$2;
                            HttpStatement httpStatement6 = (HttpStatement) buildersKt$webSocket$1.L$1;
                            function23 = (Function2) buildersKt$webSocket$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            httpResponse = httpResponse4;
                            httpStatement2 = httpStatement6;
                            if (obj != null) {
                            }
                            break;
                        case 3:
                            defaultClientWebSocketSession2 = (DefaultClientWebSocketSession) buildersKt$webSocket$1.L$2;
                            httpResponse = (HttpResponse) buildersKt$webSocket$1.L$1;
                            httpStatement2 = (HttpStatement) buildersKt$webSocket$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                httpResponse2 = httpResponse;
                                httpStatement3 = httpStatement2;
                                buildersKt$webSocket$1.L$0 = httpStatement3;
                                buildersKt$webSocket$1.L$1 = httpResponse2;
                                buildersKt$webSocket$1.L$2 = null;
                                buildersKt$webSocket$1.label = 4;
                                httpResponse3 = httpResponse2;
                                httpStatement4 = httpStatement3;
                                if (WebSocketSessionKt.close$default(defaultClientWebSocketSession2, null, buildersKt$webSocket$1, 1, null) == coroutine_suspended) {
                                }
                                buildersKt$webSocket$1.L$0 = Unit.INSTANCE;
                                buildersKt$webSocket$1.L$1 = null;
                                buildersKt$webSocket$1.label = 6;
                                if (httpStatement4.cleanup(httpResponse3, buildersKt$webSocket$1) == coroutine_suspended) {
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th3) {
                                defaultClientWebSocketSession = defaultClientWebSocketSession2;
                                th = th3;
                                buildersKt$webSocket$1.L$0 = httpStatement2;
                                buildersKt$webSocket$1.L$1 = httpResponse;
                                buildersKt$webSocket$1.L$2 = th;
                                buildersKt$webSocket$1.label = 5;
                                if (WebSocketSessionKt.close$default(defaultClientWebSocketSession, null, buildersKt$webSocket$1, 1, null) == coroutine_suspended) {
                                }
                                throw th;
                            }
                        case 4:
                            HttpResponse httpResponse5 = (HttpResponse) buildersKt$webSocket$1.L$1;
                            HttpStatement httpStatement7 = (HttpStatement) buildersKt$webSocket$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            httpResponse3 = httpResponse5;
                            httpStatement4 = httpStatement7;
                            buildersKt$webSocket$1.L$0 = Unit.INSTANCE;
                            buildersKt$webSocket$1.L$1 = null;
                            buildersKt$webSocket$1.label = 6;
                            if (httpStatement4.cleanup(httpResponse3, buildersKt$webSocket$1) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        case 5:
                            th = (Throwable) buildersKt$webSocket$1.L$2;
                            ResultKt.throwOnFailure(obj);
                            throw th;
                        case 6:
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        case 7:
                            th = (Throwable) buildersKt$webSocket$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            throw th;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (buildersKt$webSocket$1.label) {
            }
        } catch (CancellationException e) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
        buildersKt$webSocket$1 = new BuildersKt$webSocket$1(continuation);
        Object obj2 = buildersKt$webSocket$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public static final Object webSocket(HttpClient httpClient, final HttpMethod httpMethod, final String str, final Integer num, final String str2, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object webSocket = webSocket(httpClient, new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$webSocket$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                invoke2(httpRequestBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(HttpRequestBuilder webSocket2) {
                Intrinsics.checkNotNullParameter(webSocket2, "$this$webSocket");
                webSocket2.setMethod(HttpMethod.this);
                HttpRequestKt.url$default(webSocket2, "ws", str, num, str2, null, 16, null);
                function1.invoke(webSocket2);
            }
        }, function2, continuation);
        return webSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : Unit.INSTANCE;
    }

    public static /* synthetic */ Object webSocket$default(HttpClient httpClient, String str, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$webSocket$7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        return webSocket(httpClient, str, function1, function2, continuation);
    }

    public static final Object webSocket(HttpClient httpClient, final String str, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object webSocket = webSocket(httpClient, HttpMethod.INSTANCE.getGet(), null, null, null, new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$webSocket$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                invoke2(httpRequestBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(HttpRequestBuilder webSocket2) {
                Intrinsics.checkNotNullParameter(webSocket2, "$this$webSocket");
                webSocket2.getUrl().setProtocol(URLProtocol.INSTANCE.getWS());
                webSocket2.getUrl().setPort(UtilsKt.getPort(webSocket2));
                URLParserKt.takeFrom(webSocket2.getUrl(), str);
                function1.invoke(webSocket2);
            }
        }, function2, continuation);
        return webSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : Unit.INSTANCE;
    }

    public static final Object ws(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object webSocket = webSocket(httpClient, httpMethod, str, num, str2, function1, function2, continuation);
        return webSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : Unit.INSTANCE;
    }

    public static final Object ws(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object webSocket = webSocket(httpClient, function1, function2, continuation);
        return webSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : Unit.INSTANCE;
    }

    public static /* synthetic */ Object ws$default(HttpClient httpClient, String str, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$ws$5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        return ws(httpClient, str, function1, function2, continuation);
    }

    public static final Object ws(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object webSocket = webSocket(httpClient, str, function1, function2, continuation);
        return webSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : Unit.INSTANCE;
    }

    public static final Object wss(HttpClient httpClient, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object webSocket = webSocket(httpClient, new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$wss$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                invoke2(httpRequestBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(HttpRequestBuilder webSocket2) {
                Intrinsics.checkNotNullParameter(webSocket2, "$this$webSocket");
                webSocket2.getUrl().setProtocol(URLProtocol.INSTANCE.getWSS());
                webSocket2.getUrl().setPort(webSocket2.getUrl().getProtocol().getDefaultPort());
                function1.invoke(webSocket2);
            }
        }, function2, continuation);
        return webSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : Unit.INSTANCE;
    }

    public static /* synthetic */ Object wss$default(HttpClient httpClient, String str, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$wss$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        return wss(httpClient, str, function1, function2, continuation);
    }

    public static final Object wss(HttpClient httpClient, final String str, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object wss = wss(httpClient, new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$wss$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                invoke2(httpRequestBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(HttpRequestBuilder wss2) {
                Intrinsics.checkNotNullParameter(wss2, "$this$wss");
                URLParserKt.takeFrom(wss2.getUrl(), str);
                function1.invoke(wss2);
            }
        }, function2, continuation);
        return wss == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? wss : Unit.INSTANCE;
    }

    public static final Object wss(HttpClient httpClient, HttpMethod httpMethod, String str, final Integer num, String str2, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object webSocket = webSocket(httpClient, httpMethod, str, num, str2, new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$wss$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                invoke2(httpRequestBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(HttpRequestBuilder webSocket2) {
                Intrinsics.checkNotNullParameter(webSocket2, "$this$webSocket");
                webSocket2.getUrl().setProtocol(URLProtocol.INSTANCE.getWSS());
                if (num != null) {
                    webSocket2.getUrl().setPort(num.intValue());
                }
                function1.invoke(webSocket2);
            }
        }, function2, continuation);
        return webSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : Unit.INSTANCE;
    }
}
