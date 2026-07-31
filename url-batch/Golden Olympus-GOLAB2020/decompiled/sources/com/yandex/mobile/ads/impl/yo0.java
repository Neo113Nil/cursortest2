package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes3.dex */
public final class yo0 extends zh0 {
    public static final Parcelable.Creator<yo0> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f35273c;

    /* renamed from: d, reason: collision with root package name */
    public final String f35274d;

    /* renamed from: e, reason: collision with root package name */
    public final String f35275e;

    final class a implements Parcelable.Creator<yo0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final yo0 createFromParcel(Parcel parcel) {
            return new yo0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final yo0[] newArray(int i4) {
            return new yo0[i4];
        }
    }

    yo0(Parcel parcel) {
        super("----");
        this.f35273c = (String) u82.a(parcel.readString());
        this.f35274d = (String) u82.a(parcel.readString());
        this.f35275e = (String) u82.a(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yo0.class == obj.getClass()) {
            yo0 yo0Var = (yo0) obj;
            if (u82.a(this.f35274d, yo0Var.f35274d) && u82.a(this.f35273c, yo0Var.f35273c) && u82.a(this.f35275e, yo0Var.f35275e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f35273c;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f35274d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f35275e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.impl.zh0
    public final String toString() {
        return this.f35592b + ": domain=" + this.f35273c + ", description=" + this.f35274d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f35592b);
        parcel.writeString(this.f35273c);
        parcel.writeString(this.f35275e);
    }

    public yo0(String str, String str2, String str3) {
        super("----");
        this.f35273c = str;
        this.f35274d = str2;
        this.f35275e = str3;
    }
}
