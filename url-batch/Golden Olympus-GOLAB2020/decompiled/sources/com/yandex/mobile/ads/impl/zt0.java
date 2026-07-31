package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.wz0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zt0 implements wz0.b {
    public static final Parcelable.Creator<zt0> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f35763b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f35764c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35765d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35766e;

    final class a implements Parcelable.Creator<zt0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final zt0 createFromParcel(Parcel parcel) {
            return new zt0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final zt0[] newArray(int i4) {
            return new zt0[i4];
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
        if (obj != null && zt0.class == obj.getClass()) {
            zt0 zt0Var = (zt0) obj;
            if (this.f35763b.equals(zt0Var.f35763b) && Arrays.equals(this.f35764c, zt0Var.f35764c) && this.f35765d == zt0Var.f35765d && this.f35766e == zt0Var.f35766e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f35764c) + C1842c3.a(this.f35763b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31)) * 31) + this.f35765d) * 31) + this.f35766e;
    }

    public final String toString() {
        return "mdta: key=" + this.f35763b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f35763b);
        parcel.writeByteArray(this.f35764c);
        parcel.writeInt(this.f35765d);
        parcel.writeInt(this.f35766e);
    }

    public zt0(int i4, int i5, String str, byte[] bArr) {
        this.f35763b = str;
        this.f35764c = bArr;
        this.f35765d = i4;
        this.f35766e = i5;
    }

    private zt0(Parcel parcel) {
        this.f35763b = (String) u82.a(parcel.readString());
        this.f35764c = (byte[]) u82.a(parcel.createByteArray());
        this.f35765d = parcel.readInt();
        this.f35766e = parcel.readInt();
    }
}
