package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2611f0 implements InterfaceC2895po {
    @Override // io.appmetrica.analytics.impl.InterfaceC2895po
    public final C2843no a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C2843no(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new C2843no(this, true, "");
        } catch (Throwable unused) {
            return new C2843no(this, false, "Invalid ApiKey=" + str + ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
    }
}
