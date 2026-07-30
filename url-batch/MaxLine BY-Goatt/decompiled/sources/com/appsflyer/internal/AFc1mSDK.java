package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.google.firebase.encoders.json.BuildConfig;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFc1mSDK {
    private final int AFInAppEventType;

    public AFc1mSDK(int i) {
        this.AFInAppEventType = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFc1gSDK<String> AFInAppEventType(AFb1ySDK aFb1ySDK) {
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] values = aFb1ySDK.values();
            StringBuilder sb = new StringBuilder();
            sb.append(aFb1ySDK.values);
            sb.append(":");
            sb.append(aFb1ySDK.AFInAppEventParameterName);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            byte[] values2 = aFb1ySDK.values();
            if (aFb1ySDK.valueOf() && values2 != null) {
                try {
                    String str = aFb1ySDK.AFInAppEventType() ? "<encrypted>" : new String(values2, Charset.defaultCharset());
                    sb2.append("\n payload: ");
                    sb2.append(str);
                } catch (Exception e) {
                    e = e;
                    httpURLConnection = null;
                    try {
                        AFc1lSDK aFc1lSDK = new AFc1lSDK(System.currentTimeMillis() - currentTimeMillis);
                        StringBuilder sb3 = new StringBuilder("error: ");
                        sb3.append(e);
                        sb3.append("\n took ");
                        sb3.append(aFc1lSDK.AFInAppEventType);
                        sb3.append("ms");
                        String obj = sb3.toString();
                        StringBuilder sb4 = new StringBuilder("HTTP: [");
                        sb4.append(aFb1ySDK.hashCode());
                        sb4.append("] ");
                        sb4.append(obj);
                        AFLogger.afErrorLog(sb4.toString(), e, false, false);
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
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
            StringBuilder sb5 = new StringBuilder("HTTP: [");
            sb5.append(aFb1ySDK.hashCode());
            sb5.append("] ");
            sb5.append((Object) sb2);
            AFLogger.afDebugLog(sb5.toString());
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
                httpURLConnection2.addRequestProperty("Content-Type", aFb1ySDK.AFInAppEventType() ? "application/octet-stream" : "application/json");
                for (Map.Entry<String, String> entry2 : aFb1ySDK.AFInAppEventType.entrySet()) {
                    httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                }
                boolean z = true;
                if (values != null) {
                    httpURLConnection2.setDoOutput(true);
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(values.length);
                    httpURLConnection2.setRequestProperty("Content-Length", sb6.toString());
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
                boolean AFKeystoreWrapper = aFb1ySDK.AFKeystoreWrapper();
                String str2 = BuildConfig.FLAVOR;
                if (AFKeystoreWrapper) {
                    str2 = AFInAppEventType(httpURLConnection2, z);
                }
                String str3 = str2;
                AFc1lSDK aFc1lSDK2 = new AFc1lSDK(System.currentTimeMillis() - currentTimeMillis);
                StringBuilder sb7 = new StringBuilder("response code:");
                sb7.append(httpURLConnection2.getResponseCode());
                sb7.append(" ");
                sb7.append(httpURLConnection2.getResponseMessage());
                sb7.append("\n body:");
                sb7.append(str3);
                sb7.append("\n took ");
                sb7.append(aFc1lSDK2.AFInAppEventType);
                sb7.append("ms");
                String obj2 = sb7.toString();
                StringBuilder sb8 = new StringBuilder("HTTP: [");
                sb8.append(aFb1ySDK.hashCode());
                sb8.append("] ");
                sb8.append(obj2);
                AFLogger.afDebugLog(sb8.toString());
                HashMap hashMap = new HashMap(httpURLConnection2.getHeaderFields());
                hashMap.remove(null);
                AFc1gSDK<String> aFc1gSDK = new AFc1gSDK<>(str3, httpURLConnection2.getResponseCode(), z, hashMap, aFc1lSDK2);
                httpURLConnection2.disconnect();
                return aFc1gSDK;
            } catch (Exception e2) {
                e = e2;
                httpURLConnection = httpURLConnection2;
                AFc1lSDK aFc1lSDK3 = new AFc1lSDK(System.currentTimeMillis() - currentTimeMillis);
                StringBuilder sb32 = new StringBuilder("error: ");
                sb32.append(e);
                sb32.append("\n took ");
                sb32.append(aFc1lSDK3.AFInAppEventType);
                sb32.append("ms");
                String obj3 = sb32.toString();
                StringBuilder sb42 = new StringBuilder("HTTP: [");
                sb42.append(aFb1ySDK.hashCode());
                sb42.append("] ");
                sb42.append(obj3);
                AFLogger.afErrorLog(sb42.toString(), e, false, false);
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

    private static String AFInAppEventType(HttpURLConnection httpURLConnection, boolean z) {
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
                return BuildConfig.FLAVOR;
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
