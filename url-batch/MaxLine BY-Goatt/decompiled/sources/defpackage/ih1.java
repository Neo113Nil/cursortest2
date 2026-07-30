package defpackage;

import android.util.Log;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.suggestedevents.ViewOnClickListener;
import com.facebook.internal.Utility;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ih1 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;

    public /* synthetic */ ih1(int i, String str, String str2) {
        this.m = i;
        this.n = str;
        this.o = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        int i = this.m;
        String str = this.o;
        String str2 = this.n;
        switch (i) {
            case 0:
                HttpURLConnection httpURLConnection2 = null;
                HttpURLConnection httpURLConnection3 = null;
                try {
                    try {
                        URLConnection openConnection = new URL(str2).openConnection();
                        openConnection.getClass();
                        httpURLConnection = (HttpURLConnection) openConnection;
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setConnectTimeout(10000);
                        httpURLConnection.setReadTimeout(10000);
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Exception e) {
                    e = e;
                }
                try {
                    String str3 = "status=" + URLEncoder.encode(str, "UTF-8");
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        Charset charset = yt.b;
                        byte[] bytes = str3.getBytes(charset);
                        bytes.getClass();
                        outputStream.write(bytes);
                        outputStream.flush();
                        Unit unit = Unit.a;
                        outputStream.close();
                        int responseCode = httpURLConnection.getResponseCode();
                        InputStream errorStream = (200 > responseCode || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                        if (errorStream != null) {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, charset), Utility.DEFAULT_STREAM_BUFFER_SIZE);
                            try {
                                yh2.r(bufferedReader);
                                bufferedReader.close();
                            } finally {
                            }
                        }
                        Log.d("PUSH_STATUS", "status=" + str + " code=" + responseCode);
                        httpURLConnection.disconnect();
                        httpURLConnection2 = responseCode;
                    } finally {
                    }
                } catch (Exception e2) {
                    e = e2;
                    httpURLConnection3 = httpURLConnection;
                    Log.e("PUSH_STATUS", "sendPushStatus " + str + " error: " + e.getMessage());
                    httpURLConnection2 = httpURLConnection3;
                    if (httpURLConnection3 != null) {
                        httpURLConnection3.disconnect();
                        httpURLConnection2 = httpURLConnection3;
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    throw th;
                }
                return;
            case 1:
                UserDataStore.writeDataIntoCache$lambda$0(str2, str);
                return;
            default:
                ViewOnClickListener.Companion.queryHistoryAndProcess$lambda$0(str2, str);
                return;
        }
    }
}
