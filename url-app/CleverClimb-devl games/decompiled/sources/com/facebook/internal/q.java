package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import com.facebook.internal.l;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* compiled from: ImageResponseCache.java */
/* loaded from: classes.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    static final String f6179a = "q";

    /* renamed from: b, reason: collision with root package name */
    private static volatile l f6180b;

    q() {
    }

    static synchronized l a(Context context) throws IOException {
        l lVar;
        synchronized (q.class) {
            if (f6180b == null) {
                f6180b = new l(f6179a, new l.d());
            }
            lVar = f6180b;
        }
        return lVar;
    }

    static InputStream a(Uri uri, Context context) {
        if (uri != null && a(uri)) {
            try {
                return a(context).a(uri.toString());
            } catch (IOException e) {
                t.a(com.facebook.u.CACHE, 5, f6179a, e.toString());
            }
        }
        return null;
    }

    static InputStream a(Context context, HttpURLConnection httpURLConnection) throws IOException {
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        Uri parse = Uri.parse(httpURLConnection.getURL().toString());
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            return a(parse) ? a(context).a(parse.toString(), new a(inputStream, httpURLConnection)) : inputStream;
        } catch (IOException unused) {
            return inputStream;
        }
    }

    private static boolean a(Uri uri) {
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        if (host.endsWith("fbcdn.net")) {
            return true;
        }
        return host.startsWith("fbcdn") && host.endsWith("akamaihd.net");
    }

    /* compiled from: ImageResponseCache.java */
    private static class a extends BufferedInputStream {

        /* renamed from: a, reason: collision with root package name */
        HttpURLConnection f6181a;

        a(InputStream inputStream, HttpURLConnection httpURLConnection) {
            super(inputStream, 8192);
            this.f6181a = httpURLConnection;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            ab.a(this.f6181a);
        }
    }
}
