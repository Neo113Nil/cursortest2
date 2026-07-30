package com.anythink.basead.exoplayer.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.s;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.anythink.basead.exoplayer.g.c.a.1
        private static a a(Parcel parcel) {
            return new a(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ a[] newArray(int i) {
            return new a[i];
        }

        private static a[] a(int i) {
            return new a[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final long f7495a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7496b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7497c;

    public /* synthetic */ a(Parcel parcel, byte b9) {
        this(parcel);
    }

    public static a a(s sVar, int i, long j9) {
        long h9 = sVar.h();
        int i4 = i - 4;
        byte[] bArr = new byte[i4];
        sVar.a(bArr, 0, i4);
        return new a(h9, bArr, j9);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7495a);
        parcel.writeLong(this.f7496b);
        parcel.writeInt(this.f7497c.length);
        parcel.writeByteArray(this.f7497c);
    }

    private a(long j9, byte[] bArr, long j10) {
        this.f7495a = j10;
        this.f7496b = j9;
        this.f7497c = bArr;
    }

    private a(Parcel parcel) {
        this.f7495a = parcel.readLong();
        this.f7496b = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.f7497c = bArr;
        parcel.readByteArray(bArr);
    }
}
