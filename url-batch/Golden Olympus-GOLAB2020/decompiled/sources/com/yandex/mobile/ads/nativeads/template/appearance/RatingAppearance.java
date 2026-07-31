package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.x91;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class RatingAppearance implements Parcelable, x91 {

    @NotNull
    public static final Parcelable.Creator<RatingAppearance> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final int f35964b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35965c;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private int f35966a;

        /* renamed from: b, reason: collision with root package name */
        private int f35967b;

        @NotNull
        public final RatingAppearance build() {
            return new RatingAppearance(this.f35966a, this.f35967b, null);
        }

        @NotNull
        public final Builder setBackgroundStarColor(int i4) {
            this.f35966a = i4;
            return this;
        }

        @NotNull
        public final Builder setProgressStarColor(int i4) {
            this.f35967b = i4;
            return this;
        }
    }

    public static final class a implements Parcelable.Creator<RatingAppearance> {
        @Override // android.os.Parcelable.Creator
        public final RatingAppearance createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RatingAppearance(parcel.readInt(), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingAppearance[] newArray(int i4) {
            return new RatingAppearance[i4];
        }
    }

    public /* synthetic */ RatingAppearance(int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, i5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(RatingAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance");
        RatingAppearance ratingAppearance = (RatingAppearance) obj;
        return getBackgroundStarColor() == ratingAppearance.getBackgroundStarColor() && getProgressStarColor() == ratingAppearance.getProgressStarColor();
    }

    @Override // com.yandex.mobile.ads.impl.x91
    public int getBackgroundStarColor() {
        return this.f35964b;
    }

    @Override // com.yandex.mobile.ads.impl.x91
    public int getProgressStarColor() {
        return this.f35965c;
    }

    public int hashCode() {
        return getProgressStarColor() + (getBackgroundStarColor() * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f35964b);
        out.writeInt(this.f35965c);
    }

    private RatingAppearance(int i4, int i5) {
        this.f35964b = i4;
        this.f35965c = i5;
    }
}
