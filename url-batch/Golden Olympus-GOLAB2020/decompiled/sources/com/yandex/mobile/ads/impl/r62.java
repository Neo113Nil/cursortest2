package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.qi0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class r62 implements nm0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qi0 f31055a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final C2276uf<?> f31056b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2368yf f31057c;

    private static final class a implements qi0.b {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ m2.h[] f31058c = {C1873da.a(a.class, "trademarkView", "getTrademarkView()Landroid/widget/ImageView;", 0), C1873da.a(a.class, "delimiterView", "getDelimiterView()Landroid/widget/TextView;", 0)};

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ao1 f31059a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ao1 f31060b;

        public a(@NotNull ImageView trademarkView, @Nullable TextView textView) {
            Intrinsics.checkNotNullParameter(trademarkView, "trademarkView");
            this.f31059a = bo1.a(trademarkView);
            this.f31060b = bo1.a(textView);
        }

        @Override // com.yandex.mobile.ads.impl.qi0.b
        public final void a(@Nullable Bitmap bitmap) {
            if (bitmap != null) {
                ao1 ao1Var = this.f31059a;
                m2.h[] hVarArr = f31058c;
                ImageView imageView = (ImageView) ao1Var.getValue(this, hVarArr[0]);
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                    imageView.setVisibility(0);
                }
                TextView textView = (TextView) this.f31060b.getValue(this, hVarArr[1]);
                if (textView == null) {
                    return;
                }
                textView.setVisibility(0);
            }
        }
    }

    public r62(@NotNull qi0 imageProvider, @Nullable C2276uf<?> c2276uf, @NotNull C2368yf assetClickConfigurator) {
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(assetClickConfigurator, "assetClickConfigurator");
        this.f31055a = imageProvider;
        this.f31056b = c2276uf;
        this.f31057c = assetClickConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.nm0
    public final void a(@NotNull db2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        ImageView r4 = uiElements.r();
        TextView q4 = uiElements.q();
        if (r4 != null) {
            C2276uf<?> c2276uf = this.f31056b;
            Object d4 = c2276uf != null ? c2276uf.d() : null;
            ej0 ej0Var = d4 instanceof ej0 ? (ej0) d4 : null;
            if (ej0Var != null) {
                this.f31055a.a(ej0Var, new a(r4, q4));
            }
            this.f31057c.a(r4, this.f31056b);
        }
    }
}
