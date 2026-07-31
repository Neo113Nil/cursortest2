package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.mf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2093mf implements hs {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1926ff f29038a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final jm1 f29039b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ts0 f29040c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ps0 f29041d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f29042e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final fs f29043f;

    public C2093mf(@NotNull Context context, @NotNull C1926ff appOpenAdContentController, @NotNull jm1 proxyAppOpenAdShowListener, @NotNull ts0 mainThreadUsageValidator, @NotNull ps0 mainThreadExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appOpenAdContentController, "appOpenAdContentController");
        Intrinsics.checkNotNullParameter(proxyAppOpenAdShowListener, "proxyAppOpenAdShowListener");
        Intrinsics.checkNotNullParameter(mainThreadUsageValidator, "mainThreadUsageValidator");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        this.f29038a = appOpenAdContentController;
        this.f29039b = proxyAppOpenAdShowListener;
        this.f29040c = mainThreadUsageValidator;
        this.f29041d = mainThreadExecutor;
        this.f29042e = new AtomicBoolean(false);
        this.f29043f = appOpenAdContentController.n();
        appOpenAdContentController.a(proxyAppOpenAdShowListener);
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final void a(@Nullable gl2 gl2Var) {
        this.f29040c.a();
        this.f29039b.a(gl2Var);
    }

    @Override // com.yandex.mobile.ads.impl.hs
    @NotNull
    public final fs getInfo() {
        return this.f29043f;
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final void show(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f29040c.a();
        this.f29041d.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.V9
            @Override // java.lang.Runnable
            public final void run() {
                C2093mf.a(C2093mf.this, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2093mf this$0, Activity activity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        if (!this$0.f29042e.getAndSet(true)) {
            Throwable d4 = Result.d(this$0.f29038a.a(activity));
            if (d4 != null) {
                this$0.f29039b.a(new C2335x5(String.valueOf(d4.getMessage())));
                return;
            }
            return;
        }
        this$0.f29039b.a(C2358y5.b());
    }
}
