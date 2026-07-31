package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.w30;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public interface v30 {

    public static class a extends IOException {

        /* renamed from: b, reason: collision with root package name */
        public final int f33492b;

        public a(Throwable th, int i4) {
            super(th);
            this.f33492b = i4;
        }
    }

    static void a(v30 v30Var, v30 v30Var2) {
        if (v30Var == v30Var2) {
            return;
        }
        if (v30Var2 != null) {
            v30Var2.b(null);
        }
        if (v30Var != null) {
            v30Var.a(null);
        }
    }

    void a(w30.a aVar);

    void b(w30.a aVar);

    su getCryptoConfig();

    a getError();

    UUID getSchemeUuid();

    int getState();

    default boolean playClearSamplesWithoutKeys() {
        return false;
    }

    Map<String, String> queryKeyStatus();

    boolean requiresSecureDecoder(String str);
}
