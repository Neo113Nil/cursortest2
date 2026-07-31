package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class yk1 extends zh0 {
    public static final Parcelable.Creator<yk1> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f35167c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f35168d;

    final class a implements Parcelable.Creator<yk1> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final yk1 createFromParcel(Parcel parcel) {
            return new yk1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final yk1[] newArray(int i4) {
            return new yk1[i4];
        }
    }

    yk1(Parcel parcel) {
        super("PRIV");
        this.f35167c = (String) u82.a(parcel.readString());
        this.f35168d = (byte[]) u82.a(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yk1.class == obj.getClass()) {
            yk1 yk1Var = (yk1) obj;
            if (u82.a(this.f35167c, yk1Var.f35167c) && Arrays.equals(this.f35168d, yk1Var.f35168d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f35167c;
        return Arrays.hashCode(this.f35168d) + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // com.yandex.mobile.ads.impl.zh0
    public final String toString() {
        return this.f35592b + ": owner=" + this.f35167c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f35167c);
        parcel.writeByteArray(this.f35168d);
    }

    public yk1(String str, byte[] bArr) {
        super("PRIV");
        this.f35167c = str;
        this.f35168d = bArr;
    }
}
