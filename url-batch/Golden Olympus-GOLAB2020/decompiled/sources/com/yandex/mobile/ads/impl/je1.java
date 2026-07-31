package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class je1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ew1 f27639a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je1() {
        this(ew1.a.a());
        int i4 = ew1.f25476l;
    }

    public final boolean a(@NotNull Context context) {
        du1 a4;
        Intrinsics.checkNotNullParameter(context, "context");
        return (!C2362y9.a(context) || (a4 = this.f27639a.a(context)) == null || a4.t0()) ? false : true;
    }

    public je1(@NotNull ew1 sdkSettings) {
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f27639a = sdkSettings;
    }
}
