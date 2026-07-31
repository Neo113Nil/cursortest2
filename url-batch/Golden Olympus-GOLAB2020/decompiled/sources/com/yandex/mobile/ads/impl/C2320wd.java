package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.uv0;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.wd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2320wd extends zh0 {
    public static final Parcelable.Creator<C2320wd> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f34008c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34009d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34010e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f34011f;

    /* renamed from: com.yandex.mobile.ads.impl.wd$a */
    final class a implements Parcelable.Creator<C2320wd> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final C2320wd createFromParcel(Parcel parcel) {
            return new C2320wd(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C2320wd[] newArray(int i4) {
            return new C2320wd[i4];
        }
    }

    C2320wd(Parcel parcel) {
        super("APIC");
        this.f34008c = (String) u82.a(parcel.readString());
        this.f34009d = parcel.readString();
        this.f34010e = parcel.readInt();
        this.f34011f = (byte[]) u82.a(parcel.createByteArray());
    }

    @Override // com.yandex.mobile.ads.impl.wz0.b
    public final void a(uv0.a aVar) {
        aVar.a(this.f34010e, this.f34011f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2320wd.class == obj.getClass()) {
            C2320wd c2320wd = (C2320wd) obj;
            if (this.f34010e == c2320wd.f34010e && u82.a(this.f34008c, c2320wd.f34008c) && u82.a(this.f34009d, c2320wd.f34009d) && Arrays.equals(this.f34011f, c2320wd.f34011f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = (this.f34010e + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f34008c;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f34009d;
        return Arrays.hashCode(this.f34011f) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.yandex.mobile.ads.impl.zh0
    public final String toString() {
        return this.f35592b + ": mimeType=" + this.f34008c + ", description=" + this.f34009d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f34008c);
        parcel.writeString(this.f34009d);
        parcel.writeInt(this.f34010e);
        parcel.writeByteArray(this.f34011f);
    }

    public C2320wd(String str, String str2, int i4, byte[] bArr) {
        super("APIC");
        this.f34008c = str;
        this.f34009d = str2;
        this.f34010e = i4;
        this.f34011f = bArr;
    }
}
