package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new S.k(7);

    /* renamed from: a, reason: collision with root package name */
    public final o f1847a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1848b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1849c;
    public final o d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1850e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1851f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1852g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f1847a = oVar;
        this.f1848b = oVar2;
        this.d = oVar3;
        this.f1850e = i;
        this.f1849c = dVar;
        if (oVar3 != null && oVar.f1908a.compareTo(oVar3.f1908a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f1908a.compareTo(oVar2.f1908a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f1852g = oVar.d(oVar2) + 1;
        this.f1851f = (oVar2.f1910c - oVar.f1910c) + 1;
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
        return this.f1847a.equals(bVar.f1847a) && this.f1848b.equals(bVar.f1848b) && Objects.equals(this.d, bVar.d) && this.f1850e == bVar.f1850e && this.f1849c.equals(bVar.f1849c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1847a, this.f1848b, this.d, Integer.valueOf(this.f1850e), this.f1849c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1847a, 0);
        parcel.writeParcelable(this.f1848b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f1849c, 0);
        parcel.writeInt(this.f1850e);
    }
}
