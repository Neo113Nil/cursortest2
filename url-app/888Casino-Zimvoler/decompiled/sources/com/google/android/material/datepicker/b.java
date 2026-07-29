package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Q.k(7);

    /* renamed from: a, reason: collision with root package name */
    public final o f1636a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1637b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1638c;
    public final o d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1639e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1640f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1641g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f1636a = oVar;
        this.f1637b = oVar2;
        this.d = oVar3;
        this.f1639e = i;
        this.f1638c = dVar;
        if (oVar3 != null && oVar.f1695a.compareTo(oVar3.f1695a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f1695a.compareTo(oVar2.f1695a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f1641g = oVar.d(oVar2) + 1;
        this.f1640f = (oVar2.f1697c - oVar.f1697c) + 1;
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
        return this.f1636a.equals(bVar.f1636a) && this.f1637b.equals(bVar.f1637b) && Objects.equals(this.d, bVar.d) && this.f1639e == bVar.f1639e && this.f1638c.equals(bVar.f1638c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1636a, this.f1637b, this.d, Integer.valueOf(this.f1639e), this.f1638c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1636a, 0);
        parcel.writeParcelable(this.f1637b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f1638c, 0);
        parcel.writeInt(this.f1639e);
    }
}
