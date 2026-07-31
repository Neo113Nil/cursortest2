package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.qi0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class l80 implements nm0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qi0 f28454a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final C2276uf<ej0> f28455b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2368yf f28456c;

    private static final class a implements qi0.b {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ m2.h[] f28457b = {C1873da.a(a.class, "faviconView", "getFaviconView()Landroid/widget/ImageView;", 0)};

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ao1 f28458a;

        public a(@NotNull ImageView faviconView) {
            Intrinsics.checkNotNullParameter(faviconView, "faviconView");
            this.f28458a = bo1.a(faviconView);
        }

        @Override // com.yandex.mobile.ads.impl.qi0.b
        public final void a(@Nullable Bitmap bitmap) {
            Unit unit;
            ImageView imageView;
            ImageView imageView2;
            if (bitmap == null || (imageView2 = (ImageView) this.f28458a.getValue(this, f28457b[0])) == null) {
                unit = null;
            } else {
                imageView2.setImageBitmap(bitmap);
                imageView2.setVisibility(0);
                unit = Unit.f41027a;
            }
            if (unit != null || (imageView = (ImageView) this.f28458a.getValue(this, f28457b[0])) == null) {
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public l80(@NotNull qi0 imageProvider, @Nullable C2276uf<ej0> c2276uf, @NotNull C2368yf clickConfigurator) {
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(clickConfigurator, "clickConfigurator");
        this.f28454a = imageProvider;
        this.f28455b = c2276uf;
        this.f28456c = clickConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.nm0
    public final void a(@NotNull db2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        ImageView g4 = uiElements.g();
        if (g4 != null) {
            C2276uf<ej0> c2276uf = this.f28455b;
            Unit unit = null;
            ej0 d4 = c2276uf != null ? c2276uf.d() : null;
            if (d4 != null) {
                this.f28454a.a(d4, new a(g4));
                unit = Unit.f41027a;
            }
            if (unit == null) {
                g4.setVisibility(8);
            }
            this.f28456c.a(g4, this.f28455b);
        }
    }
}
