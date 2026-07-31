package com.google.android.gms.common.api;

import I.j;
import U0.t;
import V0.a;
import a.AbstractC0219a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new j(4);

    /* renamed from: f, reason: collision with root package name */
    public final int f3857f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3858g;

    public Scope(String str, int i7) {
        t.d(str, "scopeUri must not be null or empty");
        this.f3857f = i7;
        this.f3858g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f3858g.equals(((Scope) obj).f3858g);
    }

    public final int hashCode() {
        return this.f3858g.hashCode();
    }

    public final String toString() {
        return this.f3858g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int O6 = AbstractC0219a.O(parcel, 20293);
        AbstractC0219a.R(parcel, 1, 4);
        parcel.writeInt(this.f3857f);
        AbstractC0219a.J(parcel, 2, this.f3858g);
        AbstractC0219a.Q(parcel, O6);
    }
}
