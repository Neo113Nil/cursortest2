package com.cmplay.b;

import android.text.TextUtils;
import com.aiming.mdt.utils.Constants;
import com.cmplay.b.h;
import com.dancingbogo.skyrolline.GameApp;
import com.dancingbogo.skyrolline.util.l;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: HttpUtil.java */
/* loaded from: classes.dex */
public class c {

    /* compiled from: HttpUtil.java */
    public interface a {
        void a(boolean z);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.cmplay.b.c$1] */
    public static void a(String str, final String str2, final a aVar) {
        String b2 = b("http://p2.cmcm.com/shares/" + e.b() + "/event_banner");
        if (!TextUtils.isEmpty(str)) {
            b2 = b2 + "&eventName=" + str;
        }
        final String a2 = a(h.a.PUT, b2);
        com.dancingbogo.skyrolline.b.d.a("key_screenshot_url", "");
        new Thread() { // from class: com.cmplay.b.c.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                String a3 = c.a(a2, str2);
                if (TextUtils.isEmpty(a3)) {
                    aVar.a(false);
                    return;
                }
                try {
                    String string = new JSONObject(a3).getJSONObject("data").getString("image_url");
                    com.dancingbogo.skyrolline.b.d.a("key_screenshot_url", string);
                    if (!TextUtils.isEmpty(string)) {
                        aVar.a(true);
                    } else {
                        aVar.a(false);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    private static String a(h.a aVar, String str) {
        String a2 = h.a(aVar, str);
        try {
            if (new URL(str).getQuery() == null) {
                return str + "?sig=" + a2;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return str + "&sig=" + a2;
    }

    public static String a() {
        String b2 = com.dancingbogo.skyrolline.b.d.b("key_language_selected", "en");
        String b3 = com.dancingbogo.skyrolline.b.d.b("key_country_selected", "");
        StringBuilder sb = new StringBuilder();
        sb.append(b2);
        if (!TextUtils.isEmpty(b3)) {
            sb.append("-");
            sb.append(b3);
        }
        return sb.toString();
    }

    private static String b(String str) {
        return str + "?_plat=android&_cv=" + com.dancingbogo.skyrolline.util.d.a(GameApp.f4485a, GameApp.f4485a.getPackageName()) + "&_network=" + l.a(GameApp.f4485a) + "&_lang=" + a();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[LOOP:0: B:6:0x001c->B:51:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(String str, String str2) {
        HttpURLConnection httpURLConnection;
        String str3;
        String str4;
        String str5;
        int i;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        String str6 = "";
        long j = 0;
        String str7 = "";
        int i2 = 0;
        String str8 = str;
        HttpURLConnection httpURLConnection2 = null;
        while (true) {
            try {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        httpURLConnection = (HttpURLConnection) new URL(str8).openConnection();
                        try {
                            try {
                                a(httpURLConnection, h.a.PUT, "7d51e5840296");
                                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    dataOutputStream.write(str2.getBytes("UTF-8"));
                                    dataOutputStream.flush();
                                    InputStream inputStream = httpURLConnection.getInputStream();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    int i3 = 1024;
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int read = inputStream.read(bArr, 0, i3);
                                        if (read == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, read);
                                        i3 = 1024;
                                    }
                                    dataOutputStream.close();
                                    inputStream.close();
                                    str5 = byteArrayOutputStream.toString();
                                } catch (Exception e) {
                                    e = e;
                                }
                                try {
                                    int responseCode = httpURLConnection.getResponseCode();
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    str3 = str6;
                                    str4 = str8;
                                    i = responseCode;
                                    j = currentTimeMillis;
                                } catch (Exception e2) {
                                    e = e2;
                                    str7 = str5;
                                    httpURLConnection2 = httpURLConnection;
                                    j = currentTimeMillis;
                                    e.printStackTrace();
                                    str6 = e.getMessage();
                                    i2++;
                                    if (i2 < 3) {
                                        try {
                                            Thread.sleep(1000L);
                                        } catch (InterruptedException unused) {
                                        }
                                        if (a(str6)) {
                                            str8 = c(str8);
                                        }
                                        if (httpURLConnection2 == null) {
                                            if (i2 < 3) {
                                                str3 = str6;
                                                str4 = str8;
                                                str5 = str7;
                                                i = 0;
                                                break;
                                            }
                                        }
                                        httpURLConnection2.disconnect();
                                        httpURLConnection2 = null;
                                        if (i2 < 3) {
                                        }
                                    } else {
                                        if (httpURLConnection2 == null) {
                                            if (i2 < 3) {
                                            }
                                        }
                                        httpURLConnection2.disconnect();
                                        httpURLConnection2 = null;
                                        if (i2 < 3) {
                                        }
                                    }
                                    g.a().a(i, str3, str4, System.currentTimeMillis() - j);
                                    return str5;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                    } catch (Exception e4) {
                        e = e4;
                    }
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
            }
        }
        g.a().a(i, str3, str4, System.currentTimeMillis() - j);
        return str5;
    }

    private static String b() {
        com.cmplay.kinfoc.report.a e = com.cmplay.kinfoc.report.c.e(GameApp.f4485a);
        return String.format("mt=%s;os=%s;cv=%s", e.t, String.valueOf(e.D), e.f4400b);
    }

    private static void a(HttpURLConnection httpURLConnection, h.a aVar, String str) throws ProtocolException {
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod(aVar.a());
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty(Constants.KEY_CONTENT_TYPE, "multipart/form-data; boundary=" + str);
        httpURLConnection.setRequestProperty("User-Agent", b());
        Locale locale = Locale.getDefault();
        String country = locale.getCountry();
        String language = locale.getLanguage();
        httpURLConnection.setRequestProperty("Accept-Language", String.format("%s-%s,%s;q=0.8", language, country, language));
        httpURLConnection.setRequestProperty(Constants.KEY_CONTENT_TYPE, "application/json");
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && str.contains("Unable to resolve host") && str.contains("p2.cmcm.com");
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.replace("p2.cmcm.com", e.f3921a);
    }
}
