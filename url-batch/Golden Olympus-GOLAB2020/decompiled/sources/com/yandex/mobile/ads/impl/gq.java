package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes3.dex */
public final class gq extends zh0 {
    public static final Parcelable.Creator<gq> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f26267c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26268d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26269e;

    final class a implements Parcelable.Creator<gq> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final gq createFromParcel(Parcel parcel) {
            return new gq(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final gq[] newArray(int i4) {
            return new gq[i4];
        }
    }

    gq(Parcel parcel) {
        super("COMM");
        this.f26267c = (String) u82.a(parcel.readString());
        this.f26268d = (String) u82.a(parcel.readString());
        this.f26269e = (String) u82.a(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gq.class == obj.getClass()) {
            gq gqVar = (gq) obj;
            if (u82.a(this.f26268d, gqVar.f26268d) && u82.a(this.f26267c, gqVar.f26267c) && u82.a(this.f26269e, gqVar.f26269e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f26267c;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f26268d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26269e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.impl.zh0
    public final String toString() {
        return this.f35592b + ": language=" + this.f26267c + ", description=" + this.f26268d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f35592b);
        parcel.writeString(this.f26267c);
        parcel.writeString(this.f26269e);
    }

    public gq(String str, String str2, String str3) {
        super("COMM");
        this.f26267c = str;
        this.f26268d = str2;
        this.f26269e = str3;
    }
}
