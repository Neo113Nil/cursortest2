package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.d8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1871d8 implements InterfaceC2332x2 {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f24495b = {kotlin.jvm.internal.H.d(new kotlin.jvm.internal.v(C1871d8.class, "adEventsReceiver", "getAdEventsReceiver()Lcom/monetization/ads/base/AdEventsReceiver;", 0))};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ao1 f24496a = bo1.a(null);

    @Override // com.yandex.mobile.ads.impl.InterfaceC2332x2
    public final void a(int i4, @Nullable Bundle bundle) {
        InterfaceC2332x2 interfaceC2332x2 = (InterfaceC2332x2) this.f24496a.getValue(this, f24495b[0]);
        if (interfaceC2332x2 != null) {
            interfaceC2332x2.a(i4, bundle);
            ap0.d(Integer.valueOf(i4));
        }
    }

    public final void a(@Nullable InterfaceC2332x2 interfaceC2332x2) {
        this.f24496a.setValue(this, f24495b[0], interfaceC2332x2);
    }
}
