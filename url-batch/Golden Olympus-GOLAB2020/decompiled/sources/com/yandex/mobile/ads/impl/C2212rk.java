package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.rk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2212rk extends zh0 {
    public static final Parcelable.Creator<C2212rk> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f31252c;

    /* renamed from: com.yandex.mobile.ads.impl.rk$a */
    final class a implements Parcelable.Creator<C2212rk> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final C2212rk createFromParcel(Parcel parcel) {
            return new C2212rk(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C2212rk[] newArray(int i4) {
            return new C2212rk[i4];
        }
    }

    C2212rk(Parcel parcel) {
        super((String) u82.a(parcel.readString()));
        this.f31252c = (byte[]) u82.a(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2212rk.class == obj.getClass()) {
            C2212rk c2212rk = (C2212rk) obj;
            if (this.f35592b.equals(c2212rk.f35592b) && Arrays.equals(this.f31252c, c2212rk.f31252c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f31252c) + C1842c3.a(this.f35592b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f35592b);
        parcel.writeByteArray(this.f31252c);
    }

    public C2212rk(String str, byte[] bArr) {
        super(str);
        this.f31252c = bArr;
    }
}
