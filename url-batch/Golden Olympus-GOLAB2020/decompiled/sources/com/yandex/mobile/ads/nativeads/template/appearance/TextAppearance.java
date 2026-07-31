package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.z91;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class TextAppearance implements Parcelable, z91 {

    @NotNull
    public static final Parcelable.Creator<TextAppearance> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final int f35968b;

    /* renamed from: c, reason: collision with root package name */
    private final float f35969c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35970d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f35971e;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private int f35972a;

        /* renamed from: b, reason: collision with root package name */
        private float f35973b;

        /* renamed from: c, reason: collision with root package name */
        private int f35974c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private String f35975d;

        @NotNull
        public final TextAppearance build() {
            return new TextAppearance(this.f35972a, this.f35973b, this.f35974c, this.f35975d, null);
        }

        @NotNull
        public final Builder setFontFamilyName(@Nullable String str) {
            this.f35975d = str;
            return this;
        }

        @NotNull
        public final Builder setFontStyle(int i4) {
            this.f35974c = i4;
            return this;
        }

        @NotNull
        public final Builder setTextColor(int i4) {
            this.f35972a = i4;
            return this;
        }

        @NotNull
        public final Builder setTextSize(float f4) {
            this.f35973b = f4;
            return this;
        }
    }

    public static final class a implements Parcelable.Creator<TextAppearance> {
        @Override // android.os.Parcelable.Creator
        public final TextAppearance createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TextAppearance(parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readString(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final TextAppearance[] newArray(int i4) {
            return new TextAppearance[i4];
        }
    }

    public /* synthetic */ TextAppearance(int i4, float f4, int i5, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, f4, i5, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(TextAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance");
        TextAppearance textAppearance = (TextAppearance) obj;
        if (getTextColor() == textAppearance.getTextColor() && getTextSize() == textAppearance.getTextSize() && getFontStyle() == textAppearance.getFontStyle()) {
            return Intrinsics.areEqual(getFontFamilyName(), textAppearance.getFontFamilyName());
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.z91
    @Nullable
    public String getFontFamilyName() {
        return this.f35971e;
    }

    @Override // com.yandex.mobile.ads.impl.z91
    public int getFontStyle() {
        return this.f35970d;
    }

    @Override // com.yandex.mobile.ads.impl.z91
    public int getTextColor() {
        return this.f35968b;
    }

    @Override // com.yandex.mobile.ads.impl.z91
    public float getTextSize() {
        return this.f35969c;
    }

    public int hashCode() {
        int fontStyle = (getFontStyle() + ((Float.hashCode(getTextSize()) + (getTextColor() * 31)) * 31)) * 31;
        String fontFamilyName = getFontFamilyName();
        return fontStyle + (fontFamilyName != null ? fontFamilyName.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f35968b);
        out.writeFloat(this.f35969c);
        out.writeInt(this.f35970d);
        out.writeString(this.f35971e);
    }

    private TextAppearance(int i4, float f4, int i5, String str) {
        this.f35968b = i4;
        this.f35969c = f4;
        this.f35970d = i5;
        this.f35971e = str;
    }
}
