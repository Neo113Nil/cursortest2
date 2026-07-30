package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.i1;
import defpackage.ll3;
import defpackage.va3;
import defpackage.yk3;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class Scope extends i1 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new va3(14);
    public final int m;
    public final String n;

    public Scope(int i, String str) {
        ll3.t(str, "scopeUri must not be null or empty");
        this.m = i;
        this.n = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.n.equals(((Scope) obj).n);
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.d0(parcel, 1, 4);
        parcel.writeInt(this.m);
        yk3.W(parcel, 2, this.n);
        yk3.c0(parcel, b0);
    }
}
