package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.aiming.mdt.utils.Constants;
import com.facebook.ads.AudienceNetworkActivity;
import com.tapjoy.TapjoyConstants;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    private static s f8780b;

    /* renamed from: a, reason: collision with root package name */
    public Map<String, String> f8781a = null;

    /* renamed from: c, reason: collision with root package name */
    private Context f8782c;

    private s(Context context) {
        this.f8782c = context;
    }

    public static s a(Context context) {
        if (f8780b == null) {
            f8780b = new s(context);
        }
        return f8780b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:40|(1:113)(1:48)|(10:79|80|(5:96|97|99|100|101)(7:82|83|84|85|86|87|88)|92|68|(1:70)|71|72|73|59)(1:50)|51|52|(1:54)|55|56|57|58|59) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0160, code lost:
    
        if (com.tencent.bugly.proguard.x.a(r0) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0162, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0167, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0168, code lost:
    
        r6 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0174 A[Catch: all -> 0x016a, TRY_LEAVE, TryCatch #9 {all -> 0x016a, blocks: (B:24:0x009a, B:26:0x00a2, B:29:0x00b3, B:39:0x00b1, B:80:0x00dc, B:97:0x00e4, B:84:0x010e, B:87:0x011b, B:52:0x0132, B:55:0x0153, B:68:0x016e, B:70:0x0174), top: B:23:0x009a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(String str, byte[] bArr, v vVar, Map<String, String> map) {
        int i;
        int responseCode;
        Object[] objArr;
        int i2;
        byte[] bArr2 = null;
        int i3 = 0;
        if (str == null) {
            x.e("Failed for no URL.", new Object[0]);
            return null;
        }
        long length = bArr == null ? 0L : bArr.length;
        int i4 = 1;
        x.c("request: %s, send: %d (pid=%d | tid=%d)", str, Long.valueOf(length), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        String str2 = str;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (i5 <= 0 && i6 <= 0) {
            if (z) {
                i = i5;
                z = false;
            } else {
                int i7 = i5 + 1;
                if (i7 > i4) {
                    x.c("try time: " + i7, new Object[i3]);
                    SystemClock.sleep(((long) new Random(System.currentTimeMillis()).nextInt(10000)) + TapjoyConstants.TIMER_INCREMENT);
                }
                i = i7;
            }
            String e = com.tencent.bugly.crashreport.common.info.b.e(this.f8782c);
            if (e == null) {
                x.d("Failed to request for network not avail", new Object[i3]);
                i5 = i;
            } else {
                vVar.a(length);
                HttpURLConnection a2 = a(str2, bArr, e, map);
                if (a2 != null) {
                    try {
                        try {
                            responseCode = a2.getResponseCode();
                        } finally {
                        }
                    } catch (IOException e2) {
                        e = e2;
                    }
                    if (responseCode == 200) {
                        this.f8781a = a(a2);
                        byte[] b2 = b(a2);
                        vVar.b(b2 == null ? 0L : b2.length);
                        try {
                            a2.disconnect();
                        } catch (Throwable th) {
                            if (!x.a(th)) {
                                th.printStackTrace();
                            }
                        }
                        return b2;
                    }
                    if (responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307) {
                        try {
                            String headerField = a2.getHeaderField(Constants.KEY_LOCATION);
                            if (headerField == null) {
                                try {
                                    x.e("Failed to redirect: %d" + responseCode, new Object[0]);
                                    try {
                                        a2.disconnect();
                                        return null;
                                    } catch (Throwable th2) {
                                        if (x.a(th2)) {
                                            return null;
                                        }
                                        th2.printStackTrace();
                                        return null;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                }
                            } else {
                                i6++;
                                try {
                                    objArr = new Object[2];
                                    objArr[0] = Integer.valueOf(responseCode);
                                } catch (IOException e4) {
                                    e = e4;
                                }
                                try {
                                    objArr[1] = headerField;
                                    x.c("redirect code: %d ,to:%s", objArr);
                                    str2 = headerField;
                                    i2 = 0;
                                    z = true;
                                } catch (IOException e5) {
                                    e = e5;
                                    str2 = headerField;
                                    i = 0;
                                    z = true;
                                    if (!x.a(e)) {
                                    }
                                    a2.disconnect();
                                    i5 = i;
                                    bArr2 = null;
                                    i3 = 0;
                                    i4 = 1;
                                }
                            }
                        } catch (IOException e6) {
                            e = e6;
                        }
                        z = true;
                        if (!x.a(e)) {
                            e.printStackTrace();
                        }
                        try {
                            a2.disconnect();
                        } catch (Throwable th3) {
                            if (!x.a(th3)) {
                                th3.printStackTrace();
                            }
                        }
                        i5 = i;
                    } else {
                        i2 = i;
                    }
                    x.d("response code " + responseCode, new Object[0]);
                    long contentLength = (long) a2.getContentLength();
                    if (contentLength < 0) {
                        contentLength = 0;
                    }
                    vVar.b(contentLength);
                    a2.disconnect();
                    i5 = i2;
                } else {
                    x.c("Failed to execute post.", new Object[0]);
                    vVar.b(0L);
                    i5 = i;
                }
                bArr2 = null;
                i3 = 0;
            }
            i4 = 1;
        }
        return bArr2;
    }

    private static Map<String, String> a(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields == null || headerFields.size() == 0) {
            return null;
        }
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list.size() > 0) {
                hashMap.put(str, list.get(0));
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] b(HttpURLConnection httpURLConnection) {
        BufferedInputStream bufferedInputStream;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    if (!x.a(th)) {
                        th.printStackTrace();
                    }
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th5) {
                        th5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            bufferedInputStream = null;
        }
    }

    private HttpURLConnection a(String str, byte[] bArr, String str2, Map<String, String> map) {
        if (str == null) {
            x.e("destUrl is null.", new Object[0]);
            return null;
        }
        HttpURLConnection a2 = a(str2, str);
        if (a2 == null) {
            x.e("Failed to get HttpURLConnection object.", new Object[0]);
            return null;
        }
        try {
            a2.setRequestProperty("wup_version", "3.0");
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    a2.setRequestProperty(entry.getKey(), URLEncoder.encode(entry.getValue(), AudienceNetworkActivity.WEBVIEW_ENCODING));
                }
            }
            a2.setRequestProperty("A37", URLEncoder.encode(str2, AudienceNetworkActivity.WEBVIEW_ENCODING));
            a2.setRequestProperty("A38", URLEncoder.encode(str2, AudienceNetworkActivity.WEBVIEW_ENCODING));
            OutputStream outputStream = a2.getOutputStream();
            if (bArr == null) {
                outputStream.write(0);
            } else {
                outputStream.write(bArr);
            }
            return a2;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            x.e("Failed to upload, please check your network.", new Object[0]);
            return null;
        }
    }

    private static HttpURLConnection a(String str, String str2) {
        HttpURLConnection httpURLConnection;
        try {
            URL url = new URL(str2);
            if (str != null && str.toLowerCase(Locale.US).contains("wap")) {
                httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("http.proxyHost"), Integer.parseInt(System.getProperty("http.proxyPort")))));
            } else {
                httpURLConnection = (HttpURLConnection) url.openConnection();
            }
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(false);
            return httpURLConnection;
        } catch (Throwable th) {
            if (x.a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
