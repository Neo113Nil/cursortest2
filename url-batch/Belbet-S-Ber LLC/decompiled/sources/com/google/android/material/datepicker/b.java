package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new androidx.fragment.app.b(6);

    /* renamed from: f, reason: collision with root package name */
    public final x f1033f;

    /* renamed from: g, reason: collision with root package name */
    public final x f1034g;
    public final g h;
    public x i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1035j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1036k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1037l;

    public b(x xVar, x xVar2, g gVar, x xVar3, int i) {
        Objects.requireNonNull(xVar, "start cannot be null");
        Objects.requireNonNull(xVar2, "end cannot be null");
        Objects.requireNonNull(gVar, "validator cannot be null");
        this.f1033f = xVar;
        this.f1034g = xVar2;
        this.i = xVar3;
        this.f1035j = i;
        this.h = gVar;
        if (xVar3 != null && xVar.f1122f.compareTo(xVar3.f1122f) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (xVar3 != null && xVar3.f1122f.compareTo(xVar2.f1122f) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > i0.e(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f1037l = xVar.e(xVar2) + 1;
        this.f1036k = (xVar2.h - xVar.h) + 1;
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
        return this.f1033f.equals(bVar.f1033f) && this.f1034g.equals(bVar.f1034g) && Objects.equals(this.i, bVar.i) && this.f1035j == bVar.f1035j && this.h.equals(bVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1033f, this.f1034g, this.i, Integer.valueOf(this.f1035j), this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1033f, 0);
        parcel.writeParcelable(this.f1034g, 0);
        parcel.writeParcelable(this.i, 0);
        parcel.writeParcelable(this.h, 0);
        parcel.writeInt(this.f1035j);
    }
}
