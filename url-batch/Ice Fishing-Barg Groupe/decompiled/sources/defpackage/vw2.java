package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vw2 extends Thread {
    public final /* synthetic */ HashMap rtx2ld2ELZv4;

    public vw2(HashMap hashMap) {
        this.rtx2ld2ELZv4 = hashMap;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap hashMap = this.rtx2ld2ELZv4;
        for (String str : hashMap.keySet()) {
            buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
        }
        String uri = buildUpon.build().toString();
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
        } catch (IOException e) {
            e = e;
            Log.w("HttpUrlPinger", "Error while pinging URL: " + uri + ". " + e.getMessage(), e);
        } catch (IndexOutOfBoundsException e2) {
            Log.w("HttpUrlPinger", "Error while parsing ping URL: " + uri + ". " + e2.getMessage(), e2);
        } catch (RuntimeException e3) {
            e = e3;
            Log.w("HttpUrlPinger", "Error while pinging URL: " + uri + ". " + e.getMessage(), e);
        }
    }
}
