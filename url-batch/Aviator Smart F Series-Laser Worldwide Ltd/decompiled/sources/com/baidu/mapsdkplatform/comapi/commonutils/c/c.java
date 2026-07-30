package com.baidu.mapsdkplatform.comapi.commonutils.c;

import android.text.TextUtils;
import cn.hutool.core.util.l;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapapi.http.wrapper.HttpManager;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private d f7951d;

    /* renamed from: b, reason: collision with root package name */
    private int f7949b = 1;

    /* renamed from: c, reason: collision with root package name */
    private List<com.baidu.mapsdkplatform.comapi.commonutils.c.b> f7950c = new LinkedList();

    /* renamed from: a, reason: collision with root package name */
    private ExecutorService f7948a = Executors.newCachedThreadPool();

    private class b implements InterfaceC0072c {

        /* renamed from: a, reason: collision with root package name */
        private File f7952a;

        @Override // com.baidu.mapsdkplatform.comapi.commonutils.c.c.InterfaceC0072c
        public void a(com.baidu.mapsdkplatform.comapi.commonutils.c.b bVar) {
            if (c.this.f7950c == null || c.this.f7950c.size() == 0 || bVar == null) {
                return;
            }
            c.this.f7950c.clear();
            if (c.this.f7951d != null) {
                c.this.f7951d.onFailed();
            }
        }

        @Override // com.baidu.mapsdkplatform.comapi.commonutils.c.c.InterfaceC0072c
        public void b(com.baidu.mapsdkplatform.comapi.commonutils.c.b bVar) {
            if (c.this.f7950c == null || c.this.f7950c.size() == 0 || bVar == null || !bVar.b() || c.this.f7950c == null) {
                return;
            }
            c.this.f7950c.remove(bVar);
            if (c.this.f7950c.size() == 0) {
                c.this.f7951d.a(this.f7952a);
            }
        }

        private b(File file) {
            this.f7952a = file;
        }
    }

    /* renamed from: com.baidu.mapsdkplatform.comapi.commonutils.c.c$c, reason: collision with other inner class name */
    public interface InterfaceC0072c {
        void a(com.baidu.mapsdkplatform.comapi.commonutils.c.b bVar);

        void b(com.baidu.mapsdkplatform.comapi.commonutils.c.b bVar);
    }

    public interface d {
        void a(File file);

        void onFailed();
    }

    static class e implements HostnameVerifier {
        e() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
        }
    }

    public void a(String str, String str2, String str3, int i8, d dVar) {
        if (i8 <= 0 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        this.f7949b = i8;
        this.f7951d = dVar;
        a(str, str2, str3);
    }

    private void a(String str, String str2, String str3) {
        String headerField;
        File file = new File(str2);
        if (file.exists() || file.mkdirs()) {
            HttpURLConnection a8 = a(str);
            if (a8 != null) {
                try {
                    if (a8.getResponseCode() == 200) {
                        int contentLength = a8.getContentLength();
                        if (contentLength > 0) {
                            if (str3 == null && ((headerField = a8.getHeaderField("Content-Disposition")) == null || headerField.length() == 0 || (str3 = URLDecoder.decode(headerField.substring(headerField.indexOf("filename=") + 9), l.UTF_8)) == null || str3.length() == 0)) {
                                return;
                            }
                            File file2 = new File(file, str3);
                            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                            randomAccessFile.setLength(contentLength);
                            randomAccessFile.close();
                            a8.disconnect();
                            int i8 = this.f7949b;
                            int i9 = contentLength % i8;
                            int i10 = contentLength / i8;
                            if (i9 != 0) {
                                i10++;
                            }
                            a(str, file2, i10, contentLength);
                            return;
                        }
                        throw new RuntimeException("unKnow file length");
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            throw new RuntimeException("server no response.");
        }
    }

    private void a(String str, File file, int i8, int i9) {
        if (TextUtils.isEmpty(str) || file == null || i8 <= 0 || i9 <= 0) {
            return;
        }
        int i10 = 0;
        while (i10 < this.f7949b) {
            int i11 = i10 + 1;
            com.baidu.mapsdkplatform.comapi.commonutils.c.a aVar = new com.baidu.mapsdkplatform.comapi.commonutils.c.a(i10, i10 * i8, (i11 * i8) - 1);
            if (i10 == this.f7949b - 1) {
                aVar.a(i9);
            }
            com.baidu.mapsdkplatform.comapi.commonutils.c.b bVar = new com.baidu.mapsdkplatform.comapi.commonutils.c.b(str, file, aVar, new b(file));
            List<com.baidu.mapsdkplatform.comapi.commonutils.c.b> list = this.f7950c;
            if (list != null) {
                list.add(bVar);
            }
            ExecutorService executorService = this.f7948a;
            if (executorService != null && !executorService.isShutdown()) {
                this.f7948a.submit(bVar);
            }
            i10 = i11;
        }
    }

    private HttpURLConnection a(String str) {
        HttpURLConnection httpURLConnection;
        try {
            URL url = new URL(str);
            if (HttpClient.isHttpsEnable) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                httpsURLConnection.setHostnameVerifier(new e());
                httpURLConnection = httpsURLConnection;
            } else {
                httpURLConnection = (HttpURLConnection) url.openConnection();
            }
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestMethod(HttpManager.HTTP_GET);
            httpURLConnection.connect();
            return httpURLConnection;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }
}
