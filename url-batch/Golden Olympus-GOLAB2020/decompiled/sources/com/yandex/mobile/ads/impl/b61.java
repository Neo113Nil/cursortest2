package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class b61 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final u31 f23607a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zi0 f23608b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final rb1 f23609c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ri0 f23610d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final lj0 f23611e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final b41 f23612f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Set<ft> f23613g;

    public static final class a implements nj0 {
        a() {
        }

        @Override // com.yandex.mobile.ads.impl.nj0
        public final void a(@NotNull String url, @NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        }

        @Override // com.yandex.mobile.ads.impl.nj0
        public final void a(@NotNull Map<String, Bitmap> images) {
            Intrinsics.checkNotNullParameter(images, "images");
            b61.this.f23608b.a(images);
            b61.this.f23609c.a();
            Iterator it = b61.this.f23613g.iterator();
            while (it.hasNext()) {
                ((ft) it.next()).onFinishLoadingImages();
            }
        }
    }

    public /* synthetic */ b61(Context context, u31 u31Var, zi0 zi0Var, rb1 rb1Var) {
        this(context, u31Var, zi0Var, rb1Var, new ri0(context), new lj0(), new b41(zi0Var), new CopyOnWriteArraySet());
    }

    public final void d() {
        List<u31> nativeAds = CollectionsKt.listOf(this.f23607a);
        lj0 lj0Var = this.f23611e;
        lj0Var.getClass();
        Intrinsics.checkNotNullParameter(nativeAds, "nativeAds");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(nativeAds, 10));
        for (u31 u31Var : nativeAds) {
            arrayList.add(lj0Var.a(u31Var.b(), u31Var.e()));
        }
        this.f23610d.a(CollectionsKt.toSet(CollectionsKt.flatten(arrayList)), new a());
    }

    public final void a(@NotNull ft listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f23613g.add(listener);
    }

    @NotNull
    public final zq1 b() {
        return this.f23607a.g();
    }

    @Nullable
    public final String c() {
        return this.f23607a.d();
    }

    public final void b(@NotNull ft listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f23613g.remove(listener);
    }

    @NotNull
    public final ct a() {
        return this.f23612f.a(this.f23607a);
    }

    public b61(@NotNull Context context, @NotNull u31 nativeAd, @NotNull zi0 imageProvider, @NotNull rb1 nativeAdViewRenderer, @NotNull ri0 imageLoadManager, @NotNull lj0 imageValuesProvider, @NotNull b41 nativeAdAssetsCreator, @NotNull Set<ft> imageLoadingListeners) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "nativeAdViewRenderer");
        Intrinsics.checkNotNullParameter(imageLoadManager, "imageLoadManager");
        Intrinsics.checkNotNullParameter(imageValuesProvider, "imageValuesProvider");
        Intrinsics.checkNotNullParameter(nativeAdAssetsCreator, "nativeAdAssetsCreator");
        Intrinsics.checkNotNullParameter(imageLoadingListeners, "imageLoadingListeners");
        this.f23607a = nativeAd;
        this.f23608b = imageProvider;
        this.f23609c = nativeAdViewRenderer;
        this.f23610d = imageLoadManager;
        this.f23611e = imageValuesProvider;
        this.f23612f = nativeAdAssetsCreator;
        this.f23613g = imageLoadingListeners;
    }
}
