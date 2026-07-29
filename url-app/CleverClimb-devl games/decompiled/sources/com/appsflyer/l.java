package com.appsflyer;

import android.text.TextUtils;
import com.google.android.gms.games.GamesStatusCodes;
import java.io.IOException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    String f3474a;

    /* renamed from: b, reason: collision with root package name */
    private a f3475b;

    /* renamed from: c, reason: collision with root package name */
    private i f3476c;

    abstract String a();

    abstract void a(String str);

    abstract void a(HttpsURLConnection httpsURLConnection) throws JSONException, IOException;

    abstract void b();

    l(i iVar) {
        this.f3476c = iVar;
    }

    public void a(a aVar) {
        this.f3475b = aVar;
    }

    public static class a {
        static HttpsURLConnection a(String str) throws IOException {
            return (HttpsURLConnection) new URL(str).openConnection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c8  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        String str;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String str2 = "";
        String a2 = a();
        d.a("oneLinkUrl: ".concat(String.valueOf(a2)));
        try {
            HttpsURLConnection a3 = a.a(a2);
            a3.addRequestProperty("content-type", "application/json");
            StringBuilder sb = new StringBuilder();
            sb.append(j.a().a("AppsFlyerKey"));
            sb.append(currentTimeMillis);
            a3.addRequestProperty("authorization", ae.a(sb.toString()));
            a3.addRequestProperty("af-timestamp", String.valueOf(currentTimeMillis));
            a3.setReadTimeout(GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE);
            a3.setConnectTimeout(GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE);
            a(a3);
            int responseCode = a3.getResponseCode();
            str = i.a(a3);
            try {
                if (responseCode == 200) {
                    d.d("Status 200 ok");
                } else {
                    StringBuilder sb2 = new StringBuilder("Response code = ");
                    sb2.append(responseCode);
                    sb2.append(" content = ");
                    sb2.append(str);
                    str2 = sb2.toString();
                }
            } catch (Throwable th) {
                th = th;
                d.a("Error while calling ".concat(String.valueOf(a2)), th);
                StringBuilder sb3 = new StringBuilder("Error while calling ");
                sb3.append(a2);
                sb3.append(" stacktrace: ");
                sb3.append(th.toString());
                str2 = sb3.toString();
                if (!TextUtils.isEmpty(str2)) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            str = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            d.d("Connection call succeeded: ".concat(String.valueOf(str)));
            a(str);
        } else {
            d.e("Connection error: ".concat(String.valueOf(str2)));
            b();
        }
    }
}
