package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class NO implements Parcelable {
    public static final Parcelable.Creator<NO> CREATOR = new S8(26);

    /* renamed from: n, reason: collision with root package name */
    public int f26538n;

    /* renamed from: u, reason: collision with root package name */
    public final UUID f26539u;

    /* renamed from: v, reason: collision with root package name */
    public final String f26540v;

    /* renamed from: w, reason: collision with root package name */
    public final String f26541w;

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f26542x;

    public NO(Parcel parcel) {
        this.f26539u = new UUID(parcel.readLong(), parcel.readLong());
        this.f26540v = parcel.readString();
        String readString = parcel.readString();
        String str = AbstractC3548lu.f32613a;
        this.f26541w = readString;
        this.f26542x = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NO)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        NO no = (NO) obj;
        return Objects.equals(this.f26540v, no.f26540v) && Objects.equals(this.f26541w, no.f26541w) && Objects.equals(this.f26539u, no.f26539u) && Arrays.equals(this.f26542x, no.f26542x);
    }

    public final int hashCode() {
        int i = this.f26538n;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f26539u.hashCode() * 31;
        String str = this.f26540v;
        int hashCode2 = Arrays.hashCode(this.f26542x) + AbstractC5051n.k((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f26541w);
        this.f26538n = hashCode2;
        return hashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f26539u;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f26540v);
        parcel.writeString(this.f26541w);
        parcel.writeByteArray(this.f26542x);
    }

    public NO(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f26539u = uuid;
        this.f26540v = null;
        this.f26541w = K4.h(str);
        this.f26542x = bArr;
    }
}
