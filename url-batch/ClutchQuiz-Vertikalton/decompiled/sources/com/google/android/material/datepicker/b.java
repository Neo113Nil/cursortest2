package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new C0.b(8);

    /* renamed from: a, reason: collision with root package name */
    public final o f1845a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1846b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1847c;
    public final o d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1848e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1849f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1850g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f1845a = oVar;
        this.f1846b = oVar2;
        this.d = oVar3;
        this.f1848e = i;
        this.f1847c = dVar;
        if (oVar3 != null && oVar.f1905a.compareTo(oVar3.f1905a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f1905a.compareTo(oVar2.f1905a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f1850g = oVar.d(oVar2) + 1;
        this.f1849f = (oVar2.f1907c - oVar.f1907c) + 1;
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
        return this.f1845a.equals(bVar.f1845a) && this.f1846b.equals(bVar.f1846b) && Objects.equals(this.d, bVar.d) && this.f1848e == bVar.f1848e && this.f1847c.equals(bVar.f1847c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1845a, this.f1846b, this.d, Integer.valueOf(this.f1848e), this.f1847c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1845a, 0);
        parcel.writeParcelable(this.f1846b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f1847c, 0);
        parcel.writeInt(this.f1848e);
    }
}
