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

/* loaded from: classes.dex */
public final class AFe1qSDK {
    private final int AFInAppEventType;

    public AFe1qSDK(int i2) {
        this.AFInAppEventType = i2;
    }

    private static String AFInAppEventType(HttpURLConnection httpURLConnection, boolean z4) {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader = null;
        try {
            InputStream inputStream = z4 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
            if (inputStream == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z5 = true;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            String obj = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return obj;
                        }
                        if (!z5) {
                            sb.append('\n');
                        }
                        sb.append(readLine);
                        z5 = false;
                    } catch (Throwable th) {
                        inputStreamReader = inputStreamReader2;
                        bufferedReader = bufferedReader2;
                        th = th;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                inputStreamReader = inputStreamReader2;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFe1jSDK<String> AFKeystoreWrapper(AFe1nSDK aFe1nSDK) {
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] AFInAppEventParameterName = aFe1nSDK.AFInAppEventParameterName();
            StringBuilder sb = new StringBuilder();
            sb.append(aFe1nSDK.AFInAppEventType);
            sb.append(":");
            sb.append(aFe1nSDK.values);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            byte[] AFInAppEventParameterName2 = aFe1nSDK.AFInAppEventParameterName();
            if (aFe1nSDK.AFInAppEventType() && AFInAppEventParameterName2 != null) {
                try {
                    String str = aFe1nSDK.values() ? "<encrypted>" : new String(AFInAppEventParameterName2, Charset.defaultCharset());
                    sb2.append("\n payload: ");
                    sb2.append(str);
                } catch (Exception e4) {
                    e = e4;
                    httpURLConnection = null;
                    try {
                        AFe1mSDK aFe1mSDK = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
                        StringBuilder sb3 = new StringBuilder("error: ");
                        sb3.append(e);
                        sb3.append("\n took ");
                        sb3.append(aFe1mSDK.AFKeystoreWrapper);
                        sb3.append("ms");
                        String obj = sb3.toString();
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1aSDK aFg1aSDK = AFg1aSDK.HTTP_CLIENT;
                        StringBuilder sb4 = new StringBuilder("[");
                        sb4.append(aFe1nSDK.hashCode());
                        sb4.append("] ");
                        sb4.append(obj);
                        aFLogger.e(aFg1aSDK, sb4.toString(), e, false, false, false);
                        throw new HttpException(e, aFe1mSDK);
                    } catch (Throwable th) {
                        th = th;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = null;
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
            }
            for (Map.Entry<String, String> entry : aFe1nSDK.valueOf.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
            StringBuilder sb5 = new StringBuilder("[");
            sb5.append(aFe1nSDK.hashCode());
            sb5.append("] ");
            sb5.append((Object) sb2);
            AFLogger.INSTANCE.d(AFg1aSDK.HTTP_CLIENT, sb5.toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(aFe1nSDK.values).openConnection();
            try {
                httpURLConnection2.setRequestMethod(aFe1nSDK.AFInAppEventType);
                if (aFe1nSDK.AFKeystoreWrapper()) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFe1nSDK.unregisterClient()) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
                try {
                    int i2 = this.AFInAppEventType;
                    int i4 = aFe1nSDK.registerClient;
                    if (i4 != -1) {
                        i2 = i4;
                    }
                    httpURLConnection2.setConnectTimeout(i2);
                    httpURLConnection2.setReadTimeout(i2);
                    httpURLConnection2.addRequestProperty("Content-Type", aFe1nSDK.values() ? "application/octet-stream" : "application/json");
                    for (Map.Entry<String, String> entry2 : aFe1nSDK.valueOf.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    if (AFInAppEventParameterName != null) {
                        httpURLConnection2.setDoOutput(true);
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(AFInAppEventParameterName.length);
                        httpURLConnection2.setRequestProperty("Content-Length", sb6.toString());
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                            try {
                                bufferedOutputStream2.write(AFInAppEventParameterName);
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
                            bufferedOutputStream = null;
                        }
                    }
                    boolean z4 = httpURLConnection2.getResponseCode() / 100 == 2;
                    String AFInAppEventType = aFe1nSDK.valueOf() ? AFInAppEventType(httpURLConnection2, z4) : "";
                    AFe1mSDK aFe1mSDK2 = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
                    StringBuilder sb7 = new StringBuilder("response code:");
                    sb7.append(httpURLConnection2.getResponseCode());
                    sb7.append(" ");
                    sb7.append(httpURLConnection2.getResponseMessage());
                    sb7.append("\n body:");
                    sb7.append(AFInAppEventType);
                    sb7.append("\n took ");
                    sb7.append(aFe1mSDK2.AFKeystoreWrapper);
                    sb7.append("ms");
                    String obj2 = sb7.toString();
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1aSDK aFg1aSDK2 = AFg1aSDK.HTTP_CLIENT;
                    StringBuilder sb8 = new StringBuilder("[");
                    sb8.append(aFe1nSDK.hashCode());
                    sb8.append("] ");
                    sb8.append(obj2);
                    aFLogger2.d(aFg1aSDK2, sb8.toString());
                    HashMap hashMap = new HashMap(httpURLConnection2.getHeaderFields());
                    hashMap.remove(null);
                    AFe1jSDK<String> aFe1jSDK = new AFe1jSDK<>(AFInAppEventType, httpURLConnection2.getResponseCode(), z4, hashMap, aFe1mSDK2);
                    httpURLConnection2.disconnect();
                    return aFe1jSDK;
                } catch (Exception e5) {
                    e = e5;
                    httpURLConnection = httpURLConnection2;
                    AFe1mSDK aFe1mSDK3 = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
                    StringBuilder sb32 = new StringBuilder("error: ");
                    sb32.append(e);
                    sb32.append("\n took ");
                    sb32.append(aFe1mSDK3.AFKeystoreWrapper);
                    sb32.append("ms");
                    String obj3 = sb32.toString();
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    AFg1aSDK aFg1aSDK3 = AFg1aSDK.HTTP_CLIENT;
                    StringBuilder sb42 = new StringBuilder("[");
                    sb42.append(aFe1nSDK.hashCode());
                    sb42.append("] ");
                    sb42.append(obj3);
                    aFLogger3.e(aFg1aSDK3, sb42.toString(), e, false, false, false);
                    throw new HttpException(e, aFe1mSDK3);
                } catch (Throwable th5) {
                    th = th5;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e7) {
            e = e7;
            httpURLConnection = null;
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection = null;
        }
    }
}
