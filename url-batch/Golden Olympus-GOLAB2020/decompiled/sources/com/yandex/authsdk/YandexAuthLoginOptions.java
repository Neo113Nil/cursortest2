package com.yandex.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.d;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class YandexAuthLoginOptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<YandexAuthLoginOptions> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final d f22289b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final YandexAuthLoginOptions createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new YandexAuthLoginOptions(d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final YandexAuthLoginOptions[] newArray(int i4) {
            return new YandexAuthLoginOptions[i4];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public YandexAuthLoginOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final d c() {
        return this.f22289b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof YandexAuthLoginOptions) && this.f22289b == ((YandexAuthLoginOptions) obj).f22289b;
    }

    public int hashCode() {
        return this.f22289b.hashCode();
    }

    public String toString() {
        return "YandexAuthLoginOptions(loginType=" + this.f22289b + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f22289b.name());
    }

    public YandexAuthLoginOptions(d loginType) {
        Intrinsics.checkNotNullParameter(loginType, "loginType");
        this.f22289b = loginType;
    }

    public /* synthetic */ YandexAuthLoginOptions(d dVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? d.NATIVE : dVar);
    }
}
