package com.google.android.gms.location;

import H.h;
import O3.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e2.AbstractC0408a;
import java.util.Arrays;
import q2.c;

/* loaded from: classes.dex */
public final class LocationAvailability extends AbstractC0408a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new h(25);

    /* renamed from: a, reason: collision with root package name */
    public int f6037a;

    /* renamed from: b, reason: collision with root package name */
    public int f6038b;

    /* renamed from: c, reason: collision with root package name */
    public long f6039c;

    /* renamed from: d, reason: collision with root package name */
    public int f6040d;

    /* renamed from: e, reason: collision with root package name */
    public c[] f6041e;

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f6037a == locationAvailability.f6037a && this.f6038b == locationAvailability.f6038b && this.f6039c == locationAvailability.f6039c && this.f6040d == locationAvailability.f6040d && Arrays.equals(this.f6041e, locationAvailability.f6041e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6040d), Integer.valueOf(this.f6037a), Integer.valueOf(this.f6038b), Long.valueOf(this.f6039c), this.f6041e});
    }

    public final String toString() {
        boolean z = this.f6040d < 1000;
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = l.D(parcel, 20293);
        int i5 = this.f6037a;
        l.G(parcel, 1, 4);
        parcel.writeInt(i5);
        int i6 = this.f6038b;
        l.G(parcel, 2, 4);
        parcel.writeInt(i6);
        long j4 = this.f6039c;
        l.G(parcel, 3, 8);
        parcel.writeLong(j4);
        int i7 = this.f6040d;
        l.G(parcel, 4, 4);
        parcel.writeInt(i7);
        l.B(parcel, 5, this.f6041e, i4);
        l.F(parcel, D3);
    }
}
