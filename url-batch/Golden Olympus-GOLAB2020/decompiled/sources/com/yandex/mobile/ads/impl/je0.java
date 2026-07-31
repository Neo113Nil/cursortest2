package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class je0 implements InterfaceC1995ic {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final me0 f27637a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final oe0 f27638b;

    public /* synthetic */ je0(Context context) {
        this(context, new me0(context), new oe0(context));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1995ic
    @Nullable
    public final C1851cc a() {
        C1851cc a4 = this.f27637a.a();
        return a4 == null ? this.f27638b.a() : a4;
    }

    public je0(@NotNull Context context, @NotNull me0 gmsClientAdvertisingInfoProvider, @NotNull oe0 gmsServiceAdvertisingInfoProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gmsClientAdvertisingInfoProvider, "gmsClientAdvertisingInfoProvider");
        Intrinsics.checkNotNullParameter(gmsServiceAdvertisingInfoProvider, "gmsServiceAdvertisingInfoProvider");
        this.f27637a = gmsClientAdvertisingInfoProvider;
        this.f27638b = gmsServiceAdvertisingInfoProvider;
    }
}
