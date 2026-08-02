package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.UUID;
import x.AbstractC1514c;

/* renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0652h0 implements InterfaceC0960so {
    @Override // io.appmetrica.analytics.impl.InterfaceC0960so
    public final C0909qo a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C0909qo(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new C0909qo(this, true, "");
        } catch (Throwable unused) {
            return new C0909qo(this, false, AbstractC1514c.a("Invalid ApiKey=", str, ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html"));
        }
    }
}
