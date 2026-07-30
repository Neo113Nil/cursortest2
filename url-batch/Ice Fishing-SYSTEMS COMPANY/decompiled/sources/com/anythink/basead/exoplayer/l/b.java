package com.anythink.basead.exoplayer.l;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.anythink.basead.exoplayer.l.b.1
        private static b a(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ b[] newArray(int i) {
            return new b[0];
        }

        private static b[] a() {
            return new b[0];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f8706a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8707b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8708c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8709d;

    /* renamed from: e, reason: collision with root package name */
    private int f8710e;

    private b(int i, int i4, int i9, byte[] bArr) {
        this.f8706a = i;
        this.f8707b = i4;
        this.f8708c = i9;
        this.f8709d = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f8706a == bVar.f8706a && this.f8707b == bVar.f8707b && this.f8708c == bVar.f8708c && Arrays.equals(this.f8709d, bVar.f8709d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8710e == 0) {
            this.f8710e = Arrays.hashCode(this.f8709d) + ((((((this.f8706a + 527) * 31) + this.f8707b) * 31) + this.f8708c) * 31);
        }
        return this.f8710e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f8706a);
        sb.append(", ");
        sb.append(this.f8707b);
        sb.append(", ");
        sb.append(this.f8708c);
        sb.append(", ");
        sb.append(this.f8709d != null);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8706a);
        parcel.writeInt(this.f8707b);
        parcel.writeInt(this.f8708c);
        af.a(parcel, this.f8709d != null);
        byte[] bArr = this.f8709d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public b(Parcel parcel) {
        this.f8706a = parcel.readInt();
        this.f8707b = parcel.readInt();
        this.f8708c = parcel.readInt();
        this.f8709d = af.a(parcel) ? parcel.createByteArray() : null;
    }
}
