package com.onesignal.core.internal.http.impl;

import android.net.TrafficStats;
import android.os.Build;
import androidx.compose.runtime.ComposerKt;
import com.onesignal.common.JSONUtils;
import com.onesignal.common.OneSignalWrapper;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IInstallIdService;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

/* compiled from: HttpClient.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.core.internal.http.impl.HttpClient$makeRequestIODispatcher$job$1", f = "HttpClient.kt", i = {0, 0}, l = {150}, m = "invokeSuspend", n = {"con", "httpResponse"}, s = {"L$0", "I$0"})
/* loaded from: classes3.dex */
final class HttpClient$makeRequestIODispatcher$job$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ OptionalHeaders $headers;
    final /* synthetic */ JSONObject $jsonBody;
    final /* synthetic */ String $method;
    final /* synthetic */ Ref.ObjectRef<HttpResponse> $retVal;
    final /* synthetic */ int $timeout;
    final /* synthetic */ String $url;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpClient$makeRequestIODispatcher$job$1(HttpClient httpClient, String str, int i, JSONObject jSONObject, String str2, OptionalHeaders optionalHeaders, Ref.ObjectRef<HttpResponse> objectRef, Continuation<? super HttpClient$makeRequestIODispatcher$job$1> continuation) {
        super(1, continuation);
        this.this$0 = httpClient;
        this.$url = str;
        this.$timeout = i;
        this.$jsonBody = jSONObject;
        this.$method = str2;
        this.$headers = optionalHeaders;
        this.$retVal = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HttpClient$makeRequestIODispatcher$job$1(this.this$0, this.$url, this.$timeout, this.$jsonBody, this.$method, this.$headers, this.$retVal, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((HttpClient$makeRequestIODispatcher$job$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x046f A[Catch: all -> 0x04bf, TryCatch #6 {all -> 0x04bf, blocks: (B:109:0x046b, B:111:0x046f, B:114:0x0474, B:115:0x04a7, B:119:0x048d), top: B:108:0x046b }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04b9 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r10v13, types: [T, com.onesignal.core.internal.http.HttpResponse] */
    /* JADX WARN: Type inference failed for: r15v11, types: [T, com.onesignal.core.internal.http.HttpResponse] */
    /* JADX WARN: Type inference failed for: r15v14, types: [T, com.onesignal.core.internal.http.HttpResponse] */
    /* JADX WARN: Type inference failed for: r15v15, types: [T, com.onesignal.core.internal.http.HttpResponse] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i;
        HttpURLConnection httpURLConnection;
        IHttpConnectionFactory iHttpConnectionFactory;
        HttpURLConnection newHttpURLConnection;
        ConfigModelStore configModelStore;
        IInstallIdService iInstallIdService;
        Object id;
        String str;
        HttpURLConnection httpURLConnection2;
        int i2;
        Throwable th2;
        int i3;
        Integer retryAfterFromResponse;
        Integer retryLimitFromResponse;
        ITime iTime;
        long j;
        IPreferencesService iPreferencesService;
        int i4;
        String headerField;
        IPreferencesService iPreferencesService2;
        IPreferencesService iPreferencesService3;
        String str2;
        IPreferencesService iPreferencesService4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = this.label;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            if (Build.VERSION.SDK_INT >= 26) {
                TrafficStats.setThreadStatsTag(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
            }
            try {
                iHttpConnectionFactory = this.this$0._connectionFactory;
                newHttpURLConnection = iHttpConnectionFactory.newHttpURLConnection(this.$url);
                try {
                    newHttpURLConnection.setUseCaches(false);
                    newHttpURLConnection.setConnectTimeout(this.$timeout);
                    newHttpURLConnection.setReadTimeout(this.$timeout);
                    newHttpURLConnection.setRequestProperty(HttpClientKt.HTTP_SDK_VERSION_HEADER_KEY, HttpClientKt.getHTTP_SDK_VERSION_HEADER_VALUE());
                    if (OneSignalWrapper.getSdkType() != null && OneSignalWrapper.getSdkVersion() != null) {
                        newHttpURLConnection.setRequestProperty("SDK-Wrapper", "onesignal/" + OneSignalWrapper.getSdkType() + IOUtils.DIR_SEPARATOR_UNIX + OneSignalWrapper.getSdkVersion());
                    }
                    newHttpURLConnection.setRequestProperty("Accept", "application/vnd.onesignal.v1+json");
                    configModelStore = this.this$0._configModelStore;
                    String pushSubscriptionId = configModelStore.getModel().getPushSubscriptionId();
                    if (pushSubscriptionId != null && pushSubscriptionId.length() > 0) {
                        newHttpURLConnection.setRequestProperty("OneSignal-Subscription-Id", pushSubscriptionId);
                    }
                    iInstallIdService = this.this$0._installIdService;
                    this.L$0 = newHttpURLConnection;
                    this.L$1 = newHttpURLConnection;
                    this.L$2 = "OneSignal-Install-Id";
                    this.I$0 = -1;
                    this.label = 1;
                    id = iInstallIdService.getId(this);
                    if (id == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = "OneSignal-Install-Id";
                    httpURLConnection2 = newHttpURLConnection;
                } catch (Throwable th3) {
                    th = th3;
                    i = -1;
                    httpURLConnection = newHttpURLConnection;
                    if (!(th instanceof ConnectException) && !(th instanceof UnknownHostException)) {
                        Logging.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                        this.$retVal.element = new HttpResponse(i, null, th, null, null, 24, null);
                        return Unit.INSTANCE;
                    }
                    Logging.info$default("HttpClient: Could not send last request, device is offline. Throwable: " + th.getClass().getName(), null, 2, null);
                    this.$retVal.element = new HttpResponse(i, null, th, null, null, 24, null);
                    return Unit.INSTANCE;
                }
            } catch (Throwable th4) {
                th = th4;
                i = -1;
                httpURLConnection = null;
                if (!(th instanceof ConnectException)) {
                }
                Logging.info$default("HttpClient: Could not send last request, device is offline. Throwable: " + th.getClass().getName(), null, 2, null);
                this.$retVal.element = new HttpResponse(i, null, th, null, null, 24, null);
                return Unit.INSTANCE;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.I$0;
            str = (String) this.L$2;
            httpURLConnection2 = (HttpURLConnection) this.L$1;
            newHttpURLConnection = (HttpURLConnection) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                id = obj;
            } catch (Throwable th5) {
                th2 = th5;
                th = th2;
                i = i2;
                httpURLConnection = newHttpURLConnection;
                try {
                    if (!(th instanceof ConnectException)) {
                        Logging.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                        this.$retVal.element = new HttpResponse(i, null, th, null, null, 24, null);
                        return Unit.INSTANCE;
                    }
                    Logging.info$default("HttpClient: Could not send last request, device is offline. Throwable: " + th.getClass().getName(), null, 2, null);
                    this.$retVal.element = new HttpResponse(i, null, th, null, null, 24, null);
                    return Unit.INSTANCE;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        }
        httpURLConnection2.setRequestProperty(str, ((UUID) id).toString());
        if (this.$jsonBody != null) {
            newHttpURLConnection.setDoInput(true);
        }
        if (this.$method != null) {
            newHttpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            newHttpURLConnection.setRequestMethod(this.$method);
            newHttpURLConnection.setDoOutput(true);
        }
        OptionalHeaders optionalHeaders = this.$headers;
        if ((optionalHeaders != null ? optionalHeaders.getCacheKey() : null) != null) {
            iPreferencesService4 = this.this$0._prefs;
            String string$default = IPreferencesService.DefaultImpls.getString$default(iPreferencesService4, "OneSignal", PreferenceOneSignalKeys.PREFS_OS_ETAG_PREFIX + this.$headers.getCacheKey(), null, 4, null);
            if (string$default != null) {
                newHttpURLConnection.setRequestProperty("If-None-Match", string$default);
                Logging.debug$default("HttpClient: Adding header if-none-match: " + string$default, null, 2, null);
            }
        }
        OptionalHeaders optionalHeaders2 = this.$headers;
        if ((optionalHeaders2 != null ? optionalHeaders2.getRywToken() : null) != null) {
            newHttpURLConnection.setRequestProperty("OneSignal-RYW-Token", this.$headers.getRywToken().toString());
        }
        OptionalHeaders optionalHeaders3 = this.$headers;
        if ((optionalHeaders3 != null ? optionalHeaders3.getRetryCount() : null) != null) {
            newHttpURLConnection.setRequestProperty("Onesignal-Retry-Count", this.$headers.getRetryCount().toString());
        }
        OptionalHeaders optionalHeaders4 = this.$headers;
        if ((optionalHeaders4 != null ? optionalHeaders4.getSessionDuration() : null) != null) {
            newHttpURLConnection.setRequestProperty("OneSignal-Session-Duration", this.$headers.getSessionDuration().toString());
        }
        OptionalHeaders optionalHeaders5 = this.$headers;
        if ((optionalHeaders5 != null ? optionalHeaders5.getJwt() : null) != null) {
            newHttpURLConnection.setRequestProperty("Authorization", "Bearer " + this.$headers.getJwt());
        }
        HttpClient httpClient = this.this$0;
        String requestMethod = newHttpURLConnection.getRequestMethod();
        URL url = newHttpURLConnection.getURL();
        Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
        JSONObject jSONObject = this.$jsonBody;
        Map<String, List<String>> requestProperties = newHttpURLConnection.getRequestProperties();
        Intrinsics.checkNotNullExpressionValue(requestProperties, "getRequestProperties(...)");
        httpClient.logHTTPSent(requestMethod, url, jSONObject, requestProperties);
        if (this.$jsonBody != null) {
            String unescapedEUIDString = JSONUtils.INSTANCE.toUnescapedEUIDString(this.$jsonBody);
            Charset forName = Charset.forName(CharEncoding.UTF_8);
            Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
            byte[] bytes = unescapedEUIDString.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            newHttpURLConnection.setFixedLengthStreamingMode(bytes.length);
            newHttpURLConnection.getOutputStream().write(bytes);
        }
        int responseCode = newHttpURLConnection.getResponseCode();
        try {
            retryAfterFromResponse = this.this$0.retryAfterFromResponse(newHttpURLConnection);
            retryLimitFromResponse = this.this$0.retryLimitFromResponse(newHttpURLConnection);
            iTime = this.this$0._time;
            long currentTimeMillis = iTime.getCurrentTimeMillis() + ((retryAfterFromResponse != null ? retryAfterFromResponse.intValue() : 0) * 1000);
            j = this.this$0.delayNewRequestsUntil;
            if (currentTimeMillis > j) {
                this.this$0.delayNewRequestsUntil = currentTimeMillis;
            }
            String str3 = "GET";
            if (responseCode == 304) {
                iPreferencesService = this.this$0._prefs;
                StringBuilder sb = new StringBuilder(PreferenceOneSignalKeys.PREFS_OS_HTTP_CACHE_PREFIX);
                OptionalHeaders optionalHeaders6 = this.$headers;
                String string$default2 = IPreferencesService.DefaultImpls.getString$default(iPreferencesService, "OneSignal", sb.append(optionalHeaders6 != null ? optionalHeaders6.getCacheKey() : null).toString(), null, 4, null);
                StringBuilder sb2 = new StringBuilder("HttpClient: Got Response = ");
                String str4 = this.$method;
                Logging.debug$default(sb2.append(str4 == null ? "GET" : str4).append(' ').append(newHttpURLConnection.getURL()).append(" - Using Cached response due to 304: ").append(string$default2).toString(), null, 2, null);
                i3 = responseCode;
                try {
                    this.$retVal.element = new HttpResponse(i3, string$default2, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                } catch (Throwable th6) {
                    th = th6;
                    th = th;
                    httpURLConnection = newHttpURLConnection;
                    i = i3;
                    if (!(th instanceof ConnectException)) {
                    }
                    Logging.info$default("HttpClient: Could not send last request, device is offline. Throwable: " + th.getClass().getName(), null, 2, null);
                    this.$retVal.element = new HttpResponse(i, null, th, null, null, 24, null);
                    return Unit.INSTANCE;
                }
            } else {
                try {
                    switch (responseCode) {
                        case 200:
                        case ComposerKt.providerKey /* 201 */:
                        case ComposerKt.compositionLocalMapKey /* 202 */:
                            Scanner scanner = new Scanner(newHttpURLConnection.getInputStream(), CharEncoding.UTF_8);
                            String next = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                            scanner.close();
                            StringBuilder sb3 = new StringBuilder("HttpClient: Got Response = ");
                            String str5 = this.$method;
                            if (str5 == null) {
                                str5 = "GET";
                            }
                            Logging.debug$default(sb3.append(str5).append(' ').append(newHttpURLConnection.getURL()).append(" - STATUS: ").append(responseCode).append(" - Body: ").append(next).toString(), null, 2, null);
                            OptionalHeaders optionalHeaders7 = this.$headers;
                            if ((optionalHeaders7 != null ? optionalHeaders7.getCacheKey() : null) != null && (headerField = newHttpURLConnection.getHeaderField("etag")) != null) {
                                Logging.debug$default("HttpClient: Got Response = Response has etag of " + headerField + " so caching the response.", null, 2, null);
                                iPreferencesService2 = this.this$0._prefs;
                                iPreferencesService2.saveString("OneSignal", PreferenceOneSignalKeys.PREFS_OS_ETAG_PREFIX + this.$headers.getCacheKey(), headerField);
                                iPreferencesService3 = this.this$0._prefs;
                                iPreferencesService3.saveString("OneSignal", PreferenceOneSignalKeys.PREFS_OS_HTTP_CACHE_PREFIX + this.$headers.getCacheKey(), next);
                            }
                            i4 = responseCode;
                            this.$retVal.element = new HttpResponse(i4, next, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                            break;
                        default:
                            StringBuilder sb4 = new StringBuilder("HttpClient: Got Response = ");
                            String str6 = this.$method;
                            if (str6 != null) {
                                str3 = str6;
                            }
                            Logging.debug$default(sb4.append(str3).append(' ').append(newHttpURLConnection.getURL()).append(" - FAILED STATUS: ").append(responseCode).toString(), null, 2, null);
                            InputStream errorStream = newHttpURLConnection.getErrorStream();
                            if (errorStream == null) {
                                errorStream = newHttpURLConnection.getInputStream();
                            }
                            if (errorStream != null) {
                                Scanner scanner2 = new Scanner(errorStream, CharEncoding.UTF_8);
                                String next2 = scanner2.useDelimiter("\\A").hasNext() ? scanner2.next() : "";
                                scanner2.close();
                                Logging.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - Body: " + next2, null, 2, null);
                                str2 = next2;
                            } else {
                                Logging.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - No response body!", null, 2, null);
                                str2 = null;
                            }
                            i4 = responseCode;
                            this.$retVal.element = new HttpResponse(i4, str2, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                            break;
                    }
                } catch (Throwable th7) {
                    th2 = th7;
                    i2 = i4;
                    th = th2;
                    i = i2;
                    httpURLConnection = newHttpURLConnection;
                    if (!(th instanceof ConnectException)) {
                    }
                    Logging.info$default("HttpClient: Could not send last request, device is offline. Throwable: " + th.getClass().getName(), null, 2, null);
                    this.$retVal.element = new HttpResponse(i, null, th, null, null, 24, null);
                    return Unit.INSTANCE;
                }
            }
            if (newHttpURLConnection != null) {
                newHttpURLConnection.disconnect();
            }
        } catch (Throwable th8) {
            th = th8;
            i3 = responseCode;
        }
        return Unit.INSTANCE;
    }
}
