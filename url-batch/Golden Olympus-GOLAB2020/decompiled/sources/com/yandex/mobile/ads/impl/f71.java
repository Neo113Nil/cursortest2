package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class f71 {

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f25692g = {C1873da.a(f71.class, "nativeAdView", "getNativeAdView()Landroid/view/View;", 0), C1873da.a(f71.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0), C1873da.a(f71.class, "muteButtonView", "getMuteButtonView()Landroid/widget/CheckBox;", 0), C1873da.a(f71.class, "videoProgressView", "getVideoProgressView()Landroid/widget/ProgressBar;", 0), C1873da.a(f71.class, "customAssets", "getCustomAssets()Ljava/util/List;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ao1 f25693a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ao1 f25694b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ao1 f25695c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ao1 f25696d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ao1 f25697e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f25698f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final View f25699a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private CheckBox f25700b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private ProgressBar f25701c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private List<zu> f25702d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final Map<String, View> f25703e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private ImageView f25704f;

        public a(@NotNull View nativeAdView, @NotNull Map<String, ? extends View> initialAssetViews) {
            Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
            Intrinsics.checkNotNullParameter(initialAssetViews, "initialAssetViews");
            this.f25699a = nativeAdView;
            this.f25702d = CollectionsKt.emptyList();
            this.f25703e = MapsKt.toMutableMap(initialAssetViews);
        }

        @NotNull
        public final Map<String, View> a() {
            return this.f25703e;
        }

        @NotNull
        public final List<zu> b() {
            return this.f25702d;
        }

        @Nullable
        public final ImageView c() {
            return this.f25704f;
        }

        @Nullable
        public final CheckBox d() {
            return this.f25700b;
        }

        @NotNull
        public final View e() {
            return this.f25699a;
        }

        @Nullable
        public final ProgressBar f() {
            return this.f25701c;
        }

        @NotNull
        public final a a(@NotNull List<zu> customAssets) {
            Intrinsics.checkNotNullParameter(customAssets, "customAssets");
            this.f25702d = customAssets;
            return this;
        }

        @NotNull
        public final a a(@Nullable ImageView imageView) {
            this.f25704f = imageView;
            return this;
        }

        @NotNull
        public final a a(@Nullable CheckBox checkBox) {
            this.f25700b = checkBox;
            return this;
        }

        @NotNull
        public final a a(@Nullable ProgressBar progressBar) {
            this.f25701c = progressBar;
            return this;
        }
    }

    private f71(a aVar) {
        this.f25693a = bo1.a(aVar.e());
        this.f25694b = bo1.a(aVar.c());
        this.f25695c = bo1.a(aVar.d());
        this.f25696d = bo1.a(aVar.f());
        this.f25697e = bo1.a(aVar.b());
        this.f25698f = jt0.a(aVar.a());
    }

    @Nullable
    public final View a(@NotNull String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        WeakReference weakReference = (WeakReference) this.f25698f.get(assetName);
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Nullable
    public final List<zu> b() {
        return (List) this.f25697e.getValue(this, f25692g[4]);
    }

    @Nullable
    public final ImageView c() {
        return (ImageView) this.f25694b.getValue(this, f25692g[1]);
    }

    @Nullable
    public final CheckBox d() {
        return (CheckBox) this.f25695c.getValue(this, f25692g[2]);
    }

    @Nullable
    public final View e() {
        return (View) this.f25693a.getValue(this, f25692g[0]);
    }

    @Nullable
    public final ProgressBar f() {
        return (ProgressBar) this.f25696d.getValue(this, f25692g[3]);
    }

    @NotNull
    public final LinkedHashMap a() {
        return this.f25698f;
    }

    public /* synthetic */ f71(a aVar, int i4) {
        this(aVar);
    }
}
