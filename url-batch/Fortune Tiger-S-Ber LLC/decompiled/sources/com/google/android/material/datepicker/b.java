package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new androidx.fragment.app.b(9);

    /* renamed from: f, reason: collision with root package name */
    public final r f1276f;
    public final r g;
    public final c h;

    /* renamed from: i, reason: collision with root package name */
    public final r f1277i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1278j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1279k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1280l;

    public b(r rVar, r rVar2, c cVar, r rVar3, int i4) {
        Objects.requireNonNull(rVar, "start cannot be null");
        Objects.requireNonNull(rVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f1276f = rVar;
        this.g = rVar2;
        this.f1277i = rVar3;
        this.f1278j = i4;
        this.h = cVar;
        if (rVar3 != null && rVar.f1324f.compareTo(rVar3.f1324f) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (rVar3 != null && rVar3.f1324f.compareTo(rVar2.f1324f) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i4 < 0 || i4 > a0.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f1280l = rVar.d(rVar2) + 1;
        this.f1279k = (rVar2.h - rVar.h) + 1;
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
        return this.f1276f.equals(bVar.f1276f) && this.g.equals(bVar.g) && Objects.equals(this.f1277i, bVar.f1277i) && this.f1278j == bVar.f1278j && this.h.equals(bVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1276f, this.g, this.f1277i, Integer.valueOf(this.f1278j), this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f1276f, 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeParcelable(this.f1277i, 0);
        parcel.writeParcelable(this.h, 0);
        parcel.writeInt(this.f1278j);
    }
}
