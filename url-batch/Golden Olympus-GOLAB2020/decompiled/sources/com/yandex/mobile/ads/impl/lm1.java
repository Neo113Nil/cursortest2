package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class lm1 implements cd0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final bd0 f28662a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f28663b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private zs f28664c;

    public /* synthetic */ lm1(bd0 bd0Var) {
        this(bd0Var, new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(lm1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zs zsVar = this$0.f28664c;
        if (zsVar != null) {
            zsVar.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(lm1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zs zsVar = this$0.f28664c;
        if (zsVar != null) {
            zsVar.onAdDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(lm1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zs zsVar = this$0.f28664c;
        if (zsVar != null) {
            zsVar.onAdShown();
        }
        bd0 bd0Var = this$0.f28662a;
        if (bd0Var != null) {
            bd0Var.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.cd0
    public final void onAdClicked() {
        this.f28663b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.H9
            @Override // java.lang.Runnable
            public final void run() {
                lm1.a(lm1.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.cd0
    public final void onAdDismissed() {
        this.f28663b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.E9
            @Override // java.lang.Runnable
            public final void run() {
                lm1.b(lm1.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.cd0
    public final void onAdShown() {
        this.f28663b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.G9
            @Override // java.lang.Runnable
            public final void run() {
                lm1.c(lm1.this);
            }
        });
    }

    public lm1(@Nullable bd0 bd0Var, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f28662a = bd0Var;
        this.f28663b = handler;
    }

    public final void a(@NotNull final C2335x5 adPresentationError) {
        Intrinsics.checkNotNullParameter(adPresentationError, "adPresentationError");
        this.f28663b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.I9
            @Override // java.lang.Runnable
            public final void run() {
                lm1.a(C2335x5.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2335x5 adPresentationError, lm1 this$0) {
        Intrinsics.checkNotNullParameter(adPresentationError, "$adPresentationError");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zx1 zx1Var = new zx1(adPresentationError.a());
        zs zsVar = this$0.f28664c;
        if (zsVar != null) {
            zsVar.a(zx1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cd0
    public final void a(@Nullable final C1795a4 c1795a4) {
        this.f28663b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.F9
            @Override // java.lang.Runnable
            public final void run() {
                lm1.a(lm1.this, c1795a4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(lm1 this$0, C1795a4 c1795a4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zs zsVar = this$0.f28664c;
        if (zsVar != null) {
            zsVar.a(c1795a4);
        }
    }

    public final void a(@Nullable dm2 dm2Var) {
        this.f28664c = dm2Var;
    }
}
