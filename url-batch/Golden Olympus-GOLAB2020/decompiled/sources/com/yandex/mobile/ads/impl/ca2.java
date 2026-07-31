package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import b2.AbstractC1372b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ca2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ca2> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final b f24145b;

    /* renamed from: c, reason: collision with root package name */
    private final float f24146c;

    public static final class a implements Parcelable.Creator<ca2> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final ca2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "source");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ca2(parcel.readInt() == -1 ? null : b.values()[parcel.readInt()], parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final ca2[] newArray(int i4) {
            return new ca2[i4];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f24147b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f24148c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f24149d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f24150e;

        static {
            b bVar = new b(0, "MILLISECONDS");
            f24147b = bVar;
            b bVar2 = new b(1, "PERCENTS");
            f24148c = bVar2;
            b bVar3 = new b(2, "POSITION");
            f24149d = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            f24150e = bVarArr;
            AbstractC1372b.a(bVarArr);
        }

        private b(int i4, String str) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f24150e.clone();
        }
    }

    public ca2(@Nullable b bVar, float f4) {
        this.f24145b = bVar;
        this.f24146c = f4;
    }

    @Nullable
    public final b c() {
        return this.f24145b;
    }

    public final float d() {
        return this.f24146c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i4) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        b bVar = this.f24145b;
        dest.writeInt(bVar != null ? bVar.ordinal() : -1);
        dest.writeFloat(this.f24146c);
    }
}
