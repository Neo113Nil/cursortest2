package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class j30 implements nm0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final C2276uf<?> f27454a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2368yf f27455b;

    public j30(@Nullable C2276uf<?> c2276uf, @NotNull C2368yf clickConfigurator) {
        Intrinsics.checkNotNullParameter(clickConfigurator, "clickConfigurator");
        this.f27454a = c2276uf;
        this.f27455b = clickConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.nm0
    public final void a(@NotNull db2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView f4 = uiElements.f();
        C2276uf<?> c2276uf = this.f27454a;
        Object d4 = c2276uf != null ? c2276uf.d() : null;
        if (f4 != null) {
            if (!(d4 instanceof String)) {
                f4.setVisibility(8);
                return;
            }
            f4.setText((CharSequence) d4);
            f4.setVisibility(0);
            this.f27455b.a(f4, this.f27454a);
        }
    }
}
