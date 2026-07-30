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

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFd1jSDK {
    private final int getMediationNetwork;

    public AFd1jSDK(int i) {
        this.getMediationNetwork = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFAdRevenueData(HttpURLConnection httpURLConnection) {
        Throwable th;
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (Exception e) {
                errorStream = httpURLConnection.getErrorStream();
                AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, e.getMessage() != null ? e.getMessage() : "", e, false, false, false, false);
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z = true;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            String obj = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return obj;
                        }
                        if (!z) {
                            sb.append('\n');
                        }
                        sb.append(readLine);
                        z = false;
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

    public final AFe1ySDK<String> getMonetizationNetwork(AFd1cSDK aFd1cSDK) {
        Throwable th;
        byte[] mediationNetwork;
        HttpURLConnection httpURLConnection;
        long currentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection2 = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            mediationNetwork = aFd1cSDK.getMediationNetwork();
            StringBuilder sb = new StringBuilder();
            sb.append(aFd1cSDK.getMediationNetwork);
            sb.append(":");
            sb.append(aFd1cSDK.AFAdRevenueData);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            byte[] mediationNetwork2 = aFd1cSDK.getMediationNetwork();
            if (aFd1cSDK.getRevenue() && mediationNetwork2 != null) {
                String str = aFd1cSDK.getMonetizationNetwork() ? "<encrypted>" : new String(mediationNetwork2, Charset.defaultCharset());
                sb2.append("\n payload: ");
                sb2.append(str);
            }
            for (Map.Entry<String, String> entry : aFd1cSDK.getRevenue.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
            StringBuilder sb3 = new StringBuilder("[");
            sb3.append(aFd1cSDK.hashCode());
            sb3.append("] ");
            sb3.append((Object) sb2);
            AFLogger.INSTANCE.d(AFg1cSDK.HTTP_CLIENT, sb3.toString());
            httpURLConnection = (HttpURLConnection) new URL(aFd1cSDK.AFAdRevenueData).openConnection();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            httpURLConnection.setRequestMethod(aFd1cSDK.getMediationNetwork);
            if (aFd1cSDK.AFAdRevenueData()) {
                httpURLConnection.setUseCaches(false);
            }
            if (!aFd1cSDK.component3()) {
                httpURLConnection.setInstanceFollowRedirects(false);
            }
            int i = this.getMediationNetwork;
            int i2 = aFd1cSDK.areAllFieldsValid;
            if (i2 != -1) {
                i = i2;
            }
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.addRequestProperty("Content-Type", aFd1cSDK.getMonetizationNetwork() ? "application/octet-stream" : "application/json");
            for (Map.Entry<String, String> entry2 : aFd1cSDK.getRevenue.entrySet()) {
                httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
            }
            if (mediationNetwork != null) {
                httpURLConnection.setDoOutput(true);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(mediationNetwork.length);
                httpURLConnection.setRequestProperty("Content-Length", sb4.toString());
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    try {
                        bufferedOutputStream2.write(mediationNetwork);
                        bufferedOutputStream2.close();
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            boolean z = httpURLConnection.getResponseCode() / 100 == 2;
            String AFAdRevenueData = aFd1cSDK.getCurrencyIso4217Code() ? AFAdRevenueData(httpURLConnection) : "";
            AFd1dSDK aFd1dSDK = new AFd1dSDK(System.currentTimeMillis() - currentTimeMillis);
            StringBuilder sb5 = new StringBuilder("response code:");
            sb5.append(httpURLConnection.getResponseCode());
            sb5.append(" ");
            sb5.append(httpURLConnection.getResponseMessage());
            sb5.append("\n body:");
            sb5.append(AFAdRevenueData);
            sb5.append("\n took ");
            sb5.append(aFd1dSDK.AFAdRevenueData);
            sb5.append("ms");
            String obj = sb5.toString();
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
            StringBuilder sb6 = new StringBuilder("[");
            sb6.append(aFd1cSDK.hashCode());
            sb6.append("] ");
            sb6.append(obj);
            aFLogger.d(aFg1cSDK, sb6.toString());
            HashMap hashMap = new HashMap(httpURLConnection.getHeaderFields());
            hashMap.remove(null);
            AFe1ySDK<String> aFe1ySDK = new AFe1ySDK<>(AFAdRevenueData, httpURLConnection.getResponseCode(), z, hashMap, aFd1dSDK);
            httpURLConnection.disconnect();
            return aFe1ySDK;
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection2 = httpURLConnection;
            try {
                AFd1dSDK aFd1dSDK2 = new AFd1dSDK(System.currentTimeMillis() - currentTimeMillis);
                StringBuilder sb7 = new StringBuilder("error: ");
                sb7.append(th);
                sb7.append("\n took ");
                sb7.append(aFd1dSDK2.AFAdRevenueData);
                sb7.append("ms");
                String obj2 = sb7.toString();
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK2 = AFg1cSDK.HTTP_CLIENT;
                StringBuilder sb8 = new StringBuilder("[");
                sb8.append(aFd1cSDK.hashCode());
                sb8.append("] ");
                sb8.append(obj2);
                aFLogger2.e(aFg1cSDK2, sb8.toString(), th, false, false, false);
                throw new HttpException(th, aFd1dSDK2);
            } catch (Throwable th6) {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th6;
            }
        }
    }
}
