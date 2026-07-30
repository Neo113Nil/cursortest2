package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FileLruCache;
import com.facebook.internal.Logger;
import defpackage.tp2;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ImageResponseCache {
    public static final ImageResponseCache INSTANCE = new ImageResponseCache();
    private static final String TAG = "ImageResponseCache";
    private static FileLruCache imageCache;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class BufferedHttpInputStream extends BufferedInputStream {
        private HttpURLConnection connection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BufferedHttpInputStream(InputStream inputStream, HttpURLConnection httpURLConnection) {
            super(inputStream, Utility.DEFAULT_STREAM_BUFFER_SIZE);
            httpURLConnection.getClass();
            this.connection = httpURLConnection;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            Utility.disconnectQuietly(this.connection);
        }

        public final HttpURLConnection getConnection() {
            return this.connection;
        }

        public final void setConnection(HttpURLConnection httpURLConnection) {
            httpURLConnection.getClass();
            this.connection = httpURLConnection;
        }
    }

    private ImageResponseCache() {
    }

    public static final void clearCache() {
        try {
            getCache().clearCache();
        } catch (IOException e) {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
            String str = TAG;
            str.getClass();
            companion.log(loggingBehavior, 5, str, "clearCache failed " + e.getMessage());
        }
    }

    public static final synchronized FileLruCache getCache() {
        FileLruCache fileLruCache;
        synchronized (ImageResponseCache.class) {
            try {
                if (imageCache == null) {
                    String str = TAG;
                    str.getClass();
                    imageCache = new FileLruCache(str, new FileLruCache.Limits());
                }
                fileLruCache = imageCache;
                if (fileLruCache == null) {
                    Intrinsics.f("imageCache");
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileLruCache;
    }

    public static final InputStream getCachedImageStream(Uri uri) {
        if (uri != null && INSTANCE.isCDNURL(uri)) {
            try {
                FileLruCache cache = getCache();
                String uri2 = uri.toString();
                uri2.getClass();
                return FileLruCache.get$default(cache, uri2, null, 2, null);
            } catch (IOException e) {
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str = TAG;
                str.getClass();
                companion.log(loggingBehavior, 5, str, e.toString());
            }
        }
        return null;
    }

    public static final InputStream interceptAndCacheImageStream(HttpURLConnection httpURLConnection) {
        httpURLConnection.getClass();
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        Uri parse = Uri.parse(httpURLConnection.getURL().toString());
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            if (INSTANCE.isCDNURL(parse)) {
                FileLruCache cache = getCache();
                String uri = parse.toString();
                uri.getClass();
                return cache.interceptAndPut(uri, new BufferedHttpInputStream(inputStream, httpURLConnection));
            }
        } catch (IOException unused) {
        }
        return inputStream;
    }

    private final boolean isCDNURL(Uri uri) {
        String host;
        if (uri == null || (host = uri.getHost()) == null) {
            return false;
        }
        return host.equals("fbcdn.net") || tp2.h(host, ".fbcdn.net", false) || (tp2.o(host, "fbcdn", false) && tp2.h(host, ".akamaihd.net", false));
    }

    public final String getTAG() {
        return TAG;
    }
}
