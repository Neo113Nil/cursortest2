package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ckq;
import defpackage.cri;
import defpackage.oy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Scope extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ckq(12);
    final int a;
    public final String b;

    public Scope(int i, String str) {
        oy.as(str, "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.b.equals(((Scope) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, this.a);
        oy.I(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
