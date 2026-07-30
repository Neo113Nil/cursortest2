package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Rd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2754Rd extends P2.a {
    public static final Parcelable.Creator<C2754Rd> CREATOR = new S8(8);

    /* renamed from: n, reason: collision with root package name */
    public final int f27386n;

    /* renamed from: u, reason: collision with root package name */
    public final int f27387u;

    /* renamed from: v, reason: collision with root package name */
    public final int f27388v;

    public C2754Rd(int i, int i4, int i9) {
        this.f27386n = i;
        this.f27387u = i4;
        this.f27388v = i9;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2754Rd)) {
            C2754Rd c2754Rd = (C2754Rd) obj;
            if (c2754Rd.f27388v == this.f27388v && c2754Rd.f27387u == this.f27387u && c2754Rd.f27386n == this.f27386n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f27386n, this.f27387u, this.f27388v});
    }

    public final String toString() {
        int i = this.f27386n;
        int length = String.valueOf(i).length();
        int i4 = this.f27387u;
        int length2 = String.valueOf(i4).length();
        int i9 = this.f27388v;
        StringBuilder sb = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i9).length());
        sb.append(i);
        sb.append(com.anythink.core.common.d.j.f12535z);
        sb.append(i4);
        sb.append(com.anythink.core.common.d.j.f12535z);
        sb.append(i9);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f27386n);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f27387u);
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(this.f27388v);
        S0.f.C(parcel, B8);
    }
}
