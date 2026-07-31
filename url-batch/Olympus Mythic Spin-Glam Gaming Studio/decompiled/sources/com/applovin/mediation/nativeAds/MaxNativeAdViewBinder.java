package com.applovin.mediation.nativeAds;

import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;

/* loaded from: classes8.dex */
public class MaxNativeAdViewBinder {

    @IdRes
    protected final int advertiserTextViewId;

    @IdRes
    protected final int bodyTextViewId;

    @IdRes
    protected final int callToActionButtonId;

    @IdRes
    protected final int iconContentViewId;

    @IdRes
    protected final int iconImageViewId;

    @LayoutRes
    protected final int layoutResourceId;
    protected final View mainView;

    @IdRes
    protected final int mediaContentFrameLayoutId;

    @IdRes
    protected final int mediaContentViewGroupId;

    @IdRes
    protected final int optionsContentFrameLayoutId;

    @IdRes
    protected final int optionsContentViewGroupId;

    @IdRes
    protected final int starRatingContentViewGroupId;
    protected final String templateType;

    @IdRes
    protected final int titleTextViewId;

    public static class Builder {
        private final View a;
        private final int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private String n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.j, this.h, this.i, this.k, this.l, this.m, this.n);
        }

        public Builder setAdvertiserTextViewId(@IdRes int i) {
            this.d = i;
            return this;
        }

        public Builder setBodyTextViewId(@IdRes int i) {
            this.e = i;
            return this;
        }

        public Builder setCallToActionButtonId(@IdRes int i) {
            this.m = i;
            return this;
        }

        @Deprecated
        protected Builder setIconContentViewId(@IdRes int i) {
            this.g = i;
            return this;
        }

        public Builder setIconImageViewId(@IdRes int i) {
            this.f = i;
            return this;
        }

        @Deprecated
        protected Builder setMediaContentFrameLayoutId(@IdRes int i) {
            this.l = i;
            return this;
        }

        public Builder setMediaContentViewGroupId(@IdRes int i) {
            this.k = i;
            return this;
        }

        @Deprecated
        protected Builder setOptionsContentFrameLayoutId(@IdRes int i) {
            this.i = i;
            return this;
        }

        public Builder setOptionsContentViewGroupId(@IdRes int i) {
            this.h = i;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(@IdRes int i) {
            this.j = i;
            return this;
        }

        protected Builder setTemplateType(String str) {
            this.n = str;
            return this;
        }

        public Builder setTitleTextViewId(@IdRes int i) {
            this.c = i;
            return this;
        }

        public Builder(@LayoutRes int i) {
            this(i, null);
        }

        private Builder(int i, View view) {
            this.c = -1;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.b = i;
            this.a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, String str) {
        this.mainView = view;
        this.layoutResourceId = i;
        this.titleTextViewId = i2;
        this.advertiserTextViewId = i3;
        this.bodyTextViewId = i4;
        this.iconImageViewId = i5;
        this.iconContentViewId = i6;
        this.starRatingContentViewGroupId = i7;
        this.optionsContentViewGroupId = i8;
        this.optionsContentFrameLayoutId = i9;
        this.mediaContentViewGroupId = i10;
        this.mediaContentFrameLayoutId = i11;
        this.callToActionButtonId = i12;
        this.templateType = str;
    }
}
