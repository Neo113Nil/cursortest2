package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.impl.C1953gi;
import com.yandex.mobile.ads.impl.C1977hi;
import com.yandex.mobile.ads.impl.C2000ii;
import com.yandex.mobile.ads.impl.C2024ji;
import com.yandex.mobile.ads.impl.C2105n4;
import com.yandex.mobile.ads.impl.C2286v2;
import com.yandex.mobile.ads.impl.cl2;
import com.yandex.mobile.ads.impl.fe2;
import com.yandex.mobile.ads.impl.gs;
import com.yandex.mobile.ads.impl.il2;
import com.yandex.mobile.ads.impl.ml2;
import com.yandex.mobile.ads.impl.ms;
import com.yandex.mobile.ads.impl.po0;
import com.yandex.mobile.ads.impl.um2;
import com.yandex.mobile.ads.impl.vo0;
import com.yandex.mobile.ads.impl.yf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class BannerAdView extends vo0 {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final cl2 f22379j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private String f22380k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final VideoController f22381l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerAdView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.yandex.mobile.ads.impl.vo0
    @NotNull
    protected final C1977hi a(@NotNull Context context, @NotNull C1953gi bannerAdListener, @NotNull C2105n4 phasesManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bannerAdListener, "bannerAdListener");
        Intrinsics.checkNotNullParameter(phasesManager, "phasesManager");
        return new C1977hi(context, this, bannerAdListener, phasesManager, new fe2(), new C2024ji(), new C2000ii(getAdConfiguration$mobileads_externalRelease().p()), new yf0());
    }

    @Override // com.yandex.mobile.ads.impl.vo0
    public void destroy() {
        super.destroy();
    }

    @Nullable
    public final BannerAdSize getAdSize() {
        ms coreBannerAdSize = b();
        if (coreBannerAdSize == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(coreBannerAdSize, "coreBannerAdSize");
        return new BannerAdSize(coreBannerAdSize.a());
    }

    @Nullable
    public final String getInfo() {
        return c();
    }

    @NotNull
    public final VideoController getVideoController() {
        return this.f22381l;
    }

    public final void loadAd(@NotNull AdRequest adRequest) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        String str = this.f22380k;
        if (str == null || str.length() <= 0) {
            po0.a("Failed to load ad with empty ad unit id", new Object[0]);
        } else {
            a(this.f22379j.a(str, adRequest));
        }
    }

    public final void setAdSize(@NotNull BannerAdSize adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        a(a.a(adSize));
    }

    @Override // com.yandex.mobile.ads.impl.vo0
    public void setAdUnitId(@Nullable String str) {
        this.f22380k = str;
        super.setAdUnitId(str);
    }

    public final void setBannerAdEventListener(@Nullable BannerAdEventListener bannerAdEventListener) {
        a(bannerAdEventListener instanceof ClosableBannerAdEventListener ? new ml2((ClosableBannerAdEventListener) bannerAdEventListener) : bannerAdEventListener != null ? new il2(bannerAdEventListener) : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4, new C2286v2(gs.f26280d, new um2(context)), null, null, null, null, null, 496, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22379j = new cl2();
        this.f22381l = new VideoController(d());
    }
}
