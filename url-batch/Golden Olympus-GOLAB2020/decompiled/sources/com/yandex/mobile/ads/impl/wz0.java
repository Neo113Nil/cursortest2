package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.uv0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class wz0 implements Parcelable {
    public static final Parcelable.Creator<wz0> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final b[] f34346b;

    final class a implements Parcelable.Creator<wz0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final wz0 createFromParcel(Parcel parcel) {
            return new wz0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final wz0[] newArray(int i4) {
            return new wz0[i4];
        }
    }

    public interface b extends Parcelable {
        default yb0 a() {
            return null;
        }

        default byte[] b() {
            return null;
        }

        default void a(uv0.a aVar) {
        }
    }

    wz0(Parcel parcel) {
        this.f34346b = new b[parcel.readInt()];
        int i4 = 0;
        while (true) {
            b[] bVarArr = this.f34346b;
            if (i4 >= bVarArr.length) {
                return;
            }
            bVarArr[i4] = (b) parcel.readParcelable(b.class.getClassLoader());
            i4++;
        }
    }

    public final wz0 a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new wz0((b[]) u82.a((Object[]) this.f34346b, (Object[]) bVarArr));
    }

    public final int c() {
        return this.f34346b.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wz0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f34346b, ((wz0) obj).f34346b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f34346b);
    }

    public final String toString() {
        return "entries=" + Arrays.toString(this.f34346b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f34346b.length);
        for (b bVar : this.f34346b) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    public final wz0 a(wz0 wz0Var) {
        return wz0Var == null ? this : a(wz0Var.f34346b);
    }

    public final b a(int i4) {
        return this.f34346b[i4];
    }

    public wz0(List<? extends b> list) {
        this.f34346b = (b[]) list.toArray(new b[0]);
    }

    public wz0(b... bVarArr) {
        this.f34346b = bVarArr;
    }
}
