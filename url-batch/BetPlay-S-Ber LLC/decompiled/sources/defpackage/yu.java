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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class yu implements Comparable, Parcelable {
    public static final Parcelable.Creator<yu> CREATOR = new v1(12);
    public final Calendar f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public String l;

    public yu(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a = w70.a(calendar);
        this.f = a;
        this.g = a.get(2);
        this.h = a.get(1);
        this.i = a.getMaximum(7);
        this.j = a.getActualMaximum(5);
        this.k = a.getTimeInMillis();
    }

    public static yu a(int i, int i2) {
        Calendar c = w70.c(null);
        c.set(1, i);
        c.set(2, i2);
        return new yu(c);
    }

    public static yu b(long j) {
        Calendar c = w70.c(null);
        c.setTimeInMillis(j);
        return new yu(c);
    }

    public final String c() {
        if (this.l == null) {
            long timeInMillis = this.f.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = w70.a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.l = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.l;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f.compareTo(((yu) obj).f);
    }

    public final int d(yu yuVar) {
        if (this.f instanceof GregorianCalendar) {
            return (yuVar.g - this.g) + ((yuVar.h - this.h) * 12);
        }
        o8.j("Only Gregorian calendars are supported.");
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
        if (!(obj instanceof yu)) {
            return false;
        }
        yu yuVar = (yu) obj;
        return this.g == yuVar.g && this.h == yuVar.h;
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
