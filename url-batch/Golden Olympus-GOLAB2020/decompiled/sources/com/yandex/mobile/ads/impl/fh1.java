package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fh1<V extends ViewGroup> implements q00<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ct f25795a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final v31 f25796b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final y31 f25797c;

    public fh1(@NotNull ct nativeAdAssets, @NotNull v31 nativeAdAdditionalViewProvider, @NotNull y31 nativeAdAssetViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdAdditionalViewProvider, "nativeAdAdditionalViewProvider");
        Intrinsics.checkNotNullParameter(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        this.f25795a = nativeAdAssets;
        this.f25796b = nativeAdAdditionalViewProvider;
        this.f25797c = nativeAdAssetViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f25796b.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        ImageView imageView = (ImageView) container.findViewById(R.id.icon_placeholder);
        et g4 = this.f25795a.g();
        et e4 = this.f25795a.e();
        if (imageView != null && g4 == null && e4 == null) {
            this.f25797c.getClass();
            Intrinsics.checkNotNullParameter(container, "container");
            zg2 zg2Var = new zg2((TextView) container.findViewById(R.id.title));
            imageView.setVisibility(0);
            imageView.setOnClickListener(zg2Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
    }
}
