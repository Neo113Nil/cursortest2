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
    public static final Parcelable.Creator<o> CREATOR = new B0.b(9);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f2415a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2416b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2417c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2418d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2419f;

    /* renamed from: g, reason: collision with root package name */
    public String f2420g;

    public o(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a2 = w.a(calendar);
        this.f2415a = a2;
        this.f2416b = a2.get(2);
        this.f2417c = a2.get(1);
        this.f2418d = a2.getMaximum(7);
        this.e = a2.getActualMaximum(5);
        this.f2419f = a2.getTimeInMillis();
    }

    public static o a(int i, int i2) {
        Calendar c2 = w.c(null);
        c2.set(1, i);
        c2.set(2, i2);
        return new o(c2);
    }

    public static o b(long j) {
        Calendar c2 = w.c(null);
        c2.setTimeInMillis(j);
        return new o(c2);
    }

    public final String c() {
        if (this.f2420g == null) {
            long timeInMillis = this.f2415a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = w.f2432a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f2420g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f2420g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2415a.compareTo(((o) obj).f2415a);
    }

    public final int d(o oVar) {
        if (!(this.f2415a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (oVar.f2416b - this.f2416b) + ((oVar.f2417c - this.f2417c) * 12);
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
        return this.f2416b == oVar.f2416b && this.f2417c == oVar.f2417c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2416b), Integer.valueOf(this.f2417c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2417c);
        parcel.writeInt(this.f2416b);
    }
}
