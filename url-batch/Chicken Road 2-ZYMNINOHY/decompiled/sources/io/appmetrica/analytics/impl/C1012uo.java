package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.uo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1012uo implements InterfaceC0986to {

    /* renamed from: a, reason: collision with root package name */
    public final C8 f12860a;

    public C1012uo() {
        this(new C8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0986to
    public final byte[] a(N8 n8, C0746kh c0746kh) {
        if (!((X4) c0746kh.f12230l).B() && !TextUtils.isEmpty(n8.f10694b)) {
            try {
                JSONObject jSONObject = new JSONObject(n8.f10694b);
                jSONObject.remove("preloadInfo");
                n8.f10694b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f12860a.a(n8, c0746kh);
    }

    public C1012uo(C8 c8) {
        this.f12860a = c8;
    }
}
