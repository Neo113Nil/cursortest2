package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.t91;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class BannerAppearance implements Parcelable, t91 {

    @NotNull
    public static final Parcelable.Creator<BannerAppearance> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final HorizontalOffset f35914b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final HorizontalOffset f35915c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35916d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35917e;

    /* renamed from: f, reason: collision with root package name */
    private final float f35918f;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private int f35919a;

        /* renamed from: b, reason: collision with root package name */
        private int f35920b;

        /* renamed from: c, reason: collision with root package name */
        private float f35921c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private HorizontalOffset f35922d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private HorizontalOffset f35923e;

        @NotNull
        public final BannerAppearance build() {
            return new BannerAppearance(this.f35922d, this.f35923e, this.f35919a, this.f35920b, this.f35921c, null);
        }

        @NotNull
        public final Builder setBackgroundColor(int i4) {
            this.f35919a = i4;
            return this;
        }

        @NotNull
        public final Builder setBorderColor(int i4) {
            this.f35920b = i4;
            return this;
        }

        @NotNull
        public final Builder setBorderWidth(float f4) {
            this.f35921c = f4;
            return this;
        }

        @NotNull
        public final Builder setContentPadding(@Nullable HorizontalOffset horizontalOffset) {
            this.f35922d = horizontalOffset;
            return this;
        }

        @NotNull
        public final Builder setImageMargins(@Nullable HorizontalOffset horizontalOffset) {
            this.f35923e = horizontalOffset;
            return this;
        }
    }

    public static final class a implements Parcelable.Creator<BannerAppearance> {
        @Override // android.os.Parcelable.Creator
        public final BannerAppearance createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BannerAppearance(parcel.readInt() == 0 ? null : HorizontalOffset.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HorizontalOffset.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readFloat(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final BannerAppearance[] newArray(int i4) {
            return new BannerAppearance[i4];
        }
    }

    public /* synthetic */ BannerAppearance(HorizontalOffset horizontalOffset, HorizontalOffset horizontalOffset2, int i4, int i5, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(horizontalOffset, horizontalOffset2, i4, i5, f4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(BannerAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance");
        BannerAppearance bannerAppearance = (BannerAppearance) obj;
        return Intrinsics.areEqual(getContentPadding(), bannerAppearance.getContentPadding()) && Intrinsics.areEqual(getImageMargins(), bannerAppearance.getImageMargins()) && getBackgroundColor() == bannerAppearance.getBackgroundColor() && getBorderColor() == bannerAppearance.getBorderColor() && getBorderWidth() == bannerAppearance.getBorderWidth();
    }

    @Override // com.yandex.mobile.ads.impl.t91
    public int getBackgroundColor() {
        return this.f35916d;
    }

    @Override // com.yandex.mobile.ads.impl.t91
    public int getBorderColor() {
        return this.f35917e;
    }

    @Override // com.yandex.mobile.ads.impl.t91
    public float getBorderWidth() {
        return this.f35918f;
    }

    public int hashCode() {
        HorizontalOffset contentPadding = getContentPadding();
        int hashCode = (contentPadding != null ? contentPadding.hashCode() : 0) * 31;
        HorizontalOffset imageMargins = getImageMargins();
        return Float.hashCode(getBorderWidth()) + ((getBorderColor() + ((getBackgroundColor() + ((hashCode + (imageMargins != null ? imageMargins.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        HorizontalOffset horizontalOffset = this.f35914b;
        if (horizontalOffset == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            horizontalOffset.writeToParcel(out, i4);
        }
        HorizontalOffset horizontalOffset2 = this.f35915c;
        if (horizontalOffset2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            horizontalOffset2.writeToParcel(out, i4);
        }
        out.writeInt(this.f35916d);
        out.writeInt(this.f35917e);
        out.writeFloat(this.f35918f);
    }

    private BannerAppearance(HorizontalOffset horizontalOffset, HorizontalOffset horizontalOffset2, int i4, int i5, float f4) {
        this.f35914b = horizontalOffset;
        this.f35915c = horizontalOffset2;
        this.f35916d = i4;
        this.f35917e = i5;
        this.f35918f = f4;
    }

    @Override // com.yandex.mobile.ads.impl.t91
    @Nullable
    public HorizontalOffset getContentPadding() {
        return this.f35914b;
    }

    @Override // com.yandex.mobile.ads.impl.t91
    @Nullable
    public HorizontalOffset getImageMargins() {
        return this.f35915c;
    }
}
