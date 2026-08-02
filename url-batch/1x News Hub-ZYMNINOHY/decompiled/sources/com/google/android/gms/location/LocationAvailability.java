package com.google.android.gms.location;

import C2.b;
import H.h;
import O0.a;
import a1.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new h(19);

    /* renamed from: a, reason: collision with root package name */
    public int f2967a;

    /* renamed from: b, reason: collision with root package name */
    public int f2968b;

    /* renamed from: c, reason: collision with root package name */
    public long f2969c;

    /* renamed from: d, reason: collision with root package name */
    public int f2970d;

    /* renamed from: e, reason: collision with root package name */
    public c[] f2971e;

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f2967a == locationAvailability.f2967a && this.f2968b == locationAvailability.f2968b && this.f2969c == locationAvailability.f2969c && this.f2970d == locationAvailability.f2970d && Arrays.equals(this.f2971e, locationAvailability.f2971e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2970d), Integer.valueOf(this.f2967a), Integer.valueOf(this.f2968b), Long.valueOf(this.f2969c), this.f2971e});
    }

    public final String toString() {
        boolean z = this.f2970d < 1000;
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = b.S(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f2967a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f2968b);
        b.U(parcel, 3, 8);
        parcel.writeLong(this.f2969c);
        b.U(parcel, 4, 4);
        parcel.writeInt(this.f2970d);
        b.P(parcel, 5, this.f2971e, i3);
        b.T(parcel, S2);
    }
}
