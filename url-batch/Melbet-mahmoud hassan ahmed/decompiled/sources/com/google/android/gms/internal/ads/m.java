package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m implements b81 {
    public static final Parcelable.Creator<m> CREATOR = new k();

    /* renamed from: f, reason: collision with root package name */
    public final long f8134f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8135g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8136h;

    /* renamed from: i, reason: collision with root package name */
    public final long f8137i;

    /* renamed from: j, reason: collision with root package name */
    public final long f8138j;

    public m(long j7, long j8, long j9, long j10, long j11) {
        this.f8134f = j7;
        this.f8135g = j8;
        this.f8136h = j9;
        this.f8137i = j10;
        this.f8138j = j11;
    }

    /* synthetic */ m(Parcel parcel, l lVar) {
        this.f8134f = parcel.readLong();
        this.f8135g = parcel.readLong();
        this.f8136h = parcel.readLong();
        this.f8137i = parcel.readLong();
        this.f8138j = parcel.readLong();
    }

    @Override // com.google.android.gms.internal.ads.b81
    public final /* synthetic */ void b(ds dsVar) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f8134f == mVar.f8134f && this.f8135g == mVar.f8135g && this.f8136h == mVar.f8136h && this.f8137i == mVar.f8137i && this.f8138j == mVar.f8138j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f8134f;
        long j8 = this.f8135g;
        long j9 = this.f8136h;
        long j10 = this.f8137i;
        long j11 = this.f8138j;
        return ((((((((((int) (j7 ^ (j7 >>> 32))) + 527) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) ((j9 >>> 32) ^ j9))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        long j7 = this.f8134f;
        long j8 = this.f8135g;
        long j9 = this.f8136h;
        long j10 = this.f8137i;
        long j11 = this.f8138j;
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j7);
        sb.append(", photoSize=");
        sb.append(j8);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j9);
        sb.append(", videoStartPosition=");
        sb.append(j10);
        sb.append(", videoSize=");
        sb.append(j11);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f8134f);
        parcel.writeLong(this.f8135g);
        parcel.writeLong(this.f8136h);
        parcel.writeLong(this.f8137i);
        parcel.writeLong(this.f8138j);
    }
}
