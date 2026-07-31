package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class c91 implements Parcelable {
    public static final Parcelable.Creator<c91> CREATOR = new a71();

    /* renamed from: f, reason: collision with root package name */
    private final b81[] f3765f;

    c91(Parcel parcel) {
        this.f3765f = new b81[parcel.readInt()];
        int i7 = 0;
        while (true) {
            b81[] b81VarArr = this.f3765f;
            if (i7 >= b81VarArr.length) {
                return;
            }
            b81VarArr[i7] = (b81) parcel.readParcelable(b81.class.getClassLoader());
            i7++;
        }
    }

    public c91(List<? extends b81> list) {
        this.f3765f = (b81[]) list.toArray(new b81[0]);
    }

    public c91(b81... b81VarArr) {
        this.f3765f = b81VarArr;
    }

    public final int a() {
        return this.f3765f.length;
    }

    public final b81 c(int i7) {
        return this.f3765f[i7];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c91.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f3765f, ((c91) obj).f3765f);
    }

    public final c91 g(b81... b81VarArr) {
        return b81VarArr.length == 0 ? this : new c91((b81[]) n13.z(this.f3765f, b81VarArr));
    }

    public final c91 h(c91 c91Var) {
        return c91Var == null ? this : g(c91Var.f3765f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3765f);
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f3765f));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f3765f.length);
        for (b81 b81Var : this.f3765f) {
            parcel.writeParcelable(b81Var, 0);
        }
    }
}
