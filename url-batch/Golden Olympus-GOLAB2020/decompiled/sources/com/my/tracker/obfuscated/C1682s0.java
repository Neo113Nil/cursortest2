package com.my.tracker.obfuscated;

import android.net.TrafficStats;
import com.ironsource.cc;
import com.ironsource.jn;
import com.my.tracker.obfuscated.AbstractC1686t0;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.my.tracker.obfuscated.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1682s0 extends AbstractC1686t0 {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC1686t0.a f21524a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f21525b;

    C1682s0(AbstractC1686t0.a aVar, boolean z4) {
        this.f21524a = aVar;
        this.f21525b = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:6:0x002f, B:20:0x009a, B:25:0x00aa, B:42:0x0103, B:48:0x010e, B:58:0x011a, B:52:0x00c4, B:57:0x0117), top: B:5:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[Catch: all -> 0x00c1, REMOVE, SYNTHETIC, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:6:0x002f, B:20:0x009a, B:25:0x00aa, B:42:0x0103, B:48:0x010e, B:58:0x011a, B:52:0x00c4, B:57:0x0117), top: B:5:0x002f }] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.FilterOutputStream] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.FilterOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.my.tracker.obfuscated.t0$a] */
    @Override // com.my.tracker.obfuscated.AbstractC1686t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC1686t0.b a(String str) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        ?? r5;
        String str2;
        GZIPOutputStream gZIPOutputStream;
        int responseCode;
        AbstractC1686t0.b d4 = AbstractC1686t0.b.d();
        BufferedReader bufferedReader = null;
        try {
            AbstractC1708y2.a("HttpPostRequest: send request to " + str);
            TrafficStats.setThreadStatsTag(27498374);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setRequestMethod(jn.f16865b);
                httpURLConnection.setRequestProperty("Connection", "close");
                httpURLConnection.setRequestProperty(cc.f15718K, this.f21524a.a());
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoOutput(true);
                if (this.f21525b) {
                    httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                    str2 = "HttpPostRequest: populating post request body using gzip";
                    gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(httpURLConnection.getOutputStream()));
                } else {
                    str2 = "HttpPostRequest: populating post request body without using gzip";
                    gZIPOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                }
                try {
                    AbstractC1708y2.a(str2);
                } catch (Throwable th2) {
                    th = th2;
                    r5 = gZIPOutputStream;
                    if (r5 == 0) {
                        r5.close();
                        throw th;
                    }
                }
                try {
                    this.f21524a.a(gZIPOutputStream);
                    if (this.f21525b) {
                        gZIPOutputStream.finish();
                    }
                    gZIPOutputStream.close();
                    responseCode = httpURLConnection.getResponseCode();
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = gZIPOutputStream;
                    r5 = bufferedReader;
                    if (r5 == 0) {
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                try {
                    AbstractC1708y2.a("HttpPostRequest error: error while sending data", th);
                    d4.f21529a = false;
                    d4.f21531c = "HttpPostRequest error: error while sending data";
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
        }
        if (responseCode != 200 && responseCode != 204) {
            AbstractC1708y2.a("HttpPostRequest error: response code " + responseCode);
            d4.f21529a = false;
            if (responseCode == 200) {
                AbstractC1708y2.a("HttpPostRequest: processing server response");
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                try {
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
                        AbstractC1708y2.a("HttpPostRequest: response data is empty");
                    }
                    bufferedReader2.close();
                } catch (Throwable th6) {
                    th = th6;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
            return d4;
        }
        AbstractC1708y2.a("HttpPostRequest: response successfully received");
        d4.f21529a = true;
        if (responseCode == 200) {
        }
        return d4;
    }
}
