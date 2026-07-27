package com.google.android.gms.common.api;

import E1.l;
import I1.a;
import a.AbstractC0345a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new l(2);

    /* renamed from: d, reason: collision with root package name */
    public final int f6027d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6028e;

    public Scope(int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.f6027d = i2;
        this.f6028e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f6028e.equals(((Scope) obj).f6028e);
    }

    public final int hashCode() {
        return this.f6028e.hashCode();
    }

    public final String toString() {
        return this.f6028e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int N3 = AbstractC0345a.N(parcel, 20293);
        AbstractC0345a.P(parcel, 1, 4);
        parcel.writeInt(this.f6027d);
        AbstractC0345a.L(parcel, 2, this.f6028e);
        AbstractC0345a.O(parcel, N3);
    }
}
