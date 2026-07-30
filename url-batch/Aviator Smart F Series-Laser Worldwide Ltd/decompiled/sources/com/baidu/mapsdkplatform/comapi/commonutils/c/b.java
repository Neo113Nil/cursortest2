package com.baidu.mapsdkplatform.comapi.commonutils.c;

import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.baidu.mapsdkplatform.comapi.commonutils.c.c;
import com.google.common.net.HttpHeaders;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* loaded from: classes2.dex */
public class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private String f7943a;

    /* renamed from: b, reason: collision with root package name */
    private File f7944b;

    /* renamed from: c, reason: collision with root package name */
    private com.baidu.mapsdkplatform.comapi.commonutils.c.a f7945c;

    /* renamed from: d, reason: collision with root package name */
    private c.InterfaceC0072c f7946d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f7947e = false;

    static class a implements HostnameVerifier {
        a() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
        }
    }

    public b(String str, File file, com.baidu.mapsdkplatform.comapi.commonutils.c.a aVar, c.InterfaceC0072c interfaceC0072c) {
        this.f7943a = str;
        this.f7944b = file;
        this.f7945c = aVar;
        this.f7946d = interfaceC0072c;
    }

    public boolean b() {
        return this.f7947e;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5 A[Catch: IOException -> 0x00d1, TRY_LEAVE, TryCatch #4 {IOException -> 0x00d1, blocks: (B:55:0x00cd, B:48:0x00d5), top: B:54:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        RandomAccessFile randomAccessFile;
        HttpURLConnection httpURLConnection;
        InputStream inputStream = null;
        try {
            URL url = new URL(this.f7943a);
            if (HttpClient.isHttpsEnable) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                httpsURLConnection.setHostnameVerifier(new a());
                httpURLConnection = httpsURLConnection;
            } else {
                httpURLConnection = (HttpURLConnection) url.openConnection();
            }
            httpURLConnection.setRequestMethod(HttpManager.HTTP_GET);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setRequestProperty("Range", "bytes=" + this.f7945c.b() + "-" + this.f7945c.a());
            httpURLConnection.setRequestProperty("Connection", HttpHeaders.KEEP_ALIVE);
            randomAccessFile = new RandomAccessFile(this.f7944b, "rw");
            try {
                try {
                    randomAccessFile.seek(this.f7945c.b());
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200 || responseCode == 206) {
                        byte[] bArr = new byte[1048576];
                        inputStream = httpURLConnection.getInputStream();
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                randomAccessFile.write(bArr, 0, read);
                            }
                        }
                    }
                    this.f7947e = true;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    randomAccessFile.close();
                } catch (Exception unused) {
                    this.f7947e = false;
                    this.f7946d.a(this);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e9) {
                            e9.printStackTrace();
                        }
                    }
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    this.f7946d.b(this);
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        throw th;
                    }
                }
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            randomAccessFile = null;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
            if (inputStream != null) {
            }
            if (randomAccessFile != null) {
            }
            throw th;
        }
        this.f7946d.b(this);
    }
}
