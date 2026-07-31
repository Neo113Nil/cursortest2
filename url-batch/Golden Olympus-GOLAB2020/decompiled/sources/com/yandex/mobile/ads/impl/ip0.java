package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ip0 implements ys {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final cp0 f27304a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lm1 f27305b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ts0 f27306c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ps0 f27307d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f27308e;

    public ip0(@NotNull Context context, @NotNull cp0 interstitialAdContentController, @NotNull lm1 proxyInterstitialAdShowListener, @NotNull ts0 mainThreadUsageValidator, @NotNull ps0 mainThreadExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interstitialAdContentController, "interstitialAdContentController");
        Intrinsics.checkNotNullParameter(proxyInterstitialAdShowListener, "proxyInterstitialAdShowListener");
        Intrinsics.checkNotNullParameter(mainThreadUsageValidator, "mainThreadUsageValidator");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        this.f27304a = interstitialAdContentController;
        this.f27305b = proxyInterstitialAdShowListener;
        this.f27306c = mainThreadUsageValidator;
        this.f27307d = mainThreadExecutor;
        this.f27308e = new AtomicBoolean(false);
        interstitialAdContentController.a(proxyInterstitialAdShowListener);
    }

    @Override // com.yandex.mobile.ads.impl.ys
    public final void a(@Nullable dm2 dm2Var) {
        this.f27306c.a();
        this.f27305b.a(dm2Var);
    }

    @Override // com.yandex.mobile.ads.impl.ys
    @NotNull
    public final fs getInfo() {
        return this.f27304a.n();
    }

    @Override // com.yandex.mobile.ads.impl.ys
    public final void show(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27306c.a();
        this.f27307d.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.N7
            @Override // java.lang.Runnable
            public final void run() {
                ip0.a(ip0.this, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ip0 this$0, Activity activity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        if (!this$0.f27308e.getAndSet(true)) {
            Throwable d4 = Result.d(this$0.f27304a.a(activity));
            if (d4 != null) {
                this$0.f27305b.a(new C2335x5(String.valueOf(d4.getMessage())));
                return;
            }
            return;
        }
        this$0.f27305b.a(C2358y5.b());
    }
}
