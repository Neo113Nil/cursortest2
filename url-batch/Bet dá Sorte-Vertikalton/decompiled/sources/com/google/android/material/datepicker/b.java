package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new A0.b(8);

    /* renamed from: a, reason: collision with root package name */
    public final o f1767a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1768b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1769c;
    public final o d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1770e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1771f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1772g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f1767a = oVar;
        this.f1768b = oVar2;
        this.d = oVar3;
        this.f1770e = i;
        this.f1769c = dVar;
        if (oVar3 != null && oVar.f1826a.compareTo(oVar3.f1826a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f1826a.compareTo(oVar2.f1826a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f1772g = oVar.d(oVar2) + 1;
        this.f1771f = (oVar2.f1828c - oVar.f1828c) + 1;
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
        return this.f1767a.equals(bVar.f1767a) && this.f1768b.equals(bVar.f1768b) && Objects.equals(this.d, bVar.d) && this.f1770e == bVar.f1770e && this.f1769c.equals(bVar.f1769c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1767a, this.f1768b, this.d, Integer.valueOf(this.f1770e), this.f1769c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1767a, 0);
        parcel.writeParcelable(this.f1768b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f1769c, 0);
        parcel.writeInt(this.f1770e);
    }
}
