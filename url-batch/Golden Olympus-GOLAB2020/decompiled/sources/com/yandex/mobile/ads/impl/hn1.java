package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hn1<V extends ViewGroup> implements q00<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ct f26834a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final in1 f26835b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final v31 f26836c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final p41 f26837d;

    public hn1(@NotNull ct nativeAdAssets, @NotNull in1 ratingFormatter, @NotNull v31 nativeAdAdditionalViewProvider, @NotNull p41 nativeAdContainerViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(ratingFormatter, "ratingFormatter");
        Intrinsics.checkNotNullParameter(nativeAdAdditionalViewProvider, "nativeAdAdditionalViewProvider");
        Intrinsics.checkNotNullParameter(nativeAdContainerViewProvider, "nativeAdContainerViewProvider");
        this.f26834a = nativeAdAssets;
        this.f26835b = ratingFormatter;
        this.f26836c = nativeAdAdditionalViewProvider;
        this.f26837d = nativeAdContainerViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@NotNull V container) {
        String valueOf;
        Intrinsics.checkNotNullParameter(container, "container");
        this.f26837d.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        ViewGroup viewGroup = (ViewGroup) container.findViewById(R.id.rating_container);
        Float k4 = this.f26834a.k();
        if (k4 == null) {
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            }
            return;
        }
        this.f26836c.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        TextView textView = (TextView) container.findViewById(R.id.rating_text);
        if (textView != null) {
            in1 in1Var = this.f26835b;
            float floatValue = k4.floatValue();
            in1Var.getClass();
            try {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator(',');
                valueOf = new DecimalFormat("0.0", decimalFormatSymbols).format(floatValue);
                Intrinsics.checkNotNull(valueOf);
            } catch (RuntimeException unused) {
                valueOf = String.valueOf(floatValue);
            }
            textView.setText(valueOf);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
    }
}
