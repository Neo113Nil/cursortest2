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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class r implements Comparable, Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new androidx.fragment.app.b(8);

    /* renamed from: f, reason: collision with root package name */
    public final Calendar f955f;

    /* renamed from: g, reason: collision with root package name */
    public final int f956g;

    /* renamed from: h, reason: collision with root package name */
    public final int f957h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f958j;

    /* renamed from: k, reason: collision with root package name */
    public final long f959k;

    /* renamed from: l, reason: collision with root package name */
    public String f960l;

    public r(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a2 = z.a(calendar);
        this.f955f = a2;
        this.f956g = a2.get(2);
        this.f957h = a2.get(1);
        this.i = a2.getMaximum(7);
        this.f958j = a2.getActualMaximum(5);
        this.f959k = a2.getTimeInMillis();
    }

    public static r a(int i, int i4) {
        Calendar c4 = z.c(null);
        c4.set(1, i);
        c4.set(2, i4);
        return new r(c4);
    }

    public static r b(long j4) {
        Calendar c4 = z.c(null);
        c4.setTimeInMillis(j4);
        return new r(c4);
    }

    public final String c() {
        if (this.f960l == null) {
            long timeInMillis = this.f955f.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = z.f972a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f960l = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f960l;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f955f.compareTo(((r) obj).f955f);
    }

    public final int d(r rVar) {
        if (!(this.f955f instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (rVar.f956g - this.f956g) + ((rVar.f957h - this.f957h) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f956g == rVar.f956g && this.f957h == rVar.f957h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f956g), Integer.valueOf(this.f957h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f957h);
        parcel.writeInt(this.f956g);
    }
}
