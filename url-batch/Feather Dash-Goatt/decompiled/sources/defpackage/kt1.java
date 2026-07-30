package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kt1 extends Thread {
    public final /* synthetic */ HashMap d;

    public kt1(HashMap hashMap) {
        this.d = hashMap;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap hashMap = this.d;
        for (String str : hashMap.keySet()) {
            buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + uri);
                    }
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException | RuntimeException e) {
                Log.w("HttpUrlPinger", "Error while pinging URL: " + uri + ". " + e.getMessage(), e);
            }
        } catch (IndexOutOfBoundsException e2) {
            Log.w("HttpUrlPinger", "Error while parsing ping URL: " + uri + ". " + e2.getMessage(), e2);
        }
    }
}
