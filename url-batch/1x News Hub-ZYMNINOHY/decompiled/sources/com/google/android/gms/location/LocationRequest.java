package com.google.android.gms.location;

import C2.b;
import H.h;
import O0.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new h(20);

    /* renamed from: a, reason: collision with root package name */
    public int f2972a = 102;

    /* renamed from: b, reason: collision with root package name */
    public long f2973b = 3600000;

    /* renamed from: c, reason: collision with root package name */
    public long f2974c = 600000;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2975d = false;

    /* renamed from: e, reason: collision with root package name */
    public long f2976e = Long.MAX_VALUE;
    public int f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f2977g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public long f2978h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2979i = false;

    @Deprecated
    public LocationRequest() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.f2972a != locationRequest.f2972a) {
            return false;
        }
        long j3 = this.f2973b;
        long j4 = locationRequest.f2973b;
        if (j3 != j4 || this.f2974c != locationRequest.f2974c || this.f2975d != locationRequest.f2975d || this.f2976e != locationRequest.f2976e || this.f != locationRequest.f || this.f2977g != locationRequest.f2977g) {
            return false;
        }
        long j5 = this.f2978h;
        if (j5 >= j3) {
            j3 = j5;
        }
        long j6 = locationRequest.f2978h;
        if (j6 >= j4) {
            j4 = j6;
        }
        return j3 == j4 && this.f2979i == locationRequest.f2979i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2972a), Long.valueOf(this.f2973b), Float.valueOf(this.f2977g), Long.valueOf(this.f2978h)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request[");
        int i3 = this.f2972a;
        sb.append(i3 != 100 ? i3 != 102 ? i3 != 104 ? i3 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f2972a != 105) {
            sb.append(" requested=");
            sb.append(this.f2973b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f2974c);
        sb.append("ms");
        long j3 = this.f2973b;
        long j4 = this.f2978h;
        if (j4 > j3) {
            sb.append(" maxWait=");
            sb.append(j4);
            sb.append("ms");
        }
        float f = this.f2977g;
        if (f > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(f);
            sb.append("m");
        }
        long j5 = this.f2976e;
        if (j5 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j5 - elapsedRealtime);
            sb.append("ms");
        }
        int i4 = this.f;
        if (i4 != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(i4);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = b.S(parcel, 20293);
        int i4 = this.f2972a;
        b.U(parcel, 1, 4);
        parcel.writeInt(i4);
        long j3 = this.f2973b;
        b.U(parcel, 2, 8);
        parcel.writeLong(j3);
        long j4 = this.f2974c;
        b.U(parcel, 3, 8);
        parcel.writeLong(j4);
        b.U(parcel, 4, 4);
        parcel.writeInt(this.f2975d ? 1 : 0);
        b.U(parcel, 5, 8);
        parcel.writeLong(this.f2976e);
        b.U(parcel, 6, 4);
        parcel.writeInt(this.f);
        b.U(parcel, 7, 4);
        parcel.writeFloat(this.f2977g);
        b.U(parcel, 8, 8);
        parcel.writeLong(this.f2978h);
        boolean z = this.f2979i;
        b.U(parcel, 9, 4);
        parcel.writeInt(z ? 1 : 0);
        b.T(parcel, S2);
    }
}
