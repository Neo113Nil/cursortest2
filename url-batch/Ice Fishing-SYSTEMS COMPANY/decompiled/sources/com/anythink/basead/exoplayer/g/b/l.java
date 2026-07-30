package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new Parcelable.Creator<l>() { // from class: com.anythink.basead.exoplayer.g.b.l.1
        private static l a(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ l[] newArray(int i) {
            return new l[i];
        }

        private static l[] a(int i) {
            return new l[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f7493a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7494b;

    public l(String str, String str2, String str3) {
        super(str);
        this.f7493a = str2;
        this.f7494b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f7483g.equals(lVar.f7483g) && af.a((Object) this.f7493a, (Object) lVar.f7493a) && af.a((Object) this.f7494b, (Object) lVar.f7494b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int k6 = AbstractC5051n.k(527, 31, this.f7483g);
        String str = this.f7493a;
        int hashCode = (k6 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7494b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f7483g + ": url=" + this.f7494b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7483g);
        parcel.writeString(this.f7493a);
        parcel.writeString(this.f7494b);
    }

    public l(Parcel parcel) {
        super(parcel.readString());
        this.f7493a = parcel.readString();
        this.f7494b = parcel.readString();
    }
}
