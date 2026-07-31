package coil.fetch;

import android.net.Uri;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.ImageSource;
import coil.decode.ImageSources;
import coil.disk.DiskCache;
import coil.fetch.Fetcher;
import coil.network.CacheResponse;
import coil.network.CacheStrategy;
import coil.network.HttpException;
import coil.request.Options;
import coil.util.Calls;
import coil.util.Utils;
import java.io.IOException;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;

/* compiled from: HttpUriFetcher.kt */
/* loaded from: classes15.dex */
public final class HttpUriFetcher implements Fetcher {
    private final Lazy callFactory;
    private final Lazy diskCache;
    private final Options options;
    private final boolean respectCacheHeaders;
    private final String url;
    public static final Companion Companion = new Companion(null);
    private static final CacheControl CACHE_CONTROL_FORCE_NETWORK_NO_CACHE = new CacheControl.Builder().noCache().noStore().build();
    private static final CacheControl CACHE_CONTROL_NO_NETWORK_NO_CACHE = new CacheControl.Builder().noCache().onlyIfCached().build();

    public HttpUriFetcher(String str, Options options, Lazy lazy, Lazy lazy2, boolean z) {
        this.url = str;
        this.options = options;
        this.callFactory = lazy;
        this.diskCache = lazy2;
        this.respectCacheHeaders = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012c A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:14:0x0188, B:36:0x011e, B:38:0x012c, B:40:0x013a, B:41:0x0143, B:43:0x014d, B:45:0x0155, B:47:0x016d), top: B:35:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014d A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:14:0x0188, B:36:0x011e, B:38:0x012c, B:40:0x013a, B:41:0x0143, B:43:0x014d, B:45:0x0155, B:47:0x016d), top: B:35:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // coil.fetch.Fetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetch(Continuation continuation) {
        HttpUriFetcher$fetch$1 httpUriFetcher$fetch$1;
        int i;
        DiskCache.Snapshot snapshot;
        Exception e;
        CacheStrategy compute;
        HttpUriFetcher httpUriFetcher;
        DiskCache.Snapshot snapshot2;
        CacheStrategy cacheStrategy;
        Response response;
        Response response2;
        Exception e2;
        HttpUriFetcher httpUriFetcher2;
        try {
            try {
                if (continuation instanceof HttpUriFetcher$fetch$1) {
                    httpUriFetcher$fetch$1 = (HttpUriFetcher$fetch$1) continuation;
                    int i2 = httpUriFetcher$fetch$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        httpUriFetcher$fetch$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = httpUriFetcher$fetch$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = httpUriFetcher$fetch$1.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            DiskCache.Snapshot readFromDiskCache = readFromDiskCache();
                            try {
                                if (readFromDiskCache != null) {
                                    Long size = getFileSystem().metadata(readFromDiskCache.getMetadata()).getSize();
                                    if (size != null && size.longValue() == 0) {
                                        return new SourceResult(toImageSource(readFromDiskCache), getMimeType$coil_base_release(this.url, null), DataSource.DISK);
                                    }
                                    if (!this.respectCacheHeaders) {
                                        ImageSource imageSource = toImageSource(readFromDiskCache);
                                        String str = this.url;
                                        CacheResponse cacheResponse = toCacheResponse(readFromDiskCache);
                                        return new SourceResult(imageSource, getMimeType$coil_base_release(str, cacheResponse != null ? cacheResponse.getContentType() : null), DataSource.DISK);
                                    }
                                    compute = new CacheStrategy.Factory(newRequest(), toCacheResponse(readFromDiskCache)).compute();
                                    if (compute.getNetworkRequest() == null && compute.getCacheResponse() != null) {
                                        return new SourceResult(toImageSource(readFromDiskCache), getMimeType$coil_base_release(this.url, compute.getCacheResponse().getContentType()), DataSource.DISK);
                                    }
                                } else {
                                    compute = new CacheStrategy.Factory(newRequest(), null).compute();
                                }
                                Request networkRequest = compute.getNetworkRequest();
                                Intrinsics.checkNotNull(networkRequest);
                                httpUriFetcher$fetch$1.L$0 = this;
                                httpUriFetcher$fetch$1.L$1 = readFromDiskCache;
                                httpUriFetcher$fetch$1.L$2 = compute;
                                httpUriFetcher$fetch$1.label = 1;
                                Object executeNetworkRequest = executeNetworkRequest(networkRequest, httpUriFetcher$fetch$1);
                                if (executeNetworkRequest == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                httpUriFetcher = this;
                                CacheStrategy cacheStrategy2 = compute;
                                snapshot2 = readFromDiskCache;
                                obj = executeNetworkRequest;
                                cacheStrategy = cacheStrategy2;
                            } catch (Exception e3) {
                                snapshot = readFromDiskCache;
                                e = e3;
                                if (snapshot != null) {
                                }
                                throw e;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                response2 = (Response) httpUriFetcher$fetch$1.L$2;
                                snapshot2 = (DiskCache.Snapshot) httpUriFetcher$fetch$1.L$1;
                                httpUriFetcher2 = (HttpUriFetcher) httpUriFetcher$fetch$1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    Response response3 = (Response) obj;
                                    ResponseBody requireBody = httpUriFetcher2.requireBody(response3);
                                    return new SourceResult(httpUriFetcher2.toImageSource(requireBody), httpUriFetcher2.getMimeType$coil_base_release(httpUriFetcher2.url, requireBody.get$contentType()), httpUriFetcher2.toDataSource(response3));
                                } catch (Exception e4) {
                                    e2 = e4;
                                    Utils.closeQuietly(response2);
                                    throw e2;
                                }
                            }
                            CacheStrategy cacheStrategy3 = (CacheStrategy) httpUriFetcher$fetch$1.L$2;
                            snapshot = (DiskCache.Snapshot) httpUriFetcher$fetch$1.L$1;
                            httpUriFetcher = (HttpUriFetcher) httpUriFetcher$fetch$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                cacheStrategy = cacheStrategy3;
                                snapshot2 = snapshot;
                            } catch (Exception e5) {
                                e = e5;
                                if (snapshot != null) {
                                    Utils.closeQuietly(snapshot);
                                }
                                throw e;
                            }
                        }
                        response = (Response) obj;
                        ResponseBody requireBody2 = httpUriFetcher.requireBody(response);
                        snapshot2 = httpUriFetcher.writeToDiskCache(snapshot2, cacheStrategy.getNetworkRequest(), response, cacheStrategy.getCacheResponse());
                        if (snapshot2 == null) {
                            ImageSource imageSource2 = httpUriFetcher.toImageSource(snapshot2);
                            String str2 = httpUriFetcher.url;
                            CacheResponse cacheResponse2 = httpUriFetcher.toCacheResponse(snapshot2);
                            return new SourceResult(imageSource2, httpUriFetcher.getMimeType$coil_base_release(str2, cacheResponse2 != null ? cacheResponse2.getContentType() : null), DataSource.NETWORK);
                        }
                        if (requireBody2.getContentLength() > 0) {
                            return new SourceResult(httpUriFetcher.toImageSource(requireBody2), httpUriFetcher.getMimeType$coil_base_release(httpUriFetcher.url, requireBody2.get$contentType()), httpUriFetcher.toDataSource(response));
                        }
                        Utils.closeQuietly(response);
                        Request newRequest = httpUriFetcher.newRequest();
                        httpUriFetcher$fetch$1.L$0 = httpUriFetcher;
                        httpUriFetcher$fetch$1.L$1 = snapshot2;
                        httpUriFetcher$fetch$1.L$2 = response;
                        httpUriFetcher$fetch$1.label = 2;
                        Object executeNetworkRequest2 = httpUriFetcher.executeNetworkRequest(newRequest, httpUriFetcher$fetch$1);
                        if (executeNetworkRequest2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        response2 = response;
                        obj = executeNetworkRequest2;
                        httpUriFetcher2 = httpUriFetcher;
                        Response response32 = (Response) obj;
                        ResponseBody requireBody3 = httpUriFetcher2.requireBody(response32);
                        return new SourceResult(httpUriFetcher2.toImageSource(requireBody3), httpUriFetcher2.getMimeType$coil_base_release(httpUriFetcher2.url, requireBody3.get$contentType()), httpUriFetcher2.toDataSource(response32));
                    }
                }
                snapshot2 = httpUriFetcher.writeToDiskCache(snapshot2, cacheStrategy.getNetworkRequest(), response, cacheStrategy.getCacheResponse());
                if (snapshot2 == null) {
                }
            } catch (Exception e6) {
                response2 = response;
                e2 = e6;
                Utils.closeQuietly(response2);
                throw e2;
            }
            response = (Response) obj;
            ResponseBody requireBody22 = httpUriFetcher.requireBody(response);
        } catch (Exception e7) {
            e = e7;
            snapshot = snapshot2;
            if (snapshot != null) {
            }
            throw e;
        }
        httpUriFetcher$fetch$1 = new HttpUriFetcher$fetch$1(this, continuation);
        Object obj2 = httpUriFetcher$fetch$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpUriFetcher$fetch$1.label;
        if (i != 0) {
        }
    }

    private final DiskCache.Snapshot readFromDiskCache() {
        DiskCache diskCache;
        if (!this.options.getDiskCachePolicy().getReadEnabled() || (diskCache = (DiskCache) this.diskCache.getValue()) == null) {
            return null;
        }
        return diskCache.get(getDiskCacheKey());
    }

    private final DiskCache.Snapshot writeToDiskCache(DiskCache.Snapshot snapshot, Request request, Response response, CacheResponse cacheResponse) {
        DiskCache.Editor edit;
        Unit unit;
        Long l;
        Unit unit2;
        Throwable th = null;
        if (!isCacheable(request, response)) {
            if (snapshot != null) {
                Utils.closeQuietly(snapshot);
            }
            return null;
        }
        if (snapshot != null) {
            edit = snapshot.closeAndEdit();
        } else {
            DiskCache diskCache = (DiskCache) this.diskCache.getValue();
            edit = diskCache != null ? diskCache.edit(getDiskCacheKey()) : null;
        }
        try {
            if (edit == null) {
                return null;
            }
            try {
                if (response.code() != 304 || cacheResponse == null) {
                    BufferedSink buffer = Okio.buffer(getFileSystem().sink(edit.getMetadata(), false));
                    try {
                        new CacheResponse(response).writeTo(buffer);
                        unit = Unit.INSTANCE;
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                        unit = null;
                    }
                    if (buffer != null) {
                        try {
                            buffer.close();
                        } catch (Throwable th3) {
                            if (th == null) {
                                th = th3;
                            } else {
                                ExceptionsKt.addSuppressed(th, th3);
                            }
                        }
                    }
                    if (th == null) {
                        Intrinsics.checkNotNull(unit);
                        BufferedSink buffer2 = Okio.buffer(getFileSystem().sink(edit.getData(), false));
                        try {
                            ResponseBody body = response.body();
                            Intrinsics.checkNotNull(body);
                            l = Long.valueOf(body.getBodySource().readAll(buffer2));
                        } catch (Throwable th4) {
                            th = th4;
                            l = null;
                        }
                        if (buffer2 != null) {
                            try {
                                buffer2.close();
                            } catch (Throwable th5) {
                                if (th == null) {
                                    th = th5;
                                } else {
                                    ExceptionsKt.addSuppressed(th, th5);
                                }
                            }
                        }
                        if (th == null) {
                            Intrinsics.checkNotNull(l);
                        } else {
                            throw th;
                        }
                    } else {
                        throw th;
                    }
                } else {
                    Response build = response.newBuilder().headers(CacheStrategy.Companion.combineHeaders(cacheResponse.getResponseHeaders(), response.headers())).build();
                    BufferedSink buffer3 = Okio.buffer(getFileSystem().sink(edit.getMetadata(), false));
                    try {
                        new CacheResponse(build).writeTo(buffer3);
                        unit2 = Unit.INSTANCE;
                    } catch (Throwable th6) {
                        th = th6;
                        unit2 = null;
                    }
                    if (buffer3 != null) {
                        try {
                            buffer3.close();
                        } catch (Throwable th7) {
                            if (th == null) {
                                th = th7;
                            } else {
                                ExceptionsKt.addSuppressed(th, th7);
                            }
                        }
                    }
                    if (th == null) {
                        Intrinsics.checkNotNull(unit2);
                    } else {
                        throw th;
                    }
                }
                DiskCache.Snapshot commitAndGet = edit.commitAndGet();
                Utils.closeQuietly(response);
                return commitAndGet;
            } catch (Exception e) {
                Utils.abortQuietly(edit);
                throw e;
            }
        } catch (Throwable th8) {
            Utils.closeQuietly(response);
            throw th8;
        }
    }

    private final Request newRequest() {
        Request.Builder headers = new Request.Builder().url(this.url).headers(this.options.getHeaders());
        for (Map.Entry entry : this.options.getTags().asMap().entrySet()) {
            Object key = entry.getKey();
            Intrinsics.checkNotNull(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            headers.tag((Class) key, entry.getValue());
        }
        boolean readEnabled = this.options.getDiskCachePolicy().getReadEnabled();
        boolean readEnabled2 = this.options.getNetworkCachePolicy().getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            headers.cacheControl(CacheControl.FORCE_CACHE);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                headers.cacheControl(CACHE_CONTROL_NO_NETWORK_NO_CACHE);
            }
        } else if (this.options.getDiskCachePolicy().getWriteEnabled()) {
            headers.cacheControl(CacheControl.FORCE_NETWORK);
        } else {
            headers.cacheControl(CACHE_CONTROL_FORCE_NETWORK_NO_CACHE);
        }
        return headers.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeNetworkRequest(Request request, Continuation continuation) {
        HttpUriFetcher$executeNetworkRequest$1 httpUriFetcher$executeNetworkRequest$1;
        int i;
        Response execute;
        if (continuation instanceof HttpUriFetcher$executeNetworkRequest$1) {
            httpUriFetcher$executeNetworkRequest$1 = (HttpUriFetcher$executeNetworkRequest$1) continuation;
            int i2 = httpUriFetcher$executeNetworkRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                httpUriFetcher$executeNetworkRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = httpUriFetcher$executeNetworkRequest$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpUriFetcher$executeNetworkRequest$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (Utils.isMainThread()) {
                        if (this.options.getNetworkCachePolicy().getReadEnabled()) {
                            throw new NetworkOnMainThreadException();
                        }
                        execute = ((Call.Factory) this.callFactory.getValue()).newCall(request).execute();
                        if (!execute.isSuccessful() || execute.code() == 304) {
                            return execute;
                        }
                        ResponseBody body = execute.body();
                        if (body != null) {
                            Utils.closeQuietly(body);
                        }
                        throw new HttpException(execute);
                    }
                    Call newCall = ((Call.Factory) this.callFactory.getValue()).newCall(request);
                    httpUriFetcher$executeNetworkRequest$1.label = 1;
                    obj = Calls.await(newCall, httpUriFetcher$executeNetworkRequest$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                execute = (Response) obj;
                if (execute.isSuccessful()) {
                }
                return execute;
            }
        }
        httpUriFetcher$executeNetworkRequest$1 = new HttpUriFetcher$executeNetworkRequest$1(this, continuation);
        Object obj2 = httpUriFetcher$executeNetworkRequest$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpUriFetcher$executeNetworkRequest$1.label;
        if (i != 0) {
        }
        execute = (Response) obj2;
        if (execute.isSuccessful()) {
        }
        return execute;
    }

    public final String getMimeType$coil_base_release(String str, MediaType mediaType) {
        String mimeTypeFromUrl;
        String mediaType2 = mediaType != null ? mediaType.getMediaType() : null;
        if ((mediaType2 == null || StringsKt.startsWith$default(mediaType2, "text/plain", false, 2, (Object) null)) && (mimeTypeFromUrl = Utils.getMimeTypeFromUrl(MimeTypeMap.getSingleton(), str)) != null) {
            return mimeTypeFromUrl;
        }
        if (mediaType2 != null) {
            return StringsKt.substringBefore$default(mediaType2, ';', (String) null, 2, (Object) null);
        }
        return null;
    }

    private final boolean isCacheable(Request request, Response response) {
        return this.options.getDiskCachePolicy().getWriteEnabled() && (!this.respectCacheHeaders || CacheStrategy.Companion.isCacheable(request, response));
    }

    private final CacheResponse toCacheResponse(DiskCache.Snapshot snapshot) {
        CacheResponse cacheResponse;
        try {
            BufferedSource buffer = Okio.buffer(getFileSystem().source(snapshot.getMetadata()));
            try {
                cacheResponse = new CacheResponse(buffer);
                th = null;
            } catch (Throwable th) {
                th = th;
                cacheResponse = null;
            }
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    } else {
                        ExceptionsKt.addSuppressed(th, th2);
                    }
                }
            }
            if (th == null) {
                Intrinsics.checkNotNull(cacheResponse);
                return cacheResponse;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    private final ImageSource toImageSource(DiskCache.Snapshot snapshot) {
        return ImageSources.create(snapshot.getData(), getFileSystem(), getDiskCacheKey(), snapshot);
    }

    private final ImageSource toImageSource(ResponseBody responseBody) {
        return ImageSources.create(responseBody.getBodySource(), this.options.getContext());
    }

    private final DataSource toDataSource(Response response) {
        return response.networkResponse() != null ? DataSource.NETWORK : DataSource.DISK;
    }

    private final ResponseBody requireBody(Response response) {
        ResponseBody body = response.body();
        if (body != null) {
            return body;
        }
        throw new IllegalStateException("response body == null");
    }

    private final String getDiskCacheKey() {
        String diskCacheKey = this.options.getDiskCacheKey();
        return diskCacheKey == null ? this.url : diskCacheKey;
    }

    private final FileSystem getFileSystem() {
        Object value = this.diskCache.getValue();
        Intrinsics.checkNotNull(value);
        return ((DiskCache) value).getFileSystem();
    }

    /* compiled from: HttpUriFetcher.kt */
    public static final class Factory implements Fetcher.Factory {
        private final Lazy callFactory;
        private final Lazy diskCache;
        private final boolean respectCacheHeaders;

        public Factory(Lazy lazy, Lazy lazy2, boolean z) {
            this.callFactory = lazy;
            this.diskCache = lazy2;
            this.respectCacheHeaders = z;
        }

        @Override // coil.fetch.Fetcher.Factory
        public Fetcher create(Uri uri, Options options, ImageLoader imageLoader) {
            if (isApplicable(uri)) {
                return new HttpUriFetcher(uri.toString(), options, this.callFactory, this.diskCache, this.respectCacheHeaders);
            }
            return null;
        }

        private final boolean isApplicable(Uri uri) {
            return Intrinsics.areEqual(uri.getScheme(), "http") || Intrinsics.areEqual(uri.getScheme(), "https");
        }
    }

    /* compiled from: HttpUriFetcher.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
