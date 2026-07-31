package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ba, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1825ba implements ng2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final v61 f23639a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ko f23640b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final dr0 f23641c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final jh2 f23642d;

    public C1825ba(@NotNull v61 nativeAdViewAdapter, @NotNull ko clickListenerConfigurator, @Nullable dr0 dr0Var, @NotNull jh2 tagCreator) {
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(clickListenerConfigurator, "clickListenerConfigurator");
        Intrinsics.checkNotNullParameter(tagCreator, "tagCreator");
        this.f23639a = nativeAdViewAdapter;
        this.f23640b = clickListenerConfigurator;
        this.f23641c = dr0Var;
        this.f23642d = tagCreator;
    }

    @Override // com.yandex.mobile.ads.impl.ng2
    public final void a(@NotNull C2276uf<?> asset, @NotNull jo clickListenerConfigurable) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(clickListenerConfigurable, "clickListenerConfigurable");
        dr0 a4 = asset.a();
        if (a4 == null) {
            a4 = this.f23641c;
        }
        this.f23640b.a(asset, a4, this.f23639a, clickListenerConfigurable);
    }

    @Override // com.yandex.mobile.ads.impl.ng2
    public final void a(@NotNull View view, @NotNull C2276uf asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getTag() == null) {
            jh2 jh2Var = this.f23642d;
            String b4 = asset.b();
            jh2Var.getClass();
            view.setTag(jh2.a(b4));
        }
    }
}
