package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class k01 extends zh0 {
    public static final Parcelable.Creator<k01> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final int f27961c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27962d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27963e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f27964f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f27965g;

    final class a implements Parcelable.Creator<k01> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final k01 createFromParcel(Parcel parcel) {
            return new k01(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k01[] newArray(int i4) {
            return new k01[i4];
        }
    }

    public k01(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f27961c = i4;
        this.f27962d = i5;
        this.f27963e = i6;
        this.f27964f = iArr;
        this.f27965g = iArr2;
    }

    @Override // com.yandex.mobile.ads.impl.zh0, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k01.class == obj.getClass()) {
            k01 k01Var = (k01) obj;
            if (this.f27961c == k01Var.f27961c && this.f27962d == k01Var.f27962d && this.f27963e == k01Var.f27963e && Arrays.equals(this.f27964f, k01Var.f27964f) && Arrays.equals(this.f27965g, k01Var.f27965g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f27965g) + ((Arrays.hashCode(this.f27964f) + ((((((this.f27961c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f27962d) * 31) + this.f27963e) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f27961c);
        parcel.writeInt(this.f27962d);
        parcel.writeInt(this.f27963e);
        parcel.writeIntArray(this.f27964f);
        parcel.writeIntArray(this.f27965g);
    }

    k01(Parcel parcel) {
        super("MLLT");
        this.f27961c = parcel.readInt();
        this.f27962d = parcel.readInt();
        this.f27963e = parcel.readInt();
        this.f27964f = (int[]) u82.a(parcel.createIntArray());
        this.f27965g = (int[]) u82.a(parcel.createIntArray());
    }
}
