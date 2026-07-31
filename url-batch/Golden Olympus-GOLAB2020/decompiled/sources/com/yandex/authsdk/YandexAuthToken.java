package com.yandex.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class YandexAuthToken implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<YandexAuthToken> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final String f22293b;

    /* renamed from: c, reason: collision with root package name */
    private final long f22294c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final YandexAuthToken createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new YandexAuthToken(parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final YandexAuthToken[] newArray(int i4) {
            return new YandexAuthToken[i4];
        }
    }

    public YandexAuthToken(String value, long j4) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22293b = value;
        this.f22294c = j4;
    }

    public final String c() {
        return this.f22293b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YandexAuthToken)) {
            return false;
        }
        YandexAuthToken yandexAuthToken = (YandexAuthToken) obj;
        return Intrinsics.areEqual(this.f22293b, yandexAuthToken.f22293b) && this.f22294c == yandexAuthToken.f22294c;
    }

    public int hashCode() {
        return (this.f22293b.hashCode() * 31) + Long.hashCode(this.f22294c);
    }

    public String toString() {
        return YandexAuthToken.class.getSimpleName() + "{token='" + this.f22293b + "', expiresIn=" + this.f22294c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f22293b);
        out.writeLong(this.f22294c);
    }
}
