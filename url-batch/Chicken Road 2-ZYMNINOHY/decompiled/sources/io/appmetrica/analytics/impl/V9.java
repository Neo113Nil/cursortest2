package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes.dex */
public final class V9 implements Parcelable {
    public static final U9 CREATOR = new U9();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f11110a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentifierStatus f11111b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11112c;

    public V9(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f11110a = bool;
        this.f11111b = identifierStatus;
        this.f11112c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V9)) {
            return false;
        }
        V9 v9 = (V9) obj;
        return kotlin.jvm.internal.i.a(this.f11110a, v9.f11110a) && this.f11111b == v9.f11111b && kotlin.jvm.internal.i.a(this.f11112c, v9.f11112c);
    }

    public final int hashCode() {
        Boolean bool = this.f11110a;
        int hashCode = (this.f11111b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.f11112c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturesInternal(sslPinning=" + this.f11110a + ", status=" + this.f11111b + ", errorExplanation=" + this.f11112c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeValue(this.f11110a);
        parcel.writeString(this.f11111b.getValue());
        parcel.writeString(this.f11112c);
    }

    public V9() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
