package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes.dex */
public final class oe {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4260a = true;

    /* renamed from: b, reason: collision with root package name */
    public xj f4261b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f4262c = null;

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015a A[Catch: all -> 0x0164, TryCatch #3 {all -> 0x0164, blocks: (B:15:0x0156, B:17:0x015a, B:19:0x0160), top: B:14:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(Context context, URL url, String str, gj gjVar) {
        File file;
        URLConnection uRLConnection;
        int k3;
        File file2;
        int contentLength;
        InputStream inputStream;
        int read;
        this.f4262c = url.toString();
        this.f4260a = true;
        try {
            k3 = AdsCommonMetaData.k().F().k();
            file2 = new File(context.getCacheDir(), "StartIoVideos");
            if (str != null) {
                try {
                    file2 = new File(file2, str);
                } catch (Throwable th) {
                    th = th;
                    file = null;
                    uRLConnection = null;
                    try {
                        if (!(th instanceof IOException)) {
                        }
                        this.f4262c = null;
                        if (file != null) {
                        }
                        if (!(uRLConnection instanceof HttpURLConnection)) {
                        }
                        ((HttpURLConnection) uRLConnection).disconnect();
                        return null;
                    } catch (Throwable th2) {
                        this.f4262c = null;
                        if (file != null && file.exists()) {
                            file.delete();
                        }
                        if (uRLConnection instanceof HttpURLConnection) {
                            ((HttpURLConnection) uRLConnection).disconnect();
                        }
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            file = null;
        }
        if (file2.exists()) {
            String path = file2.getPath();
            this.f4262c = null;
            return path;
        }
        File parentFile = file2.getParentFile();
        if (parentFile == null) {
            this.f4262c = null;
            return null;
        }
        parentFile.mkdirs();
        file = File.createTempFile("tmp-", ".temp", parentFile);
        try {
            uRLConnection = url.openConnection();
        } catch (Throwable th4) {
            th = th4;
            uRLConnection = null;
            if (!(th instanceof IOException) && !(th instanceof OutOfMemoryError)) {
                d9.a(th);
            }
            this.f4262c = null;
            if (file != null && file.exists()) {
                file.delete();
            }
            if (!(uRLConnection instanceof HttpURLConnection)) {
                return null;
            }
            ((HttpURLConnection) uRLConnection).disconnect();
            return null;
        }
        try {
            uRLConnection.connect();
            contentLength = uRLConnection.getContentLength();
            inputStream = uRLConnection.getInputStream();
        } catch (Throwable th5) {
            th = th5;
            if (!(th instanceof IOException)) {
                d9.a(th);
            }
            this.f4262c = null;
            if (file != null) {
                file.delete();
            }
            if (!(uRLConnection instanceof HttpURLConnection)) {
            }
            ((HttpURLConnection) uRLConnection).disconnect();
            return null;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                int i3 = 0;
                int i4 = 0;
                boolean z = false;
                int i5 = 0;
                while (true) {
                    read = inputStream.read(bArr);
                    if (read <= 0 || !this.f4260a) {
                        break;
                    }
                    fileOutputStream.write(bArr, i3, read);
                    i4 += read;
                    int i6 = k3;
                    int i7 = (int) ((i4 * 100.0d) / contentLength);
                    if (i7 >= i6) {
                        if (!z) {
                            new Handler(Looper.getMainLooper()).post(new ke(gjVar, file.getPath()));
                            z = true;
                        }
                        if (i7 >= i5 + 1) {
                            if (this.f4261b != null) {
                                new Handler(Looper.getMainLooper()).post(new le(this, i7));
                            }
                            i5 = i7;
                        }
                    }
                    k3 = i6;
                    i3 = 0;
                }
                if (!this.f4260a && read > 0) {
                    fileOutputStream.close();
                    inputStream.close();
                    this.f4262c = null;
                    if (file != null && file.exists()) {
                        file.delete();
                    }
                    if (uRLConnection instanceof HttpURLConnection) {
                        ((HttpURLConnection) uRLConnection).disconnect();
                    }
                    return "downloadInterrupted";
                }
                if (file.renameTo(file2)) {
                    String path2 = file2.getPath();
                    fileOutputStream.close();
                    inputStream.close();
                    this.f4262c = null;
                    if (file.exists()) {
                        file.delete();
                    }
                    if (uRLConnection instanceof HttpURLConnection) {
                        ((HttpURLConnection) uRLConnection).disconnect();
                    }
                    return path2;
                }
                fileOutputStream.close();
                inputStream.close();
                this.f4262c = null;
                if (file.exists()) {
                    file.delete();
                }
                if (!(uRLConnection instanceof HttpURLConnection)) {
                    return null;
                }
                ((HttpURLConnection) uRLConnection).disconnect();
                return null;
            } finally {
            }
        } finally {
        }
    }
}
