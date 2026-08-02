package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0411ca implements Parcelable {
    public static final C0385ba CREATOR = new C0385ba();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f7132a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentifierStatus f7133b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7134c;

    public C0411ca(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f7132a = bool;
        this.f7133b = identifierStatus;
        this.f7134c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0411ca)) {
            return false;
        }
        C0411ca c0411ca = (C0411ca) obj;
        return kotlin.jvm.internal.j.a(this.f7132a, c0411ca.f7132a) && this.f7133b == c0411ca.f7133b && kotlin.jvm.internal.j.a(this.f7134c, c0411ca.f7134c);
    }

    public final int hashCode() {
        Boolean bool = this.f7132a;
        int hashCode = (this.f7133b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.f7134c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturesInternal(sslPinning=" + this.f7132a + ", status=" + this.f7133b + ", errorExplanation=" + this.f7134c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeValue(this.f7132a);
        parcel.writeString(this.f7133b.getValue());
        parcel.writeString(this.f7134c);
    }

    public C0411ca() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
