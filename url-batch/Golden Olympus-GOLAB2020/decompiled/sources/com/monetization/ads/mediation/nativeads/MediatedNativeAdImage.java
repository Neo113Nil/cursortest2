package com.monetization.ads.mediation.nativeads;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class MediatedNativeAdImage {

    /* renamed from: a, reason: collision with root package name */
    private final int f20813a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20814b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f20815c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final Drawable f20816d;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f20817a;

        /* renamed from: b, reason: collision with root package name */
        private int f20818b;

        /* renamed from: c, reason: collision with root package name */
        private int f20819c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private Drawable f20820d;

        public Builder(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f20817a = url;
        }

        @NotNull
        public final MediatedNativeAdImage build() {
            return new MediatedNativeAdImage(this.f20818b, this.f20819c, this.f20817a, this.f20820d, null);
        }

        @NotNull
        public final String getUrl() {
            return this.f20817a;
        }

        @NotNull
        public final Builder setDrawable(@Nullable Drawable drawable) {
            this.f20820d = drawable;
            return this;
        }

        @NotNull
        public final Builder setHeight(int i4) {
            this.f20819c = i4;
            return this;
        }

        @NotNull
        public final Builder setWidth(int i4) {
            this.f20818b = i4;
            return this;
        }
    }

    public /* synthetic */ MediatedNativeAdImage(int i4, int i5, String str, Drawable drawable, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, i5, str, drawable);
    }

    @Nullable
    public final Drawable getDrawable() {
        return this.f20816d;
    }

    public final int getHeight() {
        return this.f20814b;
    }

    @NotNull
    public final String getUrl() {
        return this.f20815c;
    }

    public final int getWidth() {
        return this.f20813a;
    }

    private MediatedNativeAdImage(int i4, int i5, String str, Drawable drawable) {
        this.f20813a = i4;
        this.f20814b = i5;
        this.f20815c = str;
        this.f20816d = drawable;
    }
}
