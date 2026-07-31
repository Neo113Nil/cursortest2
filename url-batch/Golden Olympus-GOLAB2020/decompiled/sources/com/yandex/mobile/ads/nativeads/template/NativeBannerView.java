package com.yandex.mobile.ads.nativeads.template;

import android.content.Context;
import android.util.AttributeSet;
import com.yandex.mobile.ads.impl.dl2;
import com.yandex.mobile.ads.impl.el2;
import com.yandex.mobile.ads.impl.h61;
import com.yandex.mobile.ads.impl.lt;
import com.yandex.mobile.ads.impl.rt;
import com.yandex.mobile.ads.impl.zm2;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class NativeBannerView extends lt {

    /* renamed from: K, reason: collision with root package name */
    @NotNull
    private final dl2 f35909K;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeBannerView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void applyAppearance(@NotNull NativeTemplateAppearance templateAppearance) {
        Intrinsics.checkNotNullParameter(templateAppearance, "templateAppearance");
        applyAppearance((rt) templateAppearance);
    }

    public final void setAd(@NotNull NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        this.f35909K.getClass();
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        if (!(nativeAd instanceof h61)) {
            throw new IllegalArgumentException("You should pass NativeAd received from native ad loader API.");
        }
        setAd(((h61) nativeAd).a());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4, new NativeTemplateAppearance.Builder().build(), zm2.f35627a, new el2(), null, null, null, 448, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35909K = new dl2();
    }
}
