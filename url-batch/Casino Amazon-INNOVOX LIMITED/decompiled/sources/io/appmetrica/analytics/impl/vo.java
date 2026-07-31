package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vo implements uo {

    /* renamed from: a, reason: collision with root package name */
    public final D8 f1542a;

    public vo() {
        this(new D8());
    }

    @Override // io.appmetrica.analytics.impl.uo
    public final byte[] a(O8 o8, C0333lh c0333lh) {
        if (!((Y4) c0333lh.l).B() && !TextUtils.isEmpty(o8.b)) {
            try {
                JSONObject jSONObject = new JSONObject(o8.b);
                jSONObject.remove("preloadInfo");
                o8.b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f1542a.a(o8, c0333lh);
    }

    public vo(D8 d8) {
        this.f1542a = d8;
    }
}
