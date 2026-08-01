package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Q.k(7);

    /* renamed from: a, reason: collision with root package name */
    public final o f1794a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1795b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1796c;
    public final o d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1797e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1798f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1799g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f1794a = oVar;
        this.f1795b = oVar2;
        this.d = oVar3;
        this.f1797e = i;
        this.f1796c = dVar;
        if (oVar3 != null && oVar.f1854a.compareTo(oVar3.f1854a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f1854a.compareTo(oVar2.f1854a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f1799g = oVar.d(oVar2) + 1;
        this.f1798f = (oVar2.f1856c - oVar.f1856c) + 1;
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
        return this.f1794a.equals(bVar.f1794a) && this.f1795b.equals(bVar.f1795b) && Objects.equals(this.d, bVar.d) && this.f1797e == bVar.f1797e && this.f1796c.equals(bVar.f1796c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1794a, this.f1795b, this.d, Integer.valueOf(this.f1797e), this.f1796c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1794a, 0);
        parcel.writeParcelable(this.f1795b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f1796c, 0);
        parcel.writeInt(this.f1797e);
    }
}
