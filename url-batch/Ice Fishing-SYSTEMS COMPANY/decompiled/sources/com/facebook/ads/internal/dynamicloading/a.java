package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.internal.ads.ThreadFactoryC2724Ph;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
import u2.l;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f23659n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f23660u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f23661v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ThreadFactoryC2724Ph threadFactoryC2724Ph, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.f23660u = runnable2;
        this.f23661v = threadFactoryC2724Ph;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        String jSONObject;
        DataOutputStream dataOutputStream2;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream2;
        int read;
        String str3;
        String str4;
        switch (this.f23659n) {
            case 0:
                Context context = (Context) this.f23660u;
                super.run();
                try {
                    httpURLConnection = (HttpURLConnection) new URL("https://www.facebook.com/adnw_logging/").openConnection();
                    try {
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                        httpURLConnection.setRequestProperty("Accept", com.anythink.core.common.m.a.f14561q);
                        httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
                        httpURLConnection.setRequestProperty("user-agent", "[FBAN/AudienceNetworkForAndroid;FBSN/Android]");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.connect();
                        String uuid = UUID.randomUUID().toString();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("attempt", "0");
                        DexLoadErrorReporter.a(context, uuid, jSONObject2);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("subtype", "generic");
                        jSONObject3.put("subtype_code", "1320");
                        jSONObject3.put("caught_exception", "1");
                        jSONObject3.put("stacktrace", (String) this.f23661v);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("id", UUID.randomUUID().toString());
                        jSONObject4.put("type", "debug");
                        StringBuilder sb = new StringBuilder("");
                        try {
                            sb.append(System.currentTimeMillis() / 1000);
                            jSONObject4.put("session_time", sb.toString());
                            jSONObject4.put("time", "" + (System.currentTimeMillis() / 1000));
                            jSONObject4.put("session_id", uuid);
                            jSONObject4.put("data", jSONObject3);
                            jSONObject4.put("attempt", "0");
                            DexLoadErrorReporter.a(context, uuid, jSONObject3);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(jSONObject4);
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("data", jSONObject2);
                            jSONObject5.put("events", jSONArray);
                            jSONObject = jSONObject5.toString();
                            dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                        } catch (Throwable th) {
                            th = th;
                            str = "Can't close connection.";
                            str2 = AudienceNetworkAds.TAG;
                            dataOutputStream = null;
                            inputStream = null;
                            try {
                                Log.e(str2, "Can't send error.", th);
                                if (dataOutputStream != null) {
                                    try {
                                        dataOutputStream.close();
                                    } catch (Exception e6) {
                                        Log.e(str2, str, e6);
                                    }
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Exception e9) {
                                        Log.e(str2, str, e9);
                                    }
                                }
                                if (httpURLConnection == null) {
                                    return;
                                }
                                httpURLConnection.disconnect();
                                return;
                            } finally {
                            }
                        }
                        try {
                            dataOutputStream2.writeBytes("payload=" + URLEncoder.encode(jSONObject, "UTF-8"));
                            dataOutputStream2.flush();
                            bArr = new byte[16384];
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream2 = httpURLConnection.getInputStream();
                        } catch (Throwable th2) {
                            th = th2;
                            str = "Can't close connection.";
                            str2 = AudienceNetworkAds.TAG;
                            dataOutputStream = dataOutputStream2;
                            inputStream = null;
                            Log.e(str2, "Can't send error.", th);
                            if (dataOutputStream != null) {
                            }
                            if (inputStream != null) {
                            }
                            if (httpURLConnection == null) {
                            }
                            httpURLConnection.disconnect();
                            return;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str = "Can't close connection.";
                        str2 = AudienceNetworkAds.TAG;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str = "Can't close connection.";
                    str2 = AudienceNetworkAds.TAG;
                    dataOutputStream = null;
                    httpURLConnection = null;
                }
                while (true) {
                    try {
                        read = inputStream2.read(bArr);
                    } catch (Throwable th5) {
                        th = th5;
                        str = "Can't close connection.";
                        str2 = AudienceNetworkAds.TAG;
                        inputStream = inputStream2;
                    }
                    if (read == -1) {
                        byteArrayOutputStream.flush();
                        try {
                            dataOutputStream2.close();
                            str3 = "Can't close connection.";
                            str4 = AudienceNetworkAds.TAG;
                        } catch (Exception e10) {
                            str3 = "Can't close connection.";
                            str4 = AudienceNetworkAds.TAG;
                            Log.e(str4, str3, e10);
                        }
                        try {
                            inputStream2.close();
                        } catch (Exception e11) {
                            Log.e(str4, str3, e11);
                        }
                        httpURLConnection.disconnect();
                        return;
                    }
                    try {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } catch (Throwable th6) {
                        th = th6;
                        inputStream = inputStream2;
                        str = "Can't close connection.";
                        str2 = AudienceNetworkAds.TAG;
                        dataOutputStream = dataOutputStream2;
                        Log.e(str2, "Can't send error.", th);
                        if (dataOutputStream != null) {
                        }
                        if (inputStream != null) {
                        }
                        if (httpURLConnection == null) {
                        }
                        httpURLConnection.disconnect();
                        return;
                    }
                }
            case 1:
                new l((Context) this.f23660u, null).a(null, (String) this.f23661v);
                return;
            default:
                Process.setThreadPriority(((ThreadFactoryC2724Ph) this.f23661v).f27015b);
                ((Runnable) this.f23660u).run();
                return;
        }
    }

    public a(u2.d dVar, Context context, String str) {
        this.f23660u = context;
        this.f23661v = str;
        Objects.requireNonNull(dVar);
    }

    public a(Context context, String str) {
        this.f23660u = context;
        this.f23661v = str;
    }
}
