package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Q.k(7);

    /* renamed from: a, reason: collision with root package name */
    public final o f1638a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1639b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1640c;
    public final o d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1641e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1642f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1643g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f1638a = oVar;
        this.f1639b = oVar2;
        this.d = oVar3;
        this.f1641e = i;
        this.f1640c = dVar;
        if (oVar3 != null && oVar.f1697a.compareTo(oVar3.f1697a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f1697a.compareTo(oVar2.f1697a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f1643g = oVar.d(oVar2) + 1;
        this.f1642f = (oVar2.f1699c - oVar.f1699c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1638a.equals(bVar.f1638a) && this.f1639b.equals(bVar.f1639b) && Objects.equals(this.d, bVar.d) && this.f1641e == bVar.f1641e && this.f1640c.equals(bVar.f1640c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1638a, this.f1639b, this.d, Integer.valueOf(this.f1641e), this.f1640c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1638a, 0);
        parcel.writeParcelable(this.f1639b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f1640c, 0);
        parcel.writeInt(this.f1641e);
    }
}
