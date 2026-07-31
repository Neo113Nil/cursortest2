package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class oo0 implements ao0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f9754a;

    public oo0() {
        this.f9754a = null;
    }

    public oo0(String str) {
        this.f9754a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.ao0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(String str) {
        try {
            try {
                if (v3.c.a()) {
                    TrafficStats.setThreadStatsTag(263);
                }
                String valueOf = String.valueOf(str);
                io0.b(valueOf.length() != 0 ? "Pinging URL: ".concat(valueOf) : new String("Pinging URL: "));
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    qw.b();
                    String str2 = this.f9754a;
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setReadTimeout(60000);
                    if (str2 != null) {
                        httpURLConnection.setRequestProperty("User-Agent", str2);
                    }
                    httpURLConnection.setUseCaches(false);
                    ho0 ho0Var = new ho0(null);
                    ho0Var.c(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    ho0Var.e(httpURLConnection, responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                        sb.append("Received non-success response code ");
                        sb.append(responseCode);
                        sb.append(" from pinging URL: ");
                        sb.append(str);
                        io0.g(sb.toString());
                    }
                    if (v3.c.a()) {
                        TrafficStats.clearThreadStatsTag();
                    }
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e7) {
                e = e7;
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
                sb2.append("Error while pinging URL: ");
                sb2.append(str);
                sb2.append(". ");
                sb2.append(message);
                io0.g(sb2.toString());
                if (v3.c.a()) {
                    return;
                }
                TrafficStats.clearThreadStatsTag();
            } catch (IndexOutOfBoundsException e8) {
                String message2 = e8.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
                sb3.append("Error while parsing ping URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message2);
                io0.g(sb3.toString());
                if (v3.c.a()) {
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (RuntimeException e9) {
                e = e9;
                String message3 = e.getMessage();
                StringBuilder sb22 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
                sb22.append("Error while pinging URL: ");
                sb22.append(str);
                sb22.append(". ");
                sb22.append(message3);
                io0.g(sb22.toString());
                if (v3.c.a()) {
                }
            }
        } catch (Throwable th) {
            if (v3.c.a()) {
                TrafficStats.clearThreadStatsTag();
            }
            throw th;
        }
    }
}
