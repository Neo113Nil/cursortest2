package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class b extends h {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.anythink.basead.exoplayer.g.b.b.1
        private static b a(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ b[] newArray(int i) {
            return new b[i];
        }

        private static b[] a(int i) {
            return new b[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7441a;

    public b(String str, byte[] bArr) {
        super(str);
        this.f7441a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f7483g.equals(bVar.f7483g) && Arrays.equals(this.f7441a, bVar.f7441a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7441a) + AbstractC5051n.k(527, 31, this.f7483g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7483g);
        parcel.writeByteArray(this.f7441a);
    }

    public b(Parcel parcel) {
        super(parcel.readString());
        this.f7441a = parcel.createByteArray();
    }
}
