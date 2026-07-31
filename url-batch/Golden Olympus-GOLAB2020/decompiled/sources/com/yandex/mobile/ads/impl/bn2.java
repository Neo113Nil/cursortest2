package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bn2 implements sa2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final je1 f23880a;

    public bn2(@NotNull je1 omSdkUsageValidator) {
        Intrinsics.checkNotNullParameter(omSdkUsageValidator, "omSdkUsageValidator");
        this.f23880a = omSdkUsageValidator;
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    @Nullable
    public final an2 a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f23880a.a(context)) {
            return new an2(context);
        }
        return null;
    }
}
