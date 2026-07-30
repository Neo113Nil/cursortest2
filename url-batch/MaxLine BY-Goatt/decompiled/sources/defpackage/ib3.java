package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ib3 extends Thread {
    public final /* synthetic */ HashMap m;

    public ib3(HashMap hashMap) {
        this.m = hashMap;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap hashMap = this.m;
        for (String str : hashMap.keySet()) {
            buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 65);
                    sb.append("Received non-success response code ");
                    sb.append(responseCode);
                    sb.append(" from pinging URL: ");
                    sb.append(uri);
                    Log.w("HttpUrlPinger", sb.toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            e = e;
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + String.valueOf(uri).length() + 27);
            sb2.append("Error while pinging URL: ");
            sb2.append(uri);
            sb2.append(". ");
            sb2.append(message);
            Log.w("HttpUrlPinger", sb2.toString(), e);
        } catch (IndexOutOfBoundsException e2) {
            String message2 = e2.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(uri).length() + 32);
            sb3.append("Error while parsing ping URL: ");
            sb3.append(uri);
            sb3.append(". ");
            sb3.append(message2);
            Log.w("HttpUrlPinger", sb3.toString(), e2);
        } catch (RuntimeException e3) {
            e = e3;
            String message3 = e.getMessage();
            StringBuilder sb22 = new StringBuilder(String.valueOf(message3).length() + String.valueOf(uri).length() + 27);
            sb22.append("Error while pinging URL: ");
            sb22.append(uri);
            sb22.append(". ");
            sb22.append(message3);
            Log.w("HttpUrlPinger", sb22.toString(), e);
        }
    }
}
