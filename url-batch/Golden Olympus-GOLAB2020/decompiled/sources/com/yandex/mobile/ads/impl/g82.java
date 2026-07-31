package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes3.dex */
public final class g82 extends zh0 {
    public static final Parcelable.Creator<g82> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f26070c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26071d;

    final class a implements Parcelable.Creator<g82> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final g82 createFromParcel(Parcel parcel) {
            return new g82(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g82[] newArray(int i4) {
            return new g82[i4];
        }
    }

    g82(Parcel parcel) {
        super((String) u82.a(parcel.readString()));
        this.f26070c = parcel.readString();
        this.f26071d = (String) u82.a(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g82.class == obj.getClass()) {
            g82 g82Var = (g82) obj;
            if (this.f35592b.equals(g82Var.f35592b) && u82.a(this.f26070c, g82Var.f26070c) && u82.a(this.f26071d, g82Var.f26071d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a4 = C1842c3.a(this.f35592b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f26070c;
        int hashCode = (a4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26071d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.impl.zh0
    public final String toString() {
        return this.f35592b + ": url=" + this.f26071d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f35592b);
        parcel.writeString(this.f26070c);
        parcel.writeString(this.f26071d);
    }

    public g82(String str, String str2, String str3) {
        super(str);
        this.f26070c = str2;
        this.f26071d = str3;
    }
}
