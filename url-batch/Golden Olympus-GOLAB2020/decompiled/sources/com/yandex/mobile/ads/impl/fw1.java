package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fw1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final us0 f25930a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vu1 f25931b;

    public fw1(@NotNull us0 manifestAnalyzer, @NotNull vu1 sdkEnvironmentModule) {
        Intrinsics.checkNotNullParameter(manifestAnalyzer, "manifestAnalyzer");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f25930a = manifestAnalyzer;
        this.f25931b = sdkEnvironmentModule;
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25930a.getClass();
        if (us0.e(context)) {
            d11.a(context, this.f25931b, new ps() { // from class: com.yandex.mobile.ads.impl.Q2
                @Override // com.yandex.mobile.ads.impl.ps
                public final void onInitializationCompleted() {
                    fw1.a();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a() {
        ap0.a(new Object[0]);
    }
}
