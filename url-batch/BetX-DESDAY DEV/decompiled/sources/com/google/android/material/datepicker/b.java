package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Q.k(8);

    /* renamed from: a, reason: collision with root package name */
    public final o f1833a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1834b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1835c;

    /* renamed from: d, reason: collision with root package name */
    public final o f1836d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1837e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1838f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1839g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f1833a = oVar;
        this.f1834b = oVar2;
        this.f1836d = oVar3;
        this.f1837e = i;
        this.f1835c = dVar;
        if (oVar3 != null && oVar.f1892a.compareTo(oVar3.f1892a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f1892a.compareTo(oVar2.f1892a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f1839g = oVar.d(oVar2) + 1;
        this.f1838f = (oVar2.f1894c - oVar.f1894c) + 1;
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
        return this.f1833a.equals(bVar.f1833a) && this.f1834b.equals(bVar.f1834b) && Objects.equals(this.f1836d, bVar.f1836d) && this.f1837e == bVar.f1837e && this.f1835c.equals(bVar.f1835c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1833a, this.f1834b, this.f1836d, Integer.valueOf(this.f1837e), this.f1835c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1833a, 0);
        parcel.writeParcelable(this.f1834b, 0);
        parcel.writeParcelable(this.f1836d, 0);
        parcel.writeParcelable(this.f1835c, 0);
        parcel.writeInt(this.f1837e);
    }
}
