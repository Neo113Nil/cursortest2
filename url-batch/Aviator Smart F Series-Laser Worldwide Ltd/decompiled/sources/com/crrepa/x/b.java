package com.crrepa.x;

import android.text.TextUtils;
import cn.hutool.core.util.l;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.google.common.net.HttpHeaders;
import com.realsil.sdk.dfu.DfuConstants;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13981a = UUID.randomUUID().toString();

    /* renamed from: b, reason: collision with root package name */
    private static final String f13982b = "--";

    /* renamed from: c, reason: collision with root package name */
    private static final String f13983c = "\r\n";

    class a implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.crrepa.y.a f13984h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f13985i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f13986j;

        a(com.crrepa.y.a aVar, long j8, long j9) {
            this.f13984h = aVar;
            this.f13985i = j8;
            this.f13986j = j9;
        }

        @Override // java.lang.Runnable
        public void run() {
            long j8 = this.f13986j;
            this.f13984h.onProgress((this.f13985i * 100.0f) / j8, j8);
        }
    }

    private void b(HttpURLConnection httpURLConnection) {
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestProperty("Connection", HttpHeaders.KEEP_ALIVE);
        httpURLConnection.setRequestProperty("Charset", l.UTF_8);
        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; BOUNDARY=" + f13981a);
    }

    c a(String str, File file, List<File> list, Map<String, File> map, String str2, String str3, Map<String, String> map2, Map<String, String> map3, com.crrepa.y.a aVar) {
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection a8 = a(str, HttpManager.HTTP_POST);
            try {
                b(a8);
                if (map3 != null) {
                    a(a8, map3);
                }
                a8.connect();
                DataOutputStream dataOutputStream = new DataOutputStream(a8.getOutputStream());
                if (map2 != null) {
                    dataOutputStream.write(a(map2).getBytes());
                    dataOutputStream.flush();
                }
                if (file != null) {
                    a(file, str2, str3, dataOutputStream, aVar);
                } else if (list != null) {
                    Iterator<File> it = list.iterator();
                    while (it.hasNext()) {
                        a(it.next(), str2, str3, dataOutputStream, null);
                    }
                } else if (map != null) {
                    for (String str4 : map.keySet()) {
                        a(map.get(str4), str4, str3, dataOutputStream, null);
                    }
                }
                dataOutputStream.write(("\r\n--" + f13981a + "--\r\n").getBytes());
                dataOutputStream.flush();
                return a(a8);
            } catch (Exception e8) {
                e = e8;
                httpURLConnection = a8;
                return a(httpURLConnection, e);
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    c a(String str, String str2, String str3, Map<String, String> map) {
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = a(str, HttpManager.HTTP_POST);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            if (!TextUtils.isEmpty(str3)) {
                httpURLConnection.setRequestProperty("Content-Type", str3);
            }
            if (map != null) {
                a(httpURLConnection, map);
            }
            httpURLConnection.connect();
            if (!TextUtils.isEmpty(str2)) {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(), l.UTF_8));
                bufferedWriter.write(str2);
                bufferedWriter.close();
            }
            return a(httpURLConnection);
        } catch (Exception e8) {
            return a(httpURLConnection, e8);
        }
    }

    c a(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = a(str, HttpManager.HTTP_GET);
            httpURLConnection.setDoInput(true);
            if (map != null) {
                a(httpURLConnection, map);
            }
            httpURLConnection.connect();
            return a(httpURLConnection);
        } catch (Exception e8) {
            return a(httpURLConnection, e8);
        }
    }

    private c a(HttpURLConnection httpURLConnection) {
        c cVar = new c();
        cVar.f13990c = httpURLConnection.getResponseCode();
        cVar.f13991d = httpURLConnection.getContentLength();
        cVar.f13988a = httpURLConnection.getInputStream();
        cVar.f13989b = httpURLConnection.getErrorStream();
        return cVar;
    }

    private c a(HttpURLConnection httpURLConnection, Exception exc) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        exc.printStackTrace();
        c cVar = new c();
        cVar.f13992e = exc;
        return cVar;
    }

    private String a(File file, String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\r\n");
        stringBuffer.append("--");
        stringBuffer.append(f13981a);
        stringBuffer.append("\r\n");
        stringBuffer.append("Content-Disposition: form-data; name=\"" + str + "\"; filename=\"" + file.getName() + "\"");
        stringBuffer.append("\r\n");
        StringBuilder sb = new StringBuilder();
        sb.append("Content-Type: ");
        sb.append(str2);
        stringBuffer.append(sb.toString());
        stringBuffer.append("\r\n");
        stringBuffer.append("Content-Lenght: " + file.length());
        stringBuffer.append("\r\n");
        stringBuffer.append("\r\n");
        return stringBuffer.toString();
    }

    private String a(Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : map.keySet()) {
            stringBuffer.append("--");
            stringBuffer.append(f13981a);
            stringBuffer.append("\r\n");
            stringBuffer.append("Content-Disposition: form-data; name=\"" + str + "\"");
            stringBuffer.append("\r\n");
            stringBuffer.append("Content-Type: text/plain");
            stringBuffer.append("\r\n");
            stringBuffer.append("Content-Lenght: " + map.get(str).length());
            stringBuffer.append("\r\n");
            stringBuffer.append("\r\n");
            stringBuffer.append(map.get(str));
            stringBuffer.append("\r\n");
        }
        return stringBuffer.toString();
    }

    private HttpURLConnection a(String str, String str2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(DfuConstants.MAX_CALLBACK_LOCK_WAIT_TIME);
        httpURLConnection.setRequestMethod(str2);
        return httpURLConnection;
    }

    private void a(File file, String str, String str2, DataOutputStream dataOutputStream, com.crrepa.y.a aVar) {
        dataOutputStream.write(a(file, str, str2).getBytes());
        dataOutputStream.flush();
        FileInputStream fileInputStream = new FileInputStream(file);
        long length = file.length();
        byte[] bArr = new byte[2048];
        long j8 = 0;
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                dataOutputStream.flush();
                fileInputStream.close();
                return;
            } else {
                dataOutputStream.write(bArr, 0, read);
                long j9 = j8 + read;
                if (aVar != null) {
                    com.crrepa.y.a.mMainHandler.post(new a(aVar, j9, length));
                }
                j8 = j9;
            }
        }
    }

    private void a(HttpURLConnection httpURLConnection, Map<String, String> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                httpURLConnection.setRequestProperty(str, map.get(str));
            }
        }
    }
}
