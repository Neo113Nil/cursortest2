package com.aiming.mdt.a;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: com.aiming.mdt.a.ʾˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0182 extends AbstractC0093 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int f631 = 1;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static int f632;

    @Override // com.aiming.mdt.a.AbstractC0093
    /* renamed from: ʻʼ */
    final C0090 mo19() {
        InputStream errorStream;
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f274;
        this.f273.m329(httpURLConnection.getResponseCode());
        this.f273.m337(httpURLConnection.getResponseMessage());
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        if ((errorStream != null ? '_' : 'C') == '_') {
            int i = f632 + 39;
            f631 = i % 128;
            int i2 = i % 2;
            this.f273.m335(httpURLConnection.getContentType());
            int contentLength = httpURLConnection.getContentLength();
            this.f273.m326(contentLength);
            this.f273.m331(m359(errorStream, contentLength));
            int i3 = f631 + 77;
            f632 = i3 % 128;
            if (i3 % 2 != 0) {
            }
        }
        httpURLConnection.disconnect();
        return this.f273;
    }

    @Override // com.aiming.mdt.a.AbstractC0093
    /* renamed from: ʻʽ */
    final void mo20(C0145 c0145) {
        int i = f631 + 67;
        f632 = i % 128;
        int i2 = i % 2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f274;
        if (!TextUtils.isEmpty(this.f271)) {
            httpURLConnection.setRequestMethod(this.f271);
        }
        httpURLConnection.setInstanceFollowRedirects(c0145.m559());
        int i3 = f631 + 87;
        f632 = i3 % 128;
        if (i3 % 2 != 0) {
        }
    }
}
