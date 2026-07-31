package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class yf4 extends wf4 {
    public static final Parcelable.Creator<yf4> CREATOR = new xf4();

    /* renamed from: g, reason: collision with root package name */
    public final String f14671g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14672h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14673i;

    yf4(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i7 = n13.f8865a;
        this.f14671g = readString;
        this.f14672h = parcel.readString();
        this.f14673i = parcel.readString();
    }

    public yf4(String str, String str2, String str3) {
        super("----");
        this.f14671g = str;
        this.f14672h = str2;
        this.f14673i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yf4.class == obj.getClass()) {
            yf4 yf4Var = (yf4) obj;
            if (n13.p(this.f14672h, yf4Var.f14672h) && n13.p(this.f14671g, yf4Var.f14671g) && n13.p(this.f14673i, yf4Var.f14673i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f14671g;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f14672h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14673i;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.wf4
    public final String toString() {
        String str = this.f13818f;
        String str2 = this.f14671g;
        String str3 = this.f14672h;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 23 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": domain=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f13818f);
        parcel.writeString(this.f14671g);
        parcel.writeString(this.f14673i);
    }
}
