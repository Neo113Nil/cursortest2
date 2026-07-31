package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.huawei.hms.iap.entity.OrderStatusCode;
import com.ironsource.cc;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzaev {
    private static final boolean zza(int i4) {
        return i4 >= 200 && i4 < 300;
    }

    private static void zza(HttpURLConnection httpURLConnection, zzaew<?> zzaewVar, Type type) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = zza(responseCode) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            sb.append(readLine);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String sb2 = sb.toString();
                if (zza(responseCode)) {
                    zzaewVar.zza((zzaew<?>) zzady.zza(sb2, type));
                } else {
                    zzaewVar.zza((String) zzady.zza(sb2, String.class));
                }
                httpURLConnection.disconnect();
            } catch (zzabr e4) {
                e = e4;
                zzaewVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            } catch (SocketTimeoutException unused) {
                zzaewVar.zza("TIMEOUT");
                httpURLConnection.disconnect();
            } catch (IOException e5) {
                e = e5;
                zzaewVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            }
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    public static void zza(String str, zzaew<?> zzaewVar, Type type, zzaef zzaefVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(OrderStatusCode.ORDER_STATE_CANCEL);
            zzaefVar.zza(httpURLConnection);
            zza(httpURLConnection, zzaewVar, type);
        } catch (SocketTimeoutException unused) {
            zzaewVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzaewVar.zza("<<Network Error>>");
        } catch (IOException e4) {
            zzaewVar.zza(e4.getMessage());
        }
    }

    public static void zza(String str, zzaeb zzaebVar, zzaew<?> zzaewVar, Type type, zzaef zzaefVar) {
        try {
            Preconditions.checkNotNull(zzaebVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzaebVar.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty(cc.f15718K, cc.f15719L);
            httpURLConnection.setConnectTimeout(OrderStatusCode.ORDER_STATE_CANCEL);
            zzaefVar.zza(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                zza(httpURLConnection, zzaewVar, type);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            zzaewVar.zza("TIMEOUT");
        } catch (IOException e4) {
            e = e4;
            zzaewVar.zza(e.getMessage());
        } catch (NullPointerException e5) {
            e = e5;
            zzaewVar.zza(e.getMessage());
        } catch (UnknownHostException unused2) {
            zzaewVar.zza("<<Network Error>>");
        } catch (JSONException e6) {
            e = e6;
            zzaewVar.zza(e.getMessage());
        }
    }
}
