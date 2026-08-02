package com.google.android.gms.common.api;

import H.h;
import O3.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e2.AbstractC0408a;

/* loaded from: classes.dex */
public final class Scope extends AbstractC0408a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new h(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f5771a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5772b;

    public Scope(int i4, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.f5771a = i4;
        this.f5772b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f5772b.equals(((Scope) obj).f5772b);
    }

    public final int hashCode() {
        return this.f5772b.hashCode();
    }

    public final String toString() {
        return this.f5772b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = l.D(parcel, 20293);
        l.G(parcel, 1, 4);
        parcel.writeInt(this.f5771a);
        l.A(parcel, 2, this.f5772b);
        l.F(parcel, D3);
    }
}
