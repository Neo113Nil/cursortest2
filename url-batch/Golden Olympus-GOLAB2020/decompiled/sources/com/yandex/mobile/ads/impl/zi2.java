package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import com.monetization.ads.fullscreen.template.view.ExtendedTextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zi2 implements nm0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final C2276uf<?> f35606a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2368yf f35607b;

    public zi2(@Nullable C2276uf<?> c2276uf, @NotNull C2368yf assetClickConfigurator) {
        Intrinsics.checkNotNullParameter(assetClickConfigurator, "assetClickConfigurator");
        this.f35606a = c2276uf;
        this.f35607b = assetClickConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.nm0
    public final void a(@NotNull db2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView s4 = uiElements.s();
        C2276uf<?> c2276uf = this.f35606a;
        Object d4 = c2276uf != null ? c2276uf.d() : null;
        if (!(s4 instanceof ExtendedTextView) || !(d4 instanceof String)) {
            if (s4 == null) {
                return;
            }
            s4.setVisibility(8);
            return;
        }
        za0 za0Var = new za0(uiElements.a());
        ExtendedTextView extendedTextView = (ExtendedTextView) s4;
        extendedTextView.setText((CharSequence) d4);
        extendedTextView.setVisibility(0);
        extendedTextView.setAutoSizeTextType(1);
        extendedTextView.setMeasureSpecProvider(za0Var);
        this.f35607b.a(s4, this.f35606a);
    }
}
