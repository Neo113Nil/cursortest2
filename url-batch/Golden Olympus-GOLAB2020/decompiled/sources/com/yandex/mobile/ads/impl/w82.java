package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class w82 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ew1 f33957a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w82() {
        this(ew1.a.a());
        int i4 = ew1.f25476l;
    }

    public final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        du1 a4 = this.f33957a.a(context);
        return a4 != null && a4.O();
    }

    public w82(@NotNull ew1 sdkSettings) {
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f33957a = sdkSettings;
    }
}
