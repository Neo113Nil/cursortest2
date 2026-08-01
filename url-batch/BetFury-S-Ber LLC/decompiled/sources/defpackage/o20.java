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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class o20 implements Comparable, Parcelable {
    public static final Parcelable.Creator<o20> CREATOR = new u1(12);
    public final Calendar f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public String l;

    public o20(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a = xk0.a(calendar);
        this.f = a;
        this.g = a.get(2);
        this.h = a.get(1);
        this.i = a.getMaximum(7);
        this.j = a.getActualMaximum(5);
        this.k = a.getTimeInMillis();
    }

    public static o20 a(int i, int i2) {
        Calendar c = xk0.c(null);
        c.set(1, i);
        c.set(2, i2);
        return new o20(c);
    }

    public static o20 b(long j) {
        Calendar c = xk0.c(null);
        c.setTimeInMillis(j);
        return new o20(c);
    }

    public final String c() {
        if (this.l == null) {
            long timeInMillis = this.f.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = xk0.a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.l = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.l;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f.compareTo(((o20) obj).f);
    }

    public final int d(o20 o20Var) {
        if (this.f instanceof GregorianCalendar) {
            return (o20Var.g - this.g) + ((o20Var.h - this.h) * 12);
        }
        s9.k("Only Gregorian calendars are supported.");
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
        if (!(obj instanceof o20)) {
            return false;
        }
        o20 o20Var = (o20) obj;
        return this.g == o20Var.g && this.h == o20Var.h;
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
