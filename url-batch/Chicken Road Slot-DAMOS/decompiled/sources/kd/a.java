package kd;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5503d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Serializable f5504e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Function0 function0) {
        this.f5504e = (p) function0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0, wd.p] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f5503d) {
            case 0:
                ((p) this.f5504e).invoke();
                return;
            default:
                Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                HashMap hashMap = (HashMap) this.f5504e;
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
                        httpURLConnection.disconnect();
                        return;
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    Log.w("HttpUrlPinger", "Error while pinging URL: " + uri + ". " + e.getMessage(), e);
                    return;
                } catch (IndexOutOfBoundsException e9) {
                    Log.w("HttpUrlPinger", "Error while parsing ping URL: " + uri + ". " + e9.getMessage(), e9);
                    return;
                } catch (RuntimeException e10) {
                    e = e10;
                    Log.w("HttpUrlPinger", "Error while pinging URL: " + uri + ". " + e.getMessage(), e);
                    return;
                } finally {
                }
        }
    }

    public a(HashMap hashMap) {
        this.f5504e = hashMap;
    }
}
