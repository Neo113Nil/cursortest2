package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new B0.b(7);

    /* renamed from: a, reason: collision with root package name */
    public final o f2355a;

    /* renamed from: b, reason: collision with root package name */
    public final o f2356b;

    /* renamed from: c, reason: collision with root package name */
    public final d f2357c;

    /* renamed from: d, reason: collision with root package name */
    public final o f2358d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2359f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2360g;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f2355a = oVar;
        this.f2356b = oVar2;
        this.f2358d = oVar3;
        this.e = i;
        this.f2357c = dVar;
        if (oVar3 != null && oVar.f2415a.compareTo(oVar3.f2415a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f2415a.compareTo(oVar2.f2415a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f2360g = oVar.d(oVar2) + 1;
        this.f2359f = (oVar2.f2417c - oVar.f2417c) + 1;
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
        return this.f2355a.equals(bVar.f2355a) && this.f2356b.equals(bVar.f2356b) && Objects.equals(this.f2358d, bVar.f2358d) && this.e == bVar.e && this.f2357c.equals(bVar.f2357c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2355a, this.f2356b, this.f2358d, Integer.valueOf(this.e), this.f2357c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2355a, 0);
        parcel.writeParcelable(this.f2356b, 0);
        parcel.writeParcelable(this.f2358d, 0);
        parcel.writeParcelable(this.f2357c, 0);
        parcel.writeInt(this.e);
    }
}
