package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AFe1qSDK {
    private final int AFInAppEventType;

    public AFe1qSDK(int i) {
        this.AFInAppEventType = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFe1jSDK<String> AFKeystoreWrapper(AFe1nSDK aFe1nSDK) throws IOException {
        HttpURLConnection httpURLConnection;
        String str;
        BufferedOutputStream bufferedOutputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] AFInAppEventParameterName = aFe1nSDK.AFInAppEventParameterName();
            StringBuilder sb = new StringBuilder(new StringBuilder().append(aFe1nSDK.AFInAppEventType).append(":").append(aFe1nSDK.values).toString());
            byte[] AFInAppEventParameterName2 = aFe1nSDK.AFInAppEventParameterName();
            if (aFe1nSDK.AFInAppEventType() && AFInAppEventParameterName2 != null) {
                try {
                    sb.append("\n payload: ").append(aFe1nSDK.values() ? "<encrypted>" : new String(AFInAppEventParameterName2, Charset.defaultCharset()));
                } catch (Exception e) {
                    e = e;
                    httpURLConnection = null;
                    try {
                        AFe1mSDK aFe1mSDK = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
                        AFLogger.INSTANCE.e(AFg1aSDK.HTTP_CLIENT, new StringBuilder("[").append(aFe1nSDK.hashCode()).append("] ").append(new StringBuilder("error: ").append(e).append("\n took ").append(aFe1mSDK.AFKeystoreWrapper).append("ms").toString()).toString(), e, false, false, false);
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
                sb.append("\n ").append(entry.getKey()).append(": ").append(entry.getValue());
            }
            AFLogger.INSTANCE.d(AFg1aSDK.HTTP_CLIENT, new StringBuilder("[").append(aFe1nSDK.hashCode()).append("] ").append((Object) sb).toString());
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
                    int i = this.AFInAppEventType;
                    int i2 = aFe1nSDK.registerClient;
                    if (i2 != -1) {
                        i = i2;
                    }
                    httpURLConnection2.setConnectTimeout(i);
                    httpURLConnection2.setReadTimeout(i);
                    httpURLConnection2.addRequestProperty("Content-Type", aFe1nSDK.values() ? "application/octet-stream" : "application/json");
                    for (Map.Entry<String, String> entry2 : aFe1nSDK.valueOf.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    if (AFInAppEventParameterName != null) {
                        httpURLConnection2.setDoOutput(true);
                        httpURLConnection2.setRequestProperty("Content-Length", new StringBuilder().append(AFInAppEventParameterName.length).toString());
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
                    boolean z = httpURLConnection2.getResponseCode() / 100 == 2;
                    if (!aFe1nSDK.valueOf()) {
                        str = "";
                    } else {
                        str = AFInAppEventType(httpURLConnection2, z);
                    }
                    AFe1mSDK aFe1mSDK2 = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
                    AFLogger.INSTANCE.d(AFg1aSDK.HTTP_CLIENT, new StringBuilder("[").append(aFe1nSDK.hashCode()).append("] ").append(new StringBuilder("response code:").append(httpURLConnection2.getResponseCode()).append(" ").append(httpURLConnection2.getResponseMessage()).append("\n body:").append(str).append("\n took ").append(aFe1mSDK2.AFKeystoreWrapper).append("ms").toString()).toString());
                    HashMap hashMap = new HashMap(httpURLConnection2.getHeaderFields());
                    hashMap.remove(null);
                    AFe1jSDK<String> aFe1jSDK = new AFe1jSDK<>(str, httpURLConnection2.getResponseCode(), z, hashMap, aFe1mSDK2);
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    return aFe1jSDK;
                } catch (Exception e2) {
                    e = e2;
                    httpURLConnection = httpURLConnection2;
                    AFe1mSDK aFe1mSDK3 = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
                    AFLogger.INSTANCE.e(AFg1aSDK.HTTP_CLIENT, new StringBuilder("[").append(aFe1nSDK.hashCode()).append("] ").append(new StringBuilder("error: ").append(e).append("\n took ").append(aFe1mSDK3.AFKeystoreWrapper).append("ms").toString()).toString(), e, false, false, false);
                    throw new HttpException(e, aFe1mSDK3);
                } catch (Throwable th5) {
                    th = th5;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e4) {
            e = e4;
            httpURLConnection = null;
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection = null;
        }
    }

    private static String AFInAppEventType(HttpURLConnection httpURLConnection, boolean z) throws IOException {
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            if (z) {
                errorStream = httpURLConnection.getInputStream();
            } else {
                errorStream = httpURLConnection.getErrorStream();
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z2 = true;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            if (!z2) {
                                sb.append('\n');
                            }
                            sb.append(readLine);
                            z2 = false;
                        } else {
                            String obj = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return obj;
                        }
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
}
