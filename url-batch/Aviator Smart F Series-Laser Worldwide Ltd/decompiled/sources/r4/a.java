package r4;

import androidx.exifinterface.media.ExifInterface;
import com.drake.net.NetConfig;
import com.drake.net.cache.CacheMode;
import com.drake.net.exception.ConvertException;
import com.drake.net.exception.NetException;
import com.drake.net.exception.URLParseException;
import com.drake.net.request.Method;
import f6.l;
import java.io.File;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.jvm.internal.s;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.q;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpUtils;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.cache.DiskLruCache;
import t4.g;
import t4.h;

/* loaded from: classes3.dex */
public abstract class a {
    private com.drake.net.convert.a converter;
    private HttpUrl.Builder httpUrl = new HttpUrl.Builder();
    private Method method;
    private OkHttpClient okHttpClient;
    private Request.Builder okHttpRequest;

    public a() {
        NetConfig netConfig = NetConfig.INSTANCE;
        this.converter = netConfig.getConverter();
        this.method = Method.GET;
        this.okHttpRequest = new Request.Builder();
        this.okHttpClient = netConfig.getOkHttpClient();
    }

    public static /* synthetic */ void addQuery$default(a aVar, String str, String str2, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addQuery");
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        aVar.addQuery(str, str2, z7);
    }

    public static /* synthetic */ void setCacheValidTime$default(a aVar, long j8, TimeUnit timeUnit, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCacheValidTime");
        }
        if ((i8 & 2) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        aVar.setCacheValidTime(j8, timeUnit);
    }

