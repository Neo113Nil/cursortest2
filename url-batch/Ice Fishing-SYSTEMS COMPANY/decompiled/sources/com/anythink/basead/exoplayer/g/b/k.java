package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new Parcelable.Creator<k>() { // from class: com.anythink.basead.exoplayer.g.b.k.1
        private static k a(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ k[] newArray(int i) {
            return new k[i];
        }

        private static k[] a(int i) {
            return new k[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f7491a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7492b;

    public k(String str, String str2, String str3) {
        super(str);
        this.f7491a = str2;
        this.f7492b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f7483g.equals(kVar.f7483g) && af.a((Object) this.f7491a, (Object) kVar.f7491a) && af.a((Object) this.f7492b, (Object) kVar.f7492b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int k6 = AbstractC5051n.k(527, 31, this.f7483g);
        String str = this.f7491a;
        int hashCode = (k6 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7492b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f7483g + ": value=" + this.f7492b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7483g);
        parcel.writeString(this.f7491a);
        parcel.writeString(this.f7492b);
    }

    public k(Parcel parcel) {
        super(parcel.readString());
        this.f7491a = parcel.readString();
        this.f7492b = parcel.readString();
    }
}
