package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.UUID;
import w0.AbstractC1234c;

/* renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0530h0 implements InterfaceC0890uo {
    @Override // io.appmetrica.analytics.impl.InterfaceC0890uo
    public final C0838so a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C0838so(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new C0838so(this, true, "");
        } catch (Throwable unused) {
            return new C0838so(this, false, AbstractC1234c.a("Invalid ApiKey=", str, ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html"));
        }
    }
}
