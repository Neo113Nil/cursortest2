package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.u91;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class ButtonAppearance implements Parcelable, u91 {

    @NotNull
    public static final Parcelable.Creator<ButtonAppearance> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final TextAppearance f35924b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35925c;

    /* renamed from: d, reason: collision with root package name */
    private final float f35926d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35927e;

    /* renamed from: f, reason: collision with root package name */
    private final int f35928f;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private int f35929a;

        /* renamed from: b, reason: collision with root package name */
        private float f35930b;

        /* renamed from: c, reason: collision with root package name */
        private int f35931c;

        /* renamed from: d, reason: collision with root package name */
        private int f35932d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private TextAppearance f35933e;

        @NotNull
        public final ButtonAppearance build() {
            return new ButtonAppearance(this.f35933e, this.f35929a, this.f35930b, this.f35931c, this.f35932d, null);
        }

        @NotNull
        public final Builder setBorderColor(int i4) {
            this.f35929a = i4;
            return this;
        }

        @NotNull
        public final Builder setBorderWidth(float f4) {
            this.f35930b = f4;
            return this;
        }

        @NotNull
        public final Builder setNormalColor(int i4) {
            this.f35931c = i4;
            return this;
        }

        @NotNull
        public final Builder setPressedColor(int i4) {
            this.f35932d = i4;
            return this;
        }

        @NotNull
        public final Builder setTextAppearance(@Nullable TextAppearance textAppearance) {
            this.f35933e = textAppearance;
            return this;
        }
    }

    public static final class a implements Parcelable.Creator<ButtonAppearance> {
        @Override // android.os.Parcelable.Creator
        public final ButtonAppearance createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ButtonAppearance(parcel.readInt() == 0 ? null : TextAppearance.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonAppearance[] newArray(int i4) {
            return new ButtonAppearance[i4];
        }
    }

    public /* synthetic */ ButtonAppearance(TextAppearance textAppearance, int i4, float f4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAppearance, i4, f4, i5, i6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(ButtonAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance");
        ButtonAppearance buttonAppearance = (ButtonAppearance) obj;
        return Intrinsics.areEqual(getTextAppearance(), buttonAppearance.getTextAppearance()) && getBorderColor() == buttonAppearance.getBorderColor() && getBorderWidth() == buttonAppearance.getBorderWidth() && getNormalColor() == buttonAppearance.getNormalColor() && getPressedColor() == buttonAppearance.getPressedColor();
    }

    @Override // com.yandex.mobile.ads.impl.u91
    public int getBorderColor() {
        return this.f35925c;
    }

    @Override // com.yandex.mobile.ads.impl.u91
    public float getBorderWidth() {
        return this.f35926d;
    }

    @Override // com.yandex.mobile.ads.impl.u91
    public int getNormalColor() {
        return this.f35927e;
    }

    @Override // com.yandex.mobile.ads.impl.u91
    public int getPressedColor() {
        return this.f35928f;
    }

    public int hashCode() {
        TextAppearance textAppearance = getTextAppearance();
        return getPressedColor() + ((getNormalColor() + ((Float.hashCode(getBorderWidth()) + ((getBorderColor() + ((textAppearance != null ? textAppearance.hashCode() : 0) * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        TextAppearance textAppearance = this.f35924b;
        if (textAppearance == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textAppearance.writeToParcel(out, i4);
        }
        out.writeInt(this.f35925c);
        out.writeFloat(this.f35926d);
        out.writeInt(this.f35927e);
        out.writeInt(this.f35928f);
    }

    private ButtonAppearance(TextAppearance textAppearance, int i4, float f4, int i5, int i6) {
        this.f35924b = textAppearance;
        this.f35925c = i4;
        this.f35926d = f4;
        this.f35927e = i5;
        this.f35928f = i6;
    }

    @Override // com.yandex.mobile.ads.impl.u91
    @Nullable
    public TextAppearance getTextAppearance() {
        return this.f35924b;
    }
}
