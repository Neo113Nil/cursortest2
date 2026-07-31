package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class u30 implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<u30> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final b[] f32798b;

    /* renamed from: c, reason: collision with root package name */
    private int f32799c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32800d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32801e;

    final class a implements Parcelable.Creator<u30> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final u30 createFromParcel(Parcel parcel) {
            return new u30(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final u30[] newArray(int i4) {
            return new u30[i4];
        }
    }

    u30(Parcel parcel) {
        this.f32800d = parcel.readString();
        b[] bVarArr = (b[]) u82.a((b[]) parcel.createTypedArray(b.CREATOR));
        this.f32798b = bVarArr;
        this.f32801e = bVarArr.length;
    }

    public final u30 a(String str) {
        return u82.a(this.f32800d, str) ? this : new u30(str, false, this.f32798b);
    }

    @Override // java.util.Comparator
    public final int compare(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        UUID uuid = C1813am.f23358a;
        return uuid.equals(bVar3.f32803c) ? uuid.equals(bVar4.f32803c) ? 0 : 1 : bVar3.f32803c.compareTo(bVar4.f32803c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u30.class == obj.getClass()) {
            u30 u30Var = (u30) obj;
            if (u82.a(this.f32800d, u30Var.f32800d) && Arrays.equals(this.f32798b, u30Var.f32798b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f32799c == 0) {
            String str = this.f32800d;
            this.f32799c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f32798b);
        }
        return this.f32799c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f32800d);
        parcel.writeTypedArray(this.f32798b, 0);
    }

    public final b a(int i4) {
        return this.f32798b[i4];
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private int f32802b;

        /* renamed from: c, reason: collision with root package name */
        public final UUID f32803c;

        /* renamed from: d, reason: collision with root package name */
        public final String f32804d;

        /* renamed from: e, reason: collision with root package name */
        public final String f32805e;

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f32806f;

        final class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i4) {
                return new b[i4];
            }
        }

        b(Parcel parcel) {
            this.f32803c = new UUID(parcel.readLong(), parcel.readLong());
            this.f32804d = parcel.readString();
            this.f32805e = (String) u82.a(parcel.readString());
            this.f32806f = parcel.createByteArray();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return u82.a(this.f32804d, bVar.f32804d) && u82.a(this.f32805e, bVar.f32805e) && u82.a(this.f32803c, bVar.f32803c) && Arrays.equals(this.f32806f, bVar.f32806f);
        }

        public final int hashCode() {
            if (this.f32802b == 0) {
                int hashCode = this.f32803c.hashCode() * 31;
                String str = this.f32804d;
                this.f32802b = Arrays.hashCode(this.f32806f) + C1842c3.a(this.f32805e, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f32802b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            parcel.writeLong(this.f32803c.getMostSignificantBits());
            parcel.writeLong(this.f32803c.getLeastSignificantBits());
            parcel.writeString(this.f32804d);
            parcel.writeString(this.f32805e);
            parcel.writeByteArray(this.f32806f);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f32803c = (UUID) C2253tf.a(uuid);
            this.f32804d = str;
            this.f32805e = (String) C2253tf.a(str2);
            this.f32806f = bArr;
        }
    }

    private u30(String str, boolean z4, b... bVarArr) {
        this.f32800d = str;
        bVarArr = z4 ? (b[]) bVarArr.clone() : bVarArr;
        this.f32798b = bVarArr;
        this.f32801e = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public u30(ArrayList arrayList) {
        this(null, false, (b[]) arrayList.toArray(new b[0]));
    }

    public u30(b... bVarArr) {
        this(null, true, bVarArr);
    }
}
