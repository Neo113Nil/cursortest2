package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.pw0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ov1 extends pw0 {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final lg2<ImageView, ej0> f30211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov1(@NotNull CustomizableMediaView mediaView, @NotNull mj0 imageViewAdapter, @NotNull ww0 mediaViewRenderController, @NotNull lg2<ImageView, ej0> imageViewWrapper) {
        super(mediaView, mediaViewRenderController);
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(imageViewAdapter, "imageViewAdapter");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
        Intrinsics.checkNotNullParameter(imageViewWrapper, "imageViewWrapper");
        this.f30211d = imageViewWrapper;
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void a(CustomizableMediaView customizableMediaView) {
        CustomizableMediaView mediaView = customizableMediaView;
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        this.f30211d.a();
        super.a((ov1) mediaView);
    }

    @Override // com.yandex.mobile.ads.impl.pw0
    @NotNull
    public final pw0.a d() {
        return pw0.a.f30598f;
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void a(C2276uf asset, ng2 viewConfigurator, mw0 mw0Var) {
        mw0 mw0Var2 = mw0Var;
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(viewConfigurator, "viewConfigurator");
        this.f30211d.a(asset, viewConfigurator, a(mw0Var2 != null ? mw0Var2.a() : null));
    }

    private static ej0 a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (ej0) list.get(0);
    }

    @Override // com.yandex.mobile.ads.impl.pw0
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void a2(@NotNull CustomizableMediaView mediaView) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        this.f30211d.a();
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final boolean a(CustomizableMediaView customizableMediaView, mw0 mw0Var) {
        CustomizableMediaView mediaView = customizableMediaView;
        mw0 mediaValue = mw0Var;
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
        ej0 a4 = a(mediaValue.a());
        if (a4 != null) {
            return this.f30211d.a(a4);
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.mobile.ads.impl.pw0, com.yandex.mobile.ads.impl.kg2
    /* renamed from: a */
    public final void b(@NotNull CustomizableMediaView mediaView, @NotNull mw0 mediaValue) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
        super.b(mediaView, mediaValue);
        ej0 a4 = a(mediaValue.a());
        if (a4 == null) {
            return;
        }
        this.f30211d.b(a4);
    }

    @Override // com.yandex.mobile.ads.impl.pw0
    public final void a(@NotNull mw0 mediaValue) {
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
        ej0 a4 = a(mediaValue.a());
        if (a4 == null) {
            return;
        }
        this.f30211d.b(a4);
    }
}
