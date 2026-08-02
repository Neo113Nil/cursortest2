package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.wo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0942wo implements InterfaceC0916vo {

    /* renamed from: a, reason: collision with root package name */
    public final H8 f8603a;

    public C0942wo() {
        this(new H8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0916vo
    public final byte[] a(S8 s8, C0754ph c0754ph) {
        if (!((C0457e5) c0754ph.f8089l).B() && !TextUtils.isEmpty(s8.f6612b)) {
            try {
                JSONObject jSONObject = new JSONObject(s8.f6612b);
                jSONObject.remove("preloadInfo");
                s8.f6612b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f8603a.a(s8, c0754ph);
    }

    public C0942wo(H8 h8) {
        this.f8603a = h8;
    }
}
