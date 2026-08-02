package okhttp3.internal.cache;

import app.cash.api.ReadTimeout;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import net.oneformapp.PopEncryptorV2_;
import okhttp3.Cache;
import okhttp3.Cache$RealCacheRequest$1;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.TrailersSource;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.DateFormattingKt;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RealResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.GzipSink;
import okio.Okio;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Source;
import okio.Timeout;
import okio.Utf8;
import org.slf4j.Marker;
import papa.AppUpdateData;
import papa.PapaEvent;
import papa.SafeTrace;
import retrofit2.Invocation;
import retrofit2.OkHttpCall;

/* loaded from: classes3.dex */
public final class CacheInterceptor implements Interceptor {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CacheInterceptor(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0373 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x037e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03e2  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response intercept(Interceptor.Chain chain) {
        Response response;
        int i;
        long j;
        long j2;
        Date date;
        Date date2;
        Date date3;
        String str;
        String str2;
        String str3;
        OkHttpCall.AnonymousClass1 anonymousClass1;
        Headers headers;
        long j3;
        String str4;
        long j4;
        long j5;
        long j6;
        String sb;
        int i2;
        long millis;
        long j7;
        String str5;
        String str6;
        int i3;
        Response response2;
        Request request;
        final PopEncryptorV2_ popEncryptorV2_;
        com.android.volley.Response response3;
        com.android.volley.Response response4;
        DiskLruCache.Snapshot snapshot;
        ReadTimeout readTimeout;
        Interceptor.Chain chain2;
        Annotation[] annotations;
        switch (this.$r8$classId) {
            case 0:
                RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
                RealCall realCall = realInterceptorChain.call;
                Cache cache = realInterceptorChain.cache;
                if (cache != null) {
                    Request request2 = realInterceptorChain.request;
                    request2.getClass();
                    HttpUrl httpUrl = request2.url;
                    httpUrl.getClass();
                    ByteString.Companion companion = ByteString.Companion;
                    try {
                        snapshot = cache.cache.get(ByteString.Companion.encodeUtf8(httpUrl.url).digest$okio("MD5").hex());
                    } catch (IOException unused) {
                    }
                    if (snapshot != null) {
                        try {
                            Cache.Entry entry = new Cache.Entry(snapshot.getSource(0));
                            response = entry.response(snapshot);
                            if (!entry.matches(request2, response)) {
                                _UtilCommonKt.closeQuietly(response.body);
                            }
                        } catch (IOException unused2) {
                            _UtilCommonKt.closeQuietly(snapshot);
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        Request request3 = realInterceptorChain.request;
                        request3.getClass();
                        if (response == null) {
                            j = response.sentRequestAtMillis;
                            j2 = response.receivedResponseAtMillis;
                            Headers headers2 = response.headers;
                            int size = headers2.size();
                            int i4 = 0;
                            date = null;
                            date2 = null;
                            date3 = null;
                            int i5 = -1;
                            str = null;
                            str2 = null;
                            str3 = null;
                            while (i4 < size) {
                                String name = headers2.name(i4);
                                String value = headers2.value(i4);
                                Headers headers3 = headers2;
                                if (name.equalsIgnoreCase("Date")) {
                                    date3 = DateFormattingKt.toHttpDateOrNull(value);
                                    str3 = value;
                                } else if (name.equalsIgnoreCase("Expires")) {
                                    date = DateFormattingKt.toHttpDateOrNull(value);
                                } else if (name.equalsIgnoreCase("Last-Modified")) {
                                    date2 = DateFormattingKt.toHttpDateOrNull(value);
                                    str2 = value;
                                } else if (name.equalsIgnoreCase("ETag")) {
                                    str = value;
                                } else if (name.equalsIgnoreCase("Age")) {
                                    i5 = _UtilCommonKt.toNonNegativeInt(-1, value);
                                }
                                i4++;
                                headers2 = headers3;
                            }
                            i = i5;
                        } else {
                            i = -1;
                            j = 0;
                            j2 = 0;
                            date = null;
                            date2 = null;
                            date3 = null;
                            str = null;
                            str2 = null;
                            str3 = null;
                        }
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        int i6 = 19;
                        if (response != null) {
                            anonymousClass1 = new OkHttpCall.AnonymousClass1(i6, request3, (Object) null);
                        } else {
                            HttpUrl httpUrl2 = request3.url;
                            Headers headers4 = request3.headers;
                            if (httpUrl2.isHttps() && response.handshake == null) {
                                anonymousClass1 = new OkHttpCall.AnonymousClass1(19, request3, (Object) null);
                            } else {
                                long j8 = j;
                                Object obj = null;
                                int i7 = 19;
                                if (PapaEvent.isCacheable(request3, response)) {
                                    CacheControl cacheControl = request3.lazyCacheControl;
                                    if (cacheControl == null) {
                                        int i8 = CacheControl.$r8$clinit;
                                        cacheControl = PapaEvent.parse(request3.headers);
                                        request3.lazyCacheControl = cacheControl;
                                    }
                                    if (!cacheControl.noCache && headers4.get("If-Modified-Since") == null && headers4.get("If-None-Match") == null) {
                                        CacheControl cacheControl2 = response.cacheControl();
                                        if (date3 != null) {
                                            headers = headers4;
                                            j3 = j2;
                                            str4 = "If-None-Match";
                                            j4 = Math.max(0L, j2 - date3.getTime());
                                        } else {
                                            headers = headers4;
                                            j3 = j2;
                                            str4 = "If-None-Match";
                                            j4 = 0;
                                        }
                                        if (i != -1) {
                                            j4 = Math.max(j4, timeUnit.toMillis(i));
                                        }
                                        long max = j4 + Math.max(0L, j3 - j8) + Math.max(0L, currentTimeMillis - j3);
                                        int i9 = response.cacheControl().maxAgeSeconds;
                                        if (i9 != -1) {
                                            j6 = timeUnit.toMillis(i9);
                                        } else if (date != null) {
                                            if (date3 != null) {
                                                j3 = date3.getTime();
                                            }
                                            j6 = date.getTime() - j3;
                                            if (j6 <= 0) {
                                                j6 = 0;
                                            }
                                        } else {
                                            if (date2 != null) {
                                                List list = response.request.url.queryNamesAndValues;
                                                if (list == null) {
                                                    sb = null;
                                                } else {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    HttpUrl.Companion.access$toQueryString(sb2, list);
                                                    sb = sb2.toString();
                                                }
                                                if (sb == null) {
                                                    long time = (date3 != null ? date3.getTime() : j8) - date2.getTime();
                                                    j5 = 0;
                                                    if (time > 0) {
                                                        j6 = time / 10;
                                                        i2 = cacheControl.maxAgeSeconds;
                                                        if (i2 != -1) {
                                                            j6 = Math.min(j6, timeUnit.toMillis(i2));
                                                        }
                                                        int i10 = cacheControl.minFreshSeconds;
                                                        millis = i10 == -1 ? timeUnit.toMillis(i10) : j5;
                                                        if (!cacheControl2.mustRevalidate || (i3 = cacheControl.maxStaleSeconds) == -1) {
                                                            j7 = millis;
                                                        } else {
                                                            j7 = millis;
                                                            j5 = timeUnit.toMillis(i3);
                                                        }
                                                        if (!cacheControl2.noCache) {
                                                            long j9 = max + j7;
                                                            if (j9 < j6 + j5) {
                                                                Response.Builder newBuilder = response.newBuilder();
                                                                if (j9 >= j6) {
                                                                    newBuilder.headers.add("Warning", "110 HttpURLConnection \"Response is stale\"");
                                                                }
                                                                if (max > 86400000 && response.cacheControl().maxAgeSeconds == -1 && date == null) {
                                                                    newBuilder.headers.add("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                                                }
                                                                anonymousClass1 = new OkHttpCall.AnonymousClass1(19, (Object) null, newBuilder.build());
                                                            }
                                                        }
                                                        if (str == null) {
                                                            str5 = str4;
                                                            str6 = str;
                                                        } else if (date2 != null) {
                                                            str5 = "If-Modified-Since";
                                                            str6 = str2;
                                                        } else if (date3 != null) {
                                                            str5 = "If-Modified-Since";
                                                            str6 = str3;
                                                        } else {
                                                            anonymousClass1 = new OkHttpCall.AnonymousClass1(19, request3, (Object) null);
                                                        }
                                                        Headers.Builder newBuilder2 = headers.newBuilder();
                                                        str6.getClass();
                                                        AppUpdateData.commonAddLenient(newBuilder2, str5, str6);
                                                        Request.Builder newBuilder3 = request3.newBuilder();
                                                        newBuilder3.headers = newBuilder2.build().newBuilder();
                                                        anonymousClass1 = new OkHttpCall.AnonymousClass1(19, new Request(newBuilder3), response);
                                                    }
                                                    j6 = j5;
                                                    i2 = cacheControl.maxAgeSeconds;
                                                    if (i2 != -1) {
                                                    }
                                                    int i102 = cacheControl.minFreshSeconds;
                                                    if (i102 == -1) {
                                                    }
                                                    if (cacheControl2.mustRevalidate) {
                                                    }
                                                    j7 = millis;
                                                    if (!cacheControl2.noCache) {
                                                    }
                                                    if (str == null) {
                                                    }
                                                    Headers.Builder newBuilder22 = headers.newBuilder();
                                                    str6.getClass();
                                                    AppUpdateData.commonAddLenient(newBuilder22, str5, str6);
                                                    Request.Builder newBuilder32 = request3.newBuilder();
                                                    newBuilder32.headers = newBuilder22.build().newBuilder();
                                                    anonymousClass1 = new OkHttpCall.AnonymousClass1(19, new Request(newBuilder32), response);
                                                }
                                            }
                                            j5 = 0;
                                            j6 = j5;
                                            i2 = cacheControl.maxAgeSeconds;
                                            if (i2 != -1) {
                                            }
                                            int i1022 = cacheControl.minFreshSeconds;
                                            if (i1022 == -1) {
                                            }
                                            if (cacheControl2.mustRevalidate) {
                                            }
                                            j7 = millis;
                                            if (!cacheControl2.noCache) {
                                            }
                                            if (str == null) {
                                            }
                                            Headers.Builder newBuilder222 = headers.newBuilder();
                                            str6.getClass();
                                            AppUpdateData.commonAddLenient(newBuilder222, str5, str6);
                                            Request.Builder newBuilder322 = request3.newBuilder();
                                            newBuilder322.headers = newBuilder222.build().newBuilder();
                                            anonymousClass1 = new OkHttpCall.AnonymousClass1(19, new Request(newBuilder322), response);
                                        }
                                        j5 = 0;
                                        i2 = cacheControl.maxAgeSeconds;
                                        if (i2 != -1) {
                                        }
                                        int i10222 = cacheControl.minFreshSeconds;
                                        if (i10222 == -1) {
                                        }
                                        if (cacheControl2.mustRevalidate) {
                                        }
                                        j7 = millis;
                                        if (!cacheControl2.noCache) {
                                        }
                                        if (str == null) {
                                        }
                                        Headers.Builder newBuilder2222 = headers.newBuilder();
                                        str6.getClass();
                                        AppUpdateData.commonAddLenient(newBuilder2222, str5, str6);
                                        Request.Builder newBuilder3222 = request3.newBuilder();
                                        newBuilder3222.headers = newBuilder2222.build().newBuilder();
                                        anonymousClass1 = new OkHttpCall.AnonymousClass1(19, new Request(newBuilder3222), response);
                                    } else {
                                        anonymousClass1 = new OkHttpCall.AnonymousClass1(19, request3, (Object) null);
                                    }
                                } else {
                                    anonymousClass1 = new OkHttpCall.AnonymousClass1(i7, request3, obj);
                                }
                            }
                        }
                        if (((Request) anonymousClass1.val$callback) != null) {
                            CacheControl cacheControl3 = request3.lazyCacheControl;
                            if (cacheControl3 == null) {
                                int i11 = CacheControl.$r8$clinit;
                                cacheControl3 = PapaEvent.parse(request3.headers);
                                request3.lazyCacheControl = cacheControl3;
                            }
                            if (cacheControl3.onlyIfCached) {
                                response2 = null;
                                anonymousClass1 = new OkHttpCall.AnonymousClass1(19, response2, response2);
                                request = (Request) anonymousClass1.val$callback;
                                Response response5 = (Response) anonymousClass1.this$0;
                                if (cache != null) {
                                    synchronized (cache) {
                                    }
                                }
                                if (response != null && response5 == null) {
                                    _UtilCommonKt.closeQuietly(response.body);
                                }
                                if (request != null && response5 == null) {
                                    ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.EMPTY;
                                    HttpUrl.Companion companion2 = TrailersSource.EMPTY;
                                    ArrayList arrayList = new ArrayList(20);
                                    Request request4 = realInterceptorChain.request;
                                    request4.getClass();
                                    Response response6 = new Response(request4, Protocol.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new Headers((String[]) arrayList.toArray(new String[0])), responseBody$Companion$asResponseBody$1, null, null, null, null, -1L, System.currentTimeMillis(), null, companion2);
                                    realInterceptorChain.call.eventListener.satisfactionFailure(realCall, response6);
                                    return response6;
                                }
                                if (request == null) {
                                    response5.getClass();
                                    Response.Builder newBuilder4 = response5.newBuilder();
                                    Response stripBody = Utf8.stripBody(response5);
                                    Response.Builder.checkSupportResponse("cacheResponse", stripBody);
                                    newBuilder4.cacheResponse = stripBody;
                                    Response build = newBuilder4.build();
                                    realInterceptorChain.call.eventListener.cacheHit(realCall, build);
                                    return build;
                                }
                                if (response5 != null) {
                                    realInterceptorChain.call.eventListener.cacheConditionalHit(realCall, response5);
                                } else if (cache != null) {
                                    realInterceptorChain.call.eventListener.cacheMiss(realCall);
                                }
                                try {
                                    Response proceed = ((RealInterceptorChain) chain).proceed(request);
                                    if (response5 != null) {
                                        if (proceed.code == 304) {
                                            Response.Builder newBuilder5 = response5.newBuilder();
                                            Headers headers5 = response5.headers;
                                            Headers headers6 = proceed.headers;
                                            ArrayList arrayList2 = new ArrayList(20);
                                            int size2 = headers5.size();
                                            for (int i12 = 0; i12 < size2; i12++) {
                                                String name2 = headers5.name(i12);
                                                String value2 = headers5.value(i12);
                                                if ((!"Warning".equalsIgnoreCase(name2) || !StringsKt__StringsJVMKt.startsWith(value2, "1", false)) && ("Content-Length".equalsIgnoreCase(name2) || "Content-Encoding".equalsIgnoreCase(name2) || "Content-Type".equalsIgnoreCase(name2) || !Cache.Companion.isEndToEnd(name2) || headers6.get(name2) == null)) {
                                                    arrayList2.add(name2);
                                                    arrayList2.add(StringsKt.trim(value2).toString());
                                                }
                                            }
                                            int size3 = headers6.size();
                                            for (int i13 = 0; i13 < size3; i13++) {
                                                String name3 = headers6.name(i13);
                                                if (!"Content-Length".equalsIgnoreCase(name3) && !"Content-Encoding".equalsIgnoreCase(name3) && !"Content-Type".equalsIgnoreCase(name3) && Cache.Companion.isEndToEnd(name3)) {
                                                    String value3 = headers6.value(i13);
                                                    arrayList2.add(name3);
                                                    arrayList2.add(StringsKt.trim(value3).toString());
                                                }
                                            }
                                            newBuilder5.headers = new Headers((String[]) arrayList2.toArray(new String[0])).newBuilder();
                                            newBuilder5.sentRequestAtMillis = proceed.sentRequestAtMillis;
                                            newBuilder5.receivedResponseAtMillis = proceed.receivedResponseAtMillis;
                                            Response stripBody2 = Utf8.stripBody(response5);
                                            Response.Builder.checkSupportResponse("cacheResponse", stripBody2);
                                            newBuilder5.cacheResponse = stripBody2;
                                            Response stripBody3 = Utf8.stripBody(proceed);
                                            Response.Builder.checkSupportResponse("networkResponse", stripBody3);
                                            newBuilder5.networkResponse = stripBody3;
                                            Response build2 = newBuilder5.build();
                                            proceed.body.close();
                                            cache.getClass();
                                            synchronized (cache) {
                                            }
                                            Cache.Entry entry2 = new Cache.Entry(build2);
                                            ResponseBody responseBody = response5.body;
                                            responseBody.getClass();
                                            try {
                                                com.android.volley.Response edit = ((Cache.CacheResponseBody) responseBody).getSnapshot().edit();
                                                if (edit != null) {
                                                    try {
                                                        entry2.writeTo(edit);
                                                        edit.commit();
                                                    } catch (IOException unused3) {
                                                        response4 = edit;
                                                        if (response4 != 0) {
                                                            try {
                                                                response4.abort();
                                                            } catch (IOException unused4) {
                                                            }
                                                        }
                                                        realInterceptorChain.call.eventListener.cacheHit(realCall, build2);
                                                        return build2;
                                                    }
                                                }
                                            } catch (IOException unused5) {
                                                response4 = response2;
                                            }
                                            realInterceptorChain.call.eventListener.cacheHit(realCall, build2);
                                            return build2;
                                        }
                                        _UtilCommonKt.closeQuietly(response5.body);
                                    }
                                    Response.Builder newBuilder6 = proceed.newBuilder();
                                    Response stripBody4 = response5 != null ? Utf8.stripBody(response5) : response2;
                                    Response.Builder.checkSupportResponse("cacheResponse", stripBody4);
                                    newBuilder6.cacheResponse = stripBody4;
                                    Response stripBody5 = Utf8.stripBody(proceed);
                                    Response.Builder.checkSupportResponse("networkResponse", stripBody5);
                                    newBuilder6.networkResponse = stripBody5;
                                    Response build3 = newBuilder6.build();
                                    if (cache == null) {
                                        return build3;
                                    }
                                    if (!HttpHeaders.promisesBody(build3) || !PapaEvent.isCacheable(request, build3)) {
                                        if (!SafeTrace.invalidatesCache(request.method)) {
                                            return build3;
                                        }
                                        try {
                                            cache.remove$okhttp(request);
                                            return build3;
                                        } catch (IOException unused6) {
                                            return build3;
                                        }
                                    }
                                    Response.Builder newBuilder7 = build3.newBuilder();
                                    newBuilder7.request = request;
                                    Response build4 = newBuilder7.build();
                                    Request request5 = build4.request;
                                    String str7 = request5.method;
                                    if (SafeTrace.invalidatesCache(str7)) {
                                        cache.remove$okhttp(request5);
                                    } else {
                                        if (str7.equals("GET") && !Cache.Companion.varyFields(build4.headers).contains(Marker.ANY_MARKER)) {
                                            Cache.Entry entry3 = new Cache.Entry(build4);
                                            try {
                                                DiskLruCache diskLruCache = cache.cache;
                                                HttpUrl httpUrl3 = request5.url;
                                                httpUrl3.getClass();
                                                ByteString.Companion companion3 = ByteString.Companion;
                                                String hex = ByteString.Companion.encodeUtf8(httpUrl3.url).digest$okio("MD5").hex();
                                                Regex regex = DiskLruCache.LEGAL_KEY_PATTERN;
                                                response3 = diskLruCache.edit(-1L, hex);
                                            } catch (IOException unused7) {
                                                response3 = response2;
                                            }
                                            if (response3 != 0) {
                                                try {
                                                    entry3.writeTo(response3);
                                                    popEncryptorV2_ = new PopEncryptorV2_(cache, response3);
                                                } catch (IOException unused8) {
                                                    if (response3 != 0) {
                                                        response3.abort();
                                                    }
                                                    popEncryptorV2_ = response2;
                                                    if (popEncryptorV2_ != 0) {
                                                    }
                                                    if (response5 != null) {
                                                    }
                                                }
                                                if (popEncryptorV2_ != 0) {
                                                    Cache$RealCacheRequest$1 body = popEncryptorV2_.body();
                                                    final BufferedSource source = build3.body.source();
                                                    final RealBufferedSink buffer = Okio.buffer(body);
                                                    Source source2 = new Source() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
                                                        public boolean cacheRequestClosed;

                                                        @Override // java.io.Closeable, java.lang.AutoCloseable
                                                        public final void close() {
                                                            boolean z;
                                                            if (!this.cacheRequestClosed) {
                                                                TimeZone timeZone = _UtilJvmKt.UTC;
                                                                TimeUnit.MILLISECONDS.getClass();
                                                                try {
                                                                    z = _UtilJvmKt.skipAll(this, 100);
                                                                } catch (IOException unused9) {
                                                                    z = false;
                                                                }
                                                                if (!z) {
                                                                    this.cacheRequestClosed = true;
                                                                    popEncryptorV2_.abort();
                                                                }
                                                            }
                                                            BufferedSource.this.close();
                                                        }

                                                        @Override // okio.Source
                                                        public final long read(Buffer buffer2, long j10) {
                                                            buffer2.getClass();
                                                            try {
                                                                long read = BufferedSource.this.read(buffer2, j10);
                                                                RealBufferedSink realBufferedSink = buffer;
                                                                if (read != -1) {
                                                                    buffer2.copyTo(realBufferedSink.bufferField, buffer2.size - read, read);
                                                                    realBufferedSink.emitCompleteSegments();
                                                                    return read;
                                                                }
                                                                if (!this.cacheRequestClosed) {
                                                                    this.cacheRequestClosed = true;
                                                                    realBufferedSink.close();
                                                                }
                                                                return -1L;
                                                            } catch (IOException e) {
                                                                if (this.cacheRequestClosed) {
                                                                    throw e;
                                                                }
                                                                this.cacheRequestClosed = true;
                                                                popEncryptorV2_.abort();
                                                                throw e;
                                                            }
                                                        }

                                                        @Override // okio.Source
                                                        public final Timeout timeout() {
                                                            return BufferedSource.this.timeout();
                                                        }
                                                    };
                                                    String str8 = build3.headers.get("Content-Type");
                                                    String str9 = str8;
                                                    if (str8 == null) {
                                                        str9 = response2;
                                                    }
                                                    long contentLength = build3.body.contentLength();
                                                    Response.Builder newBuilder8 = build3.newBuilder();
                                                    newBuilder8.body = new RealResponseBody(str9, contentLength, new RealBufferedSource(source2));
                                                    build3 = newBuilder8.build();
                                                }
                                                if (response5 != null) {
                                                    return build3;
                                                }
                                                realInterceptorChain.call.eventListener.cacheMiss(realCall);
                                                return build3;
                                            }
                                        }
                                        popEncryptorV2_ = response2;
                                        if (popEncryptorV2_ != 0) {
                                        }
                                        if (response5 != null) {
                                        }
                                    }
                                    popEncryptorV2_ = response2;
                                    if (popEncryptorV2_ != 0) {
                                    }
                                    if (response5 != null) {
                                    }
                                } catch (Throwable th) {
                                    if (response != null) {
                                        _UtilCommonKt.closeQuietly(response.body);
                                    }
                                    throw th;
                                }
                            }
                        }
                        response2 = null;
                        request = (Request) anonymousClass1.val$callback;
                        Response response52 = (Response) anonymousClass1.this$0;
                        if (cache != null) {
                        }
                        if (response != null) {
                            _UtilCommonKt.closeQuietly(response.body);
                        }
                        if (request != null) {
                        }
                        if (request == null) {
                        }
                    }
                }
                response = null;
                long currentTimeMillis2 = System.currentTimeMillis();
                Request request32 = realInterceptorChain.request;
                request32.getClass();
                if (response == null) {
                }
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                int i62 = 19;
                if (response != null) {
                }
                if (((Request) anonymousClass1.val$callback) != null) {
                }
                response2 = null;
                request = (Request) anonymousClass1.val$callback;
                Response response522 = (Response) anonymousClass1.this$0;
                if (cache != null) {
                }
                if (response != null) {
                }
                if (request != null) {
                }
                if (request == null) {
                }
                break;
            case 1:
                RealInterceptorChain realInterceptorChain2 = (RealInterceptorChain) chain;
                Request request6 = realInterceptorChain2.request;
                final RequestBody requestBody = request6.body;
                if (requestBody == null || request6.headers.get("Content-Encoding") != null) {
                    return realInterceptorChain2.proceed(request6);
                }
                Request.Builder newBuilder9 = request6.newBuilder();
                newBuilder9.header("Content-Encoding", "gzip");
                newBuilder9.method(request6.method, new RequestBody() { // from class: com.squareup.cash.api.GzipRequestBodyInterceptor$gzip$1
                    @Override // okhttp3.RequestBody
                    public final long contentLength() {
                        return -1L;
                    }

                    @Override // okhttp3.RequestBody
                    public final MediaType contentType() {
                        return RequestBody.this.contentType();
                    }

                    @Override // okhttp3.RequestBody
                    public final void writeTo(BufferedSink bufferedSink) {
                        RealBufferedSink realBufferedSink = new RealBufferedSink(new GzipSink(bufferedSink));
                        try {
                            RequestBody.this.writeTo(realBufferedSink);
                            realBufferedSink.close();
                        } finally {
                        }
                    }
                });
                return realInterceptorChain2.proceed(new Request(newBuilder9));
            default:
                RealInterceptorChain realInterceptorChain3 = (RealInterceptorChain) chain;
                Request request7 = realInterceptorChain3.request;
                request7.getClass();
                Invocation invocation = (Invocation) request7.tag(Reflection.factory.getOrCreateKotlinClass(Invocation.class));
                if (invocation != null && (annotations = invocation.method.getAnnotations()) != null) {
                    for (Annotation annotation : annotations) {
                        if (annotation instanceof ReadTimeout) {
                            readTimeout = (ReadTimeout) annotation;
                            if (readTimeout == null) {
                                int duration = readTimeout.duration();
                                TimeUnit unit = readTimeout.unit();
                                unit.getClass();
                                if (realInterceptorChain3.exchange == null) {
                                    chain2 = RealInterceptorChain.copy$okhttp$default(realInterceptorChain3, 0, null, null, _UtilJvmKt.checkDuration("readTimeout", duration, unit), 2097135);
                                } else {
                                    a$$ExternalSyntheticBUOutline0.m$1("Timeouts can't be adjusted in a network interceptor");
                                    chain2 = null;
                                }
                            } else {
                                chain2 = chain;
                            }
                            return ((RealInterceptorChain) chain2).proceed(request7);
                        }
                    }
                }
                annotation = null;
                readTimeout = (ReadTimeout) annotation;
                if (readTimeout == null) {
                }
                return ((RealInterceptorChain) chain2).proceed(request7);
        }
    }
}
