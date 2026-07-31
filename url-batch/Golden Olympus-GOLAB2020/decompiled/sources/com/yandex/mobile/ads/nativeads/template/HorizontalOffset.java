package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.v91;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class HorizontalOffset implements v91, Parcelable {

    @NotNull
    public static final Parcelable.Creator<HorizontalOffset> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final float f35907b;

    /* renamed from: c, reason: collision with root package name */
    private final float f35908c;

    public static final class a implements Parcelable.Creator<HorizontalOffset> {
        @Override // android.os.Parcelable.Creator
        public final HorizontalOffset createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HorizontalOffset(parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final HorizontalOffset[] newArray(int i4) {
            return new HorizontalOffset[i4];
        }
    }

    public HorizontalOffset(float f4, float f5) {
        this.f35907b = f4;
        this.f35908c = f5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(HorizontalOffset.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.HorizontalOffset");
        HorizontalOffset horizontalOffset = (HorizontalOffset) obj;
        return getLeft() == horizontalOffset.getLeft() && getRight() == horizontalOffset.getRight();
    }

    @Override // com.yandex.mobile.ads.impl.v91
    public float getLeft() {
        return this.f35907b;
    }

    @Override // com.yandex.mobile.ads.impl.v91
    public float getRight() {
        return this.f35908c;
    }

    public int hashCode() {
        return Float.hashCode(getRight()) + (Float.hashCode(getLeft()) * 31);
    }

    @NotNull
    public String toString() {
        return getLeft() + ", " + getRight();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeFloat(this.f35907b);
        out.writeFloat(this.f35908c);
    }
}
