package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Q.k(7);

    /* renamed from: a, reason: collision with root package name */
    public final o f1738a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1739b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1740c;
    public final o d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1741e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1742f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1743g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f1738a = oVar;
        this.f1739b = oVar2;
        this.d = oVar3;
        this.f1741e = i;
        this.f1740c = dVar;
        if (oVar3 != null && oVar.f1797a.compareTo(oVar3.f1797a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f1797a.compareTo(oVar2.f1797a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f1743g = oVar.d(oVar2) + 1;
        this.f1742f = (oVar2.f1799c - oVar.f1799c) + 1;
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
        return this.f1738a.equals(bVar.f1738a) && this.f1739b.equals(bVar.f1739b) && Objects.equals(this.d, bVar.d) && this.f1741e == bVar.f1741e && this.f1740c.equals(bVar.f1740c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1738a, this.f1739b, this.d, Integer.valueOf(this.f1741e), this.f1740c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1738a, 0);
        parcel.writeParcelable(this.f1739b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f1740c, 0);
        parcel.writeInt(this.f1741e);
    }
}
