package com.appsflyer;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class af extends l {

    /* renamed from: b, reason: collision with root package name */
    private a f3429b;

    /* renamed from: c, reason: collision with root package name */
    private String f3430c;

    interface a {
        void a(String str);

        void a(Map<String, String> map);
    }

    af(Uri uri, i iVar) {
        super(iVar);
        if (TextUtils.isEmpty(uri.getHost()) || TextUtils.isEmpty(uri.getPath())) {
            return;
        }
        String[] split = uri.getPath().split("/");
        if (uri.getHost().contains("onelink.me") && split.length == 3) {
            this.f3474a = split[1];
            this.f3430c = split[2];
        }
    }

    final void a(a aVar) {
        this.f3429b = aVar;
    }

    final boolean c() {
        return (TextUtils.isEmpty(this.f3474a) || TextUtils.isEmpty(this.f3430c)) ? false : true;
    }

    @Override // com.appsflyer.l
    final void a(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        httpsURLConnection.setRequestMethod("GET");
    }

    @Override // com.appsflyer.l
    final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(m.b("https://onelink.%s/shortlink-sdk/v1"));
        sb.append("/");
        sb.append(this.f3474a);
        sb.append("?id=");
        sb.append(this.f3430c);
        return sb.toString();
    }

    @Override // com.appsflyer.l
    final void a(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.f3429b.a(hashMap);
        } catch (JSONException e) {
            this.f3429b.a("Can't parse one link data");
            d.a("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    @Override // com.appsflyer.l
    final void b() {
        this.f3429b.a("Can't get one link data");
    }
}
