package com.monetization.ads.mediation.nativeads;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class MediatedNativeAdAssets {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f20783a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f20784b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f20785c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f20786d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final MediatedNativeAdImage f20787e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final MediatedNativeAdImage f20788f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final MediatedNativeAdImage f20789g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final MediatedNativeAdMedia f20790h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private final String f20791i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private final String f20792j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private final String f20793k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private final String f20794l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private final String f20795m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    private final String f20796n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    private final MediatedNativeAdImage f20797o;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private String f20798a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private String f20799b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private String f20800c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private String f20801d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private MediatedNativeAdImage f20802e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private MediatedNativeAdImage f20803f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        private MediatedNativeAdImage f20804g;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        private MediatedNativeAdMedia f20805h;

        /* renamed from: i, reason: collision with root package name */
        @Nullable
        private String f20806i;

        /* renamed from: j, reason: collision with root package name */
        @Nullable
        private String f20807j;

        /* renamed from: k, reason: collision with root package name */
        @Nullable
        private String f20808k;

        /* renamed from: l, reason: collision with root package name */
        @Nullable
        private String f20809l;

        /* renamed from: m, reason: collision with root package name */
        @Nullable
        private String f20810m;

        /* renamed from: n, reason: collision with root package name */
        @Nullable
        private String f20811n;

        /* renamed from: o, reason: collision with root package name */
        @Nullable
        private MediatedNativeAdImage f20812o;

        @NotNull
        public final MediatedNativeAdAssets build() {
            return new MediatedNativeAdAssets(this.f20798a, this.f20799b, this.f20800c, this.f20801d, this.f20802e, this.f20803f, this.f20804g, this.f20805h, this.f20806i, this.f20807j, this.f20808k, this.f20809l, this.f20810m, this.f20811n, this.f20812o, null);
        }

        @NotNull
        public final Builder setAge(@Nullable String str) {
            this.f20798a = str;
            return this;
        }

        @NotNull
        public final Builder setBody(@Nullable String str) {
            this.f20799b = str;
            return this;
        }

        @NotNull
        public final Builder setCallToAction(@Nullable String str) {
            this.f20800c = str;
            return this;
        }

        @NotNull
        public final Builder setDomain(@Nullable String str) {
            this.f20801d = str;
            return this;
        }

        @NotNull
        public final Builder setFavicon(@Nullable MediatedNativeAdImage mediatedNativeAdImage) {
            this.f20802e = mediatedNativeAdImage;
            return this;
        }

        @NotNull
        public final Builder setFeedback(@Nullable MediatedNativeAdImage mediatedNativeAdImage) {
            this.f20812o = mediatedNativeAdImage;
            return this;
        }

        @NotNull
        public final Builder setIcon(@Nullable MediatedNativeAdImage mediatedNativeAdImage) {
            this.f20803f = mediatedNativeAdImage;
            return this;
        }

        @NotNull
        public final Builder setImage(@Nullable MediatedNativeAdImage mediatedNativeAdImage) {
            this.f20804g = mediatedNativeAdImage;
            return this;
        }

        @NotNull
        public final Builder setMedia(@Nullable MediatedNativeAdMedia mediatedNativeAdMedia) {
            this.f20805h = mediatedNativeAdMedia;
            return this;
        }

        @NotNull
        public final Builder setPrice(@Nullable String str) {
            this.f20806i = str;
            return this;
        }

        @NotNull
        public final Builder setRating(@Nullable String str) {
            this.f20807j = str;
            return this;
        }

        @NotNull
        public final Builder setReviewCount(@Nullable String str) {
            this.f20808k = str;
            return this;
        }

        @NotNull
        public final Builder setSponsored(@Nullable String str) {
            this.f20809l = str;
            return this;
        }

        @NotNull
        public final Builder setTitle(@Nullable String str) {
            this.f20810m = str;
            return this;
        }

        @NotNull
        public final Builder setWarning(@Nullable String str) {
            this.f20811n = str;
            return this;
        }
    }

    public /* synthetic */ MediatedNativeAdAssets(String str, String str2, String str3, String str4, MediatedNativeAdImage mediatedNativeAdImage, MediatedNativeAdImage mediatedNativeAdImage2, MediatedNativeAdImage mediatedNativeAdImage3, MediatedNativeAdMedia mediatedNativeAdMedia, String str5, String str6, String str7, String str8, String str9, String str10, MediatedNativeAdImage mediatedNativeAdImage4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, mediatedNativeAdImage, mediatedNativeAdImage2, mediatedNativeAdImage3, mediatedNativeAdMedia, str5, str6, str7, str8, str9, str10, mediatedNativeAdImage4);
    }

    @Nullable
    public final String getAge() {
        return this.f20783a;
    }

    @Nullable
    public final String getBody() {
        return this.f20784b;
    }

    @Nullable
    public final String getCallToAction() {
        return this.f20785c;
    }

    @Nullable
    public final String getDomain() {
        return this.f20786d;
    }

    @Nullable
    public final MediatedNativeAdImage getFavicon() {
        return this.f20787e;
    }

    @Nullable
    public final MediatedNativeAdImage getFeedback() {
        return this.f20797o;
    }

    @Nullable
    public final MediatedNativeAdImage getIcon() {
        return this.f20788f;
    }

    @Nullable
    public final MediatedNativeAdImage getImage() {
        return this.f20789g;
    }

    @Nullable
    public final MediatedNativeAdMedia getMedia() {
        return this.f20790h;
    }

    @Nullable
    public final String getPrice() {
        return this.f20791i;
    }

    @Nullable
    public final String getRating() {
        return this.f20792j;
    }

    @Nullable
    public final String getReviewCount() {
        return this.f20793k;
    }

    @Nullable
    public final String getSponsored() {
        return this.f20794l;
    }

    @Nullable
    public final String getTitle() {
        return this.f20795m;
    }

    @Nullable
    public final String getWarning() {
        return this.f20796n;
    }

    private MediatedNativeAdAssets(String str, String str2, String str3, String str4, MediatedNativeAdImage mediatedNativeAdImage, MediatedNativeAdImage mediatedNativeAdImage2, MediatedNativeAdImage mediatedNativeAdImage3, MediatedNativeAdMedia mediatedNativeAdMedia, String str5, String str6, String str7, String str8, String str9, String str10, MediatedNativeAdImage mediatedNativeAdImage4) {
        this.f20783a = str;
        this.f20784b = str2;
        this.f20785c = str3;
        this.f20786d = str4;
        this.f20787e = mediatedNativeAdImage;
        this.f20788f = mediatedNativeAdImage2;
        this.f20789g = mediatedNativeAdImage3;
        this.f20790h = mediatedNativeAdMedia;
        this.f20791i = str5;
        this.f20792j = str6;
        this.f20793k = str7;
        this.f20794l = str8;
        this.f20795m = str9;
        this.f20796n = str10;
        this.f20797o = mediatedNativeAdImage4;
    }
}
