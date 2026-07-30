package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class e extends h {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.anythink.basead.exoplayer.g.b.e.1
        private static e a(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ e[] newArray(int i) {
            return new e[i];
        }

        private static e[] a(int i) {
            return new e[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f7455a = "COMM";

    /* renamed from: b, reason: collision with root package name */
    public final String f7456b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7457c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7458d;

    public e(String str, String str2, String str3) {
        super(f7455a);
        this.f7456b = str;
        this.f7457c = str2;
        this.f7458d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (af.a((Object) this.f7457c, (Object) eVar.f7457c) && af.a((Object) this.f7456b, (Object) eVar.f7456b) && af.a((Object) this.f7458d, (Object) eVar.f7458d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7456b;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f7457c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7458d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f7483g + ": language=" + this.f7456b + ", description=" + this.f7457c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7483g);
        parcel.writeString(this.f7456b);
        parcel.writeString(this.f7458d);
    }

    public e(Parcel parcel) {
        super(f7455a);
        this.f7456b = parcel.readString();
        this.f7457c = parcel.readString();
        this.f7458d = parcel.readString();
    }
}
