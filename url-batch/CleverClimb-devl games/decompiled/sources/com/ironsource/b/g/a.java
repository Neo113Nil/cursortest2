package com.ironsource.b.g;

import android.text.TextUtils;
import com.ironsource.b.m;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: HttpFunctions.java */
/* loaded from: classes2.dex */
public class a {
    public static String a(String str) throws Exception {
        return a(str, null);
    }

    public static String a(String str, m.a aVar) throws Exception {
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 400) {
                    if (aVar != null) {
                        aVar.a("Bad Request - 400");
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                }
                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    String sb2 = sb.toString();
                    if (TextUtils.isEmpty(sb2)) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        bufferedReader.close();
                        return null;
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    bufferedReader.close();
                    return sb2;
                } catch (Exception unused) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    return null;
                } catch (Throwable th) {
                    bufferedReader2 = bufferedReader;
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused3) {
            httpURLConnection = null;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
    }
}
