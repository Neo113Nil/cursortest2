package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.google.common.net.HttpHeaders;
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

/* loaded from: classes.dex */
public final class AFc1mSDK {
    private final int AFInAppEventType;

    public AFc1mSDK(int i) {
        this.AFInAppEventType = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFc1gSDK<String> AFInAppEventType(AFb1ySDK aFb1ySDK) throws IOException {
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] values = aFb1ySDK.values();
            StringBuilder sb = new StringBuilder(new StringBuilder().append(aFb1ySDK.values).append(":").append(aFb1ySDK.AFInAppEventParameterName).toString());
            byte[] values2 = aFb1ySDK.values();
            if (aFb1ySDK.valueOf() && values2 != null) {
                try {
                    sb.append("\n payload: ").append(aFb1ySDK.AFInAppEventType() ? "<encrypted>" : new String(values2, Charset.defaultCharset()));
                } catch (Exception e) {
                    e = e;
                    httpURLConnection = null;
                    try {
                        AFc1lSDK aFc1lSDK = new AFc1lSDK(System.currentTimeMillis() - currentTimeMillis);
                        AFLogger.afErrorLog(new StringBuilder("HTTP: [").append(aFb1ySDK.hashCode()).append("] ").append(new StringBuilder("error: ").append(e).append("\n took ").append(aFc1lSDK.AFInAppEventType).append("ms").toString()).toString(), e, false, false);
                        throw new HttpException(e, aFc1lSDK);
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
            for (Map.Entry<String, String> entry : aFb1ySDK.AFInAppEventType.entrySet()) {
                sb.append("\n ").append(entry.getKey()).append(": ").append(entry.getValue());
            }
            AFLogger.afDebugLog(new StringBuilder("HTTP: [").append(aFb1ySDK.hashCode()).append("] ").append((Object) sb).toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(aFb1ySDK.AFInAppEventParameterName).openConnection();
            try {
                httpURLConnection2.setRequestMethod(aFb1ySDK.values);
                if (aFb1ySDK.AFInAppEventParameterName()) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFb1ySDK.afDebugLog()) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
                int i = this.AFInAppEventType;
                int i2 = aFb1ySDK.afDebugLog;
                if (i2 != -1) {
                    i = i2;
                }
                httpURLConnection2.setConnectTimeout(i);
                httpURLConnection2.setReadTimeout(i);
                httpURLConnection2.addRequestProperty(HttpHeaders.CONTENT_TYPE, aFb1ySDK.AFInAppEventType() ? "application/octet-stream" : "application/json");
                for (Map.Entry<String, String> entry2 : aFb1ySDK.AFInAppEventType.entrySet()) {
                    httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                }
                boolean z = true;
                if (values != null) {
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_LENGTH, new StringBuilder().append(values.length).toString());
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                        try {
                            bufferedOutputStream2.write(values);
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
                if (httpURLConnection2.getResponseCode() / 100 != 2) {
                    z = false;
                }
                String str = "";
                if (aFb1ySDK.AFKeystoreWrapper()) {
                    str = AFInAppEventType(httpURLConnection2, z);
                }
                String str2 = str;
                AFc1lSDK aFc1lSDK2 = new AFc1lSDK(System.currentTimeMillis() - currentTimeMillis);
                AFLogger.afDebugLog(new StringBuilder("HTTP: [").append(aFb1ySDK.hashCode()).append("] ").append(new StringBuilder("response code:").append(httpURLConnection2.getResponseCode()).append(" ").append(httpURLConnection2.getResponseMessage()).append("\n body:").append(str2).append("\n took ").append(aFc1lSDK2.AFInAppEventType).append("ms").toString()).toString());
                HashMap hashMap = new HashMap(httpURLConnection2.getHeaderFields());
                hashMap.remove(null);
                AFc1gSDK<String> aFc1gSDK = new AFc1gSDK<>(str2, httpURLConnection2.getResponseCode(), z, hashMap, aFc1lSDK2);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return aFc1gSDK;
            } catch (Exception e2) {
                e = e2;
                httpURLConnection = httpURLConnection2;
                AFc1lSDK aFc1lSDK3 = new AFc1lSDK(System.currentTimeMillis() - currentTimeMillis);
                AFLogger.afErrorLog(new StringBuilder("HTTP: [").append(aFb1ySDK.hashCode()).append("] ").append(new StringBuilder("error: ").append(e).append("\n took ").append(aFc1lSDK3.AFInAppEventType).append("ms").toString()).toString(), e, false, false);
                throw new HttpException(e, aFc1lSDK3);
            } catch (Throwable th5) {
                th = th5;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            httpURLConnection = null;
        } catch (Throwable th6) {
            th = th6;
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
                        bufferedReader = bufferedReader2;
                        th = th;
                        inputStreamReader = inputStreamReader2;
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
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }
}
