package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.uv0;
import com.yandex.mobile.ads.impl.wz0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class bh1 implements wz0.b {
    public static final Parcelable.Creator<bh1> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f23807b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23808c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23809d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23810e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23811f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23812g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23813h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f23814i;

    final class a implements Parcelable.Creator<bh1> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final bh1 createFromParcel(Parcel parcel) {
            return new bh1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final bh1[] newArray(int i4) {
            return new bh1[i4];
        }
    }

    public bh1(int i4, String str, String str2, int i5, int i6, int i7, int i8, byte[] bArr) {
        this.f23807b = i4;
        this.f23808c = str;
        this.f23809d = str2;
        this.f23810e = i5;
        this.f23811f = i6;
        this.f23812g = i7;
        this.f23813h = i8;
        this.f23814i = bArr;
    }

    @Override // com.yandex.mobile.ads.impl.wz0.b
    public final void a(uv0.a aVar) {
        aVar.a(this.f23807b, this.f23814i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bh1.class == obj.getClass()) {
            bh1 bh1Var = (bh1) obj;
            if (this.f23807b == bh1Var.f23807b && this.f23808c.equals(bh1Var.f23808c) && this.f23809d.equals(bh1Var.f23809d) && this.f23810e == bh1Var.f23810e && this.f23811f == bh1Var.f23811f && this.f23812g == bh1Var.f23812g && this.f23813h == bh1Var.f23813h && Arrays.equals(this.f23814i, bh1Var.f23814i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23814i) + ((((((((C1842c3.a(this.f23809d, C1842c3.a(this.f23808c, (this.f23807b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31, 31), 31) + this.f23810e) * 31) + this.f23811f) * 31) + this.f23812g) * 31) + this.f23813h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f23808c + ", description=" + this.f23809d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f23807b);
        parcel.writeString(this.f23808c);
        parcel.writeString(this.f23809d);
        parcel.writeInt(this.f23810e);
        parcel.writeInt(this.f23811f);
        parcel.writeInt(this.f23812g);
        parcel.writeInt(this.f23813h);
        parcel.writeByteArray(this.f23814i);
    }

    bh1(Parcel parcel) {
        this.f23807b = parcel.readInt();
        this.f23808c = (String) u82.a(parcel.readString());
        this.f23809d = (String) u82.a(parcel.readString());
        this.f23810e = parcel.readInt();
        this.f23811f = parcel.readInt();
        this.f23812g = parcel.readInt();
        this.f23813h = parcel.readInt();
        this.f23814i = (byte[]) u82.a(parcel.createByteArray());
    }
}
