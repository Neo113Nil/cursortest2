package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Tg extends Wg {
    public Tg(C0457e5 c0457e5) {
        super(c0457e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        String value = w5.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            zo zoVar = this.f6835a.f7242t;
            synchronized (zoVar) {
                zoVar.c(zoVar.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            w5.f6827n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void b() {
        zo zoVar = this.f6835a.f7242t;
        synchronized (zoVar) {
            zoVar.a(zoVar.a() + 1);
        }
        this.f6835a.z();
        R8 r8 = this.f6835a.f7235l;
        if (r8.f6548c == null) {
            r8.a();
        }
        T8 t8 = r8.f6548c;
        t8.getClass();
        t8.f6692b = new HashSet();
        t8.f6694d = 0;
        T8 t82 = r8.f6548c;
        t82.f6691a = true;
        W8 w8 = r8.f6547b;
        IBinaryDataHelper iBinaryDataHelper = w8.f6831c;
        V8 v8 = w8.f6830b;
        w8.f6829a.getClass();
        iBinaryDataHelper.insert("event_hashes", v8.toByteArray((V8) U8.a(t82)));
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C0868u2 c0868u2 = this.f6835a.t().f7684y;
                    for (String str2 : Uri.decode(queryParameter).split("&")) {
                        String decode = Uri.decode(str2);
                        int indexOf = decode.indexOf("=");
                        if (indexOf >= 0 && a(Uri.decode(decode.substring(0, indexOf)), Uri.decode(decode.substring(indexOf + 1)), c0868u2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, C0868u2 c0868u2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c0868u2 == null) {
            return false;
        }
        for (Pair pair : c0868u2.f8388a) {
            if (AbstractC0709no.a(pair.first, str) && ((obj = pair.second) == null || ((C0842t2) obj).f8333a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
