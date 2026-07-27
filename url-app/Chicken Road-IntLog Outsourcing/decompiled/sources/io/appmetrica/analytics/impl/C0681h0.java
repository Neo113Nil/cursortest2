package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import b2.AbstractC0279e;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0681h0 implements InterfaceC1041uo {
    @Override // io.appmetrica.analytics.impl.InterfaceC1041uo
    public final C0989so a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C0989so(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new C0989so(this, true, "");
        } catch (Throwable unused) {
            return new C0989so(this, false, AbstractC0279e.f("Invalid ApiKey=", str, ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html"));
        }
    }
}
