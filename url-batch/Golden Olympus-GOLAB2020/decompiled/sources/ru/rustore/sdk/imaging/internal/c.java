package ru.rustore.sdk.imaging.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import f2.AbstractC2420c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final i f43648a;

    /* renamed from: b, reason: collision with root package name */
    public final e f43649b;

    /* renamed from: c, reason: collision with root package name */
    public final j f43650c;

    public c(i memoryBitmapDataSource, e diskBitmapDataSource, j networkBitmapDataSource) {
        Intrinsics.checkNotNullParameter(memoryBitmapDataSource, "memoryBitmapDataSource");
        Intrinsics.checkNotNullParameter(diskBitmapDataSource, "diskBitmapDataSource");
        Intrinsics.checkNotNullParameter(networkBitmapDataSource, "networkBitmapDataSource");
        this.f43648a = memoryBitmapDataSource;
        this.f43649b = diskBitmapDataSource;
        this.f43650c = networkBitmapDataSource;
    }

    public final Bitmap a(String url, a bitmapKey) {
        Bitmap bitmap;
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(bitmapKey, "bitmapKey");
        this.f43650c.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        HttpsURLConnection httpsURLConnection = null;
        try {
            URLConnection openConnection = new URL(url).openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) openConnection;
            try {
                httpsURLConnection2.setConnectTimeout(10000);
                httpsURLConnection2.setReadTimeout(10000);
                httpsURLConnection2.setDoInput(true);
                httpsURLConnection2.connect();
                if (httpsURLConnection2.getResponseCode() == 200) {
                    InputStream inputStream = httpsURLConnection2.getInputStream();
                    try {
                        bitmap = BitmapFactory.decodeStream(inputStream);
                        AbstractC2420c.a(inputStream, null);
                    } finally {
                    }
                } else {
                    bitmap = null;
                }
                httpsURLConnection2.disconnect();
                if (bitmap == null) {
                    return null;
                }
                this.f43648a.a(bitmapKey.f43646a, bitmap);
                e eVar = this.f43649b;
                String key = bitmapKey.f43646a;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                synchronized (eVar.f43653b) {
                    try {
                        Result.Companion companion = Result.Companion;
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(eVar.f43652a, key));
                        try {
                            boolean compress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            AbstractC2420c.a(fileOutputStream, null);
                            m243constructorimpl = Result.m243constructorimpl(Boolean.valueOf(compress));
                        } finally {
                        }
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable d4 = Result.d(m243constructorimpl);
                    if (d4 != null) {
                        d4.printStackTrace();
                    }
                }
                return bitmap;
            } catch (Throwable th2) {
                th = th2;
                httpsURLConnection = httpsURLConnection2;
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
