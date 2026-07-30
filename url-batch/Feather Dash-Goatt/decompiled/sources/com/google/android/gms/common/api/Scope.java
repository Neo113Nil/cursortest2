package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.g2;
import defpackage.t0;
import defpackage.y90;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class Scope extends t0 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new g2(17);
    public final int d;
    public final String e;

    public Scope(int i, String str) {
        y90.f(str, "scopeUri must not be null or empty");
        this.d = i;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.e.equals(((Scope) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int P = y90.P(parcel, 20293);
        y90.R(parcel, 1, 4);
        parcel.writeInt(this.d);
        y90.M(parcel, 2, this.e);
        y90.Q(parcel, P);
    }
}
