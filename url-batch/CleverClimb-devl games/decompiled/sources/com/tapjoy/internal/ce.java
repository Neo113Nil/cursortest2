package com.tapjoy.internal;

import android.support.v7.widget.helper.ItemTouchHelper;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes2.dex */
public final class ce implements cd {

    /* renamed from: a, reason: collision with root package name */
    private final String f7884a;

    /* renamed from: b, reason: collision with root package name */
    private final URL f7885b;

    public ce(String str, URL url) {
        this.f7884a = str;
        this.f7885b = url;
    }

    @Override // com.tapjoy.internal.cd
    public final Object a(ca caVar) {
        URI uri;
        URL url = new URL(this.f7885b, caVar.c());
        String b2 = caVar.b();
        if ("GET".equals(b2) || "DELETE".equals(b2)) {
            Map e = caVar.e();
            if (!e.isEmpty()) {
                url = new URL(url, url.getPath() + "?" + fl.a(e));
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) fk.a(url);
        httpURLConnection.setRequestMethod(b2);
        httpURLConnection.setRequestProperty("User-Agent", this.f7884a);
        for (Map.Entry entry : caVar.a().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), entry.getValue().toString());
        }
        if (!"GET".equals(b2) && !"DELETE".equals(b2)) {
            if ("POST".equals(b2) || "PUT".equals(b2)) {
                String d2 = caVar.d();
                if (d2 == null) {
                    fl.a(httpURLConnection, "application/x-www-form-urlencoded", fl.a(caVar.e()), jn.f8472c);
                } else if ("application/json".equals(d2)) {
                    fl.a(httpURLConnection, "application/json; charset=utf-8", bh.a((Object) caVar.e()), jn.f8472c);
                } else {
                    throw new IllegalArgumentException("Unknown content type: " + d2);
                }
            } else {
                throw new IllegalArgumentException("Unknown method: " + b2);
            }
        }
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 409) {
            switch (responseCode) {
                case ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION /* 200 */:
                case 201:
                    break;
                default:
                    throw new IOException("Unexpected status code: " + httpURLConnection.getResponseCode());
            }
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            try {
                uri = httpURLConnection.getURL().toURI();
            } finally {
                inputStream.close();
            }
        } catch (URISyntaxException unused) {
            uri = null;
        }
        return caVar.a(uri, inputStream);
    }
}
