package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.wz0;
import com.yandex.mobile.ads.impl.yb0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class o50 implements wz0.b {

    /* renamed from: b, reason: collision with root package name */
    public final String f29903b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29904c;

    /* renamed from: d, reason: collision with root package name */
    public final long f29905d;

    /* renamed from: e, reason: collision with root package name */
    public final long f29906e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f29907f;

    /* renamed from: g, reason: collision with root package name */
    private int f29908g;

    /* renamed from: h, reason: collision with root package name */
    private static final yb0 f29901h = new yb0.a().e("application/id3").a();

    /* renamed from: i, reason: collision with root package name */
    private static final yb0 f29902i = new yb0.a().e("application/x-scte35").a();
    public static final Parcelable.Creator<o50> CREATOR = new a();

    final class a implements Parcelable.Creator<o50> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final o50 createFromParcel(Parcel parcel) {
            return new o50(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final o50[] newArray(int i4) {
            return new o50[i4];
        }
    }

    o50(Parcel parcel) {
        this.f29903b = (String) u82.a(parcel.readString());
        this.f29904c = (String) u82.a(parcel.readString());
        this.f29905d = parcel.readLong();
        this.f29906e = parcel.readLong();
        this.f29907f = (byte[]) u82.a(parcel.createByteArray());
    }

    @Override // com.yandex.mobile.ads.impl.wz0.b
    public final yb0 a() {
        String str = this.f29903b;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f29902i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f29901h;
            default:
                return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.wz0.b
    public final byte[] b() {
        if (a() != null) {
            return this.f29907f;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o50.class == obj.getClass()) {
            o50 o50Var = (o50) obj;
            if (this.f29905d == o50Var.f29905d && this.f29906e == o50Var.f29906e && u82.a(this.f29903b, o50Var.f29903b) && u82.a(this.f29904c, o50Var.f29904c) && Arrays.equals(this.f29907f, o50Var.f29907f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f29908g == 0) {
            String str = this.f29903b;
            int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f29904c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j4 = this.f29905d;
            int i4 = (hashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f29906e;
            this.f29908g = Arrays.hashCode(this.f29907f) + ((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31);
        }
        return this.f29908g;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f29903b + ", id=" + this.f29906e + ", durationMs=" + this.f29905d + ", value=" + this.f29904c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f29903b);
        parcel.writeString(this.f29904c);
        parcel.writeLong(this.f29905d);
        parcel.writeLong(this.f29906e);
        parcel.writeByteArray(this.f29907f);
    }

    public o50(String str, String str2, long j4, long j5, byte[] bArr) {
        this.f29903b = str;
        this.f29904c = str2;
        this.f29905d = j4;
        this.f29906e = j5;
        this.f29907f = bArr;
    }
}
