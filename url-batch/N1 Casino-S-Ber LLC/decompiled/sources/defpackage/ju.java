package defpackage;

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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ju implements Comparable, Parcelable {
    public static final Parcelable.Creator<ju> CREATOR = new r1(11);
    public final Calendar f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public String l;

    public ju(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a = p70.a(calendar);
        this.f = a;
        this.g = a.get(2);
        this.h = a.get(1);
        this.i = a.getMaximum(7);
        this.j = a.getActualMaximum(5);
        this.k = a.getTimeInMillis();
    }

    public static ju a(int i, int i2) {
        Calendar c = p70.c(null);
        c.set(1, i);
        c.set(2, i2);
        return new ju(c);
    }

    public static ju b(long j) {
        Calendar c = p70.c(null);
        c.setTimeInMillis(j);
        return new ju(c);
    }

    public final String c() {
        if (this.l == null) {
            long timeInMillis = this.f.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = p70.a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.l = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.l;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f.compareTo(((ju) obj).f);
    }

    public final int d(ju juVar) {
        if (this.f instanceof GregorianCalendar) {
            return (juVar.g - this.g) + ((juVar.h - this.h) * 12);
        }
        t8.k("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju)) {
            return false;
        }
        ju juVar = (ju) obj;
        return this.g == juVar.g && this.h == juVar.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.h);
        parcel.writeInt(this.g);
    }
}
