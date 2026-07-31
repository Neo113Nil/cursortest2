package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class hf4 extends wf4 {
    public static final Parcelable.Creator<hf4> CREATOR = new gf4();

    /* renamed from: g, reason: collision with root package name */
    public final String f6225g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6226h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6227i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f6228j;

    hf4(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i7 = n13.f8865a;
        this.f6225g = readString;
        this.f6226h = parcel.readString();
        this.f6227i = parcel.readInt();
        this.f6228j = (byte[]) n13.c(parcel.createByteArray());
    }

    public hf4(String str, String str2, int i7, byte[] bArr) {
        super("APIC");
        this.f6225g = str;
        this.f6226h = str2;
        this.f6227i = i7;
        this.f6228j = bArr;
    }

    @Override // com.google.android.gms.internal.ads.wf4, com.google.android.gms.internal.ads.b81
    public final void b(ds dsVar) {
        dsVar.k(this.f6228j, this.f6227i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hf4.class == obj.getClass()) {
            hf4 hf4Var = (hf4) obj;
            if (this.f6227i == hf4Var.f6227i && n13.p(this.f6225g, hf4Var.f6225g) && n13.p(this.f6226h, hf4Var.f6226h) && Arrays.equals(this.f6228j, hf4Var.f6228j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (this.f6227i + 527) * 31;
        String str = this.f6225g;
        int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6226h;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f6228j);
    }

    @Override // com.google.android.gms.internal.ads.wf4
    public final String toString() {
        String str = this.f13818f;
        String str2 = this.f6225g;
        String str3 = this.f6226h;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6225g);
        parcel.writeString(this.f6226h);
        parcel.writeInt(this.f6227i);
        parcel.writeByteArray(this.f6228j);
    }
}
