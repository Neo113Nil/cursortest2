package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new Parcelable.Creator<i>() { // from class: com.anythink.basead.exoplayer.g.b.i.1
        private static i a(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ i[] newArray(int i) {
            return new i[i];
        }

        private static i[] a(int i) {
            return new i[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f7484a = "----";

    /* renamed from: b, reason: collision with root package name */
    public final String f7485b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7486c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7487d;

    public i(String str, String str2, String str3) {
        super(f7484a);
        this.f7485b = str;
        this.f7486c = str2;
        this.f7487d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (af.a((Object) this.f7486c, (Object) iVar.f7486c) && af.a((Object) this.f7485b, (Object) iVar.f7485b) && af.a((Object) this.f7487d, (Object) iVar.f7487d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7485b;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f7486c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7487d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f7483g + ": domain=" + this.f7485b + ", description=" + this.f7486c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7483g);
        parcel.writeString(this.f7485b);
        parcel.writeString(this.f7487d);
    }

    public i(Parcel parcel) {
        super(f7484a);
        this.f7485b = (String) C0544a.a(parcel.readString());
        this.f7486c = (String) C0544a.a(parcel.readString());
        this.f7487d = (String) C0544a.a(parcel.readString());
    }
}
