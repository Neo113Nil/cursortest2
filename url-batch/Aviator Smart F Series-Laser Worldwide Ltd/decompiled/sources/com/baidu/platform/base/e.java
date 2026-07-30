package com.baidu.platform.base;

import android.text.TextUtils;
import android.util.Log;
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
public class e {

    /* renamed from: d, reason: collision with root package name */
    private d f8713d;

    /* renamed from: b, reason: collision with root package name */
    private int f8711b = 1;

    /* renamed from: c, reason: collision with root package name */
    private List<com.baidu.platform.base.d> f8712c = new LinkedList();

    /* renamed from: a, reason: collision with root package name */
    private ExecutorService f8710a = Executors.newCachedThreadPool();

    private class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private File f8714a;

        @Override // com.baidu.platform.base.e.c
        public void a(com.baidu.platform.base.d dVar) {
            if (e.this.f8712c == null || e.this.f8712c.size() == 0 || dVar == null) {
                return;
            }
            e.this.f8712c.clear();
            if (e.this.f8713d != null) {
                e.this.f8713d.onFailed();
            }
        }

        @Override // com.baidu.platform.base.e.c
        public void b(com.baidu.platform.base.d dVar) {
            if (e.this.f8712c == null || e.this.f8712c.size() == 0 || dVar == null || !dVar.b() || e.this.f8712c == null) {
                return;
            }
            e.this.f8712c.remove(dVar);
            if (e.this.f8712c.size() == 0) {
                Log.d("SVG下载", "下载成功:" + this.f8714a.getAbsolutePath());
                e.this.f8713d.a(this.f8714a);
            }
        }

        private b(File file) {
            this.f8714a = file;
        }
    }

    public interface c {
        void a(com.baidu.platform.base.d dVar);

        void b(com.baidu.platform.base.d dVar);
    }

    public interface d {
        void a(File file);

        void onFailed();
    }

    /* renamed from: com.baidu.platform.base.e$e, reason: collision with other inner class name */
    static class C0096e implements HostnameVerifier {
        C0096e() {
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
        this.f8711b = i8;
        this.f8713d = dVar;
        a(str, str2, str3);
    }

    private void a(String str, String str2, String str3) {
        File file = new File(str2);
        if (file.exists() || file.mkdirs()) {
            HttpURLConnection a8 = a(str);
            try {
                if (a8 == null) {
                    Log.e("Download File", "urlConnection is null.");
                    d dVar = this.f8713d;
                    if (dVar != null) {
                        dVar.onFailed();
                        return;
                    }
                    return;
                }
                if (a8.getResponseCode() == 200) {
                    int contentLength = a8.getContentLength();
                    if (contentLength > 0) {
                        if (str3 == null) {
                            Log.e("Download File", "fileName is null.");
                            String headerField = a8.getHeaderField("Content-Disposition");
                            if (headerField == null || headerField.length() == 0 || (str3 = URLDecoder.decode(headerField.substring(headerField.indexOf("filename=") + 9), l.UTF_8)) == null || str3.length() == 0) {
                                return;
                            }
                        }
                        File file2 = new File(file, str3);
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                        randomAccessFile.setLength(contentLength);
                        randomAccessFile.close();
                        a8.disconnect();
                        int i8 = this.f8711b;
                        int i9 = contentLength % i8;
                        int i10 = contentLength / i8;
                        if (i9 != 0) {
                            i10++;
                        }
                        Log.d("SVG下载", "即将开始下载，文件名:" + file2.getAbsolutePath());
                        a(str, file2, i10, contentLength);
                        return;
                    }
                    throw new RuntimeException("unKnow file length");
                }
                Log.e("Download File", "server no response. Response code: " + a8.getResponseCode());
                Log.e("Download File", "Server response message: " + a8.getResponseMessage());
                d dVar2 = this.f8713d;
                if (dVar2 != null) {
                    dVar2.onFailed();
                }
                throw new RuntimeException("server no response. Response code: " + a8.getResponseCode() + ", Response message: " + a8.getResponseMessage());
            } catch (Exception unused) {
                Log.e("Download File", "exception.");
            }
        }
    }

    private void a(String str, File file, int i8, int i9) {
        if (TextUtils.isEmpty(str) || file == null || i8 <= 0 || i9 <= 0) {
            return;
        }
        int i10 = 0;
        while (i10 < this.f8711b) {
            int i11 = i10 + 1;
            com.baidu.platform.base.c cVar = new com.baidu.platform.base.c(i10, i10 * i8, (i11 * i8) - 1);
            if (i10 == this.f8711b - 1) {
                cVar.a(i9);
            }
            com.baidu.platform.base.d dVar = new com.baidu.platform.base.d(str, file, cVar, new b(file));
            List<com.baidu.platform.base.d> list = this.f8712c;
            if (list != null) {
                list.add(dVar);
            }
            ExecutorService executorService = this.f8710a;
            if (executorService != null && !executorService.isShutdown()) {
                this.f8710a.submit(dVar);
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
                httpsURLConnection.setHostnameVerifier(new C0096e());
                httpURLConnection = httpsURLConnection;
            } else {
                httpURLConnection = (HttpURLConnection) url.openConnection();
            }
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestMethod(HttpManager.HTTP_GET);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.connect();
            return httpURLConnection;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }
}
