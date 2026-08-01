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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class r implements Comparable, Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new androidx.fragment.app.b(11);

    /* renamed from: f, reason: collision with root package name */
    public final Calendar f1324f;
    public final int g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1325i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1326j;

    /* renamed from: k, reason: collision with root package name */
    public final long f1327k;

    /* renamed from: l, reason: collision with root package name */
    public String f1328l;

    public r(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a4 = a0.a(calendar);
        this.f1324f = a4;
        this.g = a4.get(2);
        this.h = a4.get(1);
        this.f1325i = a4.getMaximum(7);
        this.f1326j = a4.getActualMaximum(5);
        this.f1327k = a4.getTimeInMillis();
    }

    public static r a(int i4, int i5) {
        Calendar c = a0.c(null);
        c.set(1, i4);
        c.set(2, i5);
        return new r(c);
    }

    public static r b(long j4) {
        Calendar c = a0.c(null);
        c.setTimeInMillis(j4);
        return new r(c);
    }

    public final String c() {
        if (this.f1328l == null) {
            long timeInMillis = this.f1324f.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = a0.f1275a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f1328l = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f1328l;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1324f.compareTo(((r) obj).f1324f);
    }

    public final int d(r rVar) {
        if (!(this.f1324f instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (rVar.g - this.g) + ((rVar.h - this.h) * 12);
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
        return this.g == rVar.g && this.h == rVar.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.h);
        parcel.writeInt(this.g);
    }
}
