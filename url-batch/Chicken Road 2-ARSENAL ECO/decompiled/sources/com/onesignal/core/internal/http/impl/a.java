package com.onesignal.core.internal.http.impl;

import F5.q;
import H5.AbstractC0165z;
import H5.InterfaceC0163x;
import H5.X;
import H5.g0;
import H5.r0;
import a2.C0224a;
import android.net.TrafficStats;
import android.os.Build;
import com.onesignal.common.f;
import com.onesignal.common.i;
import f2.AbstractC0364a;
import f2.InterfaceC0365b;
import g2.InterfaceC0391a;
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
import k5.v;
import kotlin.jvm.internal.s;
import l5.AbstractC0506j;
import o5.InterfaceC0564d;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import q5.g;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class a implements a2.c {
    public static final C0022a Companion = new C0022a(null);
    private static final String OS_ACCEPT_HEADER = "application/vnd.onesignal.v1+json";
    private static final String OS_API_VERSION = "1";
    private static final int THREAD_ID = 10000;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final com.onesignal.core.internal.http.impl.d _connectionFactory;
    private final Y1.d _installIdService;
    private final InterfaceC0365b _prefs;
    private final InterfaceC0391a _time;
    private long delayNewRequestsUntil;

    /* renamed from: com.onesignal.core.internal.http.impl.a$a, reason: collision with other inner class name */
    public static final class C0022a {
        public /* synthetic */ C0022a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0022a() {
        }
    }

    public static final class b extends AbstractC0607c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.makeRequest(null, null, null, 0, null, this);
        }
    }

    public static final class c extends g implements InterfaceC0747p {
        final /* synthetic */ com.onesignal.core.internal.http.impl.e $headers;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, JSONObject jSONObject, int i7, com.onesignal.core.internal.http.impl.e eVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$url = str;
            this.$method = str2;
            this.$jsonBody = jSONObject;
            this.$timeout = i7;
            this.$headers = eVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return a.this.new c(this.$url, this.$method, this.$jsonBody, this.$timeout, this.$headers, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((c) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
                return obj;
            }
            AbstractC0676f.w(obj);
            a aVar = a.this;
            String str = this.$url;
            String str2 = this.$method;
            JSONObject jSONObject = this.$jsonBody;
            int i8 = this.$timeout;
            com.onesignal.core.internal.http.impl.e eVar = this.$headers;
            this.label = 1;
            Object makeRequestIODispatcher = aVar.makeRequestIODispatcher(str, str2, jSONObject, i8, eVar, this);
            return makeRequestIODispatcher == enumC0580a ? enumC0580a : makeRequestIODispatcher;
        }
    }

    public static final class d extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.makeRequestIODispatcher(null, null, null, 0, null, this);
        }
    }

    public static final class e extends g implements InterfaceC0743l {
        final /* synthetic */ com.onesignal.core.internal.http.impl.e $headers;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, int i7, JSONObject jSONObject, String str2, com.onesignal.core.internal.http.impl.e eVar, s sVar, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$url = str;
            this.$timeout = i7;
            this.$jsonBody = jSONObject;
            this.$method = str2;
            this.$headers = eVar;
            this.$retVal = sVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return a.this.new e(this.$url, this.$timeout, this.$jsonBody, this.$method, this.$headers, this.$retVal, interfaceC0564d);
        }

        /* JADX WARN: Removed duplicated region for block: B:110:0x0435 A[Catch: all -> 0x0451, TryCatch #0 {all -> 0x0451, blocks: (B:108:0x0431, B:110:0x0435, B:113:0x043a, B:114:0x0464, B:118:0x0453), top: B:107:0x0431 }] */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0476  */
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            int i7;
            HttpURLConnection httpURLConnection;
            HttpURLConnection newHttpURLConnection;
            Object id;
            String str;
            HttpURLConnection httpURLConnection2;
            int i8;
            Throwable th2;
            int i9;
            int i10;
            String headerField;
            String str2;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i11 = this.label;
            if (i11 == 0) {
                AbstractC0676f.w(obj);
                if (Build.VERSION.SDK_INT >= 26) {
                    TrafficStats.setThreadStatsTag(a.THREAD_ID);
                }
                try {
                    newHttpURLConnection = a.this._connectionFactory.newHttpURLConnection(this.$url);
                } catch (Throwable th3) {
                    th = th3;
                    i7 = -1;
                    httpURLConnection = null;
                    if (!(th instanceof ConnectException)) {
                    }
                    com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                    this.$retVal.f5233f = new C0224a(i7, null, th, null, null, 24, null);
                    if (httpURLConnection != null) {
                    }
                    return v.f5219a;
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
                    Y1.d dVar = a.this._installIdService;
                    this.L$0 = newHttpURLConnection;
                    this.L$1 = newHttpURLConnection;
                    this.L$2 = "OneSignal-Install-Id";
                    this.I$0 = -1;
                    this.label = 1;
                    id = dVar.getId(this);
                    if (id == enumC0580a) {
                        return enumC0580a;
                    }
                    str = "OneSignal-Install-Id";
                    httpURLConnection2 = newHttpURLConnection;
                } catch (Throwable th4) {
                    th = th4;
                    i7 = -1;
                    httpURLConnection = newHttpURLConnection;
                    if (!(th instanceof ConnectException)) {
                    }
                    com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                    this.$retVal.f5233f = new C0224a(i7, null, th, null, null, 24, null);
                    if (httpURLConnection != null) {
                    }
                    return v.f5219a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i8 = this.I$0;
                str = (String) this.L$2;
                httpURLConnection2 = (HttpURLConnection) this.L$1;
                newHttpURLConnection = (HttpURLConnection) this.L$0;
                try {
                    AbstractC0676f.w(obj);
                    id = obj;
                } catch (Throwable th5) {
                    th2 = th5;
                    th = th2;
                    i7 = i8;
                    httpURLConnection = newHttpURLConnection;
                    try {
                        if (!(th instanceof ConnectException) && !(th instanceof UnknownHostException)) {
                            com.onesignal.debug.internal.logging.b.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                            this.$retVal.f5233f = new C0224a(i7, null, th, null, null, 24, null);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return v.f5219a;
                        }
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        this.$retVal.f5233f = new C0224a(i7, null, th, null, null, 24, null);
                        if (httpURLConnection != null) {
                        }
                        return v.f5219a;
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
                String string$default = AbstractC0364a.getString$default(a.this._prefs, com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), null, 4, null);
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
            a aVar = a.this;
            String requestMethod = newHttpURLConnection.getRequestMethod();
            URL url = newHttpURLConnection.getURL();
            kotlin.jvm.internal.i.d(url, "getURL(...)");
            JSONObject jSONObject = this.$jsonBody;
            Map<String, List<String>> requestProperties = newHttpURLConnection.getRequestProperties();
            kotlin.jvm.internal.i.d(requestProperties, "getRequestProperties(...)");
            aVar.logHTTPSent(requestMethod, url, jSONObject, requestProperties);
            JSONObject jSONObject2 = this.$jsonBody;
            if (jSONObject2 != null) {
                String unescapedEUIDString = f.INSTANCE.toUnescapedEUIDString(jSONObject2);
                Charset forName = Charset.forName("UTF-8");
                kotlin.jvm.internal.i.d(forName, "forName(...)");
                byte[] bytes = unescapedEUIDString.getBytes(forName);
                kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
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
                                i10 = responseCode;
                                this.$retVal.f5233f = new C0224a(i10, next, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
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
                                i10 = responseCode;
                                this.$retVal.f5233f = new C0224a(i10, str2, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                                break;
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                        i8 = i10;
                        th = th2;
                        i7 = i8;
                        httpURLConnection = newHttpURLConnection;
                        if (!(th instanceof ConnectException)) {
                        }
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        this.$retVal.f5233f = new C0224a(i7, null, th, null, null, 24, null);
                        if (httpURLConnection != null) {
                        }
                        return v.f5219a;
                    }
                } else {
                    InterfaceC0365b interfaceC0365b = a.this._prefs;
                    StringBuilder sb3 = new StringBuilder("PREFS_OS_HTTP_CACHE_PREFIX_");
                    com.onesignal.core.internal.http.impl.e eVar7 = this.$headers;
                    sb3.append(eVar7 != null ? eVar7.getCacheKey() : null);
                    String string$default2 = AbstractC0364a.getString$default(interfaceC0365b, com.onesignal.common.threading.a.BASE_THREAD_NAME, sb3.toString(), null, 4, null);
                    StringBuilder sb4 = new StringBuilder("HttpClient: Got Response = ");
                    String str6 = this.$method;
                    sb4.append(str6 == null ? "GET" : str6);
                    sb4.append(' ');
                    sb4.append(newHttpURLConnection.getURL());
                    sb4.append(" - Using Cached response due to 304: ");
                    sb4.append(string$default2);
                    com.onesignal.debug.internal.logging.b.debug$default(sb4.toString(), null, 2, null);
                    i9 = responseCode;
                    try {
                        this.$retVal.f5233f = new C0224a(i9, string$default2, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                    } catch (Throwable th8) {
                        th = th8;
                        th = th;
                        httpURLConnection = newHttpURLConnection;
                        i7 = i9;
                        if (!(th instanceof ConnectException)) {
                            com.onesignal.debug.internal.logging.b.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                            this.$retVal.f5233f = new C0224a(i7, null, th, null, null, 24, null);
                            if (httpURLConnection != null) {
                            }
                            return v.f5219a;
                        }
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        this.$retVal.f5233f = new C0224a(i7, null, th, null, null, 24, null);
                        if (httpURLConnection != null) {
                        }
                        return v.f5219a;
                    }
                }
                newHttpURLConnection.disconnect();
            } catch (Throwable th9) {
                th = th9;
                i9 = responseCode;
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((e) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public a(com.onesignal.core.internal.http.impl.d _connectionFactory, InterfaceC0365b _prefs, com.onesignal.core.internal.config.c _configModelStore, InterfaceC0391a _time, Y1.d _installIdService) {
        kotlin.jvm.internal.i.e(_connectionFactory, "_connectionFactory");
        kotlin.jvm.internal.i.e(_prefs, "_prefs");
        kotlin.jvm.internal.i.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.i.e(_time, "_time");
        kotlin.jvm.internal.i.e(_installIdService, "_installIdService");
        this._connectionFactory = _connectionFactory;
        this._prefs = _prefs;
        this._configModelStore = _configModelStore;
        this._time = _time;
        this._installIdService = _installIdService;
    }

    private final int getThreadTimeout(int i7) {
        return i7 + 5000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logHTTPSent(String str, URL url, JSONObject jSONObject, Map<String, ? extends List<String>> map) {
        String I6 = AbstractC0506j.I(map.entrySet(), null, null, null, null, 63);
        if (str == null) {
            str = "GET";
        }
        com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Request Sent = " + str + ' ' + url + " - Body: " + (jSONObject != null ? f.INSTANCE.toUnescapedEUIDString(jSONObject) : null) + " - Headers: " + I6, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeRequest(String str, String str2, JSONObject jSONObject, int i7, com.onesignal.core.internal.http.impl.e eVar, InterfaceC0564d interfaceC0564d) {
        b bVar;
        EnumC0580a enumC0580a;
        int i8;
        JSONObject jSONObject2;
        int i9;
        com.onesignal.core.internal.http.impl.e eVar2;
        String str3;
        a aVar;
        String str4;
        a aVar2;
        r0 r0Var;
        String str5;
        String str6 = str2;
        try {
            try {
                if (interfaceC0564d instanceof b) {
                    bVar = (b) interfaceC0564d;
                    int i10 = bVar.label;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        bVar.label = i10 - Integer.MIN_VALUE;
                        Object obj = bVar.result;
                        enumC0580a = EnumC0580a.f5697f;
                        i8 = bVar.label;
                        if (i8 != 0) {
                            AbstractC0676f.w(obj);
                            if (str6 != null) {
                                Boolean consentRequired = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getConsentRequired();
                                Boolean bool = Boolean.TRUE;
                                if (kotlin.jvm.internal.i.a(consentRequired, bool) && !kotlin.jvm.internal.i.a(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getConsentGiven(), bool)) {
                                    com.onesignal.debug.internal.logging.b.warn$default(str6 + " `" + str + "` was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.privacyConsent", null, 2, null);
                                    return new C0224a(0, null, null, null, null, 24, null);
                                }
                            }
                            long currentTimeMillis = this.delayNewRequestsUntil - this._time.getCurrentTimeMillis();
                            if (currentTimeMillis > 0) {
                                bVar.L$0 = this;
                                bVar.L$1 = str;
                                bVar.L$2 = str6;
                                jSONObject2 = jSONObject;
                                bVar.L$3 = jSONObject2;
                                eVar2 = eVar;
                                bVar.L$4 = eVar2;
                                i9 = i7;
                                bVar.I$0 = i9;
                                bVar.label = 1;
                                if (AbstractC0165z.d(currentTimeMillis, bVar) != enumC0580a) {
                                    str4 = str;
                                    aVar2 = this;
                                }
                            }
                            jSONObject2 = jSONObject;
                            i9 = i7;
                            eVar2 = eVar;
                            str3 = str;
                            aVar = this;
                            String str7 = str6;
                            JSONObject jSONObject3 = jSONObject2;
                            com.onesignal.core.internal.http.impl.e eVar3 = eVar2;
                            long threadTimeout = aVar.getThreadTimeout(i9);
                            c cVar = aVar.new c(str3, str7, jSONObject3, i9, eVar3, null);
                            bVar.L$0 = str3;
                            bVar.L$1 = null;
                            bVar.L$2 = null;
                            bVar.L$3 = null;
                            bVar.L$4 = null;
                            bVar.label = 2;
                            Object u6 = AbstractC0165z.u(threadTimeout, cVar, bVar);
                            return u6 == enumC0580a ? enumC0580a : u6;
                        }
                        if (i8 != 1) {
                            if (i8 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str5 = (String) bVar.L$0;
                            try {
                                AbstractC0676f.w(obj);
                                return obj;
                            } catch (r0 e4) {
                                r0Var = e4;
                                com.onesignal.debug.internal.logging.b.info("HttpClient: Request timed out: " + str5, r0Var);
                                return new C0224a(0, null, r0Var, null, null, 24, null);
                            }
                        }
                        int i11 = bVar.I$0;
                        com.onesignal.core.internal.http.impl.e eVar4 = (com.onesignal.core.internal.http.impl.e) bVar.L$4;
                        JSONObject jSONObject4 = (JSONObject) bVar.L$3;
                        String str8 = (String) bVar.L$2;
                        str4 = (String) bVar.L$1;
                        aVar2 = (a) bVar.L$0;
                        AbstractC0676f.w(obj);
                        i9 = i11;
                        jSONObject2 = jSONObject4;
                        eVar2 = eVar4;
                        str6 = str8;
                        str3 = str4;
                        aVar = aVar2;
                        String str72 = str6;
                        JSONObject jSONObject32 = jSONObject2;
                        com.onesignal.core.internal.http.impl.e eVar32 = eVar2;
                        long threadTimeout2 = aVar.getThreadTimeout(i9);
                        c cVar2 = aVar.new c(str3, str72, jSONObject32, i9, eVar32, null);
                        bVar.L$0 = str3;
                        bVar.L$1 = null;
                        bVar.L$2 = null;
                        bVar.L$3 = null;
                        bVar.L$4 = null;
                        bVar.label = 2;
                        Object u62 = AbstractC0165z.u(threadTimeout2, cVar2, bVar);
                        if (u62 == enumC0580a) {
                        }
                    }
                }
                long threadTimeout22 = aVar.getThreadTimeout(i9);
                c cVar22 = aVar.new c(str3, str72, jSONObject32, i9, eVar32, null);
                bVar.L$0 = str3;
                bVar.L$1 = null;
                bVar.L$2 = null;
                bVar.L$3 = null;
                bVar.L$4 = null;
                bVar.label = 2;
                Object u622 = AbstractC0165z.u(threadTimeout22, cVar22, bVar);
                if (u622 == enumC0580a) {
                }
            } catch (r0 e7) {
                r0Var = e7;
                str5 = str3;
                com.onesignal.debug.internal.logging.b.info("HttpClient: Request timed out: " + str5, r0Var);
                return new C0224a(0, null, r0Var, null, null, 24, null);
            }
            if (i8 != 0) {
            }
            str3 = str4;
            aVar = aVar2;
            String str722 = str6;
            JSONObject jSONObject322 = jSONObject2;
            com.onesignal.core.internal.http.impl.e eVar322 = eVar2;
        } catch (Throwable th) {
            return new C0224a(0, null, th, null, null, 24, null);
        }
        bVar = new b(interfaceC0564d);
        Object obj2 = bVar.result;
        enumC0580a = EnumC0580a.f5697f;
        i8 = bVar.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeRequestIODispatcher(String str, String str2, JSONObject jSONObject, int i7, com.onesignal.core.internal.http.impl.e eVar, InterfaceC0564d interfaceC0564d) {
        d dVar;
        int i8;
        s sVar;
        if (interfaceC0564d instanceof d) {
            dVar = (d) interfaceC0564d;
            int i9 = dVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                dVar.label = i9 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i8 = dVar.label;
                if (i8 != 0) {
                    AbstractC0676f.w(obj);
                    s sVar2 = new s();
                    X launchOnIO = com.onesignal.common.threading.b.launchOnIO(new e(str, i7, jSONObject, str2, eVar, sVar2, null));
                    dVar.L$0 = sVar2;
                    dVar.label = 1;
                    if (((g0) launchOnIO).I(dVar) == enumC0580a) {
                        return enumC0580a;
                    }
                    sVar = sVar2;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (s) dVar.L$0;
                    AbstractC0676f.w(obj);
                }
                Object obj2 = sVar.f5233f;
                kotlin.jvm.internal.i.b(obj2);
                return obj2;
            }
        }
        dVar = new d(interfaceC0564d);
        Object obj3 = dVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i8 = dVar.label;
        if (i8 != 0) {
        }
        Object obj22 = sVar.f5233f;
        kotlin.jvm.internal.i.b(obj22);
        return obj22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryAfterFromResponse(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        if (headerField != null) {
            com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Response Retry-After: ".concat(headerField), null, 2, null);
            Integer J3 = q.J(headerField);
            return Integer.valueOf(J3 != null ? J3.intValue() : ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpRetryAfterParseFailFallback());
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
        return q.J(headerField);
    }

    @Override // a2.c
    public Object delete(String str, com.onesignal.core.internal.http.impl.e eVar, InterfaceC0564d interfaceC0564d) {
        return makeRequest(str, "DELETE", null, ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpTimeout(), eVar, interfaceC0564d);
    }

    @Override // a2.c
    public Object get(String str, com.onesignal.core.internal.http.impl.e eVar, InterfaceC0564d interfaceC0564d) {
        return makeRequest(str, null, null, ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpGetTimeout(), eVar, interfaceC0564d);
    }

    @Override // a2.c
    public Object patch(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.e eVar, InterfaceC0564d interfaceC0564d) {
        return makeRequest(str, "PATCH", jSONObject, ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpTimeout(), eVar, interfaceC0564d);
    }

    @Override // a2.c
    public Object post(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.e eVar, InterfaceC0564d interfaceC0564d) {
        return makeRequest(str, "POST", jSONObject, ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpTimeout(), eVar, interfaceC0564d);
    }

    @Override // a2.c
    public Object put(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.e eVar, InterfaceC0564d interfaceC0564d) {
        return makeRequest(str, "PUT", jSONObject, ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpTimeout(), eVar, interfaceC0564d);
    }
}
