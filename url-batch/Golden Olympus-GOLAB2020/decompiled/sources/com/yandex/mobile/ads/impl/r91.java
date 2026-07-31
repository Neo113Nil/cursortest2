package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class r91 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sr1 f31083a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final nc0 f31084b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private View f31085c;

    private final class a implements sl1 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.sl1
        public final void a(long j4, long j5) {
            View view = r91.this.f31085c;
            if (view != null) {
                r91.this.f31083a.a(view, j4, j5);
            }
        }

        @Override // com.yandex.mobile.ads.impl.sl1
        public final void a() {
            View view = r91.this.f31085c;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
        }
    }

    public /* synthetic */ r91(d52 d52Var, a91 a91Var, t42 t42Var) {
        this(d52Var, a91Var, t42Var, new tr1(), new sr1(d52Var));
    }

    public final void c() {
        nc0 nc0Var = this.f31084b;
        if (nc0Var != null) {
            nc0Var.resume();
        }
    }

    public final void a() {
        this.f31085c = null;
        nc0 nc0Var = this.f31084b;
        if (nc0Var != null) {
            nc0Var.invalidate();
        }
    }

    public final void b() {
        nc0 nc0Var = this.f31084b;
        if (nc0Var != null) {
            nc0Var.pause();
        }
    }

    public r91(@NotNull d52 timerViewProvider, @NotNull a91 nativeMediaContent, @NotNull t42 timeProviderContainer, @NotNull tr1 rewardViewControllerProvider, @NotNull sr1 rewardTimerViewController) {
        Intrinsics.checkNotNullParameter(timerViewProvider, "timerViewProvider");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(rewardViewControllerProvider, "rewardViewControllerProvider");
        Intrinsics.checkNotNullParameter(rewardTimerViewController, "rewardTimerViewController");
        this.f31083a = rewardTimerViewController;
        a aVar = new a();
        rewardViewControllerProvider.getClass();
        this.f31084b = tr1.a(aVar, nativeMediaContent, timeProviderContainer);
    }

    public final void a(@Nullable View view) {
        this.f31085c = view;
        nc0 nc0Var = this.f31084b;
        if (nc0Var != null) {
            nc0Var.start();
        }
    }
}
