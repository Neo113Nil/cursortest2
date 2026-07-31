package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.uv0;
import com.yandex.mobile.ads.impl.wz0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class xh0 implements wz0.b {
    public static final Parcelable.Creator<xh0> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f34563b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34564c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34565d;

    final class a implements Parcelable.Creator<xh0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final xh0 createFromParcel(Parcel parcel) {
            return new xh0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final xh0[] newArray(int i4) {
            return new xh0[i4];
        }
    }

    xh0(Parcel parcel) {
        this.f34563b = (byte[]) C2253tf.a(parcel.createByteArray());
        this.f34564c = parcel.readString();
        this.f34565d = parcel.readString();
    }

    @Override // com.yandex.mobile.ads.impl.wz0.b
    public final void a(uv0.a aVar) {
        String str = this.f34564c;
        if (str != null) {
            aVar.i(str);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xh0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f34563b, ((xh0) obj).f34563b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f34563b);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f34564c + "\", url=\"" + this.f34565d + "\", rawMetadata.length=\"" + this.f34563b.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeByteArray(this.f34563b);
        parcel.writeString(this.f34564c);
        parcel.writeString(this.f34565d);
    }

    public xh0(byte[] bArr, String str, String str2) {
        this.f34563b = bArr;
        this.f34564c = str;
        this.f34565d = str2;
    }
}
