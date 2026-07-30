package com.facebook.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.FacebookException;
import com.facebook.internal.ImageDownloader;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.WorkQueue;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ImageDownloader {
    private static final int CACHE_READ_QUEUE_MAX_CONCURRENT = 2;
    private static final int DOWNLOAD_QUEUE_MAX_CONCURRENT = 8;
    private static Handler handler;
    public static final ImageDownloader INSTANCE = new ImageDownloader();
    private static final WorkQueue downloadQueue = new WorkQueue(8, null, 2, null);
    private static final WorkQueue cacheReadQueue = new WorkQueue(2, null, 2, null);
    private static final Map<RequestKey, DownloaderContext> pendingRequests = new HashMap();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class CacheReadWorkItem implements Runnable {
        private final boolean allowCachedRedirects;
        private final RequestKey key;

        public CacheReadWorkItem(RequestKey requestKey, boolean z) {
            requestKey.getClass();
            this.key = requestKey;
            this.allowCachedRedirects = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    ImageDownloader.INSTANCE.readFromCache(this.key, this.allowCachedRedirects);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, this);
            }
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class DownloadImageWorkItem implements Runnable {
        private final RequestKey key;

        public DownloadImageWorkItem(RequestKey requestKey) {
            requestKey.getClass();
            this.key = requestKey;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    ImageDownloader.INSTANCE.download(this.key);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, this);
            }
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class DownloaderContext {
        private boolean isCancelled;
        private ImageRequest request;
        private WorkQueue.WorkItem workItem;

        public DownloaderContext(ImageRequest imageRequest) {
            imageRequest.getClass();
            this.request = imageRequest;
        }

        public final ImageRequest getRequest() {
            return this.request;
        }

        public final WorkQueue.WorkItem getWorkItem() {
            return this.workItem;
        }

        public final boolean isCancelled() {
            return this.isCancelled;
        }

        public final void setCancelled(boolean z) {
            this.isCancelled = z;
        }

        public final void setRequest(ImageRequest imageRequest) {
            imageRequest.getClass();
            this.request = imageRequest;
        }

        public final void setWorkItem(WorkQueue.WorkItem workItem) {
            this.workItem = workItem;
        }
    }

    private ImageDownloader() {
    }

    public static final boolean cancelRequest(ImageRequest imageRequest) {
        boolean z;
        imageRequest.getClass();
        RequestKey requestKey = new RequestKey(imageRequest.getImageUri(), imageRequest.getCallerTag());
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            try {
                DownloaderContext downloaderContext = map.get(requestKey);
                if (downloaderContext != null) {
                    WorkQueue.WorkItem workItem = downloaderContext.getWorkItem();
                    z = true;
                    if (workItem == null || !workItem.cancel()) {
                        downloaderContext.setCancelled(true);
                    } else {
                        map.remove(requestKey);
                    }
                } else {
                    z = false;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public static final void clearCache() {
        ImageResponseCache.clearCache();
        UrlRedirectCache.clearCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void download(RequestKey requestKey) {
        HttpURLConnection httpURLConnection;
        Closeable closeable;
        Exception exc;
        ?? responseCode;
        InputStream interceptAndCacheImageStream;
        Bitmap decodeStream;
        Closeable closeable2 = null;
        InputStream inputStream = null;
        closeable2 = null;
        Bitmap bitmap = null;
        boolean z = true;
        try {
            URLConnection openConnection = new URL(requestKey.getUri().toString()).openConnection();
            openConnection.getClass();
            httpURLConnection = (HttpURLConnection) openConnection;
            try {
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    responseCode = httpURLConnection.getResponseCode();
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
            } catch (IOException e2) {
                e = e2;
                closeable = responseCode;
                Utility.closeQuietly(closeable);
                Utility.disconnectQuietly(httpURLConnection);
                exc = e;
                if (z) {
                }
            } catch (Throwable th2) {
                th = th2;
                closeable2 = responseCode;
                Utility.closeQuietly(closeable2);
                Utility.disconnectQuietly(httpURLConnection);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
            closeable = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
        if (responseCode == 200) {
            interceptAndCacheImageStream = ImageResponseCache.interceptAndCacheImageStream(httpURLConnection);
            decodeStream = BitmapFactory.decodeStream(interceptAndCacheImageStream);
            exc = null;
        } else {
            if (responseCode == 301 || responseCode == 302) {
                try {
                    String headerField = httpURLConnection.getHeaderField(FirebaseAnalytics.Param.LOCATION);
                    if (!Utility.isNullOrEmpty(headerField)) {
                        Uri parse = Uri.parse(headerField);
                        UrlRedirectCache.cacheUriRedirect(requestKey.getUri(), parse);
                        DownloaderContext removePendingRequest = removePendingRequest(requestKey);
                        if (removePendingRequest != null && !removePendingRequest.isCancelled()) {
                            ImageRequest request = removePendingRequest.getRequest();
                            parse.getClass();
                            enqueueCacheRead(request, new RequestKey(parse, requestKey.getTag()), false);
                        }
                    }
                    z = false;
                    decodeStream = null;
                    exc = null;
                    Utility.closeQuietly(inputStream);
                    Utility.disconnectQuietly(httpURLConnection);
                    bitmap = decodeStream;
                } catch (IOException e4) {
                    e = e4;
                    z = false;
                    closeable = null;
                    Utility.closeQuietly(closeable);
                    Utility.disconnectQuietly(httpURLConnection);
                    exc = e;
                    if (z) {
                    }
                }
                if (z) {
                    return;
                }
                issueResponse(requestKey, exc, bitmap, false);
                return;
            }
            interceptAndCacheImageStream = httpURLConnection.getErrorStream();
            StringBuilder sb = new StringBuilder();
            if (interceptAndCacheImageStream != null) {
                InputStreamReader inputStreamReader = new InputStreamReader(interceptAndCacheImageStream);
                char[] cArr = new char[128];
                while (true) {
                    int read = inputStreamReader.read(cArr, 0, 128);
                    if (read <= 0) {
                        break;
                    } else {
                        sb.append(cArr, 0, read);
                    }
                }
                Utility.closeQuietly(inputStreamReader);
            } else {
                sb.append("Unexpected error while downloading an image.");
            }
            exc = new FacebookException(sb.toString());
            decodeStream = null;
        }
        inputStream = interceptAndCacheImageStream;
        Utility.closeQuietly(inputStream);
        Utility.disconnectQuietly(httpURLConnection);
        bitmap = decodeStream;
        if (z) {
        }
    }

    public static final void downloadAsync(ImageRequest imageRequest) {
        if (imageRequest == null) {
            return;
        }
        RequestKey requestKey = new RequestKey(imageRequest.getImageUri(), imageRequest.getCallerTag());
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            try {
                DownloaderContext downloaderContext = map.get(requestKey);
                if (downloaderContext != null) {
                    downloaderContext.setRequest(imageRequest);
                    downloaderContext.setCancelled(false);
                    WorkQueue.WorkItem workItem = downloaderContext.getWorkItem();
                    if (workItem != null) {
                        workItem.moveToFront();
                        Unit unit = Unit.a;
                    }
                } else {
                    INSTANCE.enqueueCacheRead(imageRequest, requestKey, imageRequest.isCachedRedirectAllowed());
                    Unit unit2 = Unit.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void enqueueCacheRead(ImageRequest imageRequest, RequestKey requestKey, boolean z) {
        enqueueRequest(imageRequest, requestKey, cacheReadQueue, new CacheReadWorkItem(requestKey, z));
    }

    private final void enqueueDownload(ImageRequest imageRequest, RequestKey requestKey) {
        enqueueRequest(imageRequest, requestKey, downloadQueue, new DownloadImageWorkItem(requestKey));
    }

    private final void enqueueRequest(ImageRequest imageRequest, RequestKey requestKey, WorkQueue workQueue, Runnable runnable) {
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            DownloaderContext downloaderContext = new DownloaderContext(imageRequest);
            map.put(requestKey, downloaderContext);
            downloaderContext.setWorkItem(WorkQueue.addActiveWorkItem$default(workQueue, runnable, false, 2, null));
            Unit unit = Unit.a;
        }
    }

    private final synchronized Handler getHandler() {
        try {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
        } catch (Throwable th) {
            throw th;
        }
        return handler;
    }

    private final void issueResponse(RequestKey requestKey, final Exception exc, final Bitmap bitmap, final boolean z) {
        Handler handler2;
        DownloaderContext removePendingRequest = removePendingRequest(requestKey);
        if (removePendingRequest == null || removePendingRequest.isCancelled()) {
            return;
        }
        final ImageRequest request = removePendingRequest.getRequest();
        final ImageRequest.Callback callback = request != null ? request.getCallback() : null;
        if (callback == null || (handler2 = getHandler()) == null) {
            return;
        }
        handler2.post(new Runnable() { // from class: m01
            @Override // java.lang.Runnable
            public final void run() {
                ImageDownloader.issueResponse$lambda$4(ImageRequest.this, exc, z, bitmap, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void issueResponse$lambda$4(ImageRequest imageRequest, Exception exc, boolean z, Bitmap bitmap, ImageRequest.Callback callback) {
        imageRequest.getClass();
        callback.onCompleted(new ImageResponse(imageRequest, exc, z, bitmap));
    }

    public static final void prioritizeRequest(ImageRequest imageRequest) {
        WorkQueue.WorkItem workItem;
        imageRequest.getClass();
        RequestKey requestKey = new RequestKey(imageRequest.getImageUri(), imageRequest.getCallerTag());
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            try {
                DownloaderContext downloaderContext = map.get(requestKey);
                if (downloaderContext != null && (workItem = downloaderContext.getWorkItem()) != null) {
                    workItem.moveToFront();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readFromCache(RequestKey requestKey, boolean z) {
        InputStream inputStream;
        Uri redirectedUri;
        boolean z2 = false;
        if (!z || (redirectedUri = UrlRedirectCache.getRedirectedUri(requestKey.getUri())) == null) {
            inputStream = null;
        } else {
            inputStream = ImageResponseCache.getCachedImageStream(redirectedUri);
            if (inputStream != null) {
                z2 = true;
            }
        }
        if (!z2) {
            inputStream = ImageResponseCache.getCachedImageStream(requestKey.getUri());
        }
        if (inputStream != null) {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            Utility.closeQuietly(inputStream);
            issueResponse(requestKey, null, decodeStream, z2);
            return;
        }
        DownloaderContext removePendingRequest = removePendingRequest(requestKey);
        ImageRequest request = removePendingRequest != null ? removePendingRequest.getRequest() : null;
        if (removePendingRequest == null || removePendingRequest.isCancelled() || request == null) {
            return;
        }
        enqueueDownload(request, requestKey);
    }

    private final DownloaderContext removePendingRequest(RequestKey requestKey) {
        DownloaderContext remove;
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            remove = map.remove(requestKey);
        }
        return remove;
    }

    public final Map<RequestKey, DownloaderContext> getPendingRequests() {
        return pendingRequests;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class RequestKey {
        public static final Companion Companion = new Companion(null);
        private static final int HASH_MULTIPLIER = 37;
        private static final int HASH_SEED = 29;
        private Object tag;
        private Uri uri;

        public RequestKey(Uri uri, Object obj) {
            uri.getClass();
            obj.getClass();
            this.uri = uri;
            this.tag = obj;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof RequestKey)) {
                RequestKey requestKey = (RequestKey) obj;
                if (Intrinsics.b(requestKey.uri, this.uri) && Intrinsics.b(requestKey.tag, this.tag)) {
                    return true;
                }
            }
            return false;
        }

        public final Object getTag() {
            return this.tag;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.tag.hashCode() + ((this.uri.hashCode() + 1073) * HASH_MULTIPLIER);
        }

        public final void setTag(Object obj) {
            obj.getClass();
            this.tag = obj;
        }

        public final void setUri(Uri uri) {
            uri.getClass();
            this.uri = uri;
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
