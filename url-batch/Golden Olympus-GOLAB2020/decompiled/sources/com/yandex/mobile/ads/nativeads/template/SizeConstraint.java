package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import b2.AbstractC1372b;
import com.yandex.mobile.ads.impl.y91;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class SizeConstraint implements Parcelable, y91 {

    @NotNull
    public static final Parcelable.Creator<SizeConstraint> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SizeConstraintType f35910b;

    /* renamed from: c, reason: collision with root package name */
    private final float f35911c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata
    public static final class SizeConstraintType implements y91.b {
        public static final SizeConstraintType FIXED;
        public static final SizeConstraintType FIXED_RATIO;
        public static final SizeConstraintType PREFERRED_RATIO;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ SizeConstraintType[] f35912c;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final y91.a f35913b;

        static {
            SizeConstraintType sizeConstraintType = new SizeConstraintType("FIXED", 0, y91.a.f34936b);
            FIXED = sizeConstraintType;
            SizeConstraintType sizeConstraintType2 = new SizeConstraintType("FIXED_RATIO", 1, y91.a.f34937c);
            FIXED_RATIO = sizeConstraintType2;
            SizeConstraintType sizeConstraintType3 = new SizeConstraintType("PREFERRED_RATIO", 2, y91.a.f34938d);
            PREFERRED_RATIO = sizeConstraintType3;
            SizeConstraintType[] sizeConstraintTypeArr = {sizeConstraintType, sizeConstraintType2, sizeConstraintType3};
            f35912c = sizeConstraintTypeArr;
            AbstractC1372b.a(sizeConstraintTypeArr);
        }

        private SizeConstraintType(String str, int i4, y91.a aVar) {
            this.f35913b = aVar;
        }

        public static SizeConstraintType valueOf(String str) {
            return (SizeConstraintType) Enum.valueOf(SizeConstraintType.class, str);
        }

        public static SizeConstraintType[] values() {
            return (SizeConstraintType[]) f35912c.clone();
        }

        @Override // com.yandex.mobile.ads.impl.y91.b
        @NotNull
        public final y91.a getType() {
            return this.f35913b;
        }
    }

    public static final class a implements Parcelable.Creator<SizeConstraint> {
        @Override // android.os.Parcelable.Creator
        public final SizeConstraint createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SizeConstraint(SizeConstraintType.valueOf(parcel.readString()), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final SizeConstraint[] newArray(int i4) {
            return new SizeConstraint[i4];
        }
    }

    public SizeConstraint(@NotNull SizeConstraintType sizeConstraintType, float f4) {
        Intrinsics.checkNotNullParameter(sizeConstraintType, "sizeConstraintType");
        this.f35910b = sizeConstraintType;
        this.f35911c = f4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(SizeConstraint.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.SizeConstraint");
        SizeConstraint sizeConstraint = (SizeConstraint) obj;
        return getSizeConstraintType() == sizeConstraint.getSizeConstraintType() && getValue() == sizeConstraint.getValue();
    }

    @Override // com.yandex.mobile.ads.impl.y91
    public float getValue() {
        return this.f35911c;
    }

    public int hashCode() {
        return Float.hashCode(getValue()) + (getSizeConstraintType().hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f35910b.name());
        out.writeFloat(this.f35911c);
    }

    @Override // com.yandex.mobile.ads.impl.y91
    @NotNull
    public SizeConstraintType getSizeConstraintType() {
        return this.f35910b;
    }
}
