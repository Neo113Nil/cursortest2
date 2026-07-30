package com.baidu.mapauto.auth.net;

import com.baidu.mapapi.http.wrapper.HttpManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class a implements com.baidu.mapauto.auth.net.base.a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f7740b = "a";

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ boolean f7741c = true;

    /* renamed from: a, reason: collision with root package name */
    public c f7742a;

    public a() {
    }

    public a(c cVar) {
        this.f7742a = cVar;
    }

    public static String a(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                StringWriter stringWriter = new StringWriter();
                char[] cArr = new char[8192];
                while (true) {
                    int read = bufferedReader.read(cArr);
                    if (read < 0) {
                        String stringWriter2 = stringWriter.toString();
                        bufferedReader.close();
                        return stringWriter2;
                    }
                    stringWriter.write(cArr, 0, read);
                }
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        r4 = r3.f7748b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r4.startsWith("https") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r4.startsWith("HTTPS") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        r10 = r3.f7748b + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (com.baidu.mapapi.http.wrapper.HttpManager.HTTP_POST.equals(com.baidu.mapapi.http.wrapper.HttpManager.HTTP_GET) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r11.isEmpty() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r10 = "?" + r1.a(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        r4 = new java.net.URL(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r10.startsWith("https") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r10.startsWith("HTTPS") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        r0 = (java.net.HttpURLConnection) r4.openConnection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        r2.setRequestMethod(com.baidu.mapapi.http.wrapper.HttpManager.HTTP_POST);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if (com.baidu.mapapi.http.wrapper.HttpManager.HTTP_POST.equals(com.baidu.mapapi.http.wrapper.HttpManager.HTTP_POST) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        r2.setDoInput(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        r2.setDoOutput(true);
        r2.setReadTimeout(r3.f7747a);
        r2.setConnectTimeout(5000);
        r0 = r3.f7749c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (r0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        r3 = r0.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        if (r3.hasNext() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        r4 = r3.next();
        r5 = r0.get(r4);
        java.util.Objects.requireNonNull(r5);
        r2.setRequestProperty(r4, r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e3, code lost:
    
        if (com.baidu.mapapi.http.wrapper.HttpManager.HTTP_POST.equals(com.baidu.mapapi.http.wrapper.HttpManager.HTTP_POST) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e7, code lost:
    
        r2.setRequestProperty("content-type", "multipart/form-data; boundary=" + com.baidu.mapauto.auth.net.format.a.f7755a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
    
        r3 = com.baidu.mapauto.auth.util.LogUtil.getInstance();
        r4 = com.baidu.mapauto.auth.net.a.f7740b;
        r3.i(r4, "请求地址: " + r10);
        com.baidu.mapauto.auth.util.LogUtil.getInstance().i(r4, "请求方式: " + com.baidu.mapapi.http.wrapper.HttpManager.HTTP_POST);
        com.baidu.mapauto.auth.util.LogUtil.getInstance().i(r4, "请求头: " + r0);
        com.baidu.mapauto.auth.util.LogUtil.getInstance().i(r4, "请求参数: " + r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0167, code lost:
    
        if (com.baidu.mapapi.http.wrapper.HttpManager.HTTP_POST.equals(com.baidu.mapapi.http.wrapper.HttpManager.HTTP_POST) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0169, code lost:
    
        r10 = r2.getOutputStream();
        r11 = r1.a(r11);
        r0 = new java.io.DataOutputStream(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0176, code lost:
    
        r0.writeBytes(r11);
        r0.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017c, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0180, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0189, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018a, code lost:
    
        r2.connect();
        r10 = new com.baidu.mapauto.auth.net.b();
        r11 = r2.getResponseCode();
        r10.f7743a = java.lang.Integer.valueOf(r11);
        r10.f7744b = r2.getResponseMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a4, code lost:
    
        if (r11 != 200) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a6, code lost:
    
        r10.f7745c = a(r2.getInputStream());
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b0, code lost:
    
        r2.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b3, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x008c, code lost:
    
        r0 = (javax.net.ssl.HttpsURLConnection) r4.openConnection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0092, code lost:
    
        r2 = r3.f7750d;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0094, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0096, code lost:
    
        r0.setHostnameVerifier(r2);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x009a, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x009b, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01bb, code lost:
    
        throw new java.lang.IllegalArgumentException("net config 检验失败");
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b a(String str, HashMap hashMap) {
        com.baidu.mapauto.auth.net.format.a aVar = new com.baidu.mapauto.auth.net.format.a();
        HttpURLConnection httpURLConnection = null;
        try {
            c cVar = this.f7742a;
            if (!f7741c && !HttpManager.HTTP_POST.equals(HttpManager.HTTP_POST) && !HttpManager.HTTP_POST.equals(HttpManager.HTTP_GET)) {
                throw new AssertionError();
            }
            throw new IllegalArgumentException("net config 不能为空");
        } catch (Throwable th) {
            th = th;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }
}
