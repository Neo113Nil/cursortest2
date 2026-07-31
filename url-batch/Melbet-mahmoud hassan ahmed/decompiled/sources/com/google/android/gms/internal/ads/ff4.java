package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ff4 implements b81 {
    public static final Parcelable.Creator<ff4> CREATOR = new ef4();

    /* renamed from: f, reason: collision with root package name */
    public final int f5100f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5101g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5102h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5103i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5104j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5105k;

    public ff4(int i7, String str, String str2, String str3, boolean z6, int i8) {
        boolean z7 = true;
        if (i8 != -1 && i8 <= 0) {
            z7 = false;
        }
        wu1.d(z7);
        this.f5100f = i7;
        this.f5101g = str;
        this.f5102h = str2;
        this.f5103i = str3;
        this.f5104j = z6;
        this.f5105k = i8;
    }

    ff4(Parcel parcel) {
        this.f5100f = parcel.readInt();
        this.f5101g = parcel.readString();
        this.f5102h = parcel.readString();
        this.f5103i = parcel.readString();
        this.f5104j = n13.v(parcel);
        this.f5105k = parcel.readInt();
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
        if (obj != null && ff4.class == obj.getClass()) {
            ff4 ff4Var = (ff4) obj;
            if (this.f5100f == ff4Var.f5100f && n13.p(this.f5101g, ff4Var.f5101g) && n13.p(this.f5102h, ff4Var.f5102h) && n13.p(this.f5103i, ff4Var.f5103i) && this.f5104j == ff4Var.f5104j && this.f5105k == ff4Var.f5105k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (this.f5100f + 527) * 31;
        String str = this.f5101g;
        int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5102h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5103i;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f5104j ? 1 : 0)) * 31) + this.f5105k;
    }

    public final String toString() {
        String str = this.f5102h;
        String str2 = this.f5101g;
        int i7 = this.f5100f;
        int i8 = this.f5105k;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(i7);
        sb.append(", metadataInterval=");
        sb.append(i8);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f5100f);
        parcel.writeString(this.f5101g);
        parcel.writeString(this.f5102h);
        parcel.writeString(this.f5103i);
        n13.o(parcel, this.f5104j);
        parcel.writeInt(this.f5105k);
    }
}
