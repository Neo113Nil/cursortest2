package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pk0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n01 f30475a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ps f30476b;

    public pk0(@NotNull n01 mobileAdsExecutor, @NotNull ps initializationListener) {
        Intrinsics.checkNotNullParameter(mobileAdsExecutor, "mobileAdsExecutor");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        this.f30475a = mobileAdsExecutor;
        this.f30476b = initializationListener;
    }

    public final void a() {
        this.f30475a.b(new Runnable() { // from class: com.yandex.mobile.ads.impl.Zb
            @Override // java.lang.Runnable
            public final void run() {
                pk0.a(pk0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(pk0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f30476b.onInitializationCompleted();
    }
}
