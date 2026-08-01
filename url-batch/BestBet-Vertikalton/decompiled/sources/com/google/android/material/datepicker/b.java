package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new F0.b(8);

    /* renamed from: a, reason: collision with root package name */
    public final o f2243a;

    /* renamed from: b, reason: collision with root package name */
    public final o f2244b;

    /* renamed from: c, reason: collision with root package name */
    public final d f2245c;
    public final o d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2246e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2247f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2248g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f2243a = oVar;
        this.f2244b = oVar2;
        this.d = oVar3;
        this.f2246e = i;
        this.f2245c = dVar;
        if (oVar3 != null && oVar.f2303a.compareTo(oVar3.f2303a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f2303a.compareTo(oVar2.f2303a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f2248g = oVar.d(oVar2) + 1;
        this.f2247f = (oVar2.f2305c - oVar.f2305c) + 1;
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
        return this.f2243a.equals(bVar.f2243a) && this.f2244b.equals(bVar.f2244b) && Objects.equals(this.d, bVar.d) && this.f2246e == bVar.f2246e && this.f2245c.equals(bVar.f2245c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2243a, this.f2244b, this.d, Integer.valueOf(this.f2246e), this.f2245c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2243a, 0);
        parcel.writeParcelable(this.f2244b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f2245c, 0);
        parcel.writeInt(this.f2246e);
    }
}
