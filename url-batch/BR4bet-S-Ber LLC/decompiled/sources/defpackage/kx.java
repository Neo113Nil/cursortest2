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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class kx implements Comparable, Parcelable {
    public static final Parcelable.Creator<kx> CREATOR = new s1(11);
    public final Calendar f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public String l;

    public kx(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a = za0.a(calendar);
        this.f = a;
        this.g = a.get(2);
        this.h = a.get(1);
        this.i = a.getMaximum(7);
        this.j = a.getActualMaximum(5);
        this.k = a.getTimeInMillis();
    }

    public static kx a(int i, int i2) {
        Calendar c = za0.c(null);
        c.set(1, i);
        c.set(2, i2);
        return new kx(c);
    }

    public static kx b(long j) {
        Calendar c = za0.c(null);
        c.setTimeInMillis(j);
        return new kx(c);
    }

    public final String c() {
        if (this.l == null) {
            long timeInMillis = this.f.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = za0.a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.l = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.l;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f.compareTo(((kx) obj).f);
    }

    public final int d(kx kxVar) {
        if (this.f instanceof GregorianCalendar) {
            return (kxVar.g - this.g) + ((kxVar.h - this.h) * 12);
        }
        g9.i("Only Gregorian calendars are supported.");
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
        if (!(obj instanceof kx)) {
            return false;
        }
        kx kxVar = (kx) obj;
        return this.g == kxVar.g && this.h == kxVar.h;
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
