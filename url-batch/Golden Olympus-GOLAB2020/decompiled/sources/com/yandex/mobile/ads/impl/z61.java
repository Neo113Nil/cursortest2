package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.ironsource.b9;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class z61 implements InterfaceC2094mg {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final CheckBox f35487a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final ProgressBar f35488b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final View f35489c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, View> f35490d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final t71 f35491e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private List<zu> f35492f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final ImageView f35493g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final View f35494a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final t71 f35495b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private CheckBox f35496c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private ProgressBar f35497d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final Map<String, View> f35498e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private ImageView f35499f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private List<zu> f35500g;

        public a(@NotNull View nativeAdView, @NotNull t71 nativeBindType, @NotNull Map<String, ? extends View> initialAssetViews) {
            Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
            Intrinsics.checkNotNullParameter(nativeBindType, "nativeBindType");
            Intrinsics.checkNotNullParameter(initialAssetViews, "initialAssetViews");
            this.f35494a = nativeAdView;
            this.f35495b = nativeBindType;
            this.f35498e = MapsKt.toMutableMap(initialAssetViews);
            this.f35500g = CollectionsKt.emptyList();
        }

        @NotNull
        public final Map<String, View> a() {
            return this.f35498e;
        }

        @NotNull
        public final List<zu> b() {
            return this.f35500g;
        }

        @Nullable
        public final ImageView c() {
            return this.f35499f;
        }

        @Nullable
        public final CheckBox d() {
            return this.f35496c;
        }

        @NotNull
        public final View e() {
            return this.f35494a;
        }

        @NotNull
        public final t71 f() {
            return this.f35495b;
        }

        @Nullable
        public final ProgressBar g() {
            return this.f35497d;
        }

        @NotNull
        public final a h(@Nullable TextView textView) {
            this.f35498e.put(b9.h.f15436D0, textView);
            return this;
        }

        @NotNull
        public final a i(@Nullable TextView textView) {
            this.f35498e.put("warning", textView);
            return this;
        }

        @NotNull
        public final a a(@Nullable TextView textView) {
            this.f35498e.put(IronSourceSegment.AGE, textView);
            return this;
        }

        @NotNull
        public final a b(@Nullable TextView textView) {
            this.f35498e.put(b9.h.f15438E0, textView);
            return this;
        }

        @NotNull
        public final a c(@Nullable TextView textView) {
            this.f35498e.put("call_to_action", textView);
            return this;
        }

        @NotNull
        public final a d(@Nullable TextView textView) {
            this.f35498e.put(b9.i.f15522D, textView);
            return this;
        }

        @NotNull
        public final a e(@Nullable TextView textView) {
            this.f35498e.put("price", textView);
            return this;
        }

        @NotNull
        public final a f(@Nullable TextView textView) {
            this.f35498e.put("review_count", textView);
            return this;
        }

        @NotNull
        public final a g(@Nullable TextView textView) {
            this.f35498e.put("sponsored", textView);
            return this;
        }

        @NotNull
        public final void a(@Nullable View view, @NotNull String assetName) {
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            this.f35498e.put(assetName, view);
        }

        @NotNull
        public final a b(@Nullable ImageView imageView) {
            this.f35498e.put("feedback", imageView);
            return this;
        }

        @NotNull
        public final a c(@Nullable ImageView imageView) {
            this.f35498e.put(b9.h.f15444H0, imageView);
            return this;
        }

        @NotNull
        public final a d(@Nullable ImageView imageView) {
            this.f35499f = imageView;
            return this;
        }

        @NotNull
        public final a a(@Nullable ImageView imageView) {
            this.f35498e.put("favicon", imageView);
            return this;
        }

        @NotNull
        public final a a(@Nullable CustomizableMediaView customizableMediaView) {
            this.f35498e.put(b9.h.f15446I0, customizableMediaView);
            return this;
        }

        @NotNull
        public final a a(@Nullable CheckBox checkBox) {
            this.f35496c = checkBox;
            return this;
        }

        @NotNull
        public final a a(@Nullable View view) {
            this.f35498e.put("rating", view);
            return this;
        }

        @NotNull
        public final a a(@Nullable ProgressBar progressBar) {
            this.f35497d = progressBar;
            return this;
        }
    }

    public z61(@NotNull a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f35487a = builder.d();
        this.f35488b = builder.g();
        this.f35489c = builder.e();
        this.f35490d = builder.a();
        this.f35491e = builder.f();
        this.f35492f = builder.b();
        this.f35493g = builder.c();
    }

    @NotNull
    public final List<zu> a() {
        return this.f35492f;
    }

    @Nullable
    public final ImageView b() {
        return this.f35493g;
    }

    @Nullable
    public final CheckBox c() {
        return this.f35487a;
    }

    @NotNull
    public final View d() {
        return this.f35489c;
    }

    @NotNull
    public final t71 e() {
        return this.f35491e;
    }

    @Nullable
    public final ProgressBar f() {
        return this.f35488b;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2094mg
    @Nullable
    public final View getAssetView(@NotNull String str) {
        Intrinsics.checkNotNullParameter("close_button", "assetName");
        return getAssetViews().get("close_button");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2094mg
    @NotNull
    public final Map<String, View> getAssetViews() {
        return this.f35490d;
    }
}
