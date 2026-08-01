package com.google.android.gms.common.api;

import a7.o;
import android.os.Parcel;
import android.os.Parcelable;
import c7.c0;
import cf.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d7.a;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new o(2);

    /* renamed from: d, reason: collision with root package name */
    public final int f2117d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2118e;

    public Scope(int i3, String str) {
        c0.e(str, "scopeUri must not be null or empty");
        this.f2117d = i3;
        this.f2118e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2118e.equals(((Scope) obj).f2118e);
    }

    public final int hashCode() {
        return this.f2118e.hashCode();
    }

    public final String toString() {
        return this.f2118e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = c.Z(parcel, 20293);
        c.Y(parcel, 1, 4);
        parcel.writeInt(this.f2117d);
        c.V(parcel, 2, this.f2118e);
        c.a0(parcel, Z);
    }
}
