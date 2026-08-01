package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class c9 implements Parcelable {
    public static final Parcelable.Creator<c9> CREATOR = new r1(4);
    public final ju f;
    public final ju g;
    public final ee h;
    public final ju i;
    public final int j;
    public final int k;
    public final int l;

    public c9(ju juVar, ju juVar2, ee eeVar, ju juVar3, int i) {
        Objects.requireNonNull(juVar, "start cannot be null");
        Objects.requireNonNull(juVar2, "end cannot be null");
        Objects.requireNonNull(eeVar, "validator cannot be null");
        this.f = juVar;
        this.g = juVar2;
        this.i = juVar3;
        this.j = i;
        this.h = eeVar;
        if (juVar3 != null && juVar.f.compareTo(juVar3.f) > 0) {
            t8.k("start Month cannot be after current Month");
            throw null;
        }
        if (juVar3 != null && juVar3.f.compareTo(juVar2.f) > 0) {
            t8.k("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > p70.c(null).getMaximum(7)) {
            t8.k("firstDayOfWeek is not valid");
            throw null;
        }
        this.l = juVar.d(juVar2) + 1;
        this.k = (juVar2.h - juVar.h) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9)) {
            return false;
        }
        c9 c9Var = (c9) obj;
        return this.f.equals(c9Var.f) && this.g.equals(c9Var.g) && Objects.equals(this.i, c9Var.i) && this.j == c9Var.j && this.h.equals(c9Var.h);
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
