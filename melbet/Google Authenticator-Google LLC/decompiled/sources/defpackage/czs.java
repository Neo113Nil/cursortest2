package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czs extends cri {
    public static final Parcelable.Creator CREATOR = new ctt(2);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public czs(int i, String str, long j, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
    }

    public final String toString() {
        return String.format(Locale.US, "ExtendedSyncStatus{code=%d, message=%s, lastSyncTimeMillis=%d, numOfItems=%d, syncStage=%d, dataType=%d, cycleStatus=%d, numOfSyncedItems=%d, numOfTotalItems=%d}", Integer.valueOf(this.a), this.b, Long.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 2, i2);
        oy.I(parcel, 3, this.b);
        oy.w(parcel, 4, this.c);
        oy.v(parcel, 5, this.d);
        oy.v(parcel, 6, this.e);
        oy.v(parcel, 7, this.f);
        oy.v(parcel, 8, this.g);
        oy.v(parcel, 9, this.h);
        oy.v(parcel, 10, this.i);
        oy.r(parcel, q);
    }
}
