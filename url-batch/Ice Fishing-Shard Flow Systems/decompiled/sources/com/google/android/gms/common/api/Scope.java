package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import r1.o;
import t1.u;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class Scope extends AbstractC0943a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new o(2);

    /* renamed from: d, reason: collision with root package name */
    public final int f4367d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4368e;

    public Scope(int i2, String str) {
        u.d(str, "scopeUri must not be null or empty");
        this.f4367d = i2;
        this.f4368e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f4368e.equals(((Scope) obj).f4368e);
    }

    public final int hashCode() {
        return this.f4368e.hashCode();
    }

    public final String toString() {
        return this.f4368e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.P(parcel, 1, 4);
        parcel.writeInt(this.f4367d);
        AbstractC1053a.K(parcel, 2, this.f4368e);
        AbstractC1053a.S(parcel, Q);
    }
}
