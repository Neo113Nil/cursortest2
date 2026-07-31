package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class as1 implements st {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ur1 f23433a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final nm1 f23434b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ts0 f23435c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ps0 f23436d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f23437e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final fs f23438f;

    public as1(@NotNull Context context, @NotNull ur1 rewardedAdContentController, @NotNull nm1 proxyRewardedAdShowListener, @NotNull ts0 mainThreadUsageValidator, @NotNull ps0 mainThreadExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rewardedAdContentController, "rewardedAdContentController");
        Intrinsics.checkNotNullParameter(proxyRewardedAdShowListener, "proxyRewardedAdShowListener");
        Intrinsics.checkNotNullParameter(mainThreadUsageValidator, "mainThreadUsageValidator");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        this.f23433a = rewardedAdContentController;
        this.f23434b = proxyRewardedAdShowListener;
        this.f23435c = mainThreadUsageValidator;
        this.f23436d = mainThreadExecutor;
        this.f23437e = new AtomicBoolean(false);
        this.f23438f = rewardedAdContentController.n();
        rewardedAdContentController.a(proxyRewardedAdShowListener);
    }

    @Override // com.yandex.mobile.ads.impl.st
    public final void a(@Nullable sm2 sm2Var) {
        this.f23435c.a();
        this.f23434b.a(sm2Var);
    }

    @Override // com.yandex.mobile.ads.impl.st
    @NotNull
    public final fs getInfo() {
        return this.f23438f;
    }

    @Override // com.yandex.mobile.ads.impl.st
    public final void show(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f23435c.a();
        this.f23436d.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.L
            @Override // java.lang.Runnable
            public final void run() {
                as1.a(as1.this, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(as1 this$0, Activity activity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        if (!this$0.f23437e.getAndSet(true)) {
            Throwable d4 = Result.d(this$0.f23433a.a(activity));
            if (d4 != null) {
                this$0.f23434b.a(new C2335x5(String.valueOf(d4.getMessage())));
                return;
            }
            return;
        }
        this$0.f23434b.a(C2358y5.b());
    }
}
