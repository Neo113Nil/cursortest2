package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.t1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2239t1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f61 f32113a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mr f32114b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final dt f32115c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x31 f32116d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2208rg f32117e;

    public /* synthetic */ C2239t1(f61 f61Var, mr mrVar, dt dtVar) {
        this(f61Var, mrVar, dtVar, new z31(), new C2208rg());
    }

    public final boolean a(@NotNull ExtendedNativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        try {
            if (!(this.f32113a instanceof pz1)) {
                return true;
            }
            ((pz1) this.f32113a).a(this.f32117e.a(nativeAdView, this.f32116d));
            ((pz1) this.f32113a).b(this.f32115c);
            return true;
        } catch (t51 unused) {
            this.f32114b.f();
            return false;
        }
    }

    public C2239t1(@NotNull f61 nativeAdPrivate, @NotNull mr contentCloseListener, @NotNull dt adEventListener, @NotNull x31 nativeAdAssetViewProvider, @NotNull C2208rg assetsNativeAdViewProviderCreator) {
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        Intrinsics.checkNotNullParameter(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        Intrinsics.checkNotNullParameter(assetsNativeAdViewProviderCreator, "assetsNativeAdViewProviderCreator");
        this.f32113a = nativeAdPrivate;
        this.f32114b = contentCloseListener;
        this.f32115c = adEventListener;
        this.f32116d = nativeAdAssetViewProvider;
        this.f32117e = assetsNativeAdViewProviderCreator;
    }

    public final void a() {
        f61 f61Var = this.f32113a;
        if (f61Var instanceof pz1) {
            ((pz1) f61Var).b((dt) null);
        }
    }
}
