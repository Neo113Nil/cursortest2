package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.mo;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class y71 extends n81 implements pz1 {

    /* renamed from: O, reason: collision with root package name */
    @NotNull
    private final x71 f34927O;

    /* renamed from: P, reason: collision with root package name */
    @NotNull
    private final zi0 f34928P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y71(@NotNull Context context, @NotNull x71 nativeCompositeAd, @NotNull zi0 imageProvider, @NotNull C2258tk binderConfiguration, @NotNull t41 nativeAdControllers) {
        super(context, binderConfiguration, nativeAdControllers);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeCompositeAd, "nativeCompositeAd");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(binderConfiguration, "binderConfiguration");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        this.f34927O = nativeCompositeAd;
        this.f34928P = imageProvider;
        a(a(binderConfiguration.d().a()));
    }

    @Override // com.yandex.mobile.ads.impl.pz1
    public final void a(@NotNull z61 viewBinder, @NotNull Cdo clickConnector) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        Intrinsics.checkNotNullParameter(clickConnector, "clickConnector");
        View d4 = viewBinder.d();
        g71 g71Var = new g71(viewBinder);
        zi0 zi0Var = this.f34928P;
        mo.f29191a.getClass();
        a(d4, zi0Var, g71Var, mo.a.a(), clickConnector);
    }

    @Override // com.yandex.mobile.ads.impl.f61
    public final void b(@NotNull ft listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f34927O.b(listener);
    }

    @Override // com.yandex.mobile.ads.impl.pz1
    @NotNull
    public final ArrayList d() {
        return new ArrayList(this.f34927O.e());
    }

    @Override // com.yandex.mobile.ads.impl.f61
    @NotNull
    public final ct getAdAssets() {
        return this.f34927O.getAdAssets();
    }

    @Override // com.yandex.mobile.ads.impl.f61
    @NotNull
    public final zq1 getAdType() {
        return this.f34927O.getAdType();
    }

    @Override // com.yandex.mobile.ads.impl.f61
    @Nullable
    public final String getInfo() {
        return this.f34927O.getInfo();
    }

    @Override // com.yandex.mobile.ads.impl.n81, com.yandex.mobile.ads.impl.f61
    @NotNull
    public final kt getNativeAdVideoController() {
        return super.getNativeAdVideoController();
    }

    @Override // com.yandex.mobile.ads.impl.n81, com.yandex.mobile.ads.impl.f61
    public final void loadImages() {
        this.f34927O.loadImages();
    }

    @Override // com.yandex.mobile.ads.impl.f61
    public final void b(@NotNull z61 viewProvider, @NotNull Cdo clickConnector) {
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        Intrinsics.checkNotNullParameter(clickConnector, "clickConnector");
        this.f34927O.b(viewProvider, clickConnector);
    }

    @Override // com.yandex.mobile.ads.impl.f61
    public final void b(@NotNull z61 viewProvider) {
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        this.f34927O.b(viewProvider);
    }

    @Override // com.yandex.mobile.ads.impl.pz1
    public final void a(@NotNull z61 viewProvider) {
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        View d4 = viewProvider.d();
        g71 g71Var = new g71(viewProvider);
        zi0 zi0Var = this.f34928P;
        mo.f29191a.getClass();
        a(d4, zi0Var, g71Var, mo.a.a());
    }

    @Override // com.yandex.mobile.ads.impl.pz1
    public final void b(@Nullable dt dtVar) {
        super.a(dtVar);
    }

    @Override // com.yandex.mobile.ads.impl.f61
    public final void a(@NotNull ft listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f34927O.a(listener);
    }

    @Override // com.yandex.mobile.ads.impl.n81, com.yandex.mobile.ads.impl.f61
    public final void a(@Nullable dt dtVar) {
        this.f34927O.a(dtVar);
    }

    private final m71 a(C2286v2 c2286v2) {
        m71 m71Var = new m71(c2286v2, p91.f30364e.a(), e(), a(), new k71(), null);
        m71Var.a(t71.f32234c);
        return m71Var;
    }
}
