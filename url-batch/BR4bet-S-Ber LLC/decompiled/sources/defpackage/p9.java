package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class p9 implements Parcelable {
    public static final Parcelable.Creator<p9> CREATOR = new s1(4);
    public final kx f;
    public final kx g;
    public final sf h;
    public final kx i;
    public final int j;
    public final int k;
    public final int l;

    public p9(kx kxVar, kx kxVar2, sf sfVar, kx kxVar3, int i) {
        Objects.requireNonNull(kxVar, "start cannot be null");
        Objects.requireNonNull(kxVar2, "end cannot be null");
        Objects.requireNonNull(sfVar, "validator cannot be null");
        this.f = kxVar;
        this.g = kxVar2;
        this.i = kxVar3;
        this.j = i;
        this.h = sfVar;
        if (kxVar3 != null && kxVar.f.compareTo(kxVar3.f) > 0) {
            g9.i("start Month cannot be after current Month");
            throw null;
        }
        if (kxVar3 != null && kxVar3.f.compareTo(kxVar2.f) > 0) {
            g9.i("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > za0.c(null).getMaximum(7)) {
            g9.i("firstDayOfWeek is not valid");
            throw null;
        }
        this.l = kxVar.d(kxVar2) + 1;
        this.k = (kxVar2.h - kxVar.h) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9)) {
            return false;
        }
        p9 p9Var = (p9) obj;
        return this.f.equals(p9Var.f) && this.g.equals(p9Var.g) && Objects.equals(this.i, p9Var.i) && this.j == p9Var.j && this.h.equals(p9Var.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.g, this.i, Integer.valueOf(this.j), this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeParcelable(this.i, 0);
        parcel.writeParcelable(this.h, 0);
        parcel.writeInt(this.j);
    }
}
