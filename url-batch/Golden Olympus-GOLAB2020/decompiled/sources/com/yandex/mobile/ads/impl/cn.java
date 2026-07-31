package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cn implements nm0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final C2276uf<?> f24262a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final fo f24263b;

    public cn(@Nullable C2276uf<?> c2276uf, @NotNull fo clickControlConfigurator) {
        Intrinsics.checkNotNullParameter(clickControlConfigurator, "clickControlConfigurator");
        this.f24262a = c2276uf;
        this.f24263b = clickControlConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.nm0
    public final void a(@NotNull db2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView e4 = uiElements.e();
        ImageView d4 = uiElements.d();
        if (e4 != null) {
            C2276uf<?> c2276uf = this.f24262a;
            Object d5 = c2276uf != null ? c2276uf.d() : null;
            if (d5 instanceof String) {
                e4.setVisibility(0);
                e4.setText((CharSequence) d5);
            } else {
                e4.setVisibility(8);
            }
            this.f24263b.a(e4);
        }
        if (d4 != null) {
            this.f24263b.a(d4);
        }
    }
}
