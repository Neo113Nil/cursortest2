package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.anythink.basead.exoplayer.g.b.a.1
        private static a a(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ a[] newArray(int i) {
            return new a[i];
        }

        private static a[] a(int i) {
            return new a[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f7436a = "APIC";

    /* renamed from: b, reason: collision with root package name */
    public final String f7437b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7438c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7439d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f7440e;

    public a(String str, String str2, int i, byte[] bArr) {
        super(f7436a);
        this.f7437b = str;
        this.f7438c = str2;
        this.f7439d = i;
        this.f7440e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f7439d == aVar.f7439d && af.a((Object) this.f7437b, (Object) aVar.f7437b) && af.a((Object) this.f7438c, (Object) aVar.f7438c) && Arrays.equals(this.f7440e, aVar.f7440e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f7439d + 527) * 31;
        String str = this.f7437b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7438c;
        return Arrays.hashCode(this.f7440e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f7483g + ": mimeType=" + this.f7437b + ", description=" + this.f7438c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7437b);
        parcel.writeString(this.f7438c);
        parcel.writeInt(this.f7439d);
        parcel.writeByteArray(this.f7440e);
    }

    public a(Parcel parcel) {
        super(f7436a);
        this.f7437b = parcel.readString();
        this.f7438c = parcel.readString();
        this.f7439d = parcel.readInt();
        this.f7440e = parcel.createByteArray();
    }
}
