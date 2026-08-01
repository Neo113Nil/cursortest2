package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class o implements Comparable, Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new Q.k(10);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f1914a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1915b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1916c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1917d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1918e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1919f;

    /* renamed from: g, reason: collision with root package name */
    public String f1920g;

    public o(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a2 = w.a(calendar);
        this.f1914a = a2;
        this.f1915b = a2.get(2);
        this.f1916c = a2.get(1);
        this.f1917d = a2.getMaximum(7);
        this.f1918e = a2.getActualMaximum(5);
        this.f1919f = a2.getTimeInMillis();
    }

    public static o a(int i, int i2) {
        Calendar c2 = w.c(null);
        c2.set(1, i);
        c2.set(2, i2);
        return new o(c2);
    }

    public static o b(long j2) {
        Calendar c2 = w.c(null);
        c2.setTimeInMillis(j2);
        return new o(c2);
    }

    public final String c() {
        if (this.f1920g == null) {
            long timeInMillis = this.f1914a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = w.f1934a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f1920g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f1920g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1914a.compareTo(((o) obj).f1914a);
    }

    public final int d(o oVar) {
        if (!(this.f1914a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (oVar.f1915b - this.f1915b) + ((oVar.f1916c - this.f1916c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f1915b == oVar.f1915b && this.f1916c == oVar.f1916c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1915b), Integer.valueOf(this.f1916c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1916c);
        parcel.writeInt(this.f1915b);
    }
}
