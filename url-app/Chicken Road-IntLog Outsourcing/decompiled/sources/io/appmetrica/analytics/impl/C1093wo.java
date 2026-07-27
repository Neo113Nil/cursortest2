package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.wo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1093wo implements InterfaceC1067vo {

    /* renamed from: a, reason: collision with root package name */
    public final H8 f9559a;

    public C1093wo() {
        this(new H8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1067vo
    public final byte[] a(S8 s8, C0905ph c0905ph) {
        if (!((C0608e5) c0905ph.f9015l).B() && !TextUtils.isEmpty(s8.f7435b)) {
            try {
                JSONObject jSONObject = new JSONObject(s8.f7435b);
                jSONObject.remove("preloadInfo");
                s8.f7435b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f9559a.a(s8, c0905ph);
    }

    public C1093wo(H8 h8) {
        this.f9559a = h8;
    }
}
