package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.p6;
import com.ironsource.q6;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class BannerAdView extends FrameLayout implements q6 {

    /* renamed from: a, reason: collision with root package name */
    private p6 f21910a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private BannerAdViewListener f21911b;

    private BannerAdView(Context context) {
        super(context);
    }

    @NotNull
    public final BannerAdInfo getAdInfo() {
        p6 p6Var = this.f21910a;
        if (p6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerAdViewInternal");
            p6Var = null;
        }
        return p6Var.c();
    }

    @Nullable
    public final BannerAdViewListener getListener() {
        return this.f21911b;
    }

    @Override // com.ironsource.q6
    public void onBannerAdClicked() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdClicked adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f21911b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdClicked(this);
        }
    }

    @Override // com.ironsource.q6
    public void onBannerAdShown() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdShown adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f21911b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdShown(this);
        }
    }

    public final void setListener(@Nullable BannerAdViewListener bannerAdViewListener) {
        this.f21911b = bannerAdViewListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BannerAdView(@NotNull p6 bannerAdViewInternal) {
        this(r0);
        Intrinsics.checkNotNullParameter(bannerAdViewInternal, "bannerAdViewInternal");
        Context context = bannerAdViewInternal.d().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "bannerAdViewInternal.container.context");
        this.f21910a = bannerAdViewInternal;
        bannerAdViewInternal.a(new WeakReference<>(this));
        bannerAdViewInternal.b(new WeakReference<>(this));
    }
}
