package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chv extends cri {
    public static final Parcelable.Creator CREATOR = new aqr(5);
    public final boolean a;
    public final boolean b;

    public chv(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chv)) {
            return false;
        }
        chv chvVar = (chv) obj;
        return this.a == chvVar.a && this.b == chvVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }

    public final String toString() {
        return String.format("AppRestrictionState{isRestricted=%b, isAccountHidden=%b}", Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int q = oy.q(parcel, 20293);
        oy.s(parcel, 1, z);
        oy.s(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