    public static /* synthetic */ void setDownloadFileNameConflict$default(a aVar, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDownloadFileNameConflict");
        }
        if ((i8 & 1) != 0) {
            z7 = true;
        }
        aVar.setDownloadFileNameConflict(z7);
    }

    public static /* synthetic */ void setDownloadFileNameDecode$default(a aVar, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDownloadFileNameDecode");
        }
        if ((i8 & 1) != 0) {
            z7 = true;
        }
        aVar.setDownloadFileNameDecode(z7);
    }

    public static /* synthetic */ void setDownloadMd5Verify$default(a aVar, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDownloadMd5Verify");
        }
        if ((i8 & 1) != 0) {
            z7 = true;
        }
        aVar.setDownloadMd5Verify(z7);
    }

    public static /* synthetic */ void setDownloadTempFile$default(a aVar, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDownloadTempFile");
        }
        if ((i8 & 1) != 0) {
            z7 = true;
        }
        aVar.setDownloadTempFile(z7);
    }

    public static /* synthetic */ void setQuery$default(a aVar, String str, String str2, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setQuery");
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        aVar.setQuery(str, str2, z7);
    }

    public final void addDownloadListener(com.drake.net.interfaces.c progressListener) {
        s.checkNotNullParameter(progressListener, "progressListener");
        d.downloadListeners(getOkHttpRequest()).add(progressListener);
    }

    public final void addHeader(String name, String value) {
        s.checkNotNullParameter(name, "name");
        s.checkNotNullParameter(value, "value");
        getOkHttpRequest().addHeader(name, value);
    }

    public final void addQuery(String name, String str, boolean z7) {
        s.checkNotNullParameter(name, "name");
        if (z7) {
            getHttpUrl().addEncodedQueryParameter(name, str);
        } else {
            getHttpUrl().addQueryParameter(name, str);
        }
    }

    public Request buildRequest() {
        return d.setConverter(getOkHttpRequest().method(getMethod().name(), null).url(getHttpUrl().build()), getConverter()).build();
    }

    public final Call enqueue(Callback block) {
        s.checkNotNullParameter(block, "block");
        NetConfig.INSTANCE.getRequestInterceptor();
        Call newCall = getOkHttpClient().newCall(buildRequest());
        newCall.enqueue(block);
        return newCall;
    }

    public final /* synthetic */ <R> R execute() {
        NetConfig.INSTANCE.getRequestInterceptor();
        Request.Builder okHttpRequest = getOkHttpRequest();
        s.reifiedOperationMarker(6, "R");
        d.setKType(okHttpRequest, null);
        Response execute = getOkHttpClient().newCall(buildRequest()).execute();
        try {
            com.drake.net.convert.a converter = e.converter(execute.request());
            s.reifiedOperationMarker(6, "R");
            R r8 = (R) converter.onConvert(TypesJVMKt.getJavaType((q) null), execute);
            s.reifiedOperationMarker(1, "R");
            return r8;
        } catch (NetException e8) {
            throw e8;
        } catch (CancellationException e9) {
            throw e9;
        } catch (Throwable th) {
            throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
        }
    }

    public com.drake.net.convert.a getConverter() {
        return this.converter;
    }

    public HttpUrl.Builder getHttpUrl() {
        return this.httpUrl;
    }

    public Method getMethod() {
        return this.method;
    }

    public OkHttpClient getOkHttpClient() {
        return this.okHttpClient;
    }

    public Request.Builder getOkHttpRequest() {
        return this.okHttpRequest;
    }

    public final Headers.Builder headers() {
        return d.headers(getOkHttpRequest());
    }

    public abstract void param(String str, Boolean bool);

    public abstract void param(String str, Number number);

    public abstract void param(String str, String str2);

    public abstract void param(String str, String str2, boolean z7);

    public final void removeHeader(String name) {
        s.checkNotNullParameter(name, "name");
        getOkHttpRequest().removeHeader(name);
    }

    public final void setCacheControl(CacheControl cacheControl) {
        s.checkNotNullParameter(cacheControl, "cacheControl");
        getOkHttpRequest().cacheControl(cacheControl);
    }

    public final void setCacheKey(String key) {
        s.checkNotNullParameter(key, "key");
        getOkHttpRequest().tag(t4.a.class, t4.a.m1467boximpl(t4.a.m1468constructorimpl(key)));
    }

    public final void setCacheMode(CacheMode mode) {
        s.checkNotNullParameter(mode, "mode");
        getOkHttpRequest().tag(CacheMode.class, mode);
    }

    public final void setCacheValidTime(long j8, TimeUnit unit) {
        s.checkNotNullParameter(unit, "unit");
        getOkHttpRequest().tag(t4.b.class, t4.b.m1474boximpl(t4.b.m1475constructorimpl(unit.toMillis(j8))));
    }

    public final void setClient(l block) {
        s.checkNotNullParameter(block, "block");
        OkHttpClient.Builder newBuilder = getOkHttpClient().newBuilder();
        block.invoke(newBuilder);
        setOkHttpClient(q4.a.toNetOkhttp(newBuilder).build());
    }

    public void setConverter(com.drake.net.convert.a aVar) {
        s.checkNotNullParameter(aVar, "<set-?>");
        this.converter = aVar;
    }

    public final void setDownloadDir(String name) {
        s.checkNotNullParameter(name, "name");
        getOkHttpRequest().tag(t4.d.class, t4.d.m1489boximpl(t4.d.m1491constructorimpl(name)));
    }

    public final void setDownloadFileName(String name) {
        s.checkNotNullParameter(name, "name");
        getOkHttpRequest().tag(t4.f.class, t4.f.m1505boximpl(t4.f.m1506constructorimpl(name)));
    }

    public final void setDownloadFileNameConflict(boolean z7) {
        getOkHttpRequest().tag(t4.c.class, t4.c.m1481boximpl(t4.c.m1482constructorimpl(z7)));
    }

    public final void setDownloadFileNameDecode(boolean z7) {
        getOkHttpRequest().tag(g.class, g.m1512boximpl(g.m1513constructorimpl(z7)));
    }

    public final void setDownloadMd5Verify(boolean z7) {
        getOkHttpRequest().tag(t4.e.class, t4.e.m1497boximpl(t4.e.m1498constructorimpl(z7)));
    }

    public final void setDownloadTempFile(boolean z7) {
        getOkHttpRequest().tag(h.class, h.m1520boximpl(h.m1521constructorimpl(z7)));
    }

    public final void setExtra(String name, Object obj) {
        s.checkNotNullParameter(name, "name");
        d.setExtra(getOkHttpRequest(), name, obj);
    }

    public final void setGroup(Object obj) {
        d.setGroup(getOkHttpRequest(), obj);
    }

    public final void setHeader(String name, String value) {
        s.checkNotNullParameter(name, "name");
        s.checkNotNullParameter(value, "value");
        getOkHttpRequest().header(name, value);
    }

    public final void setHeaders(Headers headers) {
        s.checkNotNullParameter(headers, "headers");
        getOkHttpRequest().headers(headers);
    }

    public void setHttpUrl(HttpUrl.Builder builder) {
        s.checkNotNullParameter(builder, "<set-?>");
        this.httpUrl = builder;
    }

    public final void setId(Object obj) {
        d.setId(getOkHttpRequest(), obj);
    }

    public final /* synthetic */ <T> void setKType() {
        Request.Builder okHttpRequest = getOkHttpRequest();
        s.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        d.setKType(okHttpRequest, null);
    }

    public void setMethod(Method method) {
        s.checkNotNullParameter(method, "<set-?>");
        this.method = method;
    }

    public void setOkHttpClient(OkHttpClient value) {
        com.drake.net.cache.a aVar;
        s.checkNotNullParameter(value, "value");
        OkHttpClient netOkhttp = q4.b.toNetOkhttp(value);
        this.okHttpClient = netOkhttp;
        Cache cache = netOkhttp.cache();
        if (cache != null) {
            DiskLruCache diskLruCache = OkHttpUtils.diskLruCache(cache);
            s.checkNotNullExpressionValue(diskLruCache, "diskLruCache(it)");
            aVar = new com.drake.net.cache.a(diskLruCache);
        } else {
            aVar = null;
        }
        getOkHttpRequest().tag(com.drake.net.cache.a.class, aVar);
    }

    public void setOkHttpRequest(Request.Builder builder) {
        s.checkNotNullParameter(builder, "<set-?>");
        this.okHttpRequest = builder;
    }

    public final void setPath(String str) {
        HttpUrl parse = str != null ? HttpUrl.Companion.parse(str) : null;
        if (parse != null) {
            setHttpUrl(parse.newBuilder());
            return;
        }
        try {
            setHttpUrl(HttpUrl.Companion.get(NetConfig.INSTANCE.getHost() + str).newBuilder());
        } catch (Throwable th) {
            throw new URLParseException(NetConfig.INSTANCE.getHost() + str, th);
        }
    }

    public final void setQuery(String name, String str, boolean z7) {
        s.checkNotNullParameter(name, "name");
        if (z7) {
            getHttpUrl().setEncodedQueryParameter(name, str);
        } else {
            getHttpUrl().setQueryParameter(name, str);
        }
    }

    public void setUrl(String url) {
        s.checkNotNullParameter(url, "url");
        try {
            setHttpUrl(HttpUrl.Companion.get(url).newBuilder());
        } catch (Exception e8) {
            throw new URLParseException(url, e8);
        }
    }

    public final void tag(Object obj) {
        getOkHttpRequest().tag(obj);
    }

    public final /* synthetic */ <T> void tagOf(T t7) {
        Request.Builder okHttpRequest = getOkHttpRequest();
        s.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        okHttpRequest.tag(Object.class, t7);
    }

    /* renamed from: toResult-d1pmJ48, reason: not valid java name */
    public final /* synthetic */ <R> Object m1465toResultd1pmJ48() {
        NetConfig.INSTANCE.getRequestInterceptor();
        Request.Builder okHttpRequest = getOkHttpRequest();
        s.reifiedOperationMarker(6, "R");
        d.setKType(okHttpRequest, null);
        try {
            Response execute = getOkHttpClient().newCall(buildRequest()).execute();
            try {
                try {
                    com.drake.net.convert.a converter = e.converter(execute.request());
                    s.reifiedOperationMarker(6, "R");
                    Object onConvert = converter.onConvert(TypesJVMKt.getJavaType((q) null), execute);
                    s.reifiedOperationMarker(1, "R");
                    return Result.m348constructorimpl(onConvert);
                } catch (CancellationException e8) {
                    throw e8;
                }
            } catch (NetException e9) {
                throw e9;
            } catch (Throwable th) {
                throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
            }
        } catch (Exception e10) {
            Result.a aVar = Result.Companion;
            return Result.m348constructorimpl(y5.g.createFailure(e10));
        }
    }

    public final <T> void tag(Class<? super T> type, T t7) {
        s.checkNotNullParameter(type, "type");
        getOkHttpRequest().tag(type, t7);
    }

    public final void addQuery(String name, Number number) {
        String obj;
        s.checkNotNullParameter(name, "name");
        if (number == null || (obj = number.toString()) == null) {
            return;
        }
        addQuery$default(this, name, obj, false, 4, null);
    }

    public final void setDownloadDir(File name) {
        s.checkNotNullParameter(name, "name");
        getOkHttpRequest().tag(t4.d.class, t4.d.m1489boximpl(t4.d.m1490constructorimpl(name)));
    }

    public final void setQuery(String name, Number number) {
        String obj;
        s.checkNotNullParameter(name, "name");
        if (number == null || (obj = number.toString()) == null) {
            return;
        }
        setQuery$default(this, name, obj, false, 4, null);
    }

    public void setUrl(HttpUrl url) {
        s.checkNotNullParameter(url, "url");
        setHttpUrl(url.newBuilder());
    }

    public final void addQuery(String name, Boolean bool) {
        String bool2;
        s.checkNotNullParameter(name, "name");
        if (bool == null || (bool2 = bool.toString()) == null) {
            return;
        }
        addQuery$default(this, name, bool2, false, 4, null);
    }

    public final void setQuery(String name, Boolean bool) {
        String bool2;
        s.checkNotNullParameter(name, "name");
        if (bool == null || (bool2 = bool.toString()) == null) {
            return;
        }
        setQuery$default(this, name, bool2, false, 4, null);
    }

    public void setUrl(URL url) {
        s.checkNotNullParameter(url, "url");
        String url2 = url.toString();
        s.checkNotNullExpressionValue(url2, "url.toString()");
        setUrl(url2);
    }

    public final <R> R execute(Type type) {
        s.checkNotNullParameter(type, "type");
        NetConfig.INSTANCE.getRequestInterceptor();
        return (R) s4.a.convert(getOkHttpClient().newCall(buildRequest()).execute(), type);
    }
}
