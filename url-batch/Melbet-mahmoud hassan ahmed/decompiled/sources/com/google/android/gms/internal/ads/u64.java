package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class u64 implements Parcelable {
    public static final Parcelable.Creator<u64> CREATOR = new t54();

    /* renamed from: f, reason: collision with root package name */
    private int f12669f;

    /* renamed from: g, reason: collision with root package name */
    public final UUID f12670g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12671h;

    /* renamed from: i, reason: collision with root package name */
    public final String f12672i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f12673j;

    u64(Parcel parcel) {
        this.f12670g = new UUID(parcel.readLong(), parcel.readLong());
        this.f12671h = parcel.readString();
        String readString = parcel.readString();
        int i7 = n13.f8865a;
        this.f12672i = readString;
        this.f12673j = parcel.createByteArray();
    }

    public u64(UUID uuid, String str, String str2, byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.f12670g = uuid;
        this.f12671h = null;
        this.f12672i = str2;
        this.f12673j = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u64)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        u64 u64Var = (u64) obj;
        return n13.p(this.f12671h, u64Var.f12671h) && n13.p(this.f12672i, u64Var.f12672i) && n13.p(this.f12670g, u64Var.f12670g) && Arrays.equals(this.f12673j, u64Var.f12673j);
    }

    public final int hashCode() {
        int i7 = this.f12669f;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = this.f12670g.hashCode() * 31;
        String str = this.f12671h;
        int hashCode2 = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f12672i.hashCode()) * 31) + Arrays.hashCode(this.f12673j);
        this.f12669f = hashCode2;
        return hashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f12670g.getMostSignificantBits());
        parcel.writeLong(this.f12670g.getLeastSignificantBits());
        parcel.writeString(this.f12671h);
        parcel.writeString(this.f12672i);
        parcel.writeByteArray(this.f12673j);
    }
}
