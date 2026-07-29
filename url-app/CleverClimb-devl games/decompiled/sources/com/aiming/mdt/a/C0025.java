package com.aiming.mdt.a;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* renamed from: com.aiming.mdt.a.ʻʼʽʾʿˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0025 extends AbstractC0093 {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static int f14 = 130;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private static int f15 = 1;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private static int f16;

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean f17 = true;

    /* renamed from: ʻ, reason: contains not printable characters */
    private static String m18(int i, String str, int i2, int i3, boolean z) {
        char[] cArr;
        int i4;
        int i5 = f15 + 121;
        f16 = i5 % 128;
        if (!(i5 % 2 == 0)) {
            Object obj = null;
            super.hashCode();
        }
        char[] charArray = str.toCharArray();
        char[] cArr2 = new char[i2];
        int i6 = 0;
        while (true) {
            if ((i6 < i2 ? 'H' : ']') == ']') {
                break;
            }
            cArr2[i6] = (char) (charArray[i6] + i);
            cArr2[i6] = (char) (cArr2[i6] - f14);
            i6++;
        }
        if (i3 > 0) {
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            int i7 = i2 - i3;
            System.arraycopy(cArr3, 0, cArr2, i7, i3);
            System.arraycopy(cArr3, i3, cArr2, 0, i7);
        }
        if (z) {
            int i8 = f16 + 13;
            f15 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr = new char[i2];
                i4 = 1;
            } else {
                cArr = new char[i2];
                i4 = 0;
            }
            while (i4 < i2) {
                int i9 = f16 + 65;
                f15 = i9 % 128;
                if (!(i9 % 2 == 0)) {
                    cArr[i4] = cArr2[(i2 - i4) - 1];
                    i4++;
                } else {
                    cArr[i4] = cArr2[(i2 % i4) % 0];
                    i4 += 3;
                }
            }
        } else {
            cArr = cArr2;
        }
        return new String(cArr);
    }

    @Override // com.aiming.mdt.a.AbstractC0093
    /* renamed from: ʻʼ, reason: contains not printable characters */
    final C0090 mo19() {
        InputStream errorStream;
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) this.f274;
        this.f273.m329(httpsURLConnection.getResponseCode());
        this.f273.m337(httpsURLConnection.getResponseMessage());
        try {
            errorStream = httpsURLConnection.getInputStream();
        } catch (IOException unused) {
            errorStream = httpsURLConnection.getErrorStream();
        }
        if ((errorStream != null ? '4' : 'B') == '4') {
            int i = f16 + 89;
            f15 = i % 128;
            int i2 = i % 2;
            this.f273.m335(httpsURLConnection.getContentType());
            int contentLength = httpsURLConnection.getContentLength();
            this.f273.m326(contentLength);
            this.f273.m331(m359(errorStream, contentLength));
        }
        httpsURLConnection.disconnect();
        C0090 c0090 = this.f273;
        int i3 = f15 + 119;
        f16 = i3 % 128;
        if ((i3 % 2 != 0 ? 'H' : 'c') != 'H') {
            return c0090;
        }
        Object obj = null;
        super.hashCode();
        return c0090;
    }

    @Override // com.aiming.mdt.a.AbstractC0093
    /* renamed from: ʻʽ, reason: contains not printable characters */
    final void mo20(C0145 c0145) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) this.f274;
        if ((!TextUtils.isEmpty(this.f271) ? '0' : (char) 22) != 22) {
            int i = f16 + 11;
            f15 = i % 128;
            int i2 = i % 2;
            httpsURLConnection.setRequestMethod(this.f271);
            int i3 = f15 + 37;
            f16 = i3 % 128;
            if (i3 % 2 != 0) {
            }
        }
        httpsURLConnection.setInstanceFollowRedirects(c0145.m559());
        if ((this.f17 ? 'B' : '&') != '&') {
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) this.f274;
            if (httpsURLConnection2.getURL().getHost().endsWith(m18(226, "\u0004\u0001ￎ\r\u000f\u0003ￎ\u0007\u000e\t\r\t\u0014", 13, 3, true).intern())) {
                TrustManager[] trustManagerArr = {new C0024()};
                SSLContext sSLContext = SSLContext.getInstance(m18(202, "\u0004\u000b.￩￦￪\f", 7, 6, false).intern());
                sSLContext.init(null, trustManagerArr, new SecureRandom());
                httpsURLConnection2.setSSLSocketFactory(sSLContext.getSocketFactory());
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final C0025 m21() {
        int i = f16 + 21;
        f15 = i % 128;
        int i2 = i % 2;
        this.f17 = false;
        int i3 = f15 + 89;
        f16 = i3 % 128;
        if (i3 % 2 != 0) {
        }
        return this;
    }
}
