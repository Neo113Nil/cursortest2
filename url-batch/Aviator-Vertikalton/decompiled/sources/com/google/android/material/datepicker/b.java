package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Q.k(8);

    /* renamed from: a, reason: collision with root package name */
    public final o f1855a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1856b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1857c;

    /* renamed from: d, reason: collision with root package name */
    public final o f1858d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1859e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1860f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1861g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f1855a = oVar;
        this.f1856b = oVar2;
        this.f1858d = oVar3;
        this.f1859e = i;
        this.f1857c = dVar;
        if (oVar3 != null && oVar.f1914a.compareTo(oVar3.f1914a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f1914a.compareTo(oVar2.f1914a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f1861g = oVar.d(oVar2) + 1;
        this.f1860f = (oVar2.f1916c - oVar.f1916c) + 1;
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
        return this.f1855a.equals(bVar.f1855a) && this.f1856b.equals(bVar.f1856b) && Objects.equals(this.f1858d, bVar.f1858d) && this.f1859e == bVar.f1859e && this.f1857c.equals(bVar.f1857c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1855a, this.f1856b, this.f1858d, Integer.valueOf(this.f1859e), this.f1857c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1855a, 0);
        parcel.writeParcelable(this.f1856b, 0);
        parcel.writeParcelable(this.f1858d, 0);
        parcel.writeParcelable(this.f1857c, 0);
        parcel.writeInt(this.f1859e);
    }
}
