package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.y1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2354y1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C2354y1> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f34765b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f34766c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f34767d;

    /* renamed from: com.yandex.mobile.ads.impl.y1$a */
    public static final class a implements Parcelable.Creator<C2354y1> {
        @Override // android.os.Parcelable.Creator
        public final C2354y1 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C2354y1(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final C2354y1[] newArray(int i4) {
            return new C2354y1[i4];
        }
    }

    public C2354y1(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f34765b = str;
        this.f34766c = str2;
        this.f34767d = str3;
    }

    @Nullable
    public final String c() {
        return this.f34766c;
    }

    @Nullable
    public final String d() {
        return this.f34765b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final String e() {
        return this.f34767d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f34765b);
        out.writeString(this.f34766c);
        out.writeString(this.f34767d);
    }
}
