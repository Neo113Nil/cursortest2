package com.yandex.mobile.ads.nativeads.template.appearance;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.lh2;
import com.yandex.mobile.ads.impl.rt;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class NativeTemplateAppearance implements Parcelable, rt {

    @NotNull
    public static final Parcelable.Creator<NativeTemplateAppearance> CREATOR = new a();

    /* renamed from: n, reason: collision with root package name */
    private static final int f35936n = Color.parseColor("#7f7f7f");

    /* renamed from: o, reason: collision with root package name */
    private static final int f35937o = Color.parseColor("#ffd200");

    /* renamed from: p, reason: collision with root package name */
    private static final int f35938p = Color.parseColor("#ffd200");

    /* renamed from: q, reason: collision with root package name */
    private static final int f35939q = Color.parseColor("#f4c900");

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final BannerAppearance f35940b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final TextAppearance f35941c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final TextAppearance f35942d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final TextAppearance f35943e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final TextAppearance f35944f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final TextAppearance f35945g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final TextAppearance f35946h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final TextAppearance f35947i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ImageAppearance f35948j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final ImageAppearance f35949k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final ButtonAppearance f35950l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final RatingAppearance f35951m;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private BannerAppearance f35952a = b();

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        private ButtonAppearance f35962k = d();

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private ImageAppearance f35960i = g();

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private ImageAppearance f35961j = f();

        /* renamed from: l, reason: collision with root package name */
        @NotNull
        private RatingAppearance f35963l = h();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private TextAppearance f35953b = a();

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private TextAppearance f35954c = c();

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private TextAppearance f35955d = e();

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private TextAppearance f35956e = i();

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private TextAppearance f35957f = j();

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private TextAppearance f35958g = k();

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private TextAppearance f35959h = l();

        private static TextAppearance a() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f35936n).setTextSize(15.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static BannerAppearance b() {
            return new BannerAppearance.Builder().setBackgroundColor(-1).setBorderColor(lh2.a(-16777216, 90.0f)).setBorderWidth(1.0f).setContentPadding(new HorizontalOffset(10.0f, 10.0f)).setImageMargins(new HorizontalOffset(0.0f, 10.0f)).build();
        }

        private static TextAppearance c() {
            return new TextAppearance.Builder().setTextColor(-16777216).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static ButtonAppearance d() {
            return new ButtonAppearance.Builder().setBorderColor(NativeTemplateAppearance.f35937o).setBorderWidth(1.0f).setNormalColor(-1).setPressedColor(NativeTemplateAppearance.f35938p).setTextAppearance(new TextAppearance.Builder().setTextColor(-16777216).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build()).build();
        }

        private static TextAppearance e() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f35936n).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static ImageAppearance f() {
            return new ImageAppearance.Builder().setWidthConstraint(new SizeConstraint(SizeConstraint.SizeConstraintType.FIXED, 16.0f)).build();
        }

        private static ImageAppearance g() {
            return new ImageAppearance.Builder().setWidthConstraint(new SizeConstraint(SizeConstraint.SizeConstraintType.PREFERRED_RATIO, 0.3f)).build();
        }

        private static RatingAppearance h() {
            return new RatingAppearance.Builder().setBackgroundStarColor(-3355444).setProgressStarColor(NativeTemplateAppearance.f35939q).build();
        }

        private static TextAppearance i() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f35936n).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static TextAppearance j() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f35936n).setTextSize(11.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static TextAppearance k() {
            return new TextAppearance.Builder().setTextColor(-16777216).setTextSize(15.0f).setFontFamilyName(null).setFontStyle(1).build();
        }

        private static TextAppearance l() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f35936n).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        @NotNull
        public final NativeTemplateAppearance build() {
            return new NativeTemplateAppearance(this.f35952a, this.f35953b, this.f35954c, this.f35955d, this.f35956e, this.f35957f, this.f35958g, this.f35959h, this.f35961j, this.f35960i, this.f35962k, this.f35963l, null);
        }

        @NotNull
        public final Builder withAgeAppearance(@NotNull TextAppearance ageAppearance) {
            Intrinsics.checkNotNullParameter(ageAppearance, "ageAppearance");
            TextAppearance textAppearance = this.f35953b;
            Intrinsics.checkNotNullParameter(textAppearance, "textAppearance");
            if (ageAppearance != null && !Intrinsics.areEqual(textAppearance, ageAppearance)) {
                int textColor = ageAppearance.getTextColor();
                float textSize = ageAppearance.getTextSize();
                String fontFamilyName = ageAppearance.getFontFamilyName();
                int fontStyle = ageAppearance.getFontStyle();
                if (fontFamilyName == null || fontFamilyName.length() <= 0) {
                    fontFamilyName = textAppearance.getFontFamilyName();
                }
                TextAppearance.Builder builder = new TextAppearance.Builder();
                if (textColor == 0) {
                    textColor = textAppearance.getTextColor();
                }
                TextAppearance.Builder textColor2 = builder.setTextColor(textColor);
                if (textSize < 1.0f) {
                    textSize = textAppearance.getTextSize();
                }
                textAppearance = textColor2.setTextSize(textSize).setFontFamilyName(fontFamilyName).setFontStyle(fontStyle).build();
            }
            this.f35953b = textAppearance;
            return this;
        }

        @NotNull
        public final Builder withBannerAppearance(@NotNull BannerAppearance bannerAppearance) {
            Intrinsics.checkNotNullParameter(bannerAppearance, "bannerAppearance");
            BannerAppearance bannerAppearance2 = this.f35952a;
            Intrinsics.checkNotNullParameter(bannerAppearance2, "bannerAppearance");
            if (bannerAppearance != null && !Intrinsics.areEqual(bannerAppearance2, bannerAppearance)) {
                int backgroundColor = bannerAppearance.getBackgroundColor();
                if (backgroundColor == 0) {
                    backgroundColor = bannerAppearance2.getBackgroundColor();
                }
                int borderColor = bannerAppearance.getBorderColor();
                if (borderColor == 0) {
                    borderColor = bannerAppearance2.getBorderColor();
                }
                float borderWidth = bannerAppearance.getBorderWidth();
                if (borderWidth < 0.0f) {
                    borderWidth = bannerAppearance2.getBorderWidth();
                }
                HorizontalOffset contentPadding = bannerAppearance2.getContentPadding();
                if (contentPadding != null) {
                    HorizontalOffset contentPadding2 = bannerAppearance.getContentPadding();
                    if (contentPadding2 != null && !Intrinsics.areEqual(contentPadding, contentPadding2)) {
                        contentPadding = new HorizontalOffset(contentPadding2.getLeft() >= 0.0f ? contentPadding2.getLeft() : 0.0f, contentPadding2.getRight() >= 0.0f ? contentPadding2.getRight() : 0.0f);
                    }
                } else {
                    contentPadding = null;
                }
                HorizontalOffset imageMargins = bannerAppearance.getImageMargins();
                if (imageMargins == null) {
                    imageMargins = bannerAppearance2.getImageMargins();
                }
                BannerAppearance.Builder builder = new BannerAppearance.Builder();
                builder.setBackgroundColor(backgroundColor);
                builder.setBorderColor(borderColor);
                builder.setBorderWidth(borderWidth);
                if (contentPadding != null) {
                    builder.setContentPadding(contentPadding);
                }
                if (imageMargins != null) {
                    builder.setImageMargins(imageMargins);
                }
                bannerAppearance2 = builder.build();
            }
            this.f35952a = bannerAppearance2;
            return this;
        }

        @NotNull
        public final Builder withBodyAppearance(@NotNull TextAppearance bodyAppearance) {
            Intrinsics.checkNotNullParameter(bodyAppearance, "bodyAppearance");
            TextAppearance textAppearance = this.f35954c;
            Intrinsics.checkNotNullParameter(textAppearance, "textAppearance");
            if (bodyAppearance != null && !Intrinsics.areEqual(textAppearance, bodyAppearance)) {
                int textColor = bodyAppearance.getTextColor();
                float textSize = bodyAppearance.getTextSize();
                String fontFamilyName = bodyAppearance.getFontFamilyName();
                int fontStyle = bodyAppearance.getFontStyle();
                if (fontFamilyName == null || fontFamilyName.length() <= 0) {
                    fontFamilyName = textAppearance.getFontFamilyName();
                }
                TextAppearance.Builder builder = new TextAppearance.Builder();
                if (textColor == 0) {
                    textColor = textAppearance.getTextColor();
                }
                TextAppearance.Builder textColor2 = builder.setTextColor(textColor);
                if (textSize < 1.0f) {
                    textSize = textAppearance.getTextSize();
                }
                textAppearance = textColor2.setTextSize(textSize).setFontFamilyName(fontFamilyName).setFontStyle(fontStyle).build();
            }
            this.f35954c = textAppearance;
            return this;
        }

        @NotNull
        public final Builder withCallToActionAppearance(@NotNull ButtonAppearance appearance) {
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            ButtonAppearance buttonAppearance = this.f35962k;
            Intrinsics.checkNotNullParameter(buttonAppearance, "buttonAppearance");
            if (appearance != null && !Intrinsics.areEqual(buttonAppearance, appearance)) {
                TextAppearance textAppearance = buttonAppearance.getTextAppearance();
                if (textAppearance != null) {
                    TextAppearance textAppearance2 = appearance.getTextAppearance();
                    Intrinsics.checkNotNullParameter(textAppearance, "textAppearance");
                    if (textAppearance2 != null && !Intrinsics.areEqual(textAppearance, textAppearance2)) {
                        int textColor = textAppearance2.getTextColor();
                        float textSize = textAppearance2.getTextSize();
                        String fontFamilyName = textAppearance2.getFontFamilyName();
                        int fontStyle = textAppearance2.getFontStyle();
                        if (fontFamilyName == null || fontFamilyName.length() <= 0) {
                            fontFamilyName = textAppearance.getFontFamilyName();
                        }
                        TextAppearance.Builder builder = new TextAppearance.Builder();
                        if (textColor == 0) {
                            textColor = textAppearance.getTextColor();
                        }
                        TextAppearance.Builder textColor2 = builder.setTextColor(textColor);
                        if (textSize < 1.0f) {
                            textSize = textAppearance.getTextSize();
                        }
                        textAppearance = textColor2.setTextSize(textSize).setFontFamilyName(fontFamilyName).setFontStyle(fontStyle).build();
                    }
                } else {
                    textAppearance = null;
                }
                int borderColor = appearance.getBorderColor();
                float borderWidth = appearance.getBorderWidth();
                int normalColor = appearance.getNormalColor();
                int pressedColor = appearance.getPressedColor();
                ButtonAppearance.Builder builder2 = new ButtonAppearance.Builder();
                if (textAppearance != null) {
                    builder2.setTextAppearance(textAppearance);
                }
                if (borderColor == 0) {
                    borderColor = buttonAppearance.getBorderColor();
                }
                builder2.setBorderColor(borderColor);
                if (borderWidth < 0.0f) {
                    borderWidth = buttonAppearance.getBorderWidth();
                }
                builder2.setBorderWidth(borderWidth);
                if (normalColor == 0) {
                    normalColor = buttonAppearance.getNormalColor();
                }
                builder2.setNormalColor(normalColor);
                if (pressedColor == 0) {
                    pressedColor = buttonAppearance.getPressedColor();
                }
                builder2.setPressedColor(pressedColor);
                buttonAppearance = builder2.build();
            }
            this.f35962k = buttonAppearance;
            return this;
        }

        @NotNull
        public final Builder withDomainAppearance(@NotNull TextAppearance domainAppearance) {
            Intrinsics.checkNotNullParameter(domainAppearance, "domainAppearance");
            TextAppearance textAppearance = this.f35955d;
            Intrinsics.checkNotNullParameter(textAppearance, "textAppearance");
            if (domainAppearance != null && !Intrinsics.areEqual(textAppearance, domainAppearance)) {
                int textColor = domainAppearance.getTextColor();
                float textSize = domainAppearance.getTextSize();
                String fontFamilyName = domainAppearance.getFontFamilyName();
                int fontStyle = domainAppearance.getFontStyle();
                if (fontFamilyName == null || fontFamilyName.length() <= 0) {
                    fontFamilyName = textAppearance.getFontFamilyName();
                }
                TextAppearance.Builder builder = new TextAppearance.Builder();
                if (textColor == 0) {
                    textColor = textAppearance.getTextColor();
                }
                TextAppearance.Builder textColor2 = builder.setTextColor(textColor);
                if (textSize < 1.0f) {
                    textSize = textAppearance.getTextSize();
                }
                textAppearance = textColor2.setTextSize(textSize).setFontFamilyName(fontFamilyName).setFontStyle(fontStyle).build();
            }
            this.f35955d = textAppearance;
            return this;
        }

        @NotNull
        public final Builder withFaviconAppearance(@NotNull ImageAppearance faviconAppearance) {
            Intrinsics.checkNotNullParameter(faviconAppearance, "faviconAppearance");
            ImageAppearance imageAppearance = this.f35961j;
            Intrinsics.checkNotNullParameter(imageAppearance, "imageAppearance");
            if (faviconAppearance != null && !Intrinsics.areEqual(imageAppearance, faviconAppearance)) {
                SizeConstraint widthConstraint = faviconAppearance.getWidthConstraint();
                if (widthConstraint == null) {
                    widthConstraint = imageAppearance.getWidthConstraint();
                }
                ImageAppearance.Builder builder = new ImageAppearance.Builder();
                if (widthConstraint != null) {
                    builder.setWidthConstraint(widthConstraint);
                }
                imageAppearance = builder.build();
            }
            this.f35961j = imageAppearance;
            return this;
        }

        @NotNull
        public final Builder withImageAppearance(@NotNull ImageAppearance imageAppearance) {
            Intrinsics.checkNotNullParameter(imageAppearance, "imageAppearance");
            ImageAppearance imageAppearance2 = this.f35960i;
            Intrinsics.checkNotNullParameter(imageAppearance2, "imageAppearance");
            if (imageAppearance != null && !Intrinsics.areEqual(imageAppearance2, imageAppearance)) {
                SizeConstraint widthConstraint = imageAppearance.getWidthConstraint();
                if (widthConstraint == null) {
                    widthConstraint = imageAppearance2.getWidthConstraint();
                }
                ImageAppearance.Builder builder = new ImageAppearance.Builder();
                if (widthConstraint != null) {
                    builder.setWidthConstraint(widthConstraint);
                }
                imageAppearance2 = builder.build();
            }
            this.f35960i = imageAppearance2;
            return this;
        }

        @NotNull
        public final Builder withRatingAppearance(@NotNull RatingAppearance ratingAppearance) {
            Intrinsics.checkNotNullParameter(ratingAppearance, "ratingAppearance");
            RatingAppearance ratingAppearance2 = this.f35963l;
            Intrinsics.checkNotNullParameter(ratingAppearance2, "ratingAppearance");
            if (ratingAppearance != null && !Intrinsics.areEqual(ratingAppearance2, ratingAppearance)) {
                int backgroundStarColor = ratingAppearance.getBackgroundStarColor();
                int progressStarColor = ratingAppearance.getProgressStarColor();
                if (backgroundStarColor == 0) {
                    backgroundStarColor = ratingAppearance2.getBackgroundStarColor();
                }
                if (progressStarColor == 0) {
                    progressStarColor = ratingAppearance2.getProgressStarColor();
                }
                ratingAppearance2 = new RatingAppearance.Builder().setBackgroundStarColor(backgroundStarColor).setProgressStarColor(progressStarColor).build();
            }
            this.f35963l = ratingAppearance2;
            return this;
        }

        @NotNull
        public final Builder withReviewCountAppearance(@NotNull TextAppearance reviewCountAppearance) {
            Intrinsics.checkNotNullParameter(reviewCountAppearance, "reviewCountAppearance");
            TextAppearance textAppearance = this.f35956e;
            Intrinsics.checkNotNullParameter(textAppearance, "textAppearance");
            if (reviewCountAppearance != null && !Intrinsics.areEqual(textAppearance, reviewCountAppearance)) {
                int textColor = reviewCountAppearance.getTextColor();
                float textSize = reviewCountAppearance.getTextSize();
                String fontFamilyName = reviewCountAppearance.getFontFamilyName();
                int fontStyle = reviewCountAppearance.getFontStyle();
                if (fontFamilyName == null || fontFamilyName.length() <= 0) {
                    fontFamilyName = textAppearance.getFontFamilyName();
                }
                TextAppearance.Builder builder = new TextAppearance.Builder();
                if (textColor == 0) {
                    textColor = textAppearance.getTextColor();
                }
                TextAppearance.Builder textColor2 = builder.setTextColor(textColor);
                if (textSize < 1.0f) {
                    textSize = textAppearance.getTextSize();
                }
                textAppearance = textColor2.setTextSize(textSize).setFontFamilyName(fontFamilyName).setFontStyle(fontStyle).build();
            }
            this.f35956e = textAppearance;
            return this;
        }

        @NotNull
        public final Builder withSponsoredAppearance(@NotNull TextAppearance sponsoredAppearance) {
            Intrinsics.checkNotNullParameter(sponsoredAppearance, "sponsoredAppearance");
            TextAppearance textAppearance = this.f35957f;
            Intrinsics.checkNotNullParameter(textAppearance, "textAppearance");
            if (sponsoredAppearance != null && !Intrinsics.areEqual(textAppearance, sponsoredAppearance)) {
                int textColor = sponsoredAppearance.getTextColor();
                float textSize = sponsoredAppearance.getTextSize();
                String fontFamilyName = sponsoredAppearance.getFontFamilyName();
                int fontStyle = sponsoredAppearance.getFontStyle();
                if (fontFamilyName == null || fontFamilyName.length() <= 0) {
                    fontFamilyName = textAppearance.getFontFamilyName();
                }
                TextAppearance.Builder builder = new TextAppearance.Builder();
                if (textColor == 0) {
                    textColor = textAppearance.getTextColor();
                }
                TextAppearance.Builder textColor2 = builder.setTextColor(textColor);
                if (textSize < 1.0f) {
                    textSize = textAppearance.getTextSize();
                }
                textAppearance = textColor2.setTextSize(textSize).setFontFamilyName(fontFamilyName).setFontStyle(fontStyle).build();
            }
            this.f35957f = textAppearance;
            return this;
        }

        @NotNull
        public final Builder withTitleAppearance(@NotNull TextAppearance titleAppearance) {
            Intrinsics.checkNotNullParameter(titleAppearance, "titleAppearance");
            TextAppearance textAppearance = this.f35958g;
            Intrinsics.checkNotNullParameter(textAppearance, "textAppearance");
            if (titleAppearance != null && !Intrinsics.areEqual(textAppearance, titleAppearance)) {
                int textColor = titleAppearance.getTextColor();
                float textSize = titleAppearance.getTextSize();
                String fontFamilyName = titleAppearance.getFontFamilyName();
                int fontStyle = titleAppearance.getFontStyle();
                if (fontFamilyName == null || fontFamilyName.length() <= 0) {
                    fontFamilyName = textAppearance.getFontFamilyName();
                }
                TextAppearance.Builder builder = new TextAppearance.Builder();
                if (textColor == 0) {
                    textColor = textAppearance.getTextColor();
                }
                TextAppearance.Builder textColor2 = builder.setTextColor(textColor);
                if (textSize < 1.0f) {
                    textSize = textAppearance.getTextSize();
                }
                textAppearance = textColor2.setTextSize(textSize).setFontFamilyName(fontFamilyName).setFontStyle(fontStyle).build();
            }
            this.f35958g = textAppearance;
            return this;
        }

        @NotNull
        public final Builder withWarningAppearance(@NotNull TextAppearance warningAppearance) {
            Intrinsics.checkNotNullParameter(warningAppearance, "warningAppearance");
            TextAppearance textAppearance = this.f35959h;
            Intrinsics.checkNotNullParameter(textAppearance, "textAppearance");
            if (warningAppearance != null && !Intrinsics.areEqual(textAppearance, warningAppearance)) {
                int textColor = warningAppearance.getTextColor();
                float textSize = warningAppearance.getTextSize();
                String fontFamilyName = warningAppearance.getFontFamilyName();
                int fontStyle = warningAppearance.getFontStyle();
                if (fontFamilyName == null || fontFamilyName.length() <= 0) {
                    fontFamilyName = textAppearance.getFontFamilyName();
                }
                TextAppearance.Builder builder = new TextAppearance.Builder();
                if (textColor == 0) {
                    textColor = textAppearance.getTextColor();
                }
                TextAppearance.Builder textColor2 = builder.setTextColor(textColor);
                if (textSize < 1.0f) {
                    textSize = textAppearance.getTextSize();
                }
                textAppearance = textColor2.setTextSize(textSize).setFontFamilyName(fontFamilyName).setFontStyle(fontStyle).build();
            }
            this.f35959h = textAppearance;
            return this;
        }
    }

    public static final class a implements Parcelable.Creator<NativeTemplateAppearance> {
        @Override // android.os.Parcelable.Creator
        public final NativeTemplateAppearance createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BannerAppearance createFromParcel = BannerAppearance.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<TextAppearance> creator = TextAppearance.CREATOR;
            TextAppearance createFromParcel2 = creator.createFromParcel(parcel);
            TextAppearance createFromParcel3 = creator.createFromParcel(parcel);
            TextAppearance createFromParcel4 = creator.createFromParcel(parcel);
            TextAppearance createFromParcel5 = creator.createFromParcel(parcel);
            TextAppearance createFromParcel6 = creator.createFromParcel(parcel);
            TextAppearance createFromParcel7 = creator.createFromParcel(parcel);
            TextAppearance createFromParcel8 = creator.createFromParcel(parcel);
            Parcelable.Creator<ImageAppearance> creator2 = ImageAppearance.CREATOR;
            return new NativeTemplateAppearance(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), ButtonAppearance.CREATOR.createFromParcel(parcel), RatingAppearance.CREATOR.createFromParcel(parcel), null);
        }

        @Override // android.os.Parcelable.Creator
        public final NativeTemplateAppearance[] newArray(int i4) {
            return new NativeTemplateAppearance[i4];
        }
    }

    public /* synthetic */ NativeTemplateAppearance(BannerAppearance bannerAppearance, TextAppearance textAppearance, TextAppearance textAppearance2, TextAppearance textAppearance3, TextAppearance textAppearance4, TextAppearance textAppearance5, TextAppearance textAppearance6, TextAppearance textAppearance7, ImageAppearance imageAppearance, ImageAppearance imageAppearance2, ButtonAppearance buttonAppearance, RatingAppearance ratingAppearance, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAppearance, textAppearance, textAppearance2, textAppearance3, textAppearance4, textAppearance5, textAppearance6, textAppearance7, imageAppearance, imageAppearance2, buttonAppearance, ratingAppearance);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(NativeTemplateAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance");
        NativeTemplateAppearance nativeTemplateAppearance = (NativeTemplateAppearance) obj;
        if (Intrinsics.areEqual(getBannerAppearance(), nativeTemplateAppearance.getBannerAppearance()) && Intrinsics.areEqual(getAgeAppearance(), nativeTemplateAppearance.getAgeAppearance()) && Intrinsics.areEqual(getBodyAppearance(), nativeTemplateAppearance.getBodyAppearance()) && Intrinsics.areEqual(getDomainAppearance(), nativeTemplateAppearance.getDomainAppearance()) && Intrinsics.areEqual(getReviewCountAppearance(), nativeTemplateAppearance.getReviewCountAppearance()) && Intrinsics.areEqual(getSponsoredAppearance(), nativeTemplateAppearance.getSponsoredAppearance()) && Intrinsics.areEqual(getTitleAppearance(), nativeTemplateAppearance.getTitleAppearance()) && Intrinsics.areEqual(getWarningAppearance(), nativeTemplateAppearance.getWarningAppearance()) && Intrinsics.areEqual(getFaviconAppearance(), nativeTemplateAppearance.getFaviconAppearance()) && Intrinsics.areEqual(getImageAppearance(), nativeTemplateAppearance.getImageAppearance()) && Intrinsics.areEqual(getCallToActionAppearance(), nativeTemplateAppearance.getCallToActionAppearance())) {
            return Intrinsics.areEqual(getRatingAppearance(), nativeTemplateAppearance.getRatingAppearance());
        }
        return false;
    }

    public int hashCode() {
        return getRatingAppearance().hashCode() + ((getCallToActionAppearance().hashCode() + ((getImageAppearance().hashCode() + ((getFaviconAppearance().hashCode() + ((getWarningAppearance().hashCode() + ((getTitleAppearance().hashCode() + ((getSponsoredAppearance().hashCode() + ((getReviewCountAppearance().hashCode() + ((getDomainAppearance().hashCode() + ((getBodyAppearance().hashCode() + ((getAgeAppearance().hashCode() + (getBannerAppearance().hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f35940b.writeToParcel(out, i4);
        this.f35941c.writeToParcel(out, i4);
        this.f35942d.writeToParcel(out, i4);
        this.f35943e.writeToParcel(out, i4);
        this.f35944f.writeToParcel(out, i4);
        this.f35945g.writeToParcel(out, i4);
        this.f35946h.writeToParcel(out, i4);
        this.f35947i.writeToParcel(out, i4);
        this.f35948j.writeToParcel(out, i4);
        this.f35949k.writeToParcel(out, i4);
        this.f35950l.writeToParcel(out, i4);
        this.f35951m.writeToParcel(out, i4);
    }

    private NativeTemplateAppearance(BannerAppearance bannerAppearance, TextAppearance textAppearance, TextAppearance textAppearance2, TextAppearance textAppearance3, TextAppearance textAppearance4, TextAppearance textAppearance5, TextAppearance textAppearance6, TextAppearance textAppearance7, ImageAppearance imageAppearance, ImageAppearance imageAppearance2, ButtonAppearance buttonAppearance, RatingAppearance ratingAppearance) {
        this.f35940b = bannerAppearance;
        this.f35941c = textAppearance;
        this.f35942d = textAppearance2;
        this.f35943e = textAppearance3;
        this.f35944f = textAppearance4;
        this.f35945g = textAppearance5;
        this.f35946h = textAppearance6;
        this.f35947i = textAppearance7;
        this.f35948j = imageAppearance;
        this.f35949k = imageAppearance2;
        this.f35950l = buttonAppearance;
        this.f35951m = ratingAppearance;
    }

    @Override // com.yandex.mobile.ads.impl.rt
    @NotNull
    public TextAppearance getAgeAppearance() {
        return this.f35941c;
    }

    @Override // com.yandex.mobile.ads.impl.rt
    @NotNull
    public BannerAppearance getBannerAppearance() {
        return this.f35940b;
    }

    @Override // com.yandex.mobile.ads.impl.rt
    @NotNull
    public TextAppearance getBodyAppearance() {
        return this.f35942d;
    }

    @Override // com.yandex.mobile.ads.impl.rt
    @NotNull
    public ButtonAppearance getCallToActionAppearance() {
        return this.f35950l;
    }

    @Override // com.yandex.mobile.ads.impl.rt
    @NotNull
    public TextAppearance getDomainAppearance() {
        return this.f35943e;
    }

    @Override // com.yandex.mobile.ads.impl.rt
    @NotNull
    public ImageAppearance getFaviconAppearance() {
        return this.f35948j;
    }

    @Override // com.yandex.mobile.ads.impl.rt
    @NotNull
    public ImageAppearance getImageAppearance() {
        return this.f35949k;
    }

    @Override // com.yandex.mobile.ads.impl.rt
    @NotNull
    public RatingAppearance getRatingAppearance() {
        return this.f35951m;
    }

    @Override // com.yandex.mobile.ads.impl.rt
    @NotNull
    public TextAppearance getReviewCountAppearance() {
        return this.f35944f;
    }

    @Override // com.yandex.mobile.ads.impl.rt
    @NotNull
    public TextAppearance getSponsoredAppearance() {
        return this.f35945g;
    }

    @Override // com.yandex.mobile.ads.impl.rt
    @NotNull
    public TextAppearance getTitleAppearance() {
        return this.f35946h;
    }

    @Override // com.yandex.mobile.ads.impl.rt
    @NotNull
    public TextAppearance getWarningAppearance() {
        return this.f35947i;
    }
}
