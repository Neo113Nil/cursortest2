package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new R.k(7);

    /* renamed from: a, reason: collision with root package name */
    public final o f1862a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1863b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1864c;
    public final o d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1865e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1866f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1867g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f1862a = oVar;
        this.f1863b = oVar2;
        this.d = oVar3;
        this.f1865e = i;
        this.f1864c = dVar;
        if (oVar3 != null && oVar.f1922a.compareTo(oVar3.f1922a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f1922a.compareTo(oVar2.f1922a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f1867g = oVar.d(oVar2) + 1;
        this.f1866f = (oVar2.f1924c - oVar.f1924c) + 1;
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
        return this.f1862a.equals(bVar.f1862a) && this.f1863b.equals(bVar.f1863b) && Objects.equals(this.d, bVar.d) && this.f1865e == bVar.f1865e && this.f1864c.equals(bVar.f1864c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1862a, this.f1863b, this.d, Integer.valueOf(this.f1865e), this.f1864c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1862a, 0);
        parcel.writeParcelable(this.f1863b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f1864c, 0);
        parcel.writeInt(this.f1865e);
    }
}
