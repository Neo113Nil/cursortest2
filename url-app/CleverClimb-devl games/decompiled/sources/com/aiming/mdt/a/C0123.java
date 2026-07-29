package com.aiming.mdt.a;

import android.os.Build;
import com.aiming.mdt.a.C0172;
import com.aiming.mdt.utils.C0282;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* renamed from: com.aiming.mdt.a.ʼʽʿˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0123 extends AbstractC0117 {

    /* renamed from: ʼ, reason: contains not printable characters */
    private HttpsURLConnection f373;

    @Override // com.aiming.mdt.a.AbstractC0117
    /* renamed from: ʼ */
    public final URLConnection mo50(C0172 c0172) {
        String m649 = c0172.m649();
        StringBuilder sb = new StringBuilder("url is : ");
        sb.append(m649);
        C0282.m973("HttpsConnection", sb.toString());
        this.f373 = (HttpsURLConnection) new URL(m649).openConnection();
        this.f373.setConnectTimeout(c0172.m652());
        this.f373.setReadTimeout(c0172.m648());
        this.f373.setInstanceFollowRedirects(c0172.m646());
        C0172.EnumC0173 m644 = c0172.m644();
        this.f373.setRequestMethod(m644.toString());
        this.f373.setDoInput(true);
        this.f373.setDoOutput(m436(m644));
        C0110 m642 = c0172.m642();
        if (m642 != null) {
            List<String> m413 = m642.m413("Connection");
            if (Build.VERSION.SDK_INT > 19 && m413 != null && !m413.isEmpty()) {
                m642.m415("Connection", m413.get(0));
            }
            for (Map.Entry<String, String> entry : C0110.m406(m642).entrySet()) {
                this.f373.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        if (c0172.m650()) {
            TrustManager[] trustManagerArr = {new C0191()};
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            this.f373.setSSLSocketFactory(sSLContext.getSocketFactory());
        }
        if (Build.VERSION.SDK_INT < 21) {
            this.f373.setSSLSocketFactory(new C0073());
        }
        this.f373.connect();
        return this.f373;
    }

    @Override // com.aiming.mdt.a.AbstractC0117
    /* renamed from: ʼ */
    public final void mo51() {
        if (this.f373 != null) {
            InputStream inputStream = this.f373.getInputStream();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e) {
                    C0282.m972("IOUtil", e);
                    C0076.m232().m236(e);
                }
            }
            this.f373.disconnect();
        }
    }

    @Override // com.aiming.mdt.a.AbstractC0117
    /* renamed from: ʽ */
    final int mo52() {
        return this.f373.getResponseCode();
    }
}
