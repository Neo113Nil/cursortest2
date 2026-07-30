package com.baidu.platform.comapi.walknavi.g.i.h.e;

import com.baidu.platform.comapi.walknavi.g.i.h.e.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public class b {
    public static boolean a(String str, File file, c.InterfaceC0126c interfaceC0126c) {
        InputStream inputStream;
        InputStream inputStream2;
        HttpURLConnection httpURLConnection = null;
        r0 = null;
        InputStream inputStream3 = null;
        HttpURLConnection httpURLConnection2 = null;
        try {
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(str).openConnection();
            try {
                inputStream3 = httpURLConnection3.getInputStream();
                c.a(inputStream3, file, httpURLConnection3.getContentLength(), interfaceC0126c);
                c.a(inputStream3);
                a(httpURLConnection3);
                return true;
            } catch (IOException unused) {
                InputStream inputStream4 = inputStream3;
                httpURLConnection2 = httpURLConnection3;
                inputStream2 = inputStream4;
                c.a(inputStream2);
                a(httpURLConnection2);
                return false;
            } catch (Throwable th) {
                th = th;
                InputStream inputStream5 = inputStream3;
                httpURLConnection = httpURLConnection3;
                inputStream = inputStream5;
                c.a(inputStream);
                a(httpURLConnection);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream2 = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    private static void a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
