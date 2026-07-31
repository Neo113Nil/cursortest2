package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.wz0;

/* loaded from: classes3.dex */
public final class h02 implements wz0.b {
    public static final Parcelable.Creator<h02> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final float f26513b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26514c;

    final class a implements Parcelable.Creator<h02> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final h02 createFromParcel(Parcel parcel) {
            return new h02(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h02[] newArray(int i4) {
            return new h02[i4];
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
        if (obj != null && h02.class == obj.getClass()) {
            h02 h02Var = (h02) obj;
            if (this.f26513b == h02Var.f26513b && this.f26514c == h02Var.f26514c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f26513b).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f26514c;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f26513b + ", svcTemporalLayerCount=" + this.f26514c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeFloat(this.f26513b);
        parcel.writeInt(this.f26514c);
    }

    public h02(int i4, float f4) {
        this.f26513b = f4;
        this.f26514c = i4;
    }

    private h02(Parcel parcel) {
        this.f26513b = parcel.readFloat();
        this.f26514c = parcel.readInt();
    }
}
