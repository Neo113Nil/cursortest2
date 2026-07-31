package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements b81 {
    public static final Parcelable.Creator<j> CREATOR = new h();

    /* renamed from: f, reason: collision with root package name */
    public final String f6872f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f6873g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6874h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6875i;

    /* synthetic */ j(Parcel parcel, i iVar) {
        String readString = parcel.readString();
        int i7 = n13.f8865a;
        this.f6872f = readString;
        this.f6873g = (byte[]) n13.c(parcel.createByteArray());
        this.f6874h = parcel.readInt();
        this.f6875i = parcel.readInt();
    }

    public j(String str, byte[] bArr, int i7, int i8) {
        this.f6872f = str;
        this.f6873g = bArr;
        this.f6874h = i7;
        this.f6875i = i8;
    }

    @Override // com.google.android.gms.internal.ads.b81
    public final /* synthetic */ void b(ds dsVar) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f6872f.equals(jVar.f6872f) && Arrays.equals(this.f6873g, jVar.f6873g) && this.f6874h == jVar.f6874h && this.f6875i == jVar.f6875i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f6872f.hashCode() + 527) * 31) + Arrays.hashCode(this.f6873g)) * 31) + this.f6874h) * 31) + this.f6875i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6872f);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6872f);
        parcel.writeByteArray(this.f6873g);
        parcel.writeInt(this.f6874h);
        parcel.writeInt(this.f6875i);
    }
}
