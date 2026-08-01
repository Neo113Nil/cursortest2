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
    public static final Parcelable.Creator<o> CREATOR = new A0.b(10);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f1826a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1827b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1828c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1829e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1830f;

    /* renamed from: g, reason: collision with root package name */
    public String f1831g;

    public o(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a2 = w.a(calendar);
        this.f1826a = a2;
        this.f1827b = a2.get(2);
        this.f1828c = a2.get(1);
        this.d = a2.getMaximum(7);
        this.f1829e = a2.getActualMaximum(5);
        this.f1830f = a2.getTimeInMillis();
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
        if (this.f1831g == null) {
            long timeInMillis = this.f1826a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = w.f1843a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f1831g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f1831g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1826a.compareTo(((o) obj).f1826a);
    }

    public final int d(o oVar) {
        if (!(this.f1826a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (oVar.f1827b - this.f1827b) + ((oVar.f1828c - this.f1828c) * 12);
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
        return this.f1827b == oVar.f1827b && this.f1828c == oVar.f1828c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1827b), Integer.valueOf(this.f1828c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1828c);
        parcel.writeInt(this.f1827b);
    }
}
