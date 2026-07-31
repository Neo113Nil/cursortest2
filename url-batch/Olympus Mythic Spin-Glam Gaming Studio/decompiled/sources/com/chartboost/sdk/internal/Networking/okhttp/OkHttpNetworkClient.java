package com.chartboost.sdk.internal.Networking.okhttp;

import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.ae;
import com.chartboost.sdk.impl.sd;
import com.chartboost.sdk.impl.wd;
import com.chartboost.sdk.impl.xb;
import com.ironsource.C4701ic;
import com.safedk.android.internal.partials.ChartboostNetworkBridge;
import java.io.Closeable;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\tB%\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ>\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\t\u0010\nJ,\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H\u0096@¢\u0006\u0004\b\t\u0010\u000bJ@\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0004\b\t\u0010\u000fJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\t\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/chartboost/sdk/internal/Networking/okhttp/OkHttpNetworkClient;", "Lcom/chartboost/sdk/impl/sd;", "", "url", "jsonBody", "", "headers", "contentType", "Lcom/chartboost/sdk/impl/wd;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "method", "Lokhttp3/RequestBody;", "requestBody", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lokhttp3/OkHttpClient;", "", "connectTimeoutSecs", "writeTimeoutSecs", "readTimeoutSecs", "<init>", "(JJJ)V", "Companion", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class OkHttpNetworkClient implements sd {

    @Nullable
    public static volatile Interceptor customInterceptor;

    @NotNull
    private final OkHttpClient okHttpClient;

    public static final class b extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return OkHttpNetworkClient.this.a(null, this);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ String d;
        public final /* synthetic */ Map e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Map map, Continuation continuation) {
            super(2, continuation);
            this.d = str;
            this.e = map;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return OkHttpNetworkClient.this.new c(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OkHttpNetworkClient okHttpNetworkClient = OkHttpNetworkClient.this;
                String str = this.d;
                Map map = this.e;
                this.b = 1;
                obj = OkHttpNetworkClient.a(okHttpNetworkClient, str, map, C4701ic.a, null, this, 8, null);
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
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ OkHttpNetworkClient e;
        public final /* synthetic */ String f;
        public final /* synthetic */ Map g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, OkHttpNetworkClient okHttpNetworkClient, String str3, Map map, Continuation continuation) {
            super(2, continuation);
            this.c = str;
            this.d = str2;
            this.e = okHttpNetworkClient;
            this.f = str3;
            this.g = map;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MediaType.Companion companion = MediaType.INSTANCE;
                String str = this.c;
                if (str == null) {
                    str = "application/json; charset=utf-8";
                }
                RequestBody create = RequestBody.INSTANCE.create(this.d, companion.get(str));
                OkHttpNetworkClient okHttpNetworkClient = this.e;
                String str2 = this.f;
                Map map = this.g;
                this.b = 1;
                obj = okHttpNetworkClient.a(str2, map, "POST", create, this);
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
    }

    public OkHttpNetworkClient(long j, long j2, long j3) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder readTimeout = builder.connectTimeout(j, timeUnit).writeTimeout(j2, timeUnit).readTimeout(j3, timeUnit);
        Interceptor interceptor = customInterceptor;
        if (interceptor != null) {
            xb.a("Adding custom networking interceptor: " + interceptor.getClass().getSimpleName(), (Throwable) null, 2, (Object) null);
            readTimeout.addInterceptor(interceptor);
        }
        this.okHttpClient = readTimeout.build();
    }

    @Override // com.chartboost.sdk.impl.sd
    public Object a(String str, String str2, Map map, String str3, Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new d(str3, str2, this, str, map, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.sd
    public Object a(String str, Map map, Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new c(str, map, null), continuation);
    }

    public static /* synthetic */ Object a(OkHttpNetworkClient okHttpNetworkClient, String str, Map map, String str2, RequestBody requestBody, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            requestBody = null;
        }
        return okHttpNetworkClient.a(str, map, str2, requestBody, continuation);
    }

    public final Object a(String str, Map map, String str2, RequestBody requestBody, Continuation continuation) {
        try {
            Request.Builder method = new Request.Builder().url(str).method(str2, requestBody);
            for (Map.Entry entry : map.entrySet()) {
                method.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
            return a(method.build(), continuation);
        } catch (IllegalArgumentException e) {
            xb.a("Invalid URL: " + str, e);
            String message = e.getMessage();
            if (message == null) {
                message = "malformed URL";
            }
            return new wd(false, -1, null, new ChartboostError.Connectivity.Unknown("Invalid URL: " + message, e), null, 20, null);
        }
    }

    public /* synthetic */ OkHttpNetworkClient(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 5L : j, (i & 2) != 0 ? 5L : j2, (i & 4) != 0 ? 5L : j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x013a, code lost:
    
        if (r11 == null) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x0053, B:16:0x0061, B:18:0x0067, B:20:0x006d, B:22:0x0078, B:23:0x007f, B:25:0x0087, B:26:0x0094), top: B:13:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x0053, B:16:0x0061, B:18:0x0067, B:20:0x006d, B:22:0x0078, B:23:0x007f, B:25:0x0087, B:26:0x0094), top: B:13:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Request request, Continuation continuation) {
        b bVar;
        int i;
        wd wdVar;
        String str;
        Closeable closeable;
        MediaType mediaType;
        Charset charset$default;
        try {
            try {
                if (continuation instanceof b) {
                    bVar = (b) continuation;
                    int i2 = bVar.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        bVar.e = i2 - Integer.MIN_VALUE;
                        Object obj = bVar.c;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = bVar.e;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            OkHttpClient okHttpClient = this.okHttpClient;
                            bVar.b = request;
                            bVar.e = 1;
                            obj = ae.a(okHttpClient, request, bVar);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        closeable = (Closeable) obj;
                        Response response = (Response) closeable;
                        boolean isSuccessful = response.isSuccessful();
                        ResponseBody okhttp3Response_body = ChartboostNetworkBridge.okhttp3Response_body(response);
                        wd wdVar2 = new wd(isSuccessful, response.code(), okhttp3Response_body == null ? okhttp3Response_body.bytes() : null, isSuccessful ? a.c.b(response.code()) : null, (okhttp3Response_body != null || (mediaType = okhttp3Response_body.get$contentType()) == null || (charset$default = MediaType.charset$default(mediaType, null, 1, null)) == null) ? null : charset$default.name());
                        CloseableKt.closeFinally(closeable, null);
                        return wdVar2;
                    }
                }
                Response response2 = (Response) closeable;
                boolean isSuccessful2 = response2.isSuccessful();
                ResponseBody okhttp3Response_body2 = ChartboostNetworkBridge.okhttp3Response_body(response2);
                if (okhttp3Response_body2 != null) {
                }
                if (okhttp3Response_body2 == null) {
                }
                wd wdVar22 = new wd(isSuccessful2, response2.code(), okhttp3Response_body2 == null ? okhttp3Response_body2.bytes() : null, isSuccessful2 ? a.c.b(response2.code()) : null, (okhttp3Response_body2 != null || (mediaType = okhttp3Response_body2.get$contentType()) == null || (charset$default = MediaType.charset$default(mediaType, null, 1, null)) == null) ? null : charset$default.name());
                CloseableKt.closeFinally(closeable, null);
                return wdVar22;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(closeable, th);
                    throw th2;
                }
            }
            if (i != 0) {
            }
            closeable = (Closeable) obj;
        } catch (SocketTimeoutException e) {
            xb.a("SocketTimeoutException while making network request to " + request.url(), e);
            wdVar = new wd(false, -1, null, ChartboostError.Connectivity.TimedOut.INSTANCE, null, 20, null);
            return wdVar;
        } catch (UnknownHostException e2) {
            xb.a("UnknownHostException while making network request to " + request.url(), e2);
            String message = e2.getMessage();
            if (message != null) {
                str = "Unknown host: " + message;
            }
            str = "Unknown host";
            wdVar = new wd(false, -1, null, new ChartboostError.Connectivity.NetworkError(str, e2), null, 20, null);
            return wdVar;
        } catch (IOException e3) {
            xb.a("IOException while making network request to " + request.url(), e3);
            String message2 = e3.getMessage();
            if (message2 == null) {
                message2 = "Network error";
            }
            wdVar = new wd(false, -1, null, new ChartboostError.Connectivity.NetworkError(message2, e3), null, 20, null);
            return wdVar;
        } catch (Exception e4) {
            xb.a("Exception while making network request to " + request.url(), e4);
            String message3 = e4.getMessage();
            if (message3 == null) {
                message3 = "Unknown error";
            }
            wdVar = new wd(false, -1, null, new ChartboostError.Connectivity.Unknown(message3, e4), null, 20, null);
            return wdVar;
        }
        bVar = new b(continuation);
        Object obj2 = bVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.e;
    }
}
