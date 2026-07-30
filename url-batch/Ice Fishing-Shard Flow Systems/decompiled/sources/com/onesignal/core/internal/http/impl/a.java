package com.onesignal.core.internal.http.impl;

import X5.j;
import android.net.TrafficStats;
import android.os.Build;
import com.onesignal.common.f;
import com.onesignal.common.i;
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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n6.AbstractC0792z;
import n6.InterfaceC0789w;
import n6.X;
import n6.f0;
import n6.q0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements C2.c {
    public static final C0021a Companion = new C0021a(null);
    private static final String OS_ACCEPT_HEADER = "application/vnd.onesignal.v1+json";
    private static final String OS_API_VERSION = "1";
    private static final int THREAD_ID = 10000;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final com.onesignal.core.internal.http.impl.d _connectionFactory;
    private final A2.d _installIdService;
    private final H2.b _prefs;
    private final I2.a _time;
    private long delayNewRequestsUntil;

    /* renamed from: com.onesignal.core.internal.http.impl.a$a, reason: collision with other inner class name */
    public static final class C0021a {
        public /* synthetic */ C0021a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0021a() {
        }
    }

    public static final class b extends X5.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.makeRequest(null, null, null, 0, null, this);
        }
    }

    public static final class c extends j implements Function2 {
        final /* synthetic */ com.onesignal.core.internal.http.impl.e $headers;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, JSONObject jSONObject, int i2, com.onesignal.core.internal.http.impl.e eVar, V5.b bVar) {
            super(2, bVar);
            this.$url = str;
            this.$method = str2;
            this.$jsonBody = jSONObject;
            this.$timeout = i2;
            this.$headers = eVar;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return a.this.new c(this.$url, this.$method, this.$jsonBody, this.$timeout, this.$headers, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
                return obj;
            }
            V6.b.P(obj);
            a aVar2 = a.this;
            String str = this.$url;
            String str2 = this.$method;
            JSONObject jSONObject = this.$jsonBody;
            int i5 = this.$timeout;
            com.onesignal.core.internal.http.impl.e eVar = this.$headers;
            this.label = 1;
            Object makeRequestIODispatcher = aVar2.makeRequestIODispatcher(str, str2, jSONObject, i5, eVar, this);
            return makeRequestIODispatcher == aVar ? aVar : makeRequestIODispatcher;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((c) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class d extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.makeRequestIODispatcher(null, null, null, 0, null, this);
        }
    }

    public static final class e extends j implements Function1 {
        final /* synthetic */ com.onesignal.core.internal.http.impl.e $headers;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ D $retVal;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, int i2, JSONObject jSONObject, String str2, com.onesignal.core.internal.http.impl.e eVar, D d7, V5.b bVar) {
            super(1, bVar);
            this.$url = str;
            this.$timeout = i2;
            this.$jsonBody = jSONObject;
            this.$method = str2;
            this.$headers = eVar;
            this.$retVal = d7;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return a.this.new e(this.$url, this.$timeout, this.$jsonBody, this.$method, this.$headers, this.$retVal, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        /* JADX WARN: Removed duplicated region for block: B:110:0x0435 A[Catch: all -> 0x0451, TryCatch #0 {all -> 0x0451, blocks: (B:108:0x0431, B:110:0x0435, B:113:0x043a, B:114:0x0464, B:118:0x0453), top: B:107:0x0431 }] */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0476  */
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            int i2;
            HttpURLConnection httpURLConnection;
            HttpURLConnection newHttpURLConnection;
            Object id;
            String str;
            HttpURLConnection httpURLConnection2;
            int i5;
            Throwable th2;
            int i7;
            int i8;
            String headerField;
            String str2;
            W5.a aVar = W5.a.f2787d;
            int i9 = this.label;
            if (i9 == 0) {
                V6.b.P(obj);
                if (Build.VERSION.SDK_INT >= 26) {
                    TrafficStats.setThreadStatsTag(a.THREAD_ID);
                }
                try {
                    newHttpURLConnection = a.this._connectionFactory.newHttpURLConnection(this.$url);
                } catch (Throwable th3) {
                    th = th3;
                    i2 = -1;
                    httpURLConnection = null;
                    if (!(th instanceof ConnectException)) {
                    }
                    com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                    this.$retVal.f6152d = new C2.a(i2, null, th, null, null, 24, null);
                    if (httpURLConnection != null) {
                    }
                    return Unit.f6114a;
                }
                try {
                    newHttpURLConnection.setUseCaches(false);
                    newHttpURLConnection.setConnectTimeout(this.$timeout);
                    newHttpURLConnection.setReadTimeout(this.$timeout);
                    newHttpURLConnection.setRequestProperty(com.onesignal.core.internal.http.impl.b.HTTP_SDK_VERSION_HEADER_KEY, com.onesignal.core.internal.http.impl.b.getHTTP_SDK_VERSION_HEADER_VALUE());
                    if (i.getSdkType() != null && i.getSdkVersion() != null) {
                        newHttpURLConnection.setRequestProperty("SDK-Wrapper", "onesignal/" + i.getSdkType() + '/' + i.getSdkVersion());
                    }
                    newHttpURLConnection.setRequestProperty("Accept", a.OS_ACCEPT_HEADER);
                    String pushSubscriptionId = ((com.onesignal.core.internal.config.b) a.this._configModelStore.getModel()).getPushSubscriptionId();
                    if (pushSubscriptionId != null && pushSubscriptionId.length() > 0) {
                        newHttpURLConnection.setRequestProperty("OneSignal-Subscription-Id", pushSubscriptionId);
                    }
                    A2.d dVar = a.this._installIdService;
                    this.L$0 = newHttpURLConnection;
                    this.L$1 = newHttpURLConnection;
                    this.L$2 = "OneSignal-Install-Id";
                    this.I$0 = -1;
                    this.label = 1;
                    id = dVar.getId(this);
                    if (id == aVar) {
                        return aVar;
                    }
                    str = "OneSignal-Install-Id";
                    httpURLConnection2 = newHttpURLConnection;
                } catch (Throwable th4) {
                    th = th4;
                    i2 = -1;
                    httpURLConnection = newHttpURLConnection;
                    if (!(th instanceof ConnectException)) {
                    }
                    com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                    this.$retVal.f6152d = new C2.a(i2, null, th, null, null, 24, null);
                    if (httpURLConnection != null) {
                    }
                    return Unit.f6114a;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5 = this.I$0;
                str = (String) this.L$2;
                httpURLConnection2 = (HttpURLConnection) this.L$1;
                newHttpURLConnection = (HttpURLConnection) this.L$0;
                try {
                    V6.b.P(obj);
                    id = obj;
                } catch (Throwable th5) {
                    th2 = th5;
                    th = th2;
                    i2 = i5;
                    httpURLConnection = newHttpURLConnection;
                    try {
                        if (!(th instanceof ConnectException) && !(th instanceof UnknownHostException)) {
                            com.onesignal.debug.internal.logging.b.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                            this.$retVal.f6152d = new C2.a(i2, null, th, null, null, 24, null);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return Unit.f6114a;
                        }
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        this.$retVal.f6152d = new C2.a(i2, null, th, null, null, 24, null);
                        if (httpURLConnection != null) {
                        }
                        return Unit.f6114a;
                    } catch (Throwable th6) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th6;
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
            com.onesignal.core.internal.http.impl.e eVar = this.$headers;
            if ((eVar != null ? eVar.getCacheKey() : null) != null) {
                String string$default = H2.a.getString$default(a.this._prefs, com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), null, 4, null);
                if (string$default != null) {
                    newHttpURLConnection.setRequestProperty("If-None-Match", string$default);
                    com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Adding header if-none-match: ".concat(string$default), null, 2, null);
                }
            }
            com.onesignal.core.internal.http.impl.e eVar2 = this.$headers;
            if ((eVar2 != null ? eVar2.getRywToken() : null) != null) {
                newHttpURLConnection.setRequestProperty("OneSignal-RYW-Token", this.$headers.getRywToken().toString());
            }
            com.onesignal.core.internal.http.impl.e eVar3 = this.$headers;
            if ((eVar3 != null ? eVar3.getRetryCount() : null) != null) {
                newHttpURLConnection.setRequestProperty("Onesignal-Retry-Count", this.$headers.getRetryCount().toString());
            }
            com.onesignal.core.internal.http.impl.e eVar4 = this.$headers;
            if ((eVar4 != null ? eVar4.getSessionDuration() : null) != null) {
                newHttpURLConnection.setRequestProperty("OneSignal-Session-Duration", this.$headers.getSessionDuration().toString());
            }
            com.onesignal.core.internal.http.impl.e eVar5 = this.$headers;
            if ((eVar5 != null ? eVar5.getJwt() : null) != null) {
                newHttpURLConnection.setRequestProperty("Authorization", "Bearer " + this.$headers.getJwt());
            }
            a aVar2 = a.this;
            String requestMethod = newHttpURLConnection.getRequestMethod();
            URL url = newHttpURLConnection.getURL();
            Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
            JSONObject jSONObject = this.$jsonBody;
            Map<String, List<String>> requestProperties = newHttpURLConnection.getRequestProperties();
            Intrinsics.checkNotNullExpressionValue(requestProperties, "getRequestProperties(...)");
            aVar2.logHTTPSent(requestMethod, url, jSONObject, requestProperties);
            JSONObject jSONObject2 = this.$jsonBody;
            if (jSONObject2 != null) {
                String unescapedEUIDString = f.INSTANCE.toUnescapedEUIDString(jSONObject2);
                Charset forName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                byte[] bytes = unescapedEUIDString.getBytes(forName);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                newHttpURLConnection.setFixedLengthStreamingMode(bytes.length);
                newHttpURLConnection.getOutputStream().write(bytes);
            }
            int responseCode = newHttpURLConnection.getResponseCode();
            try {
                Integer retryAfterFromResponse = a.this.retryAfterFromResponse(newHttpURLConnection);
                Integer retryLimitFromResponse = a.this.retryLimitFromResponse(newHttpURLConnection);
                long currentTimeMillis = a.this._time.getCurrentTimeMillis() + ((retryAfterFromResponse != null ? retryAfterFromResponse.intValue() : 0) * 1000);
                if (currentTimeMillis > a.this.delayNewRequestsUntil) {
                    a.this.delayNewRequestsUntil = currentTimeMillis;
                }
                String str3 = "GET";
                if (responseCode != 304) {
                    try {
                        switch (responseCode) {
                            case 200:
                            case 201:
                            case 202:
                                Scanner scanner = new Scanner(newHttpURLConnection.getInputStream(), "UTF-8");
                                String next = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                                scanner.close();
                                StringBuilder sb = new StringBuilder("HttpClient: Got Response = ");
                                String str4 = this.$method;
                                if (str4 == null) {
                                    str4 = "GET";
                                }
                                sb.append(str4);
                                sb.append(' ');
                                sb.append(newHttpURLConnection.getURL());
                                sb.append(" - STATUS: ");
                                sb.append(responseCode);
                                sb.append(" - Body: ");
                                sb.append(next);
                                com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
                                com.onesignal.core.internal.http.impl.e eVar6 = this.$headers;
                                if ((eVar6 != null ? eVar6.getCacheKey() : null) != null && (headerField = newHttpURLConnection.getHeaderField("etag")) != null) {
                                    com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Got Response = Response has etag of " + headerField + " so caching the response.", null, 2, null);
                                    a.this._prefs.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), headerField);
                                    a.this._prefs.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_HTTP_CACHE_PREFIX_" + this.$headers.getCacheKey(), next);
                                }
                                i8 = responseCode;
                                this.$retVal.f6152d = new C2.a(i8, next, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                                break;
                            default:
                                StringBuilder sb2 = new StringBuilder("HttpClient: Got Response = ");
                                String str5 = this.$method;
                                if (str5 != null) {
                                    str3 = str5;
                                }
                                sb2.append(str3);
                                sb2.append(' ');
                                sb2.append(newHttpURLConnection.getURL());
                                sb2.append(" - FAILED STATUS: ");
                                sb2.append(responseCode);
                                com.onesignal.debug.internal.logging.b.debug$default(sb2.toString(), null, 2, null);
                                InputStream errorStream = newHttpURLConnection.getErrorStream();
                                if (errorStream == null) {
                                    errorStream = newHttpURLConnection.getInputStream();
                                }
                                if (errorStream != null) {
                                    Scanner scanner2 = new Scanner(errorStream, "UTF-8");
                                    String next2 = scanner2.useDelimiter("\\A").hasNext() ? scanner2.next() : "";
                                    scanner2.close();
                                    com.onesignal.debug.internal.logging.b.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - Body: " + next2, null, 2, null);
                                    str2 = next2;
                                } else {
                                    com.onesignal.debug.internal.logging.b.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - No response body!", null, 2, null);
                                    str2 = null;
                                }
                                i8 = responseCode;
                                this.$retVal.f6152d = new C2.a(i8, str2, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                                break;
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                        i5 = i8;
                        th = th2;
                        i2 = i5;
                        httpURLConnection = newHttpURLConnection;
                        if (!(th instanceof ConnectException)) {
                        }
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        this.$retVal.f6152d = new C2.a(i2, null, th, null, null, 24, null);
                        if (httpURLConnection != null) {
                        }
                        return Unit.f6114a;
                    }
                } else {
                    H2.b bVar = a.this._prefs;
                    StringBuilder sb3 = new StringBuilder("PREFS_OS_HTTP_CACHE_PREFIX_");
                    com.onesignal.core.internal.http.impl.e eVar7 = this.$headers;
                    sb3.append(eVar7 != null ? eVar7.getCacheKey() : null);
                    String string$default2 = H2.a.getString$default(bVar, com.onesignal.common.threading.a.BASE_THREAD_NAME, sb3.toString(), null, 4, null);
                    StringBuilder sb4 = new StringBuilder("HttpClient: Got Response = ");
                    String str6 = this.$method;
                    sb4.append(str6 == null ? "GET" : str6);
                    sb4.append(' ');
                    sb4.append(newHttpURLConnection.getURL());
                    sb4.append(" - Using Cached response due to 304: ");
                    sb4.append(string$default2);
                    com.onesignal.debug.internal.logging.b.debug$default(sb4.toString(), null, 2, null);
                    i7 = responseCode;
                    try {
                        this.$retVal.f6152d = new C2.a(i7, string$default2, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                    } catch (Throwable th8) {
                        th = th8;
                        th = th;
                        httpURLConnection = newHttpURLConnection;
                        i2 = i7;
                        if (!(th instanceof ConnectException)) {
                            com.onesignal.debug.internal.logging.b.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                            this.$retVal.f6152d = new C2.a(i2, null, th, null, null, 24, null);
                            if (httpURLConnection != null) {
                            }
                            return Unit.f6114a;
                        }
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        this.$retVal.f6152d = new C2.a(i2, null, th, null, null, 24, null);
                        if (httpURLConnection != null) {
                        }
                        return Unit.f6114a;
                    }
                }
                newHttpURLConnection.disconnect();
            } catch (Throwable th9) {
                th = th9;
                i7 = responseCode;
            }
            return Unit.f6114a;
        }
    }

    public a(com.onesignal.core.internal.http.impl.d _connectionFactory, H2.b _prefs, com.onesignal.core.internal.config.c _configModelStore, I2.a _time, A2.d _installIdService) {
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

    private final int getThreadTimeout(int i2) {
        return i2 + 5000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logHTTPSent(String str, URL url, JSONObject jSONObject, Map<String, ? extends List<String>> map) {
        String s7 = CollectionsKt.s(map.entrySet(), null, null, null, null, 63);
        if (str == null) {
            str = "GET";
        }
        com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Request Sent = " + str + ' ' + url + " - Body: " + (jSONObject != null ? f.INSTANCE.toUnescapedEUIDString(jSONObject) : null) + " - Headers: " + s7, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeRequest(String str, String str2, JSONObject jSONObject, int i2, com.onesignal.core.internal.http.impl.e eVar, V5.b bVar) {
        b bVar2;
        W5.a aVar;
        int i5;
        JSONObject jSONObject2;
        int i7;
        com.onesignal.core.internal.http.impl.e eVar2;
        String str3;
        a aVar2;
        String str4;
        a aVar3;
        q0 q0Var;
        String str5;
        String str6 = str2;
        try {
            try {
                if (bVar instanceof b) {
                    bVar2 = (b) bVar;
                    int i8 = bVar2.label;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        bVar2.label = i8 - Integer.MIN_VALUE;
                        Object obj = bVar2.result;
                        aVar = W5.a.f2787d;
                        i5 = bVar2.label;
                        if (i5 != 0) {
                            V6.b.P(obj);
                            if (str6 != null) {
                                Boolean consentRequired = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getConsentRequired();
                                Boolean bool = Boolean.TRUE;
                                if (Intrinsics.a(consentRequired, bool) && !Intrinsics.a(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getConsentGiven(), bool)) {
                                    com.onesignal.debug.internal.logging.b.warn$default(str6 + " `" + str + "` was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.privacyConsent", null, 2, null);
                                    return new C2.a(0, null, null, null, null, 24, null);
                                }
                            }
                            long currentTimeMillis = this.delayNewRequestsUntil - this._time.getCurrentTimeMillis();
                            if (currentTimeMillis > 0) {
                                bVar2.L$0 = this;
                                bVar2.L$1 = str;
                                bVar2.L$2 = str6;
                                jSONObject2 = jSONObject;
                                bVar2.L$3 = jSONObject2;
                                eVar2 = eVar;
                                bVar2.L$4 = eVar2;
                                i7 = i2;
                                bVar2.I$0 = i7;
                                bVar2.label = 1;
                                if (AbstractC0792z.d(currentTimeMillis, bVar2) != aVar) {
                                    str4 = str;
                                    aVar3 = this;
                                }
                            }
                            jSONObject2 = jSONObject;
                            i7 = i2;
                            eVar2 = eVar;
                            str3 = str;
                            aVar2 = this;
                            String str7 = str6;
                            JSONObject jSONObject3 = jSONObject2;
                            com.onesignal.core.internal.http.impl.e eVar3 = eVar2;
                            long threadTimeout = aVar2.getThreadTimeout(i7);
                            c cVar = aVar2.new c(str3, str7, jSONObject3, i7, eVar3, null);
                            bVar2.L$0 = str3;
                            bVar2.L$1 = null;
                            bVar2.L$2 = null;
                            bVar2.L$3 = null;
                            bVar2.L$4 = null;
                            bVar2.label = 2;
                            Object u7 = AbstractC0792z.u(threadTimeout, cVar, bVar2);
                            return u7 == aVar ? aVar : u7;
                        }
                        if (i5 != 1) {
                            if (i5 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str5 = (String) bVar2.L$0;
                            try {
                                V6.b.P(obj);
                                return obj;
                            } catch (q0 e7) {
                                q0Var = e7;
                                com.onesignal.debug.internal.logging.b.info("HttpClient: Request timed out: " + str5, q0Var);
                                return new C2.a(0, null, q0Var, null, null, 24, null);
                            }
                        }
                        int i9 = bVar2.I$0;
                        com.onesignal.core.internal.http.impl.e eVar4 = (com.onesignal.core.internal.http.impl.e) bVar2.L$4;
                        JSONObject jSONObject4 = (JSONObject) bVar2.L$3;
                        String str8 = (String) bVar2.L$2;
                        str4 = (String) bVar2.L$1;
                        aVar3 = (a) bVar2.L$0;
                        V6.b.P(obj);
                        i7 = i9;
                        jSONObject2 = jSONObject4;
                        eVar2 = eVar4;
                        str6 = str8;
                        str3 = str4;
                        aVar2 = aVar3;
                        String str72 = str6;
                        JSONObject jSONObject32 = jSONObject2;
                        com.onesignal.core.internal.http.impl.e eVar32 = eVar2;
                        long threadTimeout2 = aVar2.getThreadTimeout(i7);
                        c cVar2 = aVar2.new c(str3, str72, jSONObject32, i7, eVar32, null);
                        bVar2.L$0 = str3;
                        bVar2.L$1 = null;
                        bVar2.L$2 = null;
                        bVar2.L$3 = null;
                        bVar2.L$4 = null;
                        bVar2.label = 2;
                        Object u72 = AbstractC0792z.u(threadTimeout2, cVar2, bVar2);
                        if (u72 == aVar) {
                        }
                    }
                }
                long threadTimeout22 = aVar2.getThreadTimeout(i7);
                c cVar22 = aVar2.new c(str3, str72, jSONObject32, i7, eVar32, null);
                bVar2.L$0 = str3;
                bVar2.L$1 = null;
                bVar2.L$2 = null;
                bVar2.L$3 = null;
                bVar2.L$4 = null;
                bVar2.label = 2;
                Object u722 = AbstractC0792z.u(threadTimeout22, cVar22, bVar2);
                if (u722 == aVar) {
                }
            } catch (q0 e8) {
                q0Var = e8;
                str5 = str3;
                com.onesignal.debug.internal.logging.b.info("HttpClient: Request timed out: " + str5, q0Var);
                return new C2.a(0, null, q0Var, null, null, 24, null);
            }
            if (i5 != 0) {
            }
            str3 = str4;
            aVar2 = aVar3;
            String str722 = str6;
            JSONObject jSONObject322 = jSONObject2;
            com.onesignal.core.internal.http.impl.e eVar322 = eVar2;
        } catch (Throwable th) {
            return new C2.a(0, null, th, null, null, 24, null);
        }
        bVar2 = new b(bVar);
        Object obj2 = bVar2.result;
        aVar = W5.a.f2787d;
        i5 = bVar2.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeRequestIODispatcher(String str, String str2, JSONObject jSONObject, int i2, com.onesignal.core.internal.http.impl.e eVar, V5.b bVar) {
        d dVar;
        int i5;
        D d7;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i7 = dVar.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dVar.label = i7 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                W5.a aVar = W5.a.f2787d;
                i5 = dVar.label;
                if (i5 != 0) {
                    V6.b.P(obj);
                    D d8 = new D();
                    X launchOnIO = com.onesignal.common.threading.b.launchOnIO(new e(str, i2, jSONObject, str2, eVar, d8, null));
                    dVar.L$0 = d8;
                    dVar.label = 1;
                    if (((f0) launchOnIO).I(dVar) == aVar) {
                        return aVar;
                    }
                    d7 = d8;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d7 = (D) dVar.L$0;
                    V6.b.P(obj);
                }
                Object obj2 = d7.f6152d;
                Intrinsics.b(obj2);
                return obj2;
            }
        }
        dVar = new d(bVar);
        Object obj3 = dVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i5 = dVar.label;
        if (i5 != 0) {
        }
        Object obj22 = d7.f6152d;
        Intrinsics.b(obj22);
        return obj22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryAfterFromResponse(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        if (headerField != null) {
            com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Response Retry-After: ".concat(headerField), null, 2, null);
            Integer intOrNull = StringsKt.toIntOrNull(headerField);
            return Integer.valueOf(intOrNull != null ? intOrNull.intValue() : ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpRetryAfterParseFailFallback());
        }
        if (httpURLConnection.getResponseCode() == 429) {
            return Integer.valueOf(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpRetryAfterParseFailFallback());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryLimitFromResponse(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("OneSignal-Retry-Limit");
        if (headerField == null) {
            return null;
        }
        com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Response OneSignal-Retry-Limit: ".concat(headerField), null, 2, null);
        return StringsKt.toIntOrNull(headerField);
    }

    @Override // C2.c
    public Object delete(String str, com.onesignal.core.internal.http.impl.e eVar, V5.b bVar) {
        return makeRequest(str, "DELETE", null, ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpTimeout(), eVar, bVar);
    }

    @Override // C2.c
    public Object get(String str, com.onesignal.core.internal.http.impl.e eVar, V5.b bVar) {
        return makeRequest(str, null, null, ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpGetTimeout(), eVar, bVar);
    }

    @Override // C2.c
    public Object patch(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.e eVar, V5.b bVar) {
        return makeRequest(str, "PATCH", jSONObject, ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpTimeout(), eVar, bVar);
    }

    @Override // C2.c
    public Object post(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.e eVar, V5.b bVar) {
        return makeRequest(str, "POST", jSONObject, ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpTimeout(), eVar, bVar);
    }

    @Override // C2.c
    public Object put(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.e eVar, V5.b bVar) {
        return makeRequest(str, "PUT", jSONObject, ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpTimeout(), eVar, bVar);
    }
}
