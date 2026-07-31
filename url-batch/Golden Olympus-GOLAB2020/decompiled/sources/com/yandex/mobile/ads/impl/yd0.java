package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class yd0 extends zh0 {
    public static final Parcelable.Creator<yd0> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f35079c;

    /* renamed from: d, reason: collision with root package name */
    public final String f35080d;

    /* renamed from: e, reason: collision with root package name */
    public final String f35081e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f35082f;

    final class a implements Parcelable.Creator<yd0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final yd0 createFromParcel(Parcel parcel) {
            return new yd0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final yd0[] newArray(int i4) {
            return new yd0[i4];
        }
    }

    yd0(Parcel parcel) {
        super("GEOB");
        this.f35079c = (String) u82.a(parcel.readString());
        this.f35080d = (String) u82.a(parcel.readString());
        this.f35081e = (String) u82.a(parcel.readString());
        this.f35082f = (byte[]) u82.a(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yd0.class == obj.getClass()) {
            yd0 yd0Var = (yd0) obj;
            if (u82.a(this.f35079c, yd0Var.f35079c) && u82.a(this.f35080d, yd0Var.f35080d) && u82.a(this.f35081e, yd0Var.f35081e) && Arrays.equals(this.f35082f, yd0Var.f35082f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f35079c;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f35080d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f35081e;
        return Arrays.hashCode(this.f35082f) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.yandex.mobile.ads.impl.zh0
    public final String toString() {
        return this.f35592b + ": mimeType=" + this.f35079c + ", filename=" + this.f35080d + ", description=" + this.f35081e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f35079c);
        parcel.writeString(this.f35080d);
        parcel.writeString(this.f35081e);
        parcel.writeByteArray(this.f35082f);
    }

    public yd0(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f35079c = str;
        this.f35080d = str2;
        this.f35081e = str3;
        this.f35082f = bArr;
    }
}
