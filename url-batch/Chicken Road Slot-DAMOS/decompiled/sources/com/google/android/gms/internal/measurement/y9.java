package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y9 extends d7.a {
    public static final Parcelable.Creator<y9> CREATOR = new o6(8);

    /* renamed from: d, reason: collision with root package name */
    public final List f3011d;

    public y9(ArrayList arrayList) {
        this.f3011d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y9) {
            return this.f3011d.equals(((y9) obj).f3011d);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlagOverrides(");
        boolean z10 = true;
        for (x9 x9Var : this.f3011d) {
            if (!z10) {
                sb2.append(", ");
            }
            x9Var.b(sb2);
            z10 = false;
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.X(parcel, 2, this.f3011d);
        cf.c.a0(parcel, Z);
    }
}
