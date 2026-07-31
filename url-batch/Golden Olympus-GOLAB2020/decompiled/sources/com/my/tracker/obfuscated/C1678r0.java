package com.my.tracker.obfuscated;

import android.net.TrafficStats;
import com.ironsource.jn;
import com.my.tracker.obfuscated.AbstractC1686t0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.my.tracker.obfuscated.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1678r0 extends AbstractC1686t0 {
    C1678r0() {
    }

    @Override // com.my.tracker.obfuscated.AbstractC1686t0
    public AbstractC1686t0.b a(String str) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        AbstractC1686t0.b d4 = AbstractC1686t0.b.d();
        BufferedReader bufferedReader = null;
        try {
            AbstractC1708y2.a("HttpGetRequest: send request to " + str);
            TrafficStats.setThreadStatsTag(27498374);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setConnectTimeout(3000);
            httpURLConnection.setReadTimeout(3000);
            httpURLConnection.setRequestMethod(jn.f16864a);
            int responseCode = httpURLConnection.getResponseCode();
            AbstractC1708y2.a("HttpGetRequest: response received with response code: " + responseCode);
            d4.f21529a = responseCode == 200;
            try {
                AbstractC1708y2.a("HttpGetRequest: processing server response");
                BufferedReader bufferedReader2 = d4.f21529a ? new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())) : new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                if (sb.length() > 0) {
                    d4.f21530b = sb.toString();
                } else {
                    AbstractC1708y2.a("HttpGetRequest: response data is empty");
                }
                bufferedReader2.close();
                httpURLConnection.disconnect();
                return d4;
            } catch (Throwable th3) {
                if (0 != 0) {
                    bufferedReader.close();
                }
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            try {
                AbstractC1708y2.a("HttpGetRequest: error", th);
                d4.f21529a = false;
                d4.f21531c = "HttpGetRequest: error while sending data";
                return d4;
            } finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
    }
}
