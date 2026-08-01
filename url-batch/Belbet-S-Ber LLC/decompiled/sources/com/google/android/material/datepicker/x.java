package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class x implements Comparable, Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new androidx.fragment.app.b(8);

    /* renamed from: f, reason: collision with root package name */
    public final Calendar f1122f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1123g;
    public final int h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1124j;

    /* renamed from: k, reason: collision with root package name */
    public final long f1125k;

    /* renamed from: l, reason: collision with root package name */
    public String f1126l;

    public x(Calendar calendar) {
        calendar.set(5, 1);
        Calendar c5 = i0.c(calendar);
        this.f1122f = c5;
        this.f1123g = c5.get(2);
        this.h = c5.get(1);
        this.i = c5.getMaximum(7);
        this.f1124j = c5.getActualMaximum(5);
        this.f1125k = c5.getTimeInMillis();
    }

    public static x b(int i, int i4) {
        Calendar e4 = i0.e(null);
        e4.set(1, i);
        e4.set(2, i4);
        return new x(e4);
    }

    public static x c(long j2) {
        Calendar e4 = i0.e(null);
        e4.setTimeInMillis(j2);
        return new x(e4);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(x xVar) {
        return this.f1122f.compareTo(xVar.f1122f);
    }

    public final String d() {
        if (this.f1126l == null) {
            this.f1126l = i0.b("yMMMM", Locale.getDefault()).format(new Date(this.f1122f.getTimeInMillis()));
        }
        return this.f1126l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e(x xVar) {
        if (!(this.f1122f instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (xVar.f1123g - this.f1123g) + ((xVar.h - this.h) * 12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f1123g == xVar.f1123g && this.h == xVar.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1123g), Integer.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.h);
        parcel.writeInt(this.f1123g);
    }
}
