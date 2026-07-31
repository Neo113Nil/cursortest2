package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zm<V extends ViewGroup> implements q00<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y31 f35624a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ym f35625b;

    public zm(@NotNull Context context, @NotNull y31 nativeAdAssetViewProvider, @NotNull ym callToActionAnimationController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        Intrinsics.checkNotNullParameter(callToActionAnimationController, "callToActionAnimationController");
        this.f35624a = nativeAdAssetViewProvider;
        this.f35625b = callToActionAnimationController;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f35624a.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        TextView textView = (TextView) container.findViewById(R.id.call_to_action);
        if (textView != null) {
            this.f35625b.a(textView);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
        this.f35625b.a();
    }
}
