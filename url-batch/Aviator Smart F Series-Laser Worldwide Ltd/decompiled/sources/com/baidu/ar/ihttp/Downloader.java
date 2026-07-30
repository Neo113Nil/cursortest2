package com.baidu.ar.ihttp;

import com.baidu.ar.c6;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.j4;
import com.baidu.ar.x7;
import com.baidu.mapapi.http.wrapper.HttpManager;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class Downloader {

    /* renamed from: a, reason: collision with root package name */
    public String f2493a;

    /* renamed from: b, reason: collision with root package name */
    public int f2494b = 0;

    public class a implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2495a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IProgressCallback f2496b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ICallbackWith f2497c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ICallbackWith f2498d;

        public a(String str, IProgressCallback iProgressCallback, ICallbackWith iCallbackWith, ICallbackWith iCallbackWith2) {
            this.f2495a = str;
            this.f2496b = iProgressCallback;
            this.f2497c = iCallbackWith;
            this.f2498d = iCallbackWith2;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            this.f2497c.run(httpException);
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            Downloader.this.f2494b = iHttpResponse.getContentLength();
            try {
                Downloader.this.download(this.f2495a, this.f2496b);
                this.f2498d.run(Integer.valueOf(Downloader.this.f2494b));
            } catch (Exception e8) {
                e8.printStackTrace();
                this.f2497c.run(e8);
            }
        }
    }

    public Downloader(String str) {
        this.f2493a = str;
    }

    public static int getNetFileSize(String str) {
        return HttpFactory.newRequest().setUrl(str).setMethod("HEAD").execute().getContentLength();
    }

    public int download(String str, IProgressCallback iProgressCallback) {
        int fileSize = getFileSize();
        IHttpResponse execute = HttpFactory.newRequest().setUrl(this.f2493a).setMethod(HttpManager.HTTP_GET).execute();
        if (!execute.isSuccess()) {
            throw new HttpException(4, "下载失败");
        }
        a(execute.getStream(), str, fileSize, iProgressCallback);
        return fileSize;
    }

    public IHttpRequest downloadAsync(String str, ICallbackWith<Integer> iCallbackWith, ICallbackWith<Exception> iCallbackWith2) {
        return downloadAsync(str, iCallbackWith, iCallbackWith2, null);
    }

    public int getFileSize() {
        if (this.f2494b == 0) {
            this.f2494b = getNetFileSize(this.f2493a);
        }
        return this.f2494b;
    }

    public IHttpRequest downloadAsync(String str, ICallbackWith<Integer> iCallbackWith, ICallbackWith<Exception> iCallbackWith2, IProgressCallback iProgressCallback) {
        IHttpRequest newRequest = HttpFactory.newRequest();
        newRequest.setUrl(this.f2493a).setMethod("HEAD").enqueue(new a(str, iProgressCallback, iCallbackWith2, iCallbackWith));
        return newRequest;
    }

    public static void a(InputStream inputStream, String str, int i8, IProgressCallback iProgressCallback) {
        BufferedInputStream bufferedInputStream;
        j4.f(new File(str));
        byte[] bArr = new byte[8192];
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "rw");
            try {
                randomAccessFile2.seek(0L);
                bufferedInputStream = new BufferedInputStream(inputStream, 8192);
                int i9 = 0;
                while (true) {
                    try {
                        int read = bufferedInputStream.read(bArr, 0, 8192);
                        if (read == -1) {
                            x7.a((Closeable) bufferedInputStream);
                            x7.a(randomAccessFile2);
                            return;
                        } else {
                            randomAccessFile2.write(bArr, 0, read);
                            i9 += read;
                            if (iProgressCallback != null) {
                                iProgressCallback.onProgress(i9, i8);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = randomAccessFile2;
                        x7.a((Closeable) bufferedInputStream);
                        x7.a(randomAccessFile);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
        }
    }
}
