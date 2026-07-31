package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hs1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final is1 f26894a;

    public hs1(@NotNull om1 rewardedListener) {
        Intrinsics.checkNotNullParameter(rewardedListener, "rewardedListener");
        this.f26894a = rewardedListener;
    }

    @Nullable
    public final gs1 a(@NotNull Context context, @Nullable C2360y7 c2360y7, @NotNull C2286v2 adConfiguration) {
        nr1 J3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        if (c2360y7 != null && (J3 = c2360y7.J()) != null) {
            if (J3.e()) {
                gx1 d4 = J3.d();
                if (d4 != null) {
                    return new fx1(context, adConfiguration, d4, new C1920f9(context, adConfiguration));
                }
            } else {
                uo c4 = J3.c();
                if (c4 != null) {
                    return new to(c4, this.f26894a, new dw1(c4.c(), c4.d()));
                }
            }
        }
        return null;
    }
}
