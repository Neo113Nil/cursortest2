package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFd1gSDK {
    private final int getRevenue;

    public AFd1gSDK(int i3) {
        this.getRevenue = i3;
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
            } catch (Exception e2) {
                errorStream = httpURLConnection.getErrorStream();
                AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, e2.getMessage() != null ? e2.getMessage() : "", e2, false, false, false, false);
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z10 = true;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            String obj = sb2.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return obj;
                        }
                        if (!z10) {
                            sb2.append('\n');
                        }
                        sb2.append(readLine);
                        z10 = false;
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

    public final AFe1wSDK<String> getCurrencyIso4217Code(AFd1bSDK aFd1bSDK) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] revenue = aFd1bSDK.getRevenue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aFd1bSDK.getMonetizationNetwork);
            sb2.append(":");
            sb2.append(aFd1bSDK.getMediationNetwork);
            StringBuilder sb3 = new StringBuilder(sb2.toString());
            byte[] revenue2 = aFd1bSDK.getRevenue();
            if (aFd1bSDK.getMonetizationNetwork() && revenue2 != null) {
                try {
                    String str = aFd1bSDK.getMediationNetwork() ? "<encrypted>" : new String(revenue2, Charset.defaultCharset());
                    sb3.append("\n payload: ");
                    sb3.append(str);
                } catch (Throwable th2) {
                    httpURLConnection = null;
                    th = th2;
                    try {
                        AFd1aSDK aFd1aSDK = new AFd1aSDK(System.currentTimeMillis() - currentTimeMillis);
                        StringBuilder sb4 = new StringBuilder("error: ");
                        sb4.append(th);
                        sb4.append("\n took ");
                        sb4.append(aFd1aSDK.getMediationNetwork);
                        sb4.append("ms");
                        String obj = sb4.toString();
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
                        StringBuilder sb5 = new StringBuilder("[");
                        sb5.append(aFd1bSDK.hashCode());
                        sb5.append("] ");
                        sb5.append(obj);
                        aFLogger.e(aFg1cSDK, sb5.toString(), th, false, false, false);
                        throw new HttpException(th, aFd1aSDK);
                    } catch (Throwable th3) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th3;
                    }
                }
            }
            for (Map.Entry<String, String> entry : aFd1bSDK.AFAdRevenueData.entrySet()) {
                sb3.append("\n ");
                sb3.append(entry.getKey());
                sb3.append(": ");
                sb3.append(entry.getValue());
            }
            StringBuilder sb6 = new StringBuilder("[");
            sb6.append(aFd1bSDK.hashCode());
            sb6.append("] ");
            sb6.append((Object) sb3);
            AFLogger.INSTANCE.d(AFg1cSDK.HTTP_CLIENT, sb6.toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(aFd1bSDK.getMediationNetwork).openConnection();
            try {
                httpURLConnection2.setRequestMethod(aFd1bSDK.getMonetizationNetwork);
                if (aFd1bSDK.getCurrencyIso4217Code()) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFd1bSDK.component1()) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
                try {
                    int i3 = this.getRevenue;
                    int i10 = aFd1bSDK.component4;
                    if (i10 != -1) {
                        i3 = i10;
                    }
                    httpURLConnection2.setConnectTimeout(i3);
                    httpURLConnection2.setReadTimeout(i3);
                    httpURLConnection2.addRequestProperty("Content-Type", aFd1bSDK.getMediationNetwork() ? "application/octet-stream" : "application/json");
                    for (Map.Entry<String, String> entry2 : aFd1bSDK.AFAdRevenueData.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    if (revenue != null) {
                        httpURLConnection2.setDoOutput(true);
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(revenue.length);
                        httpURLConnection2.setRequestProperty("Content-Length", sb7.toString());
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
                    boolean z10 = httpURLConnection2.getResponseCode() / 100 == 2;
                    String mediationNetwork = aFd1bSDK.AFAdRevenueData() ? getMediationNetwork(httpURLConnection2) : "";
                    AFd1aSDK aFd1aSDK2 = new AFd1aSDK(System.currentTimeMillis() - currentTimeMillis);
                    StringBuilder sb8 = new StringBuilder("response code:");
                    sb8.append(httpURLConnection2.getResponseCode());
                    sb8.append(" ");
                    sb8.append(httpURLConnection2.getResponseMessage());
                    sb8.append("\n body:");
                    sb8.append(mediationNetwork);
                    sb8.append("\n took ");
                    sb8.append(aFd1aSDK2.getMediationNetwork);
                    sb8.append("ms");
                    String obj2 = sb8.toString();
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.HTTP_CLIENT;
                    StringBuilder sb9 = new StringBuilder("[");
                    sb9.append(aFd1bSDK.hashCode());
                    sb9.append("] ");
                    sb9.append(obj2);
                    aFLogger2.d(aFg1cSDK2, sb9.toString());
                    HashMap hashMap = new HashMap(httpURLConnection2.getHeaderFields());
                    hashMap.remove(null);
                    AFe1wSDK<String> aFe1wSDK = new AFe1wSDK<>(mediationNetwork, httpURLConnection2.getResponseCode(), z10, hashMap, aFd1aSDK2);
                    httpURLConnection2.disconnect();
                    return aFe1wSDK;
                } catch (Throwable th6) {
                    th = th6;
                    th = th;
                    httpURLConnection = httpURLConnection2;
                    AFd1aSDK aFd1aSDK3 = new AFd1aSDK(System.currentTimeMillis() - currentTimeMillis);
                    StringBuilder sb42 = new StringBuilder("error: ");
                    sb42.append(th);
                    sb42.append("\n took ");
                    sb42.append(aFd1aSDK3.getMediationNetwork);
                    sb42.append("ms");
                    String obj3 = sb42.toString();
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK3 = AFg1cSDK.HTTP_CLIENT;
                    StringBuilder sb52 = new StringBuilder("[");
                    sb52.append(aFd1bSDK.hashCode());
                    sb52.append("] ");
                    sb52.append(obj3);
                    aFLogger3.e(aFg1cSDK3, sb52.toString(), th, false, false, false);
                    throw new HttpException(th, aFd1aSDK3);
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
