package com.moat.analytics.mobile.tjy;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
enum ab implements aa {
    instance;

    private String a(InputStream inputStream) {
        char[] cArr = new char[256];
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        int i = 0;
        do {
            int read = inputStreamReader.read(cArr, 0, 256);
            if (read <= 0) {
                break;
            }
            i += read;
            sb.append(cArr, 0, read);
        } while (i < 1024);
        return sb.toString();
    }

    @Override // com.moat.analytics.mobile.tjy.aa
    public final com.moat.analytics.mobile.tjy.base.functional.a a(String str) {
        InputStream inputStream = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() >= 400) {
                    return com.moat.analytics.mobile.tjy.base.functional.a.a();
                }
                InputStream inputStream2 = httpURLConnection.getInputStream();
                try {
                    com.moat.analytics.mobile.tjy.base.functional.a a2 = com.moat.analytics.mobile.tjy.base.functional.a.a(a(inputStream2));
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException unused) {
                        }
                    }
                    return a2;
                } catch (IOException unused2) {
                    inputStream = inputStream2;
                    com.moat.analytics.mobile.tjy.base.functional.a a3 = com.moat.analytics.mobile.tjy.base.functional.a.a();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return a3;
                } catch (Throwable th) {
                    inputStream = inputStream2;
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused5) {
        }
    }
}
