package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class W9 implements Parcelable {
    public static final V9 CREATOR = new V9();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f1103a;
    public final IdentifierStatus b;
    public final String c;

    public W9(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f1103a = bool;
        this.b = identifierStatus;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W9)) {
            return false;
        }
        W9 w9 = (W9) obj;
        return Intrinsics.areEqual(this.f1103a, w9.f1103a) && this.b == w9.b && Intrinsics.areEqual(this.c, w9.c);
    }

    public final int hashCode() {
        Boolean bool = this.f1103a;
        int hashCode = (this.b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturesInternal(sslPinning=" + this.f1103a + ", status=" + this.b + ", errorExplanation=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f1103a);
        parcel.writeString(this.b.getValue());
        parcel.writeString(this.c);
    }

    public W9() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
