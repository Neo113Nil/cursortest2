package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class pf4 extends wf4 {
    public static final Parcelable.Creator<pf4> CREATOR = new of4();

    /* renamed from: g, reason: collision with root package name */
    public final String f10230g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10231h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10232i;

    pf4(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i7 = n13.f8865a;
        this.f10230g = readString;
        this.f10231h = parcel.readString();
        this.f10232i = parcel.readString();
    }

    public pf4(String str, String str2, String str3) {
        super("COMM");
        this.f10230g = str;
        this.f10231h = str2;
        this.f10232i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pf4.class == obj.getClass()) {
            pf4 pf4Var = (pf4) obj;
            if (n13.p(this.f10231h, pf4Var.f10231h) && n13.p(this.f10230g, pf4Var.f10230g) && n13.p(this.f10232i, pf4Var.f10232i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10230g;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f10231h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10232i;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.wf4
    public final String toString() {
        String str = this.f13818f;
        String str2 = this.f10230g;
        String str3 = this.f10231h;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": language=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f13818f);
        parcel.writeString(this.f10230g);
        parcel.writeString(this.f10232i);
    }
}
