package com.apm.insight.k;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.apm.insight.Npth;
import com.apm.insight.l.q;
import com.bumptech.glide.load.Key;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {
    public static boolean a = false;
    private static h b;

    public enum a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);

        final int d;

        a(int i) {
            this.d = i;
        }
    }

    public enum b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);

        final int l;

        b(int i) {
            this.l = i;
        }
    }

    public static l a(long j, String str, byte[] bArr, a aVar, String str2, boolean z) {
        String str3;
        String str4;
        StringBuilder sb;
        if (!Npth.isStopUpload() && str != null) {
            if (bArr == null) {
                bArr = new byte[0];
            }
            int length = bArr.length;
            if (a.GZIP == aVar && length > 128) {
                bArr = b(bArr);
                str3 = "gzip";
            } else if (a.DEFLATER != aVar || length <= 128) {
                str3 = null;
            } else {
                bArr = a(bArr);
                str3 = "deflate";
            }
            String str5 = str3;
            byte[] bArr2 = bArr;
            if (bArr2 == null) {
                return new l(202);
            }
            if (!z) {
                return a(str, bArr2, str2, str5, ShareTarget.METHOD_POST, true, false);
            }
            byte[] a2 = com.apm.insight.i.i().getEncryptImpl().a(bArr2);
            if (a2 != null) {
                if (TextUtils.isEmpty(new URL(str).getQuery())) {
                    str4 = "?";
                    if (!str.endsWith("?")) {
                        sb = new StringBuilder();
                        str = sb.append(str).append(str4).toString();
                    }
                    str = str + "tt_data=a";
                    str2 = "application/octet-stream;tt-data=a";
                    bArr2 = a2;
                } else {
                    str4 = "&";
                    if (!str.endsWith("&")) {
                        sb = new StringBuilder();
                        str = sb.append(str).append(str4).toString();
                    }
                    str = str + "tt_data=a";
                    str2 = "application/octet-stream;tt-data=a";
                    bArr2 = a2;
                }
            }
            return a(str, bArr2, str2, str5, ShareTarget.METHOD_POST, true, true);
        }
        return new l(201);
    }

    public static l a(String str, String str2) {
        return a(str, str2, b());
    }

    public static l a(String str, String str2, boolean z) {
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                return a(2097152L, str, str2.getBytes(), a.GZIP, "application/json; charset=utf-8", z);
            }
            return new l(201);
        } catch (Throwable th) {
            q.b(th);
            return new l(207, th);
        }
    }

    public static l a(String str, String str2, File... fileArr) {
        return b(str, str2, fileArr);
    }

    private static l a(String str, byte[] bArr, String str2, String str3, String str4, boolean z, boolean z2) {
        return b(str, bArr, str2, str3, str4, z, z2);
    }

    private static String a(String str, Map map) {
        if (TextUtils.isDigitsOnly(str) || map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    if (!sb.toString().endsWith("?")) {
                        sb.append("&");
                    }
                    sb.append(d(entry.getKey().toString(), Key.STRING_CHARSET_NAME));
                    sb.append("=");
                    sb.append(d(entry.getValue().toString(), Key.STRING_CHARSET_NAME));
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static void a(h hVar) {
        b = hVar;
    }

    public static boolean a() {
        return true;
    }

    public static boolean a(String str, String str2, String str3, String str4, List<String> list) {
        if (Npth.isStopUpload()) {
            return false;
        }
        try {
            j jVar = new j(str, Key.STRING_CHARSET_NAME, false);
            jVar.a("aid", str2);
            jVar.a("device_id", str3);
            jVar.a("os", "Android");
            jVar.a("process_name", str4);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                File file = new File(it.next());
                if (file.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", "Crash");
                    jVar.a(file.getName(), file, hashMap);
                }
            }
            return new JSONObject(jVar.a()).optInt("errno", -1) == 200;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    com.apm.insight.l.k.a(byteArrayOutputStream);
                }
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static byte[] a(String str, Map<String, String> map, byte[] bArr) {
        try {
            return a(2097152L, a(str, map), bArr, a.GZIP, "application/json; charset=utf-8", false).b();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }

    public static l b(String str, String str2) {
        return a(str, str2, a());
    }

    public static l b(String str, String str2, File... fileArr) {
        if (Npth.isStopUpload()) {
            return new l(201);
        }
        try {
            j jVar = new j(c(str, "have_dump=true&encrypt=true"), Key.STRING_CHARSET_NAME, true);
            jVar.a("json", str2, true);
            jVar.a("file", fileArr);
            try {
                return new l(0, new JSONObject(jVar.a()));
            } catch (JSONException e) {
                return new l(0, e);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return new l(207);
        }
    }

    private static l b(String str, byte[] bArr, String str2, String str3, String str4, boolean z, boolean z2) {
        InputStream inputStream;
        GZIPInputStream gZIPInputStream;
        byte[] a2;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection = null;
        GZIPInputStream gZIPInputStream2 = null;
        try {
            h hVar = b;
            if (hVar != null) {
                try {
                    str = hVar.a(str, bArr);
                } catch (Throwable unused) {
                }
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                if (z) {
                    httpURLConnection2.setDoOutput(true);
                } else {
                    httpURLConnection2.setDoOutput(false);
                }
                if (str2 != null) {
                    httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_TYPE, str2);
                }
                if (str3 != null) {
                    httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_ENCODING, str3);
                }
                httpURLConnection2.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
                if (str4 == null) {
                    throw new IllegalArgumentException("request method is not null");
                }
                httpURLConnection2.setRequestMethod(str4);
                if (bArr != null && bArr.length > 0) {
                    try {
                        dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                        try {
                            dataOutputStream.write(bArr);
                            dataOutputStream.flush();
                            com.apm.insight.l.k.a(dataOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            com.apm.insight.l.k.a(dataOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        dataOutputStream = null;
                    }
                }
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode != 200) {
                    l lVar = new l(206, "http response code " + responseCode);
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused2) {
                        }
                    }
                    com.apm.insight.l.k.a((Closeable) null);
                    return lVar;
                }
                InputStream inputStream2 = httpURLConnection2.getInputStream();
                try {
                    if ("gzip".equalsIgnoreCase(httpURLConnection2.getContentEncoding())) {
                        try {
                            gZIPInputStream = new GZIPInputStream(inputStream2);
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            a2 = a(gZIPInputStream);
                            com.apm.insight.l.k.a(gZIPInputStream);
                        } catch (Throwable th4) {
                            th = th4;
                            gZIPInputStream2 = gZIPInputStream;
                            com.apm.insight.l.k.a(gZIPInputStream2);
                            throw th;
                        }
                    } else {
                        a2 = a(inputStream2);
                    }
                    l c = c(a2);
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused3) {
                        }
                    }
                    com.apm.insight.l.k.a(inputStream2);
                    return c;
                } catch (Throwable th5) {
                    httpURLConnection = httpURLConnection2;
                    inputStream = inputStream2;
                    th = th5;
                    try {
                        q.a(th);
                        return new l(207, th);
                    } finally {
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused4) {
                            }
                        }
                        com.apm.insight.l.k.a(inputStream);
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                httpURLConnection = httpURLConnection2;
                inputStream = null;
            }
        } catch (Throwable th7) {
            th = th7;
            inputStream = null;
        }
    }

    public static boolean b() {
        return true;
    }

    private static byte[] b(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                q.b(th);
                gZIPOutputStream.close();
                return null;
            } catch (Throwable th2) {
                gZIPOutputStream.close();
                throw th2;
            }
        }
    }

    private static l c(byte[] bArr) {
        return new l(204, bArr);
    }

    public static String c() {
        return com.apm.insight.i.i().getJavaCrashUploadUrl();
    }

    private static String c(String str, String str2) {
        StringBuilder append;
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    append = new StringBuilder().append(str).append("?");
                    str = append.toString();
                }
                return str + str2;
            }
            if (!str.endsWith("&")) {
                append = new StringBuilder().append(str).append("&");
                str = append.toString();
            }
            return str + str2;
        } catch (Throwable unused) {
            return str;
        }
        return str;
    }

    public static String d() {
        return com.apm.insight.i.i().getAlogUploadUrl();
    }

    private static String d(String str, String str2) {
        if (str2 == null) {
            str2 = Key.STRING_CHARSET_NAME;
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String e() {
        return com.apm.insight.i.i().getLaunchCrashUploadUrl();
    }

    public static String f() {
        return com.apm.insight.i.i().getExceptionUploadUrl();
    }

    public static String g() {
        return com.apm.insight.i.i().getNativeCrashUploadUrl();
    }
}
