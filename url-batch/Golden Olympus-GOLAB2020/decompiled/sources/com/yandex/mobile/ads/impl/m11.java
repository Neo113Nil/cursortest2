package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.wz0;

/* loaded from: classes3.dex */
public final class m11 implements wz0.b {
    public static final Parcelable.Creator<m11> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f28828b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28829c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28830d;

    /* renamed from: e, reason: collision with root package name */
    public final long f28831e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28832f;

    final class a implements Parcelable.Creator<m11> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final m11 createFromParcel(Parcel parcel) {
            return new m11(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final m11[] newArray(int i4) {
            return new m11[i4];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m11.class == obj.getClass()) {
            m11 m11Var = (m11) obj;
            if (this.f28828b == m11Var.f28828b && this.f28829c == m11Var.f28829c && this.f28830d == m11Var.f28830d && this.f28831e == m11Var.f28831e && this.f28832f == m11Var.f28832f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f28828b;
        int i4 = (((int) (j4 ^ (j4 >>> 32))) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        long j5 = this.f28829c;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f28830d;
        int i6 = (i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f28831e;
        int i7 = (i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f28832f;
        return i7 + ((int) ((j8 >>> 32) ^ j8));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f28828b + ", photoSize=" + this.f28829c + ", photoPresentationTimestampUs=" + this.f28830d + ", videoStartPosition=" + this.f28831e + ", videoSize=" + this.f28832f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f28828b);
        parcel.writeLong(this.f28829c);
        parcel.writeLong(this.f28830d);
        parcel.writeLong(this.f28831e);
        parcel.writeLong(this.f28832f);
    }

    public m11(long j4, long j5, long j6, long j7, long j8) {
        this.f28828b = j4;
        this.f28829c = j5;
        this.f28830d = j6;
        this.f28831e = j7;
        this.f28832f = j8;
    }

    private m11(Parcel parcel) {
        this.f28828b = parcel.readLong();
        this.f28829c = parcel.readLong();
        this.f28830d = parcel.readLong();
        this.f28831e = parcel.readLong();
        this.f28832f = parcel.readLong();
    }
}
