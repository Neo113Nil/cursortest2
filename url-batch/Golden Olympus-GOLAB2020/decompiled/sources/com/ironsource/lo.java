package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class lo implements ko {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private a6 f17107a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private WeakReference<c6> f17108b = new WeakReference<>(null);

    public final void a(@NotNull a6 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.f17107a = loadListener;
    }

    @Override // com.ironsource.ko
    public void onBannerClick() {
        c6 c6Var = this.f17108b.get();
        if (c6Var != null) {
            c6Var.onBannerClick();
        }
    }

    @Override // com.ironsource.ko
    public void onBannerInitFailed(@Nullable String str) {
    }

    @Override // com.ironsource.ko
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.ko
    public void onBannerLoadFail(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        a6 a6Var = this.f17107a;
        if (a6Var != null) {
            a6Var.onBannerLoadFail(description);
        }
    }

    @Override // com.ironsource.ko
    public void onBannerLoadSuccess(@NotNull sj adInstance, @NotNull wg adContainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        a6 a6Var = this.f17107a;
        if (a6Var != null) {
            a6Var.onBannerLoadSuccess(adInstance, adContainer);
        }
    }

    @Override // com.ironsource.ko
    public void onBannerShowSuccess() {
        c6 c6Var = this.f17108b.get();
        if (c6Var != null) {
            c6Var.onBannerShowSuccess();
        }
    }

    public final void a(@NotNull c6 showListener) {
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.f17108b = new WeakReference<>(showListener);
    }
}
