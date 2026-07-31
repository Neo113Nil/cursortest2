package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.pw0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sv1 extends pw0 {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f31961j = {kotlin.jvm.internal.H.d(new kotlin.jvm.internal.v(sv1.class, "weakMediaView", "getWeakMediaView()Lcom/monetization/ads/nativeads/CustomizableMediaView;", 0)), kotlin.jvm.internal.H.d(new kotlin.jvm.internal.v(sv1.class, "weakMediaValue", "getWeakMediaValue()Lcom/monetization/ads/network/model/MediaValue;", 0)), kotlin.jvm.internal.H.d(new kotlin.jvm.internal.v(sv1.class, "currentViewAdapter", "getCurrentViewAdapter()Lcom/monetization/ads/nativeads/assetadapter/viewadapter/MediaViewAdapter;", 0))};

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final pw0 f31962d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final pw0 f31963e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final uy1 f31964f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ao1 f31965g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ao1 f31966h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final uv1 f31967i;

    private static final class a implements CustomizableMediaView.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final WeakReference<sv1> f31968a;

        public a(@NotNull WeakReference<sv1> weakSdkMediaViewVideoWithFallbackAdapter) {
            Intrinsics.checkNotNullParameter(weakSdkMediaViewVideoWithFallbackAdapter, "weakSdkMediaViewVideoWithFallbackAdapter");
            this.f31968a = weakSdkMediaViewVideoWithFallbackAdapter;
        }

        @Override // com.monetization.ads.nativeads.CustomizableMediaView.a
        public final void a(int i4, int i5) {
            sv1 sv1Var = this.f31968a.get();
            if (sv1Var != null) {
                uy1 uy1Var = sv1Var.f31964f;
                if (i4 < uy1Var.b() || i5 < uy1Var.a()) {
                    sv1.a(sv1Var, sv1Var.f31963e);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv1(@NotNull CustomizableMediaView mediaView, @NotNull rv1 videoViewAdapter, @NotNull pw0 fallbackAdapter, @NotNull ww0 mediaViewRenderController, @NotNull uy1 fallbackSize) {
        super(mediaView, mediaViewRenderController);
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(videoViewAdapter, "videoViewAdapter");
        Intrinsics.checkNotNullParameter(fallbackAdapter, "fallbackAdapter");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
        Intrinsics.checkNotNullParameter(fallbackSize, "fallbackSize");
        this.f31962d = videoViewAdapter;
        this.f31963e = fallbackAdapter;
        this.f31964f = fallbackSize;
        this.f31965g = bo1.a(null);
        this.f31966h = bo1.a(null);
        kotlin.properties.a aVar = kotlin.properties.a.f41165a;
        this.f31967i = new uv1(videoViewAdapter, this);
        mediaView.setOnSizeChangedListener$mobileads_externalRelease(new a(new WeakReference(this)));
    }

    public static final mw0 c(sv1 sv1Var) {
        return (mw0) sv1Var.f31966h.getValue(sv1Var, f31961j[1]);
    }

    public static final CustomizableMediaView d(sv1 sv1Var) {
        return (CustomizableMediaView) sv1Var.f31965g.getValue(sv1Var, f31961j[0]);
    }

    public static final void a(sv1 sv1Var, pw0 pw0Var) {
        sv1Var.f31967i.setValue(sv1Var, f31961j[2], pw0Var);
    }

    @Override // com.yandex.mobile.ads.impl.pw0
    @NotNull
    public final pw0.a d() {
        return ((pw0) this.f31967i.getValue(this, f31961j[2])).d();
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void a(CustomizableMediaView customizableMediaView) {
        CustomizableMediaView view = customizableMediaView;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f31962d.a((pw0) view);
        this.f31963e.a((pw0) view);
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void a(C2276uf asset, ng2 viewConfigurator, mw0 mw0Var) {
        mw0 mw0Var2 = mw0Var;
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(viewConfigurator, "viewConfigurator");
        this.f31962d.a(asset, viewConfigurator, mw0Var2);
        this.f31963e.a(asset, viewConfigurator, mw0Var2);
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void a() {
        ((pw0) this.f31967i.getValue(this, f31961j[2])).a();
    }

    @Override // com.yandex.mobile.ads.impl.pw0
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void a2(@NotNull CustomizableMediaView mediaView) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        this.f31962d.a(mediaView);
        this.f31963e.a(mediaView);
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final boolean a(CustomizableMediaView customizableMediaView, mw0 mw0Var) {
        CustomizableMediaView view = customizableMediaView;
        mw0 value = mw0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        return ((pw0) this.f31967i.getValue(this, f31961j[2])).a((pw0) view, (CustomizableMediaView) value);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.mobile.ads.impl.pw0, com.yandex.mobile.ads.impl.kg2
    /* renamed from: a */
    public final void b(@NotNull CustomizableMediaView mediaView, @NotNull mw0 value) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(value, "value");
        ao1 ao1Var = this.f31965g;
        m2.h[] hVarArr = f31961j;
        ao1Var.setValue(this, hVarArr[0], mediaView);
        this.f31966h.setValue(this, hVarArr[1], value);
        ((pw0) this.f31967i.getValue(this, hVarArr[2])).b(mediaView, value);
    }

    @Override // com.yandex.mobile.ads.impl.pw0
    public final void a(@NotNull mw0 mediaValue) {
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
        ((pw0) this.f31967i.getValue(this, f31961j[2])).a(mediaValue);
    }
}
