package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class qj extends sj {
    public static final Parcelable.Creator<qj> CREATOR = new pj();

    /* renamed from: g, reason: collision with root package name */
    public final String f10712g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10713h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10714i;

    qj(Parcel parcel) {
        super("COMM");
        this.f10712g = parcel.readString();
        this.f10713h = parcel.readString();
        this.f10714i = parcel.readString();
    }

    public qj(String str, String str2, String str3) {
        super("COMM");
        this.f10712g = "und";
        this.f10713h = str2;
        this.f10714i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qj.class == obj.getClass()) {
            qj qjVar = (qj) obj;
            if (zm.o(this.f10713h, qjVar.f10713h) && zm.o(this.f10712g, qjVar.f10712g) && zm.o(this.f10714i, qjVar.f10714i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10712g;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f10713h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10714i;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f11845f);
        parcel.writeString(this.f10712g);
        parcel.writeString(this.f10714i);
    }
}
