package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.b9;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.yandex.mobile.ads.impl.InterfaceC2094mg;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class NativeAdViewBinder implements InterfaceC2094mg {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f35890a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, View> f35891b;

    public /* synthetic */ NativeAdViewBinder(View view, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, map);
    }

    @Nullable
    public TextView getAgeView() {
        View view = getAssetViews().get(IronSourceSegment.AGE);
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2094mg
    @Nullable
    public View getAssetView(@NotNull String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        return getAssetViews().get(assetName);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2094mg
    @NotNull
    public Map<String, View> getAssetViews() {
        return this.f35891b;
    }

    @Nullable
    public TextView getBodyView() {
        View view = getAssetViews().get(b9.h.f15438E0);
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getCallToActionView() {
        View view = getAssetViews().get("call_to_action");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getCloseButtonView() {
        View assetView = getAssetView("close_button");
        if (assetView instanceof TextView) {
            return (TextView) assetView;
        }
        return null;
    }

    @Nullable
    public TextView getDomainView() {
        View view = getAssetViews().get(b9.i.f15522D);
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public ImageView getFaviconView() {
        View view = getAssetViews().get("favicon");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @Nullable
    public ImageView getFeedbackView() {
        View view = getAssetViews().get("feedback");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @Nullable
    public ImageView getIconView() {
        View view = getAssetViews().get(b9.h.f15444H0);
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @NotNull
    public final View getNativeAdView() {
        return this.f35890a;
    }

    @Nullable
    public TextView getPriceView() {
        View view = getAssetViews().get("price");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public View getRatingView() {
        return getAssetViews().get("rating");
    }

    @Nullable
    public TextView getReviewCountView() {
        View view = getAssetViews().get("review_count");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getSponsoredView() {
        View view = getAssetViews().get("sponsored");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getTitleView() {
        View view = getAssetViews().get(b9.h.f15436D0);
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getWarningView() {
        View view = getAssetViews().get("warning");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private NativeAdViewBinder(View view, Map<String, ? extends View> map) {
        this.f35890a = view;
        this.f35891b = map;
    }

    @Nullable
    public MediaView getMediaView() {
        View view = getAssetViews().get(b9.h.f15446I0);
        if (view instanceof MediaView) {
            return (MediaView) view;
        }
        return null;
    }

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final View f35892a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final LinkedHashMap f35893b;

        public Builder(@NotNull View nativeAdView) {
            Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
            this.f35892a = nativeAdView;
            this.f35893b = new LinkedHashMap();
        }

        @NotNull
        public final NativeAdViewBinder build() {
            return new NativeAdViewBinder(this.f35892a, this.f35893b, null);
        }

        @NotNull
        public final Builder setAgeView(@Nullable TextView textView) {
            this.f35893b.put(IronSourceSegment.AGE, textView);
            return this;
        }

        @NotNull
        public final Builder setBodyView(@Nullable TextView textView) {
            this.f35893b.put(b9.h.f15438E0, textView);
            return this;
        }

        @NotNull
        public final Builder setCallToActionView(@Nullable TextView textView) {
            this.f35893b.put("call_to_action", textView);
            return this;
        }

        @NotNull
        public final Builder setDomainView(@Nullable TextView textView) {
            this.f35893b.put(b9.i.f15522D, textView);
            return this;
        }

        @NotNull
        public final Builder setFaviconView(@Nullable ImageView imageView) {
            this.f35893b.put("favicon", imageView);
            return this;
        }

        @NotNull
        public final Builder setFeedbackView(@Nullable ImageView imageView) {
            this.f35893b.put("feedback", imageView);
            return this;
        }

        @NotNull
        public final Builder setIconView(@Nullable ImageView imageView) {
            this.f35893b.put(b9.h.f15444H0, imageView);
            return this;
        }

        @NotNull
        public final Builder setMediaView(@Nullable MediaView mediaView) {
            this.f35893b.put(b9.h.f15446I0, mediaView);
            return this;
        }

        @NotNull
        public final Builder setPriceView(@Nullable TextView textView) {
            this.f35893b.put("price", textView);
            return this;
        }

        @NotNull
        public final <T extends View & Rating> Builder setRatingView(@Nullable T t4) {
            this.f35893b.put("rating", t4);
            return this;
        }

        @NotNull
        public final Builder setReviewCountView(@Nullable TextView textView) {
            this.f35893b.put("review_count", textView);
            return this;
        }

        @NotNull
        public final Builder setSponsoredView(@Nullable TextView textView) {
            this.f35893b.put("sponsored", textView);
            return this;
        }

        @NotNull
        public final Builder setTitleView(@Nullable TextView textView) {
            this.f35893b.put(b9.h.f15436D0, textView);
            return this;
        }

        @NotNull
        public final Builder setWarningView(@Nullable TextView textView) {
            this.f35893b.put("warning", textView);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull NativeAdView nativeAdView) {
            this((View) nativeAdView);
            Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        }
    }
}
