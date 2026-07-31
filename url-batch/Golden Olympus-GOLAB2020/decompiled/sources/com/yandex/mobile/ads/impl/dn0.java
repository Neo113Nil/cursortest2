package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dn0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1959h0 f24709a;

    private static final class a implements InterfaceC2006j0 {
        @Override // com.yandex.mobile.ads.impl.InterfaceC2006j0
        public final void onReturnedToApplication() {
        }
    }

    public dn0(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull hu creative, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        a aVar = new a();
        ku d4 = creative.d();
        this.f24709a = new C1959h0(context, adConfiguration, null, aVar, d4 != null ? d4.a() : null);
    }

    public final void a() {
        this.f24709a.e();
    }
}
