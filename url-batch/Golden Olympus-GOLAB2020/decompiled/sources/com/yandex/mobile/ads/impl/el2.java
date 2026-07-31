package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class el2 implements InterfaceC2343xd {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2342xc f25339a;

    public /* synthetic */ el2() {
        this(new C2342xc());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2343xd
    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25339a.a(context);
    }

    public el2(@NotNull C2342xc easyIntegrationInitializer) {
        Intrinsics.checkNotNullParameter(easyIntegrationInitializer, "easyIntegrationInitializer");
        this.f25339a = easyIntegrationInitializer;
    }
}
