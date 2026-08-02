package com.google.android.gms.location;

import H.h;
import O3.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e2.AbstractC0408a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LocationRequest extends AbstractC0408a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new h(26);

    /* renamed from: a, reason: collision with root package name */
    public int f6042a = 102;

    /* renamed from: b, reason: collision with root package name */
    public long f6043b = 3600000;

    /* renamed from: c, reason: collision with root package name */
    public long f6044c = 600000;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6045d = false;

    /* renamed from: e, reason: collision with root package name */
    public long f6046e = Long.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public int f6047f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f6048g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public long f6049h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6050i = false;

    @Deprecated
    public LocationRequest() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.f6042a != locationRequest.f6042a) {
            return false;
        }
        long j4 = this.f6043b;
        long j5 = locationRequest.f6043b;
        if (j4 != j5 || this.f6044c != locationRequest.f6044c || this.f6045d != locationRequest.f6045d || this.f6046e != locationRequest.f6046e || this.f6047f != locationRequest.f6047f || this.f6048g != locationRequest.f6048g) {
            return false;
        }
        long j6 = this.f6049h;
        if (j6 >= j4) {
            j4 = j6;
        }
        long j7 = locationRequest.f6049h;
        if (j7 >= j5) {
            j5 = j7;
        }
        return j4 == j5 && this.f6050i == locationRequest.f6050i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6042a), Long.valueOf(this.f6043b), Float.valueOf(this.f6048g), Long.valueOf(this.f6049h)});
    }

    public final String toString() {
        int i4 = this.f6047f;
        float f4 = this.f6048g;
        long j4 = this.f6049h;
        StringBuilder sb = new StringBuilder("Request[");
        int i5 = this.f6042a;
        sb.append(i5 != 100 ? i5 != 102 ? i5 != 104 ? i5 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f6042a != 105) {
            sb.append(" requested=");
            sb.append(this.f6043b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f6044c);
        sb.append("ms");
        if (j4 > this.f6043b) {
            sb.append(" maxWait=");
            sb.append(j4);
            sb.append("ms");
        }
        if (f4 > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(f4);
            sb.append("m");
        }
        long j5 = this.f6046e;
        if (j5 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j5 - elapsedRealtime);
            sb.append("ms");
        }
        if (i4 != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(i4);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = l.D(parcel, 20293);
        int i5 = this.f6042a;
        l.G(parcel, 1, 4);
        parcel.writeInt(i5);
        long j4 = this.f6043b;
        l.G(parcel, 2, 8);
        parcel.writeLong(j4);
        long j5 = this.f6044c;
        l.G(parcel, 3, 8);
        parcel.writeLong(j5);
        boolean z = this.f6045d;
        l.G(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        long j6 = this.f6046e;
        l.G(parcel, 5, 8);
        parcel.writeLong(j6);
        int i6 = this.f6047f;
        l.G(parcel, 6, 4);
        parcel.writeInt(i6);
        float f4 = this.f6048g;
        l.G(parcel, 7, 4);
        parcel.writeFloat(f4);
        long j7 = this.f6049h;
        l.G(parcel, 8, 8);
        parcel.writeLong(j7);
        boolean z4 = this.f6050i;
        l.G(parcel, 9, 4);
        parcel.writeInt(z4 ? 1 : 0);
        l.F(parcel, D3);
    }
}
