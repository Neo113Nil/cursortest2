package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Q.k(7);

    /* renamed from: a, reason: collision with root package name */
    public final o f1635a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1636b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1637c;
    public final o d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1638e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1639f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1640g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f1635a = oVar;
        this.f1636b = oVar2;
        this.d = oVar3;
        this.f1638e = i;
        this.f1637c = dVar;
        if (oVar3 != null && oVar.f1694a.compareTo(oVar3.f1694a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f1694a.compareTo(oVar2.f1694a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f1640g = oVar.d(oVar2) + 1;
        this.f1639f = (oVar2.f1696c - oVar.f1696c) + 1;
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
        return this.f1635a.equals(bVar.f1635a) && this.f1636b.equals(bVar.f1636b) && Objects.equals(this.d, bVar.d) && this.f1638e == bVar.f1638e && this.f1637c.equals(bVar.f1637c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1635a, this.f1636b, this.d, Integer.valueOf(this.f1638e), this.f1637c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1635a, 0);
        parcel.writeParcelable(this.f1636b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f1637c, 0);
        parcel.writeInt(this.f1638e);
    }
}
