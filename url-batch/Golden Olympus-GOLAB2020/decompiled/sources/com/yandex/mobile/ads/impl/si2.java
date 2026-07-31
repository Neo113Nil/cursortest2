package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.uv0;
import com.yandex.mobile.ads.impl.wz0;

@Deprecated
/* loaded from: classes3.dex */
public class si2 implements wz0.b {
    public static final Parcelable.Creator<si2> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f31761b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31762c;

    final class a implements Parcelable.Creator<si2> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final si2 createFromParcel(Parcel parcel) {
            return new si2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final si2[] newArray(int i4) {
            return new si2[i4];
        }
    }

    protected si2(Parcel parcel) {
        this.f31761b = (String) u82.a(parcel.readString());
        this.f31762c = (String) u82.a(parcel.readString());
    }

    @Override // com.yandex.mobile.ads.impl.wz0.b
    public final void a(uv0.a aVar) {
        String str = this.f31761b;
        str.getClass();
        switch (str) {
            case "ALBUM":
                aVar.b(this.f31762c);
                break;
            case "TITLE":
                aVar.i(this.f31762c);
                break;
            case "DESCRIPTION":
                aVar.f(this.f31762c);
                break;
            case "ALBUMARTIST":
                aVar.a(this.f31762c);
                break;
            case "ARTIST":
                aVar.c(this.f31762c);
                break;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            si2 si2Var = (si2) obj;
            if (this.f31761b.equals(si2Var.f31761b) && this.f31762c.equals(si2Var.f31762c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31762c.hashCode() + C1842c3.a(this.f31761b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    public final String toString() {
        return "VC: " + this.f31761b + "=" + this.f31762c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f31761b);
        parcel.writeString(this.f31762c);
    }

    public si2(String str, String str2) {
        this.f31761b = str;
        this.f31762c = str2;
    }
}
