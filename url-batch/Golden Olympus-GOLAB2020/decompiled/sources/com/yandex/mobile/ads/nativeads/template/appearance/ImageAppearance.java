package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.w91;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class ImageAppearance implements Parcelable, w91 {

    @NotNull
    public static final Parcelable.Creator<ImageAppearance> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final SizeConstraint f35934b;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private SizeConstraint f35935a;

        @NotNull
        public final ImageAppearance build() {
            return new ImageAppearance(this.f35935a, null);
        }

        @NotNull
        public final Builder setWidthConstraint(@Nullable SizeConstraint sizeConstraint) {
            this.f35935a = sizeConstraint;
            return this;
        }
    }

    public static final class a implements Parcelable.Creator<ImageAppearance> {
        @Override // android.os.Parcelable.Creator
        public final ImageAppearance createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ImageAppearance(parcel.readInt() == 0 ? null : SizeConstraint.CREATOR.createFromParcel(parcel), null);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageAppearance[] newArray(int i4) {
            return new ImageAppearance[i4];
        }
    }

    public /* synthetic */ ImageAppearance(SizeConstraint sizeConstraint, DefaultConstructorMarker defaultConstructorMarker) {
        this(sizeConstraint);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(ImageAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance");
        return Intrinsics.areEqual(getWidthConstraint(), ((ImageAppearance) obj).getWidthConstraint());
    }

    public int hashCode() {
        SizeConstraint widthConstraint = getWidthConstraint();
        if (widthConstraint != null) {
            return widthConstraint.hashCode();
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        SizeConstraint sizeConstraint = this.f35934b;
        if (sizeConstraint == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sizeConstraint.writeToParcel(out, i4);
        }
    }

    private ImageAppearance(SizeConstraint sizeConstraint) {
        this.f35934b = sizeConstraint;
    }

    @Override // com.yandex.mobile.ads.impl.w91
    @Nullable
    public SizeConstraint getWidthConstraint() {
        return this.f35934b;
    }
}
