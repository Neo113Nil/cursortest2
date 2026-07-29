package com.aiming.mdt.a;

import android.os.Build;
import com.aiming.mdt.a.C0172;
import com.aiming.mdt.utils.C0282;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* renamed from: com.aiming.mdt.a.ʻʼʽʾˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0032 extends AbstractC0117 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private HttpURLConnection f31;

    @Override // com.aiming.mdt.a.AbstractC0117
    /* renamed from: ʼ, reason: contains not printable characters */
    public final URLConnection mo50(C0172 c0172) {
        String m649 = c0172.m649();
        StringBuilder sb = new StringBuilder("url is : ");
        sb.append(m649);
        C0282.m973("HttpConnection", sb.toString());
        this.f31 = (HttpURLConnection) new URL(m649).openConnection();
        this.f31.setConnectTimeout(c0172.m652());
        this.f31.setReadTimeout(c0172.m648());
        this.f31.setInstanceFollowRedirects(c0172.m646());
        C0172.EnumC0173 m644 = c0172.m644();
        this.f31.setRequestMethod(m644.toString());
        this.f31.setDoInput(true);
        this.f31.setDoOutput(m436(m644));
        C0110 m642 = c0172.m642();
        if (m642 != null) {
            List<String> m413 = m642.m413("Connection");
            if (Build.VERSION.SDK_INT > 19 && m413 != null && !m413.isEmpty()) {
                m642.m415("Connection", m413.get(0));
            }
            for (Map.Entry<String, String> entry : C0110.m406(m642).entrySet()) {
                this.f31.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        this.f31.connect();
        return this.f31;
    }

    @Override // com.aiming.mdt.a.AbstractC0117
    /* renamed from: ʼ, reason: contains not printable characters */
    public final void mo51() {
        if (this.f31 != null) {
            InputStream inputStream = this.f31.getInputStream();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e) {
                    C0282.m972("IOUtil", e);
                    C0076.m232().m236(e);
                }
            }
            this.f31.disconnect();
        }
    }

    @Override // com.aiming.mdt.a.AbstractC0117
    /* renamed from: ʽ, reason: contains not printable characters */
    final int mo52() {
        return this.f31.getResponseCode();
    }
}
