package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class uj extends sj {
    public static final Parcelable.Creator<uj> CREATOR = new tj();

    /* renamed from: g, reason: collision with root package name */
    public final String f12825g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12826h;

    uj(Parcel parcel) {
        super(parcel.readString());
        this.f12825g = parcel.readString();
        this.f12826h = parcel.readString();
    }

    public uj(String str, String str2, String str3) {
        super(str);
        this.f12825g = null;
        this.f12826h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uj.class == obj.getClass()) {
            uj ujVar = (uj) obj;
            if (this.f11845f.equals(ujVar.f11845f) && zm.o(this.f12825g, ujVar.f12825g) && zm.o(this.f12826h, ujVar.f12826h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f11845f.hashCode() + 527) * 31;
        String str = this.f12825g;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12826h;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f11845f);
        parcel.writeString(this.f12825g);
        parcel.writeString(this.f12826h);
    }
}
