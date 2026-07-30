package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import defpackage.dm0;
import defpackage.ey;
import defpackage.jt2;
import defpackage.kt2;
import defpackage.ll3;
import defpackage.q1;
import java.io.Closeable;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ImageDownload implements Closeable {
    private static final int MAX_IMAGE_SIZE_BYTES = 1048576;
    private volatile Future<?> future;
    private jt2 task;
    private final URL url;

    private ImageDownload(URL url) {
        this.url = url;
    }

    private byte[] blockingDownloadBytes() {
        URLConnection openConnection = this.url.openConnection();
        if (openConnection.getContentLength() > MAX_IMAGE_SIZE_BYTES) {
            dm0.j("Content-Length exceeds max size of 1048576");
            return null;
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] byteArray = ByteStreams.toByteArray(ByteStreams.limit(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable(Constants.TAG, 2)) {
                Log.v(Constants.TAG, "Downloaded " + byteArray.length + " bytes from " + this.url);
            }
            if (byteArray.length <= MAX_IMAGE_SIZE_BYTES) {
                return byteArray;
            }
            dm0.j("Image exceeds max size of 1048576");
            return null;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static ImageDownload create(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ImageDownload(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w(Constants.TAG, "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$start$0(kt2 kt2Var) {
        try {
            kt2Var.a(blockingDownload());
        } catch (Exception e) {
            kt2Var.a.p(e);
        }
    }

    public Bitmap blockingDownload() {
        if (Log.isLoggable(Constants.TAG, 4)) {
            Log.i(Constants.TAG, "Starting download of: " + this.url);
        }
        byte[] blockingDownloadBytes = blockingDownloadBytes();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(blockingDownloadBytes, 0, blockingDownloadBytes.length);
        if (decodeByteArray == null) {
            ey.l(this.url, "Failed to decode image: ");
            return null;
        }
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Successfully downloaded image: " + this.url);
        }
        return decodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.future.cancel(true);
    }

    public jt2 getTask() {
        jt2 jt2Var = this.task;
        ll3.v(jt2Var);
        return jt2Var;
    }

    public void start(ExecutorService executorService) {
        kt2 kt2Var = new kt2();
        this.future = executorService.submit(new q1(12, this, kt2Var));
        this.task = kt2Var.a;
    }
}
