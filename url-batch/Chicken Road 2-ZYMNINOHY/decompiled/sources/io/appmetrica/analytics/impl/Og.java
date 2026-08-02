package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Og extends Rg {
    public Og(X4 x4) {
        super(x4);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        String value = p5.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            C1090xo c1090xo = this.f10886a.f11239t;
            synchronized (c1090xo) {
                c1090xo.c(c1090xo.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            p5.n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void b() {
        C1090xo c1090xo = this.f10886a.f11239t;
        synchronized (c1090xo) {
            c1090xo.a(c1090xo.a() + 1);
        }
        this.f10886a.z();
        M8 m8 = this.f10886a.f11233l;
        if (m8.f10636c == null) {
            m8.a();
        }
        O8 o8 = m8.f10636c;
        o8.getClass();
        o8.f10746b = new HashSet();
        o8.f10748d = 0;
        O8 o82 = m8.f10636c;
        o82.f10745a = true;
        R8 r8 = m8.f10635b;
        IBinaryDataHelper iBinaryDataHelper = r8.f10878c;
        Q8 q8 = r8.f10877b;
        r8.f10876a.getClass();
        iBinaryDataHelper.insert("event_hashes", q8.toByteArray((Q8) P8.a(o82)));
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C0783m2 c0783m2 = this.f10886a.t().f11881y;
                    for (String str2 : Uri.decode(queryParameter).split("&")) {
                        String decode = Uri.decode(str2);
                        int indexOf = decode.indexOf("=");
                        if (indexOf >= 0 && a(Uri.decode(decode.substring(0, indexOf)), Uri.decode(decode.substring(indexOf + 1)), c0783m2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, C0783m2 c0783m2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c0783m2 == null) {
            return false;
        }
        for (Pair pair : c0783m2.f12318a) {
            if (AbstractC0779lo.a(pair.first, str) && ((obj = pair.second) == null || ((C0757l2) obj).f12257a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
