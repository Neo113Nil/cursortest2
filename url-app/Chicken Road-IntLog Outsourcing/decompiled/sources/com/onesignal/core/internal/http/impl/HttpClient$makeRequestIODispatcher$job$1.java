package com.onesignal.core.internal.http.impl;

import android.net.TrafficStats;
import android.os.Build;
import com.onesignal.common.JSONUtils;
import com.onesignal.common.OneSignalWrapper;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IInstallIdService;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import f4.v;
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
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import org.json.JSONObject;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.core.internal.http.impl.HttpClient$makeRequestIODispatcher$job$1", f = "HttpClient.kt", l = {150}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpClient$makeRequestIODispatcher$job$1 extends h implements InterfaceC1441l {
    final /* synthetic */ OptionalHeaders $headers;
    final /* synthetic */ JSONObject $jsonBody;
    final /* synthetic */ String $method;
    final /* synthetic */ s $retVal;
    final /* synthetic */ int $timeout;
    final /* synthetic */ String $url;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClient$makeRequestIODispatcher$job$1(HttpClient httpClient, String str, int i2, JSONObject jSONObject, String str2, OptionalHeaders optionalHeaders, s sVar, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = httpClient;
        this.$url = str;
        this.$timeout = i2;
        this.$jsonBody = jSONObject;
        this.$method = str2;
        this.$headers = optionalHeaders;
        this.$retVal = sVar;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new HttpClient$makeRequestIODispatcher$job$1(this.this$0, this.$url, this.$timeout, this.$jsonBody, this.$method, this.$headers, this.$retVal, interfaceC1218d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0473, code lost:
    
        if (r14 != null) goto L128;
     */
    @Override // m4.AbstractC1293a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i2;
        HttpURLConnection httpURLConnection;
        IHttpConnectionFactory iHttpConnectionFactory;
        ConfigModelStore configModelStore;
        IInstallIdService iInstallIdService;
        Object id;
        String str;
        HttpURLConnection httpURLConnection2;
        Integer retryAfterFromResponse;
        Integer retryLimitFromResponse;
        ITime iTime;
        long j2;
        IPreferencesService iPreferencesService;
        String headerField;
        IPreferencesService iPreferencesService2;
        IPreferencesService iPreferencesService3;
        String str2;
        IPreferencesService iPreferencesService4;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i3 = this.label;
        if (i3 == 0) {
            g.y(obj);
            if (Build.VERSION.SDK_INT >= 26) {
                TrafficStats.setThreadStatsTag(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
            }
            try {
                iHttpConnectionFactory = this.this$0._connectionFactory;
                httpURLConnection = iHttpConnectionFactory.newHttpURLConnection(this.$url);
            } catch (Throwable th) {
                th = th;
                i2 = -1;
                httpURLConnection = null;
            }
            try {
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setConnectTimeout(this.$timeout);
                httpURLConnection.setReadTimeout(this.$timeout);
                httpURLConnection.setRequestProperty(HttpClientKt.HTTP_SDK_VERSION_HEADER_KEY, HttpClientKt.getHTTP_SDK_VERSION_HEADER_VALUE());
                if (OneSignalWrapper.getSdkType() != null && OneSignalWrapper.getSdkVersion() != null) {
                    httpURLConnection.setRequestProperty("SDK-Wrapper", "onesignal/" + OneSignalWrapper.getSdkType() + '/' + OneSignalWrapper.getSdkVersion());
                }
                httpURLConnection.setRequestProperty("Accept", "application/vnd.onesignal.v1+json");
                configModelStore = this.this$0._configModelStore;
                String pushSubscriptionId = configModelStore.getModel().getPushSubscriptionId();
                if (pushSubscriptionId != null && pushSubscriptionId.length() > 0) {
                    httpURLConnection.setRequestProperty("OneSignal-Subscription-Id", pushSubscriptionId);
                }
                iInstallIdService = this.this$0._installIdService;
                this.L$0 = httpURLConnection;
                this.L$1 = httpURLConnection;
                this.L$2 = "OneSignal-Install-Id";
                this.I$0 = -1;
                this.label = 1;
                id = iInstallIdService.getId(this);
                if (id == enumC1260a) {
                    return enumC1260a;
                }
                str = "OneSignal-Install-Id";
                httpURLConnection2 = httpURLConnection;
            } catch (Throwable th2) {
                th = th2;
                i2 = -1;
                if (!(th instanceof ConnectException)) {
                    Logging.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                    this.$retVal.f10741a = new HttpResponse(i2, null, th, null, null, 24, null);
                }
                Logging.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                this.$retVal.f10741a = new HttpResponse(i2, null, th, null, null, 24, null);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = this.I$0;
            str = (String) this.L$2;
            httpURLConnection2 = (HttpURLConnection) this.L$1;
            httpURLConnection = (HttpURLConnection) this.L$0;
            try {
                g.y(obj);
                id = obj;
            } catch (Throwable th3) {
                th = th3;
                i2 = i6;
                try {
                    if (!(th instanceof ConnectException) && !(th instanceof UnknownHostException)) {
                        Logging.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                        this.$retVal.f10741a = new HttpResponse(i2, null, th, null, null, 24, null);
                    }
                    Logging.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                    this.$retVal.f10741a = new HttpResponse(i2, null, th, null, null, 24, null);
                } catch (Throwable th4) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th4;
                }
            }
        }
        httpURLConnection2.setRequestProperty(str, ((UUID) id).toString());
        if (this.$jsonBody != null) {
            httpURLConnection.setDoInput(true);
        }
        if (this.$method != null) {
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpURLConnection.setRequestMethod(this.$method);
            httpURLConnection.setDoOutput(true);
        }
        OptionalHeaders optionalHeaders = this.$headers;
        if ((optionalHeaders != null ? optionalHeaders.getCacheKey() : null) != null) {
            iPreferencesService4 = this.this$0._prefs;
            String string$default = IPreferencesService.DefaultImpls.getString$default(iPreferencesService4, "OneSignal", PreferenceOneSignalKeys.PREFS_OS_ETAG_PREFIX + this.$headers.getCacheKey(), null, 4, null);
            if (string$default != null) {
                httpURLConnection.setRequestProperty("If-None-Match", string$default);
                Logging.debug$default("HttpClient: Adding header if-none-match: ".concat(string$default), null, 2, null);
            }
        }
        OptionalHeaders optionalHeaders2 = this.$headers;
        if ((optionalHeaders2 != null ? optionalHeaders2.getRywToken() : null) != null) {
            httpURLConnection.setRequestProperty("OneSignal-RYW-Token", this.$headers.getRywToken().toString());
        }
        OptionalHeaders optionalHeaders3 = this.$headers;
        if ((optionalHeaders3 != null ? optionalHeaders3.getRetryCount() : null) != null) {
            httpURLConnection.setRequestProperty("Onesignal-Retry-Count", this.$headers.getRetryCount().toString());
        }
        OptionalHeaders optionalHeaders4 = this.$headers;
        if ((optionalHeaders4 != null ? optionalHeaders4.getSessionDuration() : null) != null) {
            httpURLConnection.setRequestProperty("OneSignal-Session-Duration", this.$headers.getSessionDuration().toString());
        }
        OptionalHeaders optionalHeaders5 = this.$headers;
        if ((optionalHeaders5 != null ? optionalHeaders5.getJwt() : null) != null) {
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + this.$headers.getJwt());
        }
        HttpClient httpClient = this.this$0;
        String requestMethod = httpURLConnection.getRequestMethod();
        URL url = httpURLConnection.getURL();
        i.d(url, "getURL(...)");
        JSONObject jSONObject = this.$jsonBody;
        Map<String, List<String>> requestProperties = httpURLConnection.getRequestProperties();
        i.d(requestProperties, "getRequestProperties(...)");
        httpClient.logHTTPSent(requestMethod, url, jSONObject, requestProperties);
        JSONObject jSONObject2 = this.$jsonBody;
        if (jSONObject2 != null) {
            String unescapedEUIDString = JSONUtils.INSTANCE.toUnescapedEUIDString(jSONObject2);
            Charset forName = Charset.forName("UTF-8");
            i.d(forName, "forName(...)");
            byte[] bytes = unescapedEUIDString.getBytes(forName);
            i.d(bytes, "getBytes(...)");
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.getOutputStream().write(bytes);
        }
        int responseCode = httpURLConnection.getResponseCode();
        retryAfterFromResponse = this.this$0.retryAfterFromResponse(httpURLConnection);
        retryLimitFromResponse = this.this$0.retryLimitFromResponse(httpURLConnection);
        iTime = this.this$0._time;
        long currentTimeMillis = iTime.getCurrentTimeMillis() + ((retryAfterFromResponse != null ? retryAfterFromResponse.intValue() : 0) * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
        j2 = this.this$0.delayNewRequestsUntil;
        if (currentTimeMillis > j2) {
            this.this$0.delayNewRequestsUntil = currentTimeMillis;
        }
        String str3 = "GET";
        if (responseCode != 304) {
            switch (responseCode) {
                case 200:
                case 201:
                case 202:
                    Scanner scanner = new Scanner(httpURLConnection.getInputStream(), "UTF-8");
                    String next = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                    scanner.close();
                    StringBuilder sb = new StringBuilder("HttpClient: Got Response = ");
                    String str4 = this.$method;
                    sb.append(str4 == null ? "GET" : str4);
                    sb.append(' ');
                    sb.append(httpURLConnection.getURL());
                    sb.append(" - STATUS: ");
                    sb.append(responseCode);
                    sb.append(" - Body: ");
                    sb.append(next);
                    Logging.debug$default(sb.toString(), null, 2, null);
                    OptionalHeaders optionalHeaders6 = this.$headers;
                    if ((optionalHeaders6 != null ? optionalHeaders6.getCacheKey() : null) != null && (headerField = httpURLConnection.getHeaderField("etag")) != null) {
                        Logging.debug$default("HttpClient: Got Response = Response has etag of " + headerField + " so caching the response.", null, 2, null);
                        iPreferencesService2 = this.this$0._prefs;
                        iPreferencesService2.saveString("OneSignal", PreferenceOneSignalKeys.PREFS_OS_ETAG_PREFIX + this.$headers.getCacheKey(), headerField);
                        iPreferencesService3 = this.this$0._prefs;
                        iPreferencesService3.saveString("OneSignal", PreferenceOneSignalKeys.PREFS_OS_HTTP_CACHE_PREFIX + this.$headers.getCacheKey(), next);
                    }
                    this.$retVal.f10741a = new HttpResponse(responseCode, next, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder("HttpClient: Got Response = ");
                    String str5 = this.$method;
                    if (str5 != null) {
                        str3 = str5;
                    }
                    sb2.append(str3);
                    sb2.append(' ');
                    sb2.append(httpURLConnection.getURL());
                    sb2.append(" - FAILED STATUS: ");
                    sb2.append(responseCode);
                    Logging.debug$default(sb2.toString(), null, 2, null);
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream == null) {
                        errorStream = httpURLConnection.getInputStream();
                    }
                    if (errorStream != null) {
                        Scanner scanner2 = new Scanner(errorStream, "UTF-8");
                        String next2 = scanner2.useDelimiter("\\A").hasNext() ? scanner2.next() : "";
                        scanner2.close();
                        Logging.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - Body: " + next2, null, 2, null);
                        str2 = next2;
                    } else {
                        Logging.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - No response body!", null, 2, null);
                        str2 = null;
                    }
                    this.$retVal.f10741a = new HttpResponse(responseCode, str2, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                    break;
            }
        } else {
            iPreferencesService = this.this$0._prefs;
            StringBuilder sb3 = new StringBuilder(PreferenceOneSignalKeys.PREFS_OS_HTTP_CACHE_PREFIX);
            OptionalHeaders optionalHeaders7 = this.$headers;
            sb3.append(optionalHeaders7 != null ? optionalHeaders7.getCacheKey() : null);
            String string$default2 = IPreferencesService.DefaultImpls.getString$default(iPreferencesService, "OneSignal", sb3.toString(), null, 4, null);
            StringBuilder sb4 = new StringBuilder("HttpClient: Got Response = ");
            String str6 = this.$method;
            sb4.append(str6 == null ? "GET" : str6);
            sb4.append(' ');
            sb4.append(httpURLConnection.getURL());
            sb4.append(" - Using Cached response due to 304: ");
            sb4.append(string$default2);
            Logging.debug$default(sb4.toString(), null, 2, null);
            this.$retVal.f10741a = new HttpResponse(responseCode, string$default2, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
        }
        httpURLConnection.disconnect();
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((HttpClient$makeRequestIODispatcher$job$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
