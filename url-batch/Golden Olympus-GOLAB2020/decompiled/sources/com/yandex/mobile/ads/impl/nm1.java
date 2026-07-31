package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class nm1 implements cd0, is1 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final bd0 f29683a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f29684b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private tt f29685c;

    public /* synthetic */ nm1(bd0 bd0Var) {
        this(bd0Var, new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(nm1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        tt ttVar = this$0.f29685c;
        if (ttVar != null) {
            ttVar.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(nm1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        tt ttVar = this$0.f29685c;
        if (ttVar != null) {
            ttVar.onAdDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(nm1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        tt ttVar = this$0.f29685c;
        if (ttVar != null) {
            ttVar.onAdShown();
        }
        bd0 bd0Var = this$0.f29683a;
        if (bd0Var != null) {
            bd0Var.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.cd0
    public final void onAdClicked() {
        this.f29684b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Wa
            @Override // java.lang.Runnable
            public final void run() {
                nm1.a(nm1.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.cd0
    public final void onAdDismissed() {
        this.f29684b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Ua
            @Override // java.lang.Runnable
            public final void run() {
                nm1.b(nm1.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.cd0
    public final void onAdShown() {
        this.f29684b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Ta
            @Override // java.lang.Runnable
            public final void run() {
                nm1.c(nm1.this);
            }
        });
    }

    public nm1(@Nullable bd0 bd0Var, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f29683a = bd0Var;
        this.f29684b = handler;
    }

    public final void a(@NotNull final C2335x5 adPresentationError) {
        Intrinsics.checkNotNullParameter(adPresentationError, "adPresentationError");
        this.f29684b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Xa
            @Override // java.lang.Runnable
            public final void run() {
                nm1.a(C2335x5.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2335x5 adPresentationError, nm1 this$0) {
        Intrinsics.checkNotNullParameter(adPresentationError, "$adPresentationError");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zx1 zx1Var = new zx1(adPresentationError.a());
        tt ttVar = this$0.f29685c;
        if (ttVar != null) {
            ttVar.a(zx1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cd0
    public final void a(@Nullable final C1795a4 c1795a4) {
        this.f29684b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Ya
            @Override // java.lang.Runnable
            public final void run() {
                nm1.a(nm1.this, c1795a4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(nm1 this$0, C1795a4 c1795a4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        tt ttVar = this$0.f29685c;
        if (ttVar != null) {
            ttVar.a(c1795a4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.is1
    public final void a(@NotNull final dw1 reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f29684b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Va
            @Override // java.lang.Runnable
            public final void run() {
                nm1.a(nm1.this, reward);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(nm1 this$0, or1 reward) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reward, "$reward");
        tt ttVar = this$0.f29685c;
        if (ttVar != null) {
            ttVar.a(reward);
        }
    }

    public final void a(@Nullable sm2 sm2Var) {
        this.f29685c = sm2Var;
    }
}
