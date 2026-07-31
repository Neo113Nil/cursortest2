package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g extends wf4 {
    public static final Parcelable.Creator<g> CREATOR = new f();

    /* renamed from: g, reason: collision with root package name */
    public final String f5397g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5398h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    g(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i7 = n13.f8865a;
        this.f5397g = parcel.readString();
        this.f5398h = parcel.readString();
    }

    public g(String str, String str2, String str3) {
        super(str);
        this.f5397g = str2;
        this.f5398h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f13818f.equals(gVar.f13818f) && n13.p(this.f5397g, gVar.f5397g) && n13.p(this.f5398h, gVar.f5398h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f13818f.hashCode() + 527) * 31;
        String str = this.f5397g;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5398h;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.wf4
    public final String toString() {
        String str = this.f13818f;
        String str2 = this.f5398h;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f13818f);
        parcel.writeString(this.f5397g);
        parcel.writeString(this.f5398h);
    }
}
