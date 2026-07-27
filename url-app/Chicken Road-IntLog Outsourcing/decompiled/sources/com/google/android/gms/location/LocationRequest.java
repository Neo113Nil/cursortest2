package com.google.android.gms.location;

import B1.c;
import a.AbstractC0169a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p1.AbstractC1380a;

/* loaded from: classes.dex */
public final class LocationRequest extends AbstractC1380a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new c(3);

    /* renamed from: a, reason: collision with root package name */
    public int f5301a = 102;

    /* renamed from: b, reason: collision with root package name */
    public long f5302b = 3600000;

    /* renamed from: c, reason: collision with root package name */
    public long f5303c = 600000;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5304d = false;

    /* renamed from: e, reason: collision with root package name */
    public long f5305e = Long.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public int f5306f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f5307g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public long f5308h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5309i = false;

    @Deprecated
    public LocationRequest() {
    }

    public static void b(long j2) {
        if (j2 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("invalid interval: ");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(int i2) {
        if (i2 == 100 || i2 == 102 || i2 == 104 || i2 == 105) {
            this.f5301a = i2;
            return;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("invalid quality: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f5301a == locationRequest.f5301a) {
                long j2 = this.f5302b;
                long j6 = locationRequest.f5302b;
                if (j2 == j6 && this.f5303c == locationRequest.f5303c && this.f5304d == locationRequest.f5304d && this.f5305e == locationRequest.f5305e && this.f5306f == locationRequest.f5306f && this.f5307g == locationRequest.f5307g) {
                    long j7 = this.f5308h;
                    if (j7 >= j2) {
                        j2 = j7;
                    }
                    long j8 = locationRequest.f5308h;
                    if (j8 >= j6) {
                        j6 = j8;
                    }
                    if (j2 == j6 && this.f5309i == locationRequest.f5309i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5301a), Long.valueOf(this.f5302b), Float.valueOf(this.f5307g), Long.valueOf(this.f5308h)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request[");
        int i2 = this.f5301a;
        sb.append(i2 != 100 ? i2 != 102 ? i2 != 104 ? i2 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f5301a != 105) {
            sb.append(" requested=");
            sb.append(this.f5302b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f5303c);
        sb.append("ms");
        if (this.f5308h > this.f5302b) {
            sb.append(" maxWait=");
            sb.append(this.f5308h);
            sb.append("ms");
        }
        float f3 = this.f5307g;
        if (f3 > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(f3);
            sb.append("m");
        }
        long j2 = this.f5305e;
        if (j2 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j2 - elapsedRealtime);
            sb.append("ms");
        }
        int i3 = this.f5306f;
        if (i3 != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(i3);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        int i3 = this.f5301a;
        AbstractC0169a.T(parcel, 1, 4);
        parcel.writeInt(i3);
        long j2 = this.f5302b;
        AbstractC0169a.T(parcel, 2, 8);
        parcel.writeLong(j2);
        long j6 = this.f5303c;
        AbstractC0169a.T(parcel, 3, 8);
        parcel.writeLong(j6);
        boolean z = this.f5304d;
        AbstractC0169a.T(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        AbstractC0169a.T(parcel, 5, 8);
        parcel.writeLong(this.f5305e);
        AbstractC0169a.T(parcel, 6, 4);
        parcel.writeInt(this.f5306f);
        AbstractC0169a.T(parcel, 7, 4);
        parcel.writeFloat(this.f5307g);
        long j7 = this.f5308h;
        AbstractC0169a.T(parcel, 8, 8);
        parcel.writeLong(j7);
        boolean z5 = this.f5309i;
        AbstractC0169a.T(parcel, 9, 4);
        parcel.writeInt(z5 ? 1 : 0);
        AbstractC0169a.S(parcel, R5);
    }
}
