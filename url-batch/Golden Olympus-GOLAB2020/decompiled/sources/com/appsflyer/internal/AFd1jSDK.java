package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.ironsource.b9;
import com.ironsource.cc;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFd1jSDK {
    private final int getRevenue;

    public AFd1jSDK(int i4) {
        this.getRevenue = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String getMediationNetwork(HttpURLConnection httpURLConnection) {
        Throwable th;
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (Exception e4) {
                errorStream = httpURLConnection.getErrorStream();
                AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, e4.getMessage() != null ? e4.getMessage() : "", e4, false, false, false, false);
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z4 = true;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            String obj = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return obj;
                        }
                        if (!z4) {
                            sb.append('\n');
                        }
                        sb.append(readLine);
                        z4 = false;
                    } catch (Throwable th2) {
                        bufferedReader = bufferedReader2;
                        th = th2;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            throw th;
                        }
                        bufferedReader.close();
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            if (inputStreamReader != null) {
            }
            if (bufferedReader != null) {
            }
        }
    }

    public final AFd1aSDK<String> getMonetizationNetwork(AFd1cSDK aFd1cSDK) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] revenue = aFd1cSDK.getRevenue();
            StringBuilder sb = new StringBuilder();
            sb.append(aFd1cSDK.getRevenue);
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(aFd1cSDK.getMonetizationNetwork);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            byte[] revenue2 = aFd1cSDK.getRevenue();
            if (aFd1cSDK.getCurrencyIso4217Code() && revenue2 != null) {
                try {
                    String str = aFd1cSDK.AFAdRevenueData() ? "<encrypted>" : new String(revenue2, Charset.defaultCharset());
                    sb2.append("\n payload: ");
                    sb2.append(str);
                } catch (Throwable th2) {
                    httpURLConnection = null;
                    th = th2;
                    try {
                        AFd1hSDK aFd1hSDK = new AFd1hSDK(System.currentTimeMillis() - currentTimeMillis);
                        StringBuilder sb3 = new StringBuilder("error: ");
                        sb3.append(th);
                        sb3.append("\n took ");
                        sb3.append(aFd1hSDK.getRevenue);
                        sb3.append("ms");
                        String obj = sb3.toString();
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
                        StringBuilder sb4 = new StringBuilder(b9.i.f15550d);
                        sb4.append(aFd1cSDK.hashCode());
                        sb4.append("] ");
                        sb4.append(obj);
                        aFLogger.e(aFg1cSDK, sb4.toString(), th, false, false, false);
                        throw new HttpException(th, aFd1hSDK);
                    } catch (Throwable th3) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th3;
                    }
                }
            }
            for (Map.Entry<String, String> entry : aFd1cSDK.AFAdRevenueData.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
            StringBuilder sb5 = new StringBuilder(b9.i.f15550d);
            sb5.append(aFd1cSDK.hashCode());
            sb5.append("] ");
            sb5.append((Object) sb2);
            AFLogger.INSTANCE.d(AFg1cSDK.HTTP_CLIENT, sb5.toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(aFd1cSDK.getMonetizationNetwork).openConnection();
            try {
                httpURLConnection2.setRequestMethod(aFd1cSDK.getRevenue);
                if (aFd1cSDK.getMonetizationNetwork()) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFd1cSDK.component3()) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
                try {
                    int i4 = this.getRevenue;
                    int i5 = aFd1cSDK.component4;
                    if (i5 != -1) {
                        i4 = i5;
                    }
                    httpURLConnection2.setConnectTimeout(i4);
                    httpURLConnection2.setReadTimeout(i4);
                    httpURLConnection2.addRequestProperty(cc.f15718K, aFd1cSDK.AFAdRevenueData() ? "application/octet-stream" : cc.f15719L);
                    for (Map.Entry<String, String> entry2 : aFd1cSDK.AFAdRevenueData.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    if (revenue != null) {
                        httpURLConnection2.setDoOutput(true);
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(revenue.length);
                        httpURLConnection2.setRequestProperty("Content-Length", sb6.toString());
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                            try {
                                bufferedOutputStream2.write(revenue);
                                bufferedOutputStream2.close();
                            } catch (Throwable th4) {
                                th = th4;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedOutputStream = null;
                        }
                    }
                    boolean z4 = httpURLConnection2.getResponseCode() / 100 == 2;
                    String mediationNetwork = aFd1cSDK.getMediationNetwork() ? getMediationNetwork(httpURLConnection2) : "";
                    AFd1hSDK aFd1hSDK2 = new AFd1hSDK(System.currentTimeMillis() - currentTimeMillis);
                    StringBuilder sb7 = new StringBuilder("response code:");
                    sb7.append(httpURLConnection2.getResponseCode());
                    sb7.append(" ");
                    sb7.append(httpURLConnection2.getResponseMessage());
                    sb7.append("\n body:");
                    sb7.append(mediationNetwork);
                    sb7.append("\n took ");
                    sb7.append(aFd1hSDK2.getRevenue);
                    sb7.append("ms");
                    String obj2 = sb7.toString();
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.HTTP_CLIENT;
                    StringBuilder sb8 = new StringBuilder(b9.i.f15550d);
                    sb8.append(aFd1cSDK.hashCode());
                    sb8.append("] ");
                    sb8.append(obj2);
                    aFLogger2.d(aFg1cSDK2, sb8.toString());
                    HashMap hashMap = new HashMap(httpURLConnection2.getHeaderFields());
                    hashMap.remove(null);
                    AFd1aSDK<String> aFd1aSDK = new AFd1aSDK<>(mediationNetwork, httpURLConnection2.getResponseCode(), z4, hashMap, aFd1hSDK2);
                    httpURLConnection2.disconnect();
                    return aFd1aSDK;
                } catch (Throwable th6) {
                    th = th6;
                    th = th;
                    httpURLConnection = httpURLConnection2;
                    AFd1hSDK aFd1hSDK3 = new AFd1hSDK(System.currentTimeMillis() - currentTimeMillis);
                    StringBuilder sb32 = new StringBuilder("error: ");
                    sb32.append(th);
                    sb32.append("\n took ");
                    sb32.append(aFd1hSDK3.getRevenue);
                    sb32.append("ms");
                    String obj3 = sb32.toString();
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK3 = AFg1cSDK.HTTP_CLIENT;
                    StringBuilder sb42 = new StringBuilder(b9.i.f15550d);
                    sb42.append(aFd1cSDK.hashCode());
                    sb42.append("] ");
                    sb42.append(obj3);
                    aFLogger3.e(aFg1cSDK3, sb42.toString(), th, false, false, false);
                    throw new HttpException(th, aFd1hSDK3);
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
        }
    }
}
