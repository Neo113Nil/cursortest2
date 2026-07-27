package com.onesignal.core.internal.http.impl;

import B4.r;
import D4.AbstractC0024y;
import D4.X;
import D4.g0;
import D4.r0;
import com.onesignal.common.JSONUtils;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IInstallIdService;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import g4.AbstractC0465j;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import l4.EnumC1260a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class HttpClient implements IHttpClient {
    public static final Companion Companion = new Companion(null);
    private static final String OS_ACCEPT_HEADER = "application/vnd.onesignal.v1+json";
    private static final String OS_API_VERSION = "1";
    private static final int THREAD_ID = 10000;
    private final ConfigModelStore _configModelStore;
    private final IHttpConnectionFactory _connectionFactory;
    private final IInstallIdService _installIdService;
    private final IPreferencesService _prefs;
    private final ITime _time;
    private long delayNewRequestsUntil;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public HttpClient(IHttpConnectionFactory _connectionFactory, IPreferencesService _prefs, ConfigModelStore _configModelStore, ITime _time, IInstallIdService _installIdService) {
        i.e(_connectionFactory, "_connectionFactory");
        i.e(_prefs, "_prefs");
        i.e(_configModelStore, "_configModelStore");
        i.e(_time, "_time");
        i.e(_installIdService, "_installIdService");
        this._connectionFactory = _connectionFactory;
        this._prefs = _prefs;
        this._configModelStore = _configModelStore;
        this._time = _time;
        this._installIdService = _installIdService;
    }

    private final int getThreadTimeout(int i2) {
        return i2 + 5000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logHTTPSent(String str, URL url, JSONObject jSONObject, Map<String, ? extends List<String>> map) {
        String K02 = AbstractC0465j.K0(map.entrySet(), null, null, null, null, 63);
        if (str == null) {
            str = "GET";
        }
        Logging.debug$default("HttpClient: Request Sent = " + str + ' ' + url + " - Body: " + (jSONObject != null ? JSONUtils.INSTANCE.toUnescapedEUIDString(jSONObject) : null) + " - Headers: " + K02, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeRequest(String str, String str2, JSONObject jSONObject, int i2, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d) {
        HttpClient$makeRequest$1 httpClient$makeRequest$1;
        Object obj;
        EnumC1260a enumC1260a;
        int i3;
        int i6;
        String str3;
        HttpClient httpClient;
        String str4;
        JSONObject jSONObject2;
        OptionalHeaders optionalHeaders2;
        JSONObject jSONObject3;
        OptionalHeaders optionalHeaders3;
        HttpClient httpClient2;
        r0 r0Var;
        String str5;
        String str6 = str2;
        try {
            try {
                if (interfaceC1218d instanceof HttpClient$makeRequest$1) {
                    httpClient$makeRequest$1 = (HttpClient$makeRequest$1) interfaceC1218d;
                    int i7 = httpClient$makeRequest$1.label;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        httpClient$makeRequest$1.label = i7 - Integer.MIN_VALUE;
                        obj = httpClient$makeRequest$1.result;
                        enumC1260a = EnumC1260a.f11058a;
                        i3 = httpClient$makeRequest$1.label;
                        if (i3 != 0) {
                            g.y(obj);
                            if (str6 != null) {
                                Boolean consentRequired = this._configModelStore.getModel().getConsentRequired();
                                Boolean bool = Boolean.TRUE;
                                if (i.a(consentRequired, bool) && !i.a(this._configModelStore.getModel().getConsentGiven(), bool)) {
                                    Logging.warn$default(str6 + " `" + str + "` was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.privacyConsent", null, 2, null);
                                    return new HttpResponse(0, null, null, null, null, 24, null);
                                }
                            }
                            long currentTimeMillis = this.delayNewRequestsUntil - this._time.getCurrentTimeMillis();
                            if (currentTimeMillis <= 0) {
                                i6 = i2;
                                str3 = str;
                                httpClient = this;
                                str4 = str6;
                                jSONObject2 = jSONObject;
                                optionalHeaders2 = optionalHeaders;
                                long threadTimeout = httpClient.getThreadTimeout(i6);
                                HttpClient$makeRequest$2 httpClient$makeRequest$2 = new HttpClient$makeRequest$2(httpClient, str3, str4, jSONObject2, i6, optionalHeaders2, null);
                                httpClient$makeRequest$1.L$0 = str3;
                                httpClient$makeRequest$1.L$1 = null;
                                httpClient$makeRequest$1.L$2 = null;
                                httpClient$makeRequest$1.L$3 = null;
                                httpClient$makeRequest$1.L$4 = null;
                                httpClient$makeRequest$1.label = 2;
                                obj = AbstractC0024y.x(threadTimeout, httpClient$makeRequest$2, httpClient$makeRequest$1);
                                if (obj == enumC1260a) {
                                    return enumC1260a;
                                }
                                return obj;
                            }
                            httpClient$makeRequest$1.L$0 = this;
                            httpClient$makeRequest$1.L$1 = str;
                            httpClient$makeRequest$1.L$2 = str6;
                            jSONObject3 = jSONObject;
                            httpClient$makeRequest$1.L$3 = jSONObject3;
                            optionalHeaders3 = optionalHeaders;
                            httpClient$makeRequest$1.L$4 = optionalHeaders3;
                            i6 = i2;
                            httpClient$makeRequest$1.I$0 = i6;
                            httpClient$makeRequest$1.label = 1;
                            if (AbstractC0024y.d(currentTimeMillis, httpClient$makeRequest$1) == enumC1260a) {
                                return enumC1260a;
                            }
                            str3 = str;
                            httpClient2 = this;
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                str5 = (String) httpClient$makeRequest$1.L$0;
                                try {
                                    g.y(obj);
                                    return obj;
                                } catch (r0 e3) {
                                    r0Var = e3;
                                    Logging.info("HttpClient: Request timed out: " + str5, r0Var);
                                    return new HttpResponse(0, null, r0Var, null, null, 24, null);
                                }
                            }
                            int i8 = httpClient$makeRequest$1.I$0;
                            OptionalHeaders optionalHeaders4 = (OptionalHeaders) httpClient$makeRequest$1.L$4;
                            JSONObject jSONObject4 = (JSONObject) httpClient$makeRequest$1.L$3;
                            String str7 = (String) httpClient$makeRequest$1.L$2;
                            str3 = (String) httpClient$makeRequest$1.L$1;
                            httpClient2 = (HttpClient) httpClient$makeRequest$1.L$0;
                            g.y(obj);
                            i6 = i8;
                            jSONObject3 = jSONObject4;
                            optionalHeaders3 = optionalHeaders4;
                            str6 = str7;
                        }
                        str4 = str6;
                        jSONObject2 = jSONObject3;
                        optionalHeaders2 = optionalHeaders3;
                        httpClient = httpClient2;
                        long threadTimeout2 = httpClient.getThreadTimeout(i6);
                        HttpClient$makeRequest$2 httpClient$makeRequest$22 = new HttpClient$makeRequest$2(httpClient, str3, str4, jSONObject2, i6, optionalHeaders2, null);
                        httpClient$makeRequest$1.L$0 = str3;
                        httpClient$makeRequest$1.L$1 = null;
                        httpClient$makeRequest$1.L$2 = null;
                        httpClient$makeRequest$1.L$3 = null;
                        httpClient$makeRequest$1.L$4 = null;
                        httpClient$makeRequest$1.label = 2;
                        obj = AbstractC0024y.x(threadTimeout2, httpClient$makeRequest$22, httpClient$makeRequest$1);
                        if (obj == enumC1260a) {
                        }
                        return obj;
                    }
                }
                long threadTimeout22 = httpClient.getThreadTimeout(i6);
                HttpClient$makeRequest$2 httpClient$makeRequest$222 = new HttpClient$makeRequest$2(httpClient, str3, str4, jSONObject2, i6, optionalHeaders2, null);
                httpClient$makeRequest$1.L$0 = str3;
                httpClient$makeRequest$1.L$1 = null;
                httpClient$makeRequest$1.L$2 = null;
                httpClient$makeRequest$1.L$3 = null;
                httpClient$makeRequest$1.L$4 = null;
                httpClient$makeRequest$1.label = 2;
                obj = AbstractC0024y.x(threadTimeout22, httpClient$makeRequest$222, httpClient$makeRequest$1);
                if (obj == enumC1260a) {
                }
                return obj;
            } catch (r0 e6) {
                r0Var = e6;
                str5 = str3;
                Logging.info("HttpClient: Request timed out: " + str5, r0Var);
                return new HttpResponse(0, null, r0Var, null, null, 24, null);
            }
            if (i3 != 0) {
            }
            str4 = str6;
            jSONObject2 = jSONObject3;
            optionalHeaders2 = optionalHeaders3;
            httpClient = httpClient2;
        } catch (Throwable th) {
            return new HttpResponse(0, null, th, null, null, 24, null);
        }
        httpClient$makeRequest$1 = new HttpClient$makeRequest$1(this, interfaceC1218d);
        obj = httpClient$makeRequest$1.result;
        enumC1260a = EnumC1260a.f11058a;
        i3 = httpClient$makeRequest$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeRequestIODispatcher(String str, String str2, JSONObject jSONObject, int i2, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d) {
        HttpClient$makeRequestIODispatcher$1 httpClient$makeRequestIODispatcher$1;
        int i3;
        s sVar;
        if (interfaceC1218d instanceof HttpClient$makeRequestIODispatcher$1) {
            httpClient$makeRequestIODispatcher$1 = (HttpClient$makeRequestIODispatcher$1) interfaceC1218d;
            int i6 = httpClient$makeRequestIODispatcher$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                httpClient$makeRequestIODispatcher$1.label = i6 - Integer.MIN_VALUE;
                Object obj = httpClient$makeRequestIODispatcher$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i3 = httpClient$makeRequestIODispatcher$1.label;
                if (i3 != 0) {
                    g.y(obj);
                    s sVar2 = new s();
                    X launchOnIO = ThreadUtilsKt.launchOnIO(new HttpClient$makeRequestIODispatcher$job$1(this, str, i2, jSONObject, str2, optionalHeaders, sVar2, null));
                    httpClient$makeRequestIODispatcher$1.L$0 = sVar2;
                    httpClient$makeRequestIODispatcher$1.label = 1;
                    if (((g0) launchOnIO).K(httpClient$makeRequestIODispatcher$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    sVar = sVar2;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (s) httpClient$makeRequestIODispatcher$1.L$0;
                    g.y(obj);
                }
                Object obj2 = sVar.f10741a;
                i.b(obj2);
                return obj2;
            }
        }
        httpClient$makeRequestIODispatcher$1 = new HttpClient$makeRequestIODispatcher$1(this, interfaceC1218d);
        Object obj3 = httpClient$makeRequestIODispatcher$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i3 = httpClient$makeRequestIODispatcher$1.label;
        if (i3 != 0) {
        }
        Object obj22 = sVar.f10741a;
        i.b(obj22);
        return obj22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryAfterFromResponse(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        if (headerField != null) {
            Logging.debug$default("HttpClient: Response Retry-After: ".concat(headerField), null, 2, null);
            Integer P5 = r.P(headerField);
            return Integer.valueOf(P5 != null ? P5.intValue() : this._configModelStore.getModel().getHttpRetryAfterParseFailFallback());
        }
        if (httpURLConnection.getResponseCode() == 429) {
            return Integer.valueOf(this._configModelStore.getModel().getHttpRetryAfterParseFailFallback());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryLimitFromResponse(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("OneSignal-Retry-Limit");
        if (headerField == null) {
            return null;
        }
        Logging.debug$default("HttpClient: Response OneSignal-Retry-Limit: ".concat(headerField), null, 2, null);
        return r.P(headerField);
    }

    @Override // com.onesignal.core.internal.http.IHttpClient
    public Object delete(String str, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d) {
        return makeRequest(str, "DELETE", null, this._configModelStore.getModel().getHttpTimeout(), optionalHeaders, interfaceC1218d);
    }

    @Override // com.onesignal.core.internal.http.IHttpClient
    public Object get(String str, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d) {
        return makeRequest(str, null, null, this._configModelStore.getModel().getHttpGetTimeout(), optionalHeaders, interfaceC1218d);
    }

    @Override // com.onesignal.core.internal.http.IHttpClient
    public Object patch(String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d) {
        return makeRequest(str, "PATCH", jSONObject, this._configModelStore.getModel().getHttpTimeout(), optionalHeaders, interfaceC1218d);
    }

    @Override // com.onesignal.core.internal.http.IHttpClient
    public Object post(String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d) {
        return makeRequest(str, "POST", jSONObject, this._configModelStore.getModel().getHttpTimeout(), optionalHeaders, interfaceC1218d);
    }

    @Override // com.onesignal.core.internal.http.IHttpClient
    public Object put(String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d) {
        return makeRequest(str, "PUT", jSONObject, this._configModelStore.getModel().getHttpTimeout(), optionalHeaders, interfaceC1218d);
    }
}
