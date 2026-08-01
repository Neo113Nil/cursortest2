package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new androidx.fragment.app.b(6);

    /* renamed from: f, reason: collision with root package name */
    public final r f903f;

    /* renamed from: g, reason: collision with root package name */
    public final r f904g;

    /* renamed from: h, reason: collision with root package name */
    public final d f905h;
    public final r i;

    /* renamed from: j, reason: collision with root package name */
    public final int f906j;

    /* renamed from: k, reason: collision with root package name */
    public final int f907k;

    /* renamed from: l, reason: collision with root package name */
    public final int f908l;

    public b(r rVar, r rVar2, d dVar, r rVar3, int i) {
        Objects.requireNonNull(rVar, "start cannot be null");
        Objects.requireNonNull(rVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f903f = rVar;
        this.f904g = rVar2;
        this.i = rVar3;
        this.f906j = i;
        this.f905h = dVar;
        if (rVar3 != null && rVar.f955f.compareTo(rVar3.f955f) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (rVar3 != null && rVar3.f955f.compareTo(rVar2.f955f) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > z.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f908l = rVar.d(rVar2) + 1;
        this.f907k = (rVar2.f957h - rVar.f957h) + 1;
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
        return this.f903f.equals(bVar.f903f) && this.f904g.equals(bVar.f904g) && Objects.equals(this.i, bVar.i) && this.f906j == bVar.f906j && this.f905h.equals(bVar.f905h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f903f, this.f904g, this.i, Integer.valueOf(this.f906j), this.f905h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f903f, 0);
        parcel.writeParcelable(this.f904g, 0);
        parcel.writeParcelable(this.i, 0);
        parcel.writeParcelable(this.f905h, 0);
        parcel.writeInt(this.f906j);
    }
}
