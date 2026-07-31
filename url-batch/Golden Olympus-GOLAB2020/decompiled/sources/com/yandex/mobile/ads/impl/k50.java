package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.v30;
import com.yandex.mobile.ads.impl.w30;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class k50 implements v30 {

    /* renamed from: a, reason: collision with root package name */
    private final v30.a f28055a;

    public k50(v30.a aVar) {
        this.f28055a = (v30.a) C2253tf.a(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final void a(w30.a aVar) {
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final void b(w30.a aVar) {
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final su getCryptoConfig() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final v30.a getError() {
        return this.f28055a;
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final UUID getSchemeUuid() {
        return C1813am.f23358a;
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final int getState() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final Map<String, String> queryKeyStatus() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.v30
    public final boolean requiresSecureDecoder(String str) {
        return false;
    }
}
