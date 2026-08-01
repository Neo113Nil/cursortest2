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
    public static final Parcelable.Creator<o> CREATOR = new F0.b(10);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f2303a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2304b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2305c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2306e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2307f;

    /* renamed from: g, reason: collision with root package name */
    public String f2308g;

    public o(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a2 = w.a(calendar);
        this.f2303a = a2;
        this.f2304b = a2.get(2);
        this.f2305c = a2.get(1);
        this.d = a2.getMaximum(7);
        this.f2306e = a2.getActualMaximum(5);
        this.f2307f = a2.getTimeInMillis();
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
        if (this.f2308g == null) {
            long timeInMillis = this.f2303a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = w.f2320a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f2308g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f2308g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2303a.compareTo(((o) obj).f2303a);
    }

    public final int d(o oVar) {
        if (!(this.f2303a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (oVar.f2304b - this.f2304b) + ((oVar.f2305c - this.f2305c) * 12);
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
        return this.f2304b == oVar.f2304b && this.f2305c == oVar.f2305c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2304b), Integer.valueOf(this.f2305c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2305c);
        parcel.writeInt(this.f2304b);
    }
}
