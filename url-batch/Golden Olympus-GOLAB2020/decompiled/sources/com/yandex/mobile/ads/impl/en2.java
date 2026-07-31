package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class en2 implements ua2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final je1 f25367a;

    public en2(@NotNull je1 omSdkUsageValidator) {
        Intrinsics.checkNotNullParameter(omSdkUsageValidator, "omSdkUsageValidator");
        this.f25367a = omSdkUsageValidator;
    }

    @Override // com.yandex.mobile.ads.impl.ua2
    @Nullable
    public final dn2 a(@NotNull Context context, @NotNull pc2 videoAdPosition, @Nullable dd2 dd2Var, @NotNull List verifications) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoAdPosition, "videoAdPosition");
        Intrinsics.checkNotNullParameter(verifications, "verifications");
        if (this.f25367a.a(context)) {
            return new dn2(context, videoAdPosition, dd2Var, verifications, new zf2(context), new ke1(), new um2(context).c());
        }
        return null;
    }
}
