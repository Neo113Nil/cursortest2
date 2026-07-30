package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: com.anythink.basead.exoplayer.g.b.f.1
        private static f a(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ f[] newArray(int i) {
            return new f[i];
        }

        private static f[] a(int i) {
            return new f[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f7459a = "GEOB";

    /* renamed from: b, reason: collision with root package name */
    public final String f7460b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7461c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7462d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f7463e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super(f7459a);
        this.f7460b = str;
        this.f7461c = str2;
        this.f7462d = str3;
        this.f7463e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (af.a((Object) this.f7460b, (Object) fVar.f7460b) && af.a((Object) this.f7461c, (Object) fVar.f7461c) && af.a((Object) this.f7462d, (Object) fVar.f7462d) && Arrays.equals(this.f7463e, fVar.f7463e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7460b;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f7461c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7462d;
        return Arrays.hashCode(this.f7463e) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f7483g + ": mimeType=" + this.f7460b + ", filename=" + this.f7461c + ", description=" + this.f7462d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7460b);
        parcel.writeString(this.f7461c);
        parcel.writeString(this.f7462d);
        parcel.writeByteArray(this.f7463e);
    }

    public f(Parcel parcel) {
        super(f7459a);
        this.f7460b = parcel.readString();
        this.f7461c = parcel.readString();
        this.f7462d = parcel.readString();
        this.f7463e = parcel.createByteArray();
    }
}
