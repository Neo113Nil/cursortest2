package com.onesignal.core.internal.http.impl;

import com.google.android.gms.common.internal.ImagesContract;
import com.onesignal.common.JSONUtils;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IInstallIdService;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import io.opentelemetry.semconv.HttpAttributes;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import org.json.JSONObject;

/* compiled from: HttpClient.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0002\u0010\u0015J \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J>\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120!0 H\u0002J<\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0082@¢\u0006\u0002\u0010#J<\u0010$\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0082@¢\u0006\u0002\u0010#J(\u0010%\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u001f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0002\u0010'J(\u0010(\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u001f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0002\u0010'J(\u0010)\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u001f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0002\u0010'J\u0017\u0010*\u001a\u0004\u0018\u00010\u00182\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0002\u0010-J\u0017\u0010.\u001a\u0004\u0018\u00010\u00182\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0002\u0010-R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/onesignal/core/internal/http/impl/HttpClient;", "Lcom/onesignal/core/internal/http/IHttpClient;", "_connectionFactory", "Lcom/onesignal/core/internal/http/impl/IHttpConnectionFactory;", "_prefs", "Lcom/onesignal/core/internal/preferences/IPreferencesService;", "_configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "_time", "Lcom/onesignal/core/internal/time/ITime;", "_installIdService", "Lcom/onesignal/core/internal/device/IInstallIdService;", "(Lcom/onesignal/core/internal/http/impl/IHttpConnectionFactory;Lcom/onesignal/core/internal/preferences/IPreferencesService;Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/core/internal/time/ITime;Lcom/onesignal/core/internal/device/IInstallIdService;)V", "delayNewRequestsUntil", "", "delete", "Lcom/onesignal/core/internal/http/HttpResponse;", ImagesContract.URL, "", "headers", "Lcom/onesignal/core/internal/http/impl/OptionalHeaders;", "(Ljava/lang/String;Lcom/onesignal/core/internal/http/impl/OptionalHeaders;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "getThreadTimeout", "", "timeout", "logHTTPSent", "", "method", "Ljava/net/URL;", "jsonBody", "Lorg/json/JSONObject;", "", "", "makeRequest", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILcom/onesignal/core/internal/http/impl/OptionalHeaders;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeRequestIODispatcher", "patch", "body", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/onesignal/core/internal/http/impl/OptionalHeaders;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "post", "put", "retryAfterFromResponse", "con", "Ljava/net/HttpURLConnection;", "(Ljava/net/HttpURLConnection;)Ljava/lang/Integer;", "retryLimitFromResponse", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpClient implements IHttpClient {
    private static final String OS_ACCEPT_HEADER = "application/vnd.onesignal.v1+json";
    private static final String OS_API_VERSION = "1";
    private static final int THREAD_ID = 10000;
    private final ConfigModelStore _configModelStore;
    private final IHttpConnectionFactory _connectionFactory;
    private final IInstallIdService _installIdService;
    private final IPreferencesService _prefs;
    private final ITime _time;
    private long delayNewRequestsUntil;

    private final int getThreadTimeout(int timeout) {
        return timeout + 5000;
    }

    public HttpClient(IHttpConnectionFactory _connectionFactory, IPreferencesService _prefs, ConfigModelStore _configModelStore, ITime _time, IInstallIdService _installIdService) {
        Intrinsics.checkNotNullParameter(_connectionFactory, "_connectionFactory");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_installIdService, "_installIdService");
        this._connectionFactory = _connectionFactory;
        this._prefs = _prefs;
        this._configModelStore = _configModelStore;
        this._time = _time;
        this._installIdService = _installIdService;
    }

    @Override // com.onesignal.core.internal.http.IHttpClient
    public Object post(String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, Continuation<? super HttpResponse> continuation) {
        return makeRequest(str, "POST", jSONObject, this._configModelStore.getModel().getHttpTimeout(), optionalHeaders, continuation);
    }

    @Override // com.onesignal.core.internal.http.IHttpClient
    public Object get(String str, OptionalHeaders optionalHeaders, Continuation<? super HttpResponse> continuation) {
        return makeRequest(str, null, null, this._configModelStore.getModel().getHttpGetTimeout(), optionalHeaders, continuation);
    }

    @Override // com.onesignal.core.internal.http.IHttpClient
    public Object put(String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, Continuation<? super HttpResponse> continuation) {
        return makeRequest(str, HttpAttributes.HttpRequestMethodValues.PUT, jSONObject, this._configModelStore.getModel().getHttpTimeout(), optionalHeaders, continuation);
    }

    @Override // com.onesignal.core.internal.http.IHttpClient
    public Object patch(String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, Continuation<? super HttpResponse> continuation) {
        return makeRequest(str, HttpAttributes.HttpRequestMethodValues.PATCH, jSONObject, this._configModelStore.getModel().getHttpTimeout(), optionalHeaders, continuation);
    }

    @Override // com.onesignal.core.internal.http.IHttpClient
    public Object delete(String str, OptionalHeaders optionalHeaders, Continuation<? super HttpResponse> continuation) {
        return makeRequest(str, HttpAttributes.HttpRequestMethodValues.DELETE, null, this._configModelStore.getModel().getHttpTimeout(), optionalHeaders, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0128 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeRequest(String str, String str2, JSONObject jSONObject, int i, OptionalHeaders optionalHeaders, Continuation<? super HttpResponse> continuation) {
        HttpClient$makeRequest$1 httpClient$makeRequest$1;
        Object coroutine_suspended;
        int i2;
        JSONObject jSONObject2;
        int i3;
        OptionalHeaders optionalHeaders2;
        String str3;
        HttpClient httpClient;
        String str4;
        HttpClient httpClient2;
        String str5;
        String str6 = str2;
        try {
            try {
                if (continuation instanceof HttpClient$makeRequest$1) {
                    httpClient$makeRequest$1 = (HttpClient$makeRequest$1) continuation;
                    if ((httpClient$makeRequest$1.label & Integer.MIN_VALUE) != 0) {
                        httpClient$makeRequest$1.label -= Integer.MIN_VALUE;
                        Object obj = httpClient$makeRequest$1.result;
                        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i2 = httpClient$makeRequest$1.label;
                        if (i2 != 0) {
                            ResultKt.throwOnFailure(obj);
                            if (str6 != null && Intrinsics.areEqual(this._configModelStore.getModel().getConsentRequired(), Boxing.boxBoolean(true)) && !Intrinsics.areEqual(this._configModelStore.getModel().getConsentGiven(), Boxing.boxBoolean(true))) {
                                Logging.warn$default(str6 + " `" + str + "` was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.privacyConsent", null, 2, null);
                                return new HttpResponse(0, null, null, null, null, 24, null);
                            }
                            long currentTimeMillis = this.delayNewRequestsUntil - this._time.getCurrentTimeMillis();
                            if (currentTimeMillis > 0) {
                                httpClient$makeRequest$1.L$0 = this;
                                httpClient$makeRequest$1.L$1 = str;
                                httpClient$makeRequest$1.L$2 = str6;
                                jSONObject2 = jSONObject;
                                httpClient$makeRequest$1.L$3 = jSONObject2;
                                optionalHeaders2 = optionalHeaders;
                                httpClient$makeRequest$1.L$4 = optionalHeaders2;
                                i3 = i;
                                httpClient$makeRequest$1.I$0 = i3;
                                httpClient$makeRequest$1.label = 1;
                                if (DelayKt.delay(currentTimeMillis, httpClient$makeRequest$1) != coroutine_suspended) {
                                    str4 = str;
                                    httpClient2 = this;
                                }
                            }
                            jSONObject2 = jSONObject;
                            i3 = i;
                            optionalHeaders2 = optionalHeaders;
                            str3 = str;
                            httpClient = this;
                            String str7 = str6;
                            JSONObject jSONObject3 = jSONObject2;
                            OptionalHeaders optionalHeaders3 = optionalHeaders2;
                            long threadTimeout = httpClient.getThreadTimeout(i3);
                            HttpClient$makeRequest$2 httpClient$makeRequest$2 = new HttpClient$makeRequest$2(httpClient, str3, str7, jSONObject3, i3, optionalHeaders3, null);
                            httpClient$makeRequest$1.L$0 = str3;
                            httpClient$makeRequest$1.L$1 = null;
                            httpClient$makeRequest$1.L$2 = null;
                            httpClient$makeRequest$1.L$3 = null;
                            httpClient$makeRequest$1.L$4 = null;
                            httpClient$makeRequest$1.label = 2;
                            Object withTimeout = TimeoutKt.withTimeout(threadTimeout, httpClient$makeRequest$2, httpClient$makeRequest$1);
                            return withTimeout == coroutine_suspended ? coroutine_suspended : withTimeout;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str5 = (String) httpClient$makeRequest$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                return obj;
                            } catch (TimeoutCancellationException e) {
                                e = e;
                                TimeoutCancellationException timeoutCancellationException = e;
                                Logging.info("HttpClient: Request timed out: " + str5, timeoutCancellationException);
                                return new HttpResponse(0, null, timeoutCancellationException, null, null, 24, null);
                            }
                        }
                        int i4 = httpClient$makeRequest$1.I$0;
                        OptionalHeaders optionalHeaders4 = (OptionalHeaders) httpClient$makeRequest$1.L$4;
                        JSONObject jSONObject4 = (JSONObject) httpClient$makeRequest$1.L$3;
                        String str8 = (String) httpClient$makeRequest$1.L$2;
                        str4 = (String) httpClient$makeRequest$1.L$1;
                        httpClient2 = (HttpClient) httpClient$makeRequest$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        i3 = i4;
                        jSONObject2 = jSONObject4;
                        optionalHeaders2 = optionalHeaders4;
                        str6 = str8;
                        str3 = str4;
                        httpClient = httpClient2;
                        String str72 = str6;
                        JSONObject jSONObject32 = jSONObject2;
                        OptionalHeaders optionalHeaders32 = optionalHeaders2;
                        long threadTimeout2 = httpClient.getThreadTimeout(i3);
                        HttpClient$makeRequest$2 httpClient$makeRequest$22 = new HttpClient$makeRequest$2(httpClient, str3, str72, jSONObject32, i3, optionalHeaders32, null);
                        httpClient$makeRequest$1.L$0 = str3;
                        httpClient$makeRequest$1.L$1 = null;
                        httpClient$makeRequest$1.L$2 = null;
                        httpClient$makeRequest$1.L$3 = null;
                        httpClient$makeRequest$1.L$4 = null;
                        httpClient$makeRequest$1.label = 2;
                        Object withTimeout2 = TimeoutKt.withTimeout(threadTimeout2, httpClient$makeRequest$22, httpClient$makeRequest$1);
                        if (withTimeout2 == coroutine_suspended) {
                        }
                    }
                }
                long threadTimeout22 = httpClient.getThreadTimeout(i3);
                HttpClient$makeRequest$2 httpClient$makeRequest$222 = new HttpClient$makeRequest$2(httpClient, str3, str72, jSONObject32, i3, optionalHeaders32, null);
                httpClient$makeRequest$1.L$0 = str3;
                httpClient$makeRequest$1.L$1 = null;
                httpClient$makeRequest$1.L$2 = null;
                httpClient$makeRequest$1.L$3 = null;
                httpClient$makeRequest$1.L$4 = null;
                httpClient$makeRequest$1.label = 2;
                Object withTimeout22 = TimeoutKt.withTimeout(threadTimeout22, httpClient$makeRequest$222, httpClient$makeRequest$1);
                if (withTimeout22 == coroutine_suspended) {
                }
            } catch (TimeoutCancellationException e2) {
                e = e2;
                str5 = str3;
                TimeoutCancellationException timeoutCancellationException2 = e;
                Logging.info("HttpClient: Request timed out: " + str5, timeoutCancellationException2);
                return new HttpResponse(0, null, timeoutCancellationException2, null, null, 24, null);
            }
            if (i2 != 0) {
            }
            str3 = str4;
            httpClient = httpClient2;
            String str722 = str6;
            JSONObject jSONObject322 = jSONObject2;
            OptionalHeaders optionalHeaders322 = optionalHeaders2;
        } catch (Throwable th) {
            return new HttpResponse(0, null, th, null, null, 24, null);
        }
        httpClient$makeRequest$1 = new HttpClient$makeRequest$1(this, continuation);
        Object obj2 = httpClient$makeRequest$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = httpClient$makeRequest$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeRequestIODispatcher(String str, String str2, JSONObject jSONObject, int i, OptionalHeaders optionalHeaders, Continuation<? super HttpResponse> continuation) {
        HttpClient$makeRequestIODispatcher$1 httpClient$makeRequestIODispatcher$1;
        int i2;
        Ref.ObjectRef objectRef;
        if (continuation instanceof HttpClient$makeRequestIODispatcher$1) {
            httpClient$makeRequestIODispatcher$1 = (HttpClient$makeRequestIODispatcher$1) continuation;
            if ((httpClient$makeRequestIODispatcher$1.label & Integer.MIN_VALUE) != 0) {
                httpClient$makeRequestIODispatcher$1.label -= Integer.MIN_VALUE;
                Object obj = httpClient$makeRequestIODispatcher$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = httpClient$makeRequestIODispatcher$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    Job launchOnIO = ThreadUtilsKt.launchOnIO(new HttpClient$makeRequestIODispatcher$job$1(this, str, i, jSONObject, str2, optionalHeaders, objectRef2, null));
                    httpClient$makeRequestIODispatcher$1.L$0 = objectRef2;
                    httpClient$makeRequestIODispatcher$1.label = 1;
                    if (launchOnIO.join(httpClient$makeRequestIODispatcher$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) httpClient$makeRequestIODispatcher$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                T t = objectRef.element;
                Intrinsics.checkNotNull(t);
                return t;
            }
        }
        httpClient$makeRequestIODispatcher$1 = new HttpClient$makeRequestIODispatcher$1(this, continuation);
        Object obj2 = httpClient$makeRequestIODispatcher$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = httpClient$makeRequestIODispatcher$1.label;
        if (i2 != 0) {
        }
        T t2 = objectRef.element;
        Intrinsics.checkNotNull(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryAfterFromResponse(HttpURLConnection con) {
        String headerField = con.getHeaderField("Retry-After");
        if (headerField != null) {
            Logging.debug$default("HttpClient: Response Retry-After: " + headerField, null, 2, null);
            Integer intOrNull = StringsKt.toIntOrNull(headerField);
            return Integer.valueOf(intOrNull != null ? intOrNull.intValue() : this._configModelStore.getModel().getHttpRetryAfterParseFailFallback());
        }
        if (con.getResponseCode() == 429) {
            return Integer.valueOf(this._configModelStore.getModel().getHttpRetryAfterParseFailFallback());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryLimitFromResponse(HttpURLConnection con) {
        String headerField = con.getHeaderField("OneSignal-Retry-Limit");
        if (headerField == null) {
            return null;
        }
        Logging.debug$default("HttpClient: Response OneSignal-Retry-Limit: " + headerField, null, 2, null);
        return StringsKt.toIntOrNull(headerField);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logHTTPSent(String method, URL url, JSONObject jsonBody, Map<String, ? extends List<String>> headers) {
        String joinToString$default = CollectionsKt.joinToString$default(headers.entrySet(), null, null, null, 0, null, null, 63, null);
        if (method == null) {
            method = "GET";
        }
        Logging.debug$default("HttpClient: Request Sent = " + method + ' ' + url + " - Body: " + (jsonBody != null ? JSONUtils.INSTANCE.toUnescapedEUIDString(jsonBody) : null) + " - Headers: " + joinToString$default, null, 2, null);
    }
}
