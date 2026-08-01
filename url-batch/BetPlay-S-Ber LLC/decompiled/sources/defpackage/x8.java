package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class x8 implements Parcelable {
    public static final Parcelable.Creator<x8> CREATOR = new v1(4);
    public final yu f;
    public final yu g;
    public final ee h;
    public final yu i;
    public final int j;
    public final int k;
    public final int l;

    public x8(yu yuVar, yu yuVar2, ee eeVar, yu yuVar3, int i) {
        Objects.requireNonNull(yuVar, "start cannot be null");
        Objects.requireNonNull(yuVar2, "end cannot be null");
        Objects.requireNonNull(eeVar, "validator cannot be null");
        this.f = yuVar;
        this.g = yuVar2;
        this.i = yuVar3;
        this.j = i;
        this.h = eeVar;
        if (yuVar3 != null && yuVar.f.compareTo(yuVar3.f) > 0) {
            o8.j("start Month cannot be after current Month");
            throw null;
        }
        if (yuVar3 != null && yuVar3.f.compareTo(yuVar2.f) > 0) {
            o8.j("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > w70.c(null).getMaximum(7)) {
            o8.j("firstDayOfWeek is not valid");
            throw null;
        }
        this.l = yuVar.d(yuVar2) + 1;
        this.k = (yuVar2.h - yuVar.h) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8)) {
            return false;
        }
        x8 x8Var = (x8) obj;
        return this.f.equals(x8Var.f) && this.g.equals(x8Var.g) && Objects.equals(this.i, x8Var.i) && this.j == x8Var.j && this.h.equals(x8Var.h);
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
