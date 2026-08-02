package com.google.android.gms.common.api;

import C2.b;
import H.h;
import O0.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new h(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f2675a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2676b;

    public Scope(int i3, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.f2675a = i3;
        this.f2676b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2676b.equals(((Scope) obj).f2676b);
    }

    public final int hashCode() {
        return this.f2676b.hashCode();
    }

    public final String toString() {
        return this.f2676b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = b.S(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f2675a);
        b.O(parcel, 2, this.f2676b);
        b.T(parcel, S2);
    }
}
