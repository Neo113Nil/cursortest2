package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2907qa implements Parcelable {

    @NotNull
    public static final C2881pa CREATOR = new C2881pa();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f39652a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentifierStatus f39653b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39654c;

    public C2907qa(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f39652a = bool;
        this.f39653b = identifierStatus;
        this.f39654c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2907qa)) {
            return false;
        }
        C2907qa c2907qa = (C2907qa) obj;
        return Intrinsics.areEqual(this.f39652a, c2907qa.f39652a) && this.f39653b == c2907qa.f39653b && Intrinsics.areEqual(this.f39654c, c2907qa.f39654c);
    }

    public final int hashCode() {
        Boolean bool = this.f39652a;
        int hashCode = (this.f39653b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.f39654c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturesInternal(sslPinning=" + this.f39652a + ", status=" + this.f39653b + ", errorExplanation=" + this.f39654c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeValue(this.f39652a);
        parcel.writeString(this.f39653b.getValue());
        parcel.writeString(this.f39654c);
    }

    public C2907qa() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
