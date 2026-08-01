package com.onesignal.core.internal.http.impl;

import android.net.TrafficStats;
import android.os.Build;
import com.onesignal.common.f;
import com.onesignal.common.h;
import ge.a0;
import ge.k0;
import ge.r1;
import ge.v1;
import ge.x;
import ge.x0;
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
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nd.i;
import org.json.JSONObject;
import wd.b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements ka.c {
    public static final C0018a Companion = new C0018a(null);
    private static final String OS_ACCEPT_HEADER = "application/vnd.onesignal.v1+json";
    private static final String OS_API_VERSION = "1";
    private static final int THREAD_ID = 10000;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final com.onesignal.core.internal.http.impl.c _connectionFactory;
    private final ja.d _installIdService;
    private final qa.b _prefs;
    private final sa.a _time;
    private long delayNewRequestsUntil;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.makeRequest(null, null, null, 0, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends i implements Function2 {
        final /* synthetic */ com.onesignal.core.internal.http.impl.d $headers;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, JSONObject jSONObject, int i3, com.onesignal.core.internal.http.impl.d dVar, ld.a aVar) {
            super(2, aVar);
            this.$url = str;
            this.$method = str2;
            this.$jsonBody = jSONObject;
            this.$timeout = i3;
            this.$headers = dVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return a.this.new c(this.$url, this.$method, this.$jsonBody, this.$timeout, this.$headers, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((c) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 == 1) {
                    cf.c.M(obj);
                    return obj;
                }
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            a aVar2 = a.this;
            String str = this.$url;
            String str2 = this.$method;
            JSONObject jSONObject = this.$jsonBody;
            int i10 = this.$timeout;
            com.onesignal.core.internal.http.impl.d dVar = this.$headers;
            this.label = 1;
            Object makeRequestIODispatcher = aVar2.makeRequestIODispatcher(str, str2, jSONObject, i10, dVar, this);
            return makeRequestIODispatcher == aVar ? aVar : makeRequestIODispatcher;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.makeRequestIODispatcher(null, null, null, 0, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends i implements Function2 {
        final /* synthetic */ com.onesignal.core.internal.http.impl.d $headers;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ b0 $retVal;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, int i3, JSONObject jSONObject, String str2, com.onesignal.core.internal.http.impl.d dVar, b0 b0Var, ld.a aVar) {
            super(2, aVar);
            this.$url = str;
            this.$timeout = i3;
            this.$jsonBody = jSONObject;
            this.$method = str2;
            this.$headers = dVar;
            this.$retVal = b0Var;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return a.this.new e(this.$url, this.$timeout, this.$jsonBody, this.$method, this.$headers, this.$retVal, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((e) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x041d A[Catch: all -> 0x0439, TryCatch #5 {all -> 0x0439, blocks: (B:103:0x0419, B:105:0x041d, B:108:0x0422, B:109:0x044c, B:113:0x043b), top: B:102:0x0419 }] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0460  */
        @Override // nd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i3;
            Throwable th;
            int i10;
            HttpURLConnection httpURLConnection;
            HttpURLConnection newHttpURLConnection;
            String str;
            Object id2;
            HttpURLConnection httpURLConnection2;
            int i11;
            int intValue;
            int i12;
            String headerField;
            String str2;
            md.a aVar = md.a.f6622d;
            int i13 = this.label;
            if (i13 == 0) {
                cf.c.M(obj);
                if (Build.VERSION.SDK_INT >= 26) {
                    TrafficStats.setThreadStatsTag(a.THREAD_ID);
                }
                i3 = -1;
                try {
                    newHttpURLConnection = a.this._connectionFactory.newHttpURLConnection(this.$url);
                } catch (Throwable th2) {
                    th = th2;
                    i10 = -1;
                    httpURLConnection = null;
                    if (!(th instanceof ConnectException)) {
                    }
                    com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                    this.$retVal.f10141d = new ka.a(i10, null, th, null, null, 24, null);
                    if (httpURLConnection != null) {
                    }
                    return Unit.f5554a;
                }
                try {
                    newHttpURLConnection.setUseCaches(false);
                    newHttpURLConnection.setConnectTimeout(this.$timeout);
                    newHttpURLConnection.setReadTimeout(this.$timeout);
                    newHttpURLConnection.setRequestProperty("SDK-Version", "onesignal/android/" + h.INSTANCE.getSdkVersion());
                    if (com.onesignal.common.i.getSdkType() != null && com.onesignal.common.i.getSdkVersion() != null) {
                        newHttpURLConnection.setRequestProperty("SDK-Wrapper", "onesignal/" + com.onesignal.common.i.getSdkType() + '/' + com.onesignal.common.i.getSdkVersion());
                    }
                    newHttpURLConnection.setRequestProperty("Accept", a.OS_ACCEPT_HEADER);
                    String pushSubscriptionId = ((com.onesignal.core.internal.config.a) a.this._configModelStore.getModel()).getPushSubscriptionId();
                    if (pushSubscriptionId != null && pushSubscriptionId.length() > 0) {
                        newHttpURLConnection.setRequestProperty("OneSignal-Subscription-Id", pushSubscriptionId);
                    }
                    str = "OneSignal-Install-Id";
                    ja.d dVar = a.this._installIdService;
                    this.L$0 = newHttpURLConnection;
                    this.L$1 = newHttpURLConnection;
                    this.L$2 = "OneSignal-Install-Id";
                    this.I$0 = -1;
                    this.label = 1;
                    id2 = dVar.getId(this);
                    if (id2 == aVar) {
                        return aVar;
                    }
                    httpURLConnection2 = newHttpURLConnection;
                } catch (Throwable th3) {
                    th = th3;
                    i10 = i3;
                    httpURLConnection = newHttpURLConnection;
                    if (!(th instanceof ConnectException)) {
                    }
                    com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                    this.$retVal.f10141d = new ka.a(i10, null, th, null, null, 24, null);
                    if (httpURLConnection != null) {
                    }
                    return Unit.f5554a;
                }
            } else {
                if (i13 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i14 = this.I$0;
                str = (String) this.L$2;
                httpURLConnection2 = (HttpURLConnection) this.L$1;
                httpURLConnection = (HttpURLConnection) this.L$0;
                try {
                    cf.c.M(obj);
                    newHttpURLConnection = httpURLConnection;
                    i3 = i14;
                    id2 = obj;
                } catch (Throwable th4) {
                    th = th4;
                    i10 = i14;
                    try {
                        if (!(th instanceof ConnectException)) {
                            com.onesignal.debug.internal.logging.b.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                            this.$retVal.f10141d = new ka.a(i10, null, th, null, null, 24, null);
                            if (httpURLConnection != null) {
                            }
                            return Unit.f5554a;
                        }
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        this.$retVal.f10141d = new ka.a(i10, null, th, null, null, 24, null);
                        if (httpURLConnection != null) {
                        }
                        return Unit.f5554a;
                    } catch (Throwable th5) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th5;
                    }
                }
            }
            httpURLConnection2.setRequestProperty(str, ((UUID) id2).toString());
            if (this.$jsonBody != null) {
                newHttpURLConnection.setDoInput(true);
            }
            if (this.$method != null) {
                newHttpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                newHttpURLConnection.setRequestMethod(this.$method);
                newHttpURLConnection.setDoOutput(true);
            }
            a aVar2 = a.this;
            String requestMethod = newHttpURLConnection.getRequestMethod();
            URL url = newHttpURLConnection.getURL();
            url.getClass();
            JSONObject jSONObject = this.$jsonBody;
            Map<String, List<String>> requestProperties = newHttpURLConnection.getRequestProperties();
            requestProperties.getClass();
            aVar2.logHTTPSent(requestMethod, url, jSONObject, requestProperties);
            JSONObject jSONObject2 = this.$jsonBody;
            if (jSONObject2 != null) {
                String unescapedEUIDString = f.INSTANCE.toUnescapedEUIDString(jSONObject2);
                Charset forName = Charset.forName("UTF-8");
                forName.getClass();
                byte[] bytes = unescapedEUIDString.getBytes(forName);
                bytes.getClass();
                newHttpURLConnection.setFixedLengthStreamingMode(bytes.length);
                newHttpURLConnection.getOutputStream().write(bytes);
            }
            com.onesignal.core.internal.http.impl.d dVar2 = this.$headers;
            if ((dVar2 != null ? dVar2.getCacheKey() : null) != null) {
                String string$default = qa.a.getString$default(a.this._prefs, "OneSignal", "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), null, 4, null);
                if (string$default != null) {
                    newHttpURLConnection.setRequestProperty("If-None-Match", string$default);
                    com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Adding header if-none-match: ".concat(string$default), null, 2, null);
                }
            }
            com.onesignal.core.internal.http.impl.d dVar3 = this.$headers;
            if ((dVar3 != null ? dVar3.getRywToken() : null) != null) {
                newHttpURLConnection.setRequestProperty("OneSignal-RYW-Token", this.$headers.getRywToken().toString());
            }
            com.onesignal.core.internal.http.impl.d dVar4 = this.$headers;
            if ((dVar4 != null ? dVar4.getRetryCount() : null) != null) {
                newHttpURLConnection.setRequestProperty("Onesignal-Retry-Count", this.$headers.getRetryCount().toString());
            }
            com.onesignal.core.internal.http.impl.d dVar5 = this.$headers;
            if ((dVar5 != null ? dVar5.getSessionDuration() : null) != null) {
                newHttpURLConnection.setRequestProperty("OneSignal-Session-Duration", this.$headers.getSessionDuration().toString());
            }
            int responseCode = newHttpURLConnection.getResponseCode();
            try {
                Integer retryAfterFromResponse = a.this.retryAfterFromResponse(newHttpURLConnection);
                Integer retryLimitFromResponse = a.this.retryLimitFromResponse(newHttpURLConnection);
                long currentTimeMillis = a.this._time.getCurrentTimeMillis();
                if (retryAfterFromResponse != null) {
                    try {
                        intValue = retryAfterFromResponse.intValue();
                    } catch (Throwable th6) {
                        th = th6;
                        th = th;
                        i10 = responseCode;
                        httpURLConnection = newHttpURLConnection;
                        if (!(th instanceof ConnectException) && !(th instanceof UnknownHostException)) {
                            com.onesignal.debug.internal.logging.b.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                            this.$retVal.f10141d = new ka.a(i10, null, th, null, null, 24, null);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return Unit.f5554a;
                        }
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        this.$retVal.f10141d = new ka.a(i10, null, th, null, null, 24, null);
                        if (httpURLConnection != null) {
                        }
                        return Unit.f5554a;
                    }
                } else {
                    intValue = 0;
                }
                long j = currentTimeMillis + (intValue * 1000);
                if (j > a.this.delayNewRequestsUntil) {
                    a.this.delayNewRequestsUntil = j;
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
                                StringBuilder sb2 = new StringBuilder("HttpClient: Got Response = ");
                                String str4 = this.$method;
                                if (str4 == null) {
                                    str4 = "GET";
                                }
                                sb2.append(str4);
                                sb2.append(' ');
                                sb2.append(newHttpURLConnection.getURL());
                                sb2.append(" - STATUS: ");
                                sb2.append(responseCode);
                                sb2.append(" - Body: ");
                                sb2.append(next);
                                com.onesignal.debug.internal.logging.b.debug$default(sb2.toString(), null, 2, null);
                                com.onesignal.core.internal.http.impl.d dVar6 = this.$headers;
                                if ((dVar6 != null ? dVar6.getCacheKey() : null) != null && (headerField = newHttpURLConnection.getHeaderField("etag")) != null) {
                                    com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Got Response = Response has etag of " + headerField + " so caching the response.", null, 2, null);
                                    a.this._prefs.saveString("OneSignal", "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), headerField);
                                    a.this._prefs.saveString("OneSignal", "PREFS_OS_HTTP_CACHE_PREFIX_" + this.$headers.getCacheKey(), next);
                                }
                                i12 = responseCode;
                                this.$retVal.f10141d = new ka.a(i12, next, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                                break;
                            default:
                                StringBuilder sb3 = new StringBuilder("HttpClient: Got Response = ");
                                String str5 = this.$method;
                                if (str5 != null) {
                                    str3 = str5;
                                }
                                sb3.append(str3);
                                sb3.append(' ');
                                sb3.append(newHttpURLConnection.getURL());
                                sb3.append(" - FAILED STATUS: ");
                                sb3.append(responseCode);
                                com.onesignal.debug.internal.logging.b.debug$default(sb3.toString(), null, 2, null);
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
                                i12 = responseCode;
                                this.$retVal.f10141d = new ka.a(i12, str2, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                                break;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        responseCode = i12;
                        th = th;
                        i10 = responseCode;
                        httpURLConnection = newHttpURLConnection;
                        if (!(th instanceof ConnectException)) {
                        }
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        this.$retVal.f10141d = new ka.a(i10, null, th, null, null, 24, null);
                        if (httpURLConnection != null) {
                        }
                        return Unit.f5554a;
                    }
                } else {
                    qa.b bVar = a.this._prefs;
                    StringBuilder sb4 = new StringBuilder("PREFS_OS_HTTP_CACHE_PREFIX_");
                    com.onesignal.core.internal.http.impl.d dVar7 = this.$headers;
                    sb4.append(dVar7 != null ? dVar7.getCacheKey() : null);
                    String string$default2 = qa.a.getString$default(bVar, "OneSignal", sb4.toString(), null, 4, null);
                    StringBuilder sb5 = new StringBuilder("HttpClient: Got Response = ");
                    String str6 = this.$method;
                    sb5.append(str6 == null ? "GET" : str6);
                    sb5.append(' ');
                    sb5.append(newHttpURLConnection.getURL());
                    sb5.append(" - Using Cached response due to 304: ");
                    sb5.append(string$default2);
                    com.onesignal.debug.internal.logging.b.debug$default(sb5.toString(), null, 2, null);
                    i11 = responseCode;
                    try {
                        this.$retVal.f10141d = new ka.a(i11, string$default2, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                    } catch (Throwable th8) {
                        th = th8;
                        th = th;
                        httpURLConnection = newHttpURLConnection;
                        i10 = i11;
                        if (!(th instanceof ConnectException)) {
                        }
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        this.$retVal.f10141d = new ka.a(i10, null, th, null, null, 24, null);
                        if (httpURLConnection != null) {
                        }
                        return Unit.f5554a;
                    }
                }
                newHttpURLConnection.disconnect();
            } catch (Throwable th9) {
                th = th9;
                i11 = responseCode;
            }
            return Unit.f5554a;
        }
    }

    public a(com.onesignal.core.internal.http.impl.c cVar, qa.b bVar, com.onesignal.core.internal.config.b bVar2, sa.a aVar, ja.d dVar) {
        cVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        aVar.getClass();
        dVar.getClass();
        this._connectionFactory = cVar;
        this._prefs = bVar;
        this._configModelStore = bVar2;
        this._time = aVar;
        this._installIdService = dVar;
    }

    private final int getThreadTimeout(int i3) {
        return i3 + 5000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logHTTPSent(String str, URL url, JSONObject jSONObject, Map<String, ? extends List<String>> map) {
        String B = CollectionsKt.B(map.entrySet(), null, null, null, null, 63);
        if (str == null) {
            str = "GET";
        }
        String unescapedEUIDString = jSONObject != null ? f.INSTANCE.toUnescapedEUIDString(jSONObject) : null;
        StringBuilder sb2 = new StringBuilder("HttpClient: Request Sent = ");
        sb2.append(str);
        sb2.append(' ');
        sb2.append(url);
        sb2.append(" - Body: ");
        com.onesignal.debug.internal.logging.b.debug$default(v4.a.p(sb2, unescapedEUIDString, " - Headers: ", B), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeRequest(String str, String str2, JSONObject jSONObject, int i3, com.onesignal.core.internal.http.impl.d dVar, ld.a aVar) {
        b bVar;
        md.a aVar2;
        int i10;
        JSONObject jSONObject2;
        int i11;
        com.onesignal.core.internal.http.impl.d dVar2;
        String str3;
        a aVar3;
        String str4;
        a aVar4;
        v1 v1Var;
        String str5;
        String str6 = str2;
        try {
            try {
                if (aVar instanceof b) {
                    bVar = (b) aVar;
                    int i12 = bVar.label;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        bVar.label = i12 - Integer.MIN_VALUE;
                        Object obj = bVar.result;
                        aVar2 = md.a.f6622d;
                        i10 = bVar.label;
                        if (i10 != 0) {
                            cf.c.M(obj);
                            if (str6 != null) {
                                Boolean consentRequired = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getConsentRequired();
                                Boolean bool = Boolean.TRUE;
                                if (Intrinsics.a(consentRequired, bool) && !Intrinsics.a(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getConsentGiven(), bool)) {
                                    com.onesignal.debug.internal.logging.b.warn$default(str6 + " `" + str + "` was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.privacyConsent", null, 2, null);
                                    return new ka.a(0, null, null, null, null, 24, null);
                                }
                            }
                            long currentTimeMillis = this.delayNewRequestsUntil - this._time.getCurrentTimeMillis();
                            if (currentTimeMillis > 0) {
                                bVar.L$0 = this;
                                bVar.L$1 = str;
                                bVar.L$2 = str6;
                                jSONObject2 = jSONObject;
                                bVar.L$3 = jSONObject2;
                                dVar2 = dVar;
                                bVar.L$4 = dVar2;
                                i11 = i3;
                                bVar.I$0 = i11;
                                bVar.label = 1;
                                if (a0.i(currentTimeMillis, bVar) != aVar2) {
                                    str4 = str;
                                    aVar4 = this;
                                }
                            }
                            jSONObject2 = jSONObject;
                            i11 = i3;
                            dVar2 = dVar;
                            str3 = str;
                            aVar3 = this;
                            String str7 = str6;
                            JSONObject jSONObject3 = jSONObject2;
                            com.onesignal.core.internal.http.impl.d dVar3 = dVar2;
                            long threadTimeout = aVar3.getThreadTimeout(i11);
                            c cVar = aVar3.new c(str3, str7, jSONObject3, i11, dVar3, null);
                            bVar.L$0 = str3;
                            bVar.L$1 = null;
                            bVar.L$2 = null;
                            bVar.L$3 = null;
                            bVar.L$4 = null;
                            bVar.label = 2;
                            Object C = a0.C(threadTimeout, cVar, bVar);
                            return C == aVar2 ? aVar2 : C;
                        }
                        if (i10 != 1) {
                            if (i10 != 2) {
                                i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str5 = (String) bVar.L$0;
                            try {
                                cf.c.M(obj);
                                return obj;
                            } catch (v1 e2) {
                                v1Var = e2;
                                com.onesignal.debug.internal.logging.b.error("HttpClient: Request timed out: " + str5, v1Var);
                                return new ka.a(0, null, v1Var, null, null, 24, null);
                            }
                        }
                        int i13 = bVar.I$0;
                        com.onesignal.core.internal.http.impl.d dVar4 = (com.onesignal.core.internal.http.impl.d) bVar.L$4;
                        JSONObject jSONObject4 = (JSONObject) bVar.L$3;
                        String str8 = (String) bVar.L$2;
                        str4 = (String) bVar.L$1;
                        aVar4 = (a) bVar.L$0;
                        cf.c.M(obj);
                        i11 = i13;
                        jSONObject2 = jSONObject4;
                        dVar2 = dVar4;
                        str6 = str8;
                        str3 = str4;
                        aVar3 = aVar4;
                        String str72 = str6;
                        JSONObject jSONObject32 = jSONObject2;
                        com.onesignal.core.internal.http.impl.d dVar32 = dVar2;
                        long threadTimeout2 = aVar3.getThreadTimeout(i11);
                        c cVar2 = aVar3.new c(str3, str72, jSONObject32, i11, dVar32, null);
                        bVar.L$0 = str3;
                        bVar.L$1 = null;
                        bVar.L$2 = null;
                        bVar.L$3 = null;
                        bVar.L$4 = null;
                        bVar.label = 2;
                        Object C2 = a0.C(threadTimeout2, cVar2, bVar);
                        if (C2 == aVar2) {
                        }
                    }
                }
                long threadTimeout22 = aVar3.getThreadTimeout(i11);
                c cVar22 = aVar3.new c(str3, str72, jSONObject32, i11, dVar32, null);
                bVar.L$0 = str3;
                bVar.L$1 = null;
                bVar.L$2 = null;
                bVar.L$3 = null;
                bVar.L$4 = null;
                bVar.label = 2;
                Object C22 = a0.C(threadTimeout22, cVar22, bVar);
                if (C22 == aVar2) {
                }
            } catch (v1 e9) {
                v1Var = e9;
                str5 = str3;
                com.onesignal.debug.internal.logging.b.error("HttpClient: Request timed out: " + str5, v1Var);
                return new ka.a(0, null, v1Var, null, null, 24, null);
            }
            if (i10 != 0) {
            }
            str3 = str4;
            aVar3 = aVar4;
            String str722 = str6;
            JSONObject jSONObject322 = jSONObject2;
            com.onesignal.core.internal.http.impl.d dVar322 = dVar2;
        } catch (Throwable th) {
            return new ka.a(0, null, th, null, null, 24, null);
        }
        bVar = new b(aVar);
        Object obj2 = bVar.result;
        aVar2 = md.a.f6622d;
        i10 = bVar.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeRequestIODispatcher(String str, String str2, JSONObject jSONObject, int i3, com.onesignal.core.internal.http.impl.d dVar, ld.a aVar) {
        d dVar2;
        int i10;
        b0 b0Var;
        if (aVar instanceof d) {
            dVar2 = (d) aVar;
            int i11 = dVar2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i11 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                md.a aVar2 = md.a.f6622d;
                i10 = dVar2.label;
                if (i10 != 0) {
                    cf.c.M(obj);
                    b0 b0Var2 = new b0();
                    ne.e eVar = k0.f4372a;
                    r1 s3 = a0.s(x0.f4413d, ne.d.f7275i, new e(str, i3, jSONObject, str2, dVar, b0Var2, null), 2);
                    dVar2.L$0 = b0Var2;
                    dVar2.label = 1;
                    if (s3.w(dVar2) == aVar2) {
                        return aVar2;
                    }
                    b0Var = b0Var2;
                } else {
                    if (i10 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b0Var = (b0) dVar2.L$0;
                    cf.c.M(obj);
                }
                Object obj2 = b0Var.f10141d;
                obj2.getClass();
                return obj2;
            }
        }
        dVar2 = new d(aVar);
        Object obj3 = dVar2.result;
        md.a aVar22 = md.a.f6622d;
        i10 = dVar2.label;
        if (i10 != 0) {
        }
        Object obj22 = b0Var.f10141d;
        obj22.getClass();
        return obj22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryAfterFromResponse(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        if (headerField != null) {
            com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Response Retry-After: ".concat(headerField), null, 2, null);
            Integer intOrNull = StringsKt.toIntOrNull(headerField);
            return Integer.valueOf(intOrNull != null ? intOrNull.intValue() : ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpRetryAfterParseFailFallback());
        }
        if (httpURLConnection.getResponseCode() == 429) {
            return Integer.valueOf(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpRetryAfterParseFailFallback());
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

    @Override // ka.c
    public Object delete(String str, com.onesignal.core.internal.http.impl.d dVar, ld.a aVar) {
        return makeRequest(str, "DELETE", null, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpTimeout(), dVar, aVar);
    }

    @Override // ka.c
    public Object get(String str, com.onesignal.core.internal.http.impl.d dVar, ld.a aVar) {
        return makeRequest(str, null, null, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpGetTimeout(), dVar, aVar);
    }

    @Override // ka.c
    public Object patch(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.d dVar, ld.a aVar) {
        return makeRequest(str, "PATCH", jSONObject, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpTimeout(), dVar, aVar);
    }

    @Override // ka.c
    public Object post(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.d dVar, ld.a aVar) {
        return makeRequest(str, "POST", jSONObject, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpTimeout(), dVar, aVar);
    }

    @Override // ka.c
    public Object put(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.d dVar, ld.a aVar) {
        return makeRequest(str, "PUT", jSONObject, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpTimeout(), dVar, aVar);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.core.internal.http.impl.a$a, reason: collision with other inner class name */
    public static final class C0018a {
        public /* synthetic */ C0018a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0018a() {
        }
    }
}
