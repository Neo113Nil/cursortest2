package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class xg implements Parcelable {
    public static final Parcelable.Creator<xg> CREATOR = new wg();

    /* renamed from: f, reason: collision with root package name */
    private int f14194f;

    /* renamed from: g, reason: collision with root package name */
    private final UUID f14195g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14196h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f14197i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f14198j;

    xg(Parcel parcel) {
        this.f14195g = new UUID(parcel.readLong(), parcel.readLong());
        this.f14196h = parcel.readString();
        this.f14197i = parcel.createByteArray();
        this.f14198j = parcel.readByte() != 0;
    }

    public xg(UUID uuid, String str, byte[] bArr, boolean z6) {
        Objects.requireNonNull(uuid);
        this.f14195g = uuid;
        this.f14196h = str;
        Objects.requireNonNull(bArr);
        this.f14197i = bArr;
        this.f14198j = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xg)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        xg xgVar = (xg) obj;
        return this.f14196h.equals(xgVar.f14196h) && zm.o(this.f14195g, xgVar.f14195g) && Arrays.equals(this.f14197i, xgVar.f14197i);
    }

    public final int hashCode() {
        int i7 = this.f14194f;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = (((this.f14195g.hashCode() * 31) + this.f14196h.hashCode()) * 31) + Arrays.hashCode(this.f14197i);
        this.f14194f = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f14195g.getMostSignificantBits());
        parcel.writeLong(this.f14195g.getLeastSignificantBits());
        parcel.writeString(this.f14196h);
        parcel.writeByteArray(this.f14197i);
        parcel.writeByte(this.f14198j ? (byte) 1 : (byte) 0);
    }
}
