package com.google.android.gms.common.api;

import a8.m;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import n4.a;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new d4.a(5);

    /* renamed from: f, reason: collision with root package name */
    public final int f1772f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1773g;

    public Scope(String str, int i7) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.f1772f = i7;
        this.f1773g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f1773g.equals(((Scope) obj).f1773g);
    }

    public final int hashCode() {
        return this.f1773g.hashCode();
    }

    public final String toString() {
        return this.f1773g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int R = m.R(parcel, 20293);
        m.T(parcel, 1, 4);
        parcel.writeInt(this.f1772f);
        m.P(parcel, 2, this.f1773g);
        m.S(parcel, R);
    }
}
