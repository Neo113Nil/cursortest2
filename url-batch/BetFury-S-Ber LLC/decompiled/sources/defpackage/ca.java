package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ca implements Parcelable {
    public static final Parcelable.Creator<ca> CREATOR = new u1(4);
    public final o20 f;
    public final o20 g;
    public final wh h;
    public final o20 i;
    public final int j;
    public final int k;
    public final int l;

    public ca(o20 o20Var, o20 o20Var2, wh whVar, o20 o20Var3, int i) {
        Objects.requireNonNull(o20Var, "start cannot be null");
        Objects.requireNonNull(o20Var2, "end cannot be null");
        Objects.requireNonNull(whVar, "validator cannot be null");
        this.f = o20Var;
        this.g = o20Var2;
        this.i = o20Var3;
        this.j = i;
        this.h = whVar;
        if (o20Var3 != null && o20Var.f.compareTo(o20Var3.f) > 0) {
            s9.k("start Month cannot be after current Month");
            throw null;
        }
        if (o20Var3 != null && o20Var3.f.compareTo(o20Var2.f) > 0) {
            s9.k("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > xk0.c(null).getMaximum(7)) {
            s9.k("firstDayOfWeek is not valid");
            throw null;
        }
        this.l = o20Var.d(o20Var2) + 1;
        this.k = (o20Var2.h - o20Var.h) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj;
        return this.f.equals(caVar.f) && this.g.equals(caVar.g) && Objects.equals(this.i, caVar.i) && this.j == caVar.j && this.h.equals(caVar.h);
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
